package wb.lp.myapplication.ktlearn

class Ktlearn {

    fun main() {
        Util.doAction2()
        Util.doAction3()
    }

}

//数据类
data class X(val name:String)


object  Y {
    fun a() {
        print("单例类")
    }
}


class Util {

    fun doAction1() {
        println("do action1")
    }

    //在companion object中的方法都可以使用类似于Java静态方法的形式调用。
    companion object {

        fun doAction2() {
            println("do action2")
        }

        @JvmStatic
        fun doAction3() {
            println("do action3 JvmStatic")
        }

    }

}