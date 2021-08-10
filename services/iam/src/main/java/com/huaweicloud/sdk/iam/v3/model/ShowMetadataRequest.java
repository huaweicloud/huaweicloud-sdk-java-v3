package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowMetadataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_id")

    private String idpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_id")

    private String protocolId;

    public ShowMetadataRequest withIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }

    /** 身份提供商ID。
     * 
     * @return idpId */
    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public ShowMetadataRequest withProtocolId(String protocolId) {
        this.protocolId = protocolId;
        return this;
    }

    /** 协议ID。
     * 
     * @return protocolId */
    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMetadataRequest showMetadataRequest = (ShowMetadataRequest) o;
        return Objects.equals(this.idpId, showMetadataRequest.idpId)
            && Objects.equals(this.protocolId, showMetadataRequest.protocolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpId, protocolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetadataRequest {\n");
        sb.append("    idpId: ").append(toIndentedString(idpId)).append("\n");
        sb.append("    protocolId: ").append(toIndentedString(protocolId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
