package capg.SpringBoot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {
@Id
	  private long id;
	  private String content;

	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }

	  public String getContent() {
	    return content;
	  }

	  public void setContent(String content) {
	    this.content = content;
	  }

	}