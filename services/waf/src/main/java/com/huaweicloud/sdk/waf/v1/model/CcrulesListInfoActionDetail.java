package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.CcrulesListInfoActionDetailResponse;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 动作详情
 */
public class CcrulesListInfoActionDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redirect_url")
    
    private String redirectUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="response")
    
    private CcrulesListInfoActionDetailResponse response;

    public CcrulesListInfoActionDetail withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    


    /**
     * 返回页面重定向的url
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    

    public CcrulesListInfoActionDetail withResponse(CcrulesListInfoActionDetailResponse response) {
        this.response = response;
        return this;
    }

    public CcrulesListInfoActionDetail withResponse(Consumer<CcrulesListInfoActionDetailResponse> responseSetter) {
        if(this.response == null ){
            this.response = new CcrulesListInfoActionDetailResponse();
            responseSetter.accept(this.response);
        }
        
        return this;
    }


    /**
     * Get response
     * @return response
     */
    public CcrulesListInfoActionDetailResponse getResponse() {
        return response;
    }

    public void setResponse(CcrulesListInfoActionDetailResponse response) {
        this.response = response;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CcrulesListInfoActionDetail ccrulesListInfoActionDetail = (CcrulesListInfoActionDetail) o;
        return Objects.equals(this.redirectUrl, ccrulesListInfoActionDetail.redirectUrl) &&
            Objects.equals(this.response, ccrulesListInfoActionDetail.response);
    }
    @Override
    public int hashCode() {
        return Objects.hash(redirectUrl, response);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CcrulesListInfoActionDetail {\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

