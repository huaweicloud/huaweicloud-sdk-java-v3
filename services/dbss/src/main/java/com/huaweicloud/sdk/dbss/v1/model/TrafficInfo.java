package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TrafficInfo
 */
public class TrafficInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rxmegabytes")

    private Double rxmegabytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "txmegabytes")

    private Double txmegabytes;

    public TrafficInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrafficInfo withRxmegabytes(Double rxmegabytes) {
        this.rxmegabytes = rxmegabytes;
        return this;
    }

    /**
     * 每秒钟接收字节数
     * @return rxmegabytes
     */
    public Double getRxmegabytes() {
        return rxmegabytes;
    }

    public void setRxmegabytes(Double rxmegabytes) {
        this.rxmegabytes = rxmegabytes;
    }

    public TrafficInfo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 记录时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public TrafficInfo withTxmegabytes(Double txmegabytes) {
        this.txmegabytes = txmegabytes;
        return this;
    }

    /**
     * 每秒钟发送字节数
     * @return txmegabytes
     */
    public Double getTxmegabytes() {
        return txmegabytes;
    }

    public void setTxmegabytes(Double txmegabytes) {
        this.txmegabytes = txmegabytes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrafficInfo that = (TrafficInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.rxmegabytes, that.rxmegabytes)
            && Objects.equals(this.time, that.time) && Objects.equals(this.txmegabytes, that.txmegabytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rxmegabytes, time, txmegabytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    rxmegabytes: ").append(toIndentedString(rxmegabytes)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    txmegabytes: ").append(toIndentedString(txmegabytes)).append("\n");
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
