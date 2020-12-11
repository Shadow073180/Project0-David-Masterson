


import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer
import scala.collection.immutable.Range

object Project0 extends App
{




    def ReadCSV(fileName: String): Unit=
    {
      var count: Int = 0
      var file = io.Source.fromFile(s"$fileName")
      var headerRow = new ListBuffer[String]()
      for(row <- file.getLines) 
      {
        var columns = row.split(",").map(_.trim())
        for (column <- columns) 
        {
          if (count == 0) headerRow += column
        }  
        count += 1  
      }
      var headerRowToList = headerRow.toList
      println(headerRowToList)
    }
    ReadCSV(args(0))
  
}