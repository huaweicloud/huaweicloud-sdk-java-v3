package com.huaweicloud.sdk.hilens.v3.model;

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
public class ShowSkillOrderInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_stop_flag")

    private Integer expirationStopFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_order_id")

    private String packageOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commission_flag")

    private Integer commissionFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private List<String> productInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_type")

    private String measureType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_limit")

    private Integer channelLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_step_size")

    private Integer resourceStepSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer_id")

    private String developerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Integer amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_unit")

    private String measureUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_chip")

    private String skillChip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<String> versions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_name")

    private String skillName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_type")

    private String skillType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_amount")

    private Integer usedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_model")

    private Integer chargeModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_id")

    private String skillId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_platform")

    private String skillPlatform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_limit")

    private Integer orderLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ShowSkillOrderInfoResponse withExpirationStopFlag(Integer expirationStopFlag) {
        this.expirationStopFlag = expirationStopFlag;
        return this;
    }

    /**
     * 技能是否支持永久使用标识。1标识支持，0为不支持
     * @return expirationStopFlag
     */
    public Integer getExpirationStopFlag() {
        return expirationStopFlag;
    }

    public void setExpirationStopFlag(Integer expirationStopFlag) {
        this.expirationStopFlag = expirationStopFlag;
    }

    public ShowSkillOrderInfoResponse withPackageOrderId(String packageOrderId) {
        this.packageOrderId = packageOrderId;
        return this;
    }

    /**
     * 技能套餐包订单ID
     * @return packageOrderId
     */
    public String getPackageOrderId() {
        return packageOrderId;
    }

    public void setPackageOrderId(String packageOrderId) {
        this.packageOrderId = packageOrderId;
    }

    public ShowSkillOrderInfoResponse withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 技能图标
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ShowSkillOrderInfoResponse withCommissionFlag(Integer commissionFlag) {
        this.commissionFlag = commissionFlag;
        return this;
    }

    /**
     * 定制技能标识
     * @return commissionFlag
     */
    public Integer getCommissionFlag() {
        return commissionFlag;
    }

    public void setCommissionFlag(Integer commissionFlag) {
        this.commissionFlag = commissionFlag;
    }

    public ShowSkillOrderInfoResponse withProductInfo(List<String> productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public ShowSkillOrderInfoResponse addProductInfoItem(String productInfoItem) {
        if (this.productInfo == null) {
            this.productInfo = new ArrayList<>();
        }
        this.productInfo.add(productInfoItem);
        return this;
    }

    public ShowSkillOrderInfoResponse withProductInfo(Consumer<List<String>> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new ArrayList<>();
        }
        productInfoSetter.accept(this.productInfo);
        return this;
    }

    /**
     * 产品收费编码信息
     * @return productInfo
     */
    public List<String> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(List<String> productInfo) {
        this.productInfo = productInfo;
    }

    public ShowSkillOrderInfoResponse withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 套餐包ID
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public ShowSkillOrderInfoResponse withMeasureType(String measureType) {
        this.measureType = measureType;
        return this;
    }

    /**
     * 计费类型，physical_src表示按物理量纲收费，比如包周期 ，src表示一次性收费
     * @return measureType
     */
    public String getMeasureType() {
        return measureType;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public ShowSkillOrderInfoResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowSkillOrderInfoResponse withChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * 通道数限制
     * @return channelLimit
     */
    public Integer getChannelLimit() {
        return channelLimit;
    }

    public void setChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
    }

    public ShowSkillOrderInfoResponse withResourceStepSize(Integer resourceStepSize) {
        this.resourceStepSize = resourceStepSize;
        return this;
    }

    /**
     * 步长
     * @return resourceStepSize
     */
    public Integer getResourceStepSize() {
        return resourceStepSize;
    }

    public void setResourceStepSize(Integer resourceStepSize) {
        this.resourceStepSize = resourceStepSize;
    }

    public ShowSkillOrderInfoResponse withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务编码
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ShowSkillOrderInfoResponse withDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }

    /**
     * 开发者ID
     * @return developerId
     */
    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }

    public ShowSkillOrderInfoResponse withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 订单数量
     * @return amount
     */
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ShowSkillOrderInfoResponse withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 技能类型，文件类型file，镜像类型iamge
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ShowSkillOrderInfoResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类别
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ShowSkillOrderInfoResponse withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 到期时间
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public ShowSkillOrderInfoResponse withMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
        return this;
    }

    /**
     * 计费单位 qps 表示按qps收费，road表示技能路数instance 表示按实例收费
     * @return measureUnit
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public ShowSkillOrderInfoResponse withSkillChip(String skillChip) {
        this.skillChip = skillChip;
        return this;
    }

    /**
     * 芯片类别
     * @return skillChip
     */
    public String getSkillChip() {
        return skillChip;
    }

    public void setSkillChip(String skillChip) {
        this.skillChip = skillChip;
    }

    public ShowSkillOrderInfoResponse withVersions(List<String> versions) {
        this.versions = versions;
        return this;
    }

    public ShowSkillOrderInfoResponse addVersionsItem(String versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ShowSkillOrderInfoResponse withVersions(Consumer<List<String>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 技能版本列表
     * @return versions
     */
    public List<String> getVersions() {
        return versions;
    }

    public void setVersions(List<String> versions) {
        this.versions = versions;
    }

    public ShowSkillOrderInfoResponse withSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }

    /**
     * 技能名字
     * @return skillName
     */
    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public ShowSkillOrderInfoResponse withSkillType(String skillType) {
        this.skillType = skillType;
        return this;
    }

    /**
     * 技能类别
     * @return skillType
     */
    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public ShowSkillOrderInfoResponse withUsedAmount(Integer usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }

    /**
     * 订单使用份数
     * @return usedAmount
     */
    public Integer getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(Integer usedAmount) {
        this.usedAmount = usedAmount;
    }

    public ShowSkillOrderInfoResponse withChargeModel(Integer chargeModel) {
        this.chargeModel = chargeModel;
        return this;
    }

    /**
     * 计费模式
     * @return chargeModel
     */
    public Integer getChargeModel() {
        return chargeModel;
    }

    public void setChargeModel(Integer chargeModel) {
        this.chargeModel = chargeModel;
    }

    public ShowSkillOrderInfoResponse withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ShowSkillOrderInfoResponse withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * 技能ID
     * @return skillId
     */
    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public ShowSkillOrderInfoResponse withSkillPlatform(String skillPlatform) {
        this.skillPlatform = skillPlatform;
        return this;
    }

    /**
     * 技能支持的平台
     * @return skillPlatform
     */
    public String getSkillPlatform() {
        return skillPlatform;
    }

    public void setSkillPlatform(String skillPlatform) {
        this.skillPlatform = skillPlatform;
    }

    public ShowSkillOrderInfoResponse withOrderLimit(Integer orderLimit) {
        this.orderLimit = orderLimit;
        return this;
    }

    /**
     * 订单购买限制
     * @return orderLimit
     */
    public Integer getOrderLimit() {
        return orderLimit;
    }

    public void setOrderLimit(Integer orderLimit) {
        this.orderLimit = orderLimit;
    }

    public ShowSkillOrderInfoResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShowSkillOrderInfoResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 订单状态，0表示正常状态，1表示冻结状态，2表示受限状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSkillOrderInfoResponse showSkillOrderInfoResponse = (ShowSkillOrderInfoResponse) o;
        return Objects.equals(this.expirationStopFlag, showSkillOrderInfoResponse.expirationStopFlag)
            && Objects.equals(this.packageOrderId, showSkillOrderInfoResponse.packageOrderId)
            && Objects.equals(this.icon, showSkillOrderInfoResponse.icon)
            && Objects.equals(this.commissionFlag, showSkillOrderInfoResponse.commissionFlag)
            && Objects.equals(this.productInfo, showSkillOrderInfoResponse.productInfo)
            && Objects.equals(this.packageId, showSkillOrderInfoResponse.packageId)
            && Objects.equals(this.measureType, showSkillOrderInfoResponse.measureType)
            && Objects.equals(this.updateTime, showSkillOrderInfoResponse.updateTime)
            && Objects.equals(this.channelLimit, showSkillOrderInfoResponse.channelLimit)
            && Objects.equals(this.resourceStepSize, showSkillOrderInfoResponse.resourceStepSize)
            && Objects.equals(this.cloudServiceType, showSkillOrderInfoResponse.cloudServiceType)
            && Objects.equals(this.developerId, showSkillOrderInfoResponse.developerId)
            && Objects.equals(this.amount, showSkillOrderInfoResponse.amount)
            && Objects.equals(this.format, showSkillOrderInfoResponse.format)
            && Objects.equals(this.resourceType, showSkillOrderInfoResponse.resourceType)
            && Objects.equals(this.expireTime, showSkillOrderInfoResponse.expireTime)
            && Objects.equals(this.measureUnit, showSkillOrderInfoResponse.measureUnit)
            && Objects.equals(this.skillChip, showSkillOrderInfoResponse.skillChip)
            && Objects.equals(this.versions, showSkillOrderInfoResponse.versions)
            && Objects.equals(this.skillName, showSkillOrderInfoResponse.skillName)
            && Objects.equals(this.skillType, showSkillOrderInfoResponse.skillType)
            && Objects.equals(this.usedAmount, showSkillOrderInfoResponse.usedAmount)
            && Objects.equals(this.chargeModel, showSkillOrderInfoResponse.chargeModel)
            && Objects.equals(this.resourceSpecCode, showSkillOrderInfoResponse.resourceSpecCode)
            && Objects.equals(this.skillId, showSkillOrderInfoResponse.skillId)
            && Objects.equals(this.skillPlatform, showSkillOrderInfoResponse.skillPlatform)
            && Objects.equals(this.orderLimit, showSkillOrderInfoResponse.orderLimit)
            && Objects.equals(this.orderId, showSkillOrderInfoResponse.orderId)
            && Objects.equals(this.status, showSkillOrderInfoResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirationStopFlag,
            packageOrderId,
            icon,
            commissionFlag,
            productInfo,
            packageId,
            measureType,
            updateTime,
            channelLimit,
            resourceStepSize,
            cloudServiceType,
            developerId,
            amount,
            format,
            resourceType,
            expireTime,
            measureUnit,
            skillChip,
            versions,
            skillName,
            skillType,
            usedAmount,
            chargeModel,
            resourceSpecCode,
            skillId,
            skillPlatform,
            orderLimit,
            orderId,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSkillOrderInfoResponse {\n");
        sb.append("    expirationStopFlag: ").append(toIndentedString(expirationStopFlag)).append("\n");
        sb.append("    packageOrderId: ").append(toIndentedString(packageOrderId)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    commissionFlag: ").append(toIndentedString(commissionFlag)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    measureType: ").append(toIndentedString(measureType)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
        sb.append("    resourceStepSize: ").append(toIndentedString(resourceStepSize)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    measureUnit: ").append(toIndentedString(measureUnit)).append("\n");
        sb.append("    skillChip: ").append(toIndentedString(skillChip)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        sb.append("    skillName: ").append(toIndentedString(skillName)).append("\n");
        sb.append("    skillType: ").append(toIndentedString(skillType)).append("\n");
        sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
        sb.append("    chargeModel: ").append(toIndentedString(chargeModel)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    skillPlatform: ").append(toIndentedString(skillPlatform)).append("\n");
        sb.append("    orderLimit: ").append(toIndentedString(orderLimit)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
