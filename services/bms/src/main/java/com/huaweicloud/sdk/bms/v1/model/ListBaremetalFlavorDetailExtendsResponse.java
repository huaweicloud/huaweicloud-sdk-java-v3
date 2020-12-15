package com.huaweicloud.sdk.bms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.FlavorsResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBaremetalFlavorDetailExtendsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavors")
    
    private List<FlavorsResp> flavors = null;
    
    public ListBaremetalFlavorDetailExtendsResponse withFlavors(List<FlavorsResp> flavors) {
        this.flavors = flavors;
        return this;
    }

    
    public ListBaremetalFlavorDetailExtendsResponse addFlavorsItem(FlavorsResp flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ListBaremetalFlavorDetailExtendsResponse withFlavors(Consumer<List<FlavorsResp>> flavorsSetter) {
        if(this.flavors == null ){
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 裸金属服务器规格列表，详情请参见表2 flavors数据结构说明。
     * @return flavors
     */
    public List<FlavorsResp> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<FlavorsResp> flavors) {
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
        ListBaremetalFlavorDetailExtendsResponse listBaremetalFlavorDetailExtendsResponse = (ListBaremetalFlavorDetailExtendsResponse) o;
        return Objects.equals(this.flavors, listBaremetalFlavorDetailExtendsResponse.flavors);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavors);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBaremetalFlavorDetailExtendsResponse {\n");
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

