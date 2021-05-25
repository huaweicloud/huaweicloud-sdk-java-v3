package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneListUsersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password_expires_at")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String passwordExpiresAt;

    public KeystoneListUsersRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * IAM用户所属账号ID，获取方式请参见：[获取账号ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public KeystoneListUsersRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * 是否启IAM用户，true为启用，false为停用，默认为true。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    

    public KeystoneListUsersRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * IAM用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public KeystoneListUsersRequest withPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
        return this;
    }

    


    /**
     * 密码过期时间，格式为：password_expires_at={operator}:{timestamp}。timestamp格式为：YYYY-MM-DDTHH:mm:ssZ。示例：    ``` password_expires_at=lt:2016-12-08T22:02:00Z ```   > - operator取值范围：lt，lte，gt，gte，eq，neq。   > - lt：过期时间小于timestamp。   > - lte：过期时间小于等于timestamp。   > - gt：过期时间大于timestamp。   > - gte：过期时间大于等于timestamp。   > - eq：过期时间等于timestamp。   > - neq：过期时间不等于timestamp。
     * @return passwordExpiresAt
     */
    public String getPasswordExpiresAt() {
        return passwordExpiresAt;
    }

    public void setPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListUsersRequest keystoneListUsersRequest = (KeystoneListUsersRequest) o;
        return Objects.equals(this.domainId, keystoneListUsersRequest.domainId) &&
            Objects.equals(this.enabled, keystoneListUsersRequest.enabled) &&
            Objects.equals(this.name, keystoneListUsersRequest.name) &&
            Objects.equals(this.passwordExpiresAt, keystoneListUsersRequest.passwordExpiresAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, enabled, name, passwordExpiresAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListUsersRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    passwordExpiresAt: ").append(toIndentedString("******")).append("\n");
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

