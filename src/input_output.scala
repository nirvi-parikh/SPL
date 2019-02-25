object input_output {
  def main(args: Array[String]) {

    var (course_name1: String, course_id1: Int) = Pair("SPL", 5102);
    var (course_name2: String, course_id2: Int) = Pair("SSDI", 6112);

    //print values
    println("Course Name:   " + course_name1,course_name2);
    println("Course ID:    " + course_id1,course_id2);

   //println("Course Name:   " + course_name2);
    //println("Course ID:    " + course_id2);

    //declaration without specifying data type
    var (prof_name, semester) = Pair("Ali Sever", "Spring");

    //print values
    println("Professor Name:   " + prof_name);
    println("Semester:       " + semester);
  }
}