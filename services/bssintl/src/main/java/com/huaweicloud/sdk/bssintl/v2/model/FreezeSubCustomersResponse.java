package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class FreezeSubCustomersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_details")

    private List<CustomerErrorDetail> errorDetails = null;

    public FreezeSubCustomersResponse withErrorDetails(List<CustomerErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    public FreezeSubCustomersResponse addErrorDetailsItem(CustomerErrorDetail errorDetailsItem) {
        if (this.errorDetails == null) {
            this.errorDetails = new ArrayList<>();
        }
        this.errorDetails.add(errorDetailsItem);
        return this;
    }

    public FreezeSubCustomersResponse withErrorDetails(Consumer<List<CustomerErrorDetail>> errorDetailsSetter) {
        if (this.errorDetails == null) {
            this.errorDetails = new ArrayList<>();
        }
        errorDetailsSetter.accept(this.errorDetails);
        return this;
    }

    /**
     * 错误原因，只有部分失败的时候才返回。 具体请参见表1。
     * @return errorDetails
     */
    public List<CustomerErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(List<CustomerErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FreezeSubCustomersResponse that = (FreezeSubCustomersResponse) obj;
        return Objects.equals(this.errorDetails, that.errorDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreezeSubCustomersResponse {\n");
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
