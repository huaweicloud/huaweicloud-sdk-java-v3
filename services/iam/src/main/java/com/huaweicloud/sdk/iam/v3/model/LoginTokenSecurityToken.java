package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class LoginTokenSecurityToken  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access")
    
    private String access;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret")
    
    private String secret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration_seconds")
    
    private Integer durationSeconds;

    public LoginTokenSecurityToken withAccess(String access) {
        this.access = access;
        return this;
    }

    


    /**
     * AK。
     * @return access
     */
    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    

    public LoginTokenSecurityToken withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    


    /**
     * SK。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    

    public LoginTokenSecurityToken withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * securitytoken，即临时身份的安全token。    支持使用自定义代理用户或普通用户获取的securitytoken换取logintoken，详情请参见：[通过token获取临时访问密钥和securitytoken](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IAM&api=CreateTemporaryAccessKeyByToken)。    支持委托的方式，但获取securitytoken时，请求体中必须填写session_user.name参数，详情请参见：[通过委托获取临时访问密钥和securitytoken](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IAM&api=CreateTemporaryAccessKeyByAgency)。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public LoginTokenSecurityToken withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    


    /**
     * 自定义代理登录票据logintoken的有效时间，时间单位为秒。默认10分钟，取值范围10min~12h，且取值不能大于临时安全凭证securitytoken的过期时间。
     * minimum: 600
     * maximum: 43200
     * @return durationSeconds
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginTokenSecurityToken loginTokenSecurityToken = (LoginTokenSecurityToken) o;
        return Objects.equals(this.access, loginTokenSecurityToken.access) &&
            Objects.equals(this.secret, loginTokenSecurityToken.secret) &&
            Objects.equals(this.id, loginTokenSecurityToken.id) &&
            Objects.equals(this.durationSeconds, loginTokenSecurityToken.durationSeconds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(access, secret, id, durationSeconds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginTokenSecurityToken {\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
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

