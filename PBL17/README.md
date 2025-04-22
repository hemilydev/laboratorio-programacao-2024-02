# PBL 17 - Classe CRIPTOGRAFIA do Projeto Final

## 🎯 Objetivo
Implementar uma classe em Java que execute a criptografia e decriptografia de senhas utilizando a sequência de Fibonacci. O processo de criptografia envolve a inserção de números aleatórios nas posições especificadas pela sequência de Fibonacci, enquanto o processo de decriptografia restaura a senha original.

---

## 🧩 Funcionalidades da Classe `Criptografia`

### 🔐 Criptografia
- A senha criptografada começa com dois caracteres numéricos que indicam a quantidade de caracteres da senha original.
- Insere números aleatórios nas posições que correspondem aos números da sequência de Fibonacci (1, 2, 3, 5, 8, 13, etc.), até o limite do tamanho da senha original.
- Os caracteres da senha original são inseridos nas posições restantes da string criptografada.

### 🔑 Decriptografia
- O método de decriptografia recupera a senha original a partir da senha criptografada.
- Extrai os dois primeiros caracteres para determinar o tamanho da senha original.
- Remove os números aleatórios das posições da sequência de Fibonacci, restaurando a senha original.

---

## 🧠 Objetivos de Aprendizado
- Implementar um algoritmo simples de criptografia e decriptografia utilizando uma lógica baseada na sequência de Fibonacci.
- Utilizar a modularização do código com métodos específicos para criptografar e decriptografar senhas.
- Trabalhar com manipulação de strings e números aleatórios de forma eficiente.
- Aplicar boas práticas de programação orientada a objetos e modularização de código.
