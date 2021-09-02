package com.utilities;

public class UI { // TODO: make different listing methods (bullet points, letters, numerals, etc.)

    public static void listerator(String... listElements){
        listerator(1, 0, listElements);
    }

    /**
     * <p></p>
     *
     * @param listType the kind of list to create (1 - number, 2 - letter, 3 - numeral, 4 - bullet)
     * @param subLevel level of indentation to apply to the list
     * @param listElements the information to listerate
     */
    public static void listerator(int listType, int subLevel, String... listElements){
        String subLevelIndent = "";
        for(int i = 0; i < subLevel; i++)
            subLevelIndent += "\t";

        switch(listType){
            case 1 -> { // number
                int listNum = 0;
                for(String option : listElements){
                    System.out.printf("%s%d. %s\n", subLevelIndent, ++listNum, option);
                }
            }
            case 2 -> { // letter TODO: maybe have array that will store chars, then iterate through it backwards to print list
                /*
                char[] charArr = new char[listElements.length];
                charArr[0] = 'a';
                String listValue = charArr[0];

                String getListValue(){
                    String newValue = "";
                    for(int i = 0; i < charArr.length; i++){
                        if(charArr[i] >= 'z' && (i + 1 != charArr.length)){
                            charArr[i] = 'a';
                            ++charArr[i + 1];
                        }
                        else
                            ++charArr[i];

                        newValue += charArr[i];
                    }

                    return newValue;
                }

                for(String option : listElements){
                    listValue = getListValue();
                    System.out.printf("%c. %s\n", listValue, option);
                }
                */
                char c = 'a';
                for(String option : listElements){
                    System.out.printf("%s%c. %s\n", subLevelIndent, ++c, option);
                }
            }
            case 3 -> { // numeral

            }
            case 4 -> { // bullet

            }

            default ->{
                throw new IllegalStateException("Invalid list type: " + listType);
            }
        }
    }
}
