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
public class ListManagerWorkSpacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_page")

    private Integer totalPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<Workspacebody> data = null;

    public ListManagerWorkSpacesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 当前工作空间用户记录数
     * minimum: 0
     * maximum: 100
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListManagerWorkSpacesResponse withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * 查询结果总页数
     * minimum: 0
     * maximum: 100
     * @return totalPage
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public ListManagerWorkSpacesResponse withData(List<Workspacebody> data) {
        this.data = data;
        return this;
    }

    public ListManagerWorkSpacesResponse addDataItem(Workspacebody dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListManagerWorkSpacesResponse withData(Consumer<List<Workspacebody>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 工作空间列表
     * @return data
     */
    public List<Workspacebody> getData() {
        return data;
    }

    public void setData(List<Workspacebody> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListManagerWorkSpacesResponse listManagerWorkSpacesResponse = (ListManagerWorkSpacesResponse) o;
        return Objects.equals(this.count, listManagerWorkSpacesResponse.count)
            && Objects.equals(this.totalPage, listManagerWorkSpacesResponse.totalPage)
            && Objects.equals(this.data, listManagerWorkSpacesResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, totalPage, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListManagerWorkSpacesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
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
