package chapter05.section06.association

/**
 * @author sskim
 */
//연관 관계 나타내기
//각자의 생명주기에 영향을 주지 않을 때 연관관계라고 한다.
class Patient(val name: String) {

    fun doctorList(d: Doctor) {  // 인자로 참조
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) { // 인자로 참조
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("Kildong")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}