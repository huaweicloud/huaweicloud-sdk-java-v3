package com.huaweicloud.sdk.cdn.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.ShowQuotaResponseBodyQuotas;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowQuotaResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quotas")
    
    private List<ShowQuotaResponseBodyQuotas> quotas = null;
    
    public ShowQuotaResponse withQuotas(List<ShowQuotaResponseBodyQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }

    
    public ShowQuotaResponse addQuotasItem(ShowQuotaResponseBodyQuotas quotasItem) {
        if(this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    public ShowQuotaResponse withQuotas(Consumer<List<ShowQuotaResponseBodyQuotas>> quotasSetter) {
        if(this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        quotasSetter.accept(this.quotas);
        return this;
    }

    /**
     * 配额数组
     * @return quotas
     */
    public List<ShowQuotaResponseBodyQuotas> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<ShowQuotaResponseBodyQuotas> quotas) {
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
        ShowQuotaResponse showQuotaResponse = (ShowQuotaResponse) o;
        return Objects.equals(this.quotas, showQuotaResponse.quotas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotaResponse {\n");
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

