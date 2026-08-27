package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单个版本的桌面统计信息。
 */
public class DesktopVersionStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_count")

    private Integer desktopCount;

    public DesktopVersionStatistic withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 桌面版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DesktopVersionStatistic withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public DesktopVersionStatistic withDesktopCount(Integer desktopCount) {
        this.desktopCount = desktopCount;
        return this;
    }

    /**
     * 该版本下的桌面数量。
     * minimum: 0
     * maximum: 2147483647
     * @return desktopCount
     */
    public Integer getDesktopCount() {
        return desktopCount;
    }

    public void setDesktopCount(Integer desktopCount) {
        this.desktopCount = desktopCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopVersionStatistic that = (DesktopVersionStatistic) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.desktopCount, that.desktopCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, osType, desktopCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopVersionStatistic {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    desktopCount: ").append(toIndentedString(desktopCount)).append("\n");
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
