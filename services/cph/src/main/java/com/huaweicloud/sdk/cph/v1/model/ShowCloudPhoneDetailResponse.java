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
     * 云手机名称，不超过65个字符
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
     * 云手机服务器ID，不超过32个字节
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
     * 云手机的唯一标识，不超过32个字节
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
     * 云手机镜像ID，不超过32个字节
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ShowCloudPhoneDetailResponse withVncEnable(String vncEnable) {
        this.vncEnable = vncEnable;
        return this;
    }

    /**
     * 云手机是否开启VNC服务 - true：开启 - false：关闭
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
     * 云手机规格名称，不超过64个字节
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
     * 云手机状态 - 0：创建中 - 1：创建中 - 2：运行中 - 3：重置中 - 4：重启中 - 6：冻结 - 7：正在关机 - 8：已关机 - -5：重置失败 - -6：重启失败 - -7：手机异常 - -8：创建失败 - -9：关机失败
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
     * 云手机访问信息
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
     * 云手机属性字符串，不超过2048个字节
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

    public ShowCloudPhoneDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间 时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ
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
     * 更新时间 时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
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
        ShowCloudPhoneDetailResponse showCloudPhoneDetailResponse = (ShowCloudPhoneDetailResponse) o;
        return Objects.equals(this.requestId, showCloudPhoneDetailResponse.requestId)
            && Objects.equals(this.phoneName, showCloudPhoneDetailResponse.phoneName)
            && Objects.equals(this.serverId, showCloudPhoneDetailResponse.serverId)
            && Objects.equals(this.phoneId, showCloudPhoneDetailResponse.phoneId)
            && Objects.equals(this.imageId, showCloudPhoneDetailResponse.imageId)
            && Objects.equals(this.vncEnable, showCloudPhoneDetailResponse.vncEnable)
            && Objects.equals(this.phoneModelName, showCloudPhoneDetailResponse.phoneModelName)
            && Objects.equals(this.status, showCloudPhoneDetailResponse.status)
            && Objects.equals(this.accessInfos, showCloudPhoneDetailResponse.accessInfos)
            && Objects.equals(this.property, showCloudPhoneDetailResponse.property)
            && Objects.equals(this.metadata, showCloudPhoneDetailResponse.metadata)
            && Objects.equals(this.createTime, showCloudPhoneDetailResponse.createTime)
            && Objects.equals(this.updateTime, showCloudPhoneDetailResponse.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId,
            phoneName,
            serverId,
            phoneId,
            imageId,
            vncEnable,
            phoneModelName,
            status,
            accessInfos,
            property,
            metadata,
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
        sb.append("    vncEnable: ").append(toIndentedString(vncEnable)).append("\n");
        sb.append("    phoneModelName: ").append(toIndentedString(phoneModelName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    accessInfos: ").append(toIndentedString(accessInfos)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
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
