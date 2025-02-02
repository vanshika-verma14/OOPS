class large {
    public static void main(String[] args) {
        int[] arr = {6,4,5,2,1};
       int lar = arr[0];
       int seclar= Integer.MIN_VALUE;
for (int i = 1; i < arr.length; i++) {
    if(arr[i] > lar){
        seclar = lar;
        lar = arr[i];    
    }
    else if (arr[i] > seclar && arr[i] != lar) {
        seclar = arr[i];
    }
}
if(seclar ==Integer.MIN_VALUE )
System.out.println("Second largest element do not exist");
else
System.out.println("Second largest number is: " + seclar);
    }
}