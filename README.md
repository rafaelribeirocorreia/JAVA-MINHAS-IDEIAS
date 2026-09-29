# 💡 Repositório de Ideias

Bem-vindo ao meu laboratório de ideias! Aqui reúno projetos e experimentos que desenvolvo em **Java**, sempre com o objetivo de **aplicar na prática o que já sei** e aprender o que ainda não sei.

## 🎯 Objetivo

- Transformar ideias soltas em código funcionando
- Praticar e consolidar conhecimentos de Java
- Documentar minha evolução como desenvolvedor
- Servir de portfólio e de fonte de consulta

## 🛠️ Tecnologias

- **Linguagem:** Java (aplicações de terminal)
- **Entrada de dados:** `Scanner`
- **Controle de versão:** Git e GitHub

## 📚 Projetos

| Projeto | Descrição | Conceitos aplicados |
|---------|-----------|---------------------|
| [🏦 Banco](./BANCO-UM-USUARIO) | Simulador de banco no terminal, com criação de conta, login, PIX, transferência, consulta de conta e cartão | POO, encapsulamento, `Scanner`, `switch`, `while`, validação de saldo e login |

*(Novos projetos serão adicionados a esta tabela conforme eu for desenvolvendo.)*

### 🏦 Destaque: Banco SF

Um banco simples que roda no terminal. Cada conta começa com **R$ 1.500,00** e um limite de cartão de **R$ 500,00**. O usuário cria a conta, entra com nome e senha e usa um menu para fazer PIX, transferências e consultar as informações da conta e do cartão. O código é dividido em quatro classes, cada uma com sua responsabilidade:

- `Menu`: ponto de entrada e fluxo dos menus
- `Banco`: regras de negócio (criar conta, login, PIX e transferência)
- `Conta`: modelo de dados da conta
- `Painel`: telas, comprovantes e limpeza de tela

Veja mais detalhes no [README do Banco](./BANCO-UM-USUARIO/README.md).

## 📁 Estrutura do repositório

Cada ideia fica em sua própria pasta, com o código e uma explicação rápida:

```
.
├── banco-um-usuario/
│   ├── Menu.java
│   ├── Banco.java
│   ├── Conta.java
│   ├── Painel.java
│   └── README.md
├── proxima-ideia/
│   └── README.md
└── README.md
```

## 🧠 Conhecimentos aplicados

- Programação Orientada a Objetos (classes, objetos, encapsulamento, getters e setters)
- Separação de responsabilidades entre classes
- Leitura de dados do usuário com `Scanner`
- Estruturas de controle (`while`, `switch`, `if/else`)
- Validações de regras de negócio (saldo, login)
- Execução de comandos do sistema com `ProcessBuilder`

## 🚀 Próximos passos

- [ ] Evoluir o Banco SF com várias contas, histórico de transações e persistência de dados
- [ ] Adicionar novas ideias regularmente
- [ ] Incluir testes com JUnit
- [ ] Melhorar a documentação de cada projeto

## 🤝 Contribuições

Sugestões e feedbacks são muito bem-vindos! Abra uma *issue* ou envie um *pull request*.

## 👤 Autor

**Seu Nome**
GitHub: [@RafelRibeiroCorreia](https://github.com/rafaelribeirocorreia)

---

⭐ Se este repositório te ajudou ou inspirou, deixe uma estrela!
