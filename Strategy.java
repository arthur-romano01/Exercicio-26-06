import java.util.HashMap;
import java.util.Map;
interface Strategy {
    abstract String mensagem(String info);
}

class Monday implements Strategy {
    @Override
    public String mensagem(String info) {
        return "Prioridade: ALTA \nDia consultado: segunda-feira"+
            "\nOrganize suas prioridades, " + "suas tarefas são: " + info;
    }
}

class Tuesday implements Strategy {
    @Override
    public String mensagem(String info) {
        return "Prioridade: MÉDIA \nDia consultado: terça-feira"+
        "\nAvance nas tarefas pendentes, " + "suas tarefas são: " + info;
    }
}

class Wednesday implements Strategy {
    @Override
    public String mensagem(String info) {
        return "Prioridade: MÉDIA \nDia consultado: quarta-feira"+
        "\nRevise o andamento de atividades, " + "suas tarefas são: " + info;
    }
}

class Thursday implements Strategy {
    @Override
    public String mensagem(String info) {
        return "Prioridade: MÉDIA \nDia consultado: quinta-feira"+
        "\nColabore com alguém da equipe, " + "seus colegas são: " + info;
    }
}

class Friday implements Strategy {
    @Override
    public String mensagem(String info) {
        return "Prioridade: BAIXA  \nDia consultado: sexta-feira"+
        "\nRegistre o que foi concluido, " + "seus feitos são: " + info;
    }
}

class Saturday implements Strategy {
    @Override
    public String mensagem(String info) {
        return "Prioridade: BAIXA \nDia consultado: sábado"+
        "\nRealize estudo livre ou descanso " + "seus livros pendentes são: " + info;
    }
}

class Sunday implements Strategy {
    @Override
    public String mensagem(String info) {
        return "Prioridade: BAIXA  \nDia consultado: domingo"+
        "\nPlaneje a próxima semana " + "suas pendências são: " + info;
    }
}

class Null implements Strategy {
    @Override
    public String mensagem(String info) {
        return "Prioridade: N/A\n Dia inválido";
    }
}

class Execute {
    private Strategy strategy;
    private Map<String, Strategy> estrategias = new HashMap<>();

    public Execute(){
        this. estrategias.put("segunda-feira", new Monday());
        this.estrategias.put("terça-feira",   new Tuesday());
        this.estrategias.put("quarta-feira",  new Wednesday());
        this.estrategias.put("quinta-feira",  new Thursday());
        this.estrategias.put("sexta-feira",   new Friday());
        this.estrategias.put("sábado",        new Saturday());
        this.estrategias.put("domingo",       new Sunday());
    }

    private void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //metodo que utiliza um dia inputado pelo usuário
    public String execute(String dia, String info) {
        this.setStrategy(estrategias.getOrDefault(dia, new Null()));
        return strategy.mensagem(info);
    }

    //metodo que não necessita de input de dia retorna info do dia atual
    public String execute(String info){
        Dia dia = new Dia();
        this.setStrategy(estrategias.getOrDefault(dia.diaDaSemana, new Null()));
        return strategy.mensagem(info);
    }
}
