package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StreamForbiddenOnceSetting
 */
public class StreamForbiddenOnceSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    public StreamForbiddenOnceSetting withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 直播推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public StreamForbiddenOnceSetting withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public StreamForbiddenOnceSetting withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 流名称
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamForbiddenOnceSetting that = (StreamForbiddenOnceSetting) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.streamName, that.streamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, streamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamForbiddenOnceSetting {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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
