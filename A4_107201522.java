/*
 * Assignment 4
 * Course: CE1002
 * Name: Ĭ�f��
 * Student ID:107201522 
 */
package CE1002.A4.S107201522;

import java.util.Scanner;
public class A4_107201522 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);//�ϥΪ̿�J�O��sc
	      int n = sc.nextInt(); //�ŧi����ܼ�
	      
	      String[][] inputArray = new String[n][n];//�ŧi��J�}�C
	      String[][] outputArray = new String[n][n];//�ŧi��X�}�C
	      sc.nextLine().split("/n");
	      
	      for(int i=0;i<n;i++){//�ϥΰj��N��J��ƶi��B�z
	         inputArray[i] = sc.nextLine().split("");
	      }

	      for(int j=0;j<n;j++){//�ϥΰj��Nn*n���}�C���C����ƳB�z
	         for(int k=0;k<n;k++){
	            if(inputArray[j][k].equals("*")){//��J*�A�P�_���a�p�A��X*
	               outputArray[j][k]="*";}
	            else{
	               int mineAround=0;//�N��l�a�p�]�w��0��
	               if(j>0 & k>0){
	                  if(inputArray[j-1][k-1].equals("*")){//�P�_���U�O�_���a�p
	                     mineAround++;//���a�p�h�N�a�p��+1
	                  }
	               }
	               if(j>0 ){
	                  if(inputArray[j-1][k].equals("*")){//�P�_����O�_���a�p
	                     mineAround++;//���a�p�h�N�a�p��+1
	                  }
	               }
	               if(j>0 & k+1<n){
	                  if(inputArray[j-1][k+1].equals("*")){//�P�_���W�O�_���a�p
	                     mineAround++;//���a�p�h�N�a�p��+1
	                  }
	               }
	               if(k+1<n){
	                  if(inputArray[j][k+1].equals("*")){//�P�_�W��O�_���a�p
	                     mineAround++;//���a�p�h�N�a�p��+1
	                  }
	               }
	               if(j+1<n & k+1<n){
	                  if(inputArray[j+1][k+1].equals("*")){//�P�_�k�W�O�_���a�p
	                     mineAround++;//���a�p�h�N�a�p��+1
	                  }
	               }
	               if(j+1<n){
	                  if(inputArray[j+1][k].equals("*")){//�P�_�k��O�_���a�p
	                     mineAround++;//���a�p�h�N�a�p��+1
	                  }
	               }
	               if(j+1<n & k>0 ){
	                  if(inputArray[j+1][k-1].equals("*")){//�P�_�k�U�O�_���a�p
	                     mineAround++;//���a�p�h�N�a�p��+1
	                  }
	               }
	               if(k>0 ){
	                  if(inputArray[j][k-1].equals("*")){//�P�_�U��O�_���a�p
	                     mineAround++;//���a�p�h�N�a�p��+1
	                  }
	               }
	               if(mineAround==0){//�Y�a�p�ƦX�p��0���A�h��X0
	                  outputArray[j][k]="0";
	               }else{
	                  outputArray[j][k]=String.valueOf(mineAround);//��l�h�N�a�p�ƥ[�`�ÿ�X
	               }
	           }
	       }
	    }

	    for(int i=0;i<n;i++){//�ΰj��N��X�}�C�L�X
	       for(int j=0;j<n;j++){
	           System.out.print(outputArray[i][j]);
	       }
	       System.out.println();
	    }
	   }
	  }
