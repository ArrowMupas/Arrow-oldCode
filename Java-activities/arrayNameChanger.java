class ArrayNameChanger {
    public static void main(String[] args) {
        char[] nameArray = {'J','a','v','a','A','p','p'};
        nameArray[0] = 'L';
        nameArray[nameArray.length-1] = 'S';
        
        for  (int i = 0; i<nameArray.length; i++){
            System.out.println(nameArray[i]);
        }
}}