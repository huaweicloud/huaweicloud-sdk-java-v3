package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrinterBandwidthControlOptions
 */
public class PrinterBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "printer_bandwidth_control_value")

    private Integer printerBandwidthControlValue;

    public PrinterBandwidthControlOptions withPrinterBandwidthControlValue(Integer printerBandwidthControlValue) {
        this.printerBandwidthControlValue = printerBandwidthControlValue;
        return this;
    }

    /**
     * 打印机带宽控制量（Kbps）。取值范围为[1000-5000]。默认：2000。
     * minimum: 1000
     * maximum: 5000
     * @return printerBandwidthControlValue
     */
    public Integer getPrinterBandwidthControlValue() {
        return printerBandwidthControlValue;
    }

    public void setPrinterBandwidthControlValue(Integer printerBandwidthControlValue) {
        this.printerBandwidthControlValue = printerBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrinterBandwidthControlOptions that = (PrinterBandwidthControlOptions) obj;
        return Objects.equals(this.printerBandwidthControlValue, that.printerBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(printerBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrinterBandwidthControlOptions {\n");
        sb.append("    printerBandwidthControlValue: ")
            .append(toIndentedString(printerBandwidthControlValue))
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
