package my.timulys.mynote.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auditing Class
 * 
 * @author timulys
 *
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {
	private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private Long id;
	@CreatedDate
	private LocalDateTime createDateTime;
	@LastModifiedDate
	private LocalDateTime modifiedDatetime;
	
	public String getFormattedCreateDateTime() {
		return getFormattedDateTime(createDateTime, DATE_FORMAT);
	}
	
	public String getFormattedModifiedDateTime() {
		return getFormattedDateTime(modifiedDatetime, DATE_FORMAT);
	}
	
	private String getFormattedDateTime(LocalDateTime dateTime, String format) {
		if (dateTime == null) {
			return null;
		}
		return dateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
	}
}
