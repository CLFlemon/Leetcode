public class Test {
    private void StringOverrideEquals(){
////
//////        String s1 = "aaa";
//////        String s2 = "aaa";
//////        String s3 = new String("aaa");
//////        System.out.println(s1 == s2);
//////        System.out.println(s1 == s3);
//////        System.out.println(s1.equals(s3));
////
//////        final int[] value={1,2,3};
//////        int[] another={4,5,6};
//////        value=another;
////        final int[] value={1,2,3};
////        value[2]=100;  //这时候数组里已经是{1,2,100}
        String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "a";
        String e = new String("b");
        String f = d + e;

        System.out.println(a.intern() == b);
        System.out.println(a.intern() == b.intern());
        System.out.println(a.intern() == c);
        System.out.println(a.intern() == f);
    }



        public static void main(String[] args) throws InterruptedException {
            StringBuffer StringBuffer = new StringBuffer();
            for (int i = 0; i < 10; i++){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int j = 0; j < 1000; j++){
                            StringBuffer.append("a");
                        }
                    }
                }).start();
            }

            Thread.sleep(100);
            System.out.println(StringBuffer.length());
        }

    }


