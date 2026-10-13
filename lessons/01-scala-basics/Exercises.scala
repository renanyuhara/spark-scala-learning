// Aula 01 — Coleções e funções em Scala.
// Executa no spark-shell: :load /workspace/lessons/01-scala-basics/Exercises.scala
// Este ficheiro só inclui os dados iniciais: a solução é tua.

case class Venda(
  id: Int,
  cidade: String,
  produto: String,
  quantidade: Int,
  precoUnitario: Double
)

val vendas = Seq(
  Venda(1, "Porto", "Teclado", 2, 120.0),
  Venda(2, "Lisboa", "Rato", 1, 80.0),
  Venda(3, "Porto", "Cabo USB", 3, 25.0),
  Venda(4, "Lisboa", "Adaptador", 2, 30.0),
  Venda(5, "Braga", "Caneta", 4, 15.0),
  Venda(6, "Porto", "Tapete", 1, 50.0)
)

println(s"Dados carregados: ${vendas.size} vendas")
println("Primeiro registo:")
println(vendas.head)

// TODO 1: Cria uma nova coleção com o valor total de cada venda.
// Dica: total = quantidade * precoUnitario; experimenta .map.
val totais = vendas.map(v => v.quantidade * v.precoUnitario)

// TODO 2: Filtra apenas as vendas da cidade do Porto.
// Dica: experimenta .filter.
val vendasPorto = vendas.filter(v => v.cidade == "Porto")
vendasPorto.size

// TODO 3: Calcula o faturamento total por cidade.
// Dica: experimenta .groupBy e depois .map.

// TODO 4 (bónus): Ordena as cidades por faturamento decrescente.
def calcularTotal(venda: Venda): Double =
  venda.quantidade * venda.precoUnitario

val faturamentoPorCidade = vendas
  .groupBy(_.cidade)
  .map { case (cidade, vendasDaCidade) =>
    (cidade, vendasDaCidade.map(calcularTotal).sum)
  }
  .toSeq
  .sortBy { case (_, total) => -total }