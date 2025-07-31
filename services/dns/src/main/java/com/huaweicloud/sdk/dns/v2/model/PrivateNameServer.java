package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateNameServer
 */
public class PrivateNameServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    public PrivateNameServer withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释：** 优先级。如果priority的值为“1”，表示会第一个采用该域名服务器进行解析。 **取值范围：** 不涉及。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public PrivateNameServer withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数解释：** DNS服务器地址。 **取值范围：** 不涉及。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateNameServer that = (PrivateNameServer) obj;
        return Objects.equals(this.priority, that.priority) && Objects.equals(this.address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateNameServer {\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
