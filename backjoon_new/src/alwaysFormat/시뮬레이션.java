package alwaysFormat;

import java.io.*;
import java.util.*;

class Pair{
    int x;
    int y;
    public  Pair(int x, int y){
        this.x =x;
        this.y= y;
    }
}

public class ½Ã¹Ä·¹ÀÌ¼Ç {
	static int n=100;
	
	static int [] dx = {0,1,0,-1}; // µ¿R ³² ¼­ ºÏ 
	static int [] dy = {1,0,-1,0};
	
	public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
	static int getDir(char ch){
        int d=0;
        if(ch=='E'){
            d=0;
        }else if(ch=='S'){
            d=1;
        }else if(ch=='W'){
            d=2;
        }else{
            d=3;
        }
        return d;
    }
}
