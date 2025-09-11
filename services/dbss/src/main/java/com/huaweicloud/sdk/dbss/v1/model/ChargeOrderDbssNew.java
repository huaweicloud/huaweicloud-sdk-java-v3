package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChargeOrderDbssNew
 */
public class ChargeOrderDbssNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTagInfoBean> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_nums")

    private Integer assetNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "composite_product_id")

    private String compositeProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_mode")

    private String deployMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_id")

    private String discountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hx_password")

    private String hxPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_business_type")

    private Integer imageBusinessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outside_ins_config")

    private OutsideInsConfig outsideInsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_infos")

    private List<ProductInfoBeanNew> productInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_activity_id")

    private String promotionActivityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private PublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_num")

    private Integer subscriptionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public ChargeOrderDbssNew withTags(List<ResourceTagInfoBean> tags) {
        this.tags = tags;
        return this;
    }

    public ChargeOrderDbssNew addTagsItem(ResourceTagInfoBean tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ChargeOrderDbssNew withTags(Consumer<List<ResourceTagInfoBean>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签列表
     * @return tags
     */
    public List<ResourceTagInfoBean> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTagInfoBean> tags) {
        this.tags = tags;
    }

    public ChargeOrderDbssNew withAssetNums(Integer assetNums) {
        this.assetNums = assetNums;
        return this;
    }

    /**
     * 资产数量
     * @return assetNums
     */
    public Integer getAssetNums() {
        return assetNums;
    }

    public void setAssetNums(Integer assetNums) {
        this.assetNums = assetNums;
    }

    public ChargeOrderDbssNew withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ChargeOrderDbssNew withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ChargeOrderDbssNew withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 服务类型
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ChargeOrderDbssNew withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 备注信息
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ChargeOrderDbssNew withCompositeProductId(String compositeProductId) {
        this.compositeProductId = compositeProductId;
        return this;
    }

    /**
     * 组合套餐
     * @return compositeProductId
     */
    public String getCompositeProductId() {
        return compositeProductId;
    }

    public void setCompositeProductId(String compositeProductId) {
        this.compositeProductId = compositeProductId;
    }

    public ChargeOrderDbssNew withDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }

    /**
     * 实例部署方式，默认为云上 - CLOUD： 云上 - OUTSIDE：云外
     * @return deployMode
     */
    public String getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(String deployMode) {
        this.deployMode = deployMode;
    }

    public ChargeOrderDbssNew withDiscountId(String discountId) {
        this.discountId = discountId;
        return this;
    }

    /**
     * 折扣ID
     * @return discountId
     */
    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public ChargeOrderDbssNew withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ChargeOrderDbssNew withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * ECS规格ID
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public ChargeOrderDbssNew withHxPassword(String hxPassword) {
        this.hxPassword = hxPassword;
        return this;
    }

    /**
     * 前端登录密码
     * @return hxPassword
     */
    public String getHxPassword() {
        return hxPassword;
    }

    public void setHxPassword(String hxPassword) {
        this.hxPassword = hxPassword;
    }

    public ChargeOrderDbssNew withImageBusinessType(Integer imageBusinessType) {
        this.imageBusinessType = imageBusinessType;
        return this;
    }

    /**
     * 镜像业务类型
     * @return imageBusinessType
     */
    public Integer getImageBusinessType() {
        return imageBusinessType;
    }

    public void setImageBusinessType(Integer imageBusinessType) {
        this.imageBusinessType = imageBusinessType;
    }

    public ChargeOrderDbssNew withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 自费续费  - 1：自动  - 0：不自动
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public ChargeOrderDbssNew withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChargeOrderDbssNew withNics(List<Nic> nics) {
        this.nics = nics;
        return this;
    }

    public ChargeOrderDbssNew addNicsItem(Nic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public ChargeOrderDbssNew withNics(Consumer<List<Nic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 网卡信息
     * @return nics
     */
    public List<Nic> getNics() {
        return nics;
    }

    public void setNics(List<Nic> nics) {
        this.nics = nics;
    }

    public ChargeOrderDbssNew withOutsideInsConfig(OutsideInsConfig outsideInsConfig) {
        this.outsideInsConfig = outsideInsConfig;
        return this;
    }

    public ChargeOrderDbssNew withOutsideInsConfig(Consumer<OutsideInsConfig> outsideInsConfigSetter) {
        if (this.outsideInsConfig == null) {
            this.outsideInsConfig = new OutsideInsConfig();
            outsideInsConfigSetter.accept(this.outsideInsConfig);
        }

        return this;
    }

    /**
     * Get outsideInsConfig
     * @return outsideInsConfig
     */
    public OutsideInsConfig getOutsideInsConfig() {
        return outsideInsConfig;
    }

    public void setOutsideInsConfig(OutsideInsConfig outsideInsConfig) {
        this.outsideInsConfig = outsideInsConfig;
    }

    public ChargeOrderDbssNew withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数目
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ChargeOrderDbssNew withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public ChargeOrderDbssNew withProductInfos(List<ProductInfoBeanNew> productInfos) {
        this.productInfos = productInfos;
        return this;
    }

    public ChargeOrderDbssNew addProductInfosItem(ProductInfoBeanNew productInfosItem) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        this.productInfos.add(productInfosItem);
        return this;
    }

    public ChargeOrderDbssNew withProductInfos(Consumer<List<ProductInfoBeanNew>> productInfosSetter) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        productInfosSetter.accept(this.productInfos);
        return this;
    }

    /**
     * 产品列表
     * @return productInfos
     */
    public List<ProductInfoBeanNew> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfoBeanNew> productInfos) {
        this.productInfos = productInfos;
    }

    public ChargeOrderDbssNew withPromotionActivityId(String promotionActivityId) {
        this.promotionActivityId = promotionActivityId;
        return this;
    }

    /**
     * 促销ID
     * @return promotionActivityId
     */
    public String getPromotionActivityId() {
        return promotionActivityId;
    }

    public void setPromotionActivityId(String promotionActivityId) {
        this.promotionActivityId = promotionActivityId;
    }

    public ChargeOrderDbssNew withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * 折扣信息
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public ChargeOrderDbssNew withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public ChargeOrderDbssNew withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public ChargeOrderDbssNew withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ChargeOrderDbssNew withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public ChargeOrderDbssNew addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ChargeOrderDbssNew withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组信息
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ChargeOrderDbssNew withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    /**
     * 订购数量，当前仅支持1台
     * @return subscriptionNum
     */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
    }

    public ChargeOrderDbssNew withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChargeOrderDbssNew that = (ChargeOrderDbssNew) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.assetNums, that.assetNums)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.compositeProductId, that.compositeProductId)
            && Objects.equals(this.deployMode, that.deployMode) && Objects.equals(this.discountId, that.discountId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.hxPassword, that.hxPassword)
            && Objects.equals(this.imageBusinessType, that.imageBusinessType)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nics, that.nics) && Objects.equals(this.outsideInsConfig, that.outsideInsConfig)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.productInfos, that.productInfos)
            && Objects.equals(this.promotionActivityId, that.promotionActivityId)
            && Objects.equals(this.promotionInfo, that.promotionInfo) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.subscriptionNum, that.subscriptionNum) && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags,
            assetNums,
            availabilityZone,
            chargingMode,
            cloudServiceType,
            comment,
            compositeProductId,
            deployMode,
            discountId,
            enterpriseProjectId,
            flavorRef,
            hxPassword,
            imageBusinessType,
            isAutoRenew,
            name,
            nics,
            outsideInsConfig,
            periodNum,
            periodType,
            productInfos,
            promotionActivityId,
            promotionInfo,
            publicIp,
            regionId,
            securityGroups,
            subscriptionNum,
            vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChargeOrderDbssNew {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    assetNums: ").append(toIndentedString(assetNums)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    compositeProductId: ").append(toIndentedString(compositeProductId)).append("\n");
        sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
        sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    hxPassword: ").append(toIndentedString(hxPassword)).append("\n");
        sb.append("    imageBusinessType: ").append(toIndentedString(imageBusinessType)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    outsideInsConfig: ").append(toIndentedString(outsideInsConfig)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
        sb.append("    promotionActivityId: ").append(toIndentedString(promotionActivityId)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
