package com.huaweicloud.sdk.aom.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SubAppCreateParam
 */
public class SubAppCreateParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    /**
     * 应用、子应用，取值：APPLICATION、SUB_APPLICATION，不区分大小写
     */
    public static final class ModelTypeEnum {

        /**
         * Enum APPLICATION for value: "APPLICATION"
         */
        public static final ModelTypeEnum APPLICATION = new ModelTypeEnum("APPLICATION");

        /**
         * Enum SUB_APPLICATION for value: "SUB_APPLICATION"
         */
        public static final ModelTypeEnum SUB_APPLICATION = new ModelTypeEnum("SUB_APPLICATION");

        private static final Map<String, ModelTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelTypeEnum> createStaticFields() {
            Map<String, ModelTypeEnum> map = new HashMap<>();
            map.put("APPLICATION", APPLICATION);
            map.put("SUB_APPLICATION", SUB_APPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelTypeEnum(String value) {
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
        public static ModelTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelTypeEnum(value));
        }

        public static ModelTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelTypeEnum) {
                return this.value.equals(((ModelTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_type")

    private ModelTypeEnum modelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public SubAppCreateParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子应用名称：字符集长度2-64，仅支持字符集：英文字母、数字、下划线、中划线、点
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubAppCreateParam withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 子应用节点显示名：字符集长度2-64，仅支持字符集：中文字符、英文字母、数字、下划线、中划线、点
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public SubAppCreateParam withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 应用Id、子应用Id,id长度不能超过36位，由大小写字母、数字组成
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public SubAppCreateParam withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * 应用、子应用，取值：APPLICATION、SUB_APPLICATION，不区分大小写
     * @return modelType
     */
    public ModelTypeEnum getModelType() {
        return modelType;
    }

    public void setModelType(ModelTypeEnum modelType) {
        this.modelType = modelType;
    }

    public SubAppCreateParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述：最大255字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubAppCreateParam that = (SubAppCreateParam) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.modelId, that.modelId) && Objects.equals(this.modelType, that.modelType)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, displayName, modelId, modelType, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubAppCreateParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
