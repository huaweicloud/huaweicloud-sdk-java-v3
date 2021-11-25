package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListTransfersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfers")

    private List<CreateTransferResponseBody> logTransfers = null;

    public ListTransfersResponse withLogTransfers(List<CreateTransferResponseBody> logTransfers) {
        this.logTransfers = logTransfers;
        return this;
    }

    public ListTransfersResponse addLogTransfersItem(CreateTransferResponseBody logTransfersItem) {
        if (this.logTransfers == null) {
            this.logTransfers = new ArrayList<>();
        }
        this.logTransfers.add(logTransfersItem);
        return this;
    }

    public ListTransfersResponse withLogTransfers(Consumer<List<CreateTransferResponseBody>> logTransfersSetter) {
        if (this.logTransfers == null) {
            this.logTransfers = new ArrayList<>();
        }
        logTransfersSetter.accept(this.logTransfers);
        return this;
    }

    /** 查询日志转储信息数组
     * 
     * @return logTransfers */
    public List<CreateTransferResponseBody> getLogTransfers() {
        return logTransfers;
    }

    public void setLogTransfers(List<CreateTransferResponseBody> logTransfers) {
        this.logTransfers = logTransfers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTransfersResponse listTransfersResponse = (ListTransfersResponse) o;
        return Objects.equals(this.logTransfers, listTransfersResponse.logTransfers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logTransfers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransfersResponse {\n");
        sb.append("    logTransfers: ").append(toIndentedString(logTransfers)).append("\n");
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
