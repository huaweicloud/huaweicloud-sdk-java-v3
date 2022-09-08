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
public class ListCloudPhoneModelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_models")

    private List<Object> phoneModels = null;

    public ListCloudPhoneModelsResponse withRequestId(String requestId) {
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

    public ListCloudPhoneModelsResponse withPhoneModels(List<Object> phoneModels) {
        this.phoneModels = phoneModels;
        return this;
    }

    public ListCloudPhoneModelsResponse addPhoneModelsItem(Object phoneModelsItem) {
        if (this.phoneModels == null) {
            this.phoneModels = new ArrayList<>();
        }
        this.phoneModels.add(phoneModelsItem);
        return this;
    }

    public ListCloudPhoneModelsResponse withPhoneModels(Consumer<List<Object>> phoneModelsSetter) {
        if (this.phoneModels == null) {
            this.phoneModels = new ArrayList<>();
        }
        phoneModelsSetter.accept(this.phoneModels);
        return this;
    }

    /**
     * 云手机的规格信息
     * @return phoneModels
     */
    public List<Object> getPhoneModels() {
        return phoneModels;
    }

    public void setPhoneModels(List<Object> phoneModels) {
        this.phoneModels = phoneModels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCloudPhoneModelsResponse listCloudPhoneModelsResponse = (ListCloudPhoneModelsResponse) o;
        return Objects.equals(this.requestId, listCloudPhoneModelsResponse.requestId)
            && Objects.equals(this.phoneModels, listCloudPhoneModelsResponse.phoneModels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, phoneModels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudPhoneModelsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    phoneModels: ").append(toIndentedString(phoneModels)).append("\n");
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
