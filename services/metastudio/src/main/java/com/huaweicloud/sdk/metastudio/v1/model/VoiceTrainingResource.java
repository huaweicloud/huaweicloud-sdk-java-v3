package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VoiceTrainingResource
 */
public class VoiceTrainingResource {

    /**
     * 资源操作类型。 * ADD: 新增资源 * UPDATE：更新资源 * FREEZE：停用资源 * UNFREEZE：启用资源 * REBIND: 重新绑定资源
     */
    public static final class OperationTypeEnum {

        /**
         * Enum ADD for value: "ADD"
         */
        public static final OperationTypeEnum ADD = new OperationTypeEnum("ADD");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final OperationTypeEnum UPDATE = new OperationTypeEnum("UPDATE");

        /**
         * Enum FREEZE for value: "FREEZE"
         */
        public static final OperationTypeEnum FREEZE = new OperationTypeEnum("FREEZE");

        /**
         * Enum UNFREEZE for value: "UNFREEZE"
         */
        public static final OperationTypeEnum UNFREEZE = new OperationTypeEnum("UNFREEZE");

        /**
         * Enum REBIND for value: "REBIND"
         */
        public static final OperationTypeEnum REBIND = new OperationTypeEnum("REBIND");

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("ADD", ADD);
            map.put("UPDATE", UPDATE);
            map.put("FREEZE", FREEZE);
            map.put("UNFREEZE", UNFREEZE);
            map.put("REBIND", REBIND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationTypeEnum(value));
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private OperationTypeEnum operationType;

    /**
     * 资源来源。 * PURCHASED: 购买 * SP_ALLOCATED：SP分配 * ADMIN_ALLOCATED：系统管理员分配 > * 开通按需；购买按需套餐包、一次性资源、包周期等都属于PURCHASED。
     */
    public static final class ResourceSourceEnum {

        /**
         * Enum PURCHASED for value: "PURCHASED"
         */
        public static final ResourceSourceEnum PURCHASED = new ResourceSourceEnum("PURCHASED");

        /**
         * Enum SP_ALLOCATED for value: "SP_ALLOCATED"
         */
        public static final ResourceSourceEnum SP_ALLOCATED = new ResourceSourceEnum("SP_ALLOCATED");

        /**
         * Enum ADMIN_ALLOCATED for value: "ADMIN_ALLOCATED"
         */
        public static final ResourceSourceEnum ADMIN_ALLOCATED = new ResourceSourceEnum("ADMIN_ALLOCATED");

        private static final Map<String, ResourceSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceSourceEnum> createStaticFields() {
            Map<String, ResourceSourceEnum> map = new HashMap<>();
            map.put("PURCHASED", PURCHASED);
            map.put("SP_ALLOCATED", SP_ALLOCATED);
            map.put("ADMIN_ALLOCATED", ADMIN_ALLOCATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceSourceEnum(String value) {
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
        public static ResourceSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceSourceEnum(value));
        }

        public static ResourceSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceSourceEnum) {
                return this.value.equals(((ResourceSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_source")

    private ResourceSourceEnum resourceSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_nums")

    private Integer resourceNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_available_nums")

    private Integer resourceAvailableNums;

    /**
     * 资源类型。 * BASIC: 基础版 * MIDDLE: 进阶版 * ADVANCE：高级版 * THIRD_PARTY：第三方出门问问 * THIRD_PARTY_LJZN: 第三方逻辑智能 * TTS_CMWW：TTS资源 * TTS_LJZN: 逻辑智能TTS资源 * FLEXUS: Flexus版资源
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum BASIC for value: "BASIC"
         */
        public static final ResourceTypeEnum BASIC = new ResourceTypeEnum("BASIC");

        /**
         * Enum MIDDLE for value: "MIDDLE"
         */
        public static final ResourceTypeEnum MIDDLE = new ResourceTypeEnum("MIDDLE");

        /**
         * Enum ADVANCE for value: "ADVANCE"
         */
        public static final ResourceTypeEnum ADVANCE = new ResourceTypeEnum("ADVANCE");

        /**
         * Enum THIRD_PARTY for value: "THIRD_PARTY"
         */
        public static final ResourceTypeEnum THIRD_PARTY = new ResourceTypeEnum("THIRD_PARTY");

        /**
         * Enum THIRD_PARTY_LJZN for value: "THIRD_PARTY_LJZN"
         */
        public static final ResourceTypeEnum THIRD_PARTY_LJZN = new ResourceTypeEnum("THIRD_PARTY_LJZN");

        /**
         * Enum TTS_CMWW for value: "TTS_CMWW"
         */
        public static final ResourceTypeEnum TTS_CMWW = new ResourceTypeEnum("TTS_CMWW");

        /**
         * Enum TTS_LJZN for value: "TTS_LJZN"
         */
        public static final ResourceTypeEnum TTS_LJZN = new ResourceTypeEnum("TTS_LJZN");

        /**
         * Enum FLEXUS for value: "FLEXUS"
         */
        public static final ResourceTypeEnum FLEXUS = new ResourceTypeEnum("FLEXUS");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("BASIC", BASIC);
            map.put("MIDDLE", MIDDLE);
            map.put("ADVANCE", ADVANCE);
            map.put("THIRD_PARTY", THIRD_PARTY);
            map.put("THIRD_PARTY_LJZN", THIRD_PARTY_LJZN);
            map.put("TTS_CMWW", TTS_CMWW);
            map.put("TTS_LJZN", TTS_LJZN);
            map.put("FLEXUS", FLEXUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChardMode chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public VoiceTrainingResource withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 资源操作类型。 * ADD: 新增资源 * UPDATE：更新资源 * FREEZE：停用资源 * UNFREEZE：启用资源 * REBIND: 重新绑定资源
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public VoiceTrainingResource withResourceSource(ResourceSourceEnum resourceSource) {
        this.resourceSource = resourceSource;
        return this;
    }

    /**
     * 资源来源。 * PURCHASED: 购买 * SP_ALLOCATED：SP分配 * ADMIN_ALLOCATED：系统管理员分配 > * 开通按需；购买按需套餐包、一次性资源、包周期等都属于PURCHASED。
     * @return resourceSource
     */
    public ResourceSourceEnum getResourceSource() {
        return resourceSource;
    }

    public void setResourceSource(ResourceSourceEnum resourceSource) {
        this.resourceSource = resourceSource;
    }

    public VoiceTrainingResource withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public VoiceTrainingResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public VoiceTrainingResource withResourceNums(Integer resourceNums) {
        this.resourceNums = resourceNums;
        return this;
    }

    /**
     * 资源数量。声音模型训练个数。
     * minimum: 0
     * maximum: 1000000
     * @return resourceNums
     */
    public Integer getResourceNums() {
        return resourceNums;
    }

    public void setResourceNums(Integer resourceNums) {
        this.resourceNums = resourceNums;
    }

    public VoiceTrainingResource withResourceAvailableNums(Integer resourceAvailableNums) {
        this.resourceAvailableNums = resourceAvailableNums;
        return this;
    }

    /**
     * 可用资源数量。可用声音模型训练个数。
     * minimum: 0
     * maximum: 1000000
     * @return resourceAvailableNums
     */
    public Integer getResourceAvailableNums() {
        return resourceAvailableNums;
    }

    public void setResourceAvailableNums(Integer resourceAvailableNums) {
        this.resourceAvailableNums = resourceAvailableNums;
    }

    public VoiceTrainingResource withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。 * BASIC: 基础版 * MIDDLE: 进阶版 * ADVANCE：高级版 * THIRD_PARTY：第三方出门问问 * THIRD_PARTY_LJZN: 第三方逻辑智能 * TTS_CMWW：TTS资源 * TTS_LJZN: 逻辑智能TTS资源 * FLEXUS: Flexus版资源
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public VoiceTrainingResource withChargeMode(ChardMode chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * Get chargeMode
     * @return chargeMode
     */
    public ChardMode getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChardMode chargeMode) {
        this.chargeMode = chargeMode;
    }

    public VoiceTrainingResource withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 资源过期时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public VoiceTrainingResource withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoiceTrainingResource that = (VoiceTrainingResource) obj;
        return Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.resourceSource, that.resourceSource) && Objects.equals(this.assetId, that.assetId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceNums, that.resourceNums)
            && Objects.equals(this.resourceAvailableNums, that.resourceAvailableNums)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationType,
            resourceSource,
            assetId,
            resourceId,
            resourceNums,
            resourceAvailableNums,
            resourceType,
            chargeMode,
            expireTime,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoiceTrainingResource {\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    resourceSource: ").append(toIndentedString(resourceSource)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceNums: ").append(toIndentedString(resourceNums)).append("\n");
        sb.append("    resourceAvailableNums: ").append(toIndentedString(resourceAvailableNums)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
