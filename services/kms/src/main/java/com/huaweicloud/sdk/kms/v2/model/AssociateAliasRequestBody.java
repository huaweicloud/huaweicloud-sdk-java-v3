package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联别名请求消息体
 */
public class AssociateAliasRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_key_id")

    private String targetKeyId;

    public AssociateAliasRequestBody withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 待关联别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public AssociateAliasRequestBody withTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
        return this;
    }

    /**
     * 待关联的密钥ID
     * @return targetKeyId
     */
    public String getTargetKeyId() {
        return targetKeyId;
    }

    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateAliasRequestBody that = (AssociateAliasRequestBody) obj;
        return Objects.equals(this.alias, that.alias) && Objects.equals(this.targetKeyId, that.targetKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, targetKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateAliasRequestBody {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    targetKeyId: ").append(toIndentedString(targetKeyId)).append("\n");
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
