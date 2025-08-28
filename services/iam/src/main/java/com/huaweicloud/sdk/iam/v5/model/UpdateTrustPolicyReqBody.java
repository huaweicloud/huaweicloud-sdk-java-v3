package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of update trust policy request.
 */
public class UpdateTrustPolicyReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_policy")

    private String trustPolicy;

    public UpdateTrustPolicyReqBody withTrustPolicy(String trustPolicy) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrustPolicyReqBody that = (UpdateTrustPolicyReqBody) obj;
        return Objects.equals(this.trustPolicy, that.trustPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrustPolicyReqBody {\n");
        sb.append("    trustPolicy: ").append(toIndentedString(trustPolicy)).append("\n");
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
