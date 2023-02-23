package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.TagItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchOperateInstanceTagRequestBody
 */
public class BatchOperateInstanceTagRequestBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagItem> tags = null;
    
    public BatchOperateInstanceTagRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识，取值： - create，表示添加标签。 - delete，表示删除标签。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public BatchOperateInstanceTagRequestBody withTags(List<TagItem> tags) {
        this.tags = tags;
        return this;
    }

    
    public BatchOperateInstanceTagRequestBody addTagsItem(TagItem tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchOperateInstanceTagRequestBody withTags(Consumer<List<TagItem>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<TagItem> getTags() {
        return tags;
    }

    public void setTags(List<TagItem> tags) {
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
        BatchOperateInstanceTagRequestBody batchOperateInstanceTagRequestBody = (BatchOperateInstanceTagRequestBody) o;
        return Objects.equals(this.action, batchOperateInstanceTagRequestBody.action) &&
            Objects.equals(this.tags, batchOperateInstanceTagRequestBody.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchOperateInstanceTagRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

