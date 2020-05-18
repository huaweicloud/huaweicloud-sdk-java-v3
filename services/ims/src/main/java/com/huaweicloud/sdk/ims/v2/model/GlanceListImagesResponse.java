package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.GlanceShowImageResponseBody;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class GlanceListImagesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="first")
    
    private String first;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="images")
    
    private List<GlanceShowImageResponseBody> images = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schema")
    
    private String schema;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="next")
    
    private String next;

    public GlanceListImagesResponse withFirst(String first) {
        this.first = first;
        return this;
    }

    


    /**
     * 查询首页的URL。
     * @return first
     */
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public GlanceListImagesResponse withImages(List<GlanceShowImageResponseBody> images) {
        this.images = images;
        return this;
    }

    
    public GlanceListImagesResponse addImagesItem(GlanceShowImageResponseBody imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public GlanceListImagesResponse withImages(Consumer<List<GlanceShowImageResponseBody>> imagesSetter) {
        if(this.images == null ){
            this.images = new ArrayList<>();
        }
        imagesSetter.accept(this.images);
        return this;
    }

    /**
     * 资源类型。
     * @return images
     */
    public List<GlanceShowImageResponseBody> getImages() {
        return images;
    }

    public void setImages(List<GlanceShowImageResponseBody> images) {
        this.images = images;
    }

    public GlanceListImagesResponse withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    


    /**
     * 描述镜像列表模式的URL。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public GlanceListImagesResponse withNext(String next) {
        this.next = next;
        return this;
    }

    


    /**
     * 查询下一页的URL。当查询镜像列表最后一页时，不存在next。
     * @return next
     */
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceListImagesResponse glanceListImagesResponse = (GlanceListImagesResponse) o;
        return Objects.equals(this.first, glanceListImagesResponse.first) &&
            Objects.equals(this.images, glanceListImagesResponse.images) &&
            Objects.equals(this.schema, glanceListImagesResponse.schema) &&
            Objects.equals(this.next, glanceListImagesResponse.next);
    }
    @Override
    public int hashCode() {
        return Objects.hash(first, images, schema, next);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceListImagesResponse {\n");
            sb.append("    first: ").append(toIndentedString(first)).append("\n");
            sb.append("    images: ").append(toIndentedString(images)).append("\n");
            sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
            sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

