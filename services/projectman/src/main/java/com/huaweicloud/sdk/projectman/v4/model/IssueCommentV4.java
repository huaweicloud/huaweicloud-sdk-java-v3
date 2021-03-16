package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.CommentUserV4;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * IssueCommentV4
 */
public class IssueCommentV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comment")
    
    private String comment;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private CommentUserV4 user;

    public IssueCommentV4 withComment(String comment) {
        this.comment = comment;
        return this;
    }

    


    /**
     * 评论内容
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    

    public IssueCommentV4 withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 评论id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public IssueCommentV4 withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 评论时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    

    public IssueCommentV4 withUser(CommentUserV4 user) {
        this.user = user;
        return this;
    }

    public IssueCommentV4 withUser(Consumer<CommentUserV4> userSetter) {
        if(this.user == null ){
            this.user = new CommentUserV4();
            userSetter.accept(this.user);
        }
        
        return this;
    }


    /**
     * Get user
     * @return user
     */
    public CommentUserV4 getUser() {
        return user;
    }

    public void setUser(CommentUserV4 user) {
        this.user = user;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueCommentV4 issueCommentV4 = (IssueCommentV4) o;
        return Objects.equals(this.comment, issueCommentV4.comment) &&
            Objects.equals(this.id, issueCommentV4.id) &&
            Objects.equals(this.createdTime, issueCommentV4.createdTime) &&
            Objects.equals(this.user, issueCommentV4.user);
    }
    @Override
    public int hashCode() {
        return Objects.hash(comment, id, createdTime, user);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueCommentV4 {\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

