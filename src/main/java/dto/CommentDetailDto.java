package dto;

public class CommentDetailDto {
    private String commentText;
    private String commentDate;

    public CommentDetailDto() {
    }

    public CommentDetailDto(String commentText, String commentDate) {
        this.commentText = commentText;
        this.commentDate = commentDate;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "CommentDetailDto{" +
                "commentText='" + commentText + '\'' +
                ", commentDate='" + commentDate + '\'' +
                '}';
    }
}
