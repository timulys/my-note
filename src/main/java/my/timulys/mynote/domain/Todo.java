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

	public Todo() {
		super();
	}
	
	
}
