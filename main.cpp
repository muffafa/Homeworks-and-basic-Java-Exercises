#include <iostream>

using namespace std;

int topla(int a, int b)
{
    
    return a + b;
}

int cikar(int a, int b)
{
    
    return a - b;
}

int carp(int a, int b)
{
    
    return a * b;
}

int main() {
	
	while(true) {
		char op;
		int num1, num2;
		
		cout << "islem yapmak icin ilk sayi\n";
		cin >> num1;
		
		cout << "islem yapmak icin ikinci sayi\n";
		cin >> num2;
		
		cout << "islem +=> Toplama islemi\n";
		cout << "islem -=> cikarma islemi\n";
		cout << "islem *=> carpma islemi\n";
		
		cin >> op;
		
		if(op == '+'){
			cout << "toplama islemi secildi\n";
			printf("toplama isleminin sonucu : %d\n",topla(num1,num2));
		}else if(op == '-'){
			cout << "c�karma islemi secildi\n";
			printf("c�karma isleminin sonucu : %d\n",cikar(num1,num2));
			
		}else if(op == '*'){
			cout << "carpma islemi secildi\n";
			printf("carpma isleminin sonucu : %d\n",carp(num1,num2));
		}
	}
		
	return 0;
}
