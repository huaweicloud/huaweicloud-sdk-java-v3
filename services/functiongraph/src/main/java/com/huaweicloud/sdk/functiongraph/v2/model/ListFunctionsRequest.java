package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListFunctionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxitems")

    private String maxitems;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    public ListFunctionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 上一次查询到的最后的记录位置。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListFunctionsRequest withMaxitems(String maxitems) {
        this.maxitems = maxitems;
        return this;
    }

    /** 每次查询获取的最大函数记录数量 最大值：400 如果不提供该值或者提供的值大于400或等于0，则使用默认值：400 如果该值小于0，则返回参数错误。
     * 
     * @return maxitems */
    public String getMaxitems() {
        return maxitems;
    }

    public void setMaxitems(String maxitems) {
        this.maxitems = maxitems;
    }

    public ListFunctionsRequest withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /** 应用名称。
     * 
     * @return packageName */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionsRequest listFunctionsRequest = (ListFunctionsRequest) o;
        return Objects.equals(this.marker, listFunctionsRequest.marker)
            && Objects.equals(this.maxitems, listFunctionsRequest.maxitems)
            && Objects.equals(this.packageName, listFunctionsRequest.packageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker, maxitems, packageName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    maxitems: ").append(toIndentedString(maxitems)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
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
