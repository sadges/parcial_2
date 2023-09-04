public class pa {
			public static void main(String args[]){
				int a = 5;
				int b = 4;
				int re = ca(b,a);
				System.out.println(b+"^"+a+"="+re);
			}
			public static int ca(int n, int b){
				int res = 1;
				if(n > 0 && b==0){
					return res;
				}
				else if(n == 0 && b>=1){
					return 0;
				}
				else{
					for(int i = 1; i<= b; i++){
						res = res*n;
					}
					return res;
				}
			}