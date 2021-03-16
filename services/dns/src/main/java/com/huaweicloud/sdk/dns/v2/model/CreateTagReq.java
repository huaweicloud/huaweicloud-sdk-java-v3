package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.Tag;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateTagReq
 */
public class CreateTagReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private Tag tag;

    public CreateTagReq withTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    public CreateTagReq withTag(Consumer<Tag> tagSetter) {
        if(this.tag == null ){
            this.tag = new Tag();
            tagSetter.accept(this.tag);
        }
        
        return this;
    }


    /**
     * Get tag
     * @return tag
     */
    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
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
        CreateTagReq createTagReq = (CreateTagReq) o;
        return Objects.equals(this.tag, createTagReq.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTagReq {\n");
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

