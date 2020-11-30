package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.UsageType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListUsageTypesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage_types")
    
    private List<UsageType> usageTypes = null;
    
    public ListUsageTypesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：总条数，必须大于等于0。| |参数的约束及描述：总条数，必须大于等于0。|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListUsageTypesResponse withUsageTypes(List<UsageType> usageTypes) {
        this.usageTypes = usageTypes;
        return this;
    }

    
    public ListUsageTypesResponse addUsageTypesItem(UsageType usageTypesItem) {
        if (this.usageTypes == null) {
            this.usageTypes = new ArrayList<>();
        }
        this.usageTypes.add(usageTypesItem);
        return this;
    }

    public ListUsageTypesResponse withUsageTypes(Consumer<List<UsageType>> usageTypesSetter) {
        if(this.usageTypes == null ){
            this.usageTypes = new ArrayList<>();
        }
        usageTypesSetter.accept(this.usageTypes);
        return this;
    }

    /**
     * |参数名称：用量类型列表| |参数约束以及描述：用量类型列表|
     * @return usageTypes
     */
    public List<UsageType> getUsageTypes() {
        return usageTypes;
    }

    public void setUsageTypes(List<UsageType> usageTypes) {
        this.usageTypes = usageTypes;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUsageTypesResponse listUsageTypesResponse = (ListUsageTypesResponse) o;
        return Objects.equals(this.totalCount, listUsageTypesResponse.totalCount) &&
            Objects.equals(this.usageTypes, listUsageTypesResponse.usageTypes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, usageTypes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsageTypesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    usageTypes: ").append(toIndentedString(usageTypes)).append("\n");
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

