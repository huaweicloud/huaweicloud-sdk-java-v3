package com.huaweicloud.sdk.ddm.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.ComputeFlavorGroupsInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListFlavorsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="computeFlavorGroups")
    
    private List<ComputeFlavorGroupsInfo> computeFlavorGroups = null;
    
    public ListFlavorsResponse withComputeFlavorGroups(List<ComputeFlavorGroupsInfo> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
        return this;
    }

    
    public ListFlavorsResponse addComputeFlavorGroupsItem(ComputeFlavorGroupsInfo computeFlavorGroupsItem) {
        if(this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        this.computeFlavorGroups.add(computeFlavorGroupsItem);
        return this;
    }

    public ListFlavorsResponse withComputeFlavorGroups(Consumer<List<ComputeFlavorGroupsInfo>> computeFlavorGroupsSetter) {
        if(this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        computeFlavorGroupsSetter.accept(this.computeFlavorGroups);
        return this;
    }

    /**
     * 计算类型规格组。
     * @return computeFlavorGroups
     */
    public List<ComputeFlavorGroupsInfo> getComputeFlavorGroups() {
        return computeFlavorGroups;
    }

    public void setComputeFlavorGroups(List<ComputeFlavorGroupsInfo> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
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
        return Objects.equals(this.computeFlavorGroups, listFlavorsResponse.computeFlavorGroups);
    }
    @Override
    public int hashCode() {
        return Objects.hash(computeFlavorGroups);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsResponse {\n");
        sb.append("    computeFlavorGroups: ").append(toIndentedString(computeFlavorGroups)).append("\n");
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

