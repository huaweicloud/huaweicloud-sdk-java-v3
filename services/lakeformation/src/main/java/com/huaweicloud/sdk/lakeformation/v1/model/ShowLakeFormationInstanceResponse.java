package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLakeFormationInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_instance")

    private Boolean defaultInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    /**
     * 实例状态,RESOURCE_PREPARATION-实例资源准备中,RUNNING-实例运行中,RESOURCE_RELEASE-实例资源释放中,DELETED-实例已释放,RESOURCE_PREPARATION_FAIL-实例资源准备失败,FROZEN_RELEASABLE-可恢复冻结,FROZEN_UNRELEASABLE-不可恢复冻结,RECOVERING-恢复中,DELETING-删除中,SCALING-扩容中,SCALE_FAIL-扩容失败
     */
    public static final class StatusEnum {

        /**
         * Enum RESOURCE_PREPARATION for value: "RESOURCE_PREPARATION"
         */
        public static final StatusEnum RESOURCE_PREPARATION = new StatusEnum("RESOURCE_PREPARATION");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum RESOURCE_RELEASE for value: "RESOURCE_RELEASE"
         */
        public static final StatusEnum RESOURCE_RELEASE = new StatusEnum("RESOURCE_RELEASE");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum RESOURCE_PREPARATION_FAIL for value: "RESOURCE_PREPARATION_FAIL"
         */
        public static final StatusEnum RESOURCE_PREPARATION_FAIL = new StatusEnum("RESOURCE_PREPARATION_FAIL");

        /**
         * Enum FROZEN_RELEASABLE for value: "FROZEN_RELEASABLE"
         */
        public static final StatusEnum FROZEN_RELEASABLE = new StatusEnum("FROZEN_RELEASABLE");

        /**
         * Enum FROZEN_UNRELEASABLE for value: "FROZEN_UNRELEASABLE"
         */
        public static final StatusEnum FROZEN_UNRELEASABLE = new StatusEnum("FROZEN_UNRELEASABLE");

        /**
         * Enum RECOVERING for value: "RECOVERING"
         */
        public static final StatusEnum RECOVERING = new StatusEnum("RECOVERING");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");

        /**
         * Enum SCALING for value: "SCALING"
         */
        public static final StatusEnum SCALING = new StatusEnum("SCALING");

        /**
         * Enum SCALE_FAIL for value: "SCALE_FAIL"
         */
        public static final StatusEnum SCALE_FAIL = new StatusEnum("SCALE_FAIL");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("RESOURCE_PREPARATION", RESOURCE_PREPARATION);
            map.put("RUNNING", RUNNING);
            map.put("RESOURCE_RELEASE", RESOURCE_RELEASE);
            map.put("DELETED", DELETED);
            map.put("RESOURCE_PREPARATION_FAIL", RESOURCE_PREPARATION_FAIL);
            map.put("FROZEN_RELEASABLE", FROZEN_RELEASABLE);
            map.put("FROZEN_UNRELEASABLE", FROZEN_UNRELEASABLE);
            map.put("RECOVERING", RECOVERING);
            map.put("DELETING", DELETING);
            map.put("SCALING", SCALING);
            map.put("SCALE_FAIL", SCALE_FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_progress")

    private Integer resourceProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_expected_duration")

    private Integer resourceExpectedDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_progress")

    private Integer scaleProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_expected_duration")

    private Integer scaleExpectedDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_recycle_bin")

    private Boolean inRecycleBin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs")

    private List<CreateSpec> specs = null;

    /**
     * 计费模式,postPaid=按需计费,prePaid=包周期计费
     */
    public static final class ChargeModeEnum {

        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargeModeEnum PREPAID = new ChargeModeEnum("prePaid");

        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargeModeEnum POSTPAID = new ChargeModeEnum("postPaid");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("prePaid", PREPAID);
            map.put("postPaid", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
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
        public static ChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargeModeEnum(value));
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeModeEnum chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowLakeFormationInstanceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * LakeFormation实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowLakeFormationInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowLakeFormationInstanceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowLakeFormationInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowLakeFormationInstanceResponse withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 逻辑多租和物理多租的判断。false为物理多租；true为逻辑多租。
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public ShowLakeFormationInstanceResponse withDefaultInstance(Boolean defaultInstance) {
        this.defaultInstance = defaultInstance;
        return this;
    }

    /**
     * 是否为默认实例
     * @return defaultInstance
     */
    public Boolean getDefaultInstance() {
        return defaultInstance;
    }

    public void setDefaultInstance(Boolean defaultInstance) {
        this.defaultInstance = defaultInstance;
    }

    public ShowLakeFormationInstanceResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 实例创建时间戳
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowLakeFormationInstanceResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 实例更新时间戳
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowLakeFormationInstanceResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态,RESOURCE_PREPARATION-实例资源准备中,RUNNING-实例运行中,RESOURCE_RELEASE-实例资源释放中,DELETED-实例已释放,RESOURCE_PREPARATION_FAIL-实例资源准备失败,FROZEN_RELEASABLE-可恢复冻结,FROZEN_UNRELEASABLE-不可恢复冻结,RECOVERING-恢复中,DELETING-删除中,SCALING-扩容中,SCALE_FAIL-扩容失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowLakeFormationInstanceResponse withResourceProgress(Integer resourceProgress) {
        this.resourceProgress = resourceProgress;
        return this;
    }

    /**
     * 资源准备进度百分比，只有当实例处于资源准备中状态时才会计算并返回该值
     * minimum: 0
     * maximum: 100
     * @return resourceProgress
     */
    public Integer getResourceProgress() {
        return resourceProgress;
    }

    public void setResourceProgress(Integer resourceProgress) {
        this.resourceProgress = resourceProgress;
    }

    public ShowLakeFormationInstanceResponse withResourceExpectedDuration(Integer resourceExpectedDuration) {
        this.resourceExpectedDuration = resourceExpectedDuration;
        return this;
    }

    /**
     * 资源准备预计时长，单位分钟
     * minimum: 0
     * maximum: 2147483647
     * @return resourceExpectedDuration
     */
    public Integer getResourceExpectedDuration() {
        return resourceExpectedDuration;
    }

    public void setResourceExpectedDuration(Integer resourceExpectedDuration) {
        this.resourceExpectedDuration = resourceExpectedDuration;
    }

    public ShowLakeFormationInstanceResponse withScaleProgress(Integer scaleProgress) {
        this.scaleProgress = scaleProgress;
        return this;
    }

    /**
     * 规格变更进度百分比，只有当实例处于规格变更中状态时才会计算并返回该值
     * minimum: 0
     * maximum: 100
     * @return scaleProgress
     */
    public Integer getScaleProgress() {
        return scaleProgress;
    }

    public void setScaleProgress(Integer scaleProgress) {
        this.scaleProgress = scaleProgress;
    }

    public ShowLakeFormationInstanceResponse withScaleExpectedDuration(Integer scaleExpectedDuration) {
        this.scaleExpectedDuration = scaleExpectedDuration;
        return this;
    }

    /**
     * 规格变更预计时长，单位分钟
     * minimum: 0
     * maximum: 2147483647
     * @return scaleExpectedDuration
     */
    public Integer getScaleExpectedDuration() {
        return scaleExpectedDuration;
    }

    public void setScaleExpectedDuration(Integer scaleExpectedDuration) {
        this.scaleExpectedDuration = scaleExpectedDuration;
    }

    public ShowLakeFormationInstanceResponse withInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
        return this;
    }

    /**
     * 是否在回收站
     * @return inRecycleBin
     */
    public Boolean getInRecycleBin() {
        return inRecycleBin;
    }

    public void setInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
    }

    public ShowLakeFormationInstanceResponse withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowLakeFormationInstanceResponse addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowLakeFormationInstanceResponse withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ShowLakeFormationInstanceResponse withSpecs(List<CreateSpec> specs) {
        this.specs = specs;
        return this;
    }

    public ShowLakeFormationInstanceResponse addSpecsItem(CreateSpec specsItem) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        this.specs.add(specsItem);
        return this;
    }

    public ShowLakeFormationInstanceResponse withSpecs(Consumer<List<CreateSpec>> specsSetter) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        specsSetter.accept(this.specs);
        return this;
    }

    /**
     * 规格信息
     * @return specs
     */
    public List<CreateSpec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<CreateSpec> specs) {
        this.specs = specs;
    }

    public ShowLakeFormationInstanceResponse withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式,postPaid=按需计费,prePaid=包周期计费
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ShowLakeFormationInstanceResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLakeFormationInstanceResponse that = (ShowLakeFormationInstanceResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.shared, that.shared) && Objects.equals(this.defaultInstance, that.defaultInstance)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.resourceProgress, that.resourceProgress)
            && Objects.equals(this.resourceExpectedDuration, that.resourceExpectedDuration)
            && Objects.equals(this.scaleProgress, that.scaleProgress)
            && Objects.equals(this.scaleExpectedDuration, that.scaleExpectedDuration)
            && Objects.equals(this.inRecycleBin, that.inRecycleBin) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.specs, that.specs) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            name,
            description,
            enterpriseProjectId,
            shared,
            defaultInstance,
            createTime,
            updateTime,
            status,
            resourceProgress,
            resourceExpectedDuration,
            scaleProgress,
            scaleExpectedDuration,
            inRecycleBin,
            tags,
            specs,
            chargeMode,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLakeFormationInstanceResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    defaultInstance: ").append(toIndentedString(defaultInstance)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resourceProgress: ").append(toIndentedString(resourceProgress)).append("\n");
        sb.append("    resourceExpectedDuration: ").append(toIndentedString(resourceExpectedDuration)).append("\n");
        sb.append("    scaleProgress: ").append(toIndentedString(scaleProgress)).append("\n");
        sb.append("    scaleExpectedDuration: ").append(toIndentedString(scaleExpectedDuration)).append("\n");
        sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
