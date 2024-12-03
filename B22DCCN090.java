/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * in các số nguyên tố < 1000
 * in các số hoàn hảo < 10000  (tổng các ước số nhỏ hơn nó bằng chính nó
 * in các số chia hết cho 3 < 2000
 */
class InNguyenTo extends Thread{
        @Override
        public void run(){
            for (int i = 2;i<=1000;i++){
                int check = 1;
                for (int j = 2; j <= Math.sqrt(i) ;j++){
                    if (i%j == 0){
                        check = 0;
                        break;
                    }
                }
                if (check == 1){
                    System.out.println(i + " La so nguyen to");
                }
            }
        }
    }

class InHoanHao extends Thread {
        @Override
        public void run(){
            for (int i = 1;i <= 10000; i++){
                int res = 0;
                for (int j = 1;j<=Math.sqrt(i);j++){
                    if (i%j == 0){
                        res += j;
                        if (i/j!=j){
                            res += i/j;
                        }
                    }
                }
                if (res == 2*i){
                    System.out.println(i + " La so hoan hao");
                }
            }
        }
    }
class InChiaHetCho3 extends Thread{
        @Override
        public void run(){
            for (int i = 3; i <= 2000; i+=3){
                    System.out.println(i + " La so chia het cho 3");
            }
        }
    }
public class B22DCCN090 {
    public static void main(String[] args) {
        InNguyenTo doituong1 = new InNguyenTo();
        InHoanHao doituong2 = new InHoanHao();
        InChiaHetCho3 doituong3 = new InChiaHetCho3();
        doituong1.start();
        doituong2.start();
        doituong3.start();
    }
}
