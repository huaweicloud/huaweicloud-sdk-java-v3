package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 资源的基础元数据信息，记录创建与更新的时点及责任人。 **取值范围：** 不涉及。
 */
public class OpsBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private EvaluationOpsUserInfo createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private EvaluationOpsUserInfo updatedBy;

    public OpsBaseInfo withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释：** 资源的创建时间戳。 **取值范围：** 符合标准时间格式的字符串。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public OpsBaseInfo withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * **参数解释：** 资源的最后更新时间戳。 **取值范围：** 符合标准时间格式的字符串。
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public OpsBaseInfo withCreatedBy(EvaluationOpsUserInfo createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OpsBaseInfo withCreatedBy(Consumer<EvaluationOpsUserInfo> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new EvaluationOpsUserInfo();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public EvaluationOpsUserInfo getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(EvaluationOpsUserInfo createdBy) {
        this.createdBy = createdBy;
    }

    public OpsBaseInfo withUpdatedBy(EvaluationOpsUserInfo updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public OpsBaseInfo withUpdatedBy(Consumer<EvaluationOpsUserInfo> updatedBySetter) {
        if (this.updatedBy == null) {
            this.updatedBy = new EvaluationOpsUserInfo();
            updatedBySetter.accept(this.updatedBy);
        }

        return this;
    }

    /**
     * Get updatedBy
     * @return updatedBy
     */
    public EvaluationOpsUserInfo getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(EvaluationOpsUserInfo updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsBaseInfo that = (OpsBaseInfo) obj;
        return Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.updatedBy, that.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdTime, updatedTime, createdBy, updatedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsBaseInfo {\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
