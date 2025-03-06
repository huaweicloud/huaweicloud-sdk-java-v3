package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机规格信息。
 */
public class PhoneModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_model_name")

    private String serverModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_model_name")

    private String phoneModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private Integer disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private String resolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_spec")

    private String extendSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_capacity")

    private Integer phoneCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_label")

    private String imageLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private Integer productType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_model_version")

    private Integer phoneModelVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dpi")

    private Integer dpi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fps")

    private String fps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_mode")

    private Integer volumeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "render_fps")

    private Integer renderFps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_fps")

    private Integer streamFps;

    public PhoneModel withServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
        return this;
    }

    /**
     * 云手机服务器的规格名称，不超过64个字节。
     * @return serverModelName
     */
    public String getServerModelName() {
        return serverModelName;
    }

    public void setServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
    }

    public PhoneModel withPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
        return this;
    }

    /**
     * 云手机的规格名称，不超过64个字节。
     * @return phoneModelName
     */
    public String getPhoneModelName() {
        return phoneModelName;
    }

    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
    }

    public PhoneModel withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规格状态。 - 1 表示正常使用状态 - 0 表示已下线状态 已下线的规格不可用来购买云手机服务器
     * minimum: -128
     * maximum: 128
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public PhoneModel withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU核数。
     * minimum: -128
     * maximum: 128
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public PhoneModel withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存大小，单位：MB。
     * minimum: 0
     * maximum: 8096
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public PhoneModel withDisk(Integer disk) {
        this.disk = disk;
        return this;
    }

    /**
     * 系统存储大小，单位：GiB。
     * minimum: 0
     * maximum: 8096
     * @return disk
     */
    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public PhoneModel withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * 分辨率，不超过16个字节。
     * @return resolution
     */
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public PhoneModel withExtendSpec(String extendSpec) {
        this.extendSpec = extendSpec;
        return this;
    }

    /**
     * 扩展描述，不超过512个字节。
     * @return extendSpec
     */
    public String getExtendSpec() {
        return extendSpec;
    }

    public void setExtendSpec(String extendSpec) {
        this.extendSpec = extendSpec;
    }

    public PhoneModel withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格名称，不超过64个字节。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public PhoneModel withPhoneCapacity(Integer phoneCapacity) {
        this.phoneCapacity = phoneCapacity;
        return this;
    }

    /**
     * 当前云手机规格包含的云手机个数。
     * minimum: 0
     * maximum: 1024
     * @return phoneCapacity
     */
    public Integer getPhoneCapacity() {
        return phoneCapacity;
    }

    public void setPhoneCapacity(Integer phoneCapacity) {
        this.phoneCapacity = phoneCapacity;
    }

    public PhoneModel withImageLabel(String imageLabel) {
        this.imageLabel = imageLabel;
        return this;
    }

    /**
     * 镜像类型，只支持如下类型： - qemu_phone - cloud_phone - cloud_phone_1620 - cloud_game - cloud_game_1620
     * @return imageLabel
     */
    public String getImageLabel() {
        return imageLabel;
    }

    public void setImageLabel(String imageLabel) {
        this.imageLabel = imageLabel;
    }

    public PhoneModel withProductType(Integer productType) {
        this.productType = productType;
        return this;
    }

    /**
     * 产品类型。 - 0：云手机 - 1：云手游
     * minimum: 0
     * maximum: 1024
     * @return productType
     */
    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public PhoneModel withPhoneModelVersion(Integer phoneModelVersion) {
        this.phoneModelVersion = phoneModelVersion;
        return this;
    }

    /**
     * 规格版本： - 0：规格1.0 - 1：规格2.0
     * minimum: 0
     * maximum: 65535
     * @return phoneModelVersion
     */
    public Integer getPhoneModelVersion() {
        return phoneModelVersion;
    }

    public void setPhoneModelVersion(Integer phoneModelVersion) {
        this.phoneModelVersion = phoneModelVersion;
    }

    public PhoneModel withDpi(Integer dpi) {
        this.dpi = dpi;
        return this;
    }

    /**
     * 每英寸点数。
     * minimum: 0
     * maximum: 65535
     * @return dpi
     */
    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public PhoneModel withFps(String fps) {
        this.fps = fps;
        return this;
    }

    /**
     * 渲染帧率。
     * @return fps
     */
    public String getFps() {
        return fps;
    }

    public void setFps(String fps) {
        this.fps = fps;
    }

    public PhoneModel withVolumeMode(Integer volumeMode) {
        this.volumeMode = volumeMode;
        return this;
    }

    /**
     * 手机物理磁盘是否独立。 - 0：不独立 - 1：独立
     * minimum: 0
     * maximum: 100
     * @return volumeMode
     */
    public Integer getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(Integer volumeMode) {
        this.volumeMode = volumeMode;
    }

    public PhoneModel withRenderFps(Integer renderFps) {
        this.renderFps = renderFps;
        return this;
    }

    /**
     * 渲染帧率。
     * minimum: 0
     * maximum: 256
     * @return renderFps
     */
    public Integer getRenderFps() {
        return renderFps;
    }

    public void setRenderFps(Integer renderFps) {
        this.renderFps = renderFps;
    }

    public PhoneModel withStreamFps(Integer streamFps) {
        this.streamFps = streamFps;
        return this;
    }

    /**
     * 出流帧率。
     * minimum: 0
     * maximum: 256
     * @return streamFps
     */
    public Integer getStreamFps() {
        return streamFps;
    }

    public void setStreamFps(Integer streamFps) {
        this.streamFps = streamFps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhoneModel that = (PhoneModel) obj;
        return Objects.equals(this.serverModelName, that.serverModelName)
            && Objects.equals(this.phoneModelName, that.phoneModelName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.disk, that.disk) && Objects.equals(this.resolution, that.resolution)
            && Objects.equals(this.extendSpec, that.extendSpec) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.phoneCapacity, that.phoneCapacity)
            && Objects.equals(this.imageLabel, that.imageLabel) && Objects.equals(this.productType, that.productType)
            && Objects.equals(this.phoneModelVersion, that.phoneModelVersion) && Objects.equals(this.dpi, that.dpi)
            && Objects.equals(this.fps, that.fps) && Objects.equals(this.volumeMode, that.volumeMode)
            && Objects.equals(this.renderFps, that.renderFps) && Objects.equals(this.streamFps, that.streamFps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverModelName,
            phoneModelName,
            status,
            cpu,
            memory,
            disk,
            resolution,
            extendSpec,
            specCode,
            phoneCapacity,
            imageLabel,
            productType,
            phoneModelVersion,
            dpi,
            fps,
            volumeMode,
            renderFps,
            streamFps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneModel {\n");
        sb.append("    serverModelName: ").append(toIndentedString(serverModelName)).append("\n");
        sb.append("    phoneModelName: ").append(toIndentedString(phoneModelName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    extendSpec: ").append(toIndentedString(extendSpec)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    phoneCapacity: ").append(toIndentedString(phoneCapacity)).append("\n");
        sb.append("    imageLabel: ").append(toIndentedString(imageLabel)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    phoneModelVersion: ").append(toIndentedString(phoneModelVersion)).append("\n");
        sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
        sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
        sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
        sb.append("    renderFps: ").append(toIndentedString(renderFps)).append("\n");
        sb.append("    streamFps: ").append(toIndentedString(streamFps)).append("\n");
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
