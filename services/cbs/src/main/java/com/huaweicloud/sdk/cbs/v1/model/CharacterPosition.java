package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CharacterPosition
 */
public class CharacterPosition  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x")
    

    private Integer x;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="y")
    

    private String y;

    public CharacterPosition withX(Integer x) {
        this.x = x;
        return this;
    }

    


    /**
     * 从左上为0点出发的横坐标
     * @return x
     */
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    

    public CharacterPosition withY(String y) {
        this.y = y;
        return this;
    }

    


    /**
     * 从左上为0点出发的纵坐标
     * @return y
     */
    public String getY() {
        return y;
    }

    public void setY(String y) {
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
        CharacterPosition characterPosition = (CharacterPosition) o;
        return Objects.equals(this.x, characterPosition.x) &&
            Objects.equals(this.y, characterPosition.y);
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterPosition {\n");
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

