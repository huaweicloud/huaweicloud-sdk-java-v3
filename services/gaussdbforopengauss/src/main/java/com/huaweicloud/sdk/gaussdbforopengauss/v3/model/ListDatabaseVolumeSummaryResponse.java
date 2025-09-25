package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListDatabaseVolumeSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_capacity")

    private String dataDiskCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_usage")

    private String dataDiskUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_usage_growth_per_day")

    private String spaceUsageGrowthPerDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_remaining_days")

    private String estimatedRemainingDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cn_components")

    private List<CnComponentInfoResult> cnComponents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_components")

    private List<DnComponentInfoResult> dnComponents = null;

    public ListDatabaseVolumeSummaryResponse withDataDiskCapacity(String dataDiskCapacity) {
        this.dataDiskCapacity = dataDiskCapacity;
        return this;
    }

    /**
     * **参数解释**: 数据盘总量。 **取值范围**: 不涉及。
     * @return dataDiskCapacity
     */
    public String getDataDiskCapacity() {
        return dataDiskCapacity;
    }

    public void setDataDiskCapacity(String dataDiskCapacity) {
        this.dataDiskCapacity = dataDiskCapacity;
    }

    public ListDatabaseVolumeSummaryResponse withDataDiskUsage(String dataDiskUsage) {
        this.dataDiskUsage = dataDiskUsage;
        return this;
    }

    /**
     * **参数解释**: 数据盘使用量。 **取值范围**: 不涉及。
     * @return dataDiskUsage
     */
    public String getDataDiskUsage() {
        return dataDiskUsage;
    }

    public void setDataDiskUsage(String dataDiskUsage) {
        this.dataDiskUsage = dataDiskUsage;
    }

    public ListDatabaseVolumeSummaryResponse withSpaceUsageGrowthPerDay(String spaceUsageGrowthPerDay) {
        this.spaceUsageGrowthPerDay = spaceUsageGrowthPerDay;
        return this;
    }

    /**
     * **参数解释**: 空间使用日均增长量。 **取值范围**: 不涉及。
     * @return spaceUsageGrowthPerDay
     */
    public String getSpaceUsageGrowthPerDay() {
        return spaceUsageGrowthPerDay;
    }

    public void setSpaceUsageGrowthPerDay(String spaceUsageGrowthPerDay) {
        this.spaceUsageGrowthPerDay = spaceUsageGrowthPerDay;
    }

    public ListDatabaseVolumeSummaryResponse withEstimatedRemainingDays(String estimatedRemainingDays) {
        this.estimatedRemainingDays = estimatedRemainingDays;
        return this;
    }

    /**
     * **参数解释**: 预计可用天数。 **取值范围**: 不涉及。
     * @return estimatedRemainingDays
     */
    public String getEstimatedRemainingDays() {
        return estimatedRemainingDays;
    }

    public void setEstimatedRemainingDays(String estimatedRemainingDays) {
        this.estimatedRemainingDays = estimatedRemainingDays;
    }

    public ListDatabaseVolumeSummaryResponse withCnComponents(List<CnComponentInfoResult> cnComponents) {
        this.cnComponents = cnComponents;
        return this;
    }

    public ListDatabaseVolumeSummaryResponse addCnComponentsItem(CnComponentInfoResult cnComponentsItem) {
        if (this.cnComponents == null) {
            this.cnComponents = new ArrayList<>();
        }
        this.cnComponents.add(cnComponentsItem);
        return this;
    }

    public ListDatabaseVolumeSummaryResponse withCnComponents(
        Consumer<List<CnComponentInfoResult>> cnComponentsSetter) {
        if (this.cnComponents == null) {
            this.cnComponents = new ArrayList<>();
        }
        cnComponentsSetter.accept(this.cnComponents);
        return this;
    }

    /**
     * **参数解释**: CN节点信息。
     * @return cnComponents
     */
    public List<CnComponentInfoResult> getCnComponents() {
        return cnComponents;
    }

    public void setCnComponents(List<CnComponentInfoResult> cnComponents) {
        this.cnComponents = cnComponents;
    }

    public ListDatabaseVolumeSummaryResponse withDnComponents(List<DnComponentInfoResult> dnComponents) {
        this.dnComponents = dnComponents;
        return this;
    }

    public ListDatabaseVolumeSummaryResponse addDnComponentsItem(DnComponentInfoResult dnComponentsItem) {
        if (this.dnComponents == null) {
            this.dnComponents = new ArrayList<>();
        }
        this.dnComponents.add(dnComponentsItem);
        return this;
    }

    public ListDatabaseVolumeSummaryResponse withDnComponents(
        Consumer<List<DnComponentInfoResult>> dnComponentsSetter) {
        if (this.dnComponents == null) {
            this.dnComponents = new ArrayList<>();
        }
        dnComponentsSetter.accept(this.dnComponents);
        return this;
    }

    /**
     * **参数解释**: DN节点信息。
     * @return dnComponents
     */
    public List<DnComponentInfoResult> getDnComponents() {
        return dnComponents;
    }

    public void setDnComponents(List<DnComponentInfoResult> dnComponents) {
        this.dnComponents = dnComponents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatabaseVolumeSummaryResponse that = (ListDatabaseVolumeSummaryResponse) obj;
        return Objects.equals(this.dataDiskCapacity, that.dataDiskCapacity)
            && Objects.equals(this.dataDiskUsage, that.dataDiskUsage)
            && Objects.equals(this.spaceUsageGrowthPerDay, that.spaceUsageGrowthPerDay)
            && Objects.equals(this.estimatedRemainingDays, that.estimatedRemainingDays)
            && Objects.equals(this.cnComponents, that.cnComponents)
            && Objects.equals(this.dnComponents, that.dnComponents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataDiskCapacity,
            dataDiskUsage,
            spaceUsageGrowthPerDay,
            estimatedRemainingDays,
            cnComponents,
            dnComponents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseVolumeSummaryResponse {\n");
        sb.append("    dataDiskCapacity: ").append(toIndentedString(dataDiskCapacity)).append("\n");
        sb.append("    dataDiskUsage: ").append(toIndentedString(dataDiskUsage)).append("\n");
        sb.append("    spaceUsageGrowthPerDay: ").append(toIndentedString(spaceUsageGrowthPerDay)).append("\n");
        sb.append("    estimatedRemainingDays: ").append(toIndentedString(estimatedRemainingDays)).append("\n");
        sb.append("    cnComponents: ").append(toIndentedString(cnComponents)).append("\n");
        sb.append("    dnComponents: ").append(toIndentedString(dnComponents)).append("\n");
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
