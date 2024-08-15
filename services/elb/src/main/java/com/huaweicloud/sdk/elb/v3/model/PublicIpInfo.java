package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 弹性公网EIP信息
 */
public class PublicIpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_address")

    private String publicipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    public PublicIpInfo withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 参数解释：弹性公网ip配置id
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public PublicIpInfo withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /**
     * 参数解释：IP地址
     * @return publicipAddress
     */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public PublicIpInfo withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 参数解释：IP版本信息。  取值范围：4和6 4：IPv4 6：IPv6  [不支持IPv6，请勿设置为6。](tag:dt,dt_test)
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
        PublicIpInfo that = (PublicIpInfo) obj;
        return Objects.equals(this.publicipId, that.publicipId)
            && Objects.equals(this.publicipAddress, that.publicipAddress)
            && Objects.equals(this.ipVersion, that.ipVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipId, publicipAddress, ipVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIpInfo {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    publicipAddress: ").append(toIndentedString(publicipAddress)).append("\n");
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
