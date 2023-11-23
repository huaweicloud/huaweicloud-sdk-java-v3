package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpgradeReports
 */
public class UpgradeReports {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_instance_id")

    private String srcInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_database_version")

    private String srcDatabaseVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_instance_id")

    private String dstInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_database_version")

    private String dstDatabaseVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_private_ip_changed")

    private Boolean isPrivateIpChanged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_change_time")

    private String privateIpChangeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_collection_mode")

    private String statisticsCollectionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    public UpgradeReports withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 升级报告ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpgradeReports withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 升级开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public UpgradeReports withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 升级结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public UpgradeReports withSrcInstanceId(String srcInstanceId) {
        this.srcInstanceId = srcInstanceId;
        return this;
    }

    /**
     * 原实例ID。
     * @return srcInstanceId
     */
    public String getSrcInstanceId() {
        return srcInstanceId;
    }

    public void setSrcInstanceId(String srcInstanceId) {
        this.srcInstanceId = srcInstanceId;
    }

    public UpgradeReports withSrcDatabaseVersion(String srcDatabaseVersion) {
        this.srcDatabaseVersion = srcDatabaseVersion;
        return this;
    }

    /**
     * 原数据库版本。
     * @return srcDatabaseVersion
     */
    public String getSrcDatabaseVersion() {
        return srcDatabaseVersion;
    }

    public void setSrcDatabaseVersion(String srcDatabaseVersion) {
        this.srcDatabaseVersion = srcDatabaseVersion;
    }

    public UpgradeReports withDstInstanceId(String dstInstanceId) {
        this.dstInstanceId = dstInstanceId;
        return this;
    }

    /**
     * 目标实例ID。
     * @return dstInstanceId
     */
    public String getDstInstanceId() {
        return dstInstanceId;
    }

    public void setDstInstanceId(String dstInstanceId) {
        this.dstInstanceId = dstInstanceId;
    }

    public UpgradeReports withDstDatabaseVersion(String dstDatabaseVersion) {
        this.dstDatabaseVersion = dstDatabaseVersion;
        return this;
    }

    /**
     * 目标数据库版本。
     * @return dstDatabaseVersion
     */
    public String getDstDatabaseVersion() {
        return dstDatabaseVersion;
    }

    public void setDstDatabaseVersion(String dstDatabaseVersion) {
        this.dstDatabaseVersion = dstDatabaseVersion;
    }

    public UpgradeReports withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 升级结果。 success，表示成功。 failed，表示失败。 running， 表示升级中。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UpgradeReports withIsPrivateIpChanged(Boolean isPrivateIpChanged) {
        this.isPrivateIpChanged = isPrivateIpChanged;
        return this;
    }

    /**
     * 实例内网IP是否改变。 true，表示改变。 false，表示不改变。
     * @return isPrivateIpChanged
     */
    public Boolean getIsPrivateIpChanged() {
        return isPrivateIpChanged;
    }

    public void setIsPrivateIpChanged(Boolean isPrivateIpChanged) {
        this.isPrivateIpChanged = isPrivateIpChanged;
    }

    public UpgradeReports withPrivateIpChangeTime(String privateIpChangeTime) {
        this.privateIpChangeTime = privateIpChangeTime;
        return this;
    }

    /**
     * 实例内网IP修改时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return privateIpChangeTime
     */
    public String getPrivateIpChangeTime() {
        return privateIpChangeTime;
    }

    public void setPrivateIpChangeTime(String privateIpChangeTime) {
        this.privateIpChangeTime = privateIpChangeTime;
    }

    public UpgradeReports withStatisticsCollectionMode(String statisticsCollectionMode) {
        this.statisticsCollectionMode = statisticsCollectionMode;
        return this;
    }

    /**
     * 统计信息收集模式。 before_change_private_ip，修改实例内网IP前收集。 after_change_private_ip，修改实例内网IP后收集。
     * @return statisticsCollectionMode
     */
    public String getStatisticsCollectionMode() {
        return statisticsCollectionMode;
    }

    public void setStatisticsCollectionMode(String statisticsCollectionMode) {
        this.statisticsCollectionMode = statisticsCollectionMode;
    }

    public UpgradeReports withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 升级报告详情。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeReports that = (UpgradeReports) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.srcInstanceId, that.srcInstanceId)
            && Objects.equals(this.srcDatabaseVersion, that.srcDatabaseVersion)
            && Objects.equals(this.dstInstanceId, that.dstInstanceId)
            && Objects.equals(this.dstDatabaseVersion, that.dstDatabaseVersion)
            && Objects.equals(this.result, that.result)
            && Objects.equals(this.isPrivateIpChanged, that.isPrivateIpChanged)
            && Objects.equals(this.privateIpChangeTime, that.privateIpChangeTime)
            && Objects.equals(this.statisticsCollectionMode, that.statisticsCollectionMode)
            && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            startTime,
            endTime,
            srcInstanceId,
            srcDatabaseVersion,
            dstInstanceId,
            dstDatabaseVersion,
            result,
            isPrivateIpChanged,
            privateIpChangeTime,
            statisticsCollectionMode,
            detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeReports {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    srcInstanceId: ").append(toIndentedString(srcInstanceId)).append("\n");
        sb.append("    srcDatabaseVersion: ").append(toIndentedString(srcDatabaseVersion)).append("\n");
        sb.append("    dstInstanceId: ").append(toIndentedString(dstInstanceId)).append("\n");
        sb.append("    dstDatabaseVersion: ").append(toIndentedString(dstDatabaseVersion)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    isPrivateIpChanged: ").append(toIndentedString(isPrivateIpChanged)).append("\n");
        sb.append("    privateIpChangeTime: ").append(toIndentedString(privateIpChangeTime)).append("\n");
        sb.append("    statisticsCollectionMode: ").append(toIndentedString(statisticsCollectionMode)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
