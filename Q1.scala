@main
def run()={
    val p = new Rational(1,2)
    val q = new Rational(5,6)
    println(p.neg)
    val z = p.add(q)
    println(z)
}

class Rational(x:Int, y:Int) {
    def numer = x
    def denom = y

    def add(r:Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, denom*r.denom)
    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
}