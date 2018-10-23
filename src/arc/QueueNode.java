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
    Page data;

    QueueNode() {
        this.key = Integer.MIN_VALUE;
        this.prev = this;
        this.next = this;
    }

    QueueNode(int key, Page data) {
        this.key = key;
        this.data = data;
    }

    public Page getData() {
        return data;
    }

    public void setData(Page data) {
        this.data = data;
    }

    public void addToLast(QueueNode head) {
        QueueNode tail = head.prev;
        head.prev = this;
        tail.next = this;
        next = head;
        prev = tail;
    }

    public void remove() {
        if (prev != null && next != null) {
            prev.next = next;
            next.prev = prev;
            prev = next = null;
            queueType = null;
        }
    }
}
