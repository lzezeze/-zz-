package �������;
import java.util.Random;
public class ExerciseGOA {
	public static void main(String[] args) {
		int result=0,j=1;
		char o='+';
		Random random=new Random();
		for(int i=0;i<1000;i++){
			int num1=random.nextInt(101);//0-100���������
			int num2=random.nextInt(101);//0-100���������
			int operator=random.nextInt(2);//0-1 0:�ӷ�,1:����
			if(operator==1){
				o='+';
				result=num1+num2;
			}
			else{
				o='-';
				result=num1-num2;
			}
			if(result>=0&&result<=100) {//0-100���ڵļӼ���
				if(j==51) {//50����
					break;
				}
				System.out.print((j++)+":"+num1+o+num2+"="+result+"\t");
				if(j%5==1) {//ÿ5���⻻��
					System.out.print("\n");
				}
				
			}
		}	
	}
}
