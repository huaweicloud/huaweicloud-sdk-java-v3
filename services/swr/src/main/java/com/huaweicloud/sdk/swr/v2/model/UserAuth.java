package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UserAuth
 */
public class UserAuth  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth")
    
    private Integer auth;

    public UserAuth withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户id，需要从IAM服务获取
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserAuth withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 用户名，需要从IAM服务获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserAuth withAuth(Integer auth) {
        this.auth = auth;
        return this;
    }

    


    /**
     * 用户权限，7表示管理权限，3表示编辑权限，1表示读取权限
     * @return auth
     */
    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAuth userAuth = (UserAuth) o;
        return Objects.equals(this.userId, userAuth.userId) &&
            Objects.equals(this.userName, userAuth.userName) &&
            Objects.equals(this.auth, userAuth.auth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, auth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAuth {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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

