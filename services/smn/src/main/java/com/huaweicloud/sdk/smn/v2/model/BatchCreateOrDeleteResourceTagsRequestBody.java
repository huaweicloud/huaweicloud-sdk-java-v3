package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.smn.v2.model.ResourceTag;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchCreateOrDeleteResourceTagsRequestBody
 */
public class BatchCreateOrDeleteResourceTagsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<ResourceTag> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;

    public BatchCreateOrDeleteResourceTagsRequestBody withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    
    public BatchCreateOrDeleteResourceTagsRequestBody addTagsItem(ResourceTag tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateOrDeleteResourceTagsRequestBody withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，结构体说明请参见表1。删除时tags结构体不能缺失，key不能为空或空字符串，且不针对字符集范围进行校验。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    

    public BatchCreateOrDeleteResourceTagsRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识：仅限于create（创建）、delete（删除）。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateOrDeleteResourceTagsRequestBody batchCreateOrDeleteResourceTagsRequestBody = (BatchCreateOrDeleteResourceTagsRequestBody) o;
        return Objects.equals(this.tags, batchCreateOrDeleteResourceTagsRequestBody.tags) &&
            Objects.equals(this.action, batchCreateOrDeleteResourceTagsRequestBody.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateOrDeleteResourceTagsRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

