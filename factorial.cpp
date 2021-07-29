#include <iostream>
using namespace std;
class Factorial{
    private:
        int num,num2;
        int fact=1;
    public:
        void init(){
            cout<<"Enter the number :";
            cin>>num;
        }
        void factt(){
            while(num>1){
                fact=fact*num;
                num--;
            }
            cout<<fact<<endl;

        }

};
int main(){
    Factorial myobj;
    myobj.init();
    myobj.factt();
    return 0;
}