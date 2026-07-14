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
public class ListInferDeploymentPodsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current")

    private Integer current;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ServicePodResponse> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private Integer pages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInferDeploymentPodsResponse withCurrent(Integer current) {
        this.current = current;
        return this;
    }

    /**
     * **参数解释：** 当前页码，从0开始计数。 **取值范围：** 不涉及。
     * @return current
     */
    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public ListInferDeploymentPodsResponse withData(List<ServicePodResponse> data) {
        this.data = data;
        return this;
    }

    public ListInferDeploymentPodsResponse addDataItem(ServicePodResponse dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListInferDeploymentPodsResponse withData(Consumer<List<ServicePodResponse>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释：** 服务的pod的列表。
     * @return data
     */
    public List<ServicePodResponse> getData() {
        return data;
    }

    public void setData(List<ServicePodResponse> data) {
        this.data = data;
    }

    public ListInferDeploymentPodsResponse withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    /**
     * **参数解释：** 总页数，根据传入的limit字段和数据总条数计算得出。如总记录条数为10，limit（单页最大条目数）为3，则页数为4。 **取值范围：** 不涉及。
     * @return pages
     */
    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public ListInferDeploymentPodsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 当前页数量。 **取值范围：** 不涉及。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListInferDeploymentPodsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 总记录条数。 **取值范围：** 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
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
        ListInferDeploymentPodsResponse that = (ListInferDeploymentPodsResponse) obj;
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
        sb.append("class ListInferDeploymentPodsResponse {\n");
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
