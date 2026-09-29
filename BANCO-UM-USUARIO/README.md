# 🏦 Banco SF

Simulador de banco para o terminal, feito em **Java**. O projeto permite criar uma conta de usuário, entrar com nome e senha e realizar operações bancárias básicas, como PIX, transferência e consulta de conta e cartão.

Ele faz parte do meu repositório de ideias, onde aplico na prática o que aprendo de Java.

## ✨ Funcionalidades

**Menu inicial**
- Criar conta (nome e senha)
- Entrar na conta
- Sair

**Área da conta (após o login)**
- **PIX:** envia um valor para uma pessoa e mostra o comprovante
- **Transferência:** envia um valor para uma pessoa (comprovante informa prazo de até 3 dias úteis)
- **Conta:** exibe titular, saldo, último PIX e última transferência
- **Cartão:** exibe o titular e o limite disponível
- **Sair:** volta ao menu inicial

**Regras de negócio**
- Toda conta nova começa com saldo de **R$ 1.500,00**
- O limite do cartão é **1/3 do saldo inicial** (R$ 500,00)
- PIX e transferência só são feitos se houver saldo suficiente
- O login compara o nome sem diferenciar maiúsculas de minúsculas e a senha exatamente como foi cadastrada

## 🧱 Estrutura do projeto

| Arquivo | Responsabilidade |
|---------|------------------|
| `Menu.java` | Ponto de entrada (`main`). Controla o menu principal e o menu da conta |
| `Banco.java` | Regras do banco: criar conta, login, PIX, transferência e consulta da conta |
| `Conta.java` | Modelo de dados da conta (saldo, nome, senha, limite) com getters e setters |
| `Painel.java` | Toda a parte visual: menus, comprovantes e limpeza de tela |

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (classes, objetos, encapsulamento)
- Separação de responsabilidades (modelo, regras e interface no terminal)
- Leitura de dados com `Scanner`
- Estruturas de controle (`while`, `switch`, `if/else`)
- Validação de saldo e de login
- Execução de comando do sistema com `ProcessBuilder` para limpar a tela

## 📸 Exemplo de uso

```
=================================
          BANCO SF
=================================

        1 - Criar conta
        2 - Entrar
        3 - Sair

=================================
Digite uma opção:
```

## ⚠️ Limitações atuais

- Os dados ficam apenas na memória: ao fechar o programa, a conta é perdida
- Existe apenas **uma conta** por execução (criar outra substitui a anterior)
- A senha é armazenada em texto puro, o que serve só para estudo
- O PIX e a transferência não creditam o valor para outra conta, apenas debitam do saldo

## 🚀 Ideias para evoluir

- [ ] Suportar várias contas e transferências reais entre elas
- [ ] Salvar os dados em arquivo ou banco de dados
- [ ] Guardar o histórico completo de transações
- [ ] Criptografar a senha
- [ ] Tratar entradas inválidas (por exemplo, letras no lugar de números)
- [ ] Adicionar depósito, saque e extrato

## 👤 Autor

**Seu Nome**
GitHub: [@SEU-USUARIO](https://github.com/rafaelribeirocorreia)
