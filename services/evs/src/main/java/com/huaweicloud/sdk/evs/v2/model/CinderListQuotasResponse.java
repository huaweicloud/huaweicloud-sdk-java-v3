package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.QuotaList;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class CinderListQuotasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_set")
    
    private QuotaList quotaSet = null;

    public CinderListQuotasResponse withQuotaSet(QuotaList quotaSet) {
        this.quotaSet = quotaSet;
        return this;
    }

    public CinderListQuotasResponse withQuotaSet(Consumer<QuotaList> quotaSetSetter) {
        if(this.quotaSet == null ){
            this.quotaSet = new QuotaList();
        }
        quotaSetSetter.accept(this.quotaSet);
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinderListQuotasResponse cinderListQuotasResponse = (CinderListQuotasResponse) o;
        return Objects.equals(this.quotaSet, cinderListQuotasResponse.quotaSet);
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

