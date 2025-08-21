package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RemoteMirrorSyncInfoDto
 */
public class RemoteMirrorSyncInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_uuid")

    private String endpointUuid;

    public RemoteMirrorSyncInfoDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释：** 用户名(需要base64加密)。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RemoteMirrorSyncInfoDto withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释：** 密码(需要base64加密)。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RemoteMirrorSyncInfoDto withEndpointUuid(String endpointUuid) {
        this.endpointUuid = endpointUuid;
        return this;
    }

    /**
     * **参数解释：** 拓展点uuid。
     * @return endpointUuid
     */
    public String getEndpointUuid() {
        return endpointUuid;
    }

    public void setEndpointUuid(String endpointUuid) {
        this.endpointUuid = endpointUuid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoteMirrorSyncInfoDto that = (RemoteMirrorSyncInfoDto) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.password, that.password)
            && Objects.equals(this.endpointUuid, that.endpointUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, endpointUuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoteMirrorSyncInfoDto {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    endpointUuid: ").append(toIndentedString(endpointUuid)).append("\n");
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
