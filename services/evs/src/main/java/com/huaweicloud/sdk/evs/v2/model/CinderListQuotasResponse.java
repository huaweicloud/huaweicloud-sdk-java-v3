package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CinderListQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_set")

    private QuotaList quotaSet;

    public CinderListQuotasResponse withQuotaSet(QuotaList quotaSet) {
        this.quotaSet = quotaSet;
        return this;
    }

    public CinderListQuotasResponse withQuotaSet(Consumer<QuotaList> quotaSetSetter) {
        if (this.quotaSet == null) {
            this.quotaSet = new QuotaList();
            quotaSetSetter.accept(this.quotaSet);
        }

        return this;
    }

    /**
     * Get quotaSet
     * @return quotaSet
     */
    public QuotaList getQuotaSet() {
        return quotaSet;
    }

    public void setQuotaSet(QuotaList quotaSet) {
        this.quotaSet = quotaSet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CinderListQuotasResponse that = (CinderListQuotasResponse) obj;
        return Objects.equals(this.quotaSet, that.quotaSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderListQuotasResponse {\n");
        sb.append("    quotaSet: ").append(toIndentedString(quotaSet)).append("\n");
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
