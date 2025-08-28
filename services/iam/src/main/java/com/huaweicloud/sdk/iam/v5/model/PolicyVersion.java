package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 身份策略版本信息。
 */
public class PolicyVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document")

    private String document;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public PolicyVersion withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * 自定义身份策略或系统预置身份策略的策略文档的json格式。下面的字符`= < > ( ) |`是语法中的特殊字符，不包含在身份策略中。  问号`?`表示元素是可选的。例如`sid_block?`。  竖线`|`表示可选项，括号定义了可选项的范围。例如`(\"Allow\" | \"Deny\")`。  当一个元素允许多个值时，使用重复值`,`以及`...`表示。例如`[ <policy_statement>, <policy_statement>, ... ]`。  下面的递归文法描述了身份策略的语法： ``` policy = {   <version_block>,   <statement_block> }  <version_block> = \"Version\" : (\"5.0\")  <statement_block> = \"Statement\" : [ <policy_statement>, <policy_statement>, ... ]  <policy_statement> = {   <sid_block?>,   <effect_block>,   <action_block>,   <resource_block?>,   <condition_block?> }  <sid_block> = \"Sid\" : <sid_string>  <effect_block> = \"Effect\" : (\"Allow\" | \"Deny\")  <action_block> = (\"Action\" | \"NotAction\") : [ <action_string>, <action_string>, ... ]  <resource_block> = (\"Resource\" | \"NotResource\") : [ <resource_string>, <resource_string>, ... ]  <condition_block> = \"Condition\" : { <condition_map> }  <condition_map> = {   <condition_type_string> : { <condition_key_string> : <condition_value_list> },   <condition_type_string> : { <condition_key_string> : <condition_value_list> },   ... }  <condition_value_list> = ( <condition_value> | [ <condition_value>, <condition_value>, ... ] )  <condition_value> = \"string\" ``` 
     * @return document
     */
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public PolicyVersion withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 身份策略版本号，以\"v\"开头后跟数字，例如\"v5\"。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public PolicyVersion withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否为默认版本。
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public PolicyVersion withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 身份策略版本创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyVersion that = (PolicyVersion) obj;
        return Objects.equals(this.document, that.document) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.isDefault, that.isDefault) && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(document, versionId, isDefault, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyVersion {\n");
        sb.append("    document: ").append(toIndentedString(document)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
