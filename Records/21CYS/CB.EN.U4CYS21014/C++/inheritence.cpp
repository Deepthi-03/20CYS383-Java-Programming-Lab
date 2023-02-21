#include <iostream>
using namespace std;
class A
{
    private:
        int x=5;
    protected:
        int y=20;
    public:
        int z=10;
};
class B : private A
{
    public:
    void acc2()
    {
       cout<<"z = "<<z<<endl; 
    }
    void acc()
    {
       cout<<"y = "<<y<<endl; 
    }
    /*void acc1()
    {
       cout<<x;
    }*/
};

int main(){
    B qwe;
    qwe.acc2();
    qwe.acc();
    //qwe.acc2();
    

}
