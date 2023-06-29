package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CinderShowVolumeTransferResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer")

    private VolumeTransfer transfer;

    public CinderShowVolumeTransferResponse withTransfer(VolumeTransfer transfer) {
        this.transfer = transfer;
        return this;
    }

    public CinderShowVolumeTransferResponse withTransfer(Consumer<VolumeTransfer> transferSetter) {
        if (this.transfer == null) {
            this.transfer = new VolumeTransfer();
            transferSetter.accept(this.transfer);
        }

        return this;
    }

    /**
     * Get transfer
     * @return transfer
     */
    public VolumeTransfer getTransfer() {
        return transfer;
    }

    public void setTransfer(VolumeTransfer transfer) {
        this.transfer = transfer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CinderShowVolumeTransferResponse that = (CinderShowVolumeTransferResponse) obj;
        return Objects.equals(this.transfer, that.transfer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transfer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderShowVolumeTransferResponse {\n");
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
