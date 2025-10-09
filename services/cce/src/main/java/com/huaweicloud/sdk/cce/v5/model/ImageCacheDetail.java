package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像缓存信息。
 */
public class ImageCacheDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private LocalDate createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images")

    private List<String> images = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_cache_size")

    private Integer imageCacheSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "building_config")

    private ImageCacheBuildingConfig buildingConfig;

    /**
     * **参数解释：** 镜像缓存的状态。 **约束限制：** 不涉及 **取值范围：** - Available： 可用状态，表示当前镜像缓存正常可用。 - Unavailable：不可用，表示镜像缓存状态异常或过期，不可使用。 - Creating：创建中，表示镜像缓存正在创建中。 - Deleting：删除中，表示镜像缓存正在删除中。 - Failed：创建失败，表示镜像缓存创建失败。 **默认取值：** 不涉及
     */
    public static final class StatusEnum {

        /**
         * Enum AVAILABLE for value: "Available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("Available");

        /**
         * Enum UNAVAILABLE for value: "Unavailable"
         */
        public static final StatusEnum UNAVAILABLE = new StatusEnum("Unavailable");

        /**
         * Enum CREATING for value: "Creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("Creating");

        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("Deleting");

        /**
         * Enum FAILED for value: "Failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("Failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Available", AVAILABLE);
            map.put("Unavailable", UNAVAILABLE);
            map.put("Creating", CREATING);
            map.put("Deleting", DELETING);
            map.put("Failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public ImageCacheDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像缓存名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageCacheDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 镜像缓存ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageCacheDetail withCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 镜像缓存创建时间戳。
     * @return createdAt
     */
    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public ImageCacheDetail withImages(List<String> images) {
        this.images = images;
        return this;
    }

    public ImageCacheDetail addImagesItem(String imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public ImageCacheDetail withImages(Consumer<List<String>> imagesSetter) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        imagesSetter.accept(this.images);
        return this;
    }

    /**
     * 镜像缓存中的容器镜像列表。
     * @return images
     */
    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public ImageCacheDetail withImageCacheSize(Integer imageCacheSize) {
        this.imageCacheSize = imageCacheSize;
        return this;
    }

    /**
     * 镜像缓存后端对应的存储盘大小，单位GiB。
     * minimum: 20
     * maximum: 400
     * @return imageCacheSize
     */
    public Integer getImageCacheSize() {
        return imageCacheSize;
    }

    public void setImageCacheSize(Integer imageCacheSize) {
        this.imageCacheSize = imageCacheSize;
    }

    public ImageCacheDetail withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * **参数解释：** 镜像缓存有效的天数,不设置或值为0表示永久有效。镜像缓存到达有效期后自动过期并删除。 **约束限制：** 不涉及 **取值范围：** [0-10000] **默认取值：** 0 
     * minimum: 0
     * maximum: 10000
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public ImageCacheDetail withBuildingConfig(ImageCacheBuildingConfig buildingConfig) {
        this.buildingConfig = buildingConfig;
        return this;
    }

    public ImageCacheDetail withBuildingConfig(Consumer<ImageCacheBuildingConfig> buildingConfigSetter) {
        if (this.buildingConfig == null) {
            this.buildingConfig = new ImageCacheBuildingConfig();
            buildingConfigSetter.accept(this.buildingConfig);
        }

        return this;
    }

    /**
     * Get buildingConfig
     * @return buildingConfig
     */
    public ImageCacheBuildingConfig getBuildingConfig() {
        return buildingConfig;
    }

    public void setBuildingConfig(ImageCacheBuildingConfig buildingConfig) {
        this.buildingConfig = buildingConfig;
    }

    public ImageCacheDetail withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 镜像缓存的状态。 **约束限制：** 不涉及 **取值范围：** - Available： 可用状态，表示当前镜像缓存正常可用。 - Unavailable：不可用，表示镜像缓存状态异常或过期，不可使用。 - Creating：创建中，表示镜像缓存正在创建中。 - Deleting：删除中，表示镜像缓存正在删除中。 - Failed：创建失败，表示镜像缓存创建失败。 **默认取值：** 不涉及
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ImageCacheDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 镜像缓存创建失败或异常的错误信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageCacheDetail that = (ImageCacheDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.images, that.images)
            && Objects.equals(this.imageCacheSize, that.imageCacheSize)
            && Objects.equals(this.retentionDays, that.retentionDays)
            && Objects.equals(this.buildingConfig, that.buildingConfig) && Objects.equals(this.status, that.status)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, id, createdAt, images, imageCacheSize, retentionDays, buildingConfig, status, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageCacheDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    imageCacheSize: ").append(toIndentedString(imageCacheSize)).append("\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("    buildingConfig: ").append(toIndentedString(buildingConfig)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
