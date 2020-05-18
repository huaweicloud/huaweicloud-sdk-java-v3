package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesTagOption;
import com.huaweicloud.sdk.dds.v3.model.Match;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ListInstancesByTagsRequestBody
 */
public class ListInstancesByTagsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;
    /**
     * 操作标识。   - 取值为“filter”，表示根据标签过滤条件查询实例。   - 取值为“count”，表示仅返回总记录数，禁止返回其他字段。
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
    @JsonProperty(value="matches")
    
    private List<Match> matches = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<ListInstancesTagOption> tags = null;
    
    public ListInstancesByTagsRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置偏移量，表示从第一条数据偏移offset条数据后开始查询。 - “action”值为“count”时，不传该参数。 - “action”值为“filter”时，取值必须为数字，不能为负数。默认取0值，表示从第一条数据开始查询。'
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListInstancesByTagsRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数。   - “action”值为“count”时，不传该参数。   - “action”值为“filter”时，取值范围：1~100。不传该参数时，默认查询前100条实例信息。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListInstancesByTagsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识。   - 取值为“filter”，表示根据标签过滤条件查询实例。   - 取值为“count”，表示仅返回总记录数，禁止返回其他字段。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ListInstancesByTagsRequestBody withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    
    public ListInstancesByTagsRequestBody addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListInstancesByTagsRequestBody withMatches(Consumer<List<Match>> matchesSetter) {
        if(this.matches == null ){
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段。   - 该字段值为空，表示不按照实例名称或实例ID查询。   - 该字段值不为空
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public ListInstancesByTagsRequestBody withTags(List<ListInstancesTagOption> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListInstancesByTagsRequestBody addTagsItem(ListInstancesTagOption tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListInstancesByTagsRequestBody withTags(Consumer<List<ListInstancesTagOption>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含10个key。
     * @return tags
     */
    public List<ListInstancesTagOption> getTags() {
        return tags;
    }

    public void setTags(List<ListInstancesTagOption> tags) {
        this.tags = tags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesByTagsRequestBody listInstancesByTagsRequestBody = (ListInstancesByTagsRequestBody) o;
        return Objects.equals(this.offset, listInstancesByTagsRequestBody.offset) &&
            Objects.equals(this.limit, listInstancesByTagsRequestBody.limit) &&
            Objects.equals(this.action, listInstancesByTagsRequestBody.action) &&
            Objects.equals(this.matches, listInstancesByTagsRequestBody.matches) &&
            Objects.equals(this.tags, listInstancesByTagsRequestBody.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, action, matches, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesByTagsRequestBody {\n");
            sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    action: ").append(toIndentedString(action)).append("\n");
            sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

