package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeTemplateLogin
 */
public class NodeTemplateLogin {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sshKey")

    private String sshKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userPassword")

    private NodeTemplateLoginUserPassword userPassword;

    public NodeTemplateLogin withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }

    /**
     * Get sshKey
     * @return sshKey
     */
    public String getSshKey() {
        return sshKey;
    }

    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }

    public NodeTemplateLogin withUserPassword(NodeTemplateLoginUserPassword userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public NodeTemplateLogin withUserPassword(Consumer<NodeTemplateLoginUserPassword> userPasswordSetter) {
        if (this.userPassword == null) {
            this.userPassword = new NodeTemplateLoginUserPassword();
            userPasswordSetter.accept(this.userPassword);
        }

        return this;
    }

    /**
     * Get userPassword
     * @return userPassword
     */
    public NodeTemplateLoginUserPassword getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(NodeTemplateLoginUserPassword userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTemplateLogin that = (NodeTemplateLogin) obj;
        return Objects.equals(this.sshKey, that.sshKey) && Objects.equals(this.userPassword, that.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sshKey, userPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTemplateLogin {\n");
        sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
        sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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
