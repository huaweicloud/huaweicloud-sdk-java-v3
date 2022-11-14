package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器开发端口信息
 */
public class Address {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_ip")

    private String intranetIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_ip")

    private String accessIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    public Address withIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }

    /**
     * 云手机服务器的内网IP，过期字段
     * @return intranetIp
     */
    public String getIntranetIp() {
        return intranetIp;
    }

    public void setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
    }

    public Address withAccessIp(String accessIp) {
        this.accessIp = accessIp;
        return this;
    }

    /**
     * 云手机服务器的公网IP，过期字段
     * @return accessIp
     */
    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp;
    }

    public Address withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * 云手机服务器的内网IP，新增字段
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public Address withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 云手机服务器的公网IP，新增字段
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.intranetIp, address.intranetIp) && Objects.equals(this.accessIp, address.accessIp)
            && Objects.equals(this.serverIp, address.serverIp) && Objects.equals(this.publicIp, address.publicIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intranetIp, accessIp, serverIp, publicIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");
        sb.append("    intranetIp: ").append(toIndentedString(intranetIp)).append("\n");
        sb.append("    accessIp: ").append(toIndentedString(accessIp)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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
