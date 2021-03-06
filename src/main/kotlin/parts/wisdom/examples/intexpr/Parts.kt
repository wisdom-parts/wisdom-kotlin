package parts.wisdom.examples.intexpr

import me.joypri.*

object C : IntRole()

open class IntExprRole : ClassRole<IntExpr>(IntExpr::class)

object X : IntExprRole()
object Y : IntExprRole()

open class IntExpr(vararg parts: Part) : Mix(*parts) {
    open fun eval(): Int = 0
}

open class Const(vararg parts: Part) : IntExpr(*parts) {
    val c by C
    override fun eval(): Int = c
}

open class Plus(vararg parts: Part) : IntExpr(*parts) {
    val x by X
    val y by Y
    override fun eval(): Int = x.eval() + y.eval()
}

open class Times(vararg parts: Part) : IntExpr(*parts) {
    val x by X
    val y by Y
    override fun eval(): Int = x.eval() * y.eval()
}