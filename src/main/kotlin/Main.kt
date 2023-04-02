import java.util.Scanner

fun main() {
    /*
    1 - Faça um programa que receba um número de 1 a 7 e exiba o dia da semana
correspondente usando when.
     */
    val entrada = Scanner (System.`in`)

    val diaNumero : Int
    println("Informe o dia de hoje: ")
    diaNumero=entrada.nextInt()
    //println("Dia informado $diaNumero") //teste
    val dia = when(diaNumero){
        1-> "Domingo"
        2-> "Segunda-feira"
        3-> "Terça-feira"
        4-> "Quarta-feira"
        5-> "Quinta-feira"
        6-> "Sexta-feira"
        7-> "Sábado"
        else -> "Dia inválido"
    }
    println("Hoje é $dia\n")

    /*
    2 - Faça um programa que verifique se um animal é um mamífero, ave ou réptil usando
when.
     */

    val caracteristica : Int
    println("Digite um número:\nO animal:\n1-Possui penas\n2-Possui escamas\n3-Mama")
    caracteristica=entrada.nextInt()
    entrada.nextLine()
    when(caracteristica){
        1->println("É ave\n")
        2-> println("É réptil\n")
        3->println("É mamífero\n")
        else -> println("Número inválido\n")
    }

    /*
    3 - Faça um programa que receba uma letra e verifique se ela é uma vogal ou consoante
usando when.
     */

    var letra:String
    println("Informe uma letra: ")
    letra=entrada.nextLine()
    letra=when(letra){
        "A"->"Vogal"
        "E"->"Vogal"
        "I"->"Vogal"
        "O"->"Vogal"
        "U"->"Vogal"
        "a"->"Vogal"
        "e"->"Vogal"
        "i"->"Vogal"
        "o"->"Vogal"
        "u"->"Vogal"
        else -> "Consoante"
    }
    println("$letra\n")

    /*
    4 - Faça um programa que receba um número de 1 a 12 e exiba o mês correspondente
usando when.
     */
    val month:Int
    println("Informe o numero do mês: ")
    month=entrada.nextInt()
    val monthNumber=when(month){
        1->"Janeiro"
        2-> "Fevereiro"
        3-> "Março"
        4-> "Abril"
        5-> "Maio"
        6->"Junho"
        7->"Julho"
        8->"Agosto"
        9->"Setembro"
        10->"Outubro"
        11->"Novembro"
        12->"Dezembro"
        else ->"Número inválido"
    }
    println(monthNumber)
}