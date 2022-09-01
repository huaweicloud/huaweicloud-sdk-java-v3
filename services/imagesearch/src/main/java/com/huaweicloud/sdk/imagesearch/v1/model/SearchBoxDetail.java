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
 * SearchBoxDetail
 */
public class SearchBoxDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x")
    
    @JacksonXmlProperty(localName = "x")
    
    private Integer x;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="y")
    
    @JacksonXmlProperty(localName = "y")
    
    private Integer y;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="width")
    
    @JacksonXmlProperty(localName = "width")
    
    private Integer width;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="height")
    
    @JacksonXmlProperty(localName = "height")
    
    private Integer height;

    public SearchBoxDetail withX(Integer x) {
        this.x = x;
        return this;
    }

    


    /**
     * 区域中x坐标的最小值，单位：像素。
     * @return x
     */
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    

    public SearchBoxDetail withY(Integer y) {
        this.y = y;
        return this;
    }

    


    /**
     * 区域中y坐标的最小值，单位：像素。
     * @return y
     */
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    

    public SearchBoxDetail withWidth(Integer width) {
        this.width = width;
        return this;
    }

    


    /**
     * 区域的宽度，单位：像素。
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    

    public SearchBoxDetail withHeight(Integer height) {
        this.height = height;
        return this;
    }

    


    /**
     * 区域的高度，单位：像素。
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchBoxDetail searchBoxDetail = (SearchBoxDetail) o;
        return Objects.equals(this.x, searchBoxDetail.x) &&
            Objects.equals(this.y, searchBoxDetail.y) &&
            Objects.equals(this.width, searchBoxDetail.width) &&
            Objects.equals(this.height, searchBoxDetail.height);
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y, width, height);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchBoxDetail {\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

