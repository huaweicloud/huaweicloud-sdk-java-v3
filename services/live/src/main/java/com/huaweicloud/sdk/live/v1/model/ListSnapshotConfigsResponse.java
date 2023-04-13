package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSnapshotConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_config_list")

    private LiveSnapshotConfig snapshotConfigList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListSnapshotConfigsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条目数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSnapshotConfigsResponse withSnapshotConfigList(LiveSnapshotConfig snapshotConfigList) {
        this.snapshotConfigList = snapshotConfigList;
        return this;
    }

    public ListSnapshotConfigsResponse withSnapshotConfigList(Consumer<LiveSnapshotConfig> snapshotConfigListSetter) {
        if (this.snapshotConfigList == null) {
            this.snapshotConfigList = new LiveSnapshotConfig();
            snapshotConfigListSetter.accept(this.snapshotConfigList);
        }

        return this;
    }

    /**
     * Get snapshotConfigList
     * @return snapshotConfigList
     */
    public LiveSnapshotConfig getSnapshotConfigList() {
        return snapshotConfigList;
    }

    public void setSnapshotConfigList(LiveSnapshotConfig snapshotConfigList) {
        this.snapshotConfigList = snapshotConfigList;
    }

    public ListSnapshotConfigsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSnapshotConfigsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSnapshotConfigsResponse listSnapshotConfigsResponse = (ListSnapshotConfigsResponse) o;
        return Objects.equals(this.total, listSnapshotConfigsResponse.total)
            && Objects.equals(this.snapshotConfigList, listSnapshotConfigsResponse.snapshotConfigList)
            && Objects.equals(this.limit, listSnapshotConfigsResponse.limit)
            && Objects.equals(this.offset, listSnapshotConfigsResponse.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, snapshotConfigList, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotConfigsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    snapshotConfigList: ").append(toIndentedString(snapshotConfigList)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
