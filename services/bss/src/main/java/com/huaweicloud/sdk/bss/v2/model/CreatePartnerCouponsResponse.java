package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.CouponSimpleInfo;
import com.huaweicloud.sdk.bss.v2.model.ErrorDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreatePartnerCouponsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_details")
    
    private List<ErrorDetail> errorDetails = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_infos")
    
    private List<CouponSimpleInfo> couponInfos = null;
    
    public CreatePartnerCouponsResponse withErrorDetails(List<ErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    
    public CreatePartnerCouponsResponse addErrorDetailsItem(ErrorDetail errorDetailsItem) {
        if (this.errorDetails == null) {
            this.errorDetails = new ArrayList<>();
        }
        this.errorDetails.add(errorDetailsItem);
        return this;
    }

    public CreatePartnerCouponsResponse withErrorDetails(Consumer<List<ErrorDetail>> errorDetailsSetter) {
        if(this.errorDetails == null ){
            this.errorDetails = new ArrayList<>();
        }
        errorDetailsSetter.accept(this.errorDetails);
        return this;
    }

    /**
     * |参数名称：错误的客户列表和错误信息| |参数约束以及描述：错误的客户列表和错误信息|
     * @return errorDetails
     */
    public List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(List<ErrorDetail> errorDetails) {
        this.errorDetails = errorDetails;
    }

    public CreatePartnerCouponsResponse withCouponInfos(List<CouponSimpleInfo> couponInfos) {
        this.couponInfos = couponInfos;
        return this;
    }

    
    public CreatePartnerCouponsResponse addCouponInfosItem(CouponSimpleInfo couponInfosItem) {
        if (this.couponInfos == null) {
            this.couponInfos = new ArrayList<>();
        }
        this.couponInfos.add(couponInfosItem);
        return this;
    }

    public CreatePartnerCouponsResponse withCouponInfos(Consumer<List<CouponSimpleInfo>> couponInfosSetter) {
        if(this.couponInfos == null ){
            this.couponInfos = new ArrayList<>();
        }
        couponInfosSetter.accept(this.couponInfos);
        return this;
    }

    /**
     * |参数名称：成功的客户ID和对应的券ID列表| |参数约束以及描述：成功的客户ID和对应的券ID列表|
     * @return couponInfos
     */
    public List<CouponSimpleInfo> getCouponInfos() {
        return couponInfos;
    }

    public void setCouponInfos(List<CouponSimpleInfo> couponInfos) {
        this.couponInfos = couponInfos;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePartnerCouponsResponse createPartnerCouponsResponse = (CreatePartnerCouponsResponse) o;
        return Objects.equals(this.errorDetails, createPartnerCouponsResponse.errorDetails) &&
            Objects.equals(this.couponInfos, createPartnerCouponsResponse.couponInfos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorDetails, couponInfos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePartnerCouponsResponse {\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    couponInfos: ").append(toIndentedString(couponInfos)).append("\n");
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

