import pVisitor from './generated/pVisitor.js';

export default class CustomVisitor extends pVisitor {
    constructor() {
        super();
        this.jsCode = ["// Código generado automáticamente"];
        this.indentLevel = 0;
    }

    visitProg(ctx) {
        this.visitChildren(ctx);
        return this.jsCode.join('\n');
    }

    visitDecision(ctx) {
        const cond = ctx.condicion().getText();

        if (cond === '1') {
            // Solo ejecutar el bloque del if
            const ifSentences = ctx.sentencia(0);
            if (ifSentences) {
                this.visit(ifSentences);
            }
        } else if (cond === '0' && ctx.ELSE()) {
            // Ejecutar solo el bloque else si hay
            const elseSentences = ctx.sentencia(1);
            if (elseSentences) {
                this.visit(elseSentences);
            }
        }
        // No genera estructura "if {} else {}", actúa como intérprete
    }

    visitSalida(ctx) {
        const raw = ctx.cadena().getText(); // Ej: "\"hola\""
        const texto = raw.slice(1, -1).replace(/\\"/g, '"'); // quitar comillas externas y escapar internas
        this.jsCode.push(' '.repeat(this.indentLevel * 4) + `console.log("${texto}");`);
    }

    visitTerminar(ctx) {
        this.jsCode.push(' '.repeat(this.indentLevel * 4) + 'return;');
    }

    visitCondicion(ctx) {
        return ctx.getText() === '1' ? 'true' : 'false';
    }
}
