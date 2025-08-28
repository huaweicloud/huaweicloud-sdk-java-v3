package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：更新IP地址组IP请求参数。  **约束限制**：不涉及
 */
public class UpdateIpGroupIpOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateIpGroupIpOption withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释**：IP地址组中的IP信息。  **约束限制**：不涉及  **取值范围**：支持IPv4和IPv6地址类型，格式为IP地址、IP地址段或IP地址范围，IP地址范围格式为ip-ip，例如192.168.1.2-192.168.2.253或者2001:0DB8:02de::0e12-2001:0DB8:02de::0e13，终止IP需要大于起始IP。  **默认取值**：不涉及  [不支持IPv6，请勿设置为IPv6地址。](tag:dt)
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public UpdateIpGroupIpOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：备注信息。  **约束限制**：不涉及  **取值范围**：长度为0-255个字符。  **默认取值**：不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIpGroupIpOption that = (UpdateIpGroupIpOption) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpGroupIpOption {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
