package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GlobalEipInfo
 */
public class GlobalEipInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_id")

    private String globalEipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_address")

    private String globalEipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    public GlobalEipInfo withGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
        return this;
    }

    /**
     * 参数解释：global eip的id
     * @return globalEipId
     */
    public String getGlobalEipId() {
        return globalEipId;
    }

    public void setGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
    }

    public GlobalEipInfo withGlobalEipAddress(String globalEipAddress) {
        this.globalEipAddress = globalEipAddress;
        return this;
    }

    /**
     * 参数解释：global eip的ip地址
     * @return globalEipAddress
     */
    public String getGlobalEipAddress() {
        return globalEipAddress;
    }

    public void setGlobalEipAddress(String globalEipAddress) {
        this.globalEipAddress = globalEipAddress;
    }

    public GlobalEipInfo withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 参数解释：IP版本信息。   取值范围： - 4，表示IPv4 - 6，表示IPv6   [不支持IPv6，请勿设置为6。](tag:dt,dt_test)
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalEipInfo that = (GlobalEipInfo) obj;
        return Objects.equals(this.globalEipId, that.globalEipId)
            && Objects.equals(this.globalEipAddress, that.globalEipAddress)
            && Objects.equals(this.ipVersion, that.ipVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipId, globalEipAddress, ipVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalEipInfo {\n");
        sb.append("    globalEipId: ").append(toIndentedString(globalEipId)).append("\n");
        sb.append("    globalEipAddress: ").append(toIndentedString(globalEipAddress)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
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
