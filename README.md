# Spark + Scala — Aprendizagem prática

Um repositório de exercícios para aprender **Apache Spark com Scala**, partindo da experiência com **C#/.NET e SQL Server**. A prioridade é praticar: teoria apenas quando ajudar a resolver um problema real.

## Percurso (3 semanas sugeridas, ritmo flexível)

| Etapa | Foco | Entrega |
| --- | --- | --- |
| 01 — Scala básico | `val`, `case class`, `map`, `filter`, `groupBy` | Exercícios em coleções Scala |
| 02 — DataFrames | `select`, `withColumn`, `filter`, `groupBy`, `explain` | Agregações em Spark |
| 03 — Transformações e ETL | CSV, schema, nulos, joins, Parquet | Primeiro pipeline |
| Projeto final | Performance, organização e testes | Sales Data Pipeline |

Consulta as instruções de cada etapa em [lessons/](lessons/) e regista as tuas notas no [diário de aprendizagem](docs/learning-log.md).

## Preparar o ambiente (Windows + Docker Desktop)

**Pré-requisitos:** Git, Docker Desktop com containers Linux e PowerShell. Não é necessário instalar Scala, Java ou Spark no Windows para as primeiras aulas.

1. Clona o repositório e entra na pasta:

   ```powershell
   git clone https://github.com/renanyuhara/spark-scala-learning.git
   cd spark-scala-learning
   ```

2. Inicia o Docker Desktop, se não estiver a funcionar.

3. Abre um terminal PowerShell na raiz do projeto e executa:

   ```powershell
   .\scripts\start-spark.ps1
   ```

4. Aguarda o prompt `scala>` e carrega a primeira aula:

   ```scala
   :load /workspace/lessons/01-scala-basics/Exercises.scala
   ```

5. Altera `lessons/01-scala-basics/Exercises.scala` no editor e volta a carregar o ficheiro para experimentar.

   Para sair do interpretador, usa `:quit`. O container temporário será removido (`--rm`), mas a imagem Docker permanece instalada.

> A imagem `spark:4.2.0` tem tamanho considerável e será descarregada apenas na primeira utilização. O script monta o repositório em `/workspace` e inicia Spark em modo `local[2]`, sem exigir um cluster. O código fica sempre guardado na pasta do projeto no teu computador.

**Versões de referência para estas aulas:** Apache Spark 4.2.0 e Scala 2.13. Se a equipa utilizar Spark 3.x ou outra combinação, adaptaremos os exemplos antes de simular o seu ambiente.

## Primeira tarefa

Abre [Aula 01 — Scala para quem conhece C#](lessons/01-scala-basics/README.md) e resolve os TODOs em [Exercises.scala](lessons/01-scala-basics/Exercises.scala). Os dados de exemplo também estão disponíveis em [datasets/transacoes.csv](datasets/transacoes.csv).

## Forma de trabalhar

1. Criar uma branch por aula, por exemplo `lesson/01-scala-basics`.
2. Resolver os TODOs e executar localmente.
3. Abrir um Pull Request para revisão de código.
4. Discutir as melhorias e só então integrar na `main`.
5. Atualizar `docs/learning-log.md` com o que foi aprendido.

Por enquanto os exercícios são intencionalmente simples e **não contêm soluções prontas**. Mais tarde podemos evoluir para `sbt`, testes e pipelines mais próximos do contexto profissional.

## Referências

- [Documentação oficial do Apache Spark](https://spark.apache.org/docs/latest/)
- [Scala Documentation](https://docs.scala-lang.org/)
- [Imagem oficial Spark no Docker Hub](https://hub.docker.com/_/spark)