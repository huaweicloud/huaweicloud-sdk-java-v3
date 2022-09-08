package com.huaweicloud.sdk.cph.v1.model;

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
public class ListCloudPhoneServerModelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_models")

    private List<Object> serverModels = null;

    public ListCloudPhoneServerModelsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCloudPhoneServerModelsResponse withServerModels(List<Object> serverModels) {
        this.serverModels = serverModels;
        return this;
    }

    public ListCloudPhoneServerModelsResponse addServerModelsItem(Object serverModelsItem) {
        if (this.serverModels == null) {
            this.serverModels = new ArrayList<>();
        }
        this.serverModels.add(serverModelsItem);
        return this;
    }

    public ListCloudPhoneServerModelsResponse withServerModels(Consumer<List<Object>> serverModelsSetter) {
        if (this.serverModels == null) {
            this.serverModels = new ArrayList<>();
        }
        serverModelsSetter.accept(this.serverModels);
        return this;
    }

    /**
     * 云手机服务器的规格信息
     * @return serverModels
     */
    public List<Object> getServerModels() {
        return serverModels;
    }

    public void setServerModels(List<Object> serverModels) {
        this.serverModels = serverModels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCloudPhoneServerModelsResponse listCloudPhoneServerModelsResponse = (ListCloudPhoneServerModelsResponse) o;
        return Objects.equals(this.requestId, listCloudPhoneServerModelsResponse.requestId)
            && Objects.equals(this.serverModels, listCloudPhoneServerModelsResponse.serverModels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, serverModels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudPhoneServerModelsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    serverModels: ").append(toIndentedString(serverModels)).append("\n");
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
