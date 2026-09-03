package com.huaweicloud.sdk.das.v3.model;

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
public class ShowWdrSnapshotResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_list")

    private List<WdrSnapshot> snapshotList = null;

    public ShowWdrSnapshotResponse withSnapshotList(List<WdrSnapshot> snapshotList) {
        this.snapshotList = snapshotList;
        return this;
    }

    public ShowWdrSnapshotResponse addSnapshotListItem(WdrSnapshot snapshotListItem) {
        if (this.snapshotList == null) {
            this.snapshotList = new ArrayList<>();
        }
        this.snapshotList.add(snapshotListItem);
        return this;
    }

    public ShowWdrSnapshotResponse withSnapshotList(Consumer<List<WdrSnapshot>> snapshotListSetter) {
        if (this.snapshotList == null) {
            this.snapshotList = new ArrayList<>();
        }
        snapshotListSetter.accept(this.snapshotList);
        return this;
    }

    /**
     * WDR快照文件列表
     * @return snapshotList
     */
    public List<WdrSnapshot> getSnapshotList() {
        return snapshotList;
    }

    public void setSnapshotList(List<WdrSnapshot> snapshotList) {
        this.snapshotList = snapshotList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWdrSnapshotResponse that = (ShowWdrSnapshotResponse) obj;
        return Objects.equals(this.snapshotList, that.snapshotList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWdrSnapshotResponse {\n");
        sb.append("    snapshotList: ").append(toIndentedString(snapshotList)).append("\n");
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
