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
 * 商品素材信息
 */
public class ProductMediaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    /**
     * 资产类型 * IMAGE：图片 * VIDEO：视频 * AUDIO：音频
     */
    public static final class AssetTypeEnum {

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final AssetTypeEnum IMAGE = new AssetTypeEnum("IMAGE");

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final AssetTypeEnum VIDEO = new AssetTypeEnum("VIDEO");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final AssetTypeEnum AUDIO = new AssetTypeEnum("AUDIO");

        private static final Map<String, AssetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetTypeEnum> createStaticFields() {
            Map<String, AssetTypeEnum> map = new HashMap<>();
            map.put("IMAGE", IMAGE);
            map.put("VIDEO", VIDEO);
            map.put("AUDIO", AUDIO);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssetTypeEnum(value));
        }

        public static AssetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "order")

    private Integer order;

    public ProductMediaInfo withAssetId(String assetId) {
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

    public ProductMediaInfo withAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型 * IMAGE：图片 * VIDEO：视频 * AUDIO：音频
     * @return assetType
     */
    public AssetTypeEnum getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
    }

    public ProductMediaInfo withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释**： 资产次序。不设置或者0表示按照加入时间先后排序。业务上将次序最靠前的图片设置为商品封面。
     * minimum: 0
     * maximum: 300
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductMediaInfo that = (ProductMediaInfo) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.assetType, that.assetType)
            && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, assetType, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductMediaInfo {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
