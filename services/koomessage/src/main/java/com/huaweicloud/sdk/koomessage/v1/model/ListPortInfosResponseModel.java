package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询结果返回体。
 */
public class ListPortInfosResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageOffSet pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ListPortInfosResponseModelData> data = null;

    public ListPortInfosResponseModel withPageInfo(PageOffSet pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPortInfosResponseModel withPageInfo(Consumer<PageOffSet> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageOffSet();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageOffSet getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageOffSet pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListPortInfosResponseModel withData(List<ListPortInfosResponseModelData> data) {
        this.data = data;
        return this;
    }

    public ListPortInfosResponseModel addDataItem(ListPortInfosResponseModelData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListPortInfosResponseModel withData(Consumer<List<ListPortInfosResponseModelData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 请求成功返回的数据。
     * @return data
     */
    public List<ListPortInfosResponseModelData> getData() {
        return data;
    }

    public void setData(List<ListPortInfosResponseModelData> data) {
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
        ListPortInfosResponseModel that = (ListPortInfosResponseModel) obj;
        return Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPortInfosResponseModel {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
