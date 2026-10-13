# Aula 01 — Scala para quem conhece C#

**Objetivo:** trabalhar com valores imutáveis, `case class` e operações sobre coleções (`map`, `filter`, `groupBy`) antes de aplicar os mesmos conceitos a DataFrames.

## Prática

1. Abre o PowerShell na raiz do repositório e corre `./scripts/start-spark.ps1` (ou `\.\scripts\start-spark.ps1` no Windows).
2. Quando aparecer `scala>`, executa `:load /workspace/lessons/01-scala-basics/Exercises.scala`.
3. Abre o ficheiro `Exercises.scala` no VS Code e implementa os quatro TODOs.
4. Volta ao `spark-shell` e carrega novamente o ficheiro para verificar as alterações.
5. Regista no diário uma coisa que te pareceu semelhante a LINQ e outra que foi diferente.

## Critérios de aceitação

- Uma coleção contém os totais individuais das seis vendas.
- Outra coleção contém apenas as três vendas do Porto.
- O agrupamento por cidade produz os valores esperados (a ordem não importa): Porto = 365.0, Lisboa = 140.0 e Braga = 60.0.
- O código está legível e podes explicar o que cada operação faz.

## Pistas, sem solução

- C#: `Select(...)` corresponde frequentemente a Scala `map(...)`.
- C#: `Where(...)` corresponde frequentemente a Scala `filter(...)`.
- `val` cria uma referência que não pode ser reatribuída; não significa que todo o objeto referenciado seja imutável.
- Prefere transformações a alterar uma lista partilhada dentro de um `foreach`.

**Nota:** `Double` está aqui para manter o exercício simples. Para valores monetários reais, avalia precisão decimal (`BigDecimal` em Scala e `DecimalType` no Spark).

## Entrega

Faz commit do teu `Exercises.scala` numa branch `lesson/01-scala-basics` e abre um Pull Request. A revisão será focada em legibilidade, raciocínio e alternativas de implementação, não em decorar a sintaxe.