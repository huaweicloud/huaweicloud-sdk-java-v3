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
public class ListHourPackagesTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour_packages")

    private List<HourPackage> hourPackages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListHourPackagesTypeResponse withHourPackages(List<HourPackage> hourPackages) {
        this.hourPackages = hourPackages;
        return this;
    }

    public ListHourPackagesTypeResponse addHourPackagesItem(HourPackage hourPackagesItem) {
        if (this.hourPackages == null) {
            this.hourPackages = new ArrayList<>();
        }
        this.hourPackages.add(hourPackagesItem);
        return this;
    }

    public ListHourPackagesTypeResponse withHourPackages(Consumer<List<HourPackage>> hourPackagesSetter) {
        if (this.hourPackages == null) {
            this.hourPackages = new ArrayList<>();
        }
        hourPackagesSetter.accept(this.hourPackages);
        return this;
    }

    /**
     * 可订购小时包类型列表。
     * @return hourPackages
     */
    public List<HourPackage> getHourPackages() {
        return hourPackages;
    }

    public void setHourPackages(List<HourPackage> hourPackages) {
        this.hourPackages = hourPackages;
    }

    public ListHourPackagesTypeResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 云桌面支持的可用分区列表总数。
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
        ListHourPackagesTypeResponse that = (ListHourPackagesTypeResponse) obj;
        return Objects.equals(this.hourPackages, that.hourPackages) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourPackages, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHourPackagesTypeResponse {\n");
        sb.append("    hourPackages: ").append(toIndentedString(hourPackages)).append("\n");
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
