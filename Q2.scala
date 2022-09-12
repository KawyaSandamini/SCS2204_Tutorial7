@main
def run()={
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
    val a = x-y-z
    println(a)
}

class Rational(n:Int, d:Int) {
    def numer = n
    def denom = d
    
    def +(r:Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, denom*r.denom)
    def neg = new Rational(-this.numer, this.denom)
    def -(r:Rational) = this+r.neg

    override def toString(): String = numer + "/" + denom
}