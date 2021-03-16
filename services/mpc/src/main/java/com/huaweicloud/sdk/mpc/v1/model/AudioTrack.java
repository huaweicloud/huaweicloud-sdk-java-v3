package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AudioTrack
 */
public class AudioTrack  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="left")
    
    private Integer left;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="right")
    
    private Integer right;

    public AudioTrack withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 音轨选取方式。 - 0：默认选取 - 1：手动选择 
     * minimum: 0
     * maximum: 1
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public AudioTrack withLeft(Integer left) {
        this.left = left;
        return this;
    }

    


    /**
     * 选取左声道所在的音轨编号。 
     * minimum: 0
     * maximum: 2147483647
     * @return left
     */
    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    

    public AudioTrack withRight(Integer right) {
        this.right = right;
        return this;
    }

    


    /**
     * 选取右声道所在的音轨编号。 
     * minimum: 0
     * maximum: 2147483647
     * @return right
     */
    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
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
        AudioTrack audioTrack = (AudioTrack) o;
        return Objects.equals(this.type, audioTrack.type) &&
            Objects.equals(this.left, audioTrack.left) &&
            Objects.equals(this.right, audioTrack.right);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, left, right);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioTrack {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

