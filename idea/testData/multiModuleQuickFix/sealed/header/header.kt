// "Create actual class for module testModule_JavaScript (JS)" "true"

expect sealed class <caret>Sealed {
    object Obj : Sealed

    class Klass(x: Int) : Sealed
}