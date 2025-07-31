package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 动态内容对比会返回该字段，增量对比信息。
 */
public class QueryCompareJobProgressRespIncreInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Float delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_speed")

    private String srcSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rps")

    private Integer rps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_point")

    private String logPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recheck_entities")

    private Integer recheckEntities;

    public QueryCompareJobProgressRespIncreInfo withDelay(Float delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 增量对比时延，若时延为0表示所有增量数据都已对比完成。
     * minimum: 0
     * maximum: 1E+6
     * @return delay
     */
    public Float getDelay() {
        return delay;
    }

    public void setDelay(Float delay) {
        this.delay = delay;
    }

    public QueryCompareJobProgressRespIncreInfo withSrcSpeed(String srcSpeed) {
        this.srcSpeed = srcSpeed;
        return this;
    }

    /**
     * 增量数据对比速率。
     * @return srcSpeed
     */
    public String getSrcSpeed() {
        return srcSpeed;
    }

    public void setSrcSpeed(String srcSpeed) {
        this.srcSpeed = srcSpeed;
    }

    public QueryCompareJobProgressRespIncreInfo withRps(Integer rps) {
        this.rps = rps;
        return this;
    }

    /**
     * 每秒对比行数。
     * minimum: 0
     * maximum: 1000000000
     * @return rps
     */
    public Integer getRps() {
        return rps;
    }

    public void setRps(Integer rps) {
        this.rps = rps;
    }

    public QueryCompareJobProgressRespIncreInfo withLogPoint(String logPoint) {
        this.logPoint = logPoint;
        return this;
    }

    /**
     * 增量位点。
     * @return logPoint
     */
    public String getLogPoint() {
        return logPoint;
    }

    public void setLogPoint(String logPoint) {
        this.logPoint = logPoint;
    }

    public QueryCompareJobProgressRespIncreInfo withRecheckEntities(Integer recheckEntities) {
        this.recheckEntities = recheckEntities;
        return this;
    }

    /**
     * 差异待复查行数。
     * minimum: 0
     * maximum: 1000000000
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
        QueryCompareJobProgressRespIncreInfo that = (QueryCompareJobProgressRespIncreInfo) obj;
        return Objects.equals(this.delay, that.delay) && Objects.equals(this.srcSpeed, that.srcSpeed)
            && Objects.equals(this.rps, that.rps) && Objects.equals(this.logPoint, that.logPoint)
            && Objects.equals(this.recheckEntities, that.recheckEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delay, srcSpeed, rps, logPoint, recheckEntities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCompareJobProgressRespIncreInfo {\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    srcSpeed: ").append(toIndentedString(srcSpeed)).append("\n");
        sb.append("    rps: ").append(toIndentedString(rps)).append("\n");
        sb.append("    logPoint: ").append(toIndentedString(logPoint)).append("\n");
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
