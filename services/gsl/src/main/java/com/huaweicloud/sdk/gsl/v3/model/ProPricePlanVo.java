package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ProPricePlanVo */
public class ProPricePlanVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_id")

    private String pricePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_name")

    private String pricePlanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_total")

    private Long flowTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private Integer packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_type")

    private Integer effectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silent_period_day")

    private Integer silentPeriodDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silent_period_unit")

    private Integer silentPeriodUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew")

    private Boolean autoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_desc")

    private String locationDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_type")

    private Integer locationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_type")

    private Integer simType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "carrier_type")

    private Integer carrierType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price")

    private Integer price;

    public ProPricePlanVo withPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }

    /** 套餐ID
     * 
     * @return pricePlanId */
    public String getPricePlanId() {
        return pricePlanId;
    }

    public void setPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
    }

    public ProPricePlanVo withPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
        return this;
    }

    /** 套餐名称
     * 
     * @return pricePlanName */
    public String getPricePlanName() {
        return pricePlanName;
    }

    public void setPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
    }

    public ProPricePlanVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProPricePlanVo withFlowTotal(Long flowTotal) {
        this.flowTotal = flowTotal;
        return this;
    }

    /** 流量总量(MB)
     * 
     * @return flowTotal */
    public Long getFlowTotal() {
        return flowTotal;
    }

    public void setFlowTotal(Long flowTotal) {
        this.flowTotal = flowTotal;
    }

    public ProPricePlanVo withPackageType(Integer packageType) {
        this.packageType = packageType;
        return this;
    }

    /** 套餐类型 1基础套餐;2叠加包套餐;如果是国际漫游不区分基础套餐包和叠加包
     * 
     * @return packageType */
    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }

    public ProPricePlanVo withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /** 套餐周期
     * 
     * @return period */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public ProPricePlanVo withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /** 套餐周期类型 10:日;20:月;30:季;40:半年;50:年
     * 
     * @return periodType */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public ProPricePlanVo withEffectType(Integer effectType) {
        this.effectType = effectType;
        return this;
    }

    /** 套餐生效类型
     * 
     * @return effectType */
    public Integer getEffectType() {
        return effectType;
    }

    public void setEffectType(Integer effectType) {
        this.effectType = effectType;
    }

    public ProPricePlanVo withSilentPeriodDay(Integer silentPeriodDay) {
        this.silentPeriodDay = silentPeriodDay;
        return this;
    }

    /** 沉默期
     * 
     * @return silentPeriodDay */
    public Integer getSilentPeriodDay() {
        return silentPeriodDay;
    }

    public void setSilentPeriodDay(Integer silentPeriodDay) {
        this.silentPeriodDay = silentPeriodDay;
    }

    public ProPricePlanVo withSilentPeriodUnit(Integer silentPeriodUnit) {
        this.silentPeriodUnit = silentPeriodUnit;
        return this;
    }

    /** 沉默期单位 1.年 2.月 3.日
     * 
     * @return silentPeriodUnit */
    public Integer getSilentPeriodUnit() {
        return silentPeriodUnit;
    }

    public void setSilentPeriodUnit(Integer silentPeriodUnit) {
        this.silentPeriodUnit = silentPeriodUnit;
    }

    public ProPricePlanVo withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /** 是否自动续订
     * 
     * @return autoRenew */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    public ProPricePlanVo withLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
        return this;
    }

    /** 套餐适用区域
     * 
     * @return locationDesc */
    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    public ProPricePlanVo withLocationType(Integer locationType) {
        this.locationType = locationType;
        return this;
    }

    /** 区域 1.中国 2.欧洲 3.大洋洲 4.非洲 5.亚太
     * 
     * @return locationType */
    public Integer getLocationType() {
        return locationType;
    }

    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    public ProPricePlanVo withSimType(Integer simType) {
        this.simType = simType;
        return this;
    }

    /** SIM卡类型
     * 
     * @return simType */
    public Integer getSimType() {
        return simType;
    }

    public void setSimType(Integer simType) {
        this.simType = simType;
    }

    public ProPricePlanVo withCarrierType(Integer carrierType) {
        this.carrierType = carrierType;
        return this;
    }

    /** 运营商 101/1 中国移动/中国移动（实体卡） 102/2中国电信/中国电信（实体卡） 3中国联通（实体卡） 201.欧洲 501.中国香港 502.中国澳门 503.泰国 504.日本 505.柬埔寨 506.印度尼西亚
     * 507.马来西亚 508.新加坡 509.斯里兰卡 510.中国台湾 511.孟加拉
     * 
     * @return carrierType */
    public Integer getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(Integer carrierType) {
        this.carrierType = carrierType;
    }

    public ProPricePlanVo withPrice(Integer price) {
        this.price = price;
        return this;
    }

    /** 价格(元)
     * 
     * @return price */
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProPricePlanVo proPricePlanVo = (ProPricePlanVo) o;
        return Objects.equals(this.pricePlanId, proPricePlanVo.pricePlanId)
            && Objects.equals(this.pricePlanName, proPricePlanVo.pricePlanName)
            && Objects.equals(this.description, proPricePlanVo.description)
            && Objects.equals(this.flowTotal, proPricePlanVo.flowTotal)
            && Objects.equals(this.packageType, proPricePlanVo.packageType)
            && Objects.equals(this.period, proPricePlanVo.period)
            && Objects.equals(this.periodType, proPricePlanVo.periodType)
            && Objects.equals(this.effectType, proPricePlanVo.effectType)
            && Objects.equals(this.silentPeriodDay, proPricePlanVo.silentPeriodDay)
            && Objects.equals(this.silentPeriodUnit, proPricePlanVo.silentPeriodUnit)
            && Objects.equals(this.autoRenew, proPricePlanVo.autoRenew)
            && Objects.equals(this.locationDesc, proPricePlanVo.locationDesc)
            && Objects.equals(this.locationType, proPricePlanVo.locationType)
            && Objects.equals(this.simType, proPricePlanVo.simType)
            && Objects.equals(this.carrierType, proPricePlanVo.carrierType)
            && Objects.equals(this.price, proPricePlanVo.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pricePlanId,
            pricePlanName,
            description,
            flowTotal,
            packageType,
            period,
            periodType,
            effectType,
            silentPeriodDay,
            silentPeriodUnit,
            autoRenew,
            locationDesc,
            locationType,
            simType,
            carrierType,
            price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProPricePlanVo {\n");
        sb.append("    pricePlanId: ").append(toIndentedString(pricePlanId)).append("\n");
        sb.append("    pricePlanName: ").append(toIndentedString(pricePlanName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    flowTotal: ").append(toIndentedString(flowTotal)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    effectType: ").append(toIndentedString(effectType)).append("\n");
        sb.append("    silentPeriodDay: ").append(toIndentedString(silentPeriodDay)).append("\n");
        sb.append("    silentPeriodUnit: ").append(toIndentedString(silentPeriodUnit)).append("\n");
        sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
        sb.append("    locationDesc: ").append(toIndentedString(locationDesc)).append("\n");
        sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
        sb.append("    simType: ").append(toIndentedString(simType)).append("\n");
        sb.append("    carrierType: ").append(toIndentedString(carrierType)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
