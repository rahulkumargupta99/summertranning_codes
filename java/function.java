 class function {

        public static float addArray(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return (float) sum/array.length;
        }
        public static void main(String[] args) {
            int array [] = {1, 2, 1};
            float sum = addArray(array);
            System.out.println(sum);
        }
    }
    

