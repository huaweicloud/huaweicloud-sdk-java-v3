package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TmsQueryReq
 */
public class TmsQueryReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsKeyValues> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<TmsKeyValues> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<TmsMatchesKeyValue> matches = null;

    public TmsQueryReq withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * 不包含任意一个标签，该字段为true时查询所有不带标签的资源，此时忽略 “tags”字段。 该字段为false或者未提供该参数时，该条件不生效。 
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public TmsQueryReq withTags(List<TmsKeyValues> tags) {
        this.tags = tags;
        return this;
    }

    public TmsQueryReq addTagsItem(TmsKeyValues tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TmsQueryReq withTags(Consumer<List<TmsKeyValues>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含20个key，每个key下面的value最多20个。无tag过滤条件时返回全量数据。
     * @return tags
     */
    public List<TmsKeyValues> getTags() {
        return tags;
    }

    public void setTags(List<TmsKeyValues> tags) {
        this.tags = tags;
    }

    public TmsQueryReq withSysTags(List<TmsKeyValues> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public TmsQueryReq addSysTagsItem(TmsKeyValues sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public TmsQueryReq withSysTags(Consumer<List<TmsKeyValues>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 企业项目.仅op_service权限可以使用此字段做资源实例过滤条件. 无sys_tags时按照tag接口处理，无tag过滤条件时返回全量数据。
     * @return sysTags
     */
    public List<TmsKeyValues> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<TmsKeyValues> sysTags) {
        this.sysTags = sysTags;
    }

    public TmsQueryReq withMatches(List<TmsMatchesKeyValue> matches) {
        this.matches = matches;
        return this;
    }

    public TmsQueryReq addMatchesItem(TmsMatchesKeyValue matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public TmsQueryReq withMatches(Consumer<List<TmsMatchesKeyValue>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段,key为要匹配的字段,当前限定为resource_name。value为匹配的值。 根据key的值确认是否需要模糊匹配，如resource_name需要实现前缀搜索。 
     * @return matches
     */
    public List<TmsMatchesKeyValue> getMatches() {
        return matches;
    }

    public void setMatches(List<TmsMatchesKeyValue> matches) {
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
        TmsQueryReq that = (TmsQueryReq) obj;
        return Objects.equals(this.withoutAnyTag, that.withoutAnyTag) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.sysTags, that.sysTags) && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withoutAnyTag, tags, sysTags, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TmsQueryReq {\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
