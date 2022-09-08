package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * 服务器重装云硬盘配置
 */
public class ReinstallVolumeSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageID")

    private UUID imageID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmkID")

    private String cmkID;

    public ReinstallVolumeSpec withImageID(UUID imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * 用户自定义镜像ID
     * @return imageID
     */
    public UUID getImageID() {
        return imageID;
    }

    public void setImageID(UUID imageID) {
        this.imageID = imageID;
    }

    public ReinstallVolumeSpec withCmkID(String cmkID) {
        this.cmkID = cmkID;
        return this;
    }

    /**
     * 用户主密钥ID。默认为空时，表示云硬盘不加密。
     * @return cmkID
     */
    public String getCmkID() {
        return cmkID;
    }

    public void setCmkID(String cmkID) {
        this.cmkID = cmkID;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReinstallVolumeSpec reinstallVolumeSpec = (ReinstallVolumeSpec) o;
        return Objects.equals(this.imageID, reinstallVolumeSpec.imageID)
            && Objects.equals(this.cmkID, reinstallVolumeSpec.cmkID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageID, cmkID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallVolumeSpec {\n");
        sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
        sb.append("    cmkID: ").append(toIndentedString(cmkID)).append("\n");
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
