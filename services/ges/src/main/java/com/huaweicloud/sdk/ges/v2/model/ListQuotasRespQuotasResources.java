package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListQuotasRespQuotasResources
 */
public class ListQuotasRespQuotasResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available")

    private Integer available;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_volume")

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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQuotasRespQuotasResources that = (ListQuotasRespQuotasResources) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.available, that.available)
            && Objects.equals(this.edgeVolume, that.edgeVolume);
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
