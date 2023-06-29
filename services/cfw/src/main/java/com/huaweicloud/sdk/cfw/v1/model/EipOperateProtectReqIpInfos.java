package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EipOperateProtectReqIpInfos
 */
public class EipOperateProtectReqIpInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ipv6")

    private String publicIpv6;

    public EipOperateProtectReqIpInfos withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性公网IP数据ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EipOperateProtectReqIpInfos withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 弹性公网IP地址
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public EipOperateProtectReqIpInfos withPublicIpv6(String publicIpv6) {
        this.publicIpv6 = publicIpv6;
        return this;
    }

    /**
     * 弹性公网IP地址IPV6
     * @return publicIpv6
     */
    public String getPublicIpv6() {
        return publicIpv6;
    }

    public void setPublicIpv6(String publicIpv6) {
        this.publicIpv6 = publicIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EipOperateProtectReqIpInfos that = (EipOperateProtectReqIpInfos) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.publicIpv6, that.publicIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, publicIp, publicIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipOperateProtectReqIpInfos {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicIpv6: ").append(toIndentedString(publicIpv6)).append("\n");
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
