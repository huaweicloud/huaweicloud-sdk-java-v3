package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class ReinstallSeverMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")

    private String systemEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")

    private String systemCmkid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    public ReinstallSeverMetadata withSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
        return this;
    }

    /**
     * metadata中的表示加密功能的字段，0代表不加密，1代表加密。  该字段不存在时，云硬盘默认为不加密。
     * @return systemEncrypted
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")
    public String getSystemEncrypted() {
        return systemEncrypted;
    }

    public void setSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
    }

    public ReinstallSeverMetadata withSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
        return this;
    }

    /**
     * metadata中的加密cmkid字段，与__system__encrypted配合表示需要加密，cmkid长度固定为36个字节。  > 说明：  - 请参考[查询密钥列表](https://support.huaweicloud.com/api-dew/ListKeys.html)，通过HTTPS请求获取密钥ID。
     * @return systemCmkid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")
    public String getSystemCmkid() {
        return systemCmkid;
    }

    public void setSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
    }

    public ReinstallSeverMetadata withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 重装云服务器过程中注入用户数据。  支持注入文本、文本文件或gzip文件。注入内容最大长度32KB。注入内容，需要进行base64格式编码。  了解更多用户数据注入请参考[用户数据注入](https://support.huaweicloud.com/usermanual-ecs/zh-cn_topic_0032380449.html)。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReinstallSeverMetadata reinstallSeverMetadata = (ReinstallSeverMetadata) o;
        return Objects.equals(this.systemEncrypted, reinstallSeverMetadata.systemEncrypted)
            && Objects.equals(this.systemCmkid, reinstallSeverMetadata.systemCmkid)
            && Objects.equals(this.userData, reinstallSeverMetadata.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemEncrypted, systemCmkid, userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallSeverMetadata {\n");
        sb.append("    systemEncrypted: ").append(toIndentedString(systemEncrypted)).append("\n");
        sb.append("    systemCmkid: ").append(toIndentedString(systemCmkid)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
