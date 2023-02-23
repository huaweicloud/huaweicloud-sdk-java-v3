package com.huaweicloud.sdk.imagesearch.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DeletePictureReq
 */
public class DeletePictureReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    

    private String path;

    public DeletePictureReq withPath(String path) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeletePictureReq deletePictureReq = (DeletePictureReq) o;
        return Objects.equals(this.path, deletePictureReq.path);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePictureReq {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

