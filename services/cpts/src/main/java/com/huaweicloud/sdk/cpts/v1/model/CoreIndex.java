package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CoreIndex
 */
public class CoreIndex {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_request_count")

    private Integer errorRequestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rps")

    private Integer maxRps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_users")

    private Integer maxUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_count")

    private Integer requestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rps")

    private Float rps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_rate")

    private Integer successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_tps")

    private Float transTps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_time")

    private ResponseTimeInfo responseTime;

    public CoreIndex withErrorRequestCount(Integer errorRequestCount) {
        this.errorRequestCount = errorRequestCount;
        return this;
    }

    /**
     * 错误请求数
     * @return errorRequestCount
     */
    public Integer getErrorRequestCount() {
        return errorRequestCount;
    }

    public void setErrorRequestCount(Integer errorRequestCount) {
        this.errorRequestCount = errorRequestCount;
    }

    public CoreIndex withMaxRps(Integer maxRps) {
        this.maxRps = maxRps;
        return this;
    }

    /**
     * 最大RPS
     * @return maxRps
     */
    public Integer getMaxRps() {
        return maxRps;
    }

    public void setMaxRps(Integer maxRps) {
        this.maxRps = maxRps;
    }

    public CoreIndex withMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
        return this;
    }

    /**
     * 最大并发数
     * @return maxUsers
     */
    public Integer getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }

    public CoreIndex withRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
        return this;
    }

    /**
     * 请求总数
     * @return requestCount
     */
    public Integer getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    public CoreIndex withRps(Float rps) {
        this.rps = rps;
        return this;
    }

    /**
     * 平均RPS
     * @return rps
     */
    public Float getRps() {
        return rps;
    }

    public void setRps(Float rps) {
        this.rps = rps;
    }

    public CoreIndex withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 成功数
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public CoreIndex withSuccessRate(Integer successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率
     * @return successRate
     */
    public Integer getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Integer successRate) {
        this.successRate = successRate;
    }

    public CoreIndex withTransTps(Float transTps) {
        this.transTps = transTps;
        return this;
    }

    /**
     * 平均TPS
     * @return transTps
     */
    public Float getTransTps() {
        return transTps;
    }

    public void setTransTps(Float transTps) {
        this.transTps = transTps;
    }

    public CoreIndex withResponseTime(ResponseTimeInfo responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    public CoreIndex withResponseTime(Consumer<ResponseTimeInfo> responseTimeSetter) {
        if (this.responseTime == null) {
            this.responseTime = new ResponseTimeInfo();
            responseTimeSetter.accept(this.responseTime);
        }

        return this;
    }

    /**
     * Get responseTime
     * @return responseTime
     */
    public ResponseTimeInfo getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(ResponseTimeInfo responseTime) {
        this.responseTime = responseTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoreIndex coreIndex = (CoreIndex) o;
        return Objects.equals(this.errorRequestCount, coreIndex.errorRequestCount)
            && Objects.equals(this.maxRps, coreIndex.maxRps) && Objects.equals(this.maxUsers, coreIndex.maxUsers)
            && Objects.equals(this.requestCount, coreIndex.requestCount) && Objects.equals(this.rps, coreIndex.rps)
            && Objects.equals(this.successCount, coreIndex.successCount)
            && Objects.equals(this.successRate, coreIndex.successRate)
            && Objects.equals(this.transTps, coreIndex.transTps)
            && Objects.equals(this.responseTime, coreIndex.responseTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorRequestCount,
            maxRps,
            maxUsers,
            requestCount,
            rps,
            successCount,
            successRate,
            transTps,
            responseTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreIndex {\n");
        sb.append("    errorRequestCount: ").append(toIndentedString(errorRequestCount)).append("\n");
        sb.append("    maxRps: ").append(toIndentedString(maxRps)).append("\n");
        sb.append("    maxUsers: ").append(toIndentedString(maxUsers)).append("\n");
        sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
        sb.append("    rps: ").append(toIndentedString(rps)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    transTps: ").append(toIndentedString(transTps)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
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
