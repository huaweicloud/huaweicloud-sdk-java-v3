package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CinderCreateVolumeTransferRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer")

    private CreateVolumeTransferOption transfer;

    public CinderCreateVolumeTransferRequestBody withTransfer(CreateVolumeTransferOption transfer) {
        this.transfer = transfer;
        return this;
    }

    public CinderCreateVolumeTransferRequestBody withTransfer(Consumer<CreateVolumeTransferOption> transferSetter) {
        if (this.transfer == null) {
            this.transfer = new CreateVolumeTransferOption();
            transferSetter.accept(this.transfer);
        }

        return this;
    }

    /**
     * Get transfer
     * @return transfer
     */
    public CreateVolumeTransferOption getTransfer() {
        return transfer;
    }

    public void setTransfer(CreateVolumeTransferOption transfer) {
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
        CinderCreateVolumeTransferRequestBody cinderCreateVolumeTransferRequestBody =
            (CinderCreateVolumeTransferRequestBody) o;
        return Objects.equals(this.transfer, cinderCreateVolumeTransferRequestBody.transfer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transfer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderCreateVolumeTransferRequestBody {\n");
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
