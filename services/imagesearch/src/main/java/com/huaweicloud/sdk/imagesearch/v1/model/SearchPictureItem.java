package com.huaweicloud.sdk.imagesearch.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 搜索结果详情。
 */
public class SearchPictureItem  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sim")
    
    
    private Float sim;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    
    private Object tags;

    public SearchPictureItem withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 被搜索图片的路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public SearchPictureItem withSim(Float sim) {
        this.sim = sim;
        return this;
    }

    


    /**
     * 查询图片和被搜索图片的相似度，值越接近1表示越相似。
     * @return sim
     */
    public Float getSim() {
        return sim;
    }

    public void setSim(Float sim) {
        this.sim = sim;
    }

    

    public SearchPictureItem withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 自定义的标签名称和标签内容。
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
        SearchPictureItem searchPictureItem = (SearchPictureItem) o;
        return Objects.equals(this.path, searchPictureItem.path) &&
            Objects.equals(this.sim, searchPictureItem.sim) &&
            Objects.equals(this.tags, searchPictureItem.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path, sim, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchPictureItem {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    sim: ").append(toIndentedString(sim)).append("\n");
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

