package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePrivateHookMetadataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Client-Request-Id")

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_name")

    private String hookName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePrivateHookMetadataRequestBody body;

    public UpdatePrivateHookMetadataRequest withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * 用户指定的，对于此请求的唯一Id，用于定位某个请求，推荐使用UUID
     * @return clientRequestId
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    public UpdatePrivateHookMetadataRequest withHookName(String hookName) {
        this.hookName = hookName;
        return this;
    }

    /**
     * 私有hook的名字。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。  推荐用户使用三段命名空间：{自定义hook名称}-{hook应用场景}-hook。
     * @return hookName
     */
    public String getHookName() {
        return hookName;
    }

    public void setHookName(String hookName) {
        this.hookName = hookName;
    }

    public UpdatePrivateHookMetadataRequest withBody(UpdatePrivateHookMetadataRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePrivateHookMetadataRequest withBody(Consumer<UpdatePrivateHookMetadataRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePrivateHookMetadataRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePrivateHookMetadataRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePrivateHookMetadataRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePrivateHookMetadataRequest that = (UpdatePrivateHookMetadataRequest) obj;
        return Objects.equals(this.clientRequestId, that.clientRequestId)
            && Objects.equals(this.hookName, that.hookName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, hookName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateHookMetadataRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    hookName: ").append(toIndentedString(hookName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
