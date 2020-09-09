package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.TagItem;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateKmsTagRequestBody
 */
public class CreateKmsTagRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private TagItem tag = null;

    public CreateKmsTagRequestBody withTag(TagItem tag) {
        this.tag = tag;
        return this;
    }

    public CreateKmsTagRequestBody withTag(Consumer<TagItem> tagSetter) {
        if(this.tag == null ){
            this.tag = new TagItem();
            tagSetter.accept(this.tag);
        }
        
        return this;
    }


    /**
     * Get tag
     * @return tag
     */
    public TagItem getTag() {
        return tag;
    }

    public void setTag(TagItem tag) {
        this.tag = tag;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateKmsTagRequestBody createKmsTagRequestBody = (CreateKmsTagRequestBody) o;
        return Objects.equals(this.tag, createKmsTagRequestBody.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKmsTagRequestBody {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

