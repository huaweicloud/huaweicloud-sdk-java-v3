package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryRepairDetailRespRepairDetails
 */
public class QueryRepairDetailRespRepairDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_meta")

    private String sourceMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_meta")

    private String targetMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_sql_state")

    private Integer repairSqlState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_sql_info")

    private String repairSqlInfo;

    public QueryRepairDetailRespRepairDetails withSourceMeta(String sourceMeta) {
        this.sourceMeta = sourceMeta;
        return this;
    }

    /**
     * 源表标志列值。
     * @return sourceMeta
     */
    public String getSourceMeta() {
        return sourceMeta;
    }

    public void setSourceMeta(String sourceMeta) {
        this.sourceMeta = sourceMeta;
    }

    public QueryRepairDetailRespRepairDetails withTargetMeta(String targetMeta) {
        this.targetMeta = targetMeta;
        return this;
    }

    /**
     * 目标表标志列值。
     * @return targetMeta
     */
    public String getTargetMeta() {
        return targetMeta;
    }

    public void setTargetMeta(String targetMeta) {
        this.targetMeta = targetMeta;
    }

    public QueryRepairDetailRespRepairDetails withRepairSqlState(Integer repairSqlState) {
        this.repairSqlState = repairSqlState;
        return this;
    }

    /**
     * 修复SQL状态。
     * @return repairSqlState
     */
    public Integer getRepairSqlState() {
        return repairSqlState;
    }

    public void setRepairSqlState(Integer repairSqlState) {
        this.repairSqlState = repairSqlState;
    }

    public QueryRepairDetailRespRepairDetails withRepairSqlInfo(String repairSqlInfo) {
        this.repairSqlInfo = repairSqlInfo;
        return this;
    }

    /**
     * 修复SQL。
     * @return repairSqlInfo
     */
    public String getRepairSqlInfo() {
        return repairSqlInfo;
    }

    public void setRepairSqlInfo(String repairSqlInfo) {
        this.repairSqlInfo = repairSqlInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryRepairDetailRespRepairDetails that = (QueryRepairDetailRespRepairDetails) obj;
        return Objects.equals(this.sourceMeta, that.sourceMeta) && Objects.equals(this.targetMeta, that.targetMeta)
            && Objects.equals(this.repairSqlState, that.repairSqlState)
            && Objects.equals(this.repairSqlInfo, that.repairSqlInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceMeta, targetMeta, repairSqlState, repairSqlInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryRepairDetailRespRepairDetails {\n");
        sb.append("    sourceMeta: ").append(toIndentedString(sourceMeta)).append("\n");
        sb.append("    targetMeta: ").append(toIndentedString(targetMeta)).append("\n");
        sb.append("    repairSqlState: ").append(toIndentedString(repairSqlState)).append("\n");
        sb.append("    repairSqlInfo: ").append(toIndentedString(repairSqlInfo)).append("\n");
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
