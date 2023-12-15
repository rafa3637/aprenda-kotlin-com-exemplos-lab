// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

// desafio.kt

// Representa um conteúdo educacional
data class ConteudoEducacional(val titulo: String, val descricao: String)

// Representa um aluno
data class Aluno(val nome: String, val matricula: String)

// Interface para definir comportamentos comuns a Formacoes
interface Formacao {
    val nome: String
    val nivel: String
    val conteudosEducacionais: List<ConteudoEducacional>

    fun matricularAluno(aluno: Aluno)
}

// Implementação básica da interface Formacao
class FormacaoImpl(
    override val nome: String,
    override val nivel: String,
    override val conteudosEducacionais: List<ConteudoEducacional>
) : Formacao {
    private val alunosMatriculados = mutableListOf<Aluno>()

    override fun matricularAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
        println("Aluno ${aluno.nome} matriculado na formação $nome")
    }
}

fun main() {
    // Exemplo de uso
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", "Aprenda os conceitos básicos do Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", "Entenda POO com Kotlin")
    val conteudos = listOf(conteudo1, conteudo2)

    val formacaoKotlin = FormacaoImpl("Formação Kotlin", "Intermediário", conteudos)

    val aluno1 = Aluno("João", "12345")
    val aluno2 = Aluno("Maria", "67890")

    formacaoKotlin.matricularAluno(aluno1)
    formacaoKotlin.matricularAluno(aluno2)
}
