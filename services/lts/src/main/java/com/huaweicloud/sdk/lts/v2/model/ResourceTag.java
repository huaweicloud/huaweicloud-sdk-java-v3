package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourceTag
 */
public class ResourceTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_to_streams_enable")

    private String tagsToStreamsEnable;

    public ResourceTag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 标签的key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ResourceTag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 标签的value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ResourceTag withTagsToStreamsEnable(String tagsToStreamsEnable) {
        this.tagsToStreamsEnable = tagsToStreamsEnable;
        return this;
    }

    /**
     * 是否启用日志流标签
     * @return tagsToStreamsEnable
     */
    public String getTagsToStreamsEnable() {
        return tagsToStreamsEnable;
    }

    public void setTagsToStreamsEnable(String tagsToStreamsEnable) {
        this.tagsToStreamsEnable = tagsToStreamsEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceTag that = (ResourceTag) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.tagsToStreamsEnable, that.tagsToStreamsEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, tagsToStreamsEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTag {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    tagsToStreamsEnable: ").append(toIndentedString(tagsToStreamsEnable)).append("\n");
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
