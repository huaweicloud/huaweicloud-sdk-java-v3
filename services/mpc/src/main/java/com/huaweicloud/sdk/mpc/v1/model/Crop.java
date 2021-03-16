package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Crop
 */
public class Crop  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private Integer duration;

    public Crop withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 截取的视频时长。  单位：秒  从0秒开始算起 
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Crop crop = (Crop) o;
        return Objects.equals(this.duration, crop.duration);
    }
    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Crop {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

