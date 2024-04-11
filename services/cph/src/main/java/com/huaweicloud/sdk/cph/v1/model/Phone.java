package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云手机信息。
 */
public class Phone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_name")

    private String phoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_id")

    private String phoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_model_name")

    private String phoneModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnc_enable")

    private String vncEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imei")

    private String imei;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_type")

    private String trafficType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_mode")

    private Integer volumeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PhoneMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public Phone withPhoneName(String phoneName) {
        this.phoneName = phoneName;
        return this;
    }

    /**
     * 云手机的名称，不超过65个字符。
     * @return phoneName
     */
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Phone withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机所在的服务器ID，不超过32个字节。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public Phone withPhoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    /**
     * 云手机的唯一标识，不超过32个字节。
     * @return phoneId
     */
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public Phone withPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
        return this;
    }

    /**
     * 云手机规格名称，不超过64个字节。
     * @return phoneModelName
     */
    public String getPhoneModelName() {
        return phoneModelName;
    }

    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
    }

    public Phone withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 云手机镜像ID，不超过32个字节。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Phone withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * 镜像版本。
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public Phone withVncEnable(String vncEnable) {
        this.vncEnable = vncEnable;
        return this;
    }

    /**
     * 云手机是否开启VNC服务。 - true：开启 - false：不开启
     * @return vncEnable
     */
    public String getVncEnable() {
        return vncEnable;
    }

    public void setVncEnable(String vncEnable) {
        this.vncEnable = vncEnable;
    }

    public Phone withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 云手机状态。 - 0: 创建中 - 1：创建中 - 2：运行中 - 3：重置中 - 4：重启中 - 6：冻结 - 7：正在关机 - 8：已关机 - -5：重置失败 - -6：重启失败 - -7：手机异常 - -8：创建失败 - -9：关机失败
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

    public Phone withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 云手机类型。 - 0：普通云手机 - 1：试玩云手机
     * minimum: -128
     * maximum: 128
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Phone withImei(String imei) {
        this.imei = imei;
        return this;
    }

    /**
     * imei码。
     * @return imei
     */
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Phone withTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * 手机路由类型。 - direct：默认路由 - routing：路由到编码容器
     * @return trafficType
     */
    public String getTrafficType() {
        return trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    public Phone withVolumeMode(Integer volumeMode) {
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

    public Phone withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 云手机服务器所在的可用区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Phone withMetadata(PhoneMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Phone withMetadata(Consumer<PhoneMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PhoneMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public PhoneMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PhoneMetadata metadata) {
        this.metadata = metadata;
    }

    public Phone withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间， 时间格式为UTC。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Phone withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间， 时间格式为UTC。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Phone that = (Phone) obj;
        return Objects.equals(this.phoneName, that.phoneName) && Objects.equals(this.serverId, that.serverId)
            && Objects.equals(this.phoneId, that.phoneId) && Objects.equals(this.phoneModelName, that.phoneModelName)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.vncEnable, that.vncEnable) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type) && Objects.equals(this.imei, that.imei)
            && Objects.equals(this.trafficType, that.trafficType) && Objects.equals(this.volumeMode, that.volumeMode)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneName,
            serverId,
            phoneId,
            phoneModelName,
            imageId,
            imageVersion,
            vncEnable,
            status,
            type,
            imei,
            trafficType,
            volumeMode,
            availabilityZone,
            metadata,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Phone {\n");
        sb.append("    phoneName: ").append(toIndentedString(phoneName)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
        sb.append("    phoneModelName: ").append(toIndentedString(phoneModelName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    vncEnable: ").append(toIndentedString(vncEnable)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
        sb.append("    trafficType: ").append(toIndentedString(trafficType)).append("\n");
        sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
