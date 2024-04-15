### Visão Geral

O P8nX é uma aplicação Java projetada para gerenciar dados do Índice de Massa Corporal (IMC) de indivíduos. Ele fornece uma interface gráfica de usuário (GUI) para os usuários inserirem informações pessoais, como nome, data de nascimento, peso, altura e gênero. O programa então calcula o IMC para cada indivíduo e categoriza com base em critérios específicos de gênero. O P8nX é implementado como um applet Java.

### Conceitos Principais e Componentes

1. **Programação Orientada a Objetos (POO)**:
   - O programa utiliza os princípios de POO com classes como `Pessoa`, `PessoaIMC`, `Mulher`, `Homem` e `MinhaListaOrdenavel`. Essas classes encapsulam dados e comportamentos relacionados a indivíduos e seus cálculos de IMC.

2. **Herança e Polimorfismo**:
   - A herança é usada para criar versões especializadas da classe `PessoaIMC` para homens e mulheres (`Mulher` e `Homem`). Isso permite o cálculo de IMC específico e a interpretação do resultado com base em critérios específicos de gênero.

3. **Desenvolvimento de GUI**:
   - O P8nX usa componentes Swing para criar uma interface amigável para entrada e exibição de dados. Componentes como botões, campos de texto e tabelas são organizados dentro de painéis para fornecer um layout estruturado.

4. **Applet Java**:
   - O P8nX é implementado como um applet Java, permitindo que seja incorporado em páginas da web e executado em navegadores compatíveis com Java.

### Como Executar

Para executar a aplicação P8nX, siga estes passos:

1. Certifique-se de ter o Java instalado no seu sistema.
2. Compile os arquivos Java usando um compilador Java.
3. Incorpore o applet Java em uma página da web ou inicie o applet Java em um navegador compatível com Java.

### Uso

1. Insira informações pessoais, como nome, data de nascimento, peso, altura e gênero.
2. Clique no botão "Cadastrar" para adicionar o indivíduo à lista de cálculo de IMC.
3. Use os botões de classificação para ordenar a lista com base em diferentes critérios (nome, peso, altura, IMC, gênero, data de nascimento).
4. Visualize os resultados do cálculo de IMC exibidos na tabela, incluindo o nome do indivíduo, data de nascimento, peso, altura, gênero, IMC e diagnóstico.

Sinta-se à vontade para contribuir para este projeto fazendo fork e enviando pull requests. Se encontrar problemas ou tiver sugestões de melhorias, abra um problema no repositório do GitHub.
