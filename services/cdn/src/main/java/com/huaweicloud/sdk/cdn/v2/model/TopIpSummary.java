package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * top ip 详情数据
 */
public class TopIpSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Long value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio")

    private Double ratio;

    public TopIpSummary withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * IP值。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public TopIpSummary withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 对应查询类型的值。（流量单位：Byte）
     * @return value
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public TopIpSummary withRatio(Double ratio) {
        this.ratio = ratio;
        return this;
    }

    /**
     * 该IP的流量(或请求数)占当前查询条件下总流量(或请求数)的比例。保留4位小数
     * @return ratio
     */
    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopIpSummary that = (TopIpSummary) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.value, that.value)
            && Objects.equals(this.ratio, that.ratio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, value, ratio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopIpSummary {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
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
