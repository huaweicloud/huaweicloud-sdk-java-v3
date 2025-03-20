package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 委托或信任委托。
 */
public class Agency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_policy")

    private String trustPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_session_duration")

    private Integer maxSessionDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_id")

    private String trustDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain_name")

    private String trustDomainName;

    public Agency withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 统一资源名称。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public Agency withTrustPolicy(String trustPolicy) {
        this.trustPolicy = trustPolicy;
        return this;
    }

    /**
     * 信任委托信任策略的策略文档的json格式。下面的字符`= < > ( ) |`是语法中的特殊字符，不包含在信任策略中。  问号`?`表示元素是可选的。例如`sid_block?`。  竖线`|`表示可选项，括号定义了可选项的范围。例如`(\"Allow\" | \"Deny\")`。  当一个元素允许多个值时，使用重复值、`,`以及`...`表示。例如`[ <policy_statement>, <policy_statement>, ... ]`。  下面的递归文法描述了信任策略的语法： ``` policy = {   <version_block>,   <statement_block> }  <version_block> = \"Version\" : (\"5.0\")  <statement_block> = \"Statement\" : [ <policy_statement>, <policy_statement>, ... ]  <policy_statement> = {   <sid_block?>,   <principal_block>,   <effect_block>,   <action_block>,   <resource_block?>,   <condition_block?> }  <sid_block> = \"Sid\" : <sid_string>  <principal_block> = (\"Principal\" | \"NotPrincipal\") : <principal_map>  <principal_map> = { <principal_map_entry>, <principal_map_entry>, ... }  <principal_map_entry> = (\"IAM\" | \"Service\") : [ <principal_id_string>, <principal_id_string>, ... ]  <effect_block> = \"Effect\" : (\"Allow\" | \"Deny\")  <action_block> = (\"Action\" | \"NotAction\") : [ <action_string>, <action_string>, ... ]  <resource_block> = (\"Resource\" | \"NotResource\") : [ <resource_string>, <resource_string>, ... ]  <condition_block> = \"Condition\" : { <condition_map> }  <condition_map> = {   <condition_type_string> : { <condition_key_string> : <condition_value_list> },   <condition_type_string> : { <condition_key_string> : <condition_value_list> },   ... }  <condition_value_list> = ( <condition_value> | [ <condition_value>, <condition_value>, ... ] )  <condition_value> = \"string\" ``` 
     * @return trustPolicy
     */
    public String getTrustPolicy() {
        return trustPolicy;
    }

    public void setTrustPolicy(String trustPolicy) {
        this.trustPolicy = trustPolicy;
    }

    public Agency withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 委托或信任委托创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Agency withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 委托或信任委托描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Agency withMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
    }

    /**
     * 委托或信任委托最大会话时长，默认为3600秒。
     * minimum: 3600
     * maximum: 43200
     * @return maxSessionDuration
     */
    public Integer getMaxSessionDuration() {
        return maxSessionDuration;
    }

    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    public Agency withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 资源路径，默认为空串。由若干段字符串拼接而成，每段先包含一个或多个字母、数字、\".\"、\",\"、\"+\"、\"@\"、\"=\"、\"_\"或\"-\"，并以\"/\"结尾，例如\"foo/bar/\"。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Agency withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 委托或信任委托ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public Agency withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托或信任委托名称，长度为1到64个字符，只包含字母、数字、\"_\"、\"+\"、\"=\"、\",\"、\".\"、\"@\"和\"-\"的字符串。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Agency withTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
        return this;
    }

    /**
     * 被委托方账号ID，仅存在于委托中，不存在于信任委托中。
     * @return trustDomainId
     */
    public String getTrustDomainId() {
        return trustDomainId;
    }

    public void setTrustDomainId(String trustDomainId) {
        this.trustDomainId = trustDomainId;
    }

    public Agency withTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
        return this;
    }

    /**
     * 被委托方账号名，仅存在于委托中，不存在于信任委托中。
     * @return trustDomainName
     */
    public String getTrustDomainName() {
        return trustDomainName;
    }

    public void setTrustDomainName(String trustDomainName) {
        this.trustDomainName = trustDomainName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Agency that = (Agency) obj;
        return Objects.equals(this.urn, that.urn) && Objects.equals(this.trustPolicy, that.trustPolicy)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.description, that.description)
            && Objects.equals(this.maxSessionDuration, that.maxSessionDuration) && Objects.equals(this.path, that.path)
            && Objects.equals(this.agencyId, that.agencyId) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.trustDomainId, that.trustDomainId)
            && Objects.equals(this.trustDomainName, that.trustDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urn,
            trustPolicy,
            createdAt,
            description,
            maxSessionDuration,
            path,
            agencyId,
            agencyName,
            trustDomainId,
            trustDomainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Agency {\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    trustPolicy: ").append(toIndentedString(trustPolicy)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maxSessionDuration: ").append(toIndentedString(maxSessionDuration)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    trustDomainId: ").append(toIndentedString(trustDomainId)).append("\n");
        sb.append("    trustDomainName: ").append(toIndentedString(trustDomainName)).append("\n");
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
