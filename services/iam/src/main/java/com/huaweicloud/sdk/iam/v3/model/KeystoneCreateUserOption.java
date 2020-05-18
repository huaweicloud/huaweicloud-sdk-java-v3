package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class KeystoneCreateUserOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public KeystoneCreateUserOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * IAM用户名，长度5~32之间，首位不能为数字，特殊字符只能包含下划线“_”、中划线“-”和空格。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeystoneCreateUserOption withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * IAM用户所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoneCreateUserOption withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * IAM用户密码。   - 系统默认密码最小长度为6位字符，在6-32位之间支持用户自定义密码长度。   - 至少包含以下四种字符中的两种： 大写字母、小写字母、数字和特殊字符。   - 不能包含手机号和邮箱。   - 必须满足账户设置中密码策略的要求。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public KeystoneCreateUserOption withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * 是否启用IAM用户。true为启用，false为停用，默认为true。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public KeystoneCreateUserOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * IAM用户描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateUserOption keystoneCreateUserOption = (KeystoneCreateUserOption) o;
        return Objects.equals(this.name, keystoneCreateUserOption.name) &&
            Objects.equals(this.domainId, keystoneCreateUserOption.domainId) &&
            Objects.equals(this.password, keystoneCreateUserOption.password) &&
            Objects.equals(this.enabled, keystoneCreateUserOption.enabled) &&
            Objects.equals(this.description, keystoneCreateUserOption.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, domainId, password, enabled, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateUserOption {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    password: ").append(toIndentedString(password)).append("\n");
            sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

