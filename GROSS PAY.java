public class ACTVITY
{

	public static void main(String[] args) {
		
		int day = 17, hours, OT = 16;
		int hour = day * 8;
		int payment = OT * 512;
		int totals = 512 * hour;
		int a = (int)(payment*(125.0f/100.0f));
		int totalss = totals + a;
		
		System.out.println("Total Number for Working days: " + day);
		System.out.println("Total Number for Over Time: " + OT);
		System.out.println("Total pay without overtime = "  + totals);
		System.out.println("Total pay for overtime = " + a);
		
		
		System.out.println("Overall gross pay =  " + totalss);
	}
}