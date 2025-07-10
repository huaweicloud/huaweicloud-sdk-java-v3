package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网络驱动器映射选项。
 */
public class PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_drive_mapping_path")

    private String networkDriveMappingPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drive_letter")

    private String driveLetter;

    public PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions withNetworkDriveMappingPath(
        String networkDriveMappingPath) {
        this.networkDriveMappingPath = networkDriveMappingPath;
        return this;
    }

    /**
     * 网络驱动器映射路径。
     * @return networkDriveMappingPath
     */
    public String getNetworkDriveMappingPath() {
        return networkDriveMappingPath;
    }

    public void setNetworkDriveMappingPath(String networkDriveMappingPath) {
        this.networkDriveMappingPath = networkDriveMappingPath;
    }

    public PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions withDriveLetter(String driveLetter) {
        this.driveLetter = driveLetter;
        return this;
    }

    /**
     * 排除文件夹路径。
     * @return driveLetter
     */
    public String getDriveLetter() {
        return driveLetter;
    }

    public void setDriveLetter(String driveLetter) {
        this.driveLetter = driveLetter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions that =
            (PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions) obj;
        return Objects.equals(this.networkDriveMappingPath, that.networkDriveMappingPath)
            && Objects.equals(this.driveLetter, that.driveLetter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkDriveMappingPath, driveLetter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPersonalizedDataMgmtNetworkDriveMappingOptions {\n");
        sb.append("    networkDriveMappingPath: ").append(toIndentedString(networkDriveMappingPath)).append("\n");
        sb.append("    driveLetter: ").append(toIndentedString(driveLetter)).append("\n");
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
