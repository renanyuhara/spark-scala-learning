# Aula 03 — Transformações e primeiro ETL

**Estado:** planeada. Vamos detalhar os exercícios depois da revisão da aula 02.

## Objetivo

Construir um fluxo simples de ETL com os ficheiros em `datasets/`, praticando:

1. Leitura de CSV com schema explícito (sem depender de `inferSchema` em produção).
2. Tratamento de nulos e tipos.
3. Eliminação de duplicados.
4. Agregações e joins (quando adicionarmos uma segunda fonte).
5. Escrita em Parquet e leitura do resultado.

## Conceitos que veremos durante a prática

- Lazy evaluation e ações.
- Transformações narrow/wide, noções iniciais de shuffle.
- Diferença entre processar em memória com C# e descrever uma execução distribuída com Spark.

Não há solução ou implementação nesta pasta ainda: vamos desenvolvê-la em conjunto.