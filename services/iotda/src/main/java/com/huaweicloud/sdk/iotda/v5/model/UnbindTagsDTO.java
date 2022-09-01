package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建标签请求结构体。
 */
public class UnbindTagsDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    @JacksonXmlProperty(localName = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    @JacksonXmlProperty(localName = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_keys")

    @JacksonXmlProperty(localName = "tag_keys")

    private List<String> tagKeys = null;

    public UnbindTagsDTO withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * **参数说明**：要绑定标签的资源类型。 **取值范围**： - device：设备。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public UnbindTagsDTO withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数说明**：要绑定标签的资源id。例如，资源类型为device，那么对应的资源id就是device_id。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public UnbindTagsDTO withTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }

    public UnbindTagsDTO addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    public UnbindTagsDTO withTagKeys(Consumer<List<String>> tagKeysSetter) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        tagKeysSetter.accept(this.tagKeys);
        return this;
    }

    /**
     * **参数说明**：指定资源要解绑的标签键列表，标签键列表中各项之间不允许重复，不能填写不存在的标签键值 **取值范围**：标签键长度不超过64，只允许中文、字母、数字、以及_.-等字符的组合。
     * @return tagKeys
     */
    public List<String> getTagKeys() {
        return tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnbindTagsDTO unbindTagsDTO = (UnbindTagsDTO) o;
        return Objects.equals(this.resourceType, unbindTagsDTO.resourceType)
            && Objects.equals(this.resourceId, unbindTagsDTO.resourceId)
            && Objects.equals(this.tagKeys, unbindTagsDTO.tagKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceId, tagKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnbindTagsDTO {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
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
