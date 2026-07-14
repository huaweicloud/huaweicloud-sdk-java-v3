package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 模型&amp;权重文件和代码存储挂载配置。
 */
public class FileResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_cache")

    private Boolean hostCache;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "efs_sub_path")

    private String efsSubPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    private Boolean readOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_warm_up")

    private Boolean osWarmUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    public FileResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释：** 代码来源类别。 **取值范围：** - OBS：对象存储服务。 - OBSFS：OBS的文件系统接口。 - EFS：弹性文件服务。 - LOCAL：挂载宿主机本地存储目录。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public FileResponse withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数解释：** 代码来源地址，格式遵循不同存储系统。 **取值范围：** 不涉及。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FileResponse withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释：** 挂载到容器内的路径。 **约束限制：** 不涉及。 **取值范围：** 以(/)开头和结尾，可包含字母、数字、中划线、下划线，整个挂载路径长度不能超过255位。 **默认取值：** 不涉及。
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public FileResponse withHostCache(Boolean hostCache) {
        this.hostCache = hostCache;
        return this;
    }

    /**
     * **参数解释：** 是否支持模型本地缓存，默认是不支持。 **取值范围：** - true：支持。 - false：不支持。
     * @return hostCache
     */
    public Boolean getHostCache() {
        return hostCache;
    }

    public void setHostCache(Boolean hostCache) {
        this.hostCache = hostCache;
    }

    public FileResponse withEfsSubPath(String efsSubPath) {
        this.efsSubPath = efsSubPath;
        return this;
    }

    /**
     * **参数解释：** 当存储类别为EFS时，支持配置子目录。 **取值范围：** 不涉及。
     * @return efsSubPath
     */
    public String getEfsSubPath() {
        return efsSubPath;
    }

    public void setEfsSubPath(String efsSubPath) {
        this.efsSubPath = efsSubPath;
    }

    public FileResponse withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * **参数解释：** 挂载权限设置，是否只读。 **取值范围：** - true：只读。 - false：非只读。
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public FileResponse withOsWarmUp(Boolean osWarmUp) {
        this.osWarmUp = osWarmUp;
        return this;
    }

    /**
     * **参数解释：** OS预热。 **取值范围：** - true：预热。 - false：不预热。
     * @return osWarmUp
     */
    public Boolean getOsWarmUp() {
        return osWarmUp;
    }

    public void setOsWarmUp(Boolean osWarmUp) {
        this.osWarmUp = osWarmUp;
    }

    public FileResponse withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * **参数解释：** 预热名称。 **约束限制：** os_warm_up为true时必填。 **取值范围：** 支持1-64位字符，可包含字母、中文、数字、中划线、下划线。 **默认取值：** 不涉及。
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileResponse that = (FileResponse) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.address, that.address)
            && Objects.equals(this.mountPath, that.mountPath) && Objects.equals(this.hostCache, that.hostCache)
            && Objects.equals(this.efsSubPath, that.efsSubPath) && Objects.equals(this.readOnly, that.readOnly)
            && Objects.equals(this.osWarmUp, that.osWarmUp) && Objects.equals(this.sourceName, that.sourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, address, mountPath, hostCache, efsSubPath, readOnly, osWarmUp, sourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileResponse {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
        sb.append("    hostCache: ").append(toIndentedString(hostCache)).append("\n");
        sb.append("    efsSubPath: ").append(toIndentedString(efsSubPath)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    osWarmUp: ").append(toIndentedString(osWarmUp)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
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
