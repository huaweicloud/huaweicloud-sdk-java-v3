package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.Match;
import com.huaweicloud.sdk.evs.v2.model.TagsForListVolumes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class ListVolumesByTagsRequestBody  {

    /**
     * 操作标识。  根据标签查询云硬盘实例详情时使用“filter”。
     */
    public static class ActionEnum {

        
        /**
         * Enum FILTER for value: "filter"
         */
        public static final ActionEnum FILTER = new ActionEnum("filter");

        

        public static Map<String, ActionEnum> staticFields =
                new HashMap<String, ActionEnum>() {
                    { 
                        put("filter", FILTER);
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
    
    private ActionEnum action = ActionEnum.FILTER;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 1000;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="matches")
    
    private List<Match> matches = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagsForListVolumes> tags = new ArrayList<>();
    
    public ListVolumesByTagsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识。  根据标签查询云硬盘实例详情时使用“filter”。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ListVolumesByTagsRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数。最小值1，最大值1000，默认为1000。返回的结果中记录数不超过limit值
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

    public ListVolumesByTagsRequestBody withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    
    public ListVolumesByTagsRequestBody addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListVolumesByTagsRequestBody withMatches(Consumer<List<Match>> matchesSetter) {
        if(this.matches == null ){
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 资源本身支持的查询条件。标签列表中的标签key值不允许重复。
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public ListVolumesByTagsRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置。最小值0，默认为0。返回的结果中第一条记录为符合查询条件的第“offset值+1”条记录
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListVolumesByTagsRequestBody withTags(List<TagsForListVolumes> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListVolumesByTagsRequestBody addTagsItem(TagsForListVolumes tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public ListVolumesByTagsRequestBody withTags(Consumer<List<TagsForListVolumes>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签的键值对。标签列表中最多包含10个key 。标签列表中的标签key值不允许重复。标签列表中多个key之间是“与”的关系，云硬盘必须满足请求中所有key才会匹配出来。
     * @return tags
     */
    public List<TagsForListVolumes> getTags() {
        return tags;
    }

    public void setTags(List<TagsForListVolumes> tags) {
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
        ListVolumesByTagsRequestBody listVolumesByTagsRequestBody = (ListVolumesByTagsRequestBody) o;
        return Objects.equals(this.action, listVolumesByTagsRequestBody.action) &&
            Objects.equals(this.limit, listVolumesByTagsRequestBody.limit) &&
            Objects.equals(this.matches, listVolumesByTagsRequestBody.matches) &&
            Objects.equals(this.offset, listVolumesByTagsRequestBody.offset) &&
            Objects.equals(this.tags, listVolumesByTagsRequestBody.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, limit, matches, offset, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVolumesByTagsRequestBody {\n");
            sb.append("    action: ").append(toIndentedString(action)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
            sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

