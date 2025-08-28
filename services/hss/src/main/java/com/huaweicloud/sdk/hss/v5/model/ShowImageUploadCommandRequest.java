package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowImageUploadCommandRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_addr")

    private String registryAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public ShowImageUploadCommandRequest withRegistryAddr(String registryAddr) {
        this.registryAddr = registryAddr;
        return this;
    }

    /**
     * **参数解释**： 镜像仓地址 **约束限制**： 网址/IP:端口。如：myharbor.com。 **取值范围**： 字符长度1-256位  **默认取值**： 不涉及 
     * @return registryAddr
     */
    public String getRegistryAddr() {
        return registryAddr;
    }

    public void setRegistryAddr(String registryAddr) {
        this.registryAddr = registryAddr;
    }

    public ShowImageUploadCommandRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 镜像仓项目,用来指定扫描组件要上传到的镜像仓目录。 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位  **默认取值**： 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowImageUploadCommandRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释**： 用于登录镜像仓的用户名。 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位  **默认取值**： 不涉及 
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ShowImageUploadCommandRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释**： 用于登录镜像仓的密码。仅用于生成命令，HSS服务不会存储您的镜像仓密码。 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位  **默认取值**： 不涉及 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageUploadCommandRequest that = (ShowImageUploadCommandRequest) obj;
        return Objects.equals(this.registryAddr, that.registryAddr) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.username, that.username) && Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryAddr, namespace, username, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageUploadCommandRequest {\n");
        sb.append("    registryAddr: ").append(toIndentedString(registryAddr)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
