package lr3;

public class Test8 {
    public static void main(String[] args) {

        int n = 10;
        char[] charArray = new char[n];
        char[] omitArray = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'A';
        int i = 0;
        int j = 0;

        for(i = 0; i < n; i++)
        {
            Boolean statement = true;
            for(j = 0; j < omitArray.length; j++)
            {
                if(b == omitArray[j])
                {
                    i--;
                    statement = false;
                    break;
                }
            }
            if(statement)
            {
                charArray[i] = b;
            }
            b++;
        }
        for(int k = 0; k < n; k++){
            System.out.print(charArray[k] + "\t");
        }
    }
}
/*
 Напишите программу, в которой создается символьный массив из
10 элементов. Массив заполнить большими (прописными) буквами
английского алфавита. Буквы берутся подряд, но только согласные (то есть
гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
нужно пропустить). Отобразите содержимое созданного массива в консольном
окне.
*/
