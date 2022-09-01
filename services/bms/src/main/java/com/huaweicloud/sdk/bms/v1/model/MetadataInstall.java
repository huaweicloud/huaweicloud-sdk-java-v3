package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * metadata字段数据结构说明
 */
public class MetadataInstall {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    @JacksonXmlProperty(localName = "user_data")

    private String userData;

    public MetadataInstall withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 重装裸金属服务器过程中注入Linux镜像root密码，用户自定义初始化密码。注：修改密码脚本需经Base64编码。建议密码复杂度如下：长度为8-26位。密码至少必须包含大写字母（A-Z）、小写字母（a-z）、数字（0-9）和特殊字符（!@$%^-_=+[{}]:,./?）中的三种
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
        MetadataInstall metadataInstall = (MetadataInstall) o;
        return Objects.equals(this.userData, metadataInstall.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetadataInstall {\n");
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
