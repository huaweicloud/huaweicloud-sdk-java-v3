package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartVpecpReq
 */
public class StartVpecpReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpointWithDnsName")

    private Boolean endpointWithDnsName;

    public StartVpecpReq withEndpointWithDnsName(Boolean endpointWithDnsName) {
        this.endpointWithDnsName = endpointWithDnsName;
        return this;
    }

    /**
     * 开启终端节点。
     * @return endpointWithDnsName
     */
    public Boolean getEndpointWithDnsName() {
        return endpointWithDnsName;
    }

    public void setEndpointWithDnsName(Boolean endpointWithDnsName) {
        this.endpointWithDnsName = endpointWithDnsName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartVpecpReq startVpecpReq = (StartVpecpReq) o;
        return Objects.equals(this.endpointWithDnsName, startVpecpReq.endpointWithDnsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointWithDnsName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartVpecpReq {\n");
        sb.append("    endpointWithDnsName: ").append(toIndentedString(endpointWithDnsName)).append("\n");
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
