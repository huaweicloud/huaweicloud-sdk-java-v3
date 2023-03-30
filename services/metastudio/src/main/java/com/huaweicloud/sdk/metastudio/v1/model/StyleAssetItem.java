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
 * 风格化素材数字资产信息
 */
public class StyleAssetItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    /**
     * 资产类型
     */
    public static final class AssetTypeEnum {

        /**
         * Enum ANIMATION for value: "ANIMATION"
         */
        public static final AssetTypeEnum ANIMATION = new AssetTypeEnum("ANIMATION");

        /**
         * Enum MATERIAL for value: "MATERIAL"
         */
        public static final AssetTypeEnum MATERIAL = new AssetTypeEnum("MATERIAL");

        private static final Map<String, AssetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetTypeEnum> createStaticFields() {
            Map<String, AssetTypeEnum> map = new HashMap<>();
            map.put("ANIMATION", ANIMATION);
            map.put("MATERIAL", MATERIAL);
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

    public StyleAssetItem withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public StyleAssetItem withAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型
     * @return assetType
     */
    public AssetTypeEnum getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
    }

    public StyleAssetItem withCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }

    /**
     * 封面图URL
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
        StyleAssetItem styleAssetItem = (StyleAssetItem) o;
        return Objects.equals(this.assetId, styleAssetItem.assetId)
            && Objects.equals(this.assetType, styleAssetItem.assetType)
            && Objects.equals(this.coverUrl, styleAssetItem.coverUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, assetType, coverUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StyleAssetItem {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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
