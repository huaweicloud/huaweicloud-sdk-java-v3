package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VulUrgentResponseInfoDisabledOperateTypes
 */
public class VulUrgentResponseInfoDisabledOperateTypes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public VulUrgentResponseInfoDisabledOperateTypes withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * **参数解释**: 操作类型 **取值范围**: - ignore: 忽略 - not_ignore: 取消忽略 - immediate_repair: 修复 - manual_repair: 人工修复 - verify: 验证 - add_to_whitelist: 加入白名单 
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public VulUrgentResponseInfoDisabledOperateTypes withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**: 不可进行操作的原因 **取值范围**: 字符范围0-512位 
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulUrgentResponseInfoDisabledOperateTypes that = (VulUrgentResponseInfoDisabledOperateTypes) obj;
        return Objects.equals(this.operateType, that.operateType) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateType, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulUrgentResponseInfoDisabledOperateTypes {\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
