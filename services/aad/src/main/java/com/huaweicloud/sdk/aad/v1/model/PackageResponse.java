package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 包列表响应体
 */
public class PackageResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_type")

    private Integer protectionType;

    /**
     * 实例类型。cnad_pro：专业版；cnad_ip：标准版；cnad_ep：铂金版；cnad_full_high：全力防高级版；cnad_vic：按需版；cnad_intl_ep：国际站铂金版
     */
    public static final class InstanceTypeEnum {

        /**
         * Enum CNAD_PRO for value: "cnad_pro"
         */
        public static final InstanceTypeEnum CNAD_PRO = new InstanceTypeEnum("cnad_pro");

        /**
         * Enum CNAD_IP for value: "cnad_ip"
         */
        public static final InstanceTypeEnum CNAD_IP = new InstanceTypeEnum("cnad_ip");

        /**
         * Enum CNAD_EP for value: "cnad_ep"
         */
        public static final InstanceTypeEnum CNAD_EP = new InstanceTypeEnum("cnad_ep");

        /**
         * Enum CNAD_FULL_HIGH for value: "cnad_full_high"
         */
        public static final InstanceTypeEnum CNAD_FULL_HIGH = new InstanceTypeEnum("cnad_full_high");

        /**
         * Enum CNAD_VIC for value: "cnad_vic"
         */
        public static final InstanceTypeEnum CNAD_VIC = new InstanceTypeEnum("cnad_vic");

        /**
         * Enum CNAD_INTL_EP for value: "cnad_intl_ep"
         */
        public static final InstanceTypeEnum CNAD_INTL_EP = new InstanceTypeEnum("cnad_intl_ep");

        private static final Map<String, InstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceTypeEnum> createStaticFields() {
            Map<String, InstanceTypeEnum> map = new HashMap<>();
            map.put("cnad_pro", CNAD_PRO);
            map.put("cnad_ip", CNAD_IP);
            map.put("cnad_ep", CNAD_EP);
            map.put("cnad_full_high", CNAD_FULL_HIGH);
            map.put("cnad_vic", CNAD_VIC);
            map.put("cnad_intl_ep", CNAD_INTL_EP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static InstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceTypeEnum(value));
        }

        public static InstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceTypeEnum) {
                return this.value.equals(((InstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private InstanceTypeEnum instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_down_code")

    private String countDownCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_down_infos")

    private String countDownInfos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_down_tips")

    private String countDownTips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_num")

    private Integer ipNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_num_now")

    private Integer ipNumNow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_num_now")

    private Integer protectionNumNow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_num")

    private Integer protectionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_bandwidth")

    private Integer basicBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_bandwidth")

    private Integer elasticBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_bandwidth")

    private Integer serviceBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_bandwidth")

    private Integer cleanBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_num")

    private Integer policyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_old")

    private Boolean isOld;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_flag")

    private Boolean newFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public PackageResponse withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 实例id
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public PackageResponse withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 实例名
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public PackageResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 资源所属region
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public PackageResponse withProtectionType(Integer protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * 防护类型
     * minimum: 0
     * maximum: 1
     * @return protectionType
     */
    public Integer getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(Integer protectionType) {
        this.protectionType = protectionType;
    }

    public PackageResponse withInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 实例类型。cnad_pro：专业版；cnad_ip：标准版；cnad_ep：铂金版；cnad_full_high：全力防高级版；cnad_vic：按需版；cnad_intl_ep：国际站铂金版
     * @return instanceType
     */
    public InstanceTypeEnum getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
    }

    public PackageResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public PackageResponse withCountDownCode(String countDownCode) {
        this.countDownCode = countDownCode;
        return this;
    }

    /**
     * 倒计时相关信息
     * @return countDownCode
     */
    public String getCountDownCode() {
        return countDownCode;
    }

    public void setCountDownCode(String countDownCode) {
        this.countDownCode = countDownCode;
    }

    public PackageResponse withCountDownInfos(String countDownInfos) {
        this.countDownInfos = countDownInfos;
        return this;
    }

    /**
     * 倒计时相关信息
     * @return countDownInfos
     */
    public String getCountDownInfos() {
        return countDownInfos;
    }

    public void setCountDownInfos(String countDownInfos) {
        this.countDownInfos = countDownInfos;
    }

    public PackageResponse withCountDownTips(String countDownTips) {
        this.countDownTips = countDownTips;
        return this;
    }

    /**
     * 倒计时相关信息
     * @return countDownTips
     */
    public String getCountDownTips() {
        return countDownTips;
    }

    public void setCountDownTips(String countDownTips) {
        this.countDownTips = countDownTips;
    }

    public PackageResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单id
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public PackageResponse withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * 续费用的id
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public PackageResponse withIpNum(Integer ipNum) {
        this.ipNum = ipNum;
        return this;
    }

    /**
     * ip数
     * minimum: 0
     * maximum: 2147483647
     * @return ipNum
     */
    public Integer getIpNum() {
        return ipNum;
    }

    public void setIpNum(Integer ipNum) {
        this.ipNum = ipNum;
    }

    public PackageResponse withIpNumNow(Integer ipNumNow) {
        this.ipNumNow = ipNumNow;
        return this;
    }

    /**
     * 当前IP数
     * minimum: 0
     * maximum: 2147483647
     * @return ipNumNow
     */
    public Integer getIpNumNow() {
        return ipNumNow;
    }

    public void setIpNumNow(Integer ipNumNow) {
        this.ipNumNow = ipNumNow;
    }

    public PackageResponse withProtectionNumNow(Integer protectionNumNow) {
        this.protectionNumNow = protectionNumNow;
        return this;
    }

    /**
     * 当前防护次数
     * minimum: 0
     * maximum: 9999
     * @return protectionNumNow
     */
    public Integer getProtectionNumNow() {
        return protectionNumNow;
    }

    public void setProtectionNumNow(Integer protectionNumNow) {
        this.protectionNumNow = protectionNumNow;
    }

    public PackageResponse withProtectionNum(Integer protectionNum) {
        this.protectionNum = protectionNum;
        return this;
    }

    /**
     * 防护次数，9999为无限次
     * minimum: 0
     * maximum: 9999
     * @return protectionNum
     */
    public Integer getProtectionNum() {
        return protectionNum;
    }

    public void setProtectionNum(Integer protectionNum) {
        this.protectionNum = protectionNum;
    }

    public PackageResponse withBasicBandwidth(Integer basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
        return this;
    }

    /**
     * 保底带宽
     * minimum: 0
     * maximum: 2147483647
     * @return basicBandwidth
     */
    public Integer getBasicBandwidth() {
        return basicBandwidth;
    }

    public void setBasicBandwidth(Integer basicBandwidth) {
        this.basicBandwidth = basicBandwidth;
    }

    public PackageResponse withElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
        return this;
    }

    /**
     * 弹性带宽
     * minimum: 0
     * maximum: 2147483647
     * @return elasticBandwidth
     */
    public Integer getElasticBandwidth() {
        return elasticBandwidth;
    }

    public void setElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
    }

    public PackageResponse withServiceBandwidth(Integer serviceBandwidth) {
        this.serviceBandwidth = serviceBandwidth;
        return this;
    }

    /**
     * 业务带宽
     * minimum: 0
     * maximum: 2147483647
     * @return serviceBandwidth
     */
    public Integer getServiceBandwidth() {
        return serviceBandwidth;
    }

    public void setServiceBandwidth(Integer serviceBandwidth) {
        this.serviceBandwidth = serviceBandwidth;
    }

    public PackageResponse withCleanBandwidth(Integer cleanBandwidth) {
        this.cleanBandwidth = cleanBandwidth;
        return this;
    }

    /**
     * 回源带宽
     * minimum: 0
     * maximum: 2147483647
     * @return cleanBandwidth
     */
    public Integer getCleanBandwidth() {
        return cleanBandwidth;
    }

    public void setCleanBandwidth(Integer cleanBandwidth) {
        this.cleanBandwidth = cleanBandwidth;
    }

    public PackageResponse withPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
        return this;
    }

    /**
     * 策略模板数
     * minimum: 0
     * maximum: 2147483647
     * @return policyNum
     */
    public Integer getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
    }

    public PackageResponse withIsOld(Boolean isOld) {
        this.isOld = isOld;
        return this;
    }

    /**
     * 是否旧实例（旧实例不支持升级规格）,默认不传为否
     * @return isOld
     */
    public Boolean getIsOld() {
        return isOld;
    }

    public void setIsOld(Boolean isOld) {
        this.isOld = isOld;
    }

    public PackageResponse withNewFlag(Boolean newFlag) {
        this.newFlag = newFlag;
        return this;
    }

    /**
     * 专业版铂金版合并之后购买的专业版和铂金版均标识为true
     * @return newFlag
     */
    public Boolean getNewFlag() {
        return newFlag;
    }

    public void setNewFlag(Boolean newFlag) {
        this.newFlag = newFlag;
    }

    public PackageResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackageResponse that = (PackageResponse) obj;
        return Objects.equals(this.packageId, that.packageId) && Objects.equals(this.packageName, that.packageName)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.protectionType, that.protectionType)
            && Objects.equals(this.instanceType, that.instanceType) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.countDownCode, that.countDownCode)
            && Objects.equals(this.countDownInfos, that.countDownInfos)
            && Objects.equals(this.countDownTips, that.countDownTips) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.subscriptionId, that.subscriptionId) && Objects.equals(this.ipNum, that.ipNum)
            && Objects.equals(this.ipNumNow, that.ipNumNow)
            && Objects.equals(this.protectionNumNow, that.protectionNumNow)
            && Objects.equals(this.protectionNum, that.protectionNum)
            && Objects.equals(this.basicBandwidth, that.basicBandwidth)
            && Objects.equals(this.elasticBandwidth, that.elasticBandwidth)
            && Objects.equals(this.serviceBandwidth, that.serviceBandwidth)
            && Objects.equals(this.cleanBandwidth, that.cleanBandwidth)
            && Objects.equals(this.policyNum, that.policyNum) && Objects.equals(this.isOld, that.isOld)
            && Objects.equals(this.newFlag, that.newFlag) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId,
            packageName,
            regionId,
            protectionType,
            instanceType,
            resourceId,
            countDownCode,
            countDownInfos,
            countDownTips,
            orderId,
            subscriptionId,
            ipNum,
            ipNumNow,
            protectionNumNow,
            protectionNum,
            basicBandwidth,
            elasticBandwidth,
            serviceBandwidth,
            cleanBandwidth,
            policyNum,
            isOld,
            newFlag,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageResponse {\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    countDownCode: ").append(toIndentedString(countDownCode)).append("\n");
        sb.append("    countDownInfos: ").append(toIndentedString(countDownInfos)).append("\n");
        sb.append("    countDownTips: ").append(toIndentedString(countDownTips)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    ipNum: ").append(toIndentedString(ipNum)).append("\n");
        sb.append("    ipNumNow: ").append(toIndentedString(ipNumNow)).append("\n");
        sb.append("    protectionNumNow: ").append(toIndentedString(protectionNumNow)).append("\n");
        sb.append("    protectionNum: ").append(toIndentedString(protectionNum)).append("\n");
        sb.append("    basicBandwidth: ").append(toIndentedString(basicBandwidth)).append("\n");
        sb.append("    elasticBandwidth: ").append(toIndentedString(elasticBandwidth)).append("\n");
        sb.append("    serviceBandwidth: ").append(toIndentedString(serviceBandwidth)).append("\n");
        sb.append("    cleanBandwidth: ").append(toIndentedString(cleanBandwidth)).append("\n");
        sb.append("    policyNum: ").append(toIndentedString(policyNum)).append("\n");
        sb.append("    isOld: ").append(toIndentedString(isOld)).append("\n");
        sb.append("    newFlag: ").append(toIndentedString(newFlag)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
