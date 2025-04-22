# PBL 07 - Sistema de Login com Verificação de Credenciais

## 🎯 Objetivo
Desenvolver um programa em Java que simula um sistema de login simples, permitindo que o usuário faça login utilizando username, CPF ou telefone. O programa deve verificar se as credenciais inseridas são válidas e validar a senha correspondente, informando se o login falhou, especificando qual parte das credenciais estava errada.

## 🧮 Requisitos do Sistema

### 📥 Entrada:
- Tipo de credencial: Username, CPF ou Telefone.
- Credencial (string): Dependendo do tipo escolhido, o usuário deve inserir um username, CPF ou número de telefone.
- Senha (string): A senha associada à credencial.

### 📤 Saídas:
- Se o login for bem-sucedido: "Login bem-sucedido! Bem-vindo, [tipo de login]."
- Se o login falhar:
  - Caso a credencial esteja errada: "Username incorreto.", "CPF incorreto." ou "Telefone incorreto."
  - Caso a senha esteja errada: "Senha incorreta."
  - Caso o tipo de credencial não seja válido: "Tipo de credencial inválido."

## 🧠 Lógica de Validação

O programa usa estruturas condicionais `if-else` aninhadas para:
1. Verificar qual tipo de credencial foi inserido (Username, CPF ou Telefone).
2. Validar a credencial com as regras de formato (ex: tamanho do CPF, telefone ou username).
3. Verificar se a senha inserida está correta.

## 🎓 Objetivos de Aprendizagem

- Trabalhar com a estrutura de controle condicional if-else aninhada.
- Validar dados de entrada com base em diferentes critérios (tamanho do texto, igualdade de strings).
- Simular um processo de login simples em Java.
