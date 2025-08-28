package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of create agency request.
 */
public class CreateAgencyReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_policy")

    private String trustPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_session_duration")

    private Integer maxSessionDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateAgencyReqBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 信任委托名称，长度为1到64个字符，只包含字母、数字、\"_\"、\"+\"、\"=\"、\",\"、\".\"、\"@\"和\"-\"的字符串。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CreateAgencyReqBody withPath(String path) {
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

    public CreateAgencyReqBody withTrustPolicy(String trustPolicy) {
        this.trustPolicy = trustPolicy;
        return this;
    }

    /**
     * 信任委托信任策略的策略文档的json格式。下面的字符`= < > ( ) |`是语法中的特殊字符，不包含在信任策略中。  问号`?`表示元素是可选的。例如`sid_block?`。  竖线`|`表示可选项，括号定义了可选项的范围。例如`(\"Allow\" | \"Deny\")`。  当一个元素允许多个值时，使用重复值`,`以及`...`表示。例如`[ <policy_statement>, <policy_statement>, ... ]`。  下面的递归文法描述了信任策略的语法： ``` policy = {   <version_block>,   <statement_block> }  <version_block> = \"Version\" : (\"5.0\")  <statement_block> = \"Statement\" : [ <policy_statement>, <policy_statement>, ... ]  <policy_statement> = {   <sid_block?>,   <principal_block>,   <effect_block>,   <action_block>,   <resource_block?>,   <condition_block?> }  <sid_block> = \"Sid\" : <sid_string>  <principal_block> = (\"Principal\" | \"NotPrincipal\") : <principal_map>  <principal_map> = { <principal_map_entry>, <principal_map_entry>, ... }  <principal_map_entry> = (\"IAM\" | \"Service\") : [ <principal_id_string>, ... | <service_principal_string>, ... ]  <effect_block> = \"Effect\" : (\"Allow\" | \"Deny\")  <action_block> = (\"Action\" | \"NotAction\") : [ <action_string>, <action_string>, ... ]  <resource_block> = (\"Resource\" | \"NotResource\") : [ <resource_string>, <resource_string>, ... ]  <condition_block> = \"Condition\" : { <condition_map> }  <condition_map> = {   <condition_type_string> : { <condition_key_string> : <condition_value_list> },   <condition_type_string> : { <condition_key_string> : <condition_value_list> },   ... }  <condition_value_list> = ( <condition_value> | [ <condition_value>, <condition_value>, ... ] )  <condition_value> = \"string\" ``` 
     * @return trustPolicy
     */
    public String getTrustPolicy() {
        return trustPolicy;
    }

    public void setTrustPolicy(String trustPolicy) {
        this.trustPolicy = trustPolicy;
    }

    public CreateAgencyReqBody withMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
    }

    /**
     * 信任委托最大会话时长，默认为3600秒，取值范围为[3600,43200]。
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

    public CreateAgencyReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 信任委托描述信息，默认为空串，字符串最大长度为1000。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAgencyReqBody that = (CreateAgencyReqBody) obj;
        return Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.path, that.path)
            && Objects.equals(this.trustPolicy, that.trustPolicy)
            && Objects.equals(this.maxSessionDuration, that.maxSessionDuration)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyName, path, trustPolicy, maxSessionDuration, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyReqBody {\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    trustPolicy: ").append(toIndentedString(trustPolicy)).append("\n");
        sb.append("    maxSessionDuration: ").append(toIndentedString(maxSessionDuration)).append("\n");
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
