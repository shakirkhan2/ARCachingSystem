package arc;
import arc.Constant;
import database.models.Page;

/**
 * Created by shakir on 23/10/18.
 */
public class QueueNode<Page> {
    int key;
    QueueNode prev;
    QueueNode next;
    Constant.QueueType queueType;
    Page page;

    QueueNode() {
        this.key = Integer.MIN_VALUE;
        this.prev = this;
        this.next = this;
    }

    QueueNode(int key, Page data) {
        this.key = key;
        this.page = data;
    }

    /**
     * Get page data
     *
     * @return page
     */
    public Page getPage() {
        return page;
    }

    /**
     * Set page data
     *
     * @param page page data
     * @return void
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * Add node to last (append left)
     *
     * @param head head of queue
     * @return void
     */
    public void addToLast(QueueNode head) {
        QueueNode tail = head.prev;
        head.prev = this;
        tail.next = this;
        next = head;
        prev = tail;
    }

    /**
     * Remove queue node
     *
     * @return void
     */
    public void remove() {
        if (prev != null && next != null) {
            prev.next = next;
            next.prev = prev;
            prev = next = null;
            queueType = null;
        }
    }
}
