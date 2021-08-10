package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class KeystoneCreateProtocolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_id")

    private String idpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_id")

    private String protocolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private KeystoneCreateProtocolRequestBody body;

    public KeystoneCreateProtocolRequest withIdpId(String idpId) {
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

    public KeystoneCreateProtocolRequest withProtocolId(String protocolId) {
        this.protocolId = protocolId;
        return this;
    }

    /** 待注册的协议ID。
     * 
     * @return protocolId */
    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public KeystoneCreateProtocolRequest withBody(KeystoneCreateProtocolRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneCreateProtocolRequest withBody(Consumer<KeystoneCreateProtocolRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new KeystoneCreateProtocolRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public KeystoneCreateProtocolRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneCreateProtocolRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateProtocolRequest keystoneCreateProtocolRequest = (KeystoneCreateProtocolRequest) o;
        return Objects.equals(this.idpId, keystoneCreateProtocolRequest.idpId)
            && Objects.equals(this.protocolId, keystoneCreateProtocolRequest.protocolId)
            && Objects.equals(this.body, keystoneCreateProtocolRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpId, protocolId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateProtocolRequest {\n");
        sb.append("    idpId: ").append(toIndentedString(idpId)).append("\n");
        sb.append("    protocolId: ").append(toIndentedString(protocolId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
