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
public class ListRtcHistoryScaleRequest {

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

    public ListRtcHistoryScaleRequest withAuthorization(String authorization) {
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

    public ListRtcHistoryScaleRequest withXSdkDate(String xSdkDate) {
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

    public ListRtcHistoryScaleRequest withXProjectId(String xProjectId) {
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

    public ListRtcHistoryScaleRequest withApp(String app) {
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

    public ListRtcHistoryScaleRequest withMetric(List<String> metric) {
        this.metric = metric;
        return this;
    }

    public ListRtcHistoryScaleRequest addMetricItem(String metricItem) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        this.metric.add(metricItem);
        return this;
    }

    public ListRtcHistoryScaleRequest withMetric(Consumer<List<String>> metricSetter) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        metricSetter.accept(this.metric);
        return this;
    }

    /**
     * 查询的数据类型 - UserCount：通话人数，不同频道中的相同用户ID计为多人; - SessionCount：通话人次，用户每次加入频道计为一个通话人次; - RoomCount：房间数，从有用户加入房间到所有用户离开房间计为一个通话房间; - MaxOnlineUserCount：最大同时在线人数; - MaxOnlineRoomCount：最大同时在线房间数; - CommunicationDuration：音视频通话总时长; - VideoCommunicationDuration：视频通话总时长; - AudioCommunicationDuration：音频通话总时长; 
     * @return metric
     */
    public List<String> getMetric() {
        return metric;
    }

    public void setMetric(List<String> metric) {
        this.metric = metric;
    }

    public ListRtcHistoryScaleRequest withStartDate(String startDate) {
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

    public ListRtcHistoryScaleRequest withEndDate(String endDate) {
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
        ListRtcHistoryScaleRequest listRtcHistoryScaleRequest = (ListRtcHistoryScaleRequest) o;
        return Objects.equals(this.authorization, listRtcHistoryScaleRequest.authorization)
            && Objects.equals(this.xSdkDate, listRtcHistoryScaleRequest.xSdkDate)
            && Objects.equals(this.xProjectId, listRtcHistoryScaleRequest.xProjectId)
            && Objects.equals(this.app, listRtcHistoryScaleRequest.app)
            && Objects.equals(this.metric, listRtcHistoryScaleRequest.metric)
            && Objects.equals(this.startDate, listRtcHistoryScaleRequest.startDate)
            && Objects.equals(this.endDate, listRtcHistoryScaleRequest.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, xProjectId, app, metric, startDate, endDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcHistoryScaleRequest {\n");
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
