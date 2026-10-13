// Aula 02 — Primeiro DataFrame com Spark.
// Executa no spark-shell: :load /workspace/lessons/02-first-dataframes/Starter.scala

import spark.implicits._
import org.apache.spark.sql.functions._

val transacoes = Seq(
  (1, "Porto", "Teclado", 2, 120.0),
  (2, "Lisboa", "Rato", 1, 80.0),
  (3, "Porto", "Cabo USB", 3, 25.0),
  (4, "Lisboa", "Adaptador", 2, 30.0),
  (5, "Braga", "Caneta", 4, 15.0),
  (6, "Porto", "Tapete", 1, 50.0)
).toDF("id", "cidade", "produto", "quantidade", "preco_unitario")

transacoes.printSchema()
transacoes.show(false)

// TODO 1: Seleciona apenas cidade, produto e quantidade.
// TODO 2: Acrescenta a coluna total = quantidade * preco_unitario.
// TODO 3: Filtra as transações da cidade do Porto.
// TODO 4: Faz groupBy de cidade e soma total.
// TODO 5: Experimenta explicar o plano de execução com explain().