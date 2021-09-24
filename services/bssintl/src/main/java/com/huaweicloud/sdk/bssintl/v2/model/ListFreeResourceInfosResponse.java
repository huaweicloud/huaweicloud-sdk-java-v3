package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListFreeResourceInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_packages")

    private List<FreeResourcePackageV3> freeResourcePackages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListFreeResourceInfosResponse withFreeResourcePackages(List<FreeResourcePackageV3> freeResourcePackages) {
        this.freeResourcePackages = freeResourcePackages;
        return this;
    }

    public ListFreeResourceInfosResponse addFreeResourcePackagesItem(FreeResourcePackageV3 freeResourcePackagesItem) {
        if (this.freeResourcePackages == null) {
            this.freeResourcePackages = new ArrayList<>();
        }
        this.freeResourcePackages.add(freeResourcePackagesItem);
        return this;
    }

    public ListFreeResourceInfosResponse withFreeResourcePackages(
        Consumer<List<FreeResourcePackageV3>> freeResourcePackagesSetter) {
        if (this.freeResourcePackages == null) {
            this.freeResourcePackages = new ArrayList<>();
        }
        freeResourcePackagesSetter.accept(this.freeResourcePackages);
        return this;
    }

    /** |参数名称：调账记录列表| |参数约束以及描述：调账记录列表|
     * 
     * @return freeResourcePackages */
    public List<FreeResourcePackageV3> getFreeResourcePackages() {
        return freeResourcePackages;
    }

    public void setFreeResourcePackages(List<FreeResourcePackageV3> freeResourcePackages) {
        this.freeResourcePackages = freeResourcePackages;
    }

    public ListFreeResourceInfosResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** |参数名称：总条数| |参数的约束及描述：总条数|
     * 
     * @return totalCount */
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
        ListFreeResourceInfosResponse listFreeResourceInfosResponse = (ListFreeResourceInfosResponse) o;
        return Objects.equals(this.freeResourcePackages, listFreeResourceInfosResponse.freeResourcePackages)
            && Objects.equals(this.totalCount, listFreeResourceInfosResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeResourcePackages, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFreeResourceInfosResponse {\n");
        sb.append("    freeResourcePackages: ").append(toIndentedString(freeResourcePackages)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
