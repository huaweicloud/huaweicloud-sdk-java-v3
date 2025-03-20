package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建镜像缓存-respuest结构体。
 */
public class CreateImageCacheRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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

    public CreateImageCacheRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 镜像缓存名称。 **约束限制：** 不涉及 **取值范围：** 以小写字母开头，由小写字母、数字、中划线(-)组成，长度范围1-128位，且不能以中划线(-)结尾。镜像缓存名称不可重复。 **默认取值：** 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateImageCacheRequestBody withImages(List<String> images) {
        this.images = images;
        return this;
    }

    public CreateImageCacheRequestBody addImagesItem(String imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public CreateImageCacheRequestBody withImages(Consumer<List<String>> imagesSetter) {
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

    public CreateImageCacheRequestBody withImageCacheSize(Integer imageCacheSize) {
        this.imageCacheSize = imageCacheSize;
        return this;
    }

    /**
     * **参数解释：** 镜像缓存后端对应的存储盘大小，单位GiB。缓存对象为解压后的镜像文件，建议镜像缓存大小不低于该缓存中所有容器镜像大小总和的3倍。 **约束限制：** 不涉及 **取值范围：** [20-400] **默认取值：** 20 
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

    public CreateImageCacheRequestBody withRetentionDays(Integer retentionDays) {
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

    public CreateImageCacheRequestBody withBuildingConfig(ImageCacheBuildingConfig buildingConfig) {
        this.buildingConfig = buildingConfig;
        return this;
    }

    public CreateImageCacheRequestBody withBuildingConfig(Consumer<ImageCacheBuildingConfig> buildingConfigSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateImageCacheRequestBody that = (CreateImageCacheRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.images, that.images)
            && Objects.equals(this.imageCacheSize, that.imageCacheSize)
            && Objects.equals(this.retentionDays, that.retentionDays)
            && Objects.equals(this.buildingConfig, that.buildingConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, images, imageCacheSize, retentionDays, buildingConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageCacheRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    imageCacheSize: ").append(toIndentedString(imageCacheSize)).append("\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("    buildingConfig: ").append(toIndentedString(buildingConfig)).append("\n");
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
