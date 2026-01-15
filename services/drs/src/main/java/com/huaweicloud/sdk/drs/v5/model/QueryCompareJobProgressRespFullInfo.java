package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 行对比与内容对比会返回该字段，全量对比信息。
 */
public class QueryCompareJobProgressRespFullInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Float progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_speed")

    private String srcSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recheck_entities")

    private Integer recheckEntities;

    public QueryCompareJobProgressRespFullInfo withProgress(Float progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 增量数据对比进度，单位为%。
     * minimum: 0
     * maximum: 1E+2
     * @return progress
     */
    public Float getProgress() {
        return progress;
    }

    public void setProgress(Float progress) {
        this.progress = progress;
    }

    public QueryCompareJobProgressRespFullInfo withSrcSpeed(String srcSpeed) {
        this.srcSpeed = srcSpeed;
        return this;
    }

    /**
     * 全量数据对比速率。
     * @return srcSpeed
     */
    public String getSrcSpeed() {
        return srcSpeed;
    }

    public void setSrcSpeed(String srcSpeed) {
        this.srcSpeed = srcSpeed;
    }

    public QueryCompareJobProgressRespFullInfo withRecheckEntities(Integer recheckEntities) {
        this.recheckEntities = recheckEntities;
        return this;
    }

    /**
     * 差异待复查行数。
     * minimum: 0
     * @return recheckEntities
     */
    public Integer getRecheckEntities() {
        return recheckEntities;
    }

    public void setRecheckEntities(Integer recheckEntities) {
        this.recheckEntities = recheckEntities;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryCompareJobProgressRespFullInfo that = (QueryCompareJobProgressRespFullInfo) obj;
        return Objects.equals(this.progress, that.progress) && Objects.equals(this.srcSpeed, that.srcSpeed)
            && Objects.equals(this.recheckEntities, that.recheckEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress, srcSpeed, recheckEntities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCompareJobProgressRespFullInfo {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    srcSpeed: ").append(toIndentedString(srcSpeed)).append("\n");
        sb.append("    recheckEntities: ").append(toIndentedString(recheckEntities)).append("\n");
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
