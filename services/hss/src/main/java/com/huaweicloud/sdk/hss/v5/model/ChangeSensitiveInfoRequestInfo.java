package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 操作的事件 
 */
public class ChangeSensitiveInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive_info_id")

    private String sensitiveInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    public ChangeSensitiveInfoRequestInfo withSensitiveInfoId(String sensitiveInfoId) {
        this.sensitiveInfoId = sensitiveInfoId;
        return this;
    }

    /**
     * **参数解释**: 敏感信息编号 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return sensitiveInfoId
     */
    public String getSensitiveInfoId() {
        return sensitiveInfoId;
    }

    public void setSensitiveInfoId(String sensitiveInfoId) {
        this.sensitiveInfoId = sensitiveInfoId;
    }

    public ChangeSensitiveInfoRequestInfo withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * **参数解释**: 操作敏感信息详情，处理方式 **约束限制**: 不涉及 **取值范围**: - ignore：忽略 - do_not_ignore：取消忽略  **默认取值**: do_not_ignore 
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeSensitiveInfoRequestInfo that = (ChangeSensitiveInfoRequestInfo) obj;
        return Objects.equals(this.sensitiveInfoId, that.sensitiveInfoId)
            && Objects.equals(this.operateType, that.operateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensitiveInfoId, operateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeSensitiveInfoRequestInfo {\n");
        sb.append("    sensitiveInfoId: ").append(toIndentedString(sensitiveInfoId)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
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
