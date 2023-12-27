package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建堡垒机实例请求参数。
 */
public class CBHInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_availability_zone")

    private String slaveAvailabilityZone;

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
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Integer isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private NetworkInfoCreate network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_disk_size")

    private Integer attachDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    public CBHInstances withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 待创建云堡垒机规格ID，例如： - cbh.basic.50 - cbh.enhance.50  已上线的规格请参见《云堡垒机产品介绍》的[服务版本差异](https://support.huaweicloud.com/productdesc-cbh/cbh_01_0010.html)章节。
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public CBHInstances withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 云堡垒机实例名称，取值范围：  只能由中文字符、英文字母、数字及“_”、“-”组成，且长度为[1-64]个字符。  例如：CBH-6b8e
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public CBHInstances withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 堡垒机实例前端登录密码。  密码规则：8-32位,不能包含amdin或nidma及其大写形式,必须包含大小写数字特殊字符四种类型中的三种。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CBHInstances withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 创建云堡垒机实例所在局点ID。   可参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CBHInstances withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 创建云堡垒机所在的可用分区，需要指定可用分区名称。(主备模式是作为主机可用区)  可参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CBHInstances withSlaveAvailabilityZone(String slaveAvailabilityZone) {
        this.slaveAvailabilityZone = slaveAvailabilityZone;
        return this;
    }

    /**
     * 创建云堡垒机备机所在的可用分区，需要指定可用分区名称。(只创建单机时不传此字段)。  可参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取。
     * @return slaveAvailabilityZone
     */
    public String getSlaveAvailabilityZone() {
        return slaveAvailabilityZone;
    }

    public void setSlaveAvailabilityZone(String slaveAvailabilityZone) {
        this.slaveAvailabilityZone = slaveAvailabilityZone;
    }

    public CBHInstances withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。 - 0 包周期计费。 - 1 按需计费，部分局点支持。
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

    public CBHInstances withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型。（包周期模式必传） - 2：月 - 3：年
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

    public CBHInstances withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数。（包周期模式必传） - period_type=2（周期类型为月），取值范围[1，9] - periodType=3（周期类型为年），取值范围[1，10]
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

    public CBHInstances withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订。 - 1，自动续订 - 0，不自动续订  默认值为“0”
     * minimum: 0
     * maximum: 64
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public CBHInstances withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动支付，下单订购后，是否自动从客户的华为云账户中支付，而不需要客户手动去进行支付。 - 1：是（会自动选择折扣和优惠券进行优惠，然后自动从客户华为云账户中支付），自动支付失败后会生成订单成功(该订单应付金额是优惠后金额)、但订单状态为“待支付”，等待客户手动支付(手动支付时，客户还可以修改系统自动选择的折扣和优惠券) - 0：否（需要客户手动去支付，客户可以选择折扣和优惠券。）  默认值为“0”
     * minimum: 0
     * maximum: 2
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public CBHInstances withNetwork(NetworkInfoCreate network) {
        this.network = network;
        return this;
    }

    public CBHInstances withNetwork(Consumer<NetworkInfoCreate> networkSetter) {
        if (this.network == null) {
            this.network = new NetworkInfoCreate();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public NetworkInfoCreate getNetwork() {
        return network;
    }

    public void setNetwork(NetworkInfoCreate network) {
        this.network = network;
    }

    public CBHInstances withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 云堡垒机实例是否支持IPV6。  默认值为“false”。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public CBHInstances withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。  默认值为“0”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CBHInstances withAttachDiskSize(Integer attachDiskSize) {
        this.attachDiskSize = attachDiskSize;
        return this;
    }

    /**
     * 附加磁盘大小。单位TB  > 说明： 附加磁盘和规格自带磁盘大小合起来不能超过300TB。
     * minimum: 0
     * maximum: 300
     * @return attachDiskSize
     */
    public Integer getAttachDiskSize() {
        return attachDiskSize;
    }

    public void setAttachDiskSize(Integer attachDiskSize) {
        this.attachDiskSize = attachDiskSize;
    }

    public CBHInstances withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CBHInstances addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CBHInstances withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CBHInstances that = (CBHInstances) obj;
        return Objects.equals(this.specification, that.specification)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.password, that.password)
            && Objects.equals(this.region, that.region) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.slaveAvailabilityZone, that.slaveAvailabilityZone)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.isAutoPay, that.isAutoPay) && Objects.equals(this.network, that.network)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.attachDiskSize, that.attachDiskSize) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specification,
            instanceName,
            password,
            region,
            availabilityZone,
            slaveAvailabilityZone,
            chargingMode,
            periodType,
            periodNum,
            isAutoRenew,
            isAutoPay,
            network,
            ipv6Enable,
            enterpriseProjectId,
            attachDiskSize,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CBHInstances {\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    slaveAvailabilityZone: ").append(toIndentedString(slaveAvailabilityZone)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    attachDiskSize: ").append(toIndentedString(attachDiskSize)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
