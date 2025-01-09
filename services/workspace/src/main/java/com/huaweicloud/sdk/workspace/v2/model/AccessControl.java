package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessControl
 */
public class AccessControl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_access_control")

    private String ipAccessControl;

    public AccessControl withIpAccessControl(String ipAccessControl) {
        this.ipAccessControl = ipAccessControl;
        return this;
    }

    /**
     * IP接入控制。IP接入控制需输入有效的IP地址和子网掩码，IP和子网掩码间以\"|\"拼接组成一组，如果有多组用\";\"分隔。如：IP|掩码;IP|掩码;IP|掩码。
     * @return ipAccessControl
     */
    public String getIpAccessControl() {
        return ipAccessControl;
    }

    public void setIpAccessControl(String ipAccessControl) {
        this.ipAccessControl = ipAccessControl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControl that = (AccessControl) obj;
        return Objects.equals(this.ipAccessControl, that.ipAccessControl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAccessControl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessControl {\n");
        sb.append("    ipAccessControl: ").append(toIndentedString(ipAccessControl)).append("\n");
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
