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
public class ListNetworkDiagnosisJobProxyResponseDelimitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<NetworkProxyResponseDelimitDetail> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summarize")

    private String summarize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListNetworkDiagnosisJobProxyResponseDelimitResponse withItems(
        List<NetworkProxyResponseDelimitDetail> items) {
        this.items = items;
        return this;
    }

    public ListNetworkDiagnosisJobProxyResponseDelimitResponse addItemsItem(
        NetworkProxyResponseDelimitDetail itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListNetworkDiagnosisJobProxyResponseDelimitResponse withItems(
        Consumer<List<NetworkProxyResponseDelimitDetail>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * Get items
     * @return items
     */
    public List<NetworkProxyResponseDelimitDetail> getItems() {
        return items;
    }

    public void setItems(List<NetworkProxyResponseDelimitDetail> items) {
        this.items = items;
    }

    public ListNetworkDiagnosisJobProxyResponseDelimitResponse withSummarize(String summarize) {
        this.summarize = summarize;
        return this;
    }

    /**
     * **参数解释**：超时代答诊断总结。 **取值范围**：不涉及。
     * @return summarize
     */
    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    public ListNetworkDiagnosisJobProxyResponseDelimitResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：超时代答总数。 **取值范围**：不涉及。
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListNetworkDiagnosisJobProxyResponseDelimitResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
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
        ListNetworkDiagnosisJobProxyResponseDelimitResponse that =
            (ListNetworkDiagnosisJobProxyResponseDelimitResponse) obj;
        return Objects.equals(this.items, that.items) && Objects.equals(this.summarize, that.summarize)
            && Objects.equals(this.total, that.total) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, summarize, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworkDiagnosisJobProxyResponseDelimitResponse {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    summarize: ").append(toIndentedString(summarize)).append("\n");
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
