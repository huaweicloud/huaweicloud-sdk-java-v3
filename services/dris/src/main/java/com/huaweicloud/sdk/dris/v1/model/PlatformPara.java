package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数说明**：platform_type为非DRIS时有效，表示第三方平台的对接参数。
 */
public class PlatformPara {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passwd")

    private String passwd;

    public PlatformPara withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数说明**：第三方业务平台的ip地址和端口。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PlatformPara withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数说明**：鉴权用户名。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PlatformPara withPasswd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    /**
     * **参数说明**：鉴权密码，ITS800或者ATLAS500的密码
     * @return passwd
     */
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlatformPara platformPara = (PlatformPara) o;
        return Objects.equals(this.address, platformPara.address)
            && Objects.equals(this.username, platformPara.username) && Objects.equals(this.passwd, platformPara.passwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, username, passwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlatformPara {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    passwd: ").append(toIndentedString(passwd)).append("\n");
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
