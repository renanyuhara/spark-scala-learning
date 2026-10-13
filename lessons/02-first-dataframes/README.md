# Aula 02 — Primeiros DataFrames

**Pré-requisito:** aula 01 e noções de `map`, `filter` e `groupBy`.

## Objetivo

Refazer com Spark as operações que já realizaste sobre coleções Scala e perceber a diferença entre dados em memória e operações num DataFrame.

## Como executar

Abre o Spark com `./scripts/start-spark.ps1` e, no prompt `scala>`, carrega `:load /workspace/lessons/02-first-dataframes/Starter.scala`.

## Desafios

1. Selecionar colunas (`select`).
2. Calcular a coluna `total` (`withColumn`).
3. Filtrar por cidade (`filter` ou `where`).
4. Agrupar e somar vendas (`groupBy` e `agg`).
5. Comparar o que acontece antes e depois de chamar `show()`; observa o plano com `explain()`.

**Resultado de referência para faturamento por cidade:** Porto 365.0, Lisboa 140.0, Braga 60.0. A ordem pode variar.

## Questões para a revisão

- Que operação parece mais com LINQ? Qual é a grande diferença?
- Quando as transformações são realmente executadas?
- Por que é arriscado usar `collect()` com DataFrames muito grandes?