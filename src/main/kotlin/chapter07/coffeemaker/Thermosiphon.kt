package chapter07.coffeemaker

/**
 * @author sskim
 */
//열사이펀 Themosiphon 클래스
class Thermosiphon(heater: Heater) : Pump, Heater by heater { // 위임의 사용
    override fun pump() {
        if (isHot()) {
            println("[Thermosiphon] pumping...");
        }
    }
}