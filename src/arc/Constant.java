package arc;

/**
 * Created by shakir on 22/10/18.
 */
public class Constant {
    /**
     * T1, recent cache entries.
     * T2, ghost entries recently evicted from the T1 cache.
     * B1, frequent entries.
     * B2, ghost entries recently evicted from the T2 cache.
     */
    public enum QueueType {
        T1, B1, T2, B2
    }
}
