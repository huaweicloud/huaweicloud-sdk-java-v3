package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListResourcePackagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_resource_packages")

    private List<DesktopResourcePackage> desktopResourcePackages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListResourcePackagesResponse withDesktopResourcePackages(
        List<DesktopResourcePackage> desktopResourcePackages) {
        this.desktopResourcePackages = desktopResourcePackages;
        return this;
    }

    public ListResourcePackagesResponse addDesktopResourcePackagesItem(
        DesktopResourcePackage desktopResourcePackagesItem) {
        if (this.desktopResourcePackages == null) {
            this.desktopResourcePackages = new ArrayList<>();
        }
        this.desktopResourcePackages.add(desktopResourcePackagesItem);
        return this;
    }

    public ListResourcePackagesResponse withDesktopResourcePackages(
        Consumer<List<DesktopResourcePackage>> desktopResourcePackagesSetter) {
        if (this.desktopResourcePackages == null) {
            this.desktopResourcePackages = new ArrayList<>();
        }
        desktopResourcePackagesSetter.accept(this.desktopResourcePackages);
        return this;
    }

    /**
     * 资源包列表。
     * @return desktopResourcePackages
     */
    public List<DesktopResourcePackage> getDesktopResourcePackages() {
        return desktopResourcePackages;
    }

    public void setDesktopResourcePackages(List<DesktopResourcePackage> desktopResourcePackages) {
        this.desktopResourcePackages = desktopResourcePackages;
    }

    public ListResourcePackagesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourcePackagesResponse that = (ListResourcePackagesResponse) obj;
        return Objects.equals(this.desktopResourcePackages, that.desktopResourcePackages)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopResourcePackages, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourcePackagesResponse {\n");
        sb.append("    desktopResourcePackages: ").append(toIndentedString(desktopResourcePackages)).append("\n");
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
