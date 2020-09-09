package com.huaweicloud.sdk.moderation.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ImageDetectionResultDetailFaceDetail
 */
public class ImageDetectionResultDetailFaceDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="h")
    
    private Integer h;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="w")
    
    private Integer w;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x")
    
    private Integer x;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="y")
    
    private Integer y;

    public ImageDetectionResultDetailFaceDetail withH(Integer h) {
        this.h = h;
        return this;
    }

    


    /**
     * Get h
     * @return h
     */
    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public ImageDetectionResultDetailFaceDetail withW(Integer w) {
        this.w = w;
        return this;
    }

    


    /**
     * Get w
     * @return w
     */
    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public ImageDetectionResultDetailFaceDetail withX(Integer x) {
        this.x = x;
        return this;
    }

    


    /**
     * Get x
     * @return x
     */
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public ImageDetectionResultDetailFaceDetail withY(Integer y) {
        this.y = y;
        return this;
    }

    


    /**
     * Get y
     * @return y
     */
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDetectionResultDetailFaceDetail imageDetectionResultDetailFaceDetail = (ImageDetectionResultDetailFaceDetail) o;
        return Objects.equals(this.h, imageDetectionResultDetailFaceDetail.h) &&
            Objects.equals(this.w, imageDetectionResultDetailFaceDetail.w) &&
            Objects.equals(this.x, imageDetectionResultDetailFaceDetail.x) &&
            Objects.equals(this.y, imageDetectionResultDetailFaceDetail.y);
    }
    @Override
    public int hashCode() {
        return Objects.hash(h, w, x, y);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResultDetailFaceDetail {\n");
        sb.append("    h: ").append(toIndentedString(h)).append("\n");
        sb.append("    w: ").append(toIndentedString(w)).append("\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

