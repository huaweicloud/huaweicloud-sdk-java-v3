package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 允许/禁止删除数据策略
 */
public class DataPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_policy")

    private PolicyType deletePolicy;

    public DataPolicyReq withDeletePolicy(PolicyType deletePolicy) {
        this.deletePolicy = deletePolicy;
        return this;
    }

    /**
     * Get deletePolicy
     * @return deletePolicy
     */
    public PolicyType getDeletePolicy() {
        return deletePolicy;
    }

    public void setDeletePolicy(PolicyType deletePolicy) {
        this.deletePolicy = deletePolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataPolicyReq that = (DataPolicyReq) obj;
        return Objects.equals(this.deletePolicy, that.deletePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deletePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataPolicyReq {\n");
        sb.append("    deletePolicy: ").append(toIndentedString(deletePolicy)).append("\n");
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
