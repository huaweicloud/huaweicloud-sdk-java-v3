package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** pulsar通道配置信 */
public class PulsarForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    public PulsarForwarding withUrl(String url) {
        this.url = url;
        return this;
    }

    /** **参数说明**：pulsar的访问url。
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PulsarForwarding withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** **参数说明**：用于接收满足规则条件数据的topic。
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public PulsarForwarding withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /** **参数说明**：证书id
     * 
     * @return certId */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PulsarForwarding pulsarForwarding = (PulsarForwarding) o;
        return Objects.equals(this.url, pulsarForwarding.url) && Objects.equals(this.topic, pulsarForwarding.topic)
            && Objects.equals(this.certId, pulsarForwarding.certId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, topic, certId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PulsarForwarding {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
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
