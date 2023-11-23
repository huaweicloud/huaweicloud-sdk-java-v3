package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DriverInfo
 */
public class DriverInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_name")

    private String driverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private String lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public DriverInfo withDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    /**
     * 文件名称。
     * @return driverName
     */
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public DriverInfo withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 最后修改时间。
     * @return lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public DriverInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 文件大小，单位：byte
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DriverInfo that = (DriverInfo) obj;
        return Objects.equals(this.driverName, that.driverName) && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverName, lastModified, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DriverInfo {\n");
        sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
