package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 需要绑定密钥对的虚拟机信息。
 */
public class EcsServerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private Auth auth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_password")

    private Boolean disablePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Long port;

    public EcsServerInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 需要绑定(替换或重置)SSH密钥对的虚拟机id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EcsServerInfo withAuth(Auth auth) {
        this.auth = auth;
        return this;
    }

    public EcsServerInfo withAuth(Consumer<Auth> authSetter) {
        if (this.auth == null) {
            this.auth = new Auth();
            authSetter.accept(this.auth);
        }

        return this;
    }

    /**
     * Get auth
     * @return auth
     */
    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public EcsServerInfo withDisablePassword(Boolean disablePassword) {
        this.disablePassword = disablePassword;
        return this;
    }

    /**
     * - true：禁用虚拟机的ssh登录。 - false：不禁用虚拟机的ssh登录。
     * @return disablePassword
     */
    public Boolean getDisablePassword() {
        return disablePassword;
    }

    public void setDisablePassword(Boolean disablePassword) {
        this.disablePassword = disablePassword;
    }

    public EcsServerInfo withPort(Long port) {
        this.port = port;
        return this;
    }

    /**
     * SSH监听端口。
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EcsServerInfo that = (EcsServerInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.auth, that.auth)
            && Objects.equals(this.disablePassword, that.disablePassword) && Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, auth, disablePassword, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EcsServerInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    disablePassword: ").append(toIndentedString(disablePassword)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
