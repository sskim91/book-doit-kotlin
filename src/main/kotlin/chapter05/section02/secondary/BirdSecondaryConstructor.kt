package chapter05.section02.secondary

/**
 * @author sskim
 */
//부 생성자를 사용하는 Bird 클래스
class Bird {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 1. 부 생성자
//    constructor(name: String, wing: Int, beak: String, color: String) {
//        this.name = name
//        this.wing = wing
//        this.beak = beak
//        this.color = color
//    }
    // 2. 부 생성자 (이름이 다른 스타일) this를 안쓸 수 있음
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

fun main() {

    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}

