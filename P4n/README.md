# Programa P4nX - Folha Salarial de Funcionários

## Descrição

O programa P4nX é uma aplicação em Java que permite ao usuário cadastrar funcionários, tanto contratados quanto executivos, e gera uma folha salarial para cada um deles. Ele calcula o salário líquido de cada funcionário, levando em consideração possíveis descontos e gratificações.

## Funcionalidades

- Permite o cadastro de funcionários contratados e executivos.
- Solicita informações como nome, código, salário base, número de dependentes e gratificação (para funcionários executivos).
- Valida as entradas do usuário, garantindo que os valores fornecidos sejam válidos.
- Calcula o salário líquido de cada funcionário, considerando descontos de imposto de renda e adicionais por dependentes.
- Gera uma folha salarial detalhada para cada funcionário cadastrado.

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
- Este README fornece uma visão geral das funcionalidades do programa e instruções básicas para utilização. Consulte os códigos-fonte (`P4nX.java`, `Funcionario.java`, `FuncExct.java` e `FuncCntrd.java`) para obter mais detalhes sobre a implementação.
