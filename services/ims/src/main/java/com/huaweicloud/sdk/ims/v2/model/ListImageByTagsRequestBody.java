package com.huaweicloud.sdk.ims.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.TagKeyValue;
import com.huaweicloud.sdk.ims.v2.model.Tags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 请求参数
 */
public class ListImageByTagsRequestBody  {

    /**
     * 操作标识（区分大小写），支持filter、count。filter就是分页查询；count是只需按照条件将总条数返回即可。
     */
    public static final class ActionEnum {

        
        /**
         * Enum FILTER for value: "filter"
         */
        public static final ActionEnum FILTER = new ActionEnum("filter");
        
        /**
         * Enum COUNT for value: "count"
         */
        public static final ActionEnum COUNT = new ActionEnum("count");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("filter", FILTER);
            map.put("count", COUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private ActionEnum action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Tags> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags_any")
    
    private List<Tags> tagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags")
    
    private List<Tags> notTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags_any")
    
    private List<Tags> notTagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="matches")
    
    private List<TagKeyValue> matches = null;
    
    public ListImageByTagsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识（区分大小写），支持filter、count。filter就是分页查询；count是只需按照条件将总条数返回即可。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    public ListImageByTagsRequestBody withTags(List<Tags> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListImageByTagsRequestBody addTagsItem(Tags tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public ListImageByTagsRequestBody withTags(Consumer<List<Tags>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含10个key，每个key对应的values最多包含10个值，且key和values都不能重复。不能为空列表。
     * @return tags
     */
    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    

    public ListImageByTagsRequestBody withTagsAny(List<Tags> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    
    public ListImageByTagsRequestBody addTagsAnyItem(Tags tagsAnyItem) {
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ListImageByTagsRequestBody withTagsAny(Consumer<List<Tags>> tagsAnySetter) {
        if(this.tagsAny == null ){
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 包含任意标签，最多包含10个key，每个key对应的values最多包含10个值，且key和values都不能重复。不允许为空列表，但可以不传递参数。
     * @return tagsAny
     */
    public List<Tags> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<Tags> tagsAny) {
        this.tagsAny = tagsAny;
    }

    

    public ListImageByTagsRequestBody withNotTags(List<Tags> notTags) {
        this.notTags = notTags;
        return this;
    }

    
    public ListImageByTagsRequestBody addNotTagsItem(Tags notTagsItem) {
        this.notTags.add(notTagsItem);
        return this;
    }

    public ListImageByTagsRequestBody withNotTags(Consumer<List<Tags>> notTagsSetter) {
        if(this.notTags == null ){
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 不包含标签，最多包含10个key，每个key对应的values最多包含10个值，且key和values都不能重复。不能为空列表。
     * @return notTags
     */
    public List<Tags> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<Tags> notTags) {
        this.notTags = notTags;
    }

    

    public ListImageByTagsRequestBody withNotTagsAny(List<Tags> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    
    public ListImageByTagsRequestBody addNotTagsAnyItem(Tags notTagsAnyItem) {
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ListImageByTagsRequestBody withNotTagsAny(Consumer<List<Tags>> notTagsAnySetter) {
        if(this.notTagsAny == null ){
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 不包含任意标签，最多包含10个key，每个key对应的values最多包含10个值，且key和values都不能重复。不能为空列表。
     * @return notTagsAny
     */
    public List<Tags> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<Tags> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    

    public ListImageByTagsRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 最大查询记录数(action为count，时此参数无效）如果action为filter默认为10，limit最多为1000，不能为负数，最小值为1。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ListImageByTagsRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置， 从offset指定的下一条数据开始查询。 查询第一页数据时，不需要传入此参数（action为count时，此参数无效），如果action为filter默认为0，不能为负数。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ListImageByTagsRequestBody withMatches(List<TagKeyValue> matches) {
        this.matches = matches;
        return this;
    }

    
    public ListImageByTagsRequestBody addMatchesItem(TagKeyValue matchesItem) {
        this.matches.add(matchesItem);
        return this;
    }

    public ListImageByTagsRequestBody withMatches(Consumer<List<TagKeyValue>> matchesSetter) {
        if(this.matches == null ){
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段，key为要匹配的字段，如resource_name、resource_id等。value为匹配的值。多个matches的key不允许重复。不允许为空列表，但可以不传递参数。
     * @return matches
     */
    public List<TagKeyValue> getMatches() {
        return matches;
    }

    public void setMatches(List<TagKeyValue> matches) {
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
        ListImageByTagsRequestBody listImageByTagsRequestBody = (ListImageByTagsRequestBody) o;
        return Objects.equals(this.action, listImageByTagsRequestBody.action) &&
            Objects.equals(this.tags, listImageByTagsRequestBody.tags) &&
            Objects.equals(this.tagsAny, listImageByTagsRequestBody.tagsAny) &&
            Objects.equals(this.notTags, listImageByTagsRequestBody.notTags) &&
            Objects.equals(this.notTagsAny, listImageByTagsRequestBody.notTagsAny) &&
            Objects.equals(this.limit, listImageByTagsRequestBody.limit) &&
            Objects.equals(this.offset, listImageByTagsRequestBody.offset) &&
            Objects.equals(this.matches, listImageByTagsRequestBody.matches);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, tags, tagsAny, notTags, notTagsAny, limit, offset, matches);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageByTagsRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

