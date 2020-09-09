package com.huaweicloud.sdk.dms.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dms.v2.model.ShowQuotasRespQuotas;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowQuotasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quotas")
    
    private ShowQuotasRespQuotas quotas = null;

    public ShowQuotasResponse withQuotas(ShowQuotasRespQuotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowQuotasResponse withQuotas(Consumer<ShowQuotasRespQuotas> quotasSetter) {
        if(this.quotas == null ){
            this.quotas = new ShowQuotasRespQuotas();
            quotasSetter.accept(this.quotas);
        }
        
        return this;
    }


    /**
     * Get quotas
     * @return quotas
     */
    public ShowQuotasRespQuotas getQuotas() {
        return quotas;
    }

    public void setQuotas(ShowQuotasRespQuotas quotas) {
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
        ShowQuotasResponse showQuotasResponse = (ShowQuotasResponse) o;
        return Objects.equals(this.quotas, showQuotasResponse.quotas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotasResponse {\n");
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

