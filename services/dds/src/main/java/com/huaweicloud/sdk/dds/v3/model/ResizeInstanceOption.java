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
 * ResizeInstanceOption
 */
public class ResizeInstanceOption {

    /**
     * 对象类型。 - 对于集群实例，该参数为必选。变更mongos节点规格时，取值为“mongos”；变更单个shard组规格、或者批量变更多个shard组规格时，取值为“shard”，变更config组规格时，取值为\"config\"。 - 对于副本集实例，不传该参数。变更readonly节点规格时,取值为“readonly”。 - 对于单节点实例，不传该参数。
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

        /**
         * Enum READONLY for value: "readonly"
         */
        public static final TargetTypeEnum READONLY = new TargetTypeEnum("readonly");

        private static final Map<String, TargetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetTypeEnum> createStaticFields() {
            Map<String, TargetTypeEnum> map = new HashMap<>();
            map.put("mongos", MONGOS);
            map.put("shard", SHARD);
            map.put("config", CONFIG);
            map.put("readonly", READONLY);
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
    @JsonProperty(value = "target_spec_code")

    private String targetSpecCode;

    public ResizeInstanceOption withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 对象类型。 - 对于集群实例，该参数为必选。变更mongos节点规格时，取值为“mongos”；变更单个shard组规格、或者批量变更多个shard组规格时，取值为“shard”，变更config组规格时，取值为\"config\"。 - 对于副本集实例，不传该参数。变更readonly节点规格时,取值为“readonly”。 - 对于单节点实例，不传该参数。
     * @return targetType
     */
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    public ResizeInstanceOption withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 待变更规格的节点ID或实例ID，可以调用“查询实例列表和详情”接口获取。如果未申请实例，可以调用“创建实例”接口创建。 - 对于集群实例，变更mongos节点规格时，取值为mongos节点ID；变更单个shard组规格时，取值为shard组ID；批量变更多个shard组规格时，不传该参数；变更config组规格时，取值为config组的ID。 - 对于副本集实例，取值为相应的实例ID。变更readonly节点规格时，取值为readonly节点ID。 - 对于单节点实例，取值为相应的实例ID。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public ResizeInstanceOption withTargetSpecCode(String targetSpecCode) {
        this.targetSpecCode = targetSpecCode;
        return this;
    }

    /**
     * 变更至新规格的资源规格编码。
     * @return targetSpecCode
     */
    public String getTargetSpecCode() {
        return targetSpecCode;
    }

    public void setTargetSpecCode(String targetSpecCode) {
        this.targetSpecCode = targetSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeInstanceOption that = (ResizeInstanceOption) obj;
        return Objects.equals(this.targetType, that.targetType) && Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.targetSpecCode, that.targetSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetType, targetId, targetSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceOption {\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetSpecCode: ").append(toIndentedString(targetSpecCode)).append("\n");
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
