package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBugsPerDeveloperResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dividend_value")

    private String dividendValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "divisor_value")

    private String divisorValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_value")

    private String metricValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    public ShowBugsPerDeveloperResponse withDividendValue(String dividendValue) {
        this.dividendValue = dividendValue;
        return this;
    }

    /**
     * 指标分子数值
     * @return dividendValue
     */
    public String getDividendValue() {
        return dividendValue;
    }

    public void setDividendValue(String dividendValue) {
        this.dividendValue = dividendValue;
    }

    public ShowBugsPerDeveloperResponse withDivisorValue(String divisorValue) {
        this.divisorValue = divisorValue;
        return this;
    }

    /**
     * 指标分母数值
     * @return divisorValue
     */
    public String getDivisorValue() {
        return divisorValue;
    }

    public void setDivisorValue(String divisorValue) {
        this.divisorValue = divisorValue;
    }

    public ShowBugsPerDeveloperResponse withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowBugsPerDeveloperResponse withMetricValue(String metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * 指标数值
     * @return metricValue
     */
    public String getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    public ShowBugsPerDeveloperResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowBugsPerDeveloperResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBugsPerDeveloperResponse that = (ShowBugsPerDeveloperResponse) obj;
        return Objects.equals(this.dividendValue, that.dividendValue)
            && Objects.equals(this.divisorValue, that.divisorValue) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.metricValue, that.metricValue) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dividendValue, divisorValue, metricName, metricValue, projectId, projectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBugsPerDeveloperResponse {\n");
        sb.append("    dividendValue: ").append(toIndentedString(dividendValue)).append("\n");
        sb.append("    divisorValue: ").append(toIndentedString(divisorValue)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
