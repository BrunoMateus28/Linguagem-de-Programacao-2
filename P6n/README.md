# Programa de Organização de Pessoas

Este programa demonstra o uso de conceitos avançados de programação orientada a objetos e estruturas de dados em Java. Abaixo estão os principais conceitos e técnicas utilizados:

## Herança e Polimorfismo

- As classes `PessoaIMC`, `Homem` e `Mulher` demonstram o conceito de herança, onde `PessoaIMC` é a classe base que contém atributos e métodos comuns para representar uma pessoa com informações relacionadas ao IMC, enquanto `Homem` e `Mulher` são subclasses que estendem `PessoaIMC` para fornecer implementações específicas de cálculo de IMC e análise.

- O método `resultIMC` em `PessoaIMC`, `Homem` e `Mulher` é um exemplo de polimorfismo, onde cada subclasse fornece sua própria implementação do método para calcular e analisar o IMC com base no sexo da pessoa.

## Interfaces e Comparadores

- A interface `Comparator` é utilizada para definir diferentes critérios de comparação, como nome, peso, altura, IMC e sexo.

- A classe `MinhaListaOrdenavel` utiliza objetos `Comparator` para implementar a ordenação personalizada da lista de pessoas com base nos diferentes critérios de comparação.

## Estruturas de Dados

- A classe `MinhaListaOrdenavel` mantém uma lista de objetos `PessoaIMC` utilizando a estrutura de dados `ArrayList`, permitindo a adição dinâmica de pessoas à lista.

- O uso de `ArrayList` simplifica a manipulação e o acesso aos elementos da lista, enquanto a classe `Collections` e os métodos `sort` são utilizados para ordenar a lista com base nos critérios especificados.

## Entrada e Saída de Dados

- O método `main` na classe `P6nX` demonstra a entrada de dados pelo usuário utilizando a classe `Scanner`, permitindo que o usuário escolha os modos de ordenação e visualize os resultados.

## Abstração e Encapsulamento

- As classes `Pessoa`, `PessoaIMC`, `Homem` e `Mulher` utilizam abstração para representar entidades do mundo real (pessoas) e encapsulamento para ocultar os detalhes de implementação dos atributos e métodos, fornecendo uma interface clara para interagir com os objetos.

- Os métodos getters são utilizados para acessar os atributos privados de cada classe, garantindo o encapsulamento e a proteção dos dados.

## Como Utilizar

1. **Execução do Programa:**
   - Compile e execute o programa Java fornecido (`P6nX.java`) em sua IDE preferida ou por linha de comando.

2. **Interagindo com o Programa:**
   - Ao iniciar o programa, você será solicitado a escolher entre dois modos:
     - `1` para imprimir a lista de pessoas ordenada.
     - `2` para sair do programa.
   - Selecione `1` para continuar e escolha o modo de ordenação:
     - `1`: Nome (A-Z)
     - `2`: Nome (Z-A)
     - `3`: Peso (crescente)
     - `4`: Peso (decrescente)
     - `5`: Altura
     - `6`: IMC
     - `7`: Sexo (Homem primeiro, Mulher depois)
   - Após escolher o modo de ordenação, a lista de pessoas será impressa de acordo com o critério selecionado.

3. **Encerrando o Programa:**
   - Após visualizar a lista ordenada, você pode optar por continuar ordenando ou selecionar a opção `2` para sair do programa.

Divirta-se explorando a organização e ordenação das pessoas com este programa!
