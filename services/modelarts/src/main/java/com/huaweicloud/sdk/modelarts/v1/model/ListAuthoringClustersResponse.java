package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListAuthoringClustersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current")

    private Integer current;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ClusterResponse> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private Integer pages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListAuthoringClustersResponse withCurrent(Integer current) {
        this.current = current;
        return this;
    }

    /**
     * **参数解释**：当前页数。 **取值范围**：正整数。
     * @return current
     */
    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public ListAuthoringClustersResponse withData(List<ClusterResponse> data) {
        this.data = data;
        return this;
    }

    public ListAuthoringClustersResponse addDataItem(ClusterResponse dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListAuthoringClustersResponse withData(Consumer<List<ClusterResponse>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释**：Notebook实例数据。
     * @return data
     */
    public List<ClusterResponse> getData() {
        return data;
    }

    public void setData(List<ClusterResponse> data) {
        this.data = data;
    }

    public ListAuthoringClustersResponse withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    /**
     * **参数解释**：总的页数。 **取值范围**：正整数。
     * @return pages
     */
    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public ListAuthoringClustersResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：每一页的数量。 **取值范围**：正整数。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListAuthoringClustersResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：总的记录数量。 **取值范围**：非负整数。
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthoringClustersResponse that = (ListAuthoringClustersResponse) obj;
        return Objects.equals(this.current, that.current) && Objects.equals(this.data, that.data)
            && Objects.equals(this.pages, that.pages) && Objects.equals(this.size, that.size)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, data, pages, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthoringClustersResponse {\n");
        sb.append("    current: ").append(toIndentedString(current)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
