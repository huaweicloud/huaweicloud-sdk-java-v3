package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListCoreGatewaysByTagsRequestBody
 */
public class ListCoreGatewaysByTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreGatewaysTagValuesForTMS> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<CoreGatewaysMatchForTMS> matches = null;

    public ListCoreGatewaysByTagsRequestBody withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * **参数解释：** 是否查询所有不带标签的资源。 **约束限制：** 不涉及。 **取值范围：** - true：查询所有不带标签的资源，此时忽略 “tags”字段； - false：返回所有资源或按“tags”、“matches”等条件过滤。 **默认取值：** false。 
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public ListCoreGatewaysByTagsRequestBody withTags(List<CoreGatewaysTagValuesForTMS> tags) {
        this.tags = tags;
        return this;
    }

    public ListCoreGatewaysByTagsRequestBody addTagsItem(CoreGatewaysTagValuesForTMS tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListCoreGatewaysByTagsRequestBody withTags(Consumer<List<CoreGatewaysTagValuesForTMS>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 指定查询的资源中需要包含哪些标签，结果返回包含所有标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。 **约束限制：** 数组内key不能重复，同一个key中values不能重复，每个key对应的value可以为空数组但结构体不能缺失。 **取值范围：** 数组长度最大为20。 **默认取值：** 不涉及。 
     * @return tags
     */
    public List<CoreGatewaysTagValuesForTMS> getTags() {
        return tags;
    }

    public void setTags(List<CoreGatewaysTagValuesForTMS> tags) {
        this.tags = tags;
    }

    public ListCoreGatewaysByTagsRequestBody withMatches(List<CoreGatewaysMatchForTMS> matches) {
        this.matches = matches;
        return this;
    }

    public ListCoreGatewaysByTagsRequestBody addMatchesItem(CoreGatewaysMatchForTMS matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListCoreGatewaysByTagsRequestBody withMatches(Consumer<List<CoreGatewaysMatchForTMS>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * **参数解释：** 标签键值匹配字段，key为要匹配的字段。 **约束限制：** key为固定字典值，只支持resource_name，不能包含重复的key或不支持的key。支持根据value的值做前缀搜索。 **取值范围：** 数组长度最大为1。 **默认取值：** 不涉及。 
     * @return matches
     */
    public List<CoreGatewaysMatchForTMS> getMatches() {
        return matches;
    }

    public void setMatches(List<CoreGatewaysMatchForTMS> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCoreGatewaysByTagsRequestBody that = (ListCoreGatewaysByTagsRequestBody) obj;
        return Objects.equals(this.withoutAnyTag, that.withoutAnyTag) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withoutAnyTag, tags, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreGatewaysByTagsRequestBody {\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
