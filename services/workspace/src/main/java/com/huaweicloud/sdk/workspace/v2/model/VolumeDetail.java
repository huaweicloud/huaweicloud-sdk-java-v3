package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 磁盘信息。
 */
public class VolumeDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_flag")

    private String encryptFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key")

    private String kmsKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_alias")

    private String keyAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_grant_id")

    private String kmsGrantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_resource_id")

    private String billResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    public VolumeDetail withEncryptFlag(String encryptFlag) {
        this.encryptFlag = encryptFlag;
        return this;
    }

    /**
     * 标识磁盘是否加密，如果为1就是加密。
     * @return encryptFlag
     */
    public String getEncryptFlag() {
        return encryptFlag;
    }

    public void setEncryptFlag(String encryptFlag) {
        this.encryptFlag = encryptFlag;
    }

    public VolumeDetail withKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
        return this;
    }

    /**
     * 如果磁盘加密，传递的密钥。
     * @return kmsKey
     */
    public String getKmsKey() {
        return kmsKey;
    }

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    public VolumeDetail withKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
        return this;
    }

    /**
     * 如果磁盘加密，传递的密钥。
     * @return keyAlias
     */
    public String getKeyAlias() {
        return keyAlias;
    }

    public void setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
    }

    public VolumeDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 桌面数据盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。  - SAS：高IO。 - SSD：超高IO。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VolumeDetail withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘容量，单位GB。
     * minimum: 0
     * maximum: 2147483647
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public VolumeDetail withKmsGrantId(String kmsGrantId) {
        this.kmsGrantId = kmsGrantId;
        return this;
    }

    /**
     * 如果磁盘加密，授权ID。
     * @return kmsGrantId
     */
    public String getKmsGrantId() {
        return kmsGrantId;
    }

    public void setKmsGrantId(String kmsGrantId) {
        this.kmsGrantId = kmsGrantId;
    }

    public VolumeDetail withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * 挂载目录。
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public VolumeDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 磁盘表唯一标识ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VolumeDetail withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * 磁盘ID。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public VolumeDetail withBillResourceId(String billResourceId) {
        this.billResourceId = billResourceId;
        return this;
    }

    /**
     * 磁盘计费资源ID。
     * @return billResourceId
     */
    public String getBillResourceId() {
        return billResourceId;
    }

    public void setBillResourceId(String billResourceId) {
        this.billResourceId = billResourceId;
    }

    public VolumeDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 磁盘的创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public VolumeDetail withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 磁盘名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public VolumeDetail withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 云服务器系统盘对应的存储池的ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public VolumeDetail withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 规格
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeDetail that = (VolumeDetail) obj;
        return Objects.equals(this.encryptFlag, that.encryptFlag) && Objects.equals(this.kmsKey, that.kmsKey)
            && Objects.equals(this.keyAlias, that.keyAlias) && Objects.equals(this.type, that.type)
            && Objects.equals(this.size, that.size) && Objects.equals(this.kmsGrantId, that.kmsGrantId)
            && Objects.equals(this.device, that.device) && Objects.equals(this.id, that.id)
            && Objects.equals(this.volumeId, that.volumeId) && Objects.equals(this.billResourceId, that.billResourceId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptFlag,
            kmsKey,
            keyAlias,
            type,
            size,
            kmsGrantId,
            device,
            id,
            volumeId,
            billResourceId,
            createTime,
            displayName,
            clusterId,
            resourceSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeDetail {\n");
        sb.append("    encryptFlag: ").append(toIndentedString(encryptFlag)).append("\n");
        sb.append("    kmsKey: ").append(toIndentedString(kmsKey)).append("\n");
        sb.append("    keyAlias: ").append(toIndentedString(keyAlias)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    kmsGrantId: ").append(toIndentedString(kmsGrantId)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    billResourceId: ").append(toIndentedString(billResourceId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
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
