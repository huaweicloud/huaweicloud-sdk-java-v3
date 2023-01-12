package com.huaweicloud.sdk.ges.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ListQuotasRespQuotas;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListQuotas2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quotas")
    
    
    private ListQuotasRespQuotas quotas;

    public ListQuotas2Response withQuotas(ListQuotasRespQuotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public ListQuotas2Response withQuotas(Consumer<ListQuotasRespQuotas> quotasSetter) {
        if(this.quotas == null ){
            this.quotas = new ListQuotasRespQuotas();
            quotasSetter.accept(this.quotas);
        }
        
        return this;
    }


    /**
     * Get quotas
     * @return quotas
     */
    public ListQuotasRespQuotas getQuotas() {
        return quotas;
    }

    public void setQuotas(ListQuotasRespQuotas quotas) {
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
        ListQuotas2Response listQuotas2Response = (ListQuotas2Response) o;
        return Objects.equals(this.quotas, listQuotas2Response.quotas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotas2Response {\n");
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

