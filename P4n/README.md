# Programa P4nX - Folha Salarial de Funcionários

## Descrição

O programa P4nX é uma aplicação em Java que permite ao usuário cadastrar funcionários, tanto contratados quanto executivos, e gera uma folha salarial para cada um deles. Ele calcula o salário líquido de cada funcionário, levando em consideração possíveis descontos e gratificações.

## Funcionalidades

- **Cadastro de Funcionários:** O programa permite ao usuário cadastrar funcionários, solicitando informações como nome, código, salário base e número de dependentes (para funcionários contratados) ou gratificação (para funcionários executivos).
- **Validação de Entradas:** O programa valida as entradas do usuário, garantindo que os valores fornecidos sejam válidos. Por exemplo, ele verifica se o salário e o número de dependentes são valores não negativos.
- **Cálculo do Salário Líquido:** Com base nas informações fornecidas, o programa calcula o salário líquido de cada funcionário, considerando descontos de imposto de renda e adicionais por dependentes (para funcionários contratados) ou gratificação (para funcionários executivos).
- **Geração da Folha Salarial:** Após cadastrar os funcionários e calcular os salários líquidos, o programa gera uma folha salarial detalhada para cada funcionário cadastrado.

## Conceitos Utilizados

- **Classe e Objeto:** O programa utiliza o conceito de classes e objetos para representar os funcionários. Cada funcionário é uma instância de uma classe específica, que contém atributos como nome, código, salário e métodos para cálculo do salário líquido.
- **Herança:** O programa utiliza o conceito de herança para criar diferentes tipos de funcionários. A classe abstrata `Funcionario` é a classe base, da qual são derivadas as classes `FuncCntrd` (para funcionários contratados) e `FuncExct` (para funcionários executivos). Isso permite reutilizar código comum e especializar comportamentos específicos em subclasses.
- **Polimorfismo:** O método `toString()` é sobrescrito nas classes `FuncCntrd` e `FuncExct` para fornecer uma representação textual personalizada de cada funcionário. Isso permite que o programa exiba as informações de cada funcionário de forma adequada, independentemente do tipo específico de funcionário.
- **ArrayList:** O programa utiliza a classe `ArrayList` para armazenar uma lista dinâmica de objetos do tipo `Funcionario`. Isso permite que o programa gerencie facilmente várias instâncias de funcionários inseridos pelo usuário.

## Utilização

Para utilizar este programa, siga as instruções abaixo:

1. Certifique-se de ter o ambiente de desenvolvimento Java instalado em seu sistema.
2. Compile os arquivos fonte: `P4nX.java`, `Funcionario.java`, `FuncExct.java` e `FuncCntrd.java`.
   ```bash
   javac P4nX.java Funcionario.java FuncExct.java FuncCntrd.java
   ```
3. Execute o programa `P4nX`.
   ```bash
   java P4nX
   ```
4. Siga as instruções fornecidas no console para cadastrar os funcionários, inserindo as informações solicitadas.

## Observações

- O programa foi desenvolvido como parte do aprendizado da disciplina de Linguagem de Programação 2 na Universidade do Estado do Rio de Janeiro (UERJ).
- Este README fornece uma visão geral das funcionalidades do programa, detalhando os conceitos de orientação a objetos utilizados e instruções básicas para utilização. Consulte os códigos-fonte (`P4nX.java`, `Funcionario.java`, `FuncExct.java` e `FuncCntrd.java`) para obter mais detalhes sobre a implementação.
