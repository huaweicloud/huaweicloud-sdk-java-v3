package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceConfig
 */
public class InstanceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeze_type")

    private List<Integer> freezeType = null;

    public InstanceConfig withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public InstanceConfig addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public InstanceConfig withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 实例级别标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public InstanceConfig withFreezeType(List<Integer> freezeType) {
        this.freezeType = freezeType;
        return this;
    }

    public InstanceConfig addFreezeTypeItem(Integer freezeTypeItem) {
        if (this.freezeType == null) {
            this.freezeType = new ArrayList<>();
        }
        this.freezeType.add(freezeTypeItem);
        return this;
    }

    public InstanceConfig withFreezeType(Consumer<List<Integer>> freezeTypeSetter) {
        if (this.freezeType == null) {
            this.freezeType = new ArrayList<>();
        }
        freezeTypeSetter.accept(this.freezeType);
        return this;
    }

    /**
     * 冻结类型
     * @return freezeType
     */
    public List<Integer> getFreezeType() {
        return freezeType;
    }

    public void setFreezeType(List<Integer> freezeType) {
        this.freezeType = freezeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceConfig that = (InstanceConfig) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.freezeType, that.freezeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, freezeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceConfig {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    freezeType: ").append(toIndentedString(freezeType)).append("\n");
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
