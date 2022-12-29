package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFirmwaresRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_type")

    private String deviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListFirmwaresRequest withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * 固件适用设备类型
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public ListFirmwaresRequest withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 边缘节点架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public ListFirmwaresRequest withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * 边缘设备操作系统名称
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public ListFirmwaresRequest withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 边缘设备操作系统版本
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public ListFirmwaresRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的起始位置，取值范围为非负整数，默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFirmwaresRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，取值范围1~100，默认为100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFirmwaresRequest listFirmwaresRequest = (ListFirmwaresRequest) o;
        return Objects.equals(this.deviceType, listFirmwaresRequest.deviceType)
            && Objects.equals(this.arch, listFirmwaresRequest.arch)
            && Objects.equals(this.osName, listFirmwaresRequest.osName)
            && Objects.equals(this.osVersion, listFirmwaresRequest.osVersion)
            && Objects.equals(this.offset, listFirmwaresRequest.offset)
            && Objects.equals(this.limit, listFirmwaresRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceType, arch, osName, osVersion, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFirmwaresRequest {\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
