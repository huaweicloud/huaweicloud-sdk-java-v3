package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowJobBuildTimeResultChart
 */
public class ShowJobBuildTimeResultChart {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_build_number")

    private String dailyBuildNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_number")

    private Integer buildNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_time")

    private Integer buildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_result")

    private String buildResult;

    public ShowJobBuildTimeResultChart withDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
        return this;
    }

    /**
     * 构建每日编号
     * @return dailyBuildNumber
     */
    public String getDailyBuildNumber() {
        return dailyBuildNumber;
    }

    public void setDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
    }

    public ShowJobBuildTimeResultChart withBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
        return this;
    }

    /**
     * 构建编号
     * @return buildNumber
     */
    public Integer getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
    }

    public ShowJobBuildTimeResultChart withBuildTime(Integer buildTime) {
        this.buildTime = buildTime;
        return this;
    }

    /**
     * 步骤执行时长，单位s
     * @return buildTime
     */
    public Integer getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Integer buildTime) {
        this.buildTime = buildTime;
    }

    public ShowJobBuildTimeResultChart withBuildResult(String buildResult) {
        this.buildResult = buildResult;
        return this;
    }

    /**
     * 构建结果
     * @return buildResult
     */
    public String getBuildResult() {
        return buildResult;
    }

    public void setBuildResult(String buildResult) {
        this.buildResult = buildResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobBuildTimeResultChart that = (ShowJobBuildTimeResultChart) obj;
        return Objects.equals(this.dailyBuildNumber, that.dailyBuildNumber)
            && Objects.equals(this.buildNumber, that.buildNumber) && Objects.equals(this.buildTime, that.buildTime)
            && Objects.equals(this.buildResult, that.buildResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dailyBuildNumber, buildNumber, buildTime, buildResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobBuildTimeResultChart {\n");
        sb.append("    dailyBuildNumber: ").append(toIndentedString(dailyBuildNumber)).append("\n");
        sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
        sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
        sb.append("    buildResult: ").append(toIndentedString(buildResult)).append("\n");
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
