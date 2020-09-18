package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.CustomerErrorDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UnfreezeSubCustomersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_details")
    
    private List<CustomerErrorDetail> errorDetails = null;
    
    public UnfreezeSubCustomersResponse withErrorDetails(List<CustomerErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    
    public UnfreezeSubCustomersResponse addErrorDetailsItem(CustomerErrorDetail errorDetailsItem) {
        if (this.errorDetails == null) {
            this.errorDetails = new ArrayList<>();
        }
        this.errorDetails.add(errorDetailsItem);
        return this;
    }

    public UnfreezeSubCustomersResponse withErrorDetails(Consumer<List<CustomerErrorDetail>> errorDetailsSetter) {
        if(this.errorDetails == null ){
            this.errorDetails = new ArrayList<>();
        }
        errorDetailsSetter.accept(this.errorDetails);
        return this;
    }

    /**
     * |参数名称：错误原因，部分成功部分失败的时候会返回失败的客户列表和错误原因。注意这个结构体在HTTP 200的时候返回| |参数约束以及描述：错误原因，部分成功部分失败的时候会返回失败的客户列表和错误原因。注意这个结构体在HTTP 200的时候返回|
     * @return errorDetails
     */
    public List<CustomerErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(List<CustomerErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnfreezeSubCustomersResponse unfreezeSubCustomersResponse = (UnfreezeSubCustomersResponse) o;
        return Objects.equals(this.errorDetails, unfreezeSubCustomersResponse.errorDetails);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorDetails);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnfreezeSubCustomersResponse {\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

