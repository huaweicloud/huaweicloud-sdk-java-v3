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
 * 资源配置。
 */
public class ChatResourceConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_resource")

    private Integer countResource;

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

    /**
     * 资源计费类型。 * PERIODIC: 包周期 * ONE_TIME：一次性计费 * ON_DEMAND: 按需计费 > * 一次性计费包括：租户订购的一次性资源，SP管理员分配给租户的一次性资源，SP管理员分配给租户的按需套餐包资源，系统管理员分配的资源（分钟数等）。
     */
    public static final class ChargeModeEnum {

        /**
         * Enum PERIODIC for value: "PERIODIC"
         */
        public static final ChargeModeEnum PERIODIC = new ChargeModeEnum("PERIODIC");

        /**
         * Enum ONE_TIME for value: "ONE_TIME"
         */
        public static final ChargeModeEnum ONE_TIME = new ChargeModeEnum("ONE_TIME");

        /**
         * Enum ON_DEMAND for value: "ON_DEMAND"
         */
        public static final ChargeModeEnum ON_DEMAND = new ChargeModeEnum("ON_DEMAND");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("PERIODIC", PERIODIC);
            map.put("ONE_TIME", ONE_TIME);
            map.put("ON_DEMAND", ON_DEMAND);
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
    @JsonProperty(value = "resource_nums")

    private Integer resourceNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_available_nums")

    private Integer resourceAvailableNums;

    /**
     * 资源状态。 * ACTIVE: 正常 * FREEZE：冻结 * DELETED：退订或过期
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum FREEZE for value: "FREEZE"
         */
        public static final StatusEnum FREEZE = new StatusEnum("FREEZE");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("FREEZE", FREEZE);
            map.put("DELETED", DELETED);
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
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public ChatResourceConfigInfo withResourceId(String resourceId) {
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

    public ChatResourceConfigInfo withCountResource(Integer countResource) {
        this.countResource = countResource;
        return this;
    }

    /**
     * 资源数量
     * minimum: 0
     * maximum: 10000
     * @return countResource
     */
    public Integer getCountResource() {
        return countResource;
    }

    public void setCountResource(Integer countResource) {
        this.countResource = countResource;
    }

    public ChatResourceConfigInfo withResourceSource(ResourceSourceEnum resourceSource) {
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

    public ChatResourceConfigInfo withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 资源计费类型。 * PERIODIC: 包周期 * ONE_TIME：一次性计费 * ON_DEMAND: 按需计费 > * 一次性计费包括：租户订购的一次性资源，SP管理员分配给租户的一次性资源，SP管理员分配给租户的按需套餐包资源，系统管理员分配的资源（分钟数等）。
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ChatResourceConfigInfo withResourceNums(Integer resourceNums) {
        this.resourceNums = resourceNums;
        return this;
    }

    /**
     * 资源数量。智能交互并发路数。
     * minimum: 0
     * maximum: 10000000
     * @return resourceNums
     */
    public Integer getResourceNums() {
        return resourceNums;
    }

    public void setResourceNums(Integer resourceNums) {
        this.resourceNums = resourceNums;
    }

    public ChatResourceConfigInfo withResourceAvailableNums(Integer resourceAvailableNums) {
        this.resourceAvailableNums = resourceAvailableNums;
        return this;
    }

    /**
     * 可用资源数量。智能交互并发路数。
     * minimum: 0
     * maximum: 10000000
     * @return resourceAvailableNums
     */
    public Integer getResourceAvailableNums() {
        return resourceAvailableNums;
    }

    public void setResourceAvailableNums(Integer resourceAvailableNums) {
        this.resourceAvailableNums = resourceAvailableNums;
    }

    public ChatResourceConfigInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态。 * ACTIVE: 正常 * FREEZE：冻结 * DELETED：退订或过期
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ChatResourceConfigInfo withExpireTime(String expireTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatResourceConfigInfo that = (ChatResourceConfigInfo) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.countResource, that.countResource)
            && Objects.equals(this.resourceSource, that.resourceSource)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.resourceNums, that.resourceNums)
            && Objects.equals(this.resourceAvailableNums, that.resourceAvailableNums)
            && Objects.equals(this.status, that.status) && Objects.equals(this.expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            countResource,
            resourceSource,
            chargeMode,
            resourceNums,
            resourceAvailableNums,
            status,
            expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatResourceConfigInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    countResource: ").append(toIndentedString(countResource)).append("\n");
        sb.append("    resourceSource: ").append(toIndentedString(resourceSource)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    resourceNums: ").append(toIndentedString(resourceNums)).append("\n");
        sb.append("    resourceAvailableNums: ").append(toIndentedString(resourceAvailableNums)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
