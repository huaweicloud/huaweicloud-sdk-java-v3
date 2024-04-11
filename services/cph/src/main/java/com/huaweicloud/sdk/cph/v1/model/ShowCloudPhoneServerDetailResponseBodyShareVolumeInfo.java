package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机服务器的共享存储相关信息。
 */
public class ShowCloudPhoneServerDetailResponseBodyShareVolumeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    public ShowCloudPhoneServerDetailResponseBodyShareVolumeInfo withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 共享存储磁盘类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public ShowCloudPhoneServerDetailResponseBodyShareVolumeInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 共享存储大小，单位G。
     * minimum: 0
     * maximum: 65535
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowCloudPhoneServerDetailResponseBodyShareVolumeInfo withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 共享存储版本： - 0：共享存储1.0 - 1：共享存储2.0
     * minimum: 0
     * maximum: 65535
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCloudPhoneServerDetailResponseBodyShareVolumeInfo that =
            (ShowCloudPhoneServerDetailResponseBodyShareVolumeInfo) obj;
        return Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.size, that.size)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeType, size, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCloudPhoneServerDetailResponseBodyShareVolumeInfo {\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
