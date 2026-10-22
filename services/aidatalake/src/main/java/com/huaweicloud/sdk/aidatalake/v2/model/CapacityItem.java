package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：最大容量配置。 **约束限制**：不涉及。 
 */
public class CapacityItem {

    /**
     * **参数解释**：资源类型。 **约束限制**：不涉及。 **取值范围**：   - CPU：中央处理器。   - GPU：图形处理器。   - NPU：神经网络处理器。 **默认取值**：不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum CPU for value: "CPU"
         */
        public static final TypeEnum CPU = new TypeEnum("CPU");

        /**
         * Enum GPU for value: "GPU"
         */
        public static final TypeEnum GPU = new TypeEnum("GPU");

        /**
         * Enum NPU for value: "NPU"
         */
        public static final TypeEnum NPU = new TypeEnum("NPU");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CPU", CPU);
            map.put("GPU", GPU);
            map.put("NPU", NPU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    public CapacityItem withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：资源类型。 **约束限制**：不涉及。 **取值范围**：   - CPU：中央处理器。   - GPU：图形处理器。   - NPU：神经网络处理器。 **默认取值**：不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CapacityItem withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * **参数解释**：资源数量。CPU资源单位为核，GPU/NPU资源单位为个。 **约束限制**：不涉及。 **取值范围**：0~48000。 **默认取值**：不涉及。 
     * minimum: 0
     * maximum: 48000
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public CapacityItem withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**：资源规格。 **约束限制**：不涉及。 **取值范围**：由英文字母、数字、小数点和中划线组成，长度为1~64个字符。 **默认取值**：不涉及。 
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapacityItem that = (CapacityItem) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.specCode, that.specCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, specCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapacityItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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
