# CFC_Gestão

Este projeto é uma aplicação Java desenvolvida para gerenciar operações de um Centro de Formação de Condutores (CFC). O sistema foi criado para ajudar na administração de alunos, instrutores, aulas e exames, facilitando a organização e automação dos processos diários de uma autoescola.

## Funcionalidades

- **Gerenciamento de Alunos**: Cadastro de novos alunos, visualização de informações e atualização de dados.
- **Gerenciamento de Instrutores**: Cadastro de instrutores, atribuição de aulas e gerenciamento de horários.
- **Controle de Aulas e Exames**: Agendamento e registro de aulas teóricas e práticas, além de controle dos exames dos alunos.
- **Relatórios**: Geração de relatórios para análise do desempenho dos alunos e do andamento das aulas.

## Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada no desenvolvimento da aplicação.
- **Java Swing**: Biblioteca gráfica utilizada para a interface de usuário.
- **JDBC**: Para a integração com o banco de dados.
- **MySQL**: Banco de dados utilizado para armazenar as informações dos alunos, instrutores, aulas e exames.

## Como Executar o Projeto

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/markesjp/Java.git
    cd Java/CFC_Gestao
    ```

2. **Configure o banco de dados**:
    - Certifique-se de ter o MySQL instalado e rodando.
    - Crie um banco de dados com o nome `cfc_gestao`.
    - Importe o script SQL fornecido no diretório `database` para criar as tabelas necessárias.

3. **Compile e execute a aplicação**:
    - Utilize uma IDE como Eclipse ou IntelliJ IDEA para abrir o projeto.
    - Configure as dependências necessárias.
    - Compile e execute a aplicação.

## Estrutura do Projeto

- **src/**: Contém o código-fonte da aplicação.
- **database/**: Contém os scripts SQL para criar as tabelas e popular o banco de dados.
- **README.md**: Este arquivo, que fornece uma visão geral do projeto.

## Contribuição

Contribuições são bem-vindas! Se você deseja melhorar este projeto ou corrigir bugs, sinta-se à vontade para fazer um fork deste repositório, criar uma branch e enviar um pull request.

## Licença

Este projeto é licenciado sob a MIT License. Veja o arquivo `LICENSE` para mais detalhes.
