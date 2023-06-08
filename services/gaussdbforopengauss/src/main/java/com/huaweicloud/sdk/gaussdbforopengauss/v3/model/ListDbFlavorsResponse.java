package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.FlavorResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDbFlavorsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavors")
    
    private List<FlavorResult> flavors = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    

    private Integer total;

    public ListDbFlavorsResponse withFlavors(List<FlavorResult> flavors) {
        this.flavors = flavors;
        return this;
    }

    
    public ListDbFlavorsResponse addFlavorsItem(FlavorResult flavorsItem) {
        if(this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ListDbFlavorsResponse withFlavors(Consumer<List<FlavorResult>> flavorsSetter) {
        if(this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 实例规格信息。
     * @return flavors
     */
    public List<FlavorResult> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<FlavorResult> flavors) {
        this.flavors = flavors;
    }

    

    public ListDbFlavorsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 查询总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDbFlavorsResponse listDbFlavorsResponse = (ListDbFlavorsResponse) o;
        return Objects.equals(this.flavors, listDbFlavorsResponse.flavors) &&
            Objects.equals(this.total, listDbFlavorsResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavors, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbFlavorsResponse {\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

