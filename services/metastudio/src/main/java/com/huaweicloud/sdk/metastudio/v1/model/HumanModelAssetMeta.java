package com.huaweicloud.sdk.metastudio.v1.model;

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
 * 数字人模型元数据。
 */
public class HumanModelAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style_id")

    private String styleId;

    /**
     * **参数解释**： 数字人模型建模类型。 **约束限制**： 不涉及 **取值范围**： * UPLOADED：租户上传的模型 * PICTURE_MODELING：照片建模生成的模型 * CHARACTER_CUSTOMIZATION_MODELING：捏脸生成的模型
     */
    public static final class ModelingTypeEnum {

        /**
         * Enum UPLOADED for value: "UPLOADED"
         */
        public static final ModelingTypeEnum UPLOADED = new ModelingTypeEnum("UPLOADED");

        /**
         * Enum PICTURE_MODELING for value: "PICTURE_MODELING"
         */
        public static final ModelingTypeEnum PICTURE_MODELING = new ModelingTypeEnum("PICTURE_MODELING");

        /**
         * Enum CHARACTER_CUSTOMIZATION_MODELING for value: "CHARACTER_CUSTOMIZATION_MODELING"
         */
        public static final ModelingTypeEnum CHARACTER_CUSTOMIZATION_MODELING =
            new ModelingTypeEnum("CHARACTER_CUSTOMIZATION_MODELING");

        private static final Map<String, ModelingTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelingTypeEnum> createStaticFields() {
            Map<String, ModelingTypeEnum> map = new HashMap<>();
            map.put("UPLOADED", UPLOADED);
            map.put("PICTURE_MODELING", PICTURE_MODELING);
            map.put("CHARACTER_CUSTOMIZATION_MODELING", CHARACTER_CUSTOMIZATION_MODELING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelingTypeEnum(String value) {
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
        public static ModelingTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelingTypeEnum(value));
        }

        public static ModelingTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelingTypeEnum) {
                return this.value.equals(((ModelingTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_type")

    private ModelingTypeEnum modelingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_job_id")

    private String modelingJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_properties")

    private HumanModelMetaProperties modelProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<ComponentInfo> components = null;

    public HumanModelAssetMeta withStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }

    /**
     * **参数解释**： 数字人模型风格ID。 **约束限制**： 当前仅支持系统提供的几种风格。 **取值范围**： * system_male_001：男性风格01 * system_female_001：女性风格01 * system_male_002：男性风格02  * system_female_002：女性风格02  **默认取值**： 不涉及
     * @return styleId
     */
    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public HumanModelAssetMeta withModelingType(ModelingTypeEnum modelingType) {
        this.modelingType = modelingType;
        return this;
    }

    /**
     * **参数解释**： 数字人模型建模类型。 **约束限制**： 不涉及 **取值范围**： * UPLOADED：租户上传的模型 * PICTURE_MODELING：照片建模生成的模型 * CHARACTER_CUSTOMIZATION_MODELING：捏脸生成的模型
     * @return modelingType
     */
    public ModelingTypeEnum getModelingType() {
        return modelingType;
    }

    public void setModelingType(ModelingTypeEnum modelingType) {
        this.modelingType = modelingType;
    }

    public HumanModelAssetMeta withModelingJobId(String modelingJobId) {
        this.modelingJobId = modelingJobId;
        return this;
    }

    /**
     * **参数解释**： 建模任务ID。 **约束限制**： 仅由MetaStudio服务生成的模型系统自行填写 **取值范围**： 字符长度0-64位。 **默认取值**： 不涉及。
     * @return modelingJobId
     */
    public String getModelingJobId() {
        return modelingJobId;
    }

    public void setModelingJobId(String modelingJobId) {
        this.modelingJobId = modelingJobId;
    }

    public HumanModelAssetMeta withModelProperties(HumanModelMetaProperties modelProperties) {
        this.modelProperties = modelProperties;
        return this;
    }

    public HumanModelAssetMeta withModelProperties(Consumer<HumanModelMetaProperties> modelPropertiesSetter) {
        if (this.modelProperties == null) {
            this.modelProperties = new HumanModelMetaProperties();
            modelPropertiesSetter.accept(this.modelProperties);
        }

        return this;
    }

    /**
     * Get modelProperties
     * @return modelProperties
     */
    public HumanModelMetaProperties getModelProperties() {
        return modelProperties;
    }

    public void setModelProperties(HumanModelMetaProperties modelProperties) {
        this.modelProperties = modelProperties;
    }

    public HumanModelAssetMeta withComponents(List<ComponentInfo> components) {
        this.components = components;
        return this;
    }

    public HumanModelAssetMeta addComponentsItem(ComponentInfo componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public HumanModelAssetMeta withComponents(Consumer<List<ComponentInfo>> componentsSetter) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * 可替换组件列表。
     * @return components
     */
    public List<ComponentInfo> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentInfo> components) {
        this.components = components;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HumanModelAssetMeta that = (HumanModelAssetMeta) obj;
        return Objects.equals(this.styleId, that.styleId) && Objects.equals(this.modelingType, that.modelingType)
            && Objects.equals(this.modelingJobId, that.modelingJobId)
            && Objects.equals(this.modelProperties, that.modelProperties)
            && Objects.equals(this.components, that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(styleId, modelingType, modelingJobId, modelProperties, components);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HumanModelAssetMeta {\n");
        sb.append("    styleId: ").append(toIndentedString(styleId)).append("\n");
        sb.append("    modelingType: ").append(toIndentedString(modelingType)).append("\n");
        sb.append("    modelingJobId: ").append(toIndentedString(modelingJobId)).append("\n");
        sb.append("    modelProperties: ").append(toIndentedString(modelProperties)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
