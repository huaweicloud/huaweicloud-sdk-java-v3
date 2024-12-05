package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListDataconnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_records")

    private Integer maxRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Integer totalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_connection_lists")

    private List<ApigDataSourceView> dataConnectionLists = null;

    public ListDataconnectionsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 当前分页返回记录数
     * minimum: 1
     * maximum: 50
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListDataconnectionsResponse withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * 返回记录总数，一个工作空间最多只能创建50条数据连接
     * minimum: 50
     * maximum: 50
     * @return maxRecords
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    public ListDataconnectionsResponse withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 返回当前空间内创建连接的总数
     * minimum: 0
     * maximum: 1000
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public ListDataconnectionsResponse withDataConnectionLists(List<ApigDataSourceView> dataConnectionLists) {
        this.dataConnectionLists = dataConnectionLists;
        return this;
    }

    public ListDataconnectionsResponse addDataConnectionListsItem(ApigDataSourceView dataConnectionListsItem) {
        if (this.dataConnectionLists == null) {
            this.dataConnectionLists = new ArrayList<>();
        }
        this.dataConnectionLists.add(dataConnectionListsItem);
        return this;
    }

    public ListDataconnectionsResponse withDataConnectionLists(
        Consumer<List<ApigDataSourceView>> dataConnectionListsSetter) {
        if (this.dataConnectionLists == null) {
            this.dataConnectionLists = new ArrayList<>();
        }
        dataConnectionListsSetter.accept(this.dataConnectionLists);
        return this;
    }

    /**
     * 返回数据连接列表
     * @return dataConnectionLists
     */
    public List<ApigDataSourceView> getDataConnectionLists() {
        return dataConnectionLists;
    }

    public void setDataConnectionLists(List<ApigDataSourceView> dataConnectionLists) {
        this.dataConnectionLists = dataConnectionLists;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataconnectionsResponse that = (ListDataconnectionsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.maxRecords, that.maxRecords)
            && Objects.equals(this.totalSize, that.totalSize)
            && Objects.equals(this.dataConnectionLists, that.dataConnectionLists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, maxRecords, totalSize, dataConnectionLists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataconnectionsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    maxRecords: ").append(toIndentedString(maxRecords)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    dataConnectionLists: ").append(toIndentedString(dataConnectionLists)).append("\n");
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
