package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowImageCacheResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_cache")

    private ImageCacheDetail imageCache;

    public ShowImageCacheResponse withImageCache(ImageCacheDetail imageCache) {
        this.imageCache = imageCache;
        return this;
    }

    public ShowImageCacheResponse withImageCache(Consumer<ImageCacheDetail> imageCacheSetter) {
        if (this.imageCache == null) {
            this.imageCache = new ImageCacheDetail();
            imageCacheSetter.accept(this.imageCache);
        }

        return this;
    }

    /**
     * Get imageCache
     * @return imageCache
     */
    public ImageCacheDetail getImageCache() {
        return imageCache;
    }

    public void setImageCache(ImageCacheDetail imageCache) {
        this.imageCache = imageCache;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageCacheResponse that = (ShowImageCacheResponse) obj;
        return Objects.equals(this.imageCache, that.imageCache);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageCache);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageCacheResponse {\n");
        sb.append("    imageCache: ").append(toIndentedString(imageCache)).append("\n");
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
