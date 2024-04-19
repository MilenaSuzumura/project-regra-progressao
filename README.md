# 🏫 Projeto Regra Progressão 🏫

Projeto Regra Progressão é um projeto focada em calcular a nota final do estudante para verificar se o estudante foi aprovado ou reprovado utilizando Java.


<strong>OBS:</strong> ESSA ATIVIDADE FOI DESENVOLVIDA NA TRYBE.

<br>

## 📑 Informações básicas e Orientações 📑

<details>
  <summary><strong>⚙️ Técnologias usadas ⚙️</strong></summary><br>

* Java;
* Maven.
</details>

<details>
  <summary><strong>⌨️ Instalando Dependências ⌨️</strong></summary><br>

Execute:  `maven install`
</details>

<br>


## 📂 Informações gerais 📂

### 🧾 App 🧾

1 - Rode o arquivo `App.java`. A `App.java` vai te pedir para `Informar a quantidade de atividades e projetos avaliativos` que você vai cadastrar;

2 - Após, o código pedirá o `nome dessa atividade/projeto`, `peso(quanto que a atividade/projeto vale)` e `a nota que o estudante tirou`;

3 - O código avaliará `se a quantidade o peso total de todas as atividades é igual a 100`. Caso não atinja essa quantidade, a seguinte mensagem aparecerá: `A soma dos pesos é diferente de 100!`

<strong>Exemplo:</strong>
````
Digite a quantidade de atividades para cadastrar: 
1
Digite o nome da atividade 1: 
Atividade1
Digite o peso da atividade 1: 
40
Digite a nota obtida para Atividade1:
30
A soma dos pesos é diferente de 100!
````

4 - Após, o código `calculará o valor da nota final`. A nota final é `(peso1 * nota1)+(peso2 * nota2)+...+(pesoN * notaN)/peso1+peso2+...+pesoN`.

5 - Caso a `nota final` do estudante for `igual ou superior à 85%`, `ele será aprovado`. Mas, se `a nota final for menor que 85%, ele será reprovado`.

<strong>Exemplo caso o estudante for aprovado:</strong>
````
Digite a quantidade de atividades para cadastrar: 
1
Digite o nome da atividade 1: 
Atividade1
Digite o peso da atividade 1: 
100
Digite a nota obtida para Atividade1:
85
Parabéns! Você alcançou 85.0%! E temos o prazer de informar que você obteve aprovação!
````

<strong>Exemplo caso o estudante for reprovado:</strong>
````
Digite a quantidade de atividades para cadastrar: 
1
Digite o nome da atividade 1: 
Atividade1
Digite o peso da atividade 1: 
100
Digite a nota obtida para Atividade1:
60
Lamentamos informar que, com base na sua pontuação alcançada neste período, 60.0%, você não atingiu a pontuação mínima necessária para sua aprovação.
````