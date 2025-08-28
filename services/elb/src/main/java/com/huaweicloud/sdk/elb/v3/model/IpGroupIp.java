package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：IP地址组中IP列表的IP地址信息。  **约束限制**：不涉及
 */
public class IpGroupIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    public IpGroupIp withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释**：需要从IP地址组中删除的IP地址，可以是单个IP地址、IP地址段和连续IP地址范围。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpGroupIp that = (IpGroupIp) obj;
        return Objects.equals(this.ip, that.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpGroupIp {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
