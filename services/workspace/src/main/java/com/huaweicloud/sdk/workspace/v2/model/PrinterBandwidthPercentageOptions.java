package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrinterBandwidthPercentageOptions
 */
public class PrinterBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "printer_bandwidth_percentage_value")

    private Integer printerBandwidthPercentageValue;

    public PrinterBandwidthPercentageOptions withPrinterBandwidthPercentageValue(
        Integer printerBandwidthPercentageValue) {
        this.printerBandwidthPercentageValue = printerBandwidthPercentageValue;
        return this;
    }

    /**
     * 打印机带宽百分比控制量（%）。取值范围为[0-100]。默认：5。
     * minimum: 0
     * maximum: 100
     * @return printerBandwidthPercentageValue
     */
    public Integer getPrinterBandwidthPercentageValue() {
        return printerBandwidthPercentageValue;
    }

    public void setPrinterBandwidthPercentageValue(Integer printerBandwidthPercentageValue) {
        this.printerBandwidthPercentageValue = printerBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrinterBandwidthPercentageOptions that = (PrinterBandwidthPercentageOptions) obj;
        return Objects.equals(this.printerBandwidthPercentageValue, that.printerBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(printerBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrinterBandwidthPercentageOptions {\n");
        sb.append("    printerBandwidthPercentageValue: ")
            .append(toIndentedString(printerBandwidthPercentageValue))
            .append("\n");
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
