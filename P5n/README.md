# Programa P5nX - Avaliação de Índice de Massa Corporal (IMC)

## Descrição

O programa P5nX é uma aplicação em Java que permite ao usuário inserir informações sobre pessoas, como nome, sexo, data de nascimento, peso e altura. Com base nessas informações, o programa calcula o Índice de Massa Corporal (IMC) de cada pessoa e fornece uma avaliação sobre o peso em relação ao ideal, considerando o sexo.

## Funcionalidades

- **Cadastro de Pessoas:** O programa permite ao usuário inserir informações sobre pessoas, incluindo nome, sexo, data de nascimento, peso e altura.
- **Cálculo do IMC:** Com base no peso e na altura fornecidos para cada pessoa, o programa calcula o Índice de Massa Corporal (IMC), uma medida que relaciona o peso e a altura de uma pessoa.
- **Avaliação do Peso:** Após calcular o IMC, o programa fornece uma avaliação sobre o peso da pessoa em relação ao ideal. Essa avaliação é diferente para homens e mulheres e é baseada em faixas de IMC consideradas como "abaixo do peso ideal", "peso ideal" e "acima do peso ideal".
- **Exibição dos Resultados:** O programa exibe as informações cadastradas sobre cada pessoa, incluindo nome, sexo, data de nascimento, peso, altura e o resultado do cálculo do IMC com sua respectiva avaliação.

## Conceitos Utilizados

- **Herança:** O programa utiliza o conceito de herança para criar uma hierarquia de classes. A classe `PessoaIMC` é uma subclasse da classe `Pessoa`, herdando suas características e métodos.
- **Polimorfismo:** O método `resultIMC()` é declarado como abstrato na classe `PessoaIMC` e implementado de forma diferente nas subclasses `Homem` e `Mulher`. Isso permite que o programa forneça uma avaliação personalizada do IMC com base no sexo da pessoa.
- **Encapsulamento:** As classes `PessoaIMC` e `Pessoa` encapsulam os dados relacionados a uma pessoa, como nome, sexo, peso e altura. Isso ajuda a manter a integridade dos dados e facilita o reuso e manutenção do código.
- **ArrayList:** O programa utiliza a classe `ArrayList` para armazenar uma lista dinâmica de objetos do tipo `Pessoa`. Isso permite que o programa gerencie facilmente várias instâncias de pessoas inseridas pelo usuário.

## Utilização

Para utilizar este programa, siga as instruções abaixo:

1. Certifique-se de ter o ambiente de desenvolvimento Java instalado em seu sistema.
2. Compile os arquivos fonte: `P5nX.java`, `PessoaIMC.java`, `Pessoa.java`, `Mulher.java` e `Homem.java`.
   ```bash
   javac P5nX.java PessoaIMC.java Pessoa.java Mulher.java Homem.java
   ```
3. Execute o programa `P5nX`.
   ```bash
   java P5nX
   ```
4. Siga as instruções fornecidas no console para inserir as informações de cada pessoa.

## Observações

- O programa foi desenvolvido como parte do aprendizado da disciplina de Linguagem de Programação 2 na Universidade do Estado do Rio de Janeiro (UERJ).
- Este README fornece uma visão geral das funcionalidades do programa, detalhando os conceitos utilizados e instruções básicas para utilização. Consulte os códigos-fonte (`P5nX.java`, `PessoaIMC.java`, `Pessoa.java`, `Mulher.java` e `Homem.java`) para obter mais detalhes sobre a implementação.
