package com.huaweicloud.sdk.mrs.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.Match;
import com.huaweicloud.sdk.mrs.v1.model.TagWithMultiValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListResourceReq
 */
public class ListResourceReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagWithMultiValue> tags = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags_any")
    
    private List<TagWithMultiValue> tagsAny = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags")
    
    private List<TagWithMultiValue> notTags = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags_any")
    
    private List<TagWithMultiValue> notTagsAny = null;
        /**
     * 操作标识（仅限于filter，count）：filter（过滤），count(查询总条数)。  如果是filter则为分页查询，如果是count会按照条件将总条数返回。
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
            return value;
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
            if (obj instanceof ActionEnum) {
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
    @JsonProperty(value="limit")
    

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="matches")
    
    private List<Match> matches = null;
    
    public ListResourceReq withTags(List<TagWithMultiValue> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListResourceReq addTagsItem(TagWithMultiValue tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListResourceReq withTags(Consumer<List<TagWithMultiValue>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 返回结果包含该参数中所有标签对应的资源，该参数最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。
     * @return tags
     */
    public List<TagWithMultiValue> getTags() {
        return tags;
    }

    public void setTags(List<TagWithMultiValue> tags) {
        this.tags = tags;
    }

    

    public ListResourceReq withTagsAny(List<TagWithMultiValue> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    
    public ListResourceReq addTagsAnyItem(TagWithMultiValue tagsAnyItem) {
        if(this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ListResourceReq withTagsAny(Consumer<List<TagWithMultiValue>> tagsAnySetter) {
        if(this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 返回结果包含该参数中任意一个标签对应的资源，该参数最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * @return tagsAny
     */
    public List<TagWithMultiValue> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<TagWithMultiValue> tagsAny) {
        this.tagsAny = tagsAny;
    }

    

    public ListResourceReq withNotTags(List<TagWithMultiValue> notTags) {
        this.notTags = notTags;
        return this;
    }

    
    public ListResourceReq addNotTagsItem(TagWithMultiValue notTagsItem) {
        if(this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ListResourceReq withNotTags(Consumer<List<TagWithMultiValue>> notTagsSetter) {
        if(this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 返回结果不包含该参数中所有标签对应的资源，该参数最多包含10个key，每个key下面的value最多10个, 结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * @return notTags
     */
    public List<TagWithMultiValue> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<TagWithMultiValue> notTags) {
        this.notTags = notTags;
    }

    

    public ListResourceReq withNotTagsAny(List<TagWithMultiValue> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    
    public ListResourceReq addNotTagsAnyItem(TagWithMultiValue notTagsAnyItem) {
        if(this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ListResourceReq withNotTagsAny(Consumer<List<TagWithMultiValue>> notTagsAnySetter) {
        if(this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 返回结果不包含该参数中任意一个标签对应的资源，该参数最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * @return notTagsAny
     */
    public List<TagWithMultiValue> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<TagWithMultiValue> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    

    public ListResourceReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识（仅限于filter，count）：filter（过滤），count(查询总条数)。  如果是filter则为分页查询，如果是count会按照条件将总条数返回。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    public ListResourceReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数（action为count时无此参数）如果action为filter默认为1000，limit最多为1000,不能为负数，最小值为1。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListResourceReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * （索引位置），从offset指定的下一条数据开始查询。查询第一页数据时，不需要传入此参数，查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数（action为count时无此参数）如果action为filter默认为0,必须为数字，不能为负数。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListResourceReq withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    
    public ListResourceReq addMatchesItem(Match matchesItem) {
        if(this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListResourceReq withMatches(Consumer<List<Match>> matchesSetter) {
        if(this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段，key为要匹配的字段，如resource_name等。value为匹配的值。此字段为固定字典值。 根据不同的字段确认是否需要模糊匹配，如resource_name默认为模糊搜索，如果value为空字符串精确匹配。
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
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
        ListResourceReq listResourceReq = (ListResourceReq) o;
        return Objects.equals(this.tags, listResourceReq.tags) &&
            Objects.equals(this.tagsAny, listResourceReq.tagsAny) &&
            Objects.equals(this.notTags, listResourceReq.notTags) &&
            Objects.equals(this.notTagsAny, listResourceReq.notTagsAny) &&
            Objects.equals(this.action, listResourceReq.action) &&
            Objects.equals(this.limit, listResourceReq.limit) &&
            Objects.equals(this.offset, listResourceReq.offset) &&
            Objects.equals(this.matches, listResourceReq.matches);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, action, limit, offset, matches);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceReq {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

