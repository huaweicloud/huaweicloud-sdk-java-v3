package com.huaweicloud.sdk.eip.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.MatchReq;
import com.huaweicloud.sdk.eip.v2.model.TagReq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 通过标签过滤弹性公网IP的请求体
 */
public class ListPublicipsByTagsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagReq> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;
    /**
     * 操作标识：  filter分页查询  count查询总数
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
    @JsonProperty(value="matches")
    
    private List<MatchReq> matches = null;
    
    public ListPublicipsByTagsRequestBody withTags(List<TagReq> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListPublicipsByTagsRequestBody addTagsItem(TagReq tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListPublicipsByTagsRequestBody withTags(Consumer<List<TagReq>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含10个key。  每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。  Key不能重复，同一个key中values不能重复。
     * @return tags
     */
    public List<TagReq> getTags() {
        return tags;
    }

    public void setTags(List<TagReq> tags) {
        this.tags = tags;
    }

    

    public ListPublicipsByTagsRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数（action为count时无此参数）
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

    

    public ListPublicipsByTagsRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置， 从offset指定的下一条数据开始查询。 查询第一页数据时，不需要传入此参数，查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数（action为count时无此参数）
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListPublicipsByTagsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识：  filter分页查询  count查询总数
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    

    public ListPublicipsByTagsRequestBody withMatches(List<MatchReq> matches) {
        this.matches = matches;
        return this;
    }

    
    public ListPublicipsByTagsRequestBody addMatchesItem(MatchReq matchesItem) {
        if(this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListPublicipsByTagsRequestBody withMatches(Consumer<List<MatchReq>> matchesSetter) {
        if(this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段，key为要匹配的字段，当前仅支持resource_name。value为匹配的值。此字段为固定字典值。
     * @return matches
     */
    public List<MatchReq> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchReq> matches) {
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
        ListPublicipsByTagsRequestBody listPublicipsByTagsRequestBody = (ListPublicipsByTagsRequestBody) o;
        return Objects.equals(this.tags, listPublicipsByTagsRequestBody.tags) &&
            Objects.equals(this.limit, listPublicipsByTagsRequestBody.limit) &&
            Objects.equals(this.offset, listPublicipsByTagsRequestBody.offset) &&
            Objects.equals(this.action, listPublicipsByTagsRequestBody.action) &&
            Objects.equals(this.matches, listPublicipsByTagsRequestBody.matches);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, limit, offset, action, matches);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicipsByTagsRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

