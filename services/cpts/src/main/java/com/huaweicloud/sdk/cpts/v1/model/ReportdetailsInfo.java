package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ReportdetailsInfo */
public class ReportdetailsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ReportdetailItemInfo> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageIndex")

    private Integer pageIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageSize")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ReportdetailsInfo withData(List<ReportdetailItemInfo> data) {
        this.data = data;
        return this;
    }

    public ReportdetailsInfo addDataItem(ReportdetailItemInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ReportdetailsInfo withData(Consumer<List<ReportdetailItemInfo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /** data
     * 
     * @return data */
    public List<ReportdetailItemInfo> getData() {
        return data;
    }

    public void setData(List<ReportdetailItemInfo> data) {
        this.data = data;
    }

    public ReportdetailsInfo withPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /** pageIndex
     * 
     * @return pageIndex */
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public ReportdetailsInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /** pageSize
     * 
     * @return pageSize */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ReportdetailsInfo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** total
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportdetailsInfo reportdetailsInfo = (ReportdetailsInfo) o;
        return Objects.equals(this.data, reportdetailsInfo.data)
            && Objects.equals(this.pageIndex, reportdetailsInfo.pageIndex)
            && Objects.equals(this.pageSize, reportdetailsInfo.pageSize)
            && Objects.equals(this.total, reportdetailsInfo.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, pageIndex, pageSize, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportdetailsInfo {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
