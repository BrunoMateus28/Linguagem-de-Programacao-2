# Biblioteca Java

Este é um programa simples de gerenciamento de biblioteca implementado em Java. Ele permite cadastrar usuários, livros, realizar empréstimos e devoluções, além de gerar relatórios.

## Como usar

1. **Configuração do ambiente:**
   - Certifique-se de ter o Java JDK instalado em sua máquina.
   - Baixe os arquivos deste repositório.

2. **Compilação:**
   - Abra um terminal ou prompt de comando na pasta onde os arquivos estão localizados.
   - Execute o seguinte comando para compilar os arquivos Java:
     ```
     javac lp2g12/biblioteca/*.java P7nX.java
     ```

3. **Execução:**
   - Após a compilação, execute o programa usando os scripts fornecidos para Linux ou Windows:
     - **Linux (script.sh):**
       ```
       ./script.sh
       ```
     - **Windows (script.bat):**
       ```
       script.bat
       ```

4. **Uso do programa:**
   - Após a execução, você será apresentado com um menu interativo que permite cadastrar usuários, livros, realizar empréstimos, devoluções e gerar relatórios.

## Conceitos utilizados

- **Classes e Objetos:** O programa utiliza classes e objetos para representar usuários, livros, empréstimos e outras entidades do sistema de biblioteca.
- **Entrada/Saída (I/O):** Utiliza entrada e saída de dados para interagir com o usuário através do terminal.
- **Tratamento de Exceções:** Implementa tratamento de exceções para lidar com erros durante a execução do programa, como usuários ou livros não cadastrados, copias não disponíveis, entre outros.
- **Serialização:** Faz uso da serialização para salvar e carregar os dados de usuários e livros em arquivos.
- **Coleções:** Utiliza coleções como Hashtable e ArrayList para armazenar e manipular dados de forma eficiente.
