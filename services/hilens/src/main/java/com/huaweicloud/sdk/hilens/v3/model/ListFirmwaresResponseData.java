package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 固件详情
 */
public class ListFirmwaresResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_type")

    private String versionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_whitelist")

    private List<String> firmwareWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "series")

    private String series;

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
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ListFirmwaresResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 固件id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListFirmwaresResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 固件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListFirmwaresResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 固件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListFirmwaresResponseData withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 固件版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListFirmwaresResponseData withVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * 固件版本类型
     * @return versionType
     */
    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public ListFirmwaresResponseData withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 固件到期时间
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ListFirmwaresResponseData withFirmwareWhitelist(List<String> firmwareWhitelist) {
        this.firmwareWhitelist = firmwareWhitelist;
        return this;
    }

    public ListFirmwaresResponseData addFirmwareWhitelistItem(String firmwareWhitelistItem) {
        if (this.firmwareWhitelist == null) {
            this.firmwareWhitelist = new ArrayList<>();
        }
        this.firmwareWhitelist.add(firmwareWhitelistItem);
        return this;
    }

    public ListFirmwaresResponseData withFirmwareWhitelist(Consumer<List<String>> firmwareWhitelistSetter) {
        if (this.firmwareWhitelist == null) {
            this.firmwareWhitelist = new ArrayList<>();
        }
        firmwareWhitelistSetter.accept(this.firmwareWhitelist);
        return this;
    }

    /**
     * 固件白名单
     * @return firmwareWhitelist
     */
    public List<String> getFirmwareWhitelist() {
        return firmwareWhitelist;
    }

    public void setFirmwareWhitelist(List<String> firmwareWhitelist) {
        this.firmwareWhitelist = firmwareWhitelist;
    }

    public ListFirmwaresResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 固件类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListFirmwaresResponseData withSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * 产品系列
     * @return series
     */
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public ListFirmwaresResponseData withDeviceType(String deviceType) {
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

    public ListFirmwaresResponseData withArch(String arch) {
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

    public ListFirmwaresResponseData withOsName(String osName) {
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

    public ListFirmwaresResponseData withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 边缘节点操作系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListFirmwaresResponseData withOsVersion(String osVersion) {
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

    public ListFirmwaresResponseData withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 当前固件大小(单位:byte)
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ListFirmwaresResponseData withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间毫秒数
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListFirmwaresResponseData withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间毫秒数
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFirmwaresResponseData listFirmwaresResponseData = (ListFirmwaresResponseData) o;
        return Objects.equals(this.id, listFirmwaresResponseData.id)
            && Objects.equals(this.name, listFirmwaresResponseData.name)
            && Objects.equals(this.description, listFirmwaresResponseData.description)
            && Objects.equals(this.version, listFirmwaresResponseData.version)
            && Objects.equals(this.versionType, listFirmwaresResponseData.versionType)
            && Objects.equals(this.expireTime, listFirmwaresResponseData.expireTime)
            && Objects.equals(this.firmwareWhitelist, listFirmwaresResponseData.firmwareWhitelist)
            && Objects.equals(this.type, listFirmwaresResponseData.type)
            && Objects.equals(this.series, listFirmwaresResponseData.series)
            && Objects.equals(this.deviceType, listFirmwaresResponseData.deviceType)
            && Objects.equals(this.arch, listFirmwaresResponseData.arch)
            && Objects.equals(this.osName, listFirmwaresResponseData.osName)
            && Objects.equals(this.osType, listFirmwaresResponseData.osType)
            && Objects.equals(this.osVersion, listFirmwaresResponseData.osVersion)
            && Objects.equals(this.size, listFirmwaresResponseData.size)
            && Objects.equals(this.createTime, listFirmwaresResponseData.createTime)
            && Objects.equals(this.updateTime, listFirmwaresResponseData.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            version,
            versionType,
            expireTime,
            firmwareWhitelist,
            type,
            series,
            deviceType,
            arch,
            osName,
            osType,
            osVersion,
            size,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFirmwaresResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    firmwareWhitelist: ").append(toIndentedString(firmwareWhitelist)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
