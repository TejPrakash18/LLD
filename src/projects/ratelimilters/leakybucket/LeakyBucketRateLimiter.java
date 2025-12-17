package projects.ratelimilters.leakybucket;

public class LeakyBucketRateLimiter implements RateLimiter {

    private final long capacity;
    private final long leakRate;

    private long currentSize;
    private long lastLeak;
    public LeakyBucketRateLimiter(long capacity, long leakRate) {
        this.capacity = capacity;
        this.leakRate = leakRate;
        this.currentSize = 0;
        this.lastLeak = System.currentTimeMillis();
    }

    @Override
    public synchronized boolean tryAcquire() {
        leak();

        if(currentSize < capacity) {
            currentSize++;
            return true;
        }
        return false;
    }

    private void leak() {
        long now = System.currentTimeMillis();
        long elapsed = now - lastLeak;

        long leakedRequest = elapsed*leakRate/1000;
        if(leakedRequest > 0) {
            currentSize = Math.max(0, currentSize - leakedRequest);
            lastLeak = now;
        }

    }
}
