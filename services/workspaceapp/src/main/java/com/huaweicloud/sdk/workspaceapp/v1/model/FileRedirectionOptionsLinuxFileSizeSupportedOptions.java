package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Linux支持设置文件大小控制项。
 */
public class FileRedirectionOptionsLinuxFileSizeSupportedOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_file_size_supported_threshold")

    private Integer linuxFileSizeSupportedThreshold;

    public FileRedirectionOptionsLinuxFileSizeSupportedOptions withLinuxFileSizeSupportedThreshold(
        Integer linuxFileSizeSupportedThreshold) {
        this.linuxFileSizeSupportedThreshold = linuxFileSizeSupportedThreshold;
        return this;
    }

    /**
     * Linux设置文件大小阈值（Byte）。取值范围为[0-4096]。默认：100。
     * minimum: 0
     * maximum: 4096
     * @return linuxFileSizeSupportedThreshold
     */
    public Integer getLinuxFileSizeSupportedThreshold() {
        return linuxFileSizeSupportedThreshold;
    }

    public void setLinuxFileSizeSupportedThreshold(Integer linuxFileSizeSupportedThreshold) {
        this.linuxFileSizeSupportedThreshold = linuxFileSizeSupportedThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileRedirectionOptionsLinuxFileSizeSupportedOptions that =
            (FileRedirectionOptionsLinuxFileSizeSupportedOptions) obj;
        return Objects.equals(this.linuxFileSizeSupportedThreshold, that.linuxFileSizeSupportedThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linuxFileSizeSupportedThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileRedirectionOptionsLinuxFileSizeSupportedOptions {\n");
        sb.append("    linuxFileSizeSupportedThreshold: ")
            .append(toIndentedString(linuxFileSizeSupportedThreshold))
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
