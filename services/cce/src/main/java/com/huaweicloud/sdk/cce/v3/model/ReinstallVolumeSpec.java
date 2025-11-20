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
     * **参数解释**： 用户自定义镜像ID > 获取方式:在控制台的“服务列表”中，单击“计算 > 镜像服务 > 私有镜像”，单击镜像的名称，在服务器详情页的“基本信息”页签下找到“镜像ID”字段复制即可。  **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
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
     * **参数解释**： 用户主密钥ID。默认为空时，表示云硬盘不加密。 [> 获取密钥ID的方法请参考：[查询密钥列表](https://support.huaweicloud.com/api-dew/ListKeys.html)](tag:hws) [> 获取密钥ID的方法请参考：[查询密钥列表](https://support.huaweicloud.com/intl/zh-cn/api-dew/ListKeys.html)](tag:hws_hk)  **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return cmkID
     */
    public String getCmkID() {
        return cmkID;
    }

    public void setCmkID(String cmkID) {
        this.cmkID = cmkID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReinstallVolumeSpec that = (ReinstallVolumeSpec) obj;
        return Objects.equals(this.imageID, that.imageID) && Objects.equals(this.cmkID, that.cmkID);
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
