import java.util.HashMap;
import java.util.Map;

class Dict {
    public static void main(String[] args) {
        Map<String, Strategy> estrategias = new HashMap<>();
        estrategias.put("segunda-feira", new Monday());
        estrategias.put("terça-feira",   new Tuesday());
        estrategias.put("quarta-feira",  new Wednesday());
        estrategias.put("quinta-feira",  new Thursday());
        estrategias.put("sexta-feira",   new Friday());
        estrategias.put("sábado",        new Saturday());
        estrategias.put("domingo",       new Sunday());
        Dia dia = new Dia();
        Execute ctx = new Execute();
        ctx.setStrategy(estrategias.getOrDefault(dia.diaDaSemana, new Null()));
        System.out.println(ctx.execute("tarefa 1, tarefa 2"));
    }
}
 
