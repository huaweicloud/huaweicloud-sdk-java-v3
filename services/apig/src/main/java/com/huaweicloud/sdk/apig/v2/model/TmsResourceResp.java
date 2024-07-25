package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TmsResourceResp
 */
public class TmsResourceResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resouce_detail")

    private String resouceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsKeyValue> tags = null;

    public TmsResourceResp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 实例编号
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public TmsResourceResp withResouceDetail(String resouceDetail) {
        this.resouceDetail = resouceDetail;
        return this;
    }

    /**
     * 实例详细描述。暂不支持
     * @return resouceDetail
     */
    public String getResouceDetail() {
        return resouceDetail;
    }

    public void setResouceDetail(String resouceDetail) {
        this.resouceDetail = resouceDetail;
    }

    public TmsResourceResp withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 实例名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public TmsResourceResp withTags(List<TmsKeyValue> tags) {
        this.tags = tags;
        return this;
    }

    public TmsResourceResp addTagsItem(TmsKeyValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TmsResourceResp withTags(Consumer<List<TmsKeyValue>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 实例绑定的标签列表
     * @return tags
     */
    public List<TmsKeyValue> getTags() {
        return tags;
    }

    public void setTags(List<TmsKeyValue> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TmsResourceResp that = (TmsResourceResp) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resouceDetail, that.resouceDetail)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resouceDetail, resourceName, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TmsResourceResp {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resouceDetail: ").append(toIndentedString(resouceDetail)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
