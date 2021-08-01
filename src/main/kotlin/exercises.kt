fun main() {
    //1.invertando caracteres e contagem de caracter
    exercise1()

//    exericios com controle de fluxo
//    2. Faça um script que pede duas notas de um aluno.
//    Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:
//    A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//    A mensagem "Reprovado", se a média for menor do que sete;
//    A mensagem "Aprovado com Distinção", se a média for igual a dez.
    exercise2()

//    3. Faça um script que peça um número inteiro e determine se ele é par ou ímpar.
    exercise3()

//  4. Usuario vai digitar um numero exeplo 5. Então programa vai copilar de 0 ate 5 é mostrar os pares.
    println("Entre com um numero inteiro")
    print("-->")
    val countNumber = readLine()!!.toInt();
    exercise4(countNumber)

}

fun exercise1() {
    val name = "Ricardo"
    val lastName ="Maeda"
    println(name.reversed());
    println(lastName.length);
}

fun exercise2(){
    println("Entre com a primeira nota do aluno")
    print("--->")
    val firstNote: Int = readLine()!!.toInt();
    println("Entre com a segunda nota do aluno")
    print("--->")
    val secondNote: Int = readLine()!!.toInt();
    val results = (firstNote + secondNote) / 2;
   if(results >= 7){
       println("Aprovado  com nota $results")
   }else if(results <= 7) {
       println("Reprovado com nota $results")
   }else {
       println("AProvado com merito $results")
   }

}

fun exercise3() {
    println("Entre com  numero")
    print("-->")
    val numberOne = readLine()!!.toInt();
    val prime =  numberOne % 2
    when (prime) {
        0 -> println("E numero par");
        else ->  println("E numero impar")
    }
}

fun exercise4(value:Int){
    val rest = value % 2
    if(value == 0) return
    if(rest == 0){
        println(value)
        exercise4(value - 1)
    }else{
        exercise4(value - 1)
    }
}