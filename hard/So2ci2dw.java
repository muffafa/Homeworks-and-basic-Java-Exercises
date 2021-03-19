//sum of two cubes in exactly two different ways
public class So2ci2dw {
	public static int way1;
	public static int way2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int stop = 12;
		
		//System.out.println(d);
		
		for (;d<=stop;d++) {
			//System.out.print(d+" ");
			for (c=3;c<d;c++){
				//System.out.print(c+" ");
				for (b=2;b<c;b++){
					//System.out.print(b+" ");
					for (a=1;a<b;a++){
						//System.out.println(a);
						check(a,b,c,d);
					}	
				}
			}	
		}
	}
	public static void check(int w, int x, int y, int z) {
		//a^3+d^3=b^3+c^3
		System.out.printf("checking for %d %d %d %d%n",w,x,y,z);
		if(w*w*w+z*z*z == x*x*x+y*y*y) {
			way1 = w*w*w+z*z*z;
			way2 = x*x*x+y*y*y;
			System.out.printf("%d^3 + %d^3 = %d^3 + %d^3 = %d%n",w,z,x,y,way1);
		}else;	
	}
}
