public class printWave {
    public static int[] Printwav(int arr[][],int nRows,int mCols ){
        int waveArray[]=new int[nRows*mCols];
        int index=0;

        for(int col=0;col<mCols;col++){
            if(col%2==0){
                for(int row=0;row<nRows;row++){
                    waveArray[index++]=arr[row][col];
                }
            }
            else{
                for(int row=nRows-1;row>=0;row--){
                    waveArray[index++]=arr[row][col];
                }
            }
        }
        return waveArray;
        
    }
    public static void main(String[] args) {
        int arr[][]={{1,2},
                    {3,4}};
                    int nRows=2;
                    int mCols=2;
                    int [] wavePattern=Printwav(arr, nRows, mCols);

                    for(int i=0;i<wavePattern.length;i++){
                        System.out.print(wavePattern[i]+" ");
                    }

    }
}
