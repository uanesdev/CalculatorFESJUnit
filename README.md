# Projeto: Calculadora com Testes Unitários

Este projeto foi desenvolvido para a disciplina de **Fundamentos de Engenharia de Software**, com o objetivo de demonstrar a importância e a prática de **testes unitários** em Java, utilizando a biblioteca JUnit.

## Objetivo

O projeto consiste em uma calculadora simples, implementada em Java, que realiza operações básicas e possui testes unitários para garantir o correto funcionamento dos métodos. O foco principal é mostrar como escrever e executar testes automatizados.

## Estrutura do Projeto

```
CalculatorFESJUnit/
├── src/
│   └── java/
│       ├── Calculator.java   # Implementação da calculadora
│       └── Main.java         # Classe principal (exemplo)
├── test/
│   └── java/
│       └── CalculatorTest.java # Testes unitários com JUnit
└── README.md
```

## Funcionalidades da Calculadora

A classe `Calculator` possui os seguintes métodos:

- `int division(int a, int b)`: Realiza a divisão de `a` por `b`. Lança exceção se `b` for zero.
- `boolean isDivisionByZero(int b)`: Retorna `true` se `b` **não** for zero (verifica se é possível dividir).
- `int sum(int a, int b)`: Soma dois números inteiros.
- `boolean isPositivesNums(int a, int b)`: Retorna `true` se ambos os números forem positivos ou zero.
- `boolean isNegativesNums(int a, int b)`: Retorna `true` se ambos os números forem negativos.

## Testes Unitários

Os testes estão localizados em `test/java/CalculatorTest.java` e cobrem todos os métodos da calculadora. Exemplos de testes:

- Verificação de divisão correta e tratamento de divisão por zero.
- Teste de soma de números positivos, negativos e zero.
- Verificação de métodos que identificam números positivos e negativos.

Exemplo de teste para divisão:
```java
@Test
void testDivision() {
    assertEquals(5, calculator.division(10, 2));
    assertThrows(ArithmeticException.class, () -> calculator.division(10, 0));
}
```

## Como Executar os Testes

1. **Pré-requisitos:**
   - Ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado.
   - Ter o [JUnit 5](https://junit.org/junit5/) configurado no projeto (pode ser via IDE como IntelliJ ou Eclipse).

2. **Executando os testes:**
   - Se estiver usando uma IDE, basta clicar com o botão direito no arquivo `CalculatorTest.java` e selecionar "Run" ou "Executar".
   - Se preferir linha de comando, utilize o comando apropriado da sua ferramenta de build (Maven, Gradle, etc.).

## Por que Testes Unitários?

Testes unitários são fundamentais para garantir que cada parte do código funciona como esperado. Eles ajudam a:
- Encontrar erros rapidamente
- Facilitar a manutenção do código
- Servir como documentação viva do comportamento esperado

## Contribuição

Este projeto é simples e didático, mas sinta-se à vontade para sugerir melhorias ou adicionar novas funcionalidades!

---

**Desenvolvido para fins educacionais.** 