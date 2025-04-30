# Disciplina de Testes de Software

**Universidade do Estado do Rio de Janeiro (UERJ)**  
**Disciplina:** Testes de Software  
**Professora:** Carolina Christina do Sacramento Nardi  
**Aluno:** Gabriel André  

## Visão Geral

Este projeto contém a implementação e testes automatizados de um **calculador de preços de ingressos** para zoológico, dividido em três componentes:

- `Main.java`: Interface de linha de comando que lê a idade do visitante e a quantidade de bilhetes.  
- `TicketCalculator.java`: Lógica de negócio para cálculo de preço por faixa etária e validação de entradas.  
- `TicketCalculatorTest.java`: Suíte de testes JUnit 5 que cobre todos os cenários de uso, incluindo casos válidos e tratamento de exceções.

## Requisitos

- Java 11 ou superior  
- Maven  
- JUnit 5  

## Como Executar

1. **Clonar o repositório**  
   ```bash
   git clone <url-do-repositorio>
   cd <nome-do-repositorio>
   ```
2. **Compilar e rodar o aplicativo**  
   ```bash
   mvn compile exec:java -Dexec.mainClass="org.example.Main"
   ```
3. **Executar os testes**  
   ```bash
   mvn clean test
   ```

## Estrutura do Projeto

```plaintext
Trabalho Teste Completo [Trabalho-Teste-Completo]
├── .idea
├── src
│   ├── main
│   │   └── java
│   │       └── org.example
│   │           ├── Main.java
│   │           └── TicketCalculator.java
│   │               ├── priceByAge(int): int
│   │               └── totalPrice(int, int): int
│   └── test
│       └── java
│           └── TicketCalculatorTest.java
├── target
├── .gitignore
├── pom.xml
└── README.md
```

## Descrição dos Componentes

- `Main`: Lê entradas do usuário via `Scanner`, chama `TicketCalculator.totalPrice()` e exibe o resultado ou mensagem de erro.  
- `TicketCalculator`:  
  - `priceByAge(int idade)`: Retorna o preço unitário com base na faixa etária ou lança `IllegalArgumentException` para idades inválidas.  
  - `totalPrice(int idade, int quantidade)`: Valida a quantidade (>0 e ≤5) e calcula o valor total ou lança exceções.  
- `TicketCalculatorTest`: Contém métodos de teste para verificar preços para crianças, adultos e idosos, além de cenários de exceção para idades e quantidades inválidas.

## Referências

- Material de aula no Google Classroom (disciplina de Testes de Software)  
- [Configuração do JUnit no IntelliJ](https://www.youtube.com/watch?v=Vwdh_K5GU4Y)  
- [Setting up JUnit with IntelliJ IDEA - StackOverflow](https://stackoverflow.com/questions/19330832/setting-up-junit-with-intellij-idea)

