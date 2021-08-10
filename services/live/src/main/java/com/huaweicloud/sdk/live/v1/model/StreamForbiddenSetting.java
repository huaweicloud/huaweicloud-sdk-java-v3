package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/** StreamForbiddenSetting */
public class StreamForbiddenSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_time")

    private OffsetDateTime resumeTime;

    public StreamForbiddenSetting withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 直播播放域名或推流域名
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public StreamForbiddenSetting withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /** 流应用名称
     * 
     * @return appName */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public StreamForbiddenSetting withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /** 流名称
     * 
     * @return streamName */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public StreamForbiddenSetting withResumeTime(OffsetDateTime resumeTime) {
        this.resumeTime = resumeTime;
        return this;
    }

    /** 恢复流时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间，不指定则默认7天，最大禁推为90天
     * 
     * @return resumeTime */
    public OffsetDateTime getResumeTime() {
        return resumeTime;
    }

    public void setResumeTime(OffsetDateTime resumeTime) {
        this.resumeTime = resumeTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StreamForbiddenSetting streamForbiddenSetting = (StreamForbiddenSetting) o;
        return Objects.equals(this.domain, streamForbiddenSetting.domain)
            && Objects.equals(this.appName, streamForbiddenSetting.appName)
            && Objects.equals(this.streamName, streamForbiddenSetting.streamName)
            && Objects.equals(this.resumeTime, streamForbiddenSetting.resumeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, streamName, resumeTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamForbiddenSetting {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    resumeTime: ").append(toIndentedString(resumeTime)).append("\n");
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
