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
public class KeystoneUpdateGroupOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public KeystoneUpdateGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 用户组描述信息，长度小于等于255字节。name与description至少填写一个。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public KeystoneUpdateGroupOption withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 用户组所属账号ID，获取方式请参见：[获取账号ID](https://support.huaweicloud.com/api-iam/zh-cn_topic_0057845624.html)。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoneUpdateGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 用户组名，长度小于等于64字节。name与description至少填写一个。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneUpdateGroupOption keystoneUpdateGroupOption = (KeystoneUpdateGroupOption) o;
        return Objects.equals(this.description, keystoneUpdateGroupOption.description) &&
            Objects.equals(this.domainId, keystoneUpdateGroupOption.domainId) &&
            Objects.equals(this.name, keystoneUpdateGroupOption.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, domainId, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateGroupOption {\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

