package com.example.problem3;

/*
 * 题目描述：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下的顺序排序。
 * 完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否包含该整数;
 *
 * 思路：由于该二维数组从左到右，从上到下均为顺序递增的。因此右下角与左上角的数字均大于或小于其周围数字，
 * 如果选择这2个位置作为起始点，则无法确定下一步的方向。而右上角的数字是同行最大值、同列最小值，选择该点为起始
 * 点则可以根据该数子与目标的比较确定下一步是向右移还是向下移，同理选择左下角也可以实现该函数。
 * 这里选择右上角为起始点。
 */

public class ArrayFind {

    public static void find(int arr[][],int target){
        boolean found = false;
        if(arr != null){
            int row = 0;
            int column = arr[0].length - 1;
            int key = arr[row][column];
            while (row<arr.length && column>=0){
                if (target==key){
                    found = true;
                    break;
                }
                else if (target > key){
                    column++;
                }
                else {
                    row--;
                }
            }
            if (found){
                System.out.println("find the target"+target+"in row:"+row+"column:"+column);
            }
            else {
                System.out.println("Sorry not found!");
            }
        }
    }

    //测试
    public static void main(String[] args){
        int[][] A = {{2,13,32},{5,17,44},{6,33,63},{10,44,70}};
        find(A,15);
    }
}
