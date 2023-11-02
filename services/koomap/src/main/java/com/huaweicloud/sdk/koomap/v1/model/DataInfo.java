package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 卫星影像数据信息。
 */
public class DataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    /**
     * 卫星影像是否为成果影像。 目前只支持原始影像（0）、成果影像（1）。
     */
    public static final class IsProductEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final IsProductEnum _0 = new IsProductEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final IsProductEnum _1 = new IsProductEnum("1");

        private static final Map<String, IsProductEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsProductEnum> createStaticFields() {
            Map<String, IsProductEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsProductEnum(String value) {
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
        public static IsProductEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsProductEnum(value));
        }

        public static IsProductEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsProductEnum) {
                return this.value.equals(((IsProductEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_product")

    private IsProductEnum isProduct;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_level")

    private String imageLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_status")

    private String imageStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_date")

    private String imageDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_date")

    private String uploadDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_resolution")

    private String imageResolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_description")

    private String imageDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    /**
     * 卫星影像类型。当前仅支持全色（0）、多光谱（1）。
     */
    public static final class ImageTypeEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final ImageTypeEnum _0 = new ImageTypeEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final ImageTypeEnum _1 = new ImageTypeEnum("1");

        private static final Map<String, ImageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageTypeEnum> createStaticFields() {
            Map<String, ImageTypeEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
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
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_alias")

    private String imageAlias;

    /**
     * 是否为矢量切割影像。当前仅支持是（1）、否（0）。
     */
    public static final class ProductClipEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProductClipEnum NUMBER_0 = new ProductClipEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProductClipEnum NUMBER_1 = new ProductClipEnum(1);

        private static final Map<Integer, ProductClipEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProductClipEnum> createStaticFields() {
            Map<Integer, ProductClipEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProductClipEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProductClipEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProductClipEnum(value));
        }

        public static ProductClipEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProductClipEnum) {
                return this.value.equals(((ProductClipEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_clip")

    private ProductClipEnum productClip;

    /**
     * 是否为金字塔切割影像。当前仅支持是（1）、否（0）。
     */
    public static final class ProductTileEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ProductTileEnum NUMBER_0 = new ProductTileEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProductTileEnum NUMBER_1 = new ProductTileEnum(1);

        private static final Map<Integer, ProductTileEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProductTileEnum> createStaticFields() {
            Map<Integer, ProductTileEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProductTileEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProductTileEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProductTileEnum(value));
        }

        public static ProductTileEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProductTileEnum) {
                return this.value.equals(((ProductTileEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_tile")

    private ProductTileEnum productTile;

    /**
     * 是否为COG影像。当前仅支持是（1）、否（0）。
     */
    public static final class IsCogEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IsCogEnum NUMBER_0 = new IsCogEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsCogEnum NUMBER_1 = new IsCogEnum(1);

        private static final Map<Integer, IsCogEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsCogEnum> createStaticFields() {
            Map<Integer, IsCogEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsCogEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsCogEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsCogEnum(value));
        }

        public static IsCogEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsCogEnum) {
                return this.value.equals(((IsCogEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cog")

    private IsCogEnum isCog;

    public DataInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 卫星影像名称。 支持模糊查询，格式为中英文、数字、下划线、中划线、“.”，长度100个字符以内。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public DataInfo withIsProduct(IsProductEnum isProduct) {
        this.isProduct = isProduct;
        return this;
    }

    /**
     * 卫星影像是否为成果影像。 目前只支持原始影像（0）、成果影像（1）。
     * @return isProduct
     */
    public IsProductEnum getIsProduct() {
        return isProduct;
    }

    public void setIsProduct(IsProductEnum isProduct) {
        this.isProduct = isProduct;
    }

    public DataInfo withImageLevel(String imageLevel) {
        this.imageLevel = imageLevel;
        return this;
    }

    /**
     * 卫星影像等级。 目前只支持L1、L1A、L1B、L2、L3、L4、L5。
     * @return imageLevel
     */
    public String getImageLevel() {
        return imageLevel;
    }

    public void setImageLevel(String imageLevel) {
        this.imageLevel = imageLevel;
    }

    public DataInfo withImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
        return this;
    }

    /**
     * 卫星影像迁移状态。 当前仅支持完成（0）、迁入中（1）、迁入失败（2）、迁出中（3）、迁出失败（4）、删除中（6）、卫星影像正在被任务使用导致删除失败（7）、网络错误导致删除失败（8）。
     * @return imageStatus
     */
    public String getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
    }

    public DataInfo withImageDate(String imageDate) {
        this.imageDate = imageDate;
        return this;
    }

    /**
     * 卫星影像成像时间。 格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return imageDate
     */
    public String getImageDate() {
        return imageDate;
    }

    public void setImageDate(String imageDate) {
        this.imageDate = imageDate;
    }

    public DataInfo withUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
        return this;
    }

    /**
     * 卫星影像上传时间。 格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return uploadDate
     */
    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public DataInfo withImageResolution(String imageResolution) {
        this.imageResolution = imageResolution;
        return this;
    }

    /**
     * 卫星影像分辨率，精确到小数点后一位。
     * @return imageResolution
     */
    public String getImageResolution() {
        return imageResolution;
    }

    public void setImageResolution(String imageResolution) {
        this.imageResolution = imageResolution;
    }

    public DataInfo withImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
        return this;
    }

    /**
     * 卫星影像描述。 格式为中英文、数字、下划线、中划线，长度255个字符以内。
     * @return imageDescription
     */
    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public DataInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 卫星影像ID。 格式为英文、数字，长度为32。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public DataInfo withImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 卫星影像类型。当前仅支持全色（0）、多光谱（1）。
     * @return imageType
     */
    public ImageTypeEnum getImageType() {
        return imageType;
    }

    public void setImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
    }

    public DataInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * IAM用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DataInfo withImageAlias(String imageAlias) {
        this.imageAlias = imageAlias;
        return this;
    }

    /**
     * 卫星影像别名。 格式为中英文、数字、下划线、中划线、“.”，长度255个字符以内。
     * @return imageAlias
     */
    public String getImageAlias() {
        return imageAlias;
    }

    public void setImageAlias(String imageAlias) {
        this.imageAlias = imageAlias;
    }

    public DataInfo withProductClip(ProductClipEnum productClip) {
        this.productClip = productClip;
        return this;
    }

    /**
     * 是否为矢量切割影像。当前仅支持是（1）、否（0）。
     * @return productClip
     */
    public ProductClipEnum getProductClip() {
        return productClip;
    }

    public void setProductClip(ProductClipEnum productClip) {
        this.productClip = productClip;
    }

    public DataInfo withProductTile(ProductTileEnum productTile) {
        this.productTile = productTile;
        return this;
    }

    /**
     * 是否为金字塔切割影像。当前仅支持是（1）、否（0）。
     * @return productTile
     */
    public ProductTileEnum getProductTile() {
        return productTile;
    }

    public void setProductTile(ProductTileEnum productTile) {
        this.productTile = productTile;
    }

    public DataInfo withIsCog(IsCogEnum isCog) {
        this.isCog = isCog;
        return this;
    }

    /**
     * 是否为COG影像。当前仅支持是（1）、否（0）。
     * @return isCog
     */
    public IsCogEnum getIsCog() {
        return isCog;
    }

    public void setIsCog(IsCogEnum isCog) {
        this.isCog = isCog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataInfo that = (DataInfo) obj;
        return Objects.equals(this.imageName, that.imageName) && Objects.equals(this.isProduct, that.isProduct)
            && Objects.equals(this.imageLevel, that.imageLevel) && Objects.equals(this.imageStatus, that.imageStatus)
            && Objects.equals(this.imageDate, that.imageDate) && Objects.equals(this.uploadDate, that.uploadDate)
            && Objects.equals(this.imageResolution, that.imageResolution)
            && Objects.equals(this.imageDescription, that.imageDescription)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.imageAlias, that.imageAlias)
            && Objects.equals(this.productClip, that.productClip) && Objects.equals(this.productTile, that.productTile)
            && Objects.equals(this.isCog, that.isCog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName,
            isProduct,
            imageLevel,
            imageStatus,
            imageDate,
            uploadDate,
            imageResolution,
            imageDescription,
            imageId,
            imageType,
            userName,
            imageAlias,
            productClip,
            productTile,
            isCog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataInfo {\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    isProduct: ").append(toIndentedString(isProduct)).append("\n");
        sb.append("    imageLevel: ").append(toIndentedString(imageLevel)).append("\n");
        sb.append("    imageStatus: ").append(toIndentedString(imageStatus)).append("\n");
        sb.append("    imageDate: ").append(toIndentedString(imageDate)).append("\n");
        sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
        sb.append("    imageResolution: ").append(toIndentedString(imageResolution)).append("\n");
        sb.append("    imageDescription: ").append(toIndentedString(imageDescription)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    imageAlias: ").append(toIndentedString(imageAlias)).append("\n");
        sb.append("    productClip: ").append(toIndentedString(productClip)).append("\n");
        sb.append("    productTile: ").append(toIndentedString(productTile)).append("\n");
        sb.append("    isCog: ").append(toIndentedString(isCog)).append("\n");
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
