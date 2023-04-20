package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ImageFrame;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteGetFramsListByImagesIdResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_frames")
    
    private List<ImageFrame> imageFrames = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Integer count;

    public ExecuteGetFramsListByImagesIdResponse withImageFrames(List<ImageFrame> imageFrames) {
        this.imageFrames = imageFrames;
        return this;
    }

    
    public ExecuteGetFramsListByImagesIdResponse addImageFramesItem(ImageFrame imageFramesItem) {
        if(this.imageFrames == null) {
            this.imageFrames = new ArrayList<>();
        }
        this.imageFrames.add(imageFramesItem);
        return this;
    }

    public ExecuteGetFramsListByImagesIdResponse withImageFrames(Consumer<List<ImageFrame>> imageFramesSetter) {
        if(this.imageFrames == null) {
            this.imageFrames = new ArrayList<>();
        }
        imageFramesSetter.accept(this.imageFrames);
        return this;
    }

    /**
     * 播报框
     * @return imageFrames
     */
    public List<ImageFrame> getImageFrames() {
        return imageFrames;
    }

    public void setImageFrames(List<ImageFrame> imageFrames) {
        this.imageFrames = imageFrames;
    }

    

    public ExecuteGetFramsListByImagesIdResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 播报框总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ExecuteGetFramsListByImagesIdResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 起始偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ExecuteGetFramsListByImagesIdResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 本次查询数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteGetFramsListByImagesIdResponse executeGetFramsListByImagesIdResponse = (ExecuteGetFramsListByImagesIdResponse) o;
        return Objects.equals(this.imageFrames, executeGetFramsListByImagesIdResponse.imageFrames) &&
            Objects.equals(this.total, executeGetFramsListByImagesIdResponse.total) &&
            Objects.equals(this.offset, executeGetFramsListByImagesIdResponse.offset) &&
            Objects.equals(this.count, executeGetFramsListByImagesIdResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageFrames, total, offset, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGetFramsListByImagesIdResponse {\n");
        sb.append("    imageFrames: ").append(toIndentedString(imageFrames)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

