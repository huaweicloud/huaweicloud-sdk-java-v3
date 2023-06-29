package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRelationColumnRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets_name")

    private String assetsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_start")

    private Integer riskStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_end")

    private Integer riskEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListRelationColumnRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListRelationColumnRequest withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表ID
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public ListRelationColumnRequest withAssetsName(String assetsName) {
        this.assetsName = assetsName;
        return this;
    }

    /**
     * 资产名称
     * @return assetsName
     */
    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    public ListRelationColumnRequest withRiskStart(Integer riskStart) {
        this.riskStart = riskStart;
        return this;
    }

    /**
     * 起始风险等级
     * @return riskStart
     */
    public Integer getRiskStart() {
        return riskStart;
    }

    public void setRiskStart(Integer riskStart) {
        this.riskStart = riskStart;
    }

    public ListRelationColumnRequest withRiskEnd(Integer riskEnd) {
        this.riskEnd = riskEnd;
        return this;
    }

    /**
     * 终止风险等级
     * @return riskEnd
     */
    public Integer getRiskEnd() {
        return riskEnd;
    }

    public void setRiskEnd(Integer riskEnd) {
        this.riskEnd = riskEnd;
    }

    public ListRelationColumnRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRelationColumnRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRelationColumnRequest that = (ListRelationColumnRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.tableId, that.tableId)
            && Objects.equals(this.assetsName, that.assetsName) && Objects.equals(this.riskStart, that.riskStart)
            && Objects.equals(this.riskEnd, that.riskEnd) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, tableId, assetsName, riskStart, riskEnd, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelationColumnRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    assetsName: ").append(toIndentedString(assetsName)).append("\n");
        sb.append("    riskStart: ").append(toIndentedString(riskStart)).append("\n");
        sb.append("    riskEnd: ").append(toIndentedString(riskEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
