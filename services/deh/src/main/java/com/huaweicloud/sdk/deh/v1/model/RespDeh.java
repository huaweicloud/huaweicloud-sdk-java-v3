package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * resource字段数据结构。
 */
public class RespDeh {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    @JacksonXmlProperty(localName = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resouce_detail")

    @JacksonXmlProperty(localName = "resouce_detail")

    private String resouceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    @JacksonXmlProperty(localName = "resource_name")

    private String resourceName;

    public RespDeh withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 专属主机ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public RespDeh withResouceDetail(String resouceDetail) {
        this.resouceDetail = resouceDetail;
        return this;
    }

    /**
     * 专属主机详情。  该字段用于后续扩展，默认为空。
     * @return resouceDetail
     */
    public String getResouceDetail() {
        return resouceDetail;
    }

    public void setResouceDetail(String resouceDetail) {
        this.resouceDetail = resouceDetail;
    }

    public RespDeh withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public RespDeh addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public RespDeh withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public RespDeh withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespDeh respDeh = (RespDeh) o;
        return Objects.equals(this.resourceId, respDeh.resourceId)
            && Objects.equals(this.resouceDetail, respDeh.resouceDetail) && Objects.equals(this.tags, respDeh.tags)
            && Objects.equals(this.resourceName, respDeh.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resouceDetail, tags, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespDeh {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resouceDetail: ").append(toIndentedString(resouceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
