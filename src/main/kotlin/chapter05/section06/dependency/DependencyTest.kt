package chapter05.section06.dependency

/**
 * @author sskim
 */
//의존 관계 나타내기
//한 클래스가 다른 클래스에 의존되어 있어 영향을 주는 경우 의존관계라고 한다.
class Patient(val name: String, var id: Int) {

    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String, val p: Patient) {

    val customerId: Int = p.id

    fun patientList() {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    val patient1 = Patient("Kildong", 1234)
    val doc1 = Doctor("KimSabu", patient1)
    doc1.patientList()
}