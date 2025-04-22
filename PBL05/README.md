# PBL 05 - Calculadora/Conversora Trigonométrica

## 🎯 Objetivo
Criar um programa em Java que solicite um ângulo em graus e realize cálculos trigonométricos básicos como seno, cosseno, tangente, secante, cossecante e cotangente.

## 🧮 Requisitos do Programa

1. **Entrada de Dados**:
   - Solicitar do usuário um ângulo em graus.

2. **Conversão de Unidades**:
   - Converter o valor de graus para radianos:  
     `radiano = grau * (π / 180)`

3. **Cálculos Trigonométricos**:
   - `seno = Math.sin(radiano)`
   - `cosseno = Math.cos(radiano)`
   - `tangente = Math.tan(radiano)`
   - `secante = 1 / cosseno`
   - `cossecante = 1 / seno`
   - `cotangente = 1 / tangente`

4. **Tratamento de Erros**:
   - Verificar se o denominador é diferente de zero antes de calcular secante, cossecante e cotangente.
  

## 🧠 Objetivos de Aprendizagem
- Declarar variáveis de tipos adequados.
- Usar a classe `Scanner` para entrada de dados.
- Aplicar corretamente a conversão de ângulo para radiano.
- Utilizar funções trigonométricas da classe `Math` em Java.
