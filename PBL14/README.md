# PBL 14 - Modularização do Sistema de Gestão Financeira Pessoal

## 🎯 Objetivo
Reestruturar o sistema de controle de despesas pessoais para torná-lo modular, utilizando conceitos de orientação a objetos com classes separadas e responsabilidades bem definidas.

---

## 🧩 Funcionalidades do Sistema

### 👤 Cadastro de Pessoas
- Permite registrar várias pessoas no sistema com seus respectivos nomes.

### ➕ Adição de Despesas
- 📥 Entrada: Nome da pessoa, categoria, mês e valor.
- 🧠 Processamento: Atualiza a despesa na estrutura de dados modular por categoria e mês.
- 📤 Saída: Confirmação da despesa adicionada com sucesso.

### 🔍 Consultas

#### 1. Consulta por Categoria (Pessoa)
- Mostra o total gasto em uma categoria específica por uma pessoa.

#### 2. Consulta por Mês (Pessoa)
- Exibe todas as despesas de uma pessoa em determinado mês, separadas por categoria.

#### 3. Total por Categoria (Geral)
- Soma o valor de uma categoria entre todas as pessoas cadastradas.

#### 4. Total Geral
- Exibe a soma total de todas as despesas registradas no sistema.

---

## 🧠 Objetivos de Aprendizado
- Modularizar o código com **classes separadas** (ex: `Main`, `Pessoa`, `Operacoes`).
- Aplicar o conceito de **listas de objetos** em estruturas dinâmicas.
- Utilizar **vetores fixos** para armazenar os 12 meses do ano.
- Desenvolver menus interativos para o terminal e implementar boas práticas de organização.

