# Sistema Bancário JAVA

#### Objetivo

O objetivo deste sistema é implementar uma solução de gerenciamento de conta bancária simples, permitindo ao usuário realizar operações de criação de conta, login, saque e consulta de saldo.

#### Arquitetura do Sistema

A aplicação é composta por diversas classes que lidam com diferentes funcionalidades. A estrutura básica é composta por:

- **Conta**: Representa as informações e operações básicas de uma conta bancária, como saldo, número da conta, dígito e senha.
- **Home**: Classe principal, responsável pela apresentação do menu inicial e interação com o usuário para escolher a operação desejada.
- **LoginConta**: Responsável pelo processo de login, onde o usuário informa o número da conta, dígito e senha.
- **Saque**: Permite realizar a operação de saque, considerando o saldo da conta e possibilitando a realização de saques mesmo com saldo negativo, mediante confirmação.
- **CriarConta**: Classe responsável pela criação da conta bancária, onde são inseridas as informações do cliente, como número da conta, dígito e senha.

#### Estrutura das Classes

1. **Conta**
   
   A classe Conta contém os seguintes atributos e métodos:

   - **Atributos**:
     - `numero`: Número da conta.
     - `digito`: Dígito verificador da conta.
     - `senha`: Senha de acesso da conta.
     - `saldo`: Saldo atual da conta bancária.
   
   - **Métodos**:
     - `Saque(valor)`: Realiza o saque de um valor, atualizando o saldo.
     - `Deposito(valor)`: Realiza o depósito de um valor, atualizando o saldo.
     - `getSaldo()`: Retorna o saldo atual da conta.
     - `getNumero()`, `getDigito()`, `getSenha()`: Métodos de acesso aos dados da conta.

2. **Home**

   A classe Home é responsável pela exibição do menu principal, permitindo que o usuário escolha uma operação (criar conta, login, sair).

   - **Métodos**:
     - `Inicio()`: Exibe o menu e gerencia a escolha da operação a ser realizada.
     - `Apresentacao()`: Exibe o título e as opções do menu.

3. **LoginConta**

   Classe responsável pelo processo de login do usuário, onde ele deve informar o número da conta, o dígito e a senha para poder acessar sua conta.

   - **Métodos**:
     - `LogadoConta(Conta conta)`: Gerencia o login, validando as informações inseridas pelo usuário.

4. **Saque**

   A classe Saque permite realizar a operação de saque, verificando se o saldo é suficiente e permitindo o saque com saldo negativo, caso o usuário aceite.

   - **Métodos**:
     - `Sacar()`: Exibe o menu de saque, permite inserir o valor e valida as condições de saque.
     - `Apresentar()`: Exibe as instruções do saque.

5. **CriarConta**

   Classe responsável por criar uma nova conta bancária, solicitando os dados do usuário e inicializando a conta com saldo zero.

   - **Métodos**:
     - `criandoConta()`: Cria uma nova conta bancária com as informações fornecidas pelo usuário.

#### Fluxo do Sistema

- **Inicio do Sistema**: Ao iniciar a aplicação, o usuário é apresentado a um menu com as opções:
  - Criar Conta
  - Entrar na Conta
  - Sair

- **Criar Conta**: O usuário pode criar uma nova conta fornecendo as informações necessárias (número da conta, dígito e senha).
- **Login**: Após a criação da conta, o usuário pode entrar na conta inserindo o número da conta, o dígito e a senha. Caso a informação esteja correta, o login é efetuado com sucesso.
- **Operações de Conta**: Após o login, o usuário pode realizar as seguintes operações:
  - **Saque**: O usuário pode realizar saques, sendo possível fazer saques mesmo com saldo negativo, caso aceite essa condição.
  - **Consulta de Saldo**: O saldo da conta pode ser consultado a qualquer momento.
  - **Depósito**: (Futuramente) O sistema poderá permitir depósitos na conta.

#### Funcionalidades

- **Criação de Conta**: O sistema permite a criação de uma conta bancária com número, dígito e senha personalizados.
- **Login Seguro**: A conta só pode ser acessada com a combinação correta de número da conta, dígito e senha.
- **Saque Flexível**: O sistema permite realizar saques mesmo com saldo insuficiente, com a opção de ficar com saldo negativo, mediante confirmação do usuário.
- **Consulta de Saldo**: O usuário pode consultar o saldo da conta a qualquer momento.

#### Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento do sistema.
- **Scanner**: Usado para capturar entradas do usuário no console.

#### Considerações Finais

Este sistema oferece funcionalidades básicas para a gestão de uma conta bancária, com a capacidade de criar uma conta, realizar login, consultar saldo e realizar saques. A aplicação foi estruturada de forma modular, permitindo fácil manutenção e futuras melhorias, como a implementação de depósitos e extrato bancário. O fluxo de operações está bem definido e é simples de usar, focando na experiência do usuário de forma prática e funcional.
