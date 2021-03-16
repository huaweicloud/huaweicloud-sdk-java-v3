package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 工作项操作的用户
 */
public class IssueRecordV4User  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_num_id")
    
    private Integer userNumId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nick_name")
    
    private String nickName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;

    public IssueRecordV4User withUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
        return this;
    }

    


    /**
     * 用户数字id
     * @return userNumId
     */
    public Integer getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
    }

    

    public IssueRecordV4User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 登录名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public IssueRecordV4User withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    


    /**
     * 昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    

    public IssueRecordV4User withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户32位的uuid
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueRecordV4User issueRecordV4User = (IssueRecordV4User) o;
        return Objects.equals(this.userNumId, issueRecordV4User.userNumId) &&
            Objects.equals(this.userName, issueRecordV4User.userName) &&
            Objects.equals(this.nickName, issueRecordV4User.nickName) &&
            Objects.equals(this.userId, issueRecordV4User.userId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userNumId, userName, nickName, userId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueRecordV4User {\n");
        sb.append("    userNumId: ").append(toIndentedString(userNumId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

