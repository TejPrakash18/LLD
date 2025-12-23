package projects.ratelimilters.leakybucket;

public class RateLimiterDemo {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter rateLimiter = new LeakyBucketRateLimiter(2,2);
        for (int i = 1; i <= 12; i++) {
            System.out.println("Request " + i + " allowed " + rateLimiter.tryAcquire());
            Thread.sleep(300);
        }
    }
}
