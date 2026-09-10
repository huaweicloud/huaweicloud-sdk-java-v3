package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CountSubNetworkInterfacesByTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ListTag> tags = null;

    public CountSubNetworkInterfacesByTagsRequestBody withTags(List<ListTag> tags) {
        this.tags = tags;
        return this;
    }

    public CountSubNetworkInterfacesByTagsRequestBody addTagsItem(ListTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CountSubNetworkInterfacesByTagsRequestBody withTags(Consumer<List<ListTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**： 包含标签。结果返回包含所有标签的资源列表，无tag过滤条件时返回全量数据。 **约束限制**： - key之间是与的关系，key-value结构中value是或的关系。 - 最多包含50个key，每个key下面的value最多10个。 - 每个key对应的value可以为空数组但结构体不能缺失。 - Key不能重复，同一个key中values不能重复。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return tags
     */
    public List<ListTag> getTags() {
        return tags;
    }

    public void setTags(List<ListTag> tags) {
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
        CountSubNetworkInterfacesByTagsRequestBody that = (CountSubNetworkInterfacesByTagsRequestBody) obj;
        return Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountSubNetworkInterfacesByTagsRequestBody {\n");
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
