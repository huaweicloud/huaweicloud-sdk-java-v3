package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteImageCacheRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_cache_id")

    private String imageCacheId;

    public DeleteImageCacheRequest withImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }

    /**
     * **参数解释：** 镜像缓存ID。 **约束限制：** 不涉及 **取值范围：** 镜像缓存ID。 **默认取值：** 不涉及 
     * @return imageCacheId
     */
    public String getImageCacheId() {
        return imageCacheId;
    }

    public void setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteImageCacheRequest that = (DeleteImageCacheRequest) obj;
        return Objects.equals(this.imageCacheId, that.imageCacheId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageCacheId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteImageCacheRequest {\n");
        sb.append("    imageCacheId: ").append(toIndentedString(imageCacheId)).append("\n");
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
