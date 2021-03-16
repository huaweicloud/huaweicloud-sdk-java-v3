package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.TagWithKeyValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchTagActionAddRequestBody
 */
public class BatchTagActionAddRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagWithKeyValue> tags = null;
    
    public BatchTagActionAddRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识（区分大小写）：创建时为“create”。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public BatchTagActionAddRequestBody withTags(List<TagWithKeyValue> tags) {
        this.tags = tags;
        return this;
    }

    
    public BatchTagActionAddRequestBody addTagsItem(TagWithKeyValue tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public BatchTagActionAddRequestBody withTags(Consumer<List<TagWithKeyValue>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。单个实例总标签数上限10个。
     * @return tags
     */
    public List<TagWithKeyValue> getTags() {
        return tags;
    }

    public void setTags(List<TagWithKeyValue> tags) {
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
        BatchTagActionAddRequestBody batchTagActionAddRequestBody = (BatchTagActionAddRequestBody) o;
        return Objects.equals(this.action, batchTagActionAddRequestBody.action) &&
            Objects.equals(this.tags, batchTagActionAddRequestBody.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTagActionAddRequestBody {\n");
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

