
object slip13
{
	def main(args:Array[String])
	{
			var  s1=Set(1,2,3,4,5,6);
			var s2=Set(4,5,6,7,8);
			
			println("set1"+s1)
			println("set1"+s2)
			var s3=s1++s2
			println("merged sets S1 & S2")
			println(s3)
			println("sum of all integers in the merged set:"+(s3.sum))
			println("minimum from set:"+s3.min)
			println("maximum from set:"+s3.max)
	}
}

