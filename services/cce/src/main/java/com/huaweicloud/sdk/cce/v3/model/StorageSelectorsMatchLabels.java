package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * evs盘的匹配字段，支持DataVolume中的size、volumeType、metadataEncrypted、metadataCmkid、count五个字段。 
 */
public class StorageSelectorsMatchLabels {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeType")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadataEncrypted")

    private String metadataEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadataCmkid")

    private String metadataCmkid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    public StorageSelectorsMatchLabels withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 匹配的磁盘大小，不填则无磁盘大小限制。例如：100.
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public StorageSelectorsMatchLabels withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 云硬盘类型，目前支持SSD\\GPSSD\\SAS\\ESSD\\SATA等。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public StorageSelectorsMatchLabels withMetadataEncrypted(String metadataEncrypted) {
        this.metadataEncrypted = metadataEncrypted;
        return this;
    }

    /**
     * 磁盘加密标识符，0代表不加密，1代表加密。
     * @return metadataEncrypted
     */
    public String getMetadataEncrypted() {
        return metadataEncrypted;
    }

    public void setMetadataEncrypted(String metadataEncrypted) {
        this.metadataEncrypted = metadataEncrypted;
    }

    public StorageSelectorsMatchLabels withMetadataCmkid(String metadataCmkid) {
        this.metadataCmkid = metadataCmkid;
        return this;
    }

    /**
     * 加密磁盘的用户主密钥ID，长度为36字节的字符串。
     * @return metadataCmkid
     */
    public String getMetadataCmkid() {
        return metadataCmkid;
    }

    public void setMetadataCmkid(String metadataCmkid) {
        this.metadataCmkid = metadataCmkid;
    }

    public StorageSelectorsMatchLabels withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 磁盘选择个数，不填则选择所有此类磁盘。
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageSelectorsMatchLabels that = (StorageSelectorsMatchLabels) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.volumeType, that.volumeType)
            && Objects.equals(this.metadataEncrypted, that.metadataEncrypted)
            && Objects.equals(this.metadataCmkid, that.metadataCmkid) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, volumeType, metadataEncrypted, metadataCmkid, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageSelectorsMatchLabels {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    metadataEncrypted: ").append(toIndentedString(metadataEncrypted)).append("\n");
        sb.append("    metadataCmkid: ").append(toIndentedString(metadataCmkid)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
