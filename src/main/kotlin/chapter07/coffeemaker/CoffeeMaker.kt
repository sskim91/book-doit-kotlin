package chapter07.coffeemaker

/**
 * @author sskim
 */
//커피 제조기 CoffeeMaker 클래스와 생성 테스트하기
class CoffeeMaker(val coffeeModule: CoffeeModule) {
    fun brew() {
        val theSiphon: Thermosiphon = coffeeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.pump()
        println("Coffee, here! Enjoy!~")
        theSiphon.off()
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker(MyDripCoffeeModule())
    coffeeMaker.brew()
}