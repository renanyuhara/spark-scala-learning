# Executar a partir de qualquer diretoria no Windows PowerShell.
# Requer Docker Desktop em execução (Linux containers).
$ErrorActionPreference = 'Stop'
$repoPath = (Resolve-Path (Join-Path $PSScriptRoot '..')).Path

Write-Host 'A iniciar Spark 4.2.0 em modo local (2 threads)...'
Write-Host 'Dentro do spark-shell, utiliza :load /workspace/lessons/01-scala-basics/Exercises.scala'

docker run --rm -it `
  -v "${repoPath}:/workspace" `
  -w /workspace `
  spark:4.2.0 `
  /opt/spark/bin/spark-shell --master 'local[2]'

if ($LASTEXITCODE -ne 0) {
  throw "Docker terminou com o código $LASTEXITCODE. Verifica se o Docker Desktop está a funcionar."
}