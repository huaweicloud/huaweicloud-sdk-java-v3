package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询菜单返回体。
 */
public class ListMenusResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<MenusRsp> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageOffSet pageInfo;

    public ListMenusResponseModel withData(List<MenusRsp> data) {
        this.data = data;
        return this;
    }

    public ListMenusResponseModel addDataItem(MenusRsp dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListMenusResponseModel withData(Consumer<List<MenusRsp>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 菜单信息。
     * @return data
     */
    public List<MenusRsp> getData() {
        return data;
    }

    public void setData(List<MenusRsp> data) {
        this.data = data;
    }

    public ListMenusResponseModel withPageInfo(PageOffSet pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListMenusResponseModel withPageInfo(Consumer<PageOffSet> pageInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMenusResponseModel that = (ListMenusResponseModel) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMenusResponseModel {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
