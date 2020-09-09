package com.huaweicloud.sdk.kms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.Quotas;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowUserQuotasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quotas")
    
    private Quotas quotas = null;

    public ShowUserQuotasResponse withQuotas(Quotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowUserQuotasResponse withQuotas(Consumer<Quotas> quotasSetter) {
        if(this.quotas == null ){
            this.quotas = new Quotas();
            quotasSetter.accept(this.quotas);
        }
        
        return this;
    }


    /**
     * Get quotas
     * @return quotas
     */
    public Quotas getQuotas() {
        return quotas;
    }

    public void setQuotas(Quotas quotas) {
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
        ShowUserQuotasResponse showUserQuotasResponse = (ShowUserQuotasResponse) o;
        return Objects.equals(this.quotas, showUserQuotasResponse.quotas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserQuotasResponse {\n");
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

