package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListTranscodeTaskCountRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ListTranscodeTaskCountRequest withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /** 推流域名
     * 
     * @return publishDomain */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public ListTranscodeTaskCountRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /** 应用名称，若查询结果为空，表示该应用下没有转码任务。
     * 
     * @return app */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListTranscodeTaskCountRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 查询起始时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度7天，最大查询周期90天。 若参数为空，默认查询7天数据。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListTranscodeTaskCountRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 查询结束时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度7天，最大查询周期90天。 结束时间需大于起始时间。 若参数为空，默认为当前时间。
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTranscodeTaskCountRequest listTranscodeTaskCountRequest = (ListTranscodeTaskCountRequest) o;
        return Objects.equals(this.publishDomain, listTranscodeTaskCountRequest.publishDomain)
            && Objects.equals(this.app, listTranscodeTaskCountRequest.app)
            && Objects.equals(this.startTime, listTranscodeTaskCountRequest.startTime)
            && Objects.equals(this.endTime, listTranscodeTaskCountRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, app, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodeTaskCountRequest {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
