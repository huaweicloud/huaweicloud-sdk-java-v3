package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.Matches;
import com.huaweicloud.sdk.as.v1.model.TagsMultiValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 请求正常
 */
public class ShowTagsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagsMultiValue> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags_any")
    
    private List<TagsMultiValue> tagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags")
    
    private List<TagsMultiValue> notTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_tags_any")
    
    private List<TagsMultiValue> notTagsAny = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;
    /**
     * 操作标识（仅限filter，count）：filter（过滤）：即分页查询。count（查询总条数）：按照条件将总条数返回即可。
     */
    public static class ActionEnum {

        
        /**
         * Enum FILTER for value: "filter"
         */
        public static final ActionEnum FILTER = new ActionEnum("filter");

        
        /**
         * Enum COUNT for value: "count"
         */
        public static final ActionEnum COUNT = new ActionEnum("count");

        

        public static Map<String, ActionEnum> staticFields =
                new HashMap<String, ActionEnum>() {
                    { 
                        put("filter", FILTER);
                        put("count", COUNT);
                    }
                };

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ActionEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
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
    @JsonProperty(value="offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="matchs")
    
    private List<Matches> matchs = null;
    
    public ShowTagsRequestBody withTags(List<TagsMultiValue> tags) {
        this.tags = tags;
        return this;
    }

    
    public ShowTagsRequestBody addTagsItem(TagsMultiValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowTagsRequestBody withTags(Consumer<List<TagsMultiValue>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 过滤条件，包含标签，最多包含10个Tag，结构体不能缺失。
     * @return tags
     */
    public List<TagsMultiValue> getTags() {
        return tags;
    }

    public void setTags(List<TagsMultiValue> tags) {
        this.tags = tags;
    }

    public ShowTagsRequestBody withTagsAny(List<TagsMultiValue> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    
    public ShowTagsRequestBody addTagsAnyItem(TagsMultiValue tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ShowTagsRequestBody withTagsAny(Consumer<List<TagsMultiValue>> tagsAnySetter) {
        if(this.tagsAny == null ){
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 过滤条件，包含任意标签，最多包含10个Tag。
     * @return tagsAny
     */
    public List<TagsMultiValue> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<TagsMultiValue> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ShowTagsRequestBody withNotTags(List<TagsMultiValue> notTags) {
        this.notTags = notTags;
        return this;
    }

    
    public ShowTagsRequestBody addNotTagsItem(TagsMultiValue notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ShowTagsRequestBody withNotTags(Consumer<List<TagsMultiValue>> notTagsSetter) {
        if(this.notTags == null ){
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 过滤条件，不包含标签，最多包含10个Tag。
     * @return notTags
     */
    public List<TagsMultiValue> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<TagsMultiValue> notTags) {
        this.notTags = notTags;
    }

    public ShowTagsRequestBody withNotTagsAny(List<TagsMultiValue> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    
    public ShowTagsRequestBody addNotTagsAnyItem(TagsMultiValue notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ShowTagsRequestBody withNotTagsAny(Consumer<List<TagsMultiValue>> notTagsAnySetter) {
        if(this.notTagsAny == null ){
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 过滤条件，不包含任意标签，最多包含10个Tag。
     * @return notTagsAny
     */
    public List<TagsMultiValue> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<TagsMultiValue> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ShowTagsRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数（action为count时无此参数）如果action为filter默认为1000，limit最多为1000，不能为负数，最小值为1。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ShowTagsRequestBody withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 分页位置标识（资源ID或索引位置）。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ShowTagsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识（仅限filter，count）：filter（过滤）：即分页查询。count（查询总条数）：按照条件将总条数返回即可。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ShowTagsRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * （索引位置），从offset指定的下一条数据开始查询。查询第一页数据时，不需要传入此参数。查询后续页码数据时，将查询前一页数据时，不需要传入此参数。查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数。必须为数字，不能为负数。action：count时，无此参数。action：filter时，默认为0
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ShowTagsRequestBody withMatchs(List<Matches> matchs) {
        this.matchs = matchs;
        return this;
    }

    
    public ShowTagsRequestBody addMatchsItem(Matches matchsItem) {
        if (this.matchs == null) {
            this.matchs = new ArrayList<>();
        }
        this.matchs.add(matchsItem);
        return this;
    }

    public ShowTagsRequestBody withMatchs(Consumer<List<Matches>> matchsSetter) {
        if(this.matchs == null ){
            this.matchs = new ArrayList<>();
        }
        matchsSetter.accept(this.matchs);
        return this;
    }

    /**
     * 模糊搜索字段。
     * @return matchs
     */
    public List<Matches> getMatchs() {
        return matchs;
    }

    public void setMatchs(List<Matches> matchs) {
        this.matchs = matchs;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTagsRequestBody showTagsRequestBody = (ShowTagsRequestBody) o;
        return Objects.equals(this.tags, showTagsRequestBody.tags) &&
            Objects.equals(this.tagsAny, showTagsRequestBody.tagsAny) &&
            Objects.equals(this.notTags, showTagsRequestBody.notTags) &&
            Objects.equals(this.notTagsAny, showTagsRequestBody.notTagsAny) &&
            Objects.equals(this.limit, showTagsRequestBody.limit) &&
            Objects.equals(this.marker, showTagsRequestBody.marker) &&
            Objects.equals(this.action, showTagsRequestBody.action) &&
            Objects.equals(this.offset, showTagsRequestBody.offset) &&
            Objects.equals(this.matchs, showTagsRequestBody.matchs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, limit, marker, action, offset, matchs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTagsRequestBody {\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
            sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
            sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
            sb.append("    action: ").append(toIndentedString(action)).append("\n");
            sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
            sb.append("    matchs: ").append(toIndentedString(matchs)).append("\n");
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

