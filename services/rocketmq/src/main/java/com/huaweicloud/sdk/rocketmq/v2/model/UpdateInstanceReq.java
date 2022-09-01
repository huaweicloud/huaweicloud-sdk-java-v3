package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateInstanceReq
 */
public class UpdateInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    @JacksonXmlProperty(localName = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_policy")

    @JacksonXmlProperty(localName = "retention_policy")

    private Boolean retentionPolicy;

    public UpdateInstanceReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。  由英文字符开头，只能由英文字母、数字、中划线组成，长度为4~64的字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateInstanceReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例的描述信息。  长度不超过1024的字符串。  > \\与\"在json报文中属于特殊字符，如果参数值中需要显示\\或者\"字符，请在字符前增加转义字符\\，比如\\\\或者\\\"。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateInstanceReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public UpdateInstanceReq withRetentionPolicy(Boolean retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * ACL访问控制。
     * @return retentionPolicy
     */
    public Boolean getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(Boolean retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceReq updateInstanceReq = (UpdateInstanceReq) o;
        return Objects.equals(this.name, updateInstanceReq.name)
            && Objects.equals(this.description, updateInstanceReq.description)
            && Objects.equals(this.securityGroupId, updateInstanceReq.securityGroupId)
            && Objects.equals(this.retentionPolicy, updateInstanceReq.retentionPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, securityGroupId, retentionPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
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
