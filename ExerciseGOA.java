package 软件构造;
import java.util.Random;
public class ExerciseGOA {
	public static void main(String[] args) {
		int result=0,j=1;
		char o='+';
		Random random=new Random();
		for(int i=0;i<1000;i++){
			int num1=random.nextInt(101);//0-100随机的数字
			int num2=random.nextInt(101);//0-100随机的数字
			int operator=random.nextInt(2);//0-1 0:加法,1:减法
			if(operator==1){
				o='+';
				result=num1+num2;
			}
			else{
				o='-';
				result=num1-num2;
			}
			if(result>=0&&result<=100) {//0-100以内的加减法
				if(j==51) {//50道题
					break;
				}
				System.out.print((j++)+":"+num1+o+num2+"="+result+"\t");
				if(j%5==1) {//每5道题换行
					System.out.print("\n");
				}
				
			}
		}	
	}
}
