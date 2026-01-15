package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateInstancePeriodRequest
 */
public class CreateInstancePeriodRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<CreateInstancePeriodRequestNics> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<CreateInstancePeriodRequestSecurityGroups> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

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
    @JsonProperty(value = "subscription_num")

    private Integer subscriptionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_infos")

    private List<CreateInstancePeriodRequestProductInfos> productInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<KeyValueBean> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    public CreateInstancePeriodRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。取值范围： - 只能由中文字符、英文字母、数字、下划线、中划线组成，且长度小于等于64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstancePeriodRequest withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 云服务器使用的规格ID
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateInstancePeriodRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstancePeriodRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 云服务器对应可用分区信息。(两个主备分区，中间用“,”分隔，例如az1.dc1,az2.dc2)。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateInstancePeriodRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。对接EPS必输。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstancePeriodRequest withNics(List<CreateInstancePeriodRequestNics> nics) {
        this.nics = nics;
        return this;
    }

    public CreateInstancePeriodRequest addNicsItem(CreateInstancePeriodRequestNics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CreateInstancePeriodRequest withNics(Consumer<List<CreateInstancePeriodRequestNics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 云服务器对应的网卡信息
     * @return nics
     */
    public List<CreateInstancePeriodRequestNics> getNics() {
        return nics;
    }

    public void setNics(List<CreateInstancePeriodRequestNics> nics) {
        this.nics = nics;
    }

    public CreateInstancePeriodRequest withSecurityGroups(
        List<CreateInstancePeriodRequestSecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CreateInstancePeriodRequest addSecurityGroupsItem(
        CreateInstancePeriodRequestSecurityGroups securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateInstancePeriodRequest withSecurityGroups(
        Consumer<List<CreateInstancePeriodRequestSecurityGroups>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 云服务器对应安全组信息
     * @return securityGroups
     */
    public List<CreateInstancePeriodRequestSecurityGroups> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<CreateInstancePeriodRequestSecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CreateInstancePeriodRequest withComment(String comment) {
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

    public CreateInstancePeriodRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 云服务器所在区域ID
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateInstancePeriodRequest withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 服务类型： - hws.service.type.dbss: 数据库审计
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public CreateInstancePeriodRequest withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式： - 0：包周期计费 - 1：按需计费
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CreateInstancePeriodRequest withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * -订购周期类型 - 0：天 - 1：周 - 2：月 - 3：年 - 4：小时 - 5：绝对时间
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public CreateInstancePeriodRequest withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public CreateInstancePeriodRequest withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    /**
     * 订购数量： DBSS只支持订购1套，不支持多套
     * @return subscriptionNum
     */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
    }

    public CreateInstancePeriodRequest withProductInfos(List<CreateInstancePeriodRequestProductInfos> productInfos) {
        this.productInfos = productInfos;
        return this;
    }

    public CreateInstancePeriodRequest addProductInfosItem(CreateInstancePeriodRequestProductInfos productInfosItem) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        this.productInfos.add(productInfosItem);
        return this;
    }

    public CreateInstancePeriodRequest withProductInfos(
        Consumer<List<CreateInstancePeriodRequestProductInfos>> productInfosSetter) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        productInfosSetter.accept(this.productInfos);
        return this;
    }

    /**
     * 产品信息列表
     * @return productInfos
     */
    public List<CreateInstancePeriodRequestProductInfos> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<CreateInstancePeriodRequestProductInfos> productInfos) {
        this.productInfos = productInfos;
    }

    public CreateInstancePeriodRequest withTags(List<KeyValueBean> tags) {
        this.tags = tags;
        return this;
    }

    public CreateInstancePeriodRequest addTagsItem(KeyValueBean tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateInstancePeriodRequest withTags(Consumer<List<KeyValueBean>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签
     * @return tags
     */
    public List<KeyValueBean> getTags() {
        return tags;
    }

    public void setTags(List<KeyValueBean> tags) {
        this.tags = tags;
    }

    public CreateInstancePeriodRequest withPromotionInfo(String promotionInfo) {
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

    public CreateInstancePeriodRequest withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 自动续费 - 1：自动续费 - 0：不自动续费
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstancePeriodRequest that = (CreateInstancePeriodRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.nics, that.nics) && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.comment, that.comment) && Objects.equals(this.region, that.region)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.subscriptionNum, that.subscriptionNum)
            && Objects.equals(this.productInfos, that.productInfos) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.promotionInfo, that.promotionInfo)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            flavorRef,
            vpcId,
            availabilityZone,
            enterpriseProjectId,
            nics,
            securityGroups,
            comment,
            region,
            cloudServiceType,
            chargingMode,
            periodType,
            periodNum,
            subscriptionNum,
            productInfos,
            tags,
            promotionInfo,
            isAutoRenew);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstancePeriodRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
        sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
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
