package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAvailableIpResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_ip")

    private Integer availableIp;

    public ShowAvailableIpResponse withAvailableIp(Integer availableIp) {
        this.availableIp = availableIp;
        return this;
    }

    /**
     * 可用ip数
     * @return availableIp
     */
    public Integer getAvailableIp() {
        return availableIp;
    }

    public void setAvailableIp(Integer availableIp) {
        this.availableIp = availableIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvailableIpResponse that = (ShowAvailableIpResponse) obj;
        return Objects.equals(this.availableIp, that.availableIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableIpResponse {\n");
        sb.append("    availableIp: ").append(toIndentedString(availableIp)).append("\n");
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
