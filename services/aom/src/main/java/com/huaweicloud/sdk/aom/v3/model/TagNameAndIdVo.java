package com.huaweicloud.sdk.aom.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TagNameAndIdVo
 */
public class TagNameAndIdVo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_id")
    
    
    private String tagId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_name")
    
    
    private String tagName;

    public TagNameAndIdVo withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    


    /**
     * 标签Id
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    

    public TagNameAndIdVo withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    


    /**
     * 标签名称
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagNameAndIdVo tagNameAndIdVo = (TagNameAndIdVo) o;
        return Objects.equals(this.tagId, tagNameAndIdVo.tagId) &&
            Objects.equals(this.tagName, tagNameAndIdVo.tagName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tagId, tagName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagNameAndIdVo {\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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

