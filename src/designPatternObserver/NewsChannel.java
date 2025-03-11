package designPatternObserver;

//konkreten Observer
public class NewsChannel implements Channel {

	//momentanen Zustand des beobachteten Objekts
	private String news;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	//methode für die Zustandsänderung
	@Override
	public void update(String news) {
		this.news = news;
	}
	
}
