package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 项目列表
 */
public class ListRecordsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagination")

    private ListRecordsResultPagination pagination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<BuildRecord> data = null;

    public ListRecordsResult withPagination(ListRecordsResultPagination pagination) {
        this.pagination = pagination;
        return this;
    }

    public ListRecordsResult withPagination(Consumer<ListRecordsResultPagination> paginationSetter) {
        if (this.pagination == null) {
            this.pagination = new ListRecordsResultPagination();
            paginationSetter.accept(this.pagination);
        }

        return this;
    }

    /**
     * Get pagination
     * @return pagination
     */
    public ListRecordsResultPagination getPagination() {
        return pagination;
    }

    public void setPagination(ListRecordsResultPagination pagination) {
        this.pagination = pagination;
    }

    public ListRecordsResult withData(List<BuildRecord> data) {
        this.data = data;
        return this;
    }

    public ListRecordsResult addDataItem(BuildRecord dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListRecordsResult withData(Consumer<List<BuildRecord>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 工程构建记录列表
     * @return data
     */
    public List<BuildRecord> getData() {
        return data;
    }

    public void setData(List<BuildRecord> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRecordsResult that = (ListRecordsResult) obj;
        return Objects.equals(this.pagination, that.pagination) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pagination, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordsResult {\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
