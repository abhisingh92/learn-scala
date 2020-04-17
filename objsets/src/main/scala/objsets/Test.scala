package objsets

object Test {

  def test(x:Int): Int = {
    x+1
    return x
  }

  def main(args: Array[String]): Unit = {
    print(test(10))
  }

}
