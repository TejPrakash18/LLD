package projects.ratelimilters.leakybucket;

public class RateLimiterDemo {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter = new LeakyBucketRateLimiter(5,2);
        for (int i = 0; i < 10; i++) {
            System.out.println("Request " + i + " allowed " + rateLimiter.tryAcquire());
            Thread.sleep(300);
        }
    }
}
