package com.huaweicloud.sdk.live.v1.model;

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
public class ListSnapshotConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_config_list")

    private List<LiveSnapshotConfig> snapshotConfigList = null;

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

    public ListSnapshotConfigsResponse withSnapshotConfigList(List<LiveSnapshotConfig> snapshotConfigList) {
        this.snapshotConfigList = snapshotConfigList;
        return this;
    }

    public ListSnapshotConfigsResponse addSnapshotConfigListItem(LiveSnapshotConfig snapshotConfigListItem) {
        if (this.snapshotConfigList == null) {
            this.snapshotConfigList = new ArrayList<>();
        }
        this.snapshotConfigList.add(snapshotConfigListItem);
        return this;
    }

    public ListSnapshotConfigsResponse withSnapshotConfigList(
        Consumer<List<LiveSnapshotConfig>> snapshotConfigListSetter) {
        if (this.snapshotConfigList == null) {
            this.snapshotConfigList = new ArrayList<>();
        }
        snapshotConfigListSetter.accept(this.snapshotConfigList);
        return this;
    }

    /**
     * 截图配置
     * @return snapshotConfigList
     */
    public List<LiveSnapshotConfig> getSnapshotConfigList() {
        return snapshotConfigList;
    }

    public void setSnapshotConfigList(List<LiveSnapshotConfig> snapshotConfigList) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotConfigsResponse that = (ListSnapshotConfigsResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.snapshotConfigList, that.snapshotConfigList)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
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
