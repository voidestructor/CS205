object Q5 {
  
  def pivotSort(num1:List[Int], x: Int): List[Int]={
     
    if(num1 == Nil)
      num1:+x
    else if(num1.head<=x)
      num1.head::pivotSort(num1.tail, x)
    else {
      pivotSort(num1.tail, x):+num1.head
      
    }
  
}
  def main(args: Array[String]): Unit = {
    var list1 = List(5,2,4,7,13,14, 3)
    println(pivotSort(list1,10))
  }
}
