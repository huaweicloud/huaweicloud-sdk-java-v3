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
     * 已用录制存储空间(单位G)
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
     * 已用的企业并发数
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
     * 已用的直播推流资源
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
     * 会议总次数
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
     * 会议总时长
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
     * 活跃用户数
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
     * 总与会人数
     * @return totalAttendeeCount
     */
    public Integer getTotalAttendeeCount() {
        return totalAttendeeCount;
    }

    public void setTotalAttendeeCount(Integer totalAttendeeCount) {
        this.totalAttendeeCount = totalAttendeeCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOrgResResponse showOrgResResponse = (ShowOrgResResponse) o;
        return Objects.equals(this.usedRecStorage, showOrgResResponse.usedRecStorage)
            && Objects.equals(this.usedAccountsCount, showOrgResResponse.usedAccountsCount)
            && Objects.equals(this.usedLiveCount, showOrgResResponse.usedLiveCount)
            && Objects.equals(this.confCount, showOrgResResponse.confCount)
            && Objects.equals(this.confLength, showOrgResResponse.confLength)
            && Objects.equals(this.activeAttendeeCount, showOrgResResponse.activeAttendeeCount)
            && Objects.equals(this.totalAttendeeCount, showOrgResResponse.totalAttendeeCount);
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
