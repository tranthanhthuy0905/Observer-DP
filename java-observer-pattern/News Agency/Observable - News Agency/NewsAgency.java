
public class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    /* Add new observer to subscription list */
    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    /* Remove an existing observer from subscription list */
    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    /* When news gets updated, state of NewsAgency changes and it starts to
    notify obersers by calling update() method to send notification */
    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}