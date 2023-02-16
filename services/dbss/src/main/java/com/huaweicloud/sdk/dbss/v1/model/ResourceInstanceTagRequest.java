package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.ResourceInstanceTagRequestMatches;
import com.huaweicloud.sdk.dbss.v1.model.TagKeyValuesBean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceInstanceTagRequest
 */
public class ResourceInstanceTagRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="matches")
    
    
    private List<ResourceInstanceTagRequestMatches> matches = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags")
    
    
    private List<TagKeyValuesBean> notTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    
    private List<TagKeyValuesBean> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags_any")
    
    
    private List<TagKeyValuesBean> tagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags_any")
    
    
    private List<TagKeyValuesBean> notTagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    
    private TagKeyValuesBean sysTags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="without_any_tag")
    
    
    private Boolean withoutAnyTag;

    public ResourceInstanceTagRequest withMatches(List<ResourceInstanceTagRequestMatches> matches) {
        this.matches = matches;
        return this;
    }

    
    public ResourceInstanceTagRequest addMatchesItem(ResourceInstanceTagRequestMatches matchesItem) {
        if(this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ResourceInstanceTagRequest withMatches(Consumer<List<ResourceInstanceTagRequestMatches>> matchesSetter) {
        if(this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段,key为要匹配的字段，如resource_name等。value为匹配的值。key为固定字典值，不能包含重复的key或不支持的key。 根据key的值确认是否需要模糊匹配，如resource_name默认为模糊搜索（不区分大小写），如果value为空字符串精确匹配（多数服务不存在资源名称为空的情况，因此此类情况返回空列表）。resource_id为精确匹配。第一期只做resource_name，后续再扩展。
     * @return matches
     */
    public List<ResourceInstanceTagRequestMatches> getMatches() {
        return matches;
    }

    public void setMatches(List<ResourceInstanceTagRequestMatches> matches) {
        this.matches = matches;
    }

    

    public ResourceInstanceTagRequest withNotTags(List<TagKeyValuesBean> notTags) {
        this.notTags = notTags;
        return this;
    }

    
    public ResourceInstanceTagRequest addNotTagsItem(TagKeyValuesBean notTagsItem) {
        if(this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ResourceInstanceTagRequest withNotTags(Consumer<List<TagKeyValuesBean>> notTagsSetter) {
        if(this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 不包含标签，最多包含50个key，每个key下面的value最多10个, 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回不包含标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据
     * @return notTags
     */
    public List<TagKeyValuesBean> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<TagKeyValuesBean> notTags) {
        this.notTags = notTags;
    }

    

    public ResourceInstanceTagRequest withTags(List<TagKeyValuesBean> tags) {
        this.tags = tags;
        return this;
    }

    
    public ResourceInstanceTagRequest addTagsItem(TagKeyValuesBean tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResourceInstanceTagRequest withTags(Consumer<List<TagKeyValuesBean>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含50个key，每个key下面的value最多10个，每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回包含所有标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无tag过滤条件时返回全量数据
     * @return tags
     */
    public List<TagKeyValuesBean> getTags() {
        return tags;
    }

    public void setTags(List<TagKeyValuesBean> tags) {
        this.tags = tags;
    }

    

    public ResourceInstanceTagRequest withTagsAny(List<TagKeyValuesBean> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    
    public ResourceInstanceTagRequest addTagsAnyItem(TagKeyValuesBean tagsAnyItem) {
        if(this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ResourceInstanceTagRequest withTagsAny(Consumer<List<TagKeyValuesBean>> tagsAnySetter) {
        if(this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 包含任意标签，最多包含50个key，每个key下面的value最多10个, 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据
     * @return tagsAny
     */
    public List<TagKeyValuesBean> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<TagKeyValuesBean> tagsAny) {
        this.tagsAny = tagsAny;
    }

    

    public ResourceInstanceTagRequest withNotTagsAny(List<TagKeyValuesBean> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    
    public ResourceInstanceTagRequest addNotTagsAnyItem(TagKeyValuesBean notTagsAnyItem) {
        if(this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ResourceInstanceTagRequest withNotTagsAny(Consumer<List<TagKeyValuesBean>> notTagsAnySetter) {
        if(this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 不包含任意标签，最多包含50个key，每个key下面的value最多10个, 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回不包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据
     * @return notTagsAny
     */
    public List<TagKeyValuesBean> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<TagKeyValuesBean> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    

    public ResourceInstanceTagRequest withSysTags(TagKeyValuesBean sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ResourceInstanceTagRequest withSysTags(Consumer<TagKeyValuesBean> sysTagsSetter) {
        if(this.sysTags == null ){
            this.sysTags = new TagKeyValuesBean();
            sysTagsSetter.accept(this.sysTags);
        }
        
        return this;
    }


    /**
     * Get sysTags
     * @return sysTags
     */
    public TagKeyValuesBean getSysTags() {
        return sysTags;
    }

    public void setSysTags(TagKeyValuesBean sysTags) {
        this.sysTags = sysTags;
    }

    

    public ResourceInstanceTagRequest withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    


    /**
     * 不包含任意一个标签，该字段为true时查询所有不带标签的资源，此时忽略 “tags”、“tags_any”、“not_tags”、“not_tags_any”字段
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceInstanceTagRequest resourceInstanceTagRequest = (ResourceInstanceTagRequest) o;
        return Objects.equals(this.matches, resourceInstanceTagRequest.matches) &&
            Objects.equals(this.notTags, resourceInstanceTagRequest.notTags) &&
            Objects.equals(this.tags, resourceInstanceTagRequest.tags) &&
            Objects.equals(this.tagsAny, resourceInstanceTagRequest.tagsAny) &&
            Objects.equals(this.notTagsAny, resourceInstanceTagRequest.notTagsAny) &&
            Objects.equals(this.sysTags, resourceInstanceTagRequest.sysTags) &&
            Objects.equals(this.withoutAnyTag, resourceInstanceTagRequest.withoutAnyTag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(matches, notTags, tags, tagsAny, notTagsAny, sysTags, withoutAnyTag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInstanceTagRequest {\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
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

