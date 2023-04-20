package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.Position;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class LeftRightPosition  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="left")
    

    private Position left;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="right")
    

    private Position right;

    public LeftRightPosition withLeft(Position left) {
        this.left = left;
        return this;
    }

    public LeftRightPosition withLeft(Consumer<Position> leftSetter) {
        if(this.left == null ){
            this.left = new Position();
            leftSetter.accept(this.left);
        }
        
        return this;
    }


    /**
     * Get left
     * @return left
     */
    public Position getLeft() {
        return left;
    }

    public void setLeft(Position left) {
        this.left = left;
    }

    

    public LeftRightPosition withRight(Position right) {
        this.right = right;
        return this;
    }

    public LeftRightPosition withRight(Consumer<Position> rightSetter) {
        if(this.right == null ){
            this.right = new Position();
            rightSetter.accept(this.right);
        }
        
        return this;
    }


    /**
     * Get right
     * @return right
     */
    public Position getRight() {
        return right;
    }

    public void setRight(Position right) {
        this.right = right;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LeftRightPosition leftRightPosition = (LeftRightPosition) o;
        return Objects.equals(this.left, leftRightPosition.left) &&
            Objects.equals(this.right, leftRightPosition.right);
    }
    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeftRightPosition {\n");
        sb.append("    left: ").append(toIndentedString(left)).append("\n");
        sb.append("    right: ").append(toIndentedString(right)).append("\n");
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

