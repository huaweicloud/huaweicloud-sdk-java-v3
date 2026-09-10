package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListComputeResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_package_infos")

    private List<ResourcePackageInfo> resourcePackageInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListComputeResourceResponse withResourcePackageInfos(List<ResourcePackageInfo> resourcePackageInfos) {
        this.resourcePackageInfos = resourcePackageInfos;
        return this;
    }

    public ListComputeResourceResponse addResourcePackageInfosItem(ResourcePackageInfo resourcePackageInfosItem) {
        if (this.resourcePackageInfos == null) {
            this.resourcePackageInfos = new ArrayList<>();
        }
        this.resourcePackageInfos.add(resourcePackageInfosItem);
        return this;
    }

    public ListComputeResourceResponse withResourcePackageInfos(
        Consumer<List<ResourcePackageInfo>> resourcePackageInfosSetter) {
        if (this.resourcePackageInfos == null) {
            this.resourcePackageInfos = new ArrayList<>();
        }
        resourcePackageInfosSetter.accept(this.resourcePackageInfos);
        return this;
    }

    /**
     * 资源包信息列表。
     * @return resourcePackageInfos
     */
    public List<ResourcePackageInfo> getResourcePackageInfos() {
        return resourcePackageInfos;
    }

    public void setResourcePackageInfos(List<ResourcePackageInfo> resourcePackageInfos) {
        this.resourcePackageInfos = resourcePackageInfos;
    }

    public ListComputeResourceResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总记录数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListComputeResourceResponse that = (ListComputeResourceResponse) obj;
        return Objects.equals(this.resourcePackageInfos, that.resourcePackageInfos)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourcePackageInfos, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListComputeResourceResponse {\n");
        sb.append("    resourcePackageInfos: ").append(toIndentedString(resourcePackageInfos)).append("\n");
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
