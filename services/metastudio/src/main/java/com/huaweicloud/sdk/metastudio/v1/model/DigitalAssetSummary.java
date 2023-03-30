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
 * DigitalAssetSummary
 */
public class DigitalAssetSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    /**
     * 资产类型。 * HUMAN_MODEL:数字人模型 * VOICE_MODEL:音色模型 * SCENE:场景模型 * ANIMATION:动作动画 * VIDEO:视频文件 * IMAGE:图片文件 * PPT:幻灯片文件 * MATERIAL:风格化素材
     */
    public static final class AssetTypeEnum {

        /**
         * Enum HUMAN_MODEL for value: "HUMAN_MODEL"
         */
        public static final AssetTypeEnum HUMAN_MODEL = new AssetTypeEnum("HUMAN_MODEL");

        /**
         * Enum MODEL for value: "MODEL"
         */
        public static final AssetTypeEnum MODEL = new AssetTypeEnum("MODEL");

        /**
         * Enum ANIMATION for value: "ANIMATION"
         */
        public static final AssetTypeEnum ANIMATION = new AssetTypeEnum("ANIMATION");

        /**
         * Enum SCENE for value: "SCENE"
         */
        public static final AssetTypeEnum SCENE = new AssetTypeEnum("SCENE");

        /**
         * Enum PPT for value: "PPT"
         */
        public static final AssetTypeEnum PPT = new AssetTypeEnum("PPT");

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final AssetTypeEnum VIDEO = new AssetTypeEnum("VIDEO");

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final AssetTypeEnum IMAGE = new AssetTypeEnum("IMAGE");

        /**
         * Enum MATERIAL for value: "MATERIAL"
         */
        public static final AssetTypeEnum MATERIAL = new AssetTypeEnum("MATERIAL");

        /**
         * Enum VOICE_MODEL for value: "VOICE_MODEL"
         */
        public static final AssetTypeEnum VOICE_MODEL = new AssetTypeEnum("VOICE_MODEL");

        private static final Map<String, AssetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetTypeEnum> createStaticFields() {
            Map<String, AssetTypeEnum> map = new HashMap<>();
            map.put("HUMAN_MODEL", HUMAN_MODEL);
            map.put("MODEL", MODEL);
            map.put("ANIMATION", ANIMATION);
            map.put("SCENE", SCENE);
            map.put("PPT", PPT);
            map.put("VIDEO", VIDEO);
            map.put("IMAGE", IMAGE);
            map.put("MATERIAL", MATERIAL);
            map.put("VOICE_MODEL", VOICE_MODEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetTypeEnum(String value) {
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
        public static AssetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AssetTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AssetTypeEnum(value);
            }
            return result;
        }

        public static AssetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AssetTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetTypeEnum) {
                return this.value.equals(((AssetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private AssetTypeEnum assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_url")

    private String coverUrl;

    public DigitalAssetSummary withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产Id。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public DigitalAssetSummary withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 资产名称。
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public DigitalAssetSummary withAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型。 * HUMAN_MODEL:数字人模型 * VOICE_MODEL:音色模型 * SCENE:场景模型 * ANIMATION:动作动画 * VIDEO:视频文件 * IMAGE:图片文件 * PPT:幻灯片文件 * MATERIAL:风格化素材
     * @return assetType
     */
    public AssetTypeEnum getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
    }

    public DigitalAssetSummary withCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }

    /**
     * 封面图片路径。
     * @return coverUrl
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DigitalAssetSummary digitalAssetSummary = (DigitalAssetSummary) o;
        return Objects.equals(this.assetId, digitalAssetSummary.assetId)
            && Objects.equals(this.assetName, digitalAssetSummary.assetName)
            && Objects.equals(this.assetType, digitalAssetSummary.assetType)
            && Objects.equals(this.coverUrl, digitalAssetSummary.coverUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, assetName, assetType, coverUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DigitalAssetSummary {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
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
