package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CoveredIPVO
 */
public class CoveredIPVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "covered_Ip")

    private String coveredIp;

    public CoveredIPVO withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * ip地址
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public CoveredIPVO withCoveredIp(String coveredIp) {
        this.coveredIp = coveredIp;
        return this;
    }

    /**
     * 覆盖ip地址。
     * @return coveredIp
     */
    public String getCoveredIp() {
        return coveredIp;
    }

    public void setCoveredIp(String coveredIp) {
        this.coveredIp = coveredIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoveredIPVO that = (CoveredIPVO) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.coveredIp, that.coveredIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, coveredIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoveredIPVO {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    coveredIp: ").append(toIndentedString(coveredIp)).append("\n");
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
