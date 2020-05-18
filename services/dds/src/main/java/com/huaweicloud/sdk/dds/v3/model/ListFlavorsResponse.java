package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.ListFlavorsResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListFlavorsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavors")
    
    private List<ListFlavorsResult> flavors = null;
    
    public ListFlavorsResponse withFlavors(List<ListFlavorsResult> flavors) {
        this.flavors = flavors;
        return this;
    }

    
    public ListFlavorsResponse addFlavorsItem(ListFlavorsResult flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ListFlavorsResponse withFlavors(Consumer<List<ListFlavorsResult>> flavorsSetter) {
        if(this.flavors == null ){
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 实例规格信息列表。
     * @return flavors
     */
    public List<ListFlavorsResult> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<ListFlavorsResult> flavors) {
        this.flavors = flavors;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorsResponse listFlavorsResponse = (ListFlavorsResponse) o;
        return Objects.equals(this.flavors, listFlavorsResponse.flavors);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavors);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsResponse {\n");
            sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
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

