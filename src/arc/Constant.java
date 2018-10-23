package arc;

/**
 * Created by shakir on 22/10/18.
 */
public class Constant {
    /**
     * T1, for recent cache entries.
     * T2, for frequent entries, referenced at least twice.
     * B1, recently evicted from the T1 cache, but are still tracked.
     * B2, similar evicted entries, but evicted from T2.

     */
    public enum QueueType {
        T1, B1, T2, B2
    }
}
