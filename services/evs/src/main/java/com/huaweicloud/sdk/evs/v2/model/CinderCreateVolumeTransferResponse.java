package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CinderCreateVolumeTransferResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer")

    private CreateVolumeTransferDetail transfer;

    public CinderCreateVolumeTransferResponse withTransfer(CreateVolumeTransferDetail transfer) {
        this.transfer = transfer;
        return this;
    }

    public CinderCreateVolumeTransferResponse withTransfer(Consumer<CreateVolumeTransferDetail> transferSetter) {
        if (this.transfer == null) {
            this.transfer = new CreateVolumeTransferDetail();
            transferSetter.accept(this.transfer);
        }

        return this;
    }

    /**
     * Get transfer
     * @return transfer
     */
    public CreateVolumeTransferDetail getTransfer() {
        return transfer;
    }

    public void setTransfer(CreateVolumeTransferDetail transfer) {
        this.transfer = transfer;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinderCreateVolumeTransferResponse cinderCreateVolumeTransferResponse = (CinderCreateVolumeTransferResponse) o;
        return Objects.equals(this.transfer, cinderCreateVolumeTransferResponse.transfer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transfer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderCreateVolumeTransferResponse {\n");
        sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
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
