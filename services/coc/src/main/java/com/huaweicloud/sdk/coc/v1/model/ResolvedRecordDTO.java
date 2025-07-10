package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 清除汇聚告警的记录
 */
public class ResolvedRecordDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_time")

    private Long resolvedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_name")

    private String createName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    public ResolvedRecordDTO withResolvedTime(Long resolvedTime) {
        this.resolvedTime = resolvedTime;
        return this;
    }

    /**
     * 清除汇聚告警的时间
     * @return resolvedTime
     */
    public Long getResolvedTime() {
        return resolvedTime;
    }

    public void setResolvedTime(Long resolvedTime) {
        this.resolvedTime = resolvedTime;
    }

    public ResolvedRecordDTO withCreateName(String createName) {
        this.createName = createName;
        return this;
    }

    /**
     * 执行人
     * @return createName
     */
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public ResolvedRecordDTO withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 清除时填写的备注
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResolvedRecordDTO that = (ResolvedRecordDTO) obj;
        return Objects.equals(this.resolvedTime, that.resolvedTime) && Objects.equals(this.createName, that.createName)
            && Objects.equals(this.remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolvedTime, createName, remarks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolvedRecordDTO {\n");
        sb.append("    resolvedTime: ").append(toIndentedString(resolvedTime)).append("\n");
        sb.append("    createName: ").append(toIndentedString(createName)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
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
