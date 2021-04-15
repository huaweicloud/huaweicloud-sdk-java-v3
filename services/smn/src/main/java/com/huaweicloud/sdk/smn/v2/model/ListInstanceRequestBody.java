package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.smn.v2.model.ResourceTags;
import com.huaweicloud.sdk.smn.v2.model.TagMatch;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListInstanceRequestBody
 */
public class ListInstanceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<ResourceTags> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags_any")
    
    private List<ResourceTags> tagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags")
    
    private List<ResourceTags> notTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags_any")
    
    private List<ResourceTags> notTagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="matches")
    
    private List<TagMatch> matches = null;
    
    public ListInstanceRequestBody withTags(List<ResourceTags> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListInstanceRequestBody addTagsItem(ResourceTags tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListInstanceRequestBody withTags(Consumer<List<ResourceTags>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 最多包含10个key，每个key最多包含10个value，结构体不能缺失。key不能为空或者空字符串。key不能重复，同一个key中value不能重复，不同key对应的资源之间为与的关系。
     * @return tags
     */
    public List<ResourceTags> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTags> tags) {
        this.tags = tags;
    }

    

    public ListInstanceRequestBody withTagsAny(List<ResourceTags> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    
    public ListInstanceRequestBody addTagsAnyItem(ResourceTags tagsAnyItem) {
        if(this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ListInstanceRequestBody withTagsAny(Consumer<List<ResourceTags>> tagsAnySetter) {
        if(this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 最多包含10个key，每个key最多包含10个value，结构体不能缺失。key不能为空或者空字符串。key不能重复，同一个key中value不能重复，不同key对应的资源之间为或的关系。
     * @return tagsAny
     */
    public List<ResourceTags> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<ResourceTags> tagsAny) {
        this.tagsAny = tagsAny;
    }

    

    public ListInstanceRequestBody withNotTags(List<ResourceTags> notTags) {
        this.notTags = notTags;
        return this;
    }

    
    public ListInstanceRequestBody addNotTagsItem(ResourceTags notTagsItem) {
        if(this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ListInstanceRequestBody withNotTags(Consumer<List<ResourceTags>> notTagsSetter) {
        if(this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 最多包含10个key，每个key最多包含10个value，结构体不能缺失。key不能为空或者空字符串。key不能重复，同一个key中value不能重复，不同key对应的资源之间为与非的关系。
     * @return notTags
     */
    public List<ResourceTags> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<ResourceTags> notTags) {
        this.notTags = notTags;
    }

    

    public ListInstanceRequestBody withNotTagsAny(List<ResourceTags> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    
    public ListInstanceRequestBody addNotTagsAnyItem(ResourceTags notTagsAnyItem) {
        if(this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ListInstanceRequestBody withNotTagsAny(Consumer<List<ResourceTags>> notTagsAnySetter) {
        if(this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 最多包含10个key，每个key最多包含10个value，结构体不能缺失。key不能为空或者空字符串。key不能重复，同一个key中value不能重复，不同key对应的资源之间为或非的关系。
     * @return notTagsAny
     */
    public List<ResourceTags> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<ResourceTags> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    

    public ListInstanceRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置， 从offset指定的下一条数据开始查询。 查询第一页数据时，不需要传入此参数，查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数。  action为count时无此参数。  action为filter时，默认为0，必须为数字，且不能为负数。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ListInstanceRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数。  action为count时无此参数。  action为filter时，默认为1000。limit最多为1000，不能为负数，最小值为1。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ListInstanceRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识（仅限于filter，count）：filter（过滤），count(查询总条数)。 为filter时表示分页查询，为count只需按照条件将总条数返回即可。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public ListInstanceRequestBody withMatches(List<TagMatch> matches) {
        this.matches = matches;
        return this;
    }

    
    public ListInstanceRequestBody addMatchesItem(TagMatch matchesItem) {
        if(this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListInstanceRequestBody withMatches(Consumer<List<TagMatch>> matchesSetter) {
        if(this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段。  key为要匹配的字段，当前只支持resource_name。  value为匹配的值，当前为精确匹配。
     * @return matches
     */
    public List<TagMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<TagMatch> matches) {
        this.matches = matches;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceRequestBody listInstanceRequestBody = (ListInstanceRequestBody) o;
        return Objects.equals(this.tags, listInstanceRequestBody.tags) &&
            Objects.equals(this.tagsAny, listInstanceRequestBody.tagsAny) &&
            Objects.equals(this.notTags, listInstanceRequestBody.notTags) &&
            Objects.equals(this.notTagsAny, listInstanceRequestBody.notTagsAny) &&
            Objects.equals(this.offset, listInstanceRequestBody.offset) &&
            Objects.equals(this.limit, listInstanceRequestBody.limit) &&
            Objects.equals(this.action, listInstanceRequestBody.action) &&
            Objects.equals(this.matches, listInstanceRequestBody.matches);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, offset, limit, action, matches);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

