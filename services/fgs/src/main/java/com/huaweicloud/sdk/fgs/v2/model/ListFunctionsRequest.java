package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListFunctionsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maxitems")
    
    private String maxitems;

    public ListFunctionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListFunctionsRequest withMaxitems(String maxitems) {
        this.maxitems = maxitems;
        return this;
    }

    


    /**
     * Get maxitems
     * @return maxitems
     */
    public String getMaxitems() {
        return maxitems;
    }

    public void setMaxitems(String maxitems) {
        this.maxitems = maxitems;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionsRequest listFunctionsRequest = (ListFunctionsRequest) o;
        return Objects.equals(this.marker, listFunctionsRequest.marker) &&
            Objects.equals(this.maxitems, listFunctionsRequest.maxitems);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marker, maxitems);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionsRequest {\n");
            sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
            sb.append("    maxitems: ").append(toIndentedString(maxitems)).append("\n");
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

