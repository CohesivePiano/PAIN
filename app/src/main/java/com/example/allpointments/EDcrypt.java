package com.example.allpointments;




public class EDcrypt {

    public void Decrypt(String[][] array,String file){

        int totalChar = file.length();
        int currentIndex = 0;
        int currentUser = 0;


        for(int i = 0; i < totalChar;i++)
        {
            if(file.charAt(i) != 'À')
            {
                int decryptASCII = (file.charAt(i) /(20/3));
                array[currentUser][currentIndex] += decryptASCII;
            }
            else
            {
                currentIndex ++;
            }
            if(currentIndex == 17)
            {
                currentUser++;
            }


        }
    };

    public String Encrypt(String[][] array)
    {
        String writeToFile = "";

        for(int i = 0; i<array.length;i++) {
            int letterCount = 0;
            for (int j = 0; j< 18; j++) {
                for(int k = 0; k < array[i][j].length();k++)
                {
                    int encryptChar = (array[i][j].charAt(k) *(20/3));
                    writeToFile += encryptChar;

                }
            }
        }
        return writeToFile;
    }


}
