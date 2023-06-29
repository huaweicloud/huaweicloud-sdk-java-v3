package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CinderListVolumeTransfersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfers")

    private List<VolumeTransferSummary> transfers = null;

    public CinderListVolumeTransfersResponse withTransfers(List<VolumeTransferSummary> transfers) {
        this.transfers = transfers;
        return this;
    }

    public CinderListVolumeTransfersResponse addTransfersItem(VolumeTransferSummary transfersItem) {
        if (this.transfers == null) {
            this.transfers = new ArrayList<>();
        }
        this.transfers.add(transfersItem);
        return this;
    }

    public CinderListVolumeTransfersResponse withTransfers(Consumer<List<VolumeTransferSummary>> transfersSetter) {
        if (this.transfers == null) {
            this.transfers = new ArrayList<>();
        }
        transfersSetter.accept(this.transfers);
        return this;
    }

    /**
     * 云硬盘过户记录列表概要，请参见•[transfers参数说明](https://support.huaweicloud.com/api-evs/evs_04_2110.html#evs_04_2110__li6113282511345)。
     * @return transfers
     */
    public List<VolumeTransferSummary> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<VolumeTransferSummary> transfers) {
        this.transfers = transfers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CinderListVolumeTransfersResponse that = (CinderListVolumeTransfersResponse) obj;
        return Objects.equals(this.transfers, that.transfers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transfers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderListVolumeTransfersResponse {\n");
        sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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
