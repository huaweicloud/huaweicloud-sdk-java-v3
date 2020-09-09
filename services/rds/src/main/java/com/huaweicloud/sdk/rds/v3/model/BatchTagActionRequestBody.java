package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.BatchTagActionRequestBodyTags;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchTagActionRequestBody
 */
public class BatchTagActionRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<BatchTagActionRequestBodyTags> tags = new ArrayList<>();
    
    public BatchTagActionRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识（区分大小写）：create（创建）、delete（删除）。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BatchTagActionRequestBody withTags(List<BatchTagActionRequestBodyTags> tags) {
        this.tags = tags;
        return this;
    }

    
    public BatchTagActionRequestBody addTagsItem(BatchTagActionRequestBodyTags tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public BatchTagActionRequestBody withTags(Consumer<List<BatchTagActionRequestBodyTags>> tagsSetter) {
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
    public List<BatchTagActionRequestBodyTags> getTags() {
        return tags;
    }

    public void setTags(List<BatchTagActionRequestBodyTags> tags) {
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
        BatchTagActionRequestBody batchTagActionRequestBody = (BatchTagActionRequestBody) o;
        return Objects.equals(this.action, batchTagActionRequestBody.action) &&
            Objects.equals(this.tags, batchTagActionRequestBody.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTagActionRequestBody {\n");
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

