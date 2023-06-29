package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOrgResResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedRecStorage")

    private Double usedRecStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedAccountsCount")

    private Integer usedAccountsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedLiveCount")

    private Integer usedLiveCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confCount")

    private Integer confCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confLength")

    private Long confLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activeAttendeeCount")

    private Integer activeAttendeeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalAttendeeCount")

    private Integer totalAttendeeCount;

    public ShowOrgResResponse withUsedRecStorage(Double usedRecStorage) {
        this.usedRecStorage = usedRecStorage;
        return this;
    }

    /**
     * 企业管理员查询所属企业的资源使用信息。
     * @return usedRecStorage
     */
    public Double getUsedRecStorage() {
        return usedRecStorage;
    }

    public void setUsedRecStorage(Double usedRecStorage) {
        this.usedRecStorage = usedRecStorage;
    }

    public ShowOrgResResponse withUsedAccountsCount(Integer usedAccountsCount) {
        this.usedAccountsCount = usedAccountsCount;
        return this;
    }

    /**
     * 当前已用的会议并发数量。
     * @return usedAccountsCount
     */
    public Integer getUsedAccountsCount() {
        return usedAccountsCount;
    }

    public void setUsedAccountsCount(Integer usedAccountsCount) {
        this.usedAccountsCount = usedAccountsCount;
    }

    public ShowOrgResResponse withUsedLiveCount(Integer usedLiveCount) {
        this.usedLiveCount = usedLiveCount;
        return this;
    }

    /**
     * 当前已用的直播推流资源。
     * @return usedLiveCount
     */
    public Integer getUsedLiveCount() {
        return usedLiveCount;
    }

    public void setUsedLiveCount(Integer usedLiveCount) {
        this.usedLiveCount = usedLiveCount;
    }

    public ShowOrgResResponse withConfCount(Integer confCount) {
        this.confCount = confCount;
        return this;
    }

    /**
     * 当前已用的直播推流资源。
     * @return confCount
     */
    public Integer getConfCount() {
        return confCount;
    }

    public void setConfCount(Integer confCount) {
        this.confCount = confCount;
    }

    public ShowOrgResResponse withConfLength(Long confLength) {
        this.confLength = confLength;
        return this;
    }

    /**
     * 当日会议总时长。
     * @return confLength
     */
    public Long getConfLength() {
        return confLength;
    }

    public void setConfLength(Long confLength) {
        this.confLength = confLength;
    }

    public ShowOrgResResponse withActiveAttendeeCount(Integer activeAttendeeCount) {
        this.activeAttendeeCount = activeAttendeeCount;
        return this;
    }

    /**
     * 当日活跃用户数。
     * @return activeAttendeeCount
     */
    public Integer getActiveAttendeeCount() {
        return activeAttendeeCount;
    }

    public void setActiveAttendeeCount(Integer activeAttendeeCount) {
        this.activeAttendeeCount = activeAttendeeCount;
    }

    public ShowOrgResResponse withTotalAttendeeCount(Integer totalAttendeeCount) {
        this.totalAttendeeCount = totalAttendeeCount;
        return this;
    }

    /**
     * 当日总与会人数。
     * @return totalAttendeeCount
     */
    public Integer getTotalAttendeeCount() {
        return totalAttendeeCount;
    }

    public void setTotalAttendeeCount(Integer totalAttendeeCount) {
        this.totalAttendeeCount = totalAttendeeCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOrgResResponse that = (ShowOrgResResponse) obj;
        return Objects.equals(this.usedRecStorage, that.usedRecStorage)
            && Objects.equals(this.usedAccountsCount, that.usedAccountsCount)
            && Objects.equals(this.usedLiveCount, that.usedLiveCount) && Objects.equals(this.confCount, that.confCount)
            && Objects.equals(this.confLength, that.confLength)
            && Objects.equals(this.activeAttendeeCount, that.activeAttendeeCount)
            && Objects.equals(this.totalAttendeeCount, that.totalAttendeeCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usedRecStorage,
            usedAccountsCount,
            usedLiveCount,
            confCount,
            confLength,
            activeAttendeeCount,
            totalAttendeeCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrgResResponse {\n");
        sb.append("    usedRecStorage: ").append(toIndentedString(usedRecStorage)).append("\n");
        sb.append("    usedAccountsCount: ").append(toIndentedString(usedAccountsCount)).append("\n");
        sb.append("    usedLiveCount: ").append(toIndentedString(usedLiveCount)).append("\n");
        sb.append("    confCount: ").append(toIndentedString(confCount)).append("\n");
        sb.append("    confLength: ").append(toIndentedString(confLength)).append("\n");
        sb.append("    activeAttendeeCount: ").append(toIndentedString(activeAttendeeCount)).append("\n");
        sb.append("    totalAttendeeCount: ").append(toIndentedString(totalAttendeeCount)).append("\n");
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
