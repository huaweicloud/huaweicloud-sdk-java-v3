package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlinkMetricResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    @JacksonXmlProperty(localName = "metrics")

    private ShowJobMonitorInfoRespPayload metrics;

    public ShowFlinkMetricResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 请求是否成功
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowFlinkMetricResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowFlinkMetricResponse withMetrics(ShowJobMonitorInfoRespPayload metrics) {
        this.metrics = metrics;
        return this;
    }

    public ShowFlinkMetricResponse withMetrics(Consumer<ShowJobMonitorInfoRespPayload> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ShowJobMonitorInfoRespPayload();
            metricsSetter.accept(this.metrics);
        }

        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public ShowJobMonitorInfoRespPayload getMetrics() {
        return metrics;
    }

    public void setMetrics(ShowJobMonitorInfoRespPayload metrics) {
        this.metrics = metrics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFlinkMetricResponse showFlinkMetricResponse = (ShowFlinkMetricResponse) o;
        return Objects.equals(this.isSuccess, showFlinkMetricResponse.isSuccess)
            && Objects.equals(this.message, showFlinkMetricResponse.message)
            && Objects.equals(this.metrics, showFlinkMetricResponse.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkMetricResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
