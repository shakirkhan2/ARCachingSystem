package database.models;

/**
 * Created by shakir on 22/10/18.
 */
public class Page {
    private int pageId;
    private int pageValue;

    public Page(int pageId, int pageValue) {
        this.pageId = pageId;
        this.pageValue = pageValue;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getPageValue() {
        return pageValue;
    }

    public void setPageValue(int pageValue) {
        this.pageValue = pageValue;
    }
}