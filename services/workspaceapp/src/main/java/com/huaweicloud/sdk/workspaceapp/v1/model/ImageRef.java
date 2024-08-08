package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 镜像源信息。
 */
public class ImageRef {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 镜像源的镜像类型: * `gold` - 云市场镜像 * `public` - 公共镜像 * `private` - 私有镜像 * `shared` - 共享镜像 * `other` - 其他
     */
    public static final class ImageTypeEnum {

        /**
         * Enum GOLD for value: "gold"
         */
        public static final ImageTypeEnum GOLD = new ImageTypeEnum("gold");

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final ImageTypeEnum PUBLIC = new ImageTypeEnum("public");

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final ImageTypeEnum PRIVATE = new ImageTypeEnum("private");

        /**
         * Enum SHARED for value: "shared"
         */
        public static final ImageTypeEnum SHARED = new ImageTypeEnum("shared");

        /**
         * Enum OTHER for value: "other"
         */
        public static final ImageTypeEnum OTHER = new ImageTypeEnum("other");

        private static final Map<String, ImageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageTypeEnum> createStaticFields() {
            Map<String, ImageTypeEnum> map = new HashMap<>();
            map.put("gold", GOLD);
            map.put("public", PUBLIC);
            map.put("private", PRIVATE);
            map.put("shared", SHARED);
            map.put("other", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImageTypeEnum(String value) {
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
        public static ImageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageTypeEnum(value));
        }

        public static ImageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImageTypeEnum) {
                return this.value.equals(((ImageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private ImageTypeEnum imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spce_code")

    private String spceCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    public ImageRef withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 镜像源的唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageRef withImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像源的镜像类型: * `gold` - 云市场镜像 * `public` - 公共镜像 * `private` - 私有镜像 * `shared` - 共享镜像 * `other` - 其他
     * @return imageType
     */
    public ImageTypeEnum getImageType() {
        return imageType;
    }

    public void setImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
    }

    public ImageRef withSpceCode(String spceCode) {
        this.spceCode = spceCode;
        return this;
    }

    /**
     * 镜像源的规格编码，对于`gold`镜像类型，这个值是的必须项。
     * @return spceCode
     */
    public String getSpceCode() {
        return spceCode;
    }

    public void setSpceCode(String spceCode) {
        this.spceCode = spceCode;
    }

    public ImageRef withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 镜像源的产品ID，对于`gold`镜像类型，这个值是的必须项。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageRef that = (ImageRef) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.spceCode, that.spceCode) && Objects.equals(this.productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageType, spceCode, productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageRef {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    spceCode: ").append(toIndentedString(spceCode)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
