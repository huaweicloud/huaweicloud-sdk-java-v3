package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchCreateVpnUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invalid_users")

    private List<InvalidVpnUser> invalidUsers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header-response-token")

    private String headerResponseToken;

    public BatchCreateVpnUsersResponse withInvalidUsers(List<InvalidVpnUser> invalidUsers) {
        this.invalidUsers = invalidUsers;
        return this;
    }

    public BatchCreateVpnUsersResponse addInvalidUsersItem(InvalidVpnUser invalidUsersItem) {
        if (this.invalidUsers == null) {
            this.invalidUsers = new ArrayList<>();
        }
        this.invalidUsers.add(invalidUsersItem);
        return this;
    }

    public BatchCreateVpnUsersResponse withInvalidUsers(Consumer<List<InvalidVpnUser>> invalidUsersSetter) {
        if (this.invalidUsers == null) {
            this.invalidUsers = new ArrayList<>();
        }
        invalidUsersSetter.accept(this.invalidUsers);
        return this;
    }

    /**
     * 异常的用户列表
     * @return invalidUsers
     */
    public List<InvalidVpnUser> getInvalidUsers() {
        return invalidUsers;
    }

    public void setInvalidUsers(List<InvalidVpnUser> invalidUsers) {
        this.invalidUsers = invalidUsers;
    }

    public BatchCreateVpnUsersResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public BatchCreateVpnUsersResponse withHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
        return this;
    }

    /**
     * Get headerResponseToken
     * @return headerResponseToken
     */
    public String getHeaderResponseToken() {
        return headerResponseToken;
    }

    public void setHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateVpnUsersResponse that = (BatchCreateVpnUsersResponse) obj;
        return Objects.equals(this.invalidUsers, that.invalidUsers) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.headerResponseToken, that.headerResponseToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invalidUsers, requestId, headerResponseToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateVpnUsersResponse {\n");
        sb.append("    invalidUsers: ").append(toIndentedString(invalidUsers)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    headerResponseToken: ").append(toIndentedString(headerResponseToken)).append("\n");
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
