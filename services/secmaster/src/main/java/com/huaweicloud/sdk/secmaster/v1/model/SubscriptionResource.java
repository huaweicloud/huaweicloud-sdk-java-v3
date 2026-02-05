package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户资源类
 */
public class SubscriptionResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service")

    private String cloudService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_period")

    private Boolean toPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_status")

    private Integer resourceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    /**
     * 计费模式，目前有包周期（包年包月）PREPAID、按需POSTPAID，大小写不敏感
     */
    public static final class ChargingModeEnum {

        /**
         * Enum PREPAID for value: "PREPAID"
         */
        public static final ChargingModeEnum PREPAID = new ChargingModeEnum("PREPAID");

        /**
         * Enum POSTPAID for value: "POSTPAID"
         */
        public static final ChargingModeEnum POSTPAID = new ChargingModeEnum("POSTPAID");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("PREPAID", PREPAID);
            map.put("POSTPAID", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<SubscriptionTagInfo> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usages")

    private List<ResourceUsage> usages = null;

    public SubscriptionResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源Id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SubscriptionResource withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public SubscriptionResource withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 资源规格
     * minimum: 0
     * maximum: 10000
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public SubscriptionResource withCloudService(String cloudService) {
        this.cloudService = cloudService;
        return this;
    }

    /**
     * 订单来源，默认数据为SecMaster
     * @return cloudService
     */
    public String getCloudService() {
        return cloudService;
    }

    public void setCloudService(String cloudService) {
        this.cloudService = cloudService;
    }

    public SubscriptionResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public SubscriptionResource withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public SubscriptionResource withToPeriod(Boolean toPeriod) {
        this.toPeriod = toPeriod;
        return this;
    }

    /**
     * 当前资源是否能进行按需转包周期操作
     * @return toPeriod
     */
    public Boolean getToPeriod() {
        return toPeriod;
    }

    public void setToPeriod(Boolean toPeriod) {
        this.toPeriod = toPeriod;
    }

    public SubscriptionResource withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间戳
     * minimum: 1640966400000
     * maximum: 4796640000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public SubscriptionResource withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间戳
     * minimum: 1640966400000
     * maximum: 4796640000000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public SubscriptionResource withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 到期时间戳，只有包年包月资源才有该字段
     * minimum: 1640966400000
     * maximum: 4796640000000
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public SubscriptionResource withResourceStatus(Integer resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }

    /**
     * 资源状态，目前返回正常运行的资源，其状态值为0
     * minimum: 0
     * maximum: 2
     * @return resourceStatus
     */
    public Integer getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(Integer resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    public SubscriptionResource withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单Id，包周期资源有该字段
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SubscriptionResource withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式，目前有包周期（包年包月）PREPAID、按需POSTPAID，大小写不敏感
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public SubscriptionResource withTagList(List<SubscriptionTagInfo> tagList) {
        this.tagList = tagList;
        return this;
    }

    public SubscriptionResource addTagListItem(SubscriptionTagInfo tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public SubscriptionResource withTagList(Consumer<List<SubscriptionTagInfo>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /**
     * 资源列表
     * @return tagList
     */
    public List<SubscriptionTagInfo> getTagList() {
        return tagList;
    }

    public void setTagList(List<SubscriptionTagInfo> tagList) {
        this.tagList = tagList;
    }

    public SubscriptionResource withUsages(List<ResourceUsage> usages) {
        this.usages = usages;
        return this;
    }

    public SubscriptionResource addUsagesItem(ResourceUsage usagesItem) {
        if (this.usages == null) {
            this.usages = new ArrayList<>();
        }
        this.usages.add(usagesItem);
        return this;
    }

    public SubscriptionResource withUsages(Consumer<List<ResourceUsage>> usagesSetter) {
        if (this.usages == null) {
            this.usages = new ArrayList<>();
        }
        usagesSetter.accept(this.usages);
        return this;
    }

    /**
     * 资源使用量，当usage=true时返回该字段
     * @return usages
     */
    public List<ResourceUsage> getUsages() {
        return usages;
    }

    public void setUsages(List<ResourceUsage> usages) {
        this.usages = usages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionResource that = (SubscriptionResource) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.resourceSize, that.resourceSize)
            && Objects.equals(this.cloudService, that.cloudService)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.toPeriod, that.toPeriod) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.resourceStatus, that.resourceStatus) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.tagList, that.tagList)
            && Objects.equals(this.usages, that.usages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            resourceTypeName,
            resourceSize,
            cloudService,
            resourceType,
            resourceSpecCode,
            toPeriod,
            createTime,
            updateTime,
            expireTime,
            resourceStatus,
            orderId,
            chargingMode,
            tagList,
            usages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    cloudService: ").append(toIndentedString(cloudService)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    toPeriod: ").append(toIndentedString(toPeriod)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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
