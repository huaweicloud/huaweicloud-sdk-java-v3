package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * kafka连接信息。购买kafka时，SASL_SSL是否配置，如果有，则需要填写账号密码
 */
public class RegisterDmsKafkaInstanceRequestBodyConnectInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd")

    @JacksonXmlProperty(localName = "pwd")

    private String pwd;

    public RegisterDmsKafkaInstanceRequestBodyConnectInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 账号
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public RegisterDmsKafkaInstanceRequestBodyConnectInfo withPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    /**
     * 密码
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisterDmsKafkaInstanceRequestBodyConnectInfo registerDmsKafkaInstanceRequestBodyConnectInfo =
            (RegisterDmsKafkaInstanceRequestBodyConnectInfo) o;
        return Objects.equals(this.userName, registerDmsKafkaInstanceRequestBodyConnectInfo.userName)
            && Objects.equals(this.pwd, registerDmsKafkaInstanceRequestBodyConnectInfo.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, pwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterDmsKafkaInstanceRequestBodyConnectInfo {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    pwd: ").append(toIndentedString(pwd)).append("\n");
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
