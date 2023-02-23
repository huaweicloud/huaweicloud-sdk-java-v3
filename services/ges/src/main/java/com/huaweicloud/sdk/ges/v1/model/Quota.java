package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Indicates the resource type
 */
public class Quota  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available")
    

    private Integer available;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgeVolume")
    

    private Integer edgeVolume;

    public Quota withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类型。  取值范围： - \"graph\" - \"backup\" - \"metadata\"
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public Quota withAvailable(Integer available) {
        this.available = available;
        return this;
    }

    


    /**
     * 图的可用个数。
     * @return available
     */
    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    

    public Quota withEdgeVolume(Integer edgeVolume) {
        this.edgeVolume = edgeVolume;
        return this;
    }

    


    /**
     * 边的可用个数。type为graph时此值有效。
     * @return edgeVolume
     */
    public Integer getEdgeVolume() {
        return edgeVolume;
    }

    public void setEdgeVolume(Integer edgeVolume) {
        this.edgeVolume = edgeVolume;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Quota quota = (Quota) o;
        return Objects.equals(this.type, quota.type) &&
            Objects.equals(this.available, quota.available) &&
            Objects.equals(this.edgeVolume, quota.edgeVolume);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, available, edgeVolume);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quota {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    edgeVolume: ").append(toIndentedString(edgeVolume)).append("\n");
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

