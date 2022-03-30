package engim.classe.springesempio.model;

public class Saluto {
    private final long id;
    private final String content;

    public Saluto(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
