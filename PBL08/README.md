# PBL 08 - Fluxograma com Condicional

## 🎯 Objetivo
Desenvolver um programa em Java que percorre um fluxograma condicional, onde o usuário responde a perguntas sobre seu relacionamento com uma pessoa, e dependendo das respostas, o programa segue diferentes caminhos e oferece respostas variadas.

## 🧮 Requisitos do Programa

### 📥 Entrada:
- O programa pergunta ao usuário se ele conhece a pessoa e, em caso afirmativo, se gosta dela.
- Dependendo das respostas, o programa faz mais perguntas sobre o tipo de relacionamento (familiares, amigos, ex-colegas, etc.) e sobre o quanto o usuário está próximo da pessoa.

### 📤 Saídas:
- O programa responde com frases divertidas e criativas dependendo do tipo de relacionamento, das emoções e das situações apresentadas nas perguntas do fluxograma.

## 🎓 Objetivos de Aprendizagem
- Utilizar estruturas condicionais `if-else` em Java.
- Criar fluxogramas e representá-los de maneira interativa no código.
- Desenvolver lógica de decisão baseada em múltiplas opções de resposta do usuário.

## 🧠 Fluxograma do Programa

![Fluxograma1](https://brazilsoutheast1-mediap.svc.ms/transform/thumbnail?provider=spo&inputFormat=jpg&cs=NWUzY2U2YzAtMmIxZi00Mjg1LThkNGItNzVlZTc4Nzg3MzQ2fFNQTw&docid=https%3A%2F%2Fpucdegoias.sharepoint.com%2F_api%2Fv2.0%2Fdrives%2Fb!EdXO1FW7ikKU-qfvoQC1F-MplALYxfdIuIdEV57hhlAcwqn6v0wNSpAzzA6sXH5h%2Fitems%2F01A7DAVG2WB3XDGVITLJF3LUNHY6QLAYYE%3Ftempauth%3Dv1.eyJzaXRlaWQiOiJkNGNlZDUxMS1iYjU1LTQyOGEtOTRmYS1hN2VmYTEwMGI1MTciLCJhcHBfZGlzcGxheW5hbWUiOiJNaWNyb3NvZnQgVGVhbXMgV2ViIENsaWVudCIsImFwcGlkIjoiNWUzY2U2YzAtMmIxZi00Mjg1LThkNGItNzVlZTc4Nzg3MzQ2IiwiYXVkIjoiMDAwMDAwMDMtMDAwMC0wZmYxLWNlMDAtMDAwMDAwMDAwMDAwL3B1Y2RlZ29pYXMuc2hhcmVwb2ludC5jb21ANzMzMTlmNDItODkwOC00Yjg5LTlmOGQtNTU4Y2Y0ZDVkNzc2IiwiZXhwIjoiMTc0NTMwMTYwMCJ9.CgoKBHNuaWQSAjg0EgQI0LsCGgw0MC4xMjYuNDUuMjcqLHFuVENLM09GMC9QVTFzcU1rOUFybzNzYmx1T1JSdk9DWm10c29ZWnFLUjQ9MJ4BOAFKEGhhc2hlZHByb29mdG9rZW5SCFsia21zaSJdcikwaC5mfG1lbWJlcnNoaXB8MTAwMzIwMDNhMjdiZjMzNEBsaXZlLmNvbXoBMoIBEglCnzFzCImJSxGfjVWM9NXXdpIBBkhFTUlMWZoBFkJBUkJVREEgREUgSkVTVVMgUkFNT1OiARsyMDI0MjAxMjAwMDI2MUBwdWNnby5lZHUuYnKqARAxMDAzMjAwM0EyN0JGMzM0sgE7YWxsZmlsZXMud3JpdGUgY29udGFpbmVyLnNlbGVjdGVkIGdyb3VwLnJlYWQgYWxsc2l0ZXMud3JpdGU.nAgH4_JQQQE0rSrT5FTeybvnTyy0yyonmVJggRIJQ_4%26version%3DPublished&width=9999&height=9999&cb=63861084779)
![Fluxograma1](https://brazilsoutheast1-mediap.svc.ms/transform/thumbnail?provider=spo&inputFormat=jpg&cs=NWUzY2U2YzAtMmIxZi00Mjg1LThkNGItNzVlZTc4Nzg3MzQ2fFNQTw&docid=https%3A%2F%2Fpucdegoias.sharepoint.com%2F_api%2Fv2.0%2Fdrives%2Fb!EdXO1FW7ikKU-qfvoQC1F-MplALYxfdIuIdEV57hhlAcwqn6v0wNSpAzzA6sXH5h%2Fitems%2F01A7DAVG4WOH72G3ODRVGIIPV4VI3RFBCP%3Ftempauth%3Dv1.eyJzaXRlaWQiOiJkNGNlZDUxMS1iYjU1LTQyOGEtOTRmYS1hN2VmYTEwMGI1MTciLCJhcHBfZGlzcGxheW5hbWUiOiJNaWNyb3NvZnQgVGVhbXMgV2ViIENsaWVudCIsImFwcGlkIjoiNWUzY2U2YzAtMmIxZi00Mjg1LThkNGItNzVlZTc4Nzg3MzQ2IiwiYXVkIjoiMDAwMDAwMDMtMDAwMC0wZmYxLWNlMDAtMDAwMDAwMDAwMDAwL3B1Y2RlZ29pYXMuc2hhcmVwb2ludC5jb21ANzMzMTlmNDItODkwOC00Yjg5LTlmOGQtNTU4Y2Y0ZDVkNzc2IiwiZXhwIjoiMTc0NTMwMTYwMCJ9.CgoKBHNuaWQSAjg0EgQI0LsCGgw0MC4xMjYuNDUuMjcqLHg1QzI0L203UmdtV2FaY3JrYVgyTG9vNk9tZlB2cStOTjhQcmhJelpmU0k9MJ4BOAFKEGhhc2hlZHByb29mdG9rZW5SCFsia21zaSJdcikwaC5mfG1lbWJlcnNoaXB8MTAwMzIwMDNhMjdiZjMzNEBsaXZlLmNvbXoBMoIBEglCnzFzCImJSxGfjVWM9NXXdpIBBkhFTUlMWZoBFkJBUkJVREEgREUgSkVTVVMgUkFNT1OiARsyMDI0MjAxMjAwMDI2MUBwdWNnby5lZHUuYnKqARAxMDAzMjAwM0EyN0JGMzM0sgE7YWxsZmlsZXMud3JpdGUgY29udGFpbmVyLnNlbGVjdGVkIGdyb3VwLnJlYWQgYWxsc2l0ZXMud3JpdGU.JzE35zXuO4xRNRRvnNm3A_CmiZixhJM74mzZKqcg-8c%26version%3DPublished&width=9999&height=9999&cb=63861086475)

## 🔧 Tecnologias Utilizadas

- Java: Linguagem de programação utilizada para o desenvolvimento do programa.
- Scanner: Para entrada de dados do usuário.
- Estruturas condicionais: if-else para decisão lógica.

## 📝 Observações

- Certifique-se de que o Java esteja instalado corretamente em sua máquina.
- Para obter mais detalhes sobre a execução e ajustes no código, consulte os comentários no arquivo Main.java.
