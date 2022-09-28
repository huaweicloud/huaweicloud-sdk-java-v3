package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ImageInfo
 */
public class ImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 镜像类型，目前支持以下类型： 公共镜像：gold 私有镜像：private。
     */
    public static final class ImageTypeEnum {

        /**
         * Enum GOLD for value: "gold"
         */
        public static final ImageTypeEnum GOLD = new ImageTypeEnum("gold");

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final ImageTypeEnum PRIVATE = new ImageTypeEnum("private");

        private static final Map<String, ImageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageTypeEnum> createStaticFields() {
            Map<String, ImageTypeEnum> map = new HashMap<>();
            map.put("gold", GOLD);
            map.put("private", PRIVATE);
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
            ImageTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ImageTypeEnum(value);
            }
            return result;
        }

        public static ImageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ImageTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_format")

    private String diskFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ram")

    private Integer minRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_disk")

    private Integer minDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_code")

    private String productCode;

    public ImageInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 镜像ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageInfo withImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型，目前支持以下类型： 公共镜像：gold 私有镜像：private。
     * @return imageType
     */
    public ImageTypeEnum getImageType() {
        return imageType;
    }

    public void setImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
    }

    public ImageInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，目前取值Linux， Windows，Other。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ImageInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 操作系统具体版本。
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public ImageInfo withDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    /**
     * 镜像格式，目前支持vhd，raw，qcow2，zvhd2格式。
     * @return diskFormat
     */
    public String getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
    }

    public ImageInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageInfo withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    /**
     * 镜像运行需要的最小内存，单位为MB。参数取值依据弹性云服务器的规格限制，一般设置为0。
     * minimum: 1
     * maximum: 55
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public ImageInfo withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    /**
     * 镜像运行需要的最小磁盘，单位为GB 。取值为40～1024GB。
     * minimum: 1
     * maximum: 55
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public ImageInfo withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * 镜像的产品编码。
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) o;
        return Objects.equals(this.id, imageInfo.id) && Objects.equals(this.imageType, imageInfo.imageType)
            && Objects.equals(this.osType, imageInfo.osType) && Objects.equals(this.osVersion, imageInfo.osVersion)
            && Objects.equals(this.diskFormat, imageInfo.diskFormat) && Objects.equals(this.name, imageInfo.name)
            && Objects.equals(this.minRam, imageInfo.minRam) && Objects.equals(this.minDisk, imageInfo.minDisk)
            && Objects.equals(this.productCode, imageInfo.productCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageType, osType, osVersion, diskFormat, name, minRam, minDisk, productCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
        sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
        sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
