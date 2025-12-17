package projects.ratelimilters.leakybucket;

public interface RateLimiter {
    boolean tryAcquire();
}
