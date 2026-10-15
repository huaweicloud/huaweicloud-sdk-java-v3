package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：Flink镜像配置，包含镜像ID和版本信息。
 */
public class ShowFlinkJobImageConfigResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version_id")

    private String imageVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_version")

    private String releaseVersion;

    /**
     * **参数解释**：Flink作业使用的镜像版本类型。 **取值范围**：   - STABLE：稳定版。   - RECOMMEND：推荐版。   - BETA：测试版。
     */
    public static final class ImageVersionTypeEnum {

        /**
         * Enum STABLE for value: "STABLE"
         */
        public static final ImageVersionTypeEnum STABLE = new ImageVersionTypeEnum("STABLE");

        /**
         * Enum RECOMMEND for value: "RECOMMEND"
         */
        public static final ImageVersionTypeEnum RECOMMEND = new ImageVersionTypeEnum("RECOMMEND");

        /**
         * Enum BETA for value: "BETA"
         */
        public static final ImageVersionTypeEnum BETA = new ImageVersionTypeEnum("BETA");

        private static final Map<String, ImageVersionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageVersionTypeEnum> createStaticFields() {
            Map<String, ImageVersionTypeEnum> map = new HashMap<>();
            map.put("STABLE", STABLE);
            map.put("RECOMMEND", RECOMMEND);
            map.put("BETA", BETA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImageVersionTypeEnum(String value) {
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
        public static ImageVersionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageVersionTypeEnum(value));
        }

        public static ImageVersionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImageVersionTypeEnum) {
                return this.value.equals(((ImageVersionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version_type")

    private ImageVersionTypeEnum imageVersionType;

    public ShowFlinkJobImageConfigResponseBody withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：镜像ID，Flink作业运行所使用的镜像。 **取值范围**：长度为2~64个字符。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ShowFlinkJobImageConfigResponseBody withImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
        return this;
    }

    /**
     * **参数解释**：镜像版本ID，Flink作业运行所使用的镜像版本。 **取值范围**：长度为2~64个字符。
     * @return imageVersionId
     */
    public String getImageVersionId() {
        return imageVersionId;
    }

    public void setImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
    }

    public ShowFlinkJobImageConfigResponseBody withReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }

    /**
     * **参数解释**：Flink作业的版本信息，格式为AIDataLake.<平台版本>(Flink<Flink版本>,JRE<JRE版本>)，例如AIDataLake.26.9.0(Flink1.20.0,JRE21)。 **取值范围**：长度为1~512个字符。
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public ShowFlinkJobImageConfigResponseBody withImageVersionType(ImageVersionTypeEnum imageVersionType) {
        this.imageVersionType = imageVersionType;
        return this;
    }

    /**
     * **参数解释**：Flink作业使用的镜像版本类型。 **取值范围**：   - STABLE：稳定版。   - RECOMMEND：推荐版。   - BETA：测试版。
     * @return imageVersionType
     */
    public ImageVersionTypeEnum getImageVersionType() {
        return imageVersionType;
    }

    public void setImageVersionType(ImageVersionTypeEnum imageVersionType) {
        this.imageVersionType = imageVersionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlinkJobImageConfigResponseBody that = (ShowFlinkJobImageConfigResponseBody) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageVersionId, that.imageVersionId)
            && Objects.equals(this.releaseVersion, that.releaseVersion)
            && Objects.equals(this.imageVersionType, that.imageVersionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, imageVersionId, releaseVersion, imageVersionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkJobImageConfigResponseBody {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageVersionId: ").append(toIndentedString(imageVersionId)).append("\n");
        sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
        sb.append("    imageVersionType: ").append(toIndentedString(imageVersionType)).append("\n");
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
