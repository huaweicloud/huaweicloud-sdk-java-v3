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
 * VideoScriptBaseInfo
 */
public class VideoScriptBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_description")

    private String scriptDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_asset_id")

    private String modelAssetId;

    /**
     * 数字人模型类型。  * HUMAN_MODEL_2D：分身数字人
     */
    public static final class ModelAssetTypeEnum {

        /**
         * Enum HUMAN_MODEL_2D for value: "HUMAN_MODEL_2D"
         */
        public static final ModelAssetTypeEnum HUMAN_MODEL_2D = new ModelAssetTypeEnum("HUMAN_MODEL_2D");

        private static final Map<String, ModelAssetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelAssetTypeEnum> createStaticFields() {
            Map<String, ModelAssetTypeEnum> map = new HashMap<>();
            map.put("HUMAN_MODEL_2D", HUMAN_MODEL_2D);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelAssetTypeEnum(String value) {
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
        public static ModelAssetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelAssetTypeEnum(value));
        }

        public static ModelAssetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelAssetTypeEnum) {
                return this.value.equals(((ModelAssetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_asset_type")

    private ModelAssetTypeEnum modelAssetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_cover_url")

    private String scriptCoverUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_type")

    private String scriptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public VideoScriptBaseInfo withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 剧本ID。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public VideoScriptBaseInfo withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 剧本名称。
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public VideoScriptBaseInfo withScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
        return this;
    }

    /**
     * 剧本描述。
     * @return scriptDescription
     */
    public String getScriptDescription() {
        return scriptDescription;
    }

    public void setScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
    }

    public VideoScriptBaseInfo withModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
        return this;
    }

    /**
     * 数字人模型资产ID，可以从资产库中查询。
     * @return modelAssetId
     */
    public String getModelAssetId() {
        return modelAssetId;
    }

    public void setModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
    }

    public VideoScriptBaseInfo withModelAssetType(ModelAssetTypeEnum modelAssetType) {
        this.modelAssetType = modelAssetType;
        return this;
    }

    /**
     * 数字人模型类型。  * HUMAN_MODEL_2D：分身数字人
     * @return modelAssetType
     */
    public ModelAssetTypeEnum getModelAssetType() {
        return modelAssetType;
    }

    public void setModelAssetType(ModelAssetTypeEnum modelAssetType) {
        this.modelAssetType = modelAssetType;
    }

    public VideoScriptBaseInfo withScriptCoverUrl(String scriptCoverUrl) {
        this.scriptCoverUrl = scriptCoverUrl;
        return this;
    }

    /**
     * 剧本封面下载url。
     * @return scriptCoverUrl
     */
    public String getScriptCoverUrl() {
        return scriptCoverUrl;
    }

    public void setScriptCoverUrl(String scriptCoverUrl) {
        this.scriptCoverUrl = scriptCoverUrl;
    }

    public VideoScriptBaseInfo withScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }

    /**
     * 脚本类型，即视频制作的驱动方式。默认TEXT * TEXT: 文本驱动，即通过TTS合成语音 * AUDIO: 语音驱动
     * @return scriptType
     */
    public String getScriptType() {
        return scriptType;
    }

    public void setScriptType(String scriptType) {
        this.scriptType = scriptType;
    }

    public VideoScriptBaseInfo withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 台词脚本。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public VideoScriptBaseInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public VideoScriptBaseInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoScriptBaseInfo that = (VideoScriptBaseInfo) obj;
        return Objects.equals(this.scriptId, that.scriptId) && Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.scriptDescription, that.scriptDescription)
            && Objects.equals(this.modelAssetId, that.modelAssetId)
            && Objects.equals(this.modelAssetType, that.modelAssetType)
            && Objects.equals(this.scriptCoverUrl, that.scriptCoverUrl)
            && Objects.equals(this.scriptType, that.scriptType) && Objects.equals(this.text, that.text)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptId,
            scriptName,
            scriptDescription,
            modelAssetId,
            modelAssetType,
            scriptCoverUrl,
            scriptType,
            text,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoScriptBaseInfo {\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    scriptDescription: ").append(toIndentedString(scriptDescription)).append("\n");
        sb.append("    modelAssetId: ").append(toIndentedString(modelAssetId)).append("\n");
        sb.append("    modelAssetType: ").append(toIndentedString(modelAssetType)).append("\n");
        sb.append("    scriptCoverUrl: ").append(toIndentedString(scriptCoverUrl)).append("\n");
        sb.append("    scriptType: ").append(toIndentedString(scriptType)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
