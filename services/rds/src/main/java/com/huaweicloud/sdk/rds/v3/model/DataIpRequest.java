package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DataIpRequest
 */
public class DataIpRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_ip")

    private String newIp;

    public DataIpRequest withNewIp(String newIp) {
        this.newIp = newIp;
        return this;
    }

    /**
     * 内网ip
     * @return newIp
     */
    public String getNewIp() {
        return newIp;
    }

    public void setNewIp(String newIp) {
        this.newIp = newIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataIpRequest that = (DataIpRequest) obj;
        return Objects.equals(this.newIp, that.newIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataIpRequest {\n");
        sb.append("    newIp: ").append(toIndentedString(newIp)).append("\n");
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
