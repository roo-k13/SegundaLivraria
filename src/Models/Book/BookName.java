package Models.Book;

public class BookName {
    private String title;
    private String subtitle;

    BookName(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        if (subtitle != null) {
            sb.append(": ").append(subtitle);
        }
        return sb.toString();
    }
}