package com.huaweicloud.sdk.rds.v3.model;

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
public class ListBackupTransfersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_list")

    private List<BackupTransferInfo> transferList = null;

    public ListBackupTransfersResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 任务数量
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListBackupTransfersResponse withTransferList(List<BackupTransferInfo> transferList) {
        this.transferList = transferList;
        return this;
    }

    public ListBackupTransfersResponse addTransferListItem(BackupTransferInfo transferListItem) {
        if (this.transferList == null) {
            this.transferList = new ArrayList<>();
        }
        this.transferList.add(transferListItem);
        return this;
    }

    public ListBackupTransfersResponse withTransferList(Consumer<List<BackupTransferInfo>> transferListSetter) {
        if (this.transferList == null) {
            this.transferList = new ArrayList<>();
        }
        transferListSetter.accept(this.transferList);
        return this;
    }

    /**
     * 任务列表
     * @return transferList
     */
    public List<BackupTransferInfo> getTransferList() {
        return transferList;
    }

    public void setTransferList(List<BackupTransferInfo> transferList) {
        this.transferList = transferList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBackupTransfersResponse that = (ListBackupTransfersResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.transferList, that.transferList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, transferList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupTransfersResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    transferList: ").append(toIndentedString(transferList)).append("\n");
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
