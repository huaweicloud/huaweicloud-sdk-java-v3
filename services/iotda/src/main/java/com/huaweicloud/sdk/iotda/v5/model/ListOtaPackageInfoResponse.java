package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListOtaPackageInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packages")

    private List<OtaPackageInfo> packages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private PageInfo page;

    public ListOtaPackageInfoResponse withPackages(List<OtaPackageInfo> packages) {
        this.packages = packages;
        return this;
    }

    public ListOtaPackageInfoResponse addPackagesItem(OtaPackageInfo packagesItem) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        this.packages.add(packagesItem);
        return this;
    }

    public ListOtaPackageInfoResponse withPackages(Consumer<List<OtaPackageInfo>> packagesSetter) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        packagesSetter.accept(this.packages);
        return this;
    }

    /**
     * 升级包列表
     * @return packages
     */
    public List<OtaPackageInfo> getPackages() {
        return packages;
    }

    public void setPackages(List<OtaPackageInfo> packages) {
        this.packages = packages;
    }

    public ListOtaPackageInfoResponse withPage(PageInfo page) {
        this.page = page;
        return this;
    }

    public ListOtaPackageInfoResponse withPage(Consumer<PageInfo> pageSetter) {
        if (this.page == null) {
            this.page = new PageInfo();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public PageInfo getPage() {
        return page;
    }

    public void setPage(PageInfo page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOtaPackageInfoResponse that = (ListOtaPackageInfoResponse) obj;
        return Objects.equals(this.packages, that.packages) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packages, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOtaPackageInfoResponse {\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
