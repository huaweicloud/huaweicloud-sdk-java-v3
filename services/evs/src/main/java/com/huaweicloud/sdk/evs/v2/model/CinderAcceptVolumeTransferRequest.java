package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CinderAcceptVolumeTransferRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_id")

    private String transferId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CinderAcceptVolumeTransferRequestBody body;

    public CinderAcceptVolumeTransferRequest withTransferId(String transferId) {
        this.transferId = transferId;
        return this;
    }

    /**
     * 云硬盘ID
     * @return transferId
     */
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public CinderAcceptVolumeTransferRequest withBody(CinderAcceptVolumeTransferRequestBody body) {
        this.body = body;
        return this;
    }

    public CinderAcceptVolumeTransferRequest withBody(Consumer<CinderAcceptVolumeTransferRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CinderAcceptVolumeTransferRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CinderAcceptVolumeTransferRequestBody getBody() {
        return body;
    }

    public void setBody(CinderAcceptVolumeTransferRequestBody body) {
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
        CinderAcceptVolumeTransferRequest cinderAcceptVolumeTransferRequest = (CinderAcceptVolumeTransferRequest) o;
        return Objects.equals(this.transferId, cinderAcceptVolumeTransferRequest.transferId)
            && Objects.equals(this.body, cinderAcceptVolumeTransferRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transferId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderAcceptVolumeTransferRequest {\n");
        sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
