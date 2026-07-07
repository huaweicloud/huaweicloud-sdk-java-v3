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
public class ListHyperinstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current")

    private Integer current;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ServerHyperinstanceResponse> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private Integer pages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListHyperinstancesResponse withCurrent(Integer current) {
        this.current = current;
        return this;
    }

    /**
     * **参数解释**：当前页数。 **约束限制**：不涉及。  **取值范围**：不涉及。  **默认取值**：不涉及。
     * minimum: 1
     * maximum: 2097152
     * @return current
     */
    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public ListHyperinstancesResponse withData(List<ServerHyperinstanceResponse> data) {
        this.data = data;
        return this;
    }

    public ListHyperinstancesResponse addDataItem(ServerHyperinstanceResponse dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListHyperinstancesResponse withData(Consumer<List<ServerHyperinstanceResponse>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释**：Lite Server超节点实例列表。 **约束限制**：不涉及。  **取值范围**：不涉及。  **默认取值**：不涉及。
     * @return data
     */
    public List<ServerHyperinstanceResponse> getData() {
        return data;
    }

    public void setData(List<ServerHyperinstanceResponse> data) {
        this.data = data;
    }

    public ListHyperinstancesResponse withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    /**
     * **参数解释**：总的页数。 **约束限制**：不涉及。  **取值范围**：不涉及。  **默认取值**：不涉及。
     * minimum: 1
     * maximum: 2097152
     * @return pages
     */
    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public ListHyperinstancesResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：每一页的数量。 **约束限制**：不涉及。  **取值范围**：不涉及。  **默认取值**：不涉及。
     * minimum: 1
     * maximum: 1024
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListHyperinstancesResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：总的记录数量。 **约束限制**：不涉及。  **取值范围**：不涉及。  **默认取值**：不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListHyperinstancesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHyperinstancesResponse that = (ListHyperinstancesResponse) obj;
        return Objects.equals(this.current, that.current) && Objects.equals(this.data, that.data)
            && Objects.equals(this.pages, that.pages) && Objects.equals(this.size, that.size)
            && Objects.equals(this.total, that.total) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, data, pages, size, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHyperinstancesResponse {\n");
        sb.append("    current: ").append(toIndentedString(current)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
