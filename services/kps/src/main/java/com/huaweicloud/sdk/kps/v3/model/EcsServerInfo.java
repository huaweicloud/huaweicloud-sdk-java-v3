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
     * - true：禁用虚拟机的ssh登陆。 - false：不禁用虚拟机的ssh登陆。
     * @return disablePassword
     */
    public Boolean getDisablePassword() {
        return disablePassword;
    }

    public void setDisablePassword(Boolean disablePassword) {
        this.disablePassword = disablePassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EcsServerInfo ecsServerInfo = (EcsServerInfo) o;
        return Objects.equals(this.id, ecsServerInfo.id) && Objects.equals(this.auth, ecsServerInfo.auth)
            && Objects.equals(this.disablePassword, ecsServerInfo.disablePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, auth, disablePassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EcsServerInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
        sb.append("    disablePassword: ").append(toIndentedString(disablePassword)).append("\n");
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
