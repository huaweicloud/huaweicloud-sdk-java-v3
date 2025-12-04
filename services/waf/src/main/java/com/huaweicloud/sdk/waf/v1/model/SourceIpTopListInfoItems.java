package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SourceIpTopListInfoItems
 */
public class SourceIpTopListInfoItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    public SourceIpTopListInfoItems withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 攻击源ip地址
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public SourceIpTopListInfoItems withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 攻击源ip攻击次数
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceIpTopListInfoItems that = (SourceIpTopListInfoItems) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceIpTopListInfoItems {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
