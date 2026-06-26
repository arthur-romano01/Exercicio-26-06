interface Strategy {
    abstract String mensagem(String info);
}

class Monday implements Strategy {
    @Override
    public String mensagem(String info) {
        System.out.println("Prioridade: ALTA");
        return "Organize suas prioridades," + "suas tarefas são:" + info;
    }
}

class Tuesday implements Strategy {
    @Override
    public String mensagem(String info) {
        System.out.println("Prioridade: MÉDIA");
        return "Avance nas tarefas pendentes," + "suas tarefas são:" + info;
    }
}

class Wednesday implements Strategy {
    @Override
    public String mensagem(String info) {
        System.out.println("Prioridade: MÉDIA");
        return "Revise o andamento de atividades," + "suas tarefas são:" + info;
    }
}

class Thursday implements Strategy {
    @Override
    public String mensagem(String info) {
        System.out.println("Prioridade: MÉDIA");
        return "Colabore com alguém da equipe," + "seus colegas são:" + info;
    }
}

class Friday implements Strategy {
    @Override
    public String mensagem(String info) {
        System.out.println("Prioridade: BAIXA");
        return "Registre o que foi concluido," + "seus feitos são:" + info;
    }
}

class Saturday implements Strategy {
    @Override
    public String mensagem(String info) {
        System.out.println("Prioridade: BAIXA");
        return "Realize estudo livre ou descanso" + "seus livros pendentes são:" + info;
    }
}

class Sunday implements Strategy {
    @Override
    public String mensagem(String info) {
        System.out.println("Prioridade: BAIXA");
        return "Planeje a próxima semana" + "suas pendências são:" + info;
    }
}

class Null implements Strategy {
    @Override
    public String mensagem(String info) {
        System.out.println("Prioridade: N/A");
        return "Dia inválido";
    }
}

class Execute {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public String execute(String info) {
        return strategy.mensagem(info);
    }
}
