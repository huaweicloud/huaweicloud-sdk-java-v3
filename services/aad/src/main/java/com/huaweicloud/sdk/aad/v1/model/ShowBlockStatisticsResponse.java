package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBlockStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_unblocking_times")

    private Integer totalUnblockingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manual_unblocking_times")

    private Integer manualUnblockingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automatic_unblocking_times")

    private Integer automaticUnblockingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_blocked_ip_numbers")

    private Integer currentBlockedIpNumbers;

    public ShowBlockStatisticsResponse withTotalUnblockingTimes(Integer totalUnblockingTimes) {
        this.totalUnblockingTimes = totalUnblockingTimes;
        return this;
    }

    /**
     * 总解封次数
     * minimum: 0
     * maximum: 2097152
     * @return totalUnblockingTimes
     */
    public Integer getTotalUnblockingTimes() {
        return totalUnblockingTimes;
    }

    public void setTotalUnblockingTimes(Integer totalUnblockingTimes) {
        this.totalUnblockingTimes = totalUnblockingTimes;
    }

    public ShowBlockStatisticsResponse withManualUnblockingTimes(Integer manualUnblockingTimes) {
        this.manualUnblockingTimes = manualUnblockingTimes;
        return this;
    }

    /**
     * 人工解封次数
     * minimum: 0
     * maximum: 2097152
     * @return manualUnblockingTimes
     */
    public Integer getManualUnblockingTimes() {
        return manualUnblockingTimes;
    }

    public void setManualUnblockingTimes(Integer manualUnblockingTimes) {
        this.manualUnblockingTimes = manualUnblockingTimes;
    }

    public ShowBlockStatisticsResponse withAutomaticUnblockingTimes(Integer automaticUnblockingTimes) {
        this.automaticUnblockingTimes = automaticUnblockingTimes;
        return this;
    }

    /**
     * 自动解封次数
     * minimum: 0
     * maximum: 2097152
     * @return automaticUnblockingTimes
     */
    public Integer getAutomaticUnblockingTimes() {
        return automaticUnblockingTimes;
    }

    public void setAutomaticUnblockingTimes(Integer automaticUnblockingTimes) {
        this.automaticUnblockingTimes = automaticUnblockingTimes;
    }

    public ShowBlockStatisticsResponse withCurrentBlockedIpNumbers(Integer currentBlockedIpNumbers) {
        this.currentBlockedIpNumbers = currentBlockedIpNumbers;
        return this;
    }

    /**
     * 当前封堵Ip数
     * minimum: 0
     * maximum: 2097152
     * @return currentBlockedIpNumbers
     */
    public Integer getCurrentBlockedIpNumbers() {
        return currentBlockedIpNumbers;
    }

    public void setCurrentBlockedIpNumbers(Integer currentBlockedIpNumbers) {
        this.currentBlockedIpNumbers = currentBlockedIpNumbers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBlockStatisticsResponse that = (ShowBlockStatisticsResponse) obj;
        return Objects.equals(this.totalUnblockingTimes, that.totalUnblockingTimes)
            && Objects.equals(this.manualUnblockingTimes, that.manualUnblockingTimes)
            && Objects.equals(this.automaticUnblockingTimes, that.automaticUnblockingTimes)
            && Objects.equals(this.currentBlockedIpNumbers, that.currentBlockedIpNumbers);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(totalUnblockingTimes, manualUnblockingTimes, automaticUnblockingTimes, currentBlockedIpNumbers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBlockStatisticsResponse {\n");
        sb.append("    totalUnblockingTimes: ").append(toIndentedString(totalUnblockingTimes)).append("\n");
        sb.append("    manualUnblockingTimes: ").append(toIndentedString(manualUnblockingTimes)).append("\n");
        sb.append("    automaticUnblockingTimes: ").append(toIndentedString(automaticUnblockingTimes)).append("\n");
        sb.append("    currentBlockedIpNumbers: ").append(toIndentedString(currentBlockedIpNumbers)).append("\n");
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
