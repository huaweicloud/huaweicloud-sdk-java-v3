package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * BindEipRequest
 */
public class BindEipRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    @JacksonXmlProperty(localName = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_id")

    @JacksonXmlProperty(localName = "public_ip_id")

    private String publicIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_bind")

    @JacksonXmlProperty(localName = "is_bind")

    private Boolean isBind;

    public BindEipRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 待绑定的弹性公网IP地址，仅允许使用标准的IP地址格式。is_bind为true时必选
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public BindEipRequest withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * 弹性公网IP对应的ID，仅允许使用标准的UUID格式。is_bind为true时必选
     * @return publicIpId
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    public BindEipRequest withIsBind(Boolean isBind) {
        this.isBind = isBind;
        return this;
    }

    /**
     * - true，绑定弹性公网IP。 - false，解绑弹性公网IP。
     * @return isBind
     */
    public Boolean getIsBind() {
        return isBind;
    }

    public void setIsBind(Boolean isBind) {
        this.isBind = isBind;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BindEipRequest bindEipRequest = (BindEipRequest) o;
        return Objects.equals(this.publicIp, bindEipRequest.publicIp)
            && Objects.equals(this.publicIpId, bindEipRequest.publicIpId)
            && Objects.equals(this.isBind, bindEipRequest.isBind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicIp, publicIpId, isBind);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindEipRequest {\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
        sb.append("    isBind: ").append(toIndentedString(isBind)).append("\n");
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
