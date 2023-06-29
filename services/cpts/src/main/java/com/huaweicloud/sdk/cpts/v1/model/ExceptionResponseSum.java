package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExceptionResponseSum
 */
public class ExceptionResponseSum {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_assert")

    private Integer failedAssert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_others")

    private Integer failedOthers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_parsed")

    private Integer failedParsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_refused")

    private Integer failedRefused;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_timeout")

    private Integer failedTimeout;

    public ExceptionResponseSum withFailedAssert(Integer failedAssert) {
        this.failedAssert = failedAssert;
        return this;
    }

    /**
     * 断言失败数
     * @return failedAssert
     */
    public Integer getFailedAssert() {
        return failedAssert;
    }

    public void setFailedAssert(Integer failedAssert) {
        this.failedAssert = failedAssert;
    }

    public ExceptionResponseSum withFailedOthers(Integer failedOthers) {
        this.failedOthers = failedOthers;
        return this;
    }

    /**
     * 其他错误失败数
     * @return failedOthers
     */
    public Integer getFailedOthers() {
        return failedOthers;
    }

    public void setFailedOthers(Integer failedOthers) {
        this.failedOthers = failedOthers;
    }

    public ExceptionResponseSum withFailedParsed(Integer failedParsed) {
        this.failedParsed = failedParsed;
        return this;
    }

    /**
     * 解析失败数
     * @return failedParsed
     */
    public Integer getFailedParsed() {
        return failedParsed;
    }

    public void setFailedParsed(Integer failedParsed) {
        this.failedParsed = failedParsed;
    }

    public ExceptionResponseSum withFailedRefused(Integer failedRefused) {
        this.failedRefused = failedRefused;
        return this;
    }

    /**
     * 连接被拒绝失败数
     * @return failedRefused
     */
    public Integer getFailedRefused() {
        return failedRefused;
    }

    public void setFailedRefused(Integer failedRefused) {
        this.failedRefused = failedRefused;
    }

    public ExceptionResponseSum withFailedTimeout(Integer failedTimeout) {
        this.failedTimeout = failedTimeout;
        return this;
    }

    /**
     * 响应超时失败数
     * @return failedTimeout
     */
    public Integer getFailedTimeout() {
        return failedTimeout;
    }

    public void setFailedTimeout(Integer failedTimeout) {
        this.failedTimeout = failedTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExceptionResponseSum that = (ExceptionResponseSum) obj;
        return Objects.equals(this.failedAssert, that.failedAssert)
            && Objects.equals(this.failedOthers, that.failedOthers)
            && Objects.equals(this.failedParsed, that.failedParsed)
            && Objects.equals(this.failedRefused, that.failedRefused)
            && Objects.equals(this.failedTimeout, that.failedTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedAssert, failedOthers, failedParsed, failedRefused, failedTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExceptionResponseSum {\n");
        sb.append("    failedAssert: ").append(toIndentedString(failedAssert)).append("\n");
        sb.append("    failedOthers: ").append(toIndentedString(failedOthers)).append("\n");
        sb.append("    failedParsed: ").append(toIndentedString(failedParsed)).append("\n");
        sb.append("    failedRefused: ").append(toIndentedString(failedRefused)).append("\n");
        sb.append("    failedTimeout: ").append(toIndentedString(failedTimeout)).append("\n");
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
