package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteGcbResourceTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    private String tagKey;

    public DeleteGcbResourceTagRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源唯一标识符。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public DeleteGcbResourceTagRequest withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * 删除的tag的key。
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteGcbResourceTagRequest that = (DeleteGcbResourceTagRequest) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.tagKey, that.tagKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, tagKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGcbResourceTagRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
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
