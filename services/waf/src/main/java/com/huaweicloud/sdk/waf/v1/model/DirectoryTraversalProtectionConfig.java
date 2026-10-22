package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DirectoryTraversalProtectionConfig
 */
public class DirectoryTraversalProtectionConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private PolicyAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private Integer timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_requests")

    private Integer numRequests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_found_status_percentage")

    private Integer notFoundStatusPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_non_existent_directories")

    private Integer numNonExistentDirectories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_period")

    private Integer blockingPeriod;

    public DirectoryTraversalProtectionConfig withAction(PolicyAction action) {
        this.action = action;
        return this;
    }

    public DirectoryTraversalProtectionConfig withAction(Consumer<PolicyAction> actionSetter) {
        if (this.action == null) {
            this.action = new PolicyAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public PolicyAction getAction() {
        return action;
    }

    public void setAction(PolicyAction action) {
        this.action = action;
    }

    public DirectoryTraversalProtectionConfig withTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * 检测时间范围，单位秒
     * @return timeRange
     */
    public Integer getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
    }

    public DirectoryTraversalProtectionConfig withNumRequests(Integer numRequests) {
        this.numRequests = numRequests;
        return this;
    }

    /**
     * 请求数阈值，在检测时间内请求数超过该值则触发防护
     * @return numRequests
     */
    public Integer getNumRequests() {
        return numRequests;
    }

    public void setNumRequests(Integer numRequests) {
        this.numRequests = numRequests;
    }

    public DirectoryTraversalProtectionConfig withNotFoundStatusPercentage(Integer notFoundStatusPercentage) {
        this.notFoundStatusPercentage = notFoundStatusPercentage;
        return this;
    }

    /**
     * 404状态码占比阈值，单位为百分比
     * @return notFoundStatusPercentage
     */
    public Integer getNotFoundStatusPercentage() {
        return notFoundStatusPercentage;
    }

    public void setNotFoundStatusPercentage(Integer notFoundStatusPercentage) {
        this.notFoundStatusPercentage = notFoundStatusPercentage;
    }

    public DirectoryTraversalProtectionConfig withNumNonExistentDirectories(Integer numNonExistentDirectories) {
        this.numNonExistentDirectories = numNonExistentDirectories;
        return this;
    }

    /**
     * 不存在目录数阈值，在检测时间内探测到不存在目录的数量达到该值时触发防护
     * @return numNonExistentDirectories
     */
    public Integer getNumNonExistentDirectories() {
        return numNonExistentDirectories;
    }

    public void setNumNonExistentDirectories(Integer numNonExistentDirectories) {
        this.numNonExistentDirectories = numNonExistentDirectories;
    }

    public DirectoryTraversalProtectionConfig withBlockingPeriod(Integer blockingPeriod) {
        this.blockingPeriod = blockingPeriod;
        return this;
    }

    /**
     * 封禁周期，单位秒
     * @return blockingPeriod
     */
    public Integer getBlockingPeriod() {
        return blockingPeriod;
    }

    public void setBlockingPeriod(Integer blockingPeriod) {
        this.blockingPeriod = blockingPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectoryTraversalProtectionConfig that = (DirectoryTraversalProtectionConfig) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.timeRange, that.timeRange)
            && Objects.equals(this.numRequests, that.numRequests)
            && Objects.equals(this.notFoundStatusPercentage, that.notFoundStatusPercentage)
            && Objects.equals(this.numNonExistentDirectories, that.numNonExistentDirectories)
            && Objects.equals(this.blockingPeriod, that.blockingPeriod);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(action, timeRange, numRequests, notFoundStatusPercentage, numNonExistentDirectories, blockingPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectoryTraversalProtectionConfig {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    numRequests: ").append(toIndentedString(numRequests)).append("\n");
        sb.append("    notFoundStatusPercentage: ").append(toIndentedString(notFoundStatusPercentage)).append("\n");
        sb.append("    numNonExistentDirectories: ").append(toIndentedString(numNonExistentDirectories)).append("\n");
        sb.append("    blockingPeriod: ").append(toIndentedString(blockingPeriod)).append("\n");
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
