public class StopWatch {
    private long start;
    private long end;
    private long now;

    private long startTime() {
        this.start = System.currentTimeMillis();
        return this.start;
    }

    private long endTime() {
        this.end = System.currentTimeMillis();
        return this.end;
    }

    public long getElapsedTime() {
        this.now = this.end - this.start;
        return this.now;
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100000);
        }
        StopWatch myWatch = new StopWatch();
        myWatch.startTime();
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        myWatch.endTime();
        double watch = myWatch.getElapsedTime();
        System.out.println("Thời gian trôi qua sau khi thực hiện: " + watch);


    }


}
