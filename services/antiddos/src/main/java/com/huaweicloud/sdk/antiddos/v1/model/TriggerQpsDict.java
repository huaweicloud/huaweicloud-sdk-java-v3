package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HTTP限制列表
 */
public class TriggerQpsDict {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_request_pos_id")

    private Long httpRequestPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_packet_per_second")

    private Long httpPacketPerSecond;

    public TriggerQpsDict withHttpRequestPosId(Long httpRequestPosId) {
        this.httpRequestPosId = httpRequestPosId;
        return this;
    }

    /**
     * HTTP请求数分段ID
     * @return httpRequestPosId
     */
    public Long getHttpRequestPosId() {
        return httpRequestPosId;
    }

    public void setHttpRequestPosId(Long httpRequestPosId) {
        this.httpRequestPosId = httpRequestPosId;
    }

    public TriggerQpsDict withHttpPacketPerSecond(Long httpPacketPerSecond) {
        this.httpPacketPerSecond = httpPacketPerSecond;
        return this;
    }

    /**
     * 每秒HTTP请求数（个/s）阈值
     * @return httpPacketPerSecond
     */
    public Long getHttpPacketPerSecond() {
        return httpPacketPerSecond;
    }

    public void setHttpPacketPerSecond(Long httpPacketPerSecond) {
        this.httpPacketPerSecond = httpPacketPerSecond;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TriggerQpsDict triggerQpsDict = (TriggerQpsDict) o;
        return Objects.equals(this.httpRequestPosId, triggerQpsDict.httpRequestPosId)
            && Objects.equals(this.httpPacketPerSecond, triggerQpsDict.httpPacketPerSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpRequestPosId, httpPacketPerSecond);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerQpsDict {\n");
        sb.append("    httpRequestPosId: ").append(toIndentedString(httpRequestPosId)).append("\n");
        sb.append("    httpPacketPerSecond: ").append(toIndentedString(httpPacketPerSecond)).append("\n");
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
