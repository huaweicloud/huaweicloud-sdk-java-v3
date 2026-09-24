package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置内核故障的处理策略请求体。
 */
public class RdsDBFaultPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_policy")

    private String dbPolicy;

    public RdsDBFaultPolicyReq withDbPolicy(String dbPolicy) {
        this.dbPolicy = dbPolicy;
        return this;
    }

    /**
     * **参数解释**：  内核故障的处理策略。  **约束限制**：  不涉及。  **取值范围**：  - repairFirst：优先修复 - failoverFirst：优先切换  **默认取值**：  不涉及。
     * @return dbPolicy
     */
    public String getDbPolicy() {
        return dbPolicy;
    }

    public void setDbPolicy(String dbPolicy) {
        this.dbPolicy = dbPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdsDBFaultPolicyReq that = (RdsDBFaultPolicyReq) obj;
        return Objects.equals(this.dbPolicy, that.dbPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RdsDBFaultPolicyReq {\n");
        sb.append("    dbPolicy: ").append(toIndentedString(dbPolicy)).append("\n");
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
