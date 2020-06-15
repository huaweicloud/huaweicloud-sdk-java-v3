package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.QueryTenantQuotaRespQuotas;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowQuotaOfTenantResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quotas")
    
    private QueryTenantQuotaRespQuotas quotas = null;

    public ShowQuotaOfTenantResponse withQuotas(QueryTenantQuotaRespQuotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowQuotaOfTenantResponse withQuotas(Consumer<QueryTenantQuotaRespQuotas> quotasSetter) {
        if(this.quotas == null ){
            this.quotas = new QueryTenantQuotaRespQuotas();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }


    /**
     * Get quotas
     * @return quotas
     */
    public QueryTenantQuotaRespQuotas getQuotas() {
        return quotas;
    }

    public void setQuotas(QueryTenantQuotaRespQuotas quotas) {
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
        ShowQuotaOfTenantResponse showQuotaOfTenantResponse = (ShowQuotaOfTenantResponse) o;
        return Objects.equals(this.quotas, showQuotaOfTenantResponse.quotas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotaOfTenantResponse {\n");
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

