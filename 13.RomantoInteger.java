class Solution {
    public int romanToInt(String s) {
    int nums=0;
    int i=0;
    while(i<s.length()){
    if(s.charAt(i)=='M'){
    nums+=1000;
    }else if(s.charAt(i)=='D'){
     nums+=500;
    }else if(s.charAt(i)=='C'&& i+1<s.length()&&s.charAt(i+1)=='M'){
     nums-=100;
    }else if(s.charAt(i)=='C'&& i+1<s.length()&&s.charAt(i+1)=='D'){
        nums-=100;
    }else if(s.charAt(i)=='C'){
        nums+=100;
    }
    else if(s.charAt(i)=='L'){
     nums+=50;
    }else if(s.charAt(i)=='X'&& i+1<s.length()&& s.charAt(i+1)=='C'){
    nums-=10;
    }else if(s.charAt(i)=='X'&& i+1<s.length()&&s.charAt(i+1)=='L'){
    nums-=10;
    }
    else if(s.charAt(i)=='X'){
    nums-=10;
    }else if(s.charAt(i)=='V'){
     nums+=5;
    }else if(s.charAt(i)=='I' && i+1<s.length()&&s.charAt(i+1)=='V'){
    nums-=1;
    }else if(s.charAt(i)=='I'&&i+1<s.length()&&s.charAt(i+1)=='X'){
    nums-=1;
    }else if(s.charAt(i)=='I'){
    nums+=1;
    }
    i++;
    }
    return nums;   
    }
}