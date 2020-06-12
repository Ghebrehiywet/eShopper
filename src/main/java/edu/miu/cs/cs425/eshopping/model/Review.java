package edu.miu.cs.cs425.eshopping.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Getter
@Setter
@Entity
public class Review {
	/*public enum ReviewStatus {
		Created,
		approved,
	}*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long reviewId;

	@ManyToOne
	@JoinColumn(name="buyer_id")
	private Buyer buyer ;

	@ManyToOne
	@JoinColumn(name="product_id")
	 private Product product ;

	@NotBlank(message = "comment can't empty!")
	private String comment ;


	@Enumerated(EnumType.STRING)
	private ReviewStatus  reviewStatus = ReviewStatus.Created;

	@Column(name = "comment_time", columnDefinition = "TIMESTAMP")
	private LocalDateTime commentTime = LocalDateTime.now();


	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ReviewStatus getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(ReviewStatus reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public LocalDateTime getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(LocalDateTime commentTime) {
		this.commentTime = commentTime;
	}

	@Override
	public String toString() {
		return "Review{" +
				"reviewId=" + reviewId +
				", comment='" + comment + '\'' +
				'}';
	}
}
