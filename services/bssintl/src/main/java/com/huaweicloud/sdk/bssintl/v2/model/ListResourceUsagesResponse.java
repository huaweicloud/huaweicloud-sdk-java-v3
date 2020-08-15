package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.PackageUsageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListResourceUsagesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="package_usage_infos")
    
    private List<PackageUsageInfo> packageUsageInfos = null;
    
    public ListResourceUsagesResponse withPackageUsageInfos(List<PackageUsageInfo> packageUsageInfos) {
        this.packageUsageInfos = packageUsageInfos;
        return this;
    }

    
    public ListResourceUsagesResponse addPackageUsageInfosItem(PackageUsageInfo packageUsageInfosItem) {
        if (this.packageUsageInfos == null) {
            this.packageUsageInfos = new ArrayList<>();
        }
        this.packageUsageInfos.add(packageUsageInfosItem);
        return this;
    }

    public ListResourceUsagesResponse withPackageUsageInfos(Consumer<List<PackageUsageInfo>> packageUsageInfosSetter) {
        if(this.packageUsageInfos == null ){
            this.packageUsageInfos = new ArrayList<>();
        }
        packageUsageInfosSetter.accept(this.packageUsageInfos);
        return this;
    }

    /**
     * |参数名称：套餐包使用量信息| |参数的约束及描述：套餐包使用量信息|
     * @return packageUsageInfos
     */
    public List<PackageUsageInfo> getPackageUsageInfos() {
        return packageUsageInfos;
    }

    public void setPackageUsageInfos(List<PackageUsageInfo> packageUsageInfos) {
        this.packageUsageInfos = packageUsageInfos;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceUsagesResponse listResourceUsagesResponse = (ListResourceUsagesResponse) o;
        return Objects.equals(this.packageUsageInfos, listResourceUsagesResponse.packageUsageInfos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(packageUsageInfos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceUsagesResponse {\n");
        sb.append("    packageUsageInfos: ").append(toIndentedString(packageUsageInfos)).append("\n");
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

