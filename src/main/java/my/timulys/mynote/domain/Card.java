package my.timulys.mynote.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Card 클래스
 * To-do list들이 기입되는 공간
 * 하루의 Todo Card
 * 
 * @author timulys
 *
 */
@Entity
public class Card extends AbstractEntity {
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_note_writer"))
	@JsonProperty
	private User writer;
	
	@OneToMany(mappedBy = "card")
	@OrderBy("id DESC")
	private List<Todo> todoList;
	
	@JsonProperty
	private Integer countOfTodo = 0;

	public Card() {	}

	public Card(User writer, List<Todo> todoList) {
		this.writer = writer;
		this.todoList = todoList;
		this.countOfTodo = todoList.size();
	}
	
	public void update(List<Todo> todoList) {
		this.todoList = todoList;
		this.countOfTodo = todoList.size();
	}
}
