package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.PolicyInstanceQuotas;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowPolicyAndInstanceQuotaResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="AllQuotas")
    
    private PolicyInstanceQuotas allQuotas = null;

    public ShowPolicyAndInstanceQuotaResponse withAllQuotas(PolicyInstanceQuotas allQuotas) {
        this.allQuotas = allQuotas;
        return this;
    }

    public ShowPolicyAndInstanceQuotaResponse withAllQuotas(Consumer<PolicyInstanceQuotas> allQuotasSetter) {
        if(this.allQuotas == null ){
            this.allQuotas = new PolicyInstanceQuotas();
        }
        allQuotasSetter.accept(this.allQuotas);
        return this;
    }


    /**
     * Get allQuotas
     * @return allQuotas
     */
    public PolicyInstanceQuotas getAllQuotas() {
        return allQuotas;
    }

    public void setAllQuotas(PolicyInstanceQuotas allQuotas) {
        this.allQuotas = allQuotas;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPolicyAndInstanceQuotaResponse showPolicyAndInstanceQuotaResponse = (ShowPolicyAndInstanceQuotaResponse) o;
        return Objects.equals(this.allQuotas, showPolicyAndInstanceQuotaResponse.allQuotas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(allQuotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPolicyAndInstanceQuotaResponse {\n");
            sb.append("    allQuotas: ").append(toIndentedString(allQuotas)).append("\n");
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

