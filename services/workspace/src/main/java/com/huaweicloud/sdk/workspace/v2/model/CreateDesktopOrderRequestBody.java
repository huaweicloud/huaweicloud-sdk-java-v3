package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建桌面订单请求体。
 */
public class CreateDesktopOrderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour_package_resources")

    private List<HourPackageResource> hourPackageResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_id")

    private String promotionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_id")

    private String promotionPlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private OrderExtendParam extendParam;

    public CreateDesktopOrderRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认\"0\"
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateDesktopOrderRequestBody withHourPackageResources(List<HourPackageResource> hourPackageResources) {
        this.hourPackageResources = hourPackageResources;
        return this;
    }

    public CreateDesktopOrderRequestBody addHourPackageResourcesItem(HourPackageResource hourPackageResourcesItem) {
        if (this.hourPackageResources == null) {
            this.hourPackageResources = new ArrayList<>();
        }
        this.hourPackageResources.add(hourPackageResourcesItem);
        return this;
    }

    public CreateDesktopOrderRequestBody withHourPackageResources(
        Consumer<List<HourPackageResource>> hourPackageResourcesSetter) {
        if (this.hourPackageResources == null) {
            this.hourPackageResources = new ArrayList<>();
        }
        hourPackageResourcesSetter.accept(this.hourPackageResources);
        return this;
    }

    /**
     * 小时包资源
     * @return hourPackageResources
     */
    public List<HourPackageResource> getHourPackageResources() {
        return hourPackageResources;
    }

    public void setHourPackageResources(List<HourPackageResource> hourPackageResources) {
        this.hourPackageResources = hourPackageResources;
    }

    public CreateDesktopOrderRequestBody withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 组合购订单ID
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreateDesktopOrderRequestBody withPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    /**
     * 促销ID
     * @return promotionId
     */
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public CreateDesktopOrderRequestBody withPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
        return this;
    }

    /**
     * 促销计划ID
     * @return promotionPlanId
     */
    public String getPromotionPlanId() {
        return promotionPlanId;
    }

    public void setPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
    }

    public CreateDesktopOrderRequestBody withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * 促销信息
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public CreateDesktopOrderRequestBody withExtendParam(OrderExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreateDesktopOrderRequestBody withExtendParam(Consumer<OrderExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new OrderExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public OrderExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(OrderExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDesktopOrderRequestBody that = (CreateDesktopOrderRequestBody) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.hourPackageResources, that.hourPackageResources)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.promotionId, that.promotionId)
            && Objects.equals(this.promotionPlanId, that.promotionPlanId)
            && Objects.equals(this.promotionInfo, that.promotionInfo)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            hourPackageResources,
            orderId,
            promotionId,
            promotionPlanId,
            promotionInfo,
            extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDesktopOrderRequestBody {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    hourPackageResources: ").append(toIndentedString(hourPackageResources)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
