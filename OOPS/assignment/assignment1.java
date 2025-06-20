import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        //create 2 strings
        String st1 = "vanshika";
        String st2 ="priyanshi";

        //Find the length of both of these strings
        int len1 = st1.length();
        int len2 = st2.length();

        // Concatenate the strings
        String st3 = st1 +" " + st2;

        //Print the lengths of both strings
        System.out.println("Concatenated string is - " + st3);

        //Swap first character of both strings
        String swappedStr1 = st2.charAt(0) + st1.substring(1);
        String swappedStr2 = st1.charAt(0) + st2.substring(1);

        //Print swapped strings
        System.out.println("Swapped Strings:");
        System.out.println("str1: " + swappedStr1);
        System.out.println("str2: " + swappedStr2);

        //Input the index number and print the character at that index
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index:");
        int ind = sc.nextInt(); //ind = index number
        System.out.println(st3.charAt(ind));
        if (ind >= 0 && ind < st3.length()) {
            System.out.println("Character at index " + ind + ": " + st3.charAt(ind));
        } else {
        //Check if the index is valid
            System.out.println("Invalid index entered");
        }

        //Input a character and find its index
        System.out.print("Enter a character-  ");
        char ch = sc.next().charAt(0);
        int charindex = st3.indexOf(ch);
        System.out.println(charindex);
        //checking if the character exists in the string
         if (charindex != -1) {
            System.out.print("Character found at index- " + charindex);
        } else {
            System.out.println("Character not found in the string");
        }
        //Replace any character in the string
        String replaced =  st3.replace('s', 'i');
        System.out.println(replaced);

        // Split the concatenated string at space
        String[] strarr = st3.split(" ");
        System.out.println("Split Strings:- ");
        for (String s : strarr) {
            System.out.println(s);
        }

        //Reverse the concatenated string using a loop
        String rev = "";
        for (int i = st3.length()-1; i >=0; i--) {
         rev += st3.charAt(i);
        }
        System.out.println("reversed string is:- " + rev);
       
        // count the repeated characters
        for ( int i = 0; i < st3.length(); i++) {
            int cnt= 0;
            for (int j = 0; j < st3.length(); j++) {
                if(st3.charAt(i) == st3.charAt(j))
                cnt++;
            }
            if(cnt>1)
            {System.out.println("character " + st3.charAt(i) + " is repeated " + cnt +" times");}

        }
        //Identify Vowels in the Concatenated String and Print Their Index Numbers
        for ( int i = 0; i < st3.length(); i++) {
            char chr = st3.charAt(i);
                if(chr == 'a' || chr == 'e' || chr == 'i' || chr  == 'o' || chr == 'u')
            System.out.println("character is vowel - " + st3.charAt(i) + " at index " + i );

        }
        
        //Create an array and perform sum calculations:- sum of all elements of the array
        //sum of alternate elements of the array 
        int  arr2[] = {0, 1, 2,3,4,5,6,7,8,9,10,22};
        int sum =0;
        int sum1 =0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
            if(i%2==0)
            sum1 += arr2[i];
        }
        System.out.println("sum of all elements is: "+ sum);
        System.out.println("sum of alternate elements is: "+ sum1);

        //sum of elements at the even indices
        //sum of elements at the odd indices
        System.out.println("sum is: "+ sum);
        int sum2= 0 ,sum3=0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%2==0)
                sum2 += arr2[i];
            else
            sum3 += arr2[i];
        }
        System.out.println("Even nuber sum:-  " + sum2 + " Odd number sum:-  " + sum3);
        //Print minimum and maximum numbers in the array
        int max = arr2[0];
        int min = arr2[0];
        int minind = 0; // minind = minimum index
        int maxind = 0;// maxind = maximum index
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
                minind = i;
            }
            if (arr2[i] > max) {
                max = arr2[i]; 
                maxind = i;
        }
    }
    System.out.println("Minimum Number: " + min + " at index " + minind);
    System.out.println("Maximum Number: " + max + " at index " + maxind);
    
    }
}
