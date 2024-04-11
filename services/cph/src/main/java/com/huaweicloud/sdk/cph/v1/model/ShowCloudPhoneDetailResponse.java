package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCloudPhoneDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

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
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnc_enable")

    private String vncEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_model_name")

    private String phoneModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_infos")

    private List<PhoneAccessInfo> accessInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ShowCloudPhoneDetailResponseBodyMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_data_volume")

    private PhoneDataVolume phoneDataVolume;

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
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ShowCloudPhoneDetailResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID，不超过32个字节。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowCloudPhoneDetailResponse withPhoneName(String phoneName) {
        this.phoneName = phoneName;
        return this;
    }

    /**
     * 云手机名称，不超过65个字符。
     * @return phoneName
     */
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public ShowCloudPhoneDetailResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机服务器ID，不超过32个字节。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ShowCloudPhoneDetailResponse withPhoneId(String phoneId) {
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

    public ShowCloudPhoneDetailResponse withImageId(String imageId) {
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

    public ShowCloudPhoneDetailResponse withImageVersion(String imageVersion) {
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

    public ShowCloudPhoneDetailResponse withVncEnable(String vncEnable) {
        this.vncEnable = vncEnable;
        return this;
    }

    /**
     * 云手机是否开启VNC服务（过期） - true：开启 - false：关闭
     * @return vncEnable
     */
    public String getVncEnable() {
        return vncEnable;
    }

    public void setVncEnable(String vncEnable) {
        this.vncEnable = vncEnable;
    }

    public ShowCloudPhoneDetailResponse withPhoneModelName(String phoneModelName) {
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

    public ShowCloudPhoneDetailResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 云手机状态。 - 1：创建中 - 2：运行中 - 3：重置中 - 4：重启中 - 6：冻结 - 7：正在关机 - 8：已关机 - -5：重置失败 - -6：重启失败 - -7：手机异常 - -8：创建失败 - -9：关机失败
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

    public ShowCloudPhoneDetailResponse withAccessInfos(List<PhoneAccessInfo> accessInfos) {
        this.accessInfos = accessInfos;
        return this;
    }

    public ShowCloudPhoneDetailResponse addAccessInfosItem(PhoneAccessInfo accessInfosItem) {
        if (this.accessInfos == null) {
            this.accessInfos = new ArrayList<>();
        }
        this.accessInfos.add(accessInfosItem);
        return this;
    }

    public ShowCloudPhoneDetailResponse withAccessInfos(Consumer<List<PhoneAccessInfo>> accessInfosSetter) {
        if (this.accessInfos == null) {
            this.accessInfos = new ArrayList<>();
        }
        accessInfosSetter.accept(this.accessInfos);
        return this;
    }

    /**
     * 云手机访问信息。
     * @return accessInfos
     */
    public List<PhoneAccessInfo> getAccessInfos() {
        return accessInfos;
    }

    public void setAccessInfos(List<PhoneAccessInfo> accessInfos) {
        this.accessInfos = accessInfos;
    }

    public ShowCloudPhoneDetailResponse withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * 云手机属性字符串，不超过2048个字节。
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public ShowCloudPhoneDetailResponse withMetadata(ShowCloudPhoneDetailResponseBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowCloudPhoneDetailResponse withMetadata(
        Consumer<ShowCloudPhoneDetailResponseBodyMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ShowCloudPhoneDetailResponseBodyMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ShowCloudPhoneDetailResponseBodyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ShowCloudPhoneDetailResponseBodyMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowCloudPhoneDetailResponse withPhoneDataVolume(PhoneDataVolume phoneDataVolume) {
        this.phoneDataVolume = phoneDataVolume;
        return this;
    }

    public ShowCloudPhoneDetailResponse withPhoneDataVolume(Consumer<PhoneDataVolume> phoneDataVolumeSetter) {
        if (this.phoneDataVolume == null) {
            this.phoneDataVolume = new PhoneDataVolume();
            phoneDataVolumeSetter.accept(this.phoneDataVolume);
        }

        return this;
    }

    /**
     * Get phoneDataVolume
     * @return phoneDataVolume
     */
    public PhoneDataVolume getPhoneDataVolume() {
        return phoneDataVolume;
    }

    public void setPhoneDataVolume(PhoneDataVolume phoneDataVolume) {
        this.phoneDataVolume = phoneDataVolume;
    }

    public ShowCloudPhoneDetailResponse withImei(String imei) {
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

    public ShowCloudPhoneDetailResponse withTrafficType(String trafficType) {
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

    public ShowCloudPhoneDetailResponse withVolumeMode(Integer volumeMode) {
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

    public ShowCloudPhoneDetailResponse withAvailabilityZone(String availabilityZone) {
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

    public ShowCloudPhoneDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间， 时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowCloudPhoneDetailResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间， 时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ。
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
        ShowCloudPhoneDetailResponse that = (ShowCloudPhoneDetailResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.phoneName, that.phoneName)
            && Objects.equals(this.serverId, that.serverId) && Objects.equals(this.phoneId, that.phoneId)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.vncEnable, that.vncEnable)
            && Objects.equals(this.phoneModelName, that.phoneModelName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.accessInfos, that.accessInfos) && Objects.equals(this.property, that.property)
            && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.phoneDataVolume, that.phoneDataVolume) && Objects.equals(this.imei, that.imei)
            && Objects.equals(this.trafficType, that.trafficType) && Objects.equals(this.volumeMode, that.volumeMode)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId,
            phoneName,
            serverId,
            phoneId,
            imageId,
            imageVersion,
            vncEnable,
            phoneModelName,
            status,
            accessInfos,
            property,
            metadata,
            phoneDataVolume,
            imei,
            trafficType,
            volumeMode,
            availabilityZone,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCloudPhoneDetailResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    phoneName: ").append(toIndentedString(phoneName)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    vncEnable: ").append(toIndentedString(vncEnable)).append("\n");
        sb.append("    phoneModelName: ").append(toIndentedString(phoneModelName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    accessInfos: ").append(toIndentedString(accessInfos)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    phoneDataVolume: ").append(toIndentedString(phoneDataVolume)).append("\n");
        sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
        sb.append("    trafficType: ").append(toIndentedString(trafficType)).append("\n");
        sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
