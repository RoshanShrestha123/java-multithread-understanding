public class MultiThread extends Thread {
    private int _threadNumber;
    public MultiThread(int _idx) {
        _threadNumber =  _idx;
    }
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.print("<<Thread running " +_threadNumber + " >>");
            System.out.println(":" + i);

            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
