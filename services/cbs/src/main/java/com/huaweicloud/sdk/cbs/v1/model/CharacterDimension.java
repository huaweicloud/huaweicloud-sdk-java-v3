package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 角色的尺寸
 */
public class CharacterDimension  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="height")
    

    private String height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="width")
    

    private String width;

    public CharacterDimension withHeight(String height) {
        this.height = height;
        return this;
    }

    


    /**
     * 角色的高度
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    

    public CharacterDimension withWidth(String width) {
        this.width = width;
        return this;
    }

    


    /**
     * 角色的宽度
     * @return width
     */
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterDimension characterDimension = (CharacterDimension) o;
        return Objects.equals(this.height, characterDimension.height) &&
            Objects.equals(this.width, characterDimension.width);
    }
    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterDimension {\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

