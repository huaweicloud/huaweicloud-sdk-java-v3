package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowIpGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup_id")

    @JacksonXmlProperty(localName = "ipgroup_id")

    private String ipgroupId;

    public ShowIpGroupRequest withIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
        return this;
    }

    /**
     * IP地址组ID。
     * @return ipgroupId
     */
    public String getIpgroupId() {
        return ipgroupId;
    }

    public void setIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIpGroupRequest showIpGroupRequest = (ShowIpGroupRequest) o;
        return Objects.equals(this.ipgroupId, showIpGroupRequest.ipgroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpGroupRequest {\n");
        sb.append("    ipgroupId: ").append(toIndentedString(ipgroupId)).append("\n");
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
