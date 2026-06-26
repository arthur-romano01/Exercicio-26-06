class Dict {
    public static void main(String[] args) {
        
        Execute ctx = new Execute();

        //teste de execução para estrategia do dia atual (dia ausente)
        System.out.println(ctx.execute("Tarefa 1"));
        System.out.println();

        //teste de execução para estrategia de um dia diferente do atual mas com estratégia presente
        System.out.println(ctx.execute("quarta-feira", "tarefa 2"));
        System.out.println();

        //teste de execução para estrategia em que o dia está incorreto ou não há estratégia associada
        System.out.println(ctx.execute("sextou com ProjOO", "outra mensagem qualquer"));
    }
}
 
