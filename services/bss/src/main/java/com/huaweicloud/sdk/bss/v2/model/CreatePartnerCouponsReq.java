package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreatePartnerCouponsReq
 */
public class CreatePartnerCouponsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_id")
    
    private String quotaId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_ids")
    
    private List<String> customerIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="face_value")
    
    private Double faceValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="valid_time")
    
    private String validTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_types")
    
    private List<String> cloudServiceTypes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_ids")
    
    private List<String> productIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memo")
    
    private String memo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public CreatePartnerCouponsReq withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    


    /**
     * 优惠券额度ID。该值在查询优惠券额度接口的响应参数中获取。
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    

    public CreatePartnerCouponsReq withCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }

    
    public CreatePartnerCouponsReq addCustomerIdsItem(String customerIdsItem) {
        if(this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        this.customerIds.add(customerIdsItem);
        return this;
    }

    public CreatePartnerCouponsReq withCustomerIds(Consumer<List<String>> customerIdsSetter) {
        if(this.customerIds == null) {
            this.customerIds = new ArrayList<>();
        }
        customerIdsSetter.accept(this.customerIds);
        return this;
    }

    /**
     * 客户账号ID。您可以调用查询客户列表接口获取customer_id。
     * @return customerIds
     */
    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    

    public CreatePartnerCouponsReq withFaceValue(Double faceValue) {
        this.faceValue = faceValue;
        return this;
    }

    


    /**
     * 代金券面值。 单位：元。取值大于0且精确到小数点后2位。
     * minimum: 0.01
     * maximum: 99999999999
     * @return faceValue
     */
    public Double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Double faceValue) {
        this.faceValue = faceValue;
    }

    

    public CreatePartnerCouponsReq withValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }

    


    /**
     * 生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return validTime
     */
    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    

    public CreatePartnerCouponsReq withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * 失效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    

    public CreatePartnerCouponsReq withCloudServiceTypes(List<String> cloudServiceTypes) {
        this.cloudServiceTypes = cloudServiceTypes;
        return this;
    }

    
    public CreatePartnerCouponsReq addCloudServiceTypesItem(String cloudServiceTypesItem) {
        if(this.cloudServiceTypes == null) {
            this.cloudServiceTypes = new ArrayList<>();
        }
        this.cloudServiceTypes.add(cloudServiceTypesItem);
        return this;
    }

    public CreatePartnerCouponsReq withCloudServiceTypes(Consumer<List<String>> cloudServiceTypesSetter) {
        if(this.cloudServiceTypes == null) {
            this.cloudServiceTypes = new ArrayList<>();
        }
        cloudServiceTypesSetter.accept(this.cloudServiceTypes);
        return this;
    }

    /**
     * 允许使用的云服务列表，您可以调用查询云服务类型列表接口获取。 多个云服务产品以“,”隔开，最多支持10个。 默认：空（继承额度上的限制）  说明： 如果额度上有限制云服务类型列表，则优惠券上的限制不能超过额度的限制。如果额度上没有限制，则优惠券上可以随意指定云服务类型。
     * @return cloudServiceTypes
     */
    public List<String> getCloudServiceTypes() {
        return cloudServiceTypes;
    }

    public void setCloudServiceTypes(List<String> cloudServiceTypes) {
        this.cloudServiceTypes = cloudServiceTypes;
    }

    

    public CreatePartnerCouponsReq withProductIds(List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    
    public CreatePartnerCouponsReq addProductIdsItem(String productIdsItem) {
        if(this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.add(productIdsItem);
        return this;
    }

    public CreatePartnerCouponsReq withProductIds(Consumer<List<String>> productIdsSetter) {
        if(this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        productIdsSetter.accept(this.productIds);
        return this;
    }

    /**
     * 允许使用的产品列表。 多个产品以“,”隔开，最多支持10个。 默认：空（继承额度上的限制）  说明： 如果额度上有限制产品列表，则优惠券上的限制不能超过额度的限制。如果额度上没有限制，则优惠券上可以随意指定产品ID。 产品ID需要合作伙伴通过线下获得。
     * @return productIds
     */
    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    

    public CreatePartnerCouponsReq withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    


    /**
     * 发券时的备注信息。
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    

    public CreatePartnerCouponsReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * 精英服务商ID。获取方法请参见查询精英服务商列表。 精英服务商给子客户发放优惠券时，需要携带该参数。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
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
        return Objects.equals(this.quotaId, createPartnerCouponsReq.quotaId) &&
            Objects.equals(this.customerIds, createPartnerCouponsReq.customerIds) &&
            Objects.equals(this.faceValue, createPartnerCouponsReq.faceValue) &&
            Objects.equals(this.validTime, createPartnerCouponsReq.validTime) &&
            Objects.equals(this.expireTime, createPartnerCouponsReq.expireTime) &&
            Objects.equals(this.cloudServiceTypes, createPartnerCouponsReq.cloudServiceTypes) &&
            Objects.equals(this.productIds, createPartnerCouponsReq.productIds) &&
            Objects.equals(this.memo, createPartnerCouponsReq.memo) &&
            Objects.equals(this.indirectPartnerId, createPartnerCouponsReq.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotaId, customerIds, faceValue, validTime, expireTime, cloudServiceTypes, productIds, memo, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePartnerCouponsReq {\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
        sb.append("    faceValue: ").append(toIndentedString(faceValue)).append("\n");
        sb.append("    validTime: ").append(toIndentedString(validTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    cloudServiceTypes: ").append(toIndentedString(cloudServiceTypes)).append("\n");
        sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
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

