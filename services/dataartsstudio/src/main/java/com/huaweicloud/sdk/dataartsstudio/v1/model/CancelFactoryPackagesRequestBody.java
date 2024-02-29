package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CancelFactoryPackagesRequestBody
 */
public class CancelFactoryPackagesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_ids")

    private List<String> packageIds = null;

    public CancelFactoryPackagesRequestBody withPackageIds(List<String> packageIds) {
        this.packageIds = packageIds;
        return this;
    }

    public CancelFactoryPackagesRequestBody addPackageIdsItem(String packageIdsItem) {
        if (this.packageIds == null) {
            this.packageIds = new ArrayList<>();
        }
        this.packageIds.add(packageIdsItem);
        return this;
    }

    public CancelFactoryPackagesRequestBody withPackageIds(Consumer<List<String>> packageIdsSetter) {
        if (this.packageIds == null) {
            this.packageIds = new ArrayList<>();
        }
        packageIdsSetter.accept(this.packageIds);
        return this;
    }

    /**
     * 发布包id列表信息
     * @return packageIds
     */
    public List<String> getPackageIds() {
        return packageIds;
    }

    public void setPackageIds(List<String> packageIds) {
        this.packageIds = packageIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CancelFactoryPackagesRequestBody that = (CancelFactoryPackagesRequestBody) obj;
        return Objects.equals(this.packageIds, that.packageIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelFactoryPackagesRequestBody {\n");
        sb.append("    packageIds: ").append(toIndentedString(packageIds)).append("\n");
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
