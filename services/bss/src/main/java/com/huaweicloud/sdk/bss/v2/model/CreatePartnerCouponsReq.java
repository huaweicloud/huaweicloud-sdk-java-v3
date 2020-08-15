package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreatePartnerCouponsReq
 */
public class CreatePartnerCouponsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_types")
    
    private List<String> cloudServiceTypes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_ids")
    
    private List<String> customerIds = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="face_value")
    
    private BigDecimal faceValue = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memo")
    
    private String memo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_ids")
    
    private List<String> productIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_id")
    
    private String quotaId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="valid_time")
    
    private String validTime;

    public CreatePartnerCouponsReq withCloudServiceTypes(List<String> cloudServiceTypes) {
        this.cloudServiceTypes = cloudServiceTypes;
        return this;
    }

    
    public CreatePartnerCouponsReq addCloudServiceTypesItem(String cloudServiceTypesItem) {
        if (this.cloudServiceTypes == null) {
            this.cloudServiceTypes = new ArrayList<>();
        }
        this.cloudServiceTypes.add(cloudServiceTypesItem);
        return this;
    }

    public CreatePartnerCouponsReq withCloudServiceTypes(Consumer<List<String>> cloudServiceTypesSetter) {
        if(this.cloudServiceTypes == null ){
            this.cloudServiceTypes = new ArrayList<>();
        }
        cloudServiceTypesSetter.accept(this.cloudServiceTypes);
        return this;
    }

    /**
     * |参数名称：云服务限制| |参数约束以及描述：云服务限制|
     * @return cloudServiceTypes
     */
    public List<String> getCloudServiceTypes() {
        return cloudServiceTypes;
    }

    public void setCloudServiceTypes(List<String> cloudServiceTypes) {
        this.cloudServiceTypes = cloudServiceTypes;
    }

    public CreatePartnerCouponsReq withCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }

    
    public CreatePartnerCouponsReq addCustomerIdsItem(String customerIdsItem) {
        this.customerIds.add(customerIdsItem);
        return this;
    }

    public CreatePartnerCouponsReq withCustomerIds(Consumer<List<String>> customerIdsSetter) {
        if(this.customerIds == null ){
            this.customerIds = new ArrayList<>();
        }
        customerIdsSetter.accept(this.customerIds);
        return this;
    }

    /**
     * |参数名称：客户ID列表| |参数约束以及描述：客户ID列表|
     * @return customerIds
     */
    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public CreatePartnerCouponsReq withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * |参数名称：优惠券的失效时间,UTC格式：yyyy-MM-ddTHH:mm:ssZ| |参数约束及描述：优惠券的失效时间,UTC格式：yyyy-MM-ddTHH:mm:ssZ|
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CreatePartnerCouponsReq withFaceValue(BigDecimal faceValue) {
        this.faceValue = faceValue;
        return this;
    }

    


    /**
     * |参数名称：优惠券的面值：小数点后2位。浮点数精度为：小数点后两位| |参数的约束及描述：优惠券的面值：小数点后2位|
     * minimum: 0.01
     * maximum: 99999999999
     * @return faceValue
     */
    public BigDecimal getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(BigDecimal faceValue) {
        this.faceValue = faceValue;
    }

    public CreatePartnerCouponsReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * |参数名称：二级经销商ID| |参数约束及描述：如果一级经销商要给二级经销商的子客户设置折扣，需要携带这个字段|
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public CreatePartnerCouponsReq withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    


    /**
     * |参数名称：发券时的备注信息| |参数约束及描述：发券时的备注信息|
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public CreatePartnerCouponsReq withProductIds(List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    
    public CreatePartnerCouponsReq addProductIdsItem(String productIdsItem) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.add(productIdsItem);
        return this;
    }

    public CreatePartnerCouponsReq withProductIds(Consumer<List<String>> productIdsSetter) {
        if(this.productIds == null ){
            this.productIds = new ArrayList<>();
        }
        productIdsSetter.accept(this.productIds);
        return this;
    }

    /**
     * |参数名称：产品限制| |参数约束以及描述：产品限制|
     * @return productIds
     */
    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public CreatePartnerCouponsReq withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    


    /**
     * |参数名称：优惠券额度ID优惠券的类型跟随额度中的类型。| |参数约束及描述：优惠券额度ID优惠券的类型跟随额度中的类型。|
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    public CreatePartnerCouponsReq withValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }

    


    /**
     * |参数名称：优惠券的生效时间,UTC格式：yyyy-MM-ddTHH:mm:ssZ| |参数约束及描述：优惠券的生效时间,UTC格式：yyyy-MM-ddTHH:mm:ssZ|
     * @return validTime
     */
    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePartnerCouponsReq createPartnerCouponsReq = (CreatePartnerCouponsReq) o;
        return Objects.equals(this.cloudServiceTypes, createPartnerCouponsReq.cloudServiceTypes) &&
            Objects.equals(this.customerIds, createPartnerCouponsReq.customerIds) &&
            Objects.equals(this.expireTime, createPartnerCouponsReq.expireTime) &&
            Objects.equals(this.faceValue, createPartnerCouponsReq.faceValue) &&
            Objects.equals(this.indirectPartnerId, createPartnerCouponsReq.indirectPartnerId) &&
            Objects.equals(this.memo, createPartnerCouponsReq.memo) &&
            Objects.equals(this.productIds, createPartnerCouponsReq.productIds) &&
            Objects.equals(this.quotaId, createPartnerCouponsReq.quotaId) &&
            Objects.equals(this.validTime, createPartnerCouponsReq.validTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceTypes, customerIds, expireTime, faceValue, indirectPartnerId, memo, productIds, quotaId, validTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePartnerCouponsReq {\n");
        sb.append("    cloudServiceTypes: ").append(toIndentedString(cloudServiceTypes)).append("\n");
        sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    faceValue: ").append(toIndentedString(faceValue)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    validTime: ").append(toIndentedString(validTime)).append("\n");
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

