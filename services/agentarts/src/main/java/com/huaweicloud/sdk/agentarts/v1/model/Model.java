package com.huaweicloud.sdk.agentarts.v1.model;

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
 * **参数解释：** 大模型的核心配置信息及支持的参数范围。 **取值范围：** 不涉及。
 */
public class Model {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tokens_top")

    private Integer maxTokensTop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tokens_bottom")

    private Integer maxTokensBottom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temperature_top")

    private String temperatureTop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temperature_bottom")

    private String temperatureBottom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_p_top")

    private String topPTop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_p_bottom")

    private String topPBottom;

    /**
     * Gets or Sets supportedScenes
     */
    public static final class SupportedScenesEnum {

        /**
         * Enum EVALUATORS for value: "evaluators"
         */
        public static final SupportedScenesEnum EVALUATORS = new SupportedScenesEnum("evaluators");

        /**
         * Enum DATASETS_SYNTHESIS for value: "datasets-synthesis"
         */
        public static final SupportedScenesEnum DATASETS_SYNTHESIS = new SupportedScenesEnum("datasets-synthesis");

        private static final Map<String, SupportedScenesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportedScenesEnum> createStaticFields() {
            Map<String, SupportedScenesEnum> map = new HashMap<>();
            map.put("evaluators", EVALUATORS);
            map.put("datasets-synthesis", DATASETS_SYNTHESIS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportedScenesEnum(String value) {
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
        public static SupportedScenesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportedScenesEnum(value));
        }

        public static SupportedScenesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportedScenesEnum) {
                return this.value.equals(((SupportedScenesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_scenes")

    private List<SupportedScenesEnum> supportedScenes = null;

    public Model withMaxTokensTop(Integer maxTokensTop) {
        this.maxTokensTop = maxTokensTop;
        return this;
    }

    /**
     * **参数解释：** 模型生成文本的最大长度上限。 **取值范围：** 0 - 10000。
     * minimum: 0
     * maximum: 10000
     * @return maxTokensTop
     */
    public Integer getMaxTokensTop() {
        return maxTokensTop;
    }

    public void setMaxTokensTop(Integer maxTokensTop) {
        this.maxTokensTop = maxTokensTop;
    }

    public Model withMaxTokensBottom(Integer maxTokensBottom) {
        this.maxTokensBottom = maxTokensBottom;
        return this;
    }

    /**
     * **参数解释：** 模型生成文本的最小长度下限。 **取值范围：** 0 - 10000。
     * minimum: 0
     * maximum: 10000
     * @return maxTokensBottom
     */
    public Integer getMaxTokensBottom() {
        return maxTokensBottom;
    }

    public void setMaxTokensBottom(Integer maxTokensBottom) {
        this.maxTokensBottom = maxTokensBottom;
    }

    public Model withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * **参数解释：** 模型的唯一标识符。 **取值范围：** 不涉及。
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Model withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：** 模型的显示名称。 **取值范围：** 不涉及。
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Model withTemperatureTop(String temperatureTop) {
        this.temperatureTop = temperatureTop;
        return this;
    }

    /**
     * **参数解释：** 模型生成随机性（Temperature）的上限值。 **取值范围：** 不涉及。
     * @return temperatureTop
     */
    public String getTemperatureTop() {
        return temperatureTop;
    }

    public void setTemperatureTop(String temperatureTop) {
        this.temperatureTop = temperatureTop;
    }

    public Model withTemperatureBottom(String temperatureBottom) {
        this.temperatureBottom = temperatureBottom;
        return this;
    }

    /**
     * **参数解释：** 模型生成随机性的下限值。 **约束限制：** 0到10000字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return temperatureBottom
     */
    public String getTemperatureBottom() {
        return temperatureBottom;
    }

    public void setTemperatureBottom(String temperatureBottom) {
        this.temperatureBottom = temperatureBottom;
    }

    public Model withTopPTop(String topPTop) {
        this.topPTop = topPTop;
        return this;
    }

    /**
     * **参数解释：** TopP采样策略的上限值。 **取值范围：** 不涉及。
     * @return topPTop
     */
    public String getTopPTop() {
        return topPTop;
    }

    public void setTopPTop(String topPTop) {
        this.topPTop = topPTop;
    }

    public Model withTopPBottom(String topPBottom) {
        this.topPBottom = topPBottom;
        return this;
    }

    /**
     * **参数解释：** TopP采样策略的下限值。 **取值范围：** 不涉及。
     * @return topPBottom
     */
    public String getTopPBottom() {
        return topPBottom;
    }

    public void setTopPBottom(String topPBottom) {
        this.topPBottom = topPBottom;
    }

    public Model withSupportedScenes(List<SupportedScenesEnum> supportedScenes) {
        this.supportedScenes = supportedScenes;
        return this;
    }

    public Model addSupportedScenesItem(SupportedScenesEnum supportedScenesItem) {
        if (this.supportedScenes == null) {
            this.supportedScenes = new ArrayList<>();
        }
        this.supportedScenes.add(supportedScenesItem);
        return this;
    }

    public Model withSupportedScenes(Consumer<List<SupportedScenesEnum>> supportedScenesSetter) {
        if (this.supportedScenes == null) {
            this.supportedScenes = new ArrayList<>();
        }
        supportedScenesSetter.accept(this.supportedScenes);
        return this;
    }

    /**
     * **参数解释：** 模型支持的应用场景列表。 **取值范围：** 数组长度为0到100。可选枚举值包括： - evaluators：评估器场景，用于质量评估。 - datasets-synthesis：数据合成场景，用于生成评测集。
     * @return supportedScenes
     */
    public List<SupportedScenesEnum> getSupportedScenes() {
        return supportedScenes;
    }

    public void setSupportedScenes(List<SupportedScenesEnum> supportedScenes) {
        this.supportedScenes = supportedScenes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Model that = (Model) obj;
        return Objects.equals(this.maxTokensTop, that.maxTokensTop)
            && Objects.equals(this.maxTokensBottom, that.maxTokensBottom) && Objects.equals(this.modelId, that.modelId)
            && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.temperatureTop, that.temperatureTop)
            && Objects.equals(this.temperatureBottom, that.temperatureBottom)
            && Objects.equals(this.topPTop, that.topPTop) && Objects.equals(this.topPBottom, that.topPBottom)
            && Objects.equals(this.supportedScenes, that.supportedScenes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxTokensTop,
            maxTokensBottom,
            modelId,
            modelName,
            temperatureTop,
            temperatureBottom,
            topPTop,
            topPBottom,
            supportedScenes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Model {\n");
        sb.append("    maxTokensTop: ").append(toIndentedString(maxTokensTop)).append("\n");
        sb.append("    maxTokensBottom: ").append(toIndentedString(maxTokensBottom)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    temperatureTop: ").append(toIndentedString(temperatureTop)).append("\n");
        sb.append("    temperatureBottom: ").append(toIndentedString(temperatureBottom)).append("\n");
        sb.append("    topPTop: ").append(toIndentedString(topPTop)).append("\n");
        sb.append("    topPBottom: ").append(toIndentedString(topPBottom)).append("\n");
        sb.append("    supportedScenes: ").append(toIndentedString(supportedScenes)).append("\n");
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
