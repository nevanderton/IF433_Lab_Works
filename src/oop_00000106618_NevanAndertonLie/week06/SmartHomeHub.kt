package oop_00000106618_NevanAndertonLie.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan semua perangkat ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- Mode Keamanan Aktif! ---")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}