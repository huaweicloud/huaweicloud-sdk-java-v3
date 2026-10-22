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
 * **参数解释**：容量配置。 
 */
public class V2EndpointCapacityItem {

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
    @JsonProperty(value = "maximum_capacity")

    private Integer maximumCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum_capacity")

    private Integer minimumCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_ondemand_resource")

    private Boolean useOndemandResource;

    public V2EndpointCapacityItem withType(TypeEnum type) {
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

    public V2EndpointCapacityItem withMaximumCapacity(Integer maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        return this;
    }

    /**
     * **参数解释**：资源数量。CPU资源单位为核，GPU/NPU资源单位为个。 **约束限制**：不涉及。 **取值范围**：1~10000。 **默认取值**：不涉及。 
     * minimum: 1
     * maximum: 10000
     * @return maximumCapacity
     */
    public Integer getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(Integer maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public V2EndpointCapacityItem withMinimumCapacity(Integer minimumCapacity) {
        this.minimumCapacity = minimumCapacity;
        return this;
    }

    /**
     * **参数解释**：最小资源数量。CPU资源单位为核，GPU/NPU资源单位为个。 **约束限制**：不涉及。 **取值范围**：0~10000，小于等于maximum_capacity。 **默认取值**：不涉及。 
     * minimum: 0
     * maximum: 10000
     * @return minimumCapacity
     */
    public Integer getMinimumCapacity() {
        return minimumCapacity;
    }

    public void setMinimumCapacity(Integer minimumCapacity) {
        this.minimumCapacity = minimumCapacity;
    }

    public V2EndpointCapacityItem withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**：资源规格。获取方式：从规格列表查询获取。 **约束限制**：预留资源和混合模式端点此参数必填。端点创建后此参数不支持变更。 **取值范围**：支持英文字母、数字、小数点及连字符，长度为1~64个字符。 **默认取值**：不涉及。 
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public V2EndpointCapacityItem withUseOndemandResource(Boolean useOndemandResource) {
        this.useOndemandResource = useOndemandResource;
        return this;
    }

    /**
     * **参数解释**：容量是否使用弹性资源。 **约束限制**：端点创建后此参数不支持变更。 **取值范围**：   - true：使用弹性资源。   - false：不使用弹性资源。 **默认取值**：false。 
     * @return useOndemandResource
     */
    public Boolean getUseOndemandResource() {
        return useOndemandResource;
    }

    public void setUseOndemandResource(Boolean useOndemandResource) {
        this.useOndemandResource = useOndemandResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2EndpointCapacityItem that = (V2EndpointCapacityItem) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.maximumCapacity, that.maximumCapacity)
            && Objects.equals(this.minimumCapacity, that.minimumCapacity)
            && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.useOndemandResource, that.useOndemandResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, maximumCapacity, minimumCapacity, specCode, useOndemandResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2EndpointCapacityItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    maximumCapacity: ").append(toIndentedString(maximumCapacity)).append("\n");
        sb.append("    minimumCapacity: ").append(toIndentedString(minimumCapacity)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    useOndemandResource: ").append(toIndentedString(useOndemandResource)).append("\n");
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
