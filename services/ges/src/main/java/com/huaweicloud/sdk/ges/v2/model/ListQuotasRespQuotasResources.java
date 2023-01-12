package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListQuotasRespQuotasResources
 */
public class ListQuotasRespQuotasResources  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available")
    
    
    private Integer available;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_volume")
    
    
    private Integer edgeVolume;

    public ListQuotasRespQuotasResources withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类型。  取值范围：  - \"graph\" - \"backup\" - \"metadata\"
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListQuotasRespQuotasResources withAvailable(Integer available) {
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

    

    public ListQuotasRespQuotasResources withEdgeVolume(Integer edgeVolume) {
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
        ListQuotasRespQuotasResources listQuotasRespQuotasResources = (ListQuotasRespQuotasResources) o;
        return Objects.equals(this.type, listQuotasRespQuotasResources.type) &&
            Objects.equals(this.available, listQuotasRespQuotasResources.available) &&
            Objects.equals(this.edgeVolume, listQuotasRespQuotasResources.edgeVolume);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, available, edgeVolume);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotasRespQuotasResources {\n");
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

