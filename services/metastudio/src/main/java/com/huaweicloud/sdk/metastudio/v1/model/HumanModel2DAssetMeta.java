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
 * HumanModel2DAssetMeta
 */
public class HumanModel2DAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_action_editable")

    private Boolean isActionEditable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_real_background")

    private Boolean isRealBackground;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_live")

    private Boolean supportLive;

    /**
     * 分身数字人模型版本。默认是V2版本模型。 * V2: V2版本模型 * V3：V3版本模型
     */
    public static final class ModelVersionEnum {

        /**
         * Enum V2 for value: "V2"
         */
        public static final ModelVersionEnum V2 = new ModelVersionEnum("V2");

        /**
         * Enum V3 for value: "V3"
         */
        public static final ModelVersionEnum V3 = new ModelVersionEnum("V3");

        private static final Map<String, ModelVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelVersionEnum> createStaticFields() {
            Map<String, ModelVersionEnum> map = new HashMap<>();
            map.put("V2", V2);
            map.put("V3", V3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelVersionEnum(String value) {
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
        public static ModelVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelVersionEnum(value));
        }

        public static ModelVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelVersionEnum) {
                return this.value.equals(((ModelVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_version")

    private ModelVersionEnum modelVersion;

    public HumanModel2DAssetMeta withIsActionEditable(Boolean isActionEditable) {
        this.isActionEditable = isActionEditable;
        return this;
    }

    /**
     * 分身数字人的动作是否可编辑。默认不可编辑。
     * @return isActionEditable
     */
    public Boolean getIsActionEditable() {
        return isActionEditable;
    }

    public void setIsActionEditable(Boolean isActionEditable) {
        this.isActionEditable = isActionEditable;
    }

    public HumanModel2DAssetMeta withIsRealBackground(Boolean isRealBackground) {
        this.isRealBackground = isRealBackground;
        return this;
    }

    /**
     * 是否是实景分身数字人。实景分身数字人不做背景替换。
     * @return isRealBackground
     */
    public Boolean getIsRealBackground() {
        return isRealBackground;
    }

    public void setIsRealBackground(Boolean isRealBackground) {
        this.isRealBackground = isRealBackground;
    }

    public HumanModel2DAssetMeta withSupportLive(Boolean supportLive) {
        this.supportLive = supportLive;
        return this;
    }

    /**
     * 是否支持直播
     * @return supportLive
     */
    public Boolean getSupportLive() {
        return supportLive;
    }

    public void setSupportLive(Boolean supportLive) {
        this.supportLive = supportLive;
    }

    public HumanModel2DAssetMeta withModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * 分身数字人模型版本。默认是V2版本模型。 * V2: V2版本模型 * V3：V3版本模型
     * @return modelVersion
     */
    public ModelVersionEnum getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HumanModel2DAssetMeta that = (HumanModel2DAssetMeta) obj;
        return Objects.equals(this.isActionEditable, that.isActionEditable)
            && Objects.equals(this.isRealBackground, that.isRealBackground)
            && Objects.equals(this.supportLive, that.supportLive)
            && Objects.equals(this.modelVersion, that.modelVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isActionEditable, isRealBackground, supportLive, modelVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HumanModel2DAssetMeta {\n");
        sb.append("    isActionEditable: ").append(toIndentedString(isActionEditable)).append("\n");
        sb.append("    isRealBackground: ").append(toIndentedString(isRealBackground)).append("\n");
        sb.append("    supportLive: ").append(toIndentedString(supportLive)).append("\n");
        sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
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
