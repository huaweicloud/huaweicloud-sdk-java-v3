package com.huaweicloud.sdk.iec.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.ImageList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListImagesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="images")
    
    private List<ImageList> images = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListImagesResponse withImages(List<ImageList> images) {
        this.images = images;
        return this;
    }

    
    public ListImagesResponse addImagesItem(ImageList imagesItem) {
        if(this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public ListImagesResponse withImages(Consumer<List<ImageList>> imagesSetter) {
        if(this.images == null) {
            this.images = new ArrayList<>();
        }
        imagesSetter.accept(this.images);
        return this;
    }

    /**
     * 查询返回的镜像列表。
     * @return images
     */
    public List<ImageList> getImages() {
        return images;
    }

    public void setImages(List<ImageList> images) {
        this.images = images;
    }

    

    public ListImagesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 列表元素个数，分页查询时返回总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListImagesResponse listImagesResponse = (ListImagesResponse) o;
        return Objects.equals(this.images, listImagesResponse.images) &&
            Objects.equals(this.total, listImagesResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(images, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImagesResponse {\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

