package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListCoreGatewayQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private List<CoreGatewayQuota> quotas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListCoreGatewayQuotasResponse withQuotas(List<CoreGatewayQuota> quotas) {
        this.quotas = quotas;
        return this;
    }

    public ListCoreGatewayQuotasResponse addQuotasItem(CoreGatewayQuota quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ListCoreGatewayQuotasResponse withQuotas(Consumer<List<CoreGatewayQuota>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * **参数解释：** 配额列表。 **取值范围：** 数组长度为 1-2。 
     * @return quotas
     */
    public List<CoreGatewayQuota> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<CoreGatewayQuota> quotas) {
        this.quotas = quotas;
    }

    public ListCoreGatewayQuotasResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 当前页返回的配额数量。 **取值范围：** 取值为 0-2个。 
     * minimum: 0
     * maximum: 2
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListCoreGatewayQuotasResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 配额总数。 **取值范围：** 取值为 0-2个。 
     * minimum: 0
     * maximum: 2
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
        ListCoreGatewayQuotasResponse that = (ListCoreGatewayQuotasResponse) obj;
        return Objects.equals(this.quotas, that.quotas) && Objects.equals(this.size, that.size)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreGatewayQuotasResponse {\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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
