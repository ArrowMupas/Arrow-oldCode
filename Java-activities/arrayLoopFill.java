class ArrayLoopFill {
    public static void main(String[] args) {
        int[][] temp = new int[3][5];
        int c = 1;
        for(int a=0; a<temp.length; a++){
            for(int b=0; b<temp[0].length; b++){
                temp [a][b] = c;
                c++;
                }}
                System.out.println(temp[1][2]);
    }
}