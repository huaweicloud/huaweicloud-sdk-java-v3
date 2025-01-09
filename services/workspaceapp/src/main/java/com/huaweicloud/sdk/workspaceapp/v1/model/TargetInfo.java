package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TargetInfo
 */
public class TargetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private ScheduleTaskTargetTypeEnum targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_name")

    private String targetName;

    public TargetInfo withTargetType(ScheduleTaskTargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get targetType
     * @return targetType
     */
    public ScheduleTaskTargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(ScheduleTaskTargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    public TargetInfo withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 对象id。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public TargetInfo withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * 对象名称。
     * @return targetName
     */
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetInfo that = (TargetInfo) obj;
        return Objects.equals(this.targetType, that.targetType) && Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.targetName, that.targetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetType, targetId, targetName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetInfo {\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
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
