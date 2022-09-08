package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 需要绑定密钥对的虚拟机信息。
 */
public class DisassociateEcsServerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private Auth auth;

    public DisassociateEcsServerInfo withId(String id) {
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

    public DisassociateEcsServerInfo withAuth(Auth auth) {
        this.auth = auth;
        return this;
    }

    public DisassociateEcsServerInfo withAuth(Consumer<Auth> authSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateEcsServerInfo disassociateEcsServerInfo = (DisassociateEcsServerInfo) o;
        return Objects.equals(this.id, disassociateEcsServerInfo.id)
            && Objects.equals(this.auth, disassociateEcsServerInfo.auth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, auth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateEcsServerInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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
