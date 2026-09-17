package com.huaweicloud.sdk.das.v3.model;

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
public class ListRisksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_code")

    private String metricCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_metric_codes")

    private List<String> displayMetricCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_names")

    private List<String> metricNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "units")

    private List<String> units = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<RiskInfo> items = null;

    public ListRisksResponse withMetricCode(String metricCode) {
        this.metricCode = metricCode;
        return this;
    }

    /**
     * 指标名
     * @return metricCode
     */
    public String getMetricCode() {
        return metricCode;
    }

    public void setMetricCode(String metricCode) {
        this.metricCode = metricCode;
    }

    public ListRisksResponse withDisplayMetricCodes(List<String> displayMetricCodes) {
        this.displayMetricCodes = displayMetricCodes;
        return this;
    }

    public ListRisksResponse addDisplayMetricCodesItem(String displayMetricCodesItem) {
        if (this.displayMetricCodes == null) {
            this.displayMetricCodes = new ArrayList<>();
        }
        this.displayMetricCodes.add(displayMetricCodesItem);
        return this;
    }

    public ListRisksResponse withDisplayMetricCodes(Consumer<List<String>> displayMetricCodesSetter) {
        if (this.displayMetricCodes == null) {
            this.displayMetricCodes = new ArrayList<>();
        }
        displayMetricCodesSetter.accept(this.displayMetricCodes);
        return this;
    }

    /**
     * 指标展示名称
     * @return displayMetricCodes
     */
    public List<String> getDisplayMetricCodes() {
        return displayMetricCodes;
    }

    public void setDisplayMetricCodes(List<String> displayMetricCodes) {
        this.displayMetricCodes = displayMetricCodes;
    }

    public ListRisksResponse withMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public ListRisksResponse addMetricNamesItem(String metricNamesItem) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        this.metricNames.add(metricNamesItem);
        return this;
    }

    public ListRisksResponse withMetricNames(Consumer<List<String>> metricNamesSetter) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        metricNamesSetter.accept(this.metricNames);
        return this;
    }

    /**
     * 指标名称
     * @return metricNames
     */
    public List<String> getMetricNames() {
        return metricNames;
    }

    public void setMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
    }

    public ListRisksResponse withUnits(List<String> units) {
        this.units = units;
        return this;
    }

    public ListRisksResponse addUnitsItem(String unitsItem) {
        if (this.units == null) {
            this.units = new ArrayList<>();
        }
        this.units.add(unitsItem);
        return this;
    }

    public ListRisksResponse withUnits(Consumer<List<String>> unitsSetter) {
        if (this.units == null) {
            this.units = new ArrayList<>();
        }
        unitsSetter.accept(this.units);
        return this;
    }

    /**
     * 单位
     * @return units
     */
    public List<String> getUnits() {
        return units;
    }

    public void setUnits(List<String> units) {
        this.units = units;
    }

    public ListRisksResponse withItems(List<RiskInfo> items) {
        this.items = items;
        return this;
    }

    public ListRisksResponse addItemsItem(RiskInfo itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListRisksResponse withItems(Consumer<List<RiskInfo>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 风险实例列表
     * @return items
     */
    public List<RiskInfo> getItems() {
        return items;
    }

    public void setItems(List<RiskInfo> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRisksResponse that = (ListRisksResponse) obj;
        return Objects.equals(this.metricCode, that.metricCode)
            && Objects.equals(this.displayMetricCodes, that.displayMetricCodes)
            && Objects.equals(this.metricNames, that.metricNames) && Objects.equals(this.units, that.units)
            && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricCode, displayMetricCodes, metricNames, units, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRisksResponse {\n");
        sb.append("    metricCode: ").append(toIndentedString(metricCode)).append("\n");
        sb.append("    displayMetricCodes: ").append(toIndentedString(displayMetricCodes)).append("\n");
        sb.append("    metricNames: ").append(toIndentedString(metricNames)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
