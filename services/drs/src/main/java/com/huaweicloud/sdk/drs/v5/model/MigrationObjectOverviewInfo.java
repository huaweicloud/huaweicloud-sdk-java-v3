package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 迁移详情概览。
 */
public class MigrationObjectOverviewInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_count")

    private String srcCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_count")

    private String dstCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public MigrationObjectOverviewInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MigrationObjectOverviewInfo withSrcCount(String srcCount) {
        this.srcCount = srcCount;
        return this;
    }

    /**
     * 待迁移数量。
     * @return srcCount
     */
    public String getSrcCount() {
        return srcCount;
    }

    public void setSrcCount(String srcCount) {
        this.srcCount = srcCount;
    }

    public MigrationObjectOverviewInfo withDstCount(String dstCount) {
        this.dstCount = dstCount;
        return this;
    }

    /**
     * 已迁移数量。
     * @return dstCount
     */
    public String getDstCount() {
        return dstCount;
    }

    public void setDstCount(String dstCount) {
        this.dstCount = dstCount;
    }

    public MigrationObjectOverviewInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MigrationObjectOverviewInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public MigrationObjectOverviewInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationObjectOverviewInfo migrationObjectOverviewInfo = (MigrationObjectOverviewInfo) o;
        return Objects.equals(this.type, migrationObjectOverviewInfo.type)
            && Objects.equals(this.srcCount, migrationObjectOverviewInfo.srcCount)
            && Objects.equals(this.dstCount, migrationObjectOverviewInfo.dstCount)
            && Objects.equals(this.status, migrationObjectOverviewInfo.status)
            && Objects.equals(this.startTime, migrationObjectOverviewInfo.startTime)
            && Objects.equals(this.endTime, migrationObjectOverviewInfo.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, srcCount, dstCount, status, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationObjectOverviewInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    srcCount: ").append(toIndentedString(srcCount)).append("\n");
        sb.append("    dstCount: ").append(toIndentedString(dstCount)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
