package com.example.problem4;

/*
 * 问题描述：请实现一个函数，将字符串的每个空格替换为"%20"。例如输入"We are happy",则输出"We%20are%20happy."。
 */
public class SpaceReplace {
//    public String replaceSpace(StringBuffer str){
//        if (str == null||str.length()==0){
//            return null;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            char index = str.charAt(i);
//            if (index ==' '){
//                str.replace(i,i+1,"%20");
//            }
//        }
//        return str.toString();
//    }

    public String replaceSpace(String str){
        StringBuffer stringBuffer = new StringBuffer();
        if (str == null||str.length()==0){
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char index = str.charAt(i);
            if (index == ' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
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
