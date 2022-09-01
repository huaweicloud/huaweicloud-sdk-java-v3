package com.huaweicloud.sdk.imagesearch.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改图片信息的请求体
 */
public class RunModifyPictureReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    @JacksonXmlProperty(localName = "path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    @JacksonXmlProperty(localName = "tags")
    
    private Object tags;

    public RunModifyPictureReq withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 图片URL路径，作为图片库中索引图片的ID。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public RunModifyPictureReq withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 自定义标签，格式为key:value对，其中： - 标签名（key值）须存在于实例中； - 标签内容（value值）为自定义标签值。 
     * @return tags
     */
    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
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
        RunModifyPictureReq runModifyPictureReq = (RunModifyPictureReq) o;
        return Objects.equals(this.path, runModifyPictureReq.path) &&
            Objects.equals(this.tags, runModifyPictureReq.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunModifyPictureReq {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

