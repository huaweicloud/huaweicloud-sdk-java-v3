package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AvailableFlavorInfoResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAvailableFlavorsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavors")
    
    private List<AvailableFlavorInfoResult> flavors = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    

    private Integer totalCount;

    public ListAvailableFlavorsResponse withFlavors(List<AvailableFlavorInfoResult> flavors) {
        this.flavors = flavors;
        return this;
    }

    
    public ListAvailableFlavorsResponse addFlavorsItem(AvailableFlavorInfoResult flavorsItem) {
        if(this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ListAvailableFlavorsResponse withFlavors(Consumer<List<AvailableFlavorInfoResult>> flavorsSetter) {
        if(this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 实例可变更规格信息列表。
     * @return flavors
     */
    public List<AvailableFlavorInfoResult> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<AvailableFlavorInfoResult> flavors) {
        this.flavors = flavors;
    }

    

    public ListAvailableFlavorsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailableFlavorsResponse listAvailableFlavorsResponse = (ListAvailableFlavorsResponse) o;
        return Objects.equals(this.flavors, listAvailableFlavorsResponse.flavors) &&
            Objects.equals(this.totalCount, listAvailableFlavorsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavors, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableFlavorsResponse {\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

