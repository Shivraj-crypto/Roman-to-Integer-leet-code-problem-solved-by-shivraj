class Solution {
    public int romanToInt(String s) {

        String finalPokemon = s;

        int value = 0;
        int value2 = 0;
        char[] roman = {'I','V','X','L','C','D','M'};
        int[] valueToGive = {1,5,10,50,100,500,1000};
        String[] romanException = {"IV","IX","XL","XC","CD","CM"};
        int[] valuesToException = {4,9,40,90,400,900};

        try{
            for(int i = 0; i< 6; i++){
                if (s.contains(romanException[i])){
                    value = value + valuesToException[i];
                    finalPokemon = finalPokemon.replace(romanException[i],"");

                }else{}
            }
        }catch(Exception ex){}

        for(int i =0; i< finalPokemon.length(); i++){
            for(int j=0; j<7; j++){
                if(finalPokemon.charAt(i) == roman[j]){
                    value2 = value2 + valueToGive[j];
                }
            }

        }

        return(value + value2 );

    }

}