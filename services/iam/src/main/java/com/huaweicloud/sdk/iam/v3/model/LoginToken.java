package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LoginTokenAssumedBy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class LoginToken  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expires_at")
    
    private String expiresAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method")
    
    private String method;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_id")
    
    private String sessionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_name")
    
    private String sessionName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assumed_by")
    
    private LoginTokenAssumedBy assumedBy = null;

    public LoginToken withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public LoginToken withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    


    /**
     * logintoken的过期时间，默认10min。
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public LoginToken withMethod(String method) {
        this.method = method;
        return this;
    }

    


    /**
     * 认证方法。当认证用户为华为云用户时，该字段内容为“token”，当认证用户为自定义代理用户时，该字段内容为“federation_proxy”。
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LoginToken withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LoginToken withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LoginToken withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    


    /**
     * 会话ID。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public LoginToken withSessionName(String sessionName) {
        this.sessionName = sessionName;
        return this;
    }

    


    /**
     * 自定义代理用户名。 > - [通过委托获取临时访问密钥和securitytoken](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IAM&api=CreateTemporaryAccessKeyByAgency)且请求体中填写session_user.name参数时，会返回该字段。该字段的值即为session_user.name所填写的值。
     * @return sessionName
     */
    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public LoginToken withAssumedBy(LoginTokenAssumedBy assumedBy) {
        this.assumedBy = assumedBy;
        return this;
    }

    public LoginToken withAssumedBy(Consumer<LoginTokenAssumedBy> assumedBySetter) {
        if(this.assumedBy == null ){
            this.assumedBy = new LoginTokenAssumedBy();
            assumedBySetter.accept(this.assumedBy);
        }
        
        return this;
    }


    /**
     * Get assumedBy
     * @return assumedBy
     */
    public LoginTokenAssumedBy getAssumedBy() {
        return assumedBy;
    }

    public void setAssumedBy(LoginTokenAssumedBy assumedBy) {
        this.assumedBy = assumedBy;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginToken loginToken = (LoginToken) o;
        return Objects.equals(this.domainId, loginToken.domainId) &&
            Objects.equals(this.expiresAt, loginToken.expiresAt) &&
            Objects.equals(this.method, loginToken.method) &&
            Objects.equals(this.userId, loginToken.userId) &&
            Objects.equals(this.userName, loginToken.userName) &&
            Objects.equals(this.sessionId, loginToken.sessionId) &&
            Objects.equals(this.sessionName, loginToken.sessionName) &&
            Objects.equals(this.assumedBy, loginToken.assumedBy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, expiresAt, method, userId, userName, sessionId, sessionName, assumedBy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginToken {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
        sb.append("    assumedBy: ").append(toIndentedString(assumedBy)).append("\n");
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

