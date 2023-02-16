package com.huaweicloud.sdk.ges.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.GesQuotaResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListQuotasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorMessage")
    
    
    private String errorMessage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorCode")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quotas")
    
    
    private GesQuotaResp quotas;

    public ListQuotasResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    public ListQuotasResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public ListQuotasResponse withQuotas(GesQuotaResp quotas) {
        this.quotas = quotas;
        return this;
    }

    public ListQuotasResponse withQuotas(Consumer<GesQuotaResp> quotasSetter) {
        if(this.quotas == null ){
            this.quotas = new GesQuotaResp();
            quotasSetter.accept(this.quotas);
        }
        
        return this;
    }


    /**
     * Get quotas
     * @return quotas
     */
    public GesQuotaResp getQuotas() {
        return quotas;
    }

    public void setQuotas(GesQuotaResp quotas) {
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
        ListQuotasResponse listQuotasResponse = (ListQuotasResponse) o;
        return Objects.equals(this.errorMessage, listQuotasResponse.errorMessage) &&
            Objects.equals(this.errorCode, listQuotasResponse.errorCode) &&
            Objects.equals(this.quotas, listQuotasResponse.quotas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorMessage, errorCode, quotas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotasResponse {\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

