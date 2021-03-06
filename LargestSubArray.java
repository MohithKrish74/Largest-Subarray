package com.keyword;

import com.sun.jdi.ThreadReference;

import java.util.*;

public class LargestSubArray
{


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        TreeMap<Integer,String> map = new TreeMap<Integer,String>();
        System.out.println("Enter the elements: ");
        int i,j,max=0;
        for(i=0;i<size;i++)
        {
            list.add(in.nextInt());
        }
        System.out.println("User entered list is "+list);
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<=size;j++)
            {
                int counter0=0,counter1=0;
                for(Integer k:list.subList(i,j))
                {
                    if(k==0)
                    {
                        counter0++;
                    }
                    else
                    {
                        counter1++;
                    }
                }
                if(counter0==counter1)
                {
                    map.put(counter0,i+" to "+(j-1));
                    if (max<counter0)
                    {
                        max=counter0;
                    }
                }
            }
        }

        if(map.containsKey(max))
        {
            System.out.println(map.get(max));
        }
        else
        {
            System.out.println("No sub-array found.");
        }


    }
}
