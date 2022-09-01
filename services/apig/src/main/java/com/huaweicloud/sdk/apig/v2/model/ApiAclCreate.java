package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ApiAclCreate
 */
public class ApiAclCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_name")

    @JacksonXmlProperty(localName = "acl_name")

    private String aclName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_type")

    @JacksonXmlProperty(localName = "acl_type")

    private String aclType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_value")

    @JacksonXmlProperty(localName = "acl_value")

    private String aclValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_type")

    @JacksonXmlProperty(localName = "entity_type")

    private String entityType;

    public ApiAclCreate withAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }

    /**
     * ACL策略名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3 ~ 64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return aclName
     */
    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    public ApiAclCreate withAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }

    /**
     * 类型 -  PERMIT (白名单类型) -  DENY (黑名单类型)
     * @return aclType
     */
    public String getAclType() {
        return aclType;
    }

    public void setAclType(String aclType) {
        this.aclType = aclType;
    }

    public ApiAclCreate withAclValue(String aclValue) {
        this.aclValue = aclValue;
        return this;
    }

    /**
     * ACL策略值，支持一个或多个值，使用英文半角逗号分隔
     * @return aclValue
     */
    public String getAclValue() {
        return aclValue;
    }

    public void setAclValue(String aclValue) {
        this.aclValue = aclValue;
    }

    public ApiAclCreate withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * 对象类型： - IP - DOMAIN
     * @return entityType
     */
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiAclCreate apiAclCreate = (ApiAclCreate) o;
        return Objects.equals(this.aclName, apiAclCreate.aclName) && Objects.equals(this.aclType, apiAclCreate.aclType)
            && Objects.equals(this.aclValue, apiAclCreate.aclValue)
            && Objects.equals(this.entityType, apiAclCreate.entityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aclName, aclType, aclValue, entityType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiAclCreate {\n");
        sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
        sb.append("    aclType: ").append(toIndentedString(aclType)).append("\n");
        sb.append("    aclValue: ").append(toIndentedString(aclValue)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
