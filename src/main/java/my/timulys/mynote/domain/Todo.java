package my.timulys.mynote.domain;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * To-do Class
 * 
 * @author timulys
 *
 */
@Entity
public class Todo extends AbstractEntity {
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_todo_card"))
	private Card card;
	
	@Lob
	@JsonProperty
	private String contents;

	public Todo() { }

	public Todo(Card card, String contents) {
		this.card = card;
		this.contents = contents;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
