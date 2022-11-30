package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListEpsQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private List<NoSqlQueryEpsQuotaInfoList> quotas = null;

    public ListEpsQuotasResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListEpsQuotasResponse withQuotas(List<NoSqlQueryEpsQuotaInfoList> quotas) {
        this.quotas = quotas;
        return this;
    }

    public ListEpsQuotasResponse addQuotasItem(NoSqlQueryEpsQuotaInfoList quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ListEpsQuotasResponse withQuotas(Consumer<List<NoSqlQueryEpsQuotaInfoList>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * 企业项目配额信息列表。
     * @return quotas
     */
    public List<NoSqlQueryEpsQuotaInfoList> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<NoSqlQueryEpsQuotaInfoList> quotas) {
        this.quotas = quotas;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEpsQuotasResponse listEpsQuotasResponse = (ListEpsQuotasResponse) o;
        return Objects.equals(this.totalCount, listEpsQuotasResponse.totalCount)
            && Objects.equals(this.quotas, listEpsQuotasResponse.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEpsQuotasResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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
