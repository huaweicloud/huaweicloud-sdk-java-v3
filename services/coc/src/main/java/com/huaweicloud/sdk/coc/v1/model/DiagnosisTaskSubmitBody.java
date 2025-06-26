package com.huaweicloud.sdk.coc.v1.model;

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
 * 诊断任务提交请求的结构体
 */
public class DiagnosisTaskSubmitBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    /**
     * 被诊断实例的类型
     */
    public static final class TypeEnum {

        /**
         * Enum ECS for value: "ECS"
         */
        public static final TypeEnum ECS = new TypeEnum("ECS");

        /**
         * Enum RDS for value: "RDS"
         */
        public static final TypeEnum RDS = new TypeEnum("RDS");

        /**
         * Enum DCS for value: "DCS"
         */
        public static final TypeEnum DCS = new TypeEnum("DCS");

        /**
         * Enum DMS for value: "DMS"
         */
        public static final TypeEnum DMS = new TypeEnum("DMS");

        /**
         * Enum ELB for value: "ELB"
         */
        public static final TypeEnum ELB = new TypeEnum("ELB");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ECS", ECS);
            map.put("RDS", RDS);
            map.put("DCS", DCS);
            map.put("DMS", DMS);
            map.put("ELB", ELB);
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
    @JsonProperty(value = "extra_properties")

    private List<String> extraProperties = null;

    public DiagnosisTaskSubmitBody withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public DiagnosisTaskSubmitBody addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public DiagnosisTaskSubmitBody withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 待诊断的实例ID
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public DiagnosisTaskSubmitBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 被诊断实例的类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DiagnosisTaskSubmitBody withExtraProperties(List<String> extraProperties) {
        this.extraProperties = extraProperties;
        return this;
    }

    public DiagnosisTaskSubmitBody addExtraPropertiesItem(String extraPropertiesItem) {
        if (this.extraProperties == null) {
            this.extraProperties = new ArrayList<>();
        }
        this.extraProperties.add(extraPropertiesItem);
        return this;
    }

    public DiagnosisTaskSubmitBody withExtraProperties(Consumer<List<String>> extraPropertiesSetter) {
        if (this.extraProperties == null) {
            this.extraProperties = new ArrayList<>();
        }
        extraPropertiesSetter.accept(this.extraProperties);
        return this;
    }

    /**
     * 适用于RDS、DMS、DCS、ELB等的额外参数（JSON字符串），该数组长度应与提交的实例数组长度对应
     * @return extraProperties
     */
    public List<String> getExtraProperties() {
        return extraProperties;
    }

    public void setExtraProperties(List<String> extraProperties) {
        this.extraProperties = extraProperties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnosisTaskSubmitBody that = (DiagnosisTaskSubmitBody) obj;
        return Objects.equals(this.resourceIds, that.resourceIds) && Objects.equals(this.type, that.type)
            && Objects.equals(this.extraProperties, that.extraProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceIds, type, extraProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisTaskSubmitBody {\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    extraProperties: ").append(toIndentedString(extraProperties)).append("\n");
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
