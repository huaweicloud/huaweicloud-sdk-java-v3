package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 生成对比任务结果文件请求体。
 */
public class ExportCompareResultReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private String compareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_job_id")

    private String compareJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public ExportCompareResultReq withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    /**
     * 对比任务类型： - contents： 内容对比。 - lines：行数对比。 - random：抽样对比。 - objects_comparison：对象对比。 - repair_data：数据修复。
     * @return compareType
     */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    public ExportCompareResultReq withCompareJobId(String compareJobId) {
        this.compareJobId = compareJobId;
        return this;
    }

    /**
     * 对比任务的ID，内容对比、抽样对比、行数对比场景必填。
     * @return compareJobId
     */
    public String getCompareJobId() {
        return compareJobId;
    }

    public void setCompareJobId(String compareJobId) {
        this.compareJobId = compareJobId;
    }

    public ExportCompareResultReq withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区，如GMT+08:00，用于生成当前时间标识，拼接到文件名称中。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportCompareResultReq that = (ExportCompareResultReq) obj;
        return Objects.equals(this.compareType, that.compareType)
            && Objects.equals(this.compareJobId, that.compareJobId) && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareType, compareJobId, timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCompareResultReq {\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    compareJobId: ").append(toIndentedString(compareJobId)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
