package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * AttachEipRequestBody
 */
public class AttachEipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_id")

    @JacksonXmlProperty(localName = "public_ip_id")

    private String publicIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    @JacksonXmlProperty(localName = "public_ip")

    private String publicIp;

    public AttachEipRequestBody withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * 公网IP的ID。
     * @return publicIpId
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    public AttachEipRequestBody withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 公网IP。
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
        AttachEipRequestBody attachEipRequestBody = (AttachEipRequestBody) o;
        return Objects.equals(this.publicIpId, attachEipRequestBody.publicIpId)
            && Objects.equals(this.publicIp, attachEipRequestBody.publicIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicIpId, publicIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachEipRequestBody {\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
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
