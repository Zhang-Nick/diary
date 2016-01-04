package nick.model;

import java.util.Date;

import org.springframework.stereotype.Repository;

public class Comment {
    private Integer commentId;

    private Integer commentDiaryId;

    private Integer commentUserId;

    private String commentContent;

    private Date commentTime;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentDiaryId() {
        return commentDiaryId;
    }

    public void setCommentDiaryId(Integer commentDiaryId) {
        this.commentDiaryId = commentDiaryId;
    }

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}