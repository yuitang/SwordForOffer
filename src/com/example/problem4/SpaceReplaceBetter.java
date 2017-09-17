package com.example.problem4;

/*
 * 问题描述：请实现一个函数，将字符串的每个空格替换为"%20"。例如输入"We are happy",则输出"We%20are%20happy."。
 *
 * 思路：逆序替换，降低时间复杂度,从字符串的后面开始复制和替换，首先准备两个指针，p1和p2，p1指向原始字符串的末尾，p2指向替换后字符串的末尾，
 * 接下来，向前移动指针p1，逐个把它指向的字符复制到p2，碰到一个空格之后，把p1向前移动1格，在p2处插入字符串“20%”，
 * 由于“20%”长度为3，同时也要把p2向前移动3格。直到p1=p2，表明所有空格都已经替换完毕。
 */


public class SpaceReplaceBetter {
    public String replaceSpace(String strOld){
        if (strOld == null||strOld.length()==0){
            return null;
        }
        StringBuilder strNew = new StringBuilder();
        int length = strOld.length();
        int spaceNum = 0;
        //统计空格字符个数
        for (int i = 0; i < length; i++) {
            if (strOld.charAt(i)==' '){
                spaceNum++;
            }
        }
        int lengthNew = length + spaceNum*2;
        strNew.setLength(lengthNew);
        int indexOld = length - 1;
        int indexNew = lengthNew - 1;
        for (; indexOld > 0; indexOld--) {
            if (strOld.charAt(indexOld)==' '){
                strNew.setCharAt(indexNew--,'0');
                strNew.setCharAt(indexNew--,'2');
                strNew.setCharAt(indexNew--,'%');
            }else {
                strNew.setCharAt(indexNew--,strOld.charAt(indexOld));
            }
        }
        return strNew.toString();
    }

    // 测试用例
    public static void main(String[] args) {
        SpaceReplace test = new SpaceReplace();
        // 输入的字符串包含空格：最后面，最前面，中间，连续空格
        String str1 = "We are happy.";
        String str2 = " Wearehappy.";
        String str3 = "Wearehappy. ";
        String str4 = "We   are   happy  .";
        //输入的字符串没有空格
        String str5="Wearehappy.";
        //特殊输入测试：字符串只有连续空格、只有一个空格、字符串是一个null指针、字符串是一个空字符串;
        String str6="    ";
        String str7=" ";
        String str8=null;
        String str9="";
        System.out.println(test.replaceSpace(str1));
        System.out.println(test.replaceSpace(str2));
        System.out.println(test.replaceSpace(str3));
        System.out.println(test.replaceSpace(str4));
        System.out.println(test.replaceSpace(str5));
        System.out.println(test.replaceSpace(str6));
        System.out.println(test.replaceSpace(str7));
        System.out.println(test.replaceSpace(str8));
        System.out.println(test.replaceSpace(str9));
    }
}
