# Exercicio-26-06

### Instruções de execução:
Apenas execute o Main.java que os testes criados serão executados.

### Explicação da estratégia:
Utilizamos o padrão strategy utilizando um HashMap para mapear as entradas dos usuários para as estratégias
se o usuário não passa um dia como parâmetro, a estratégia utilizada é a do dia atual.
se um dia inválido e/ou que não tem nenhuma estratégia atribuida é passado como parâmetro, utilizamos uma classe como default para fazer o tratamento disso e retornar a mensagem de que o dia é invalido.

### Testes
os seguintes testes estão na main:

* **Teste 1:** Teste de execução para estrategia do dia atual
```
System.out.println(ctx.execute("Tarefa 1"));
```
Chamamos o metodo execute passando apenas a info, como não há informação de dia o execute deve utilizar a estratégia do dia atual.

**Resultado esperado** (alterando sexta-feira para o dia atual da execução):
```
Prioridade: BAIXA  
Dia consultado: sexta-feira
Registre o que foi concluido, seus feitos são: Tarefa 1
```

* **Teste 2**: teste de execução com estratégia presente para o dia escolhido.
```
System.out.println(ctx.execute("quarta-feira", "tarefa 2"));
```
Neste teste chamamos o método passando um dia para o qual existe uma estratégia definida.

**Resultado Esperado:**
```
Prioridade: MÉDIA 
Dia consultado: quarta-feira
Revise o andamento de atividades, suas tarefas são: tarefa 2
```
* **Teste 3**: teste de execução para estrategia em que o dia está incorreto ou não há estratégia associada:
```
System.out.println(ctx.execute("sextou com ProjOO", "outra mensagem qualquer"));
```

**Resultado Esperado**:
```
Prioridade: N/A
Dia inválido
```

### RESPOSTAS ÀS PERGUNTAS TEÓRICAS:

1. *Como evitar verificações repetidas de valores nulos no código principal?*

Podemos ter uma classe especializada no tratamento desses valores nulos, como no nosso caso, onde criamos uma classe default para que quando o valor inserido pelo usuário é inválido ou não há uma estratégia definida, ela é chamada para lidar com essa situação.

2. *Qual padrão de projeto pode ser utilizado para representar a ausência de uma estratégia de forma segura?*

O padrão Null Object que serve como default para lidar com casos em que o retorno seria Null.

3. *Explique brevemente como esse padrão seria incorporado à solução.*

No nosso caso já o implementamos dentro do strategy, se o dia não tem uma estratégia associada o retorno padrão da busca no HashMap é uma instância da classe Null que apenas retorna uma mensagem avisando que o dia é inválido
