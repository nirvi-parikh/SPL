object controlstructure {
  /** Quick sort in Scala**/
    def quick_sort(arr: Array[Int]) {
      def swap(i: Int, j: Int) {
        val t = arr(i);
        arr(i) = arr(j);
        arr(j) = t
      }
      def sort1(l: Int, r: Int) {
        val pivot = arr((l + r) / 2)
        var i = l
        var j = r
        while (i <= j) {
          while (arr(i) < pivot) i += 1
          while (arr(j) > pivot) j -= 1
          if (i <= j) {
            swap(i, j)
            i += 1
            j -= 1
          }
        }
        if (l < j) sort1(l, j)
        if (j < r) sort1(i, r)
      }
      if (arr.length > 0)
        sort1(0, arr.length - 1)
    }
    def println(ar: Array[Int]) {
      def print1 = {
        def iter(i: Int): String =
          ar(i) + (if (i < ar.length - 1) "," + iter(i + 1) else "")

        if (ar.length == 0) "" else iter(0)
      }
      Console.println("[" + print1 + "]")
    }
    def main(args: Array[String]) {
      val mylist = Array(9, 1, 7, 3, 2)
      println(mylist)
      quick_sort(mylist)
      println(mylist)
    }
}
