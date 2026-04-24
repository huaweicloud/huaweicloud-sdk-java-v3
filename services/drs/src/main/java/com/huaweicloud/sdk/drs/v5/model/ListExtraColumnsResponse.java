package com.huaweicloud.sdk.drs.v5.model;

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
public class ListExtraColumnsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_process_objects")

    private List<ColumnProcessObjects> columnProcessObjects = null;

    public ListExtraColumnsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 列表中的项目总数，与分页无关。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListExtraColumnsResponse withColumnProcessObjects(List<ColumnProcessObjects> columnProcessObjects) {
        this.columnProcessObjects = columnProcessObjects;
        return this;
    }

    public ListExtraColumnsResponse addColumnProcessObjectsItem(ColumnProcessObjects columnProcessObjectsItem) {
        if (this.columnProcessObjects == null) {
            this.columnProcessObjects = new ArrayList<>();
        }
        this.columnProcessObjects.add(columnProcessObjectsItem);
        return this;
    }

    public ListExtraColumnsResponse withColumnProcessObjects(
        Consumer<List<ColumnProcessObjects>> columnProcessObjectsSetter) {
        if (this.columnProcessObjects == null) {
            this.columnProcessObjects = new ArrayList<>();
        }
        columnProcessObjectsSetter.accept(this.columnProcessObjects);
        return this;
    }

    /**
     * 列加工对象
     * @return columnProcessObjects
     */
    public List<ColumnProcessObjects> getColumnProcessObjects() {
        return columnProcessObjects;
    }

    public void setColumnProcessObjects(List<ColumnProcessObjects> columnProcessObjects) {
        this.columnProcessObjects = columnProcessObjects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExtraColumnsResponse that = (ListExtraColumnsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.columnProcessObjects, that.columnProcessObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, columnProcessObjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExtraColumnsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    columnProcessObjects: ").append(toIndentedString(columnProcessObjects)).append("\n");
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
