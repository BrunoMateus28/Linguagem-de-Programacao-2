# Programa P3nX - Triângulos e Áreas

## Descrição

O programa P3nX é uma aplicação em Java que permite ao usuário calcular a área de diferentes formas geométricas, como círculos, retângulos e triângulos. Ele recebe os parâmetros necessários via linha de comando e fornece os resultados correspondentes.

## Funcionalidades

- **Cálculo da Área do Círculo:** O programa calcula a área de um círculo com base no raio fornecido como entrada.
- **Cálculo da Área do Retângulo:** Quando dois lados do retângulo são fornecidos como entrada, o programa calcula sua área.
- **Cálculo da Área do Triângulo:** Quando três lados do triângulo são fornecidos como entrada, o programa verifica se os lados formam um triângulo válido e, se sim, calcula sua área.

## Conceitos Utilizados

- **Métodos:** O programa utiliza métodos para encapsular e reutilizar lógica de cálculo. Cada tipo de forma geométrica (círculo, retângulo, triângulo) tem seus próprios métodos de cálculo de área.
- **Condições:** O programa utiliza estruturas condicionais (`if`, `else if`, `else`) para lidar com diferentes cenários de entrada. Por exemplo, ele verifica se o número de argumentos fornecidos é suficiente ou excessivo, se os valores fornecidos são positivos e se os lados fornecidos formam um triângulo válido.
- **Tratamento de Exceções:** O programa utiliza blocos `try-catch` para lidar com exceções, como entrada inválida ou valores negativos. Isso ajuda a garantir que o programa não quebre inesperadamente e forneça feedback adequado ao usuário.
- **Sobrecarga de Métodos:** O programa utiliza a sobrecarga de métodos para calcular a área de diferentes formas geométricas com base nos parâmetros fornecidos. Por exemplo, há diferentes métodos `calcula()` para calcular a área do círculo, retângulo e triângulo, dependendo do número de argumentos fornecidos.

## Utilização

Para utilizar este programa, siga as instruções abaixo:

1. Certifique-se de ter o ambiente de desenvolvimento Java instalado em seu sistema.
2. Compile o arquivo fonte: `P3nX.java`.
   ```bash
   javac P3nX.java
   ```
3. Execute o programa `P3nX`, fornecendo os argumentos necessários.
   ```bash
   java P3nX <argumentos>
   ```

Os argumentos necessários variam de acordo com a forma geométrica que você deseja calcular. Consulte o código-fonte (`P3nX.java`) para obter detalhes sobre os argumentos necessários para cada cálculo.

## Observações

- O programa foi desenvolvido como parte do aprendizado da disciplina de Linguagem de Programação 2 na Universidade do Estado do Rio de Janeiro (UERJ).
- Este README fornece uma visão geral das funcionalidades do programa, detalhando os conceitos de programação utilizados e instruções básicas para utilização. Consulte o código-fonte (`P3nX.java`) para obter mais detalhes sobre a implementação.
