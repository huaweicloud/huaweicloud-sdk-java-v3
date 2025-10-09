package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器重装云硬盘配置
 */
public class MigrateVolumeSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmkID")

    private String cmkID;

    public MigrateVolumeSpec withCmkID(String cmkID) {
        this.cmkID = cmkID;
        return this;
    }

    /**
     * **参数解释**: 用户主密钥ID。 [> 获取密钥ID的方法请参考：[查询密钥列表](https://support.huaweicloud.com/api-dew/ListKeys.html)](tag:hws) [> 获取密钥ID的方法请参考：[查询密钥列表](https://support.huaweicloud.com/intl/zh-cn/api-dew/ListKeys.html)](tag:hws_hk)。  **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 默认为空，表示云硬盘不加密。 
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
        MigrateVolumeSpec that = (MigrateVolumeSpec) obj;
        return Objects.equals(this.cmkID, that.cmkID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmkID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateVolumeSpec {\n");
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
