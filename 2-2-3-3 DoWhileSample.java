/* SKU CoE ITE - ParkSooYoung */
/* Grade 2 , Semester 2 , Chapter 3 , Number 3 */

public class DoWhileSample
{
	public static void main(String[] args)
	{
		char a = 'a';
		
		do
		{
			System.out.print(a); // 문자 출력
			a = (char)(a+1); // 알파벳의 경우 1을 더하면 다음 문자의 코드 값
		} while(a<='z');
	}
}
