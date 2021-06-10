package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.FreeResourcePackage;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListFreeResourcesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="free_resource_packages")
    
    private List<FreeResourcePackage> freeResourcePackages = null;
    
    public ListFreeResourcesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    public ListFreeResourcesResponse withFreeResourcePackages(List<FreeResourcePackage> freeResourcePackages) {
        this.freeResourcePackages = freeResourcePackages;
        return this;
    }

    
    public ListFreeResourcesResponse addFreeResourcePackagesItem(FreeResourcePackage freeResourcePackagesItem) {
        if(this.freeResourcePackages == null) {
            this.freeResourcePackages = new ArrayList<>();
        }
        this.freeResourcePackages.add(freeResourcePackagesItem);
        return this;
    }

    public ListFreeResourcesResponse withFreeResourcePackages(Consumer<List<FreeResourcePackage>> freeResourcePackagesSetter) {
        if(this.freeResourcePackages == null) {
            this.freeResourcePackages = new ArrayList<>();
        }
        freeResourcePackagesSetter.accept(this.freeResourcePackages);
        return this;
    }

    /**
     * 资源包信息列表。
     * @return freeResourcePackages
     */
    public List<FreeResourcePackage> getFreeResourcePackages() {
        return freeResourcePackages;
    }

    public void setFreeResourcePackages(List<FreeResourcePackage> freeResourcePackages) {
        this.freeResourcePackages = freeResourcePackages;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFreeResourcesResponse listFreeResourcesResponse = (ListFreeResourcesResponse) o;
        return Objects.equals(this.totalCount, listFreeResourcesResponse.totalCount) &&
            Objects.equals(this.freeResourcePackages, listFreeResourcesResponse.freeResourcePackages);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, freeResourcePackages);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFreeResourcesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    freeResourcePackages: ").append(toIndentedString(freeResourcePackages)).append("\n");
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

