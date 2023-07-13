package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NoSqlModiflyEpsQuotasRequestBody
 */
public class NoSqlModiflyEpsQuotasRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private List<NoSqlRequestEpsQuota> quotas = null;

    public NoSqlModiflyEpsQuotasRequestBody withQuotas(List<NoSqlRequestEpsQuota> quotas) {
        this.quotas = quotas;
        return this;
    }

    public NoSqlModiflyEpsQuotasRequestBody addQuotasItem(NoSqlRequestEpsQuota quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public NoSqlModiflyEpsQuotasRequestBody withQuotas(Consumer<List<NoSqlRequestEpsQuota>> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * 需要修改的企业项目配额信息列表。
     * @return quotas
     */
    public List<NoSqlRequestEpsQuota> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<NoSqlRequestEpsQuota> quotas) {
        this.quotas = quotas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoSqlModiflyEpsQuotasRequestBody that = (NoSqlModiflyEpsQuotasRequestBody) obj;
        return Objects.equals(this.quotas, that.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoSqlModiflyEpsQuotasRequestBody {\n");
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
