package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteRoutetableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable_id")

    @JacksonXmlProperty(localName = "routetable_id")

    private String routetableId;

    public DeleteRoutetableRequest withRoutetableId(String routetableId) {
        this.routetableId = routetableId;
        return this;
    }

    /**
     * 路由表ID
     * @return routetableId
     */
    public String getRoutetableId() {
        return routetableId;
    }

    public void setRoutetableId(String routetableId) {
        this.routetableId = routetableId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteRoutetableRequest deleteRoutetableRequest = (DeleteRoutetableRequest) o;
        return Objects.equals(this.routetableId, deleteRoutetableRequest.routetableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetableId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRoutetableRequest {\n");
        sb.append("    routetableId: ").append(toIndentedString(routetableId)).append("\n");
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
