package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RestartInstanceRequestBody
 */
public class RestartInstanceRequestBody {

    /**
     * **参数解释：** 待重启对象的类型。 **约束限制：** 重启集群实例下的节点或组时，该参数必选。 - 重启mongos节点时，取值为“mongos”。 - 重启shard组时，取值为“shard”。 - 重启config组时，取值为“config”。 - 重启实例（集群、副本集、单节点）时，不传该参数。 **取值范围：** - mongos - shard - config **默认取值：** 不涉及。
     */
    public static final class TargetTypeEnum {

        /**
         * Enum MONGOS for value: "mongos"
         */
        public static final TargetTypeEnum MONGOS = new TargetTypeEnum("mongos");

        /**
         * Enum SHARD for value: "shard"
         */
        public static final TargetTypeEnum SHARD = new TargetTypeEnum("shard");

        /**
         * Enum CONFIG for value: "config"
         */
        public static final TargetTypeEnum CONFIG = new TargetTypeEnum("config");

        private static final Map<String, TargetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetTypeEnum> createStaticFields() {
            Map<String, TargetTypeEnum> map = new HashMap<>();
            map.put("mongos", MONGOS);
            map.put("shard", SHARD);
            map.put("config", CONFIG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetTypeEnum(String value) {
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
        public static TargetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetTypeEnum(value));
        }

        public static TargetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetTypeEnum) {
                return this.value.equals(((TargetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private TargetTypeEnum targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_serial")

    private Boolean isSerial;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force")

    private Boolean isForce;

    public RestartInstanceRequestBody withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * **参数解释：** 待重启对象的类型。 **约束限制：** 重启集群实例下的节点或组时，该参数必选。 - 重启mongos节点时，取值为“mongos”。 - 重启shard组时，取值为“shard”。 - 重启config组时，取值为“config”。 - 重启实例（集群、副本集、单节点）时，不传该参数。 **取值范围：** - mongos - shard - config **默认取值：** 不涉及。
     * @return targetType
     */
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    public RestartInstanceRequestBody withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * **参数解释：** 待重启对象的ID，可以调用“查询实例列表和详情”接口获取。如果未申请实例，可以调用“创建实例”接口创建。 **约束限制：** 节点状态为正常时，不允许重启主节点。 **取值范围：** - 重启整个实例时，取值为实例ID。 - 重启集群实例shard或config组时取值为shard或config的组ID。 - 重启单个节点时，取值为对应节点的节点ID。 **默认取值：** 不涉及。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public RestartInstanceRequestBody withIsSerial(Boolean isSerial) {
        this.isSerial = isSerial;
        return this;
    }

    /**
     * **参数解释：** 是否选择节点串行重启。 **约束限制：** 只支持副本集实例。 **取值范围：** - true：表示节点串行重启。 - false：表示节点并行重启。 **默认取值：** false。
     * @return isSerial
     */
    public Boolean getIsSerial() {
        return isSerial;
    }

    public void setIsSerial(Boolean isSerial) {
        this.isSerial = isSerial;
    }

    public RestartInstanceRequestBody withIsForce(Boolean isForce) {
        this.isForce = isForce;
        return this;
    }

    /**
     * **参数解释：** 是否强制重启。 **约束限制：** 仅支持节点状态为异常时进行强制重启。只读节点暂不支持强制重启。 **取值范围：** - true：表示异常节点进行强制重启。 - false：表示进行正常重启。 **默认取值：** false。
     * @return isForce
     */
    public Boolean getIsForce() {
        return isForce;
    }

    public void setIsForce(Boolean isForce) {
        this.isForce = isForce;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestartInstanceRequestBody that = (RestartInstanceRequestBody) obj;
        return Objects.equals(this.targetType, that.targetType) && Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.isSerial, that.isSerial) && Objects.equals(this.isForce, that.isForce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetType, targetId, isSerial, isForce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartInstanceRequestBody {\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    isSerial: ").append(toIndentedString(isSerial)).append("\n");
        sb.append("    isForce: ").append(toIndentedString(isForce)).append("\n");
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
