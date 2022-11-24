package com.huaweicloud.sdk.cloudartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回的具体结果信息
 */
public class StandardResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ReleaseFileVersionDo> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_records")

    private Integer totalRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_pages")

    private Integer totalPages;

    public StandardResponseResult withData(List<ReleaseFileVersionDo> data) {
        this.data = data;
        return this;
    }

    public StandardResponseResult addDataItem(ReleaseFileVersionDo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public StandardResponseResult withData(Consumer<List<ReleaseFileVersionDo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 符合条件的结果列表
     * @return data
     */
    public List<ReleaseFileVersionDo> getData() {
        return data;
    }

    public void setData(List<ReleaseFileVersionDo> data) {
        this.data = data;
    }

    public StandardResponseResult withTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * 符合条件的结果总数
     * minimum: 1
     * maximum: 1000
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public StandardResponseResult withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * 符合条件的结果总页数
     * minimum: 1
     * maximum: 10000
     * @return totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardResponseResult standardResponseResult = (StandardResponseResult) o;
        return Objects.equals(this.data, standardResponseResult.data)
            && Objects.equals(this.totalRecords, standardResponseResult.totalRecords)
            && Objects.equals(this.totalPages, standardResponseResult.totalPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, totalRecords, totalPages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardResponseResult {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
