package com.huaweicloud.sdk.aom.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DeleteserviceDiscoveryRulesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorCode")
    
    @JacksonXmlProperty(localName = "errorCode")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorMessage")
    
    @JacksonXmlProperty(localName = "errorMessage")
    
    private String errorMessage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="responseStatus")
    
    @JacksonXmlProperty(localName = "responseStatus")
    
    private Integer responseStatus;

    public DeleteserviceDiscoveryRulesResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 响应码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public DeleteserviceDiscoveryRulesResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 响应信息描述。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    public DeleteserviceDiscoveryRulesResponse withResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }

    


    /**
     * 响应状态码。
     * @return responseStatus
     */
    public Integer getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteserviceDiscoveryRulesResponse deleteserviceDiscoveryRulesResponse = (DeleteserviceDiscoveryRulesResponse) o;
        return Objects.equals(this.errorCode, deleteserviceDiscoveryRulesResponse.errorCode) &&
            Objects.equals(this.errorMessage, deleteserviceDiscoveryRulesResponse.errorMessage) &&
            Objects.equals(this.responseStatus, deleteserviceDiscoveryRulesResponse.responseStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMessage, responseStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteserviceDiscoveryRulesResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
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

