package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FreeResourcePackageV3
 */
public class FreeResourcePackageV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_instance_id")

    private String orderInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_scope")

    private Integer enterpriseProjectScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_name")

    private String serviceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private Integer sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bundle_type")

    private String bundleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_reuse_mode")

    private Integer quotaReuseMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resources")

    private List<FreeResourceV3> freeResources = null;

    public FreeResourcePackageV3 withOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
        return this;
    }

    /**
     * 订购资源包产品后，系统生成的ID，是这个资源包列表的标识字段。
     * @return orderInstanceId
     */
    public String getOrderInstanceId() {
        return orderInstanceId;
    }

    public void setOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
    }

    public FreeResourcePackageV3 withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID，如果source_type为“1：软开云赠送”，该字段为空。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public FreeResourcePackageV3 withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID，即资源包ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public FreeResourcePackageV3 withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 产品名称，即资源包名称。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public FreeResourcePackageV3 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public FreeResourcePackageV3 withEnterpriseProjectScope(Integer enterpriseProjectScope) {
        this.enterpriseProjectScope = enterpriseProjectScope;
        return this;
    }

    /**
     * 企业项目应用范围： 0：应用所有1：应用到具体企业项目
     * @return enterpriseProjectScope
     */
    public Integer getEnterpriseProjectScope() {
        return enterpriseProjectScope;
    }

    public void setEnterpriseProjectScope(Integer enterpriseProjectScope) {
        this.enterpriseProjectScope = enterpriseProjectScope;
    }

    public FreeResourcePackageV3 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 生效时间，购买资源包的时间，格式UTC。
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public FreeResourcePackageV3 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 失效时间，资源包到期时间，格式UTC。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public FreeResourcePackageV3 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态： 0：未生效1：生效中2：已用完3：已失效4：已退订
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public FreeResourcePackageV3 withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public FreeResourcePackageV3 withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * 云服务类型名称。例如ECS的云服务类型名称为“弹性云服务器”。
     * @return serviceTypeName
     */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public FreeResourcePackageV3 withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 云服务区编码，例如：“ap-southeast-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public FreeResourcePackageV3 withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 资源包的来源类型： 0：订单1：软开云赠送
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public FreeResourcePackageV3 withBundleType(String bundleType) {
        this.bundleType = bundleType;
        return this;
    }

    /**
     * 套餐绑定类型： ATOMIC_PKG：原子套餐BUNDLE_PKG：组合套餐
     * @return bundleType
     */
    public String getBundleType() {
        return bundleType;
    }

    public void setBundleType(String bundleType) {
        this.bundleType = bundleType;
    }

    public FreeResourcePackageV3 withQuotaReuseMode(Integer quotaReuseMode) {
        this.quotaReuseMode = quotaReuseMode;
        return this;
    }

    /**
     * 使用模式。 1：可重置表示购买的资源包能够按照一定的周期恢复使用量。例如购买一个1年的按需资源包，使用量是40G，可重置，重置周期为1个月，表示1年内每个月会给予40G的使用量。 2：不可重置表示购买的资源包的使用量不会恢复。例如购买一个1年的按需资源包，使用量是40G，不可重置，表示1年内一共给予40G的使用量。
     * @return quotaReuseMode
     */
    public Integer getQuotaReuseMode() {
        return quotaReuseMode;
    }

    public void setQuotaReuseMode(Integer quotaReuseMode) {
        this.quotaReuseMode = quotaReuseMode;
    }

    public FreeResourcePackageV3 withFreeResources(List<FreeResourceV3> freeResources) {
        this.freeResources = freeResources;
        return this;
    }

    public FreeResourcePackageV3 addFreeResourcesItem(FreeResourceV3 freeResourcesItem) {
        if (this.freeResources == null) {
            this.freeResources = new ArrayList<>();
        }
        this.freeResources.add(freeResourcesItem);
        return this;
    }

    public FreeResourcePackageV3 withFreeResources(Consumer<List<FreeResourceV3>> freeResourcesSetter) {
        if (this.freeResources == null) {
            this.freeResources = new ArrayList<>();
        }
        freeResourcesSetter.accept(this.freeResources);
        return this;
    }

    /**
     * 资源套餐内的资源项信息（资源项ID级的详情），具体参见表3。
     * @return freeResources
     */
    public List<FreeResourceV3> getFreeResources() {
        return freeResources;
    }

    public void setFreeResources(List<FreeResourceV3> freeResources) {
        this.freeResources = freeResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FreeResourcePackageV3 that = (FreeResourcePackageV3) obj;
        return Objects.equals(this.orderInstanceId, that.orderInstanceId) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectScope, that.enterpriseProjectScope)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.serviceTypeCode, that.serviceTypeCode)
            && Objects.equals(this.serviceTypeName, that.serviceTypeName)
            && Objects.equals(this.regionCode, that.regionCode) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.bundleType, that.bundleType)
            && Objects.equals(this.quotaReuseMode, that.quotaReuseMode)
            && Objects.equals(this.freeResources, that.freeResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderInstanceId,
            orderId,
            productId,
            productName,
            enterpriseProjectId,
            enterpriseProjectScope,
            effectiveTime,
            expireTime,
            status,
            serviceTypeCode,
            serviceTypeName,
            regionCode,
            sourceType,
            bundleType,
            quotaReuseMode,
            freeResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreeResourcePackageV3 {\n");
        sb.append("    orderInstanceId: ").append(toIndentedString(orderInstanceId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectScope: ").append(toIndentedString(enterpriseProjectScope)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    bundleType: ").append(toIndentedString(bundleType)).append("\n");
        sb.append("    quotaReuseMode: ").append(toIndentedString(quotaReuseMode)).append("\n");
        sb.append("    freeResources: ").append(toIndentedString(freeResources)).append("\n");
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
