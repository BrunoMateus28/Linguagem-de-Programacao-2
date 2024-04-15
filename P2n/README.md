# Programa P2nX - Funções Trigonométricas

## Descrição

O programa P2nX é uma aplicação em Java que calcula as funções trigonométricas seno, cosseno, tangente e cotangente de um ângulo fornecido pelo usuário. Ele recebe o ângulo em graus como entrada e fornece os valores das funções trigonométricas correspondentes.

## Funcionalidades

- **Cálculo das Funções Trigonométricas:** O programa calcula o seno, cosseno, tangente e cotangente de um ângulo fornecido pelo usuário.
- **Validação do Ângulo:** O programa verifica se o ângulo fornecido pelo usuário é válido (dentro do intervalo [0, 2π]) e trata exceções caso contrário.

## Conceitos Utilizados

- **Métodos:** O programa utiliza métodos para encapsular a lógica de cálculo das funções trigonométricas. Cada função trigonométrica é implementada em um método separado na classe `Angulo`.
- **Tratamento de Exceções:** O programa utiliza blocos `try-catch` para lidar com exceções, como entrada inválida ou ângulo fora do intervalo permitido. Isso ajuda a garantir que o programa não quebre inesperadamente e forneça feedback adequado ao usuário.

## Utilização

Para utilizar este programa, siga as instruções abaixo:

1. Certifique-se de ter o ambiente de desenvolvimento Java instalado em seu sistema.
2. Compile o arquivo fonte: `P2nX.java` e `Angulo.java`.
   ```bash
   javac P2nX.java Angulo.java
   ```
3. Execute o programa `P2nX`, fornecendo o ângulo em graus como argumento de linha de comando.
   ```bash
   java P2nX <ângulo>
   ```

Substitua `<ângulo>` pelo valor do ângulo em graus que você deseja calcular as funções trigonométricas.

## Observações

- O programa foi desenvolvido como parte do aprendizado da disciplina de Linguagem de Programação 2 na Universidade do Estado do Rio de Janeiro (UERJ).
- Este README fornece uma visão geral das funcionalidades do programa, detalhando os conceitos de programação utilizados e instruções básicas para utilização. Consulte o código-fonte (`P2nX.java` e `Angulo.java`) para obter mais detalhes sobre a implementação.
