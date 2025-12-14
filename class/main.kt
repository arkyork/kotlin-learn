@file:JvmName("Main")

open class SmartDevice(val name: String, val version: String, count: Int) {
    
    constructor(): this("Unknown","0.0" ,0){ 
        println("SmartDevice initialized.")
    }

    var usageCount: Int = count
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Usage count cannot be negative.")
            }
        }

    fun turnOn(){
        println("Device is turned on.")
    }
    fun turnOff(){
        println("Device is turned off.")
    }
    override fun toString(): String {
        return "This is a smart device."
    }

}

class DeviceA(name: String, version: String, count: Int) : 
    SmartDevice(name, version, count) {
    
    override fun toString(): String {
        return "DeviceA(name=$name, version=$version)"
    }
}

class Human(val DeviceA: DeviceA){

    fun useDevice(){
        DeviceA.turnOn()
        println("Using the device...")
        DeviceA.turnOff()
    }
}

fun main() {
    val device: SmartDevice = SmartDevice("DeviceA","1.0",5)
    val human: Human = Human(DeviceA("DeviceA","1.0",5))
    human.useDevice()
    device.turnOn()
    println(device)
    println("Device Name: ${device.name}")
    device.turnOff()
}