package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.AllQuotas;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowResourceQuotaResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quotas")
    
    private AllQuotas quotas = null;

    public ShowResourceQuotaResponse withQuotas(AllQuotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowResourceQuotaResponse withQuotas(Consumer<AllQuotas> quotasSetter) {
        if(this.quotas == null ){
            this.quotas = new AllQuotas();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }


    /**
     * Get quotas
     * @return quotas
     */
    public AllQuotas getQuotas() {
        return quotas;
    }

    public void setQuotas(AllQuotas quotas) {
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
        ShowResourceQuotaResponse showResourceQuotaResponse = (ShowResourceQuotaResponse) o;
        return Objects.equals(this.quotas, showResourceQuotaResponse.quotas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceQuotaResponse {\n");
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

