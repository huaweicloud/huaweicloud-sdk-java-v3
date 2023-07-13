package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成订单接口请求参数。
 */
public class CreateInstanceOrder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_key")

    private Integer instanceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_infos")

    private List<ProductInfos> productInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_num")

    private Integer subscriptionNum;

    public CreateInstanceOrder withInstanceKey(Integer instanceKey) {
        this.instanceKey = instanceKey;
        return this;
    }

    /**
     * 云堡垒机实例key。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return instanceKey
     */
    public Integer getInstanceKey() {
        return instanceKey;
    }

    public void setInstanceKey(Integer instanceKey) {
        this.instanceKey = instanceKey;
    }

    public CreateInstanceOrder withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型，默认填写“hws.service.type.cbh”。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public CreateInstanceOrder withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 云堡垒机实例局点ID。 可参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateInstanceOrder withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。 - 0 包周期计费。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CreateInstanceOrder withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型。 - 2：月 - 3：年
     * minimum: 0
     * maximum: 9223372036854775807
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public CreateInstanceOrder withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数。 - period_type=2（周期类型为月），取值范围[1，9] - periodType=3（周期类型为年），取值范围[1，10]
     * minimum: 0
     * maximum: 9223372036854775807
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public CreateInstanceOrder withProductInfos(List<ProductInfos> productInfos) {
        this.productInfos = productInfos;
        return this;
    }

    public CreateInstanceOrder addProductInfosItem(ProductInfos productInfosItem) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        this.productInfos.add(productInfosItem);
        return this;
    }

    public CreateInstanceOrder withProductInfos(Consumer<List<ProductInfos>> productInfosSetter) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        productInfosSetter.accept(this.productInfos);
        return this;
    }

    /**
     * 产品信息
     * @return productInfos
     */
    public List<ProductInfos> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfos> productInfos) {
        this.productInfos = productInfos;
    }

    public CreateInstanceOrder withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订。 - 1，自动续订 - 0，不自动续订（默认）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public CreateInstanceOrder withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    /**
     * 订购数量。当前仅支持订购1个，填写默认值1。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return subscriptionNum
     */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceOrder that = (CreateInstanceOrder) obj;
        return Objects.equals(this.instanceKey, that.instanceKey)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.productInfos, that.productInfos)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.subscriptionNum, that.subscriptionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceKey,
            cloudServiceType,
            regionId,
            chargingMode,
            periodType,
            periodNum,
            productInfos,
            isAutoRenew,
            subscriptionNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceOrder {\n");
        sb.append("    instanceKey: ").append(toIndentedString(instanceKey)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
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
