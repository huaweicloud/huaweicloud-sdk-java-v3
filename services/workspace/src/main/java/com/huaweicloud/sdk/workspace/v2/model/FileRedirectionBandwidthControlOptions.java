package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FileRedirectionBandwidthControlOptions
 */
public class FileRedirectionBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_redirection_bandwidth_control_value")

    private Integer fileRedirectionBandwidthControlValue;

    public FileRedirectionBandwidthControlOptions withFileRedirectionBandwidthControlValue(
        Integer fileRedirectionBandwidthControlValue) {
        this.fileRedirectionBandwidthControlValue = fileRedirectionBandwidthControlValue;
        return this;
    }

    /**
     * 文件重定向带宽控制量（Kbps）。取值范围为[500-20000]。默认：10000。
     * minimum: 500
     * maximum: 20000
     * @return fileRedirectionBandwidthControlValue
     */
    public Integer getFileRedirectionBandwidthControlValue() {
        return fileRedirectionBandwidthControlValue;
    }

    public void setFileRedirectionBandwidthControlValue(Integer fileRedirectionBandwidthControlValue) {
        this.fileRedirectionBandwidthControlValue = fileRedirectionBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileRedirectionBandwidthControlOptions that = (FileRedirectionBandwidthControlOptions) obj;
        return Objects.equals(this.fileRedirectionBandwidthControlValue, that.fileRedirectionBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileRedirectionBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileRedirectionBandwidthControlOptions {\n");
        sb.append("    fileRedirectionBandwidthControlValue: ")
            .append(toIndentedString(fileRedirectionBandwidthControlValue))
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
