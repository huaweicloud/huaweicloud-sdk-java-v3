package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListRtcHistoryQualityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    @JacksonXmlProperty(localName = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    @JacksonXmlProperty(localName = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    @JacksonXmlProperty(localName = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    @JacksonXmlProperty(localName = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    @JacksonXmlProperty(localName = "metric")

    private List<String> metric = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    @JacksonXmlProperty(localName = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    @JacksonXmlProperty(localName = "end_date")

    private String endDate;

    public ListRtcHistoryQualityRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。 
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ListRtcHistoryQualityRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。 
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ListRtcHistoryQualityRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带项目ID信息，与路径参数中的项目ID相同。 
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ListRtcHistoryQualityRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用标识 
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListRtcHistoryQualityRequest withMetric(List<String> metric) {
        this.metric = metric;
        return this;
    }

    public ListRtcHistoryQualityRequest addMetricItem(String metricItem) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        this.metric.add(metricItem);
        return this;
    }

    public ListRtcHistoryQualityRequest withMetric(Consumer<List<String>> metricSetter) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        metricSetter.accept(this.metric);
        return this;
    }

    /**
     * 查询的数据类型 - JoinSuccessRate：加入房间成功率 - JoinSuccess5SecsRate：5秒加入成功率 - VideoFreezeRate：视频卡顿率 - AudioFreezeRate：音频卡顿率 - FirstVideoRecvTime：首帧视频接收耗时 - FirstAudioRecvTime：首帧音频接收耗时 - PullStreamSuccessRate：拉流成功率 - PushStreamSuccessRate：推流成功率 - VideoUpstreamExcellentTransRate：客户端视频上行优质传输率 - AudioUpstreamExcellentTransRate：客户端音频上行优质传输率 - VideoExcellentTransRate：端到端视频优质传输率 - AudioExcellentTransRate：端到端音频优质传输率 - VideoTransDelay：端到端视频网络时，单位为毫秒，取当天所有用户网络延迟的中位数 - AudioTransDelay：端到端音频网络时延，单位为毫秒，取当天所有用户网络延迟的中位数 
     * @return metric
     */
    public List<String> getMetric() {
        return metric;
    }

    public void setMetric(List<String> metric) {
        this.metric = metric;
    }

    public ListRtcHistoryQualityRequest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 查询起始时间。UTC时间，格式：YYYY-MM-DD，如2020-04-23，不写默认读取过去1天数据数据。 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ListRtcHistoryQualityRequest withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 查询结束时间。UTC时间，格式：YYYY-MM-DD，如2020-04-23 
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRtcHistoryQualityRequest listRtcHistoryQualityRequest = (ListRtcHistoryQualityRequest) o;
        return Objects.equals(this.authorization, listRtcHistoryQualityRequest.authorization)
            && Objects.equals(this.xSdkDate, listRtcHistoryQualityRequest.xSdkDate)
            && Objects.equals(this.xProjectId, listRtcHistoryQualityRequest.xProjectId)
            && Objects.equals(this.app, listRtcHistoryQualityRequest.app)
            && Objects.equals(this.metric, listRtcHistoryQualityRequest.metric)
            && Objects.equals(this.startDate, listRtcHistoryQualityRequest.startDate)
            && Objects.equals(this.endDate, listRtcHistoryQualityRequest.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, xProjectId, app, metric, startDate, endDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcHistoryQualityRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
