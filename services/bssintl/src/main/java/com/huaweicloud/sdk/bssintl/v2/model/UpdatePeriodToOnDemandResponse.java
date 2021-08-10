package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdatePeriodToOnDemandResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_details")

    private List<ErrorDetail> errorDetails = null;

    public UpdatePeriodToOnDemandResponse withErrorDetails(List<ErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    public UpdatePeriodToOnDemandResponse addErrorDetailsItem(ErrorDetail errorDetailsItem) {
        if (this.errorDetails == null) {
            this.errorDetails = new ArrayList<>();
        }
        this.errorDetails.add(errorDetailsItem);
        return this;
    }

    public UpdatePeriodToOnDemandResponse withErrorDetails(Consumer<List<ErrorDetail>> errorDetailsSetter) {
        if (this.errorDetails == null) {
            this.errorDetails = new ArrayList<>();
        }
        errorDetailsSetter.accept(this.errorDetails);
        return this;
    }

    /** |参数名称：返回数据| |参数约束以及描述：返回数据 HTTP 200的时候返回该字段，部分成功部分失败的时候返回的失败记录，如果全成功，该记录为空|
     * 
     * @return errorDetails */
    public List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(List<ErrorDetail> errorDetails) {
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
        UpdatePeriodToOnDemandResponse updatePeriodToOnDemandResponse = (UpdatePeriodToOnDemandResponse) o;
        return Objects.equals(this.errorDetails, updatePeriodToOnDemandResponse.errorDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePeriodToOnDemandResponse {\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
