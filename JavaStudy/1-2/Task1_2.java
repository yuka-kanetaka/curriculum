public class Task1_2 {

    public static void main(String[] args) {

        // ①「JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列 countryを作成しなさい。
        String[] country = new String[3];
        country[0] = "JAPAN";
        country[1] = "AMERICA";
        country[2] = "KOREA";
        // ② ①で作成した配列の要素数を出力してください。
        System.out.println(country.length);

        /* ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
         *   1番目（先頭）の要素に 「りんご」 を代入
         *   2番目の要素に 「もも」 を代入
         *   3番目の要素に 「ぶどう」 を代入
         */
         String[] strArray = {"りんご", "もも", "ぶどう"};

        // ④ ③で作成した配列の2番目の要素を出力しなさい。
        System.out.println(strArray[1]);

        /* ⑤下記の処理について、何をしているのかコメントを記入してください。
         *  [「10」「20」「30」「40」「50」を要素の値とする配列、intArrayを作成
         */
        int[] intArray = { 10, 20, 30, 40, 50 };


        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        // [⑤で作成した1と4の要素を出力]
        System.out.println(intArray[1] + intArray[4]);

    }
}