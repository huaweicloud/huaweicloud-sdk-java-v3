package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProxyIpgroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ip_group")

    private Boolean enableIpGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group")

    private ProxyIpGroupDetail ipGroup;

    public ShowProxyIpgroupResponse withEnableIpGroup(Boolean enableIpGroup) {
        this.enableIpGroup = enableIpGroup;
        return this;
    }

    /**
     * 允许访问控制或者不允许 true | false。
     * @return enableIpGroup
     */
    public Boolean getEnableIpGroup() {
        return enableIpGroup;
    }

    public void setEnableIpGroup(Boolean enableIpGroup) {
        this.enableIpGroup = enableIpGroup;
    }

    public ShowProxyIpgroupResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 白名单或者黑名单 'white' | 'black'
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowProxyIpgroupResponse withIpGroup(ProxyIpGroupDetail ipGroup) {
        this.ipGroup = ipGroup;
        return this;
    }

    public ShowProxyIpgroupResponse withIpGroup(Consumer<ProxyIpGroupDetail> ipGroupSetter) {
        if (this.ipGroup == null) {
            this.ipGroup = new ProxyIpGroupDetail();
            ipGroupSetter.accept(this.ipGroup);
        }

        return this;
    }

    /**
     * Get ipGroup
     * @return ipGroup
     */
    public ProxyIpGroupDetail getIpGroup() {
        return ipGroup;
    }

    public void setIpGroup(ProxyIpGroupDetail ipGroup) {
        this.ipGroup = ipGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProxyIpgroupResponse that = (ShowProxyIpgroupResponse) obj;
        return Objects.equals(this.enableIpGroup, that.enableIpGroup) && Objects.equals(this.type, that.type)
            && Objects.equals(this.ipGroup, that.ipGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableIpGroup, type, ipGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProxyIpgroupResponse {\n");
        sb.append("    enableIpGroup: ").append(toIndentedString(enableIpGroup)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ipGroup: ").append(toIndentedString(ipGroup)).append("\n");
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
