package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAlarmConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blackhole")

    private String blackhole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddos")

    private String ddos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    public ShowAlarmConfigResponse withBlackhole(String blackhole) {
        this.blackhole = blackhole;
        return this;
    }

    /**
     * 0开启 1关闭
     * @return blackhole
     */
    public String getBlackhole() {
        return blackhole;
    }

    public void setBlackhole(String blackhole) {
        this.blackhole = blackhole;
    }

    public ShowAlarmConfigResponse withDdos(String ddos) {
        this.ddos = ddos;
        return this;
    }

    /**
     * 0开启 1关闭
     * @return ddos
     */
    public String getDdos() {
        return ddos;
    }

    public void setDdos(String ddos) {
        this.ddos = ddos;
    }

    public ShowAlarmConfigResponse withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * topic名称
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public ShowAlarmConfigResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * topic订阅链接
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAlarmConfigResponse that = (ShowAlarmConfigResponse) obj;
        return Objects.equals(this.blackhole, that.blackhole) && Objects.equals(this.ddos, that.ddos)
            && Objects.equals(this.topicName, that.topicName) && Objects.equals(this.topicUrn, that.topicUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blackhole, ddos, topicName, topicUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmConfigResponse {\n");
        sb.append("    blackhole: ").append(toIndentedString(blackhole)).append("\n");
        sb.append("    ddos: ").append(toIndentedString(ddos)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
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
