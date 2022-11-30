package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDisassociatePublicipResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PublicipInstanceResp publicip;

    public UpdateDisassociatePublicipResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateDisassociatePublicipResponse withPublicip(PublicipInstanceResp publicip) {
        this.publicip = publicip;
        return this;
    }

    public UpdateDisassociatePublicipResponse withPublicip(Consumer<PublicipInstanceResp> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PublicipInstanceResp();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public PublicipInstanceResp getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicipInstanceResp publicip) {
        this.publicip = publicip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDisassociatePublicipResponse updateDisassociatePublicipResponse = (UpdateDisassociatePublicipResponse) o;
        return Objects.equals(this.requestId, updateDisassociatePublicipResponse.requestId)
            && Objects.equals(this.publicip, updateDisassociatePublicipResponse.publicip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, publicip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDisassociatePublicipResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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
