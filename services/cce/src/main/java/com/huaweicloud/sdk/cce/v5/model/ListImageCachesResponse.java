package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListImageCachesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_caches")

    private List<ImageCacheDetail> imageCaches = null;

    public ListImageCachesResponse withImageCaches(List<ImageCacheDetail> imageCaches) {
        this.imageCaches = imageCaches;
        return this;
    }

    public ListImageCachesResponse addImageCachesItem(ImageCacheDetail imageCachesItem) {
        if (this.imageCaches == null) {
            this.imageCaches = new ArrayList<>();
        }
        this.imageCaches.add(imageCachesItem);
        return this;
    }

    public ListImageCachesResponse withImageCaches(Consumer<List<ImageCacheDetail>> imageCachesSetter) {
        if (this.imageCaches == null) {
            this.imageCaches = new ArrayList<>();
        }
        imageCachesSetter.accept(this.imageCaches);
        return this;
    }

    /**
     * 镜像缓存列表。
     * @return imageCaches
     */
    public List<ImageCacheDetail> getImageCaches() {
        return imageCaches;
    }

    public void setImageCaches(List<ImageCacheDetail> imageCaches) {
        this.imageCaches = imageCaches;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageCachesResponse that = (ListImageCachesResponse) obj;
        return Objects.equals(this.imageCaches, that.imageCaches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageCaches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageCachesResponse {\n");
        sb.append("    imageCaches: ").append(toIndentedString(imageCaches)).append("\n");
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
