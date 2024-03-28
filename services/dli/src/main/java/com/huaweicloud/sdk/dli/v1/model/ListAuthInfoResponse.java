package com.huaweicloud.sdk.dli.v1.model;

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
public class ListAuthInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_infos")

    private List<AuthInfo> authInfos = null;

    public ListAuthInfoResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否成功
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListAuthInfoResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 请求消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListAuthInfoResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 认证信息个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAuthInfoResponse withAuthInfos(List<AuthInfo> authInfos) {
        this.authInfos = authInfos;
        return this;
    }

    public ListAuthInfoResponse addAuthInfosItem(AuthInfo authInfosItem) {
        if (this.authInfos == null) {
            this.authInfos = new ArrayList<>();
        }
        this.authInfos.add(authInfosItem);
        return this;
    }

    public ListAuthInfoResponse withAuthInfos(Consumer<List<AuthInfo>> authInfosSetter) {
        if (this.authInfos == null) {
            this.authInfos = new ArrayList<>();
        }
        authInfosSetter.accept(this.authInfos);
        return this;
    }

    /**
     * 认证信息列表
     * @return authInfos
     */
    public List<AuthInfo> getAuthInfos() {
        return authInfos;
    }

    public void setAuthInfos(List<AuthInfo> authInfos) {
        this.authInfos = authInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthInfoResponse that = (ListAuthInfoResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.count, that.count) && Objects.equals(this.authInfos, that.authInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, count, authInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthInfoResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    authInfos: ").append(toIndentedString(authInfos)).append("\n");
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
