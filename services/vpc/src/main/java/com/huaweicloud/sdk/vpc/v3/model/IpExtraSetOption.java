package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class IpExtraSetOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    public IpExtraSetOption withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 功能说明：单个IP地址、IP地址范围或ip地址网段，支持IPv4、IPv6
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public IpExtraSetOption withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 功能说明：IP的备注信息 取值范围：0-255个字符，不能包含“<”和“>”。
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpExtraSetOption that = (IpExtraSetOption) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, remarks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpExtraSetOption {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
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
