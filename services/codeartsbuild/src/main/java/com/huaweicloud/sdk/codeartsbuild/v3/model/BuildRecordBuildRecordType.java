package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 构建记录类型
 */
public class BuildRecordBuildRecordType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rerun")

    private Boolean rerun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_type")

    private String recordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_rerun")

    private Boolean isRerun;

    public BuildRecordBuildRecordType withRerun(Boolean rerun) {
        this.rerun = rerun;
        return this;
    }

    /**
     * 是否rerun
     * @return rerun
     */
    public Boolean getRerun() {
        return rerun;
    }

    public void setRerun(Boolean rerun) {
        this.rerun = rerun;
    }

    public BuildRecordBuildRecordType withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发类型
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public BuildRecordBuildRecordType withRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * 记录类型
     * @return recordType
     */
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public BuildRecordBuildRecordType withIsRerun(Boolean isRerun) {
        this.isRerun = isRerun;
        return this;
    }

    /**
     * 是否返回
     * @return isRerun
     */
    public Boolean getIsRerun() {
        return isRerun;
    }

    public void setIsRerun(Boolean isRerun) {
        this.isRerun = isRerun;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildRecordBuildRecordType that = (BuildRecordBuildRecordType) obj;
        return Objects.equals(this.rerun, that.rerun) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.recordType, that.recordType) && Objects.equals(this.isRerun, that.isRerun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rerun, triggerType, recordType, isRerun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildRecordBuildRecordType {\n");
        sb.append("    rerun: ").append(toIndentedString(rerun)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    isRerun: ").append(toIndentedString(isRerun)).append("\n");
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
