package com.huaweicloud.sdk.modelarts.v1.model;

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
public class BatchDeleteInferServicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_responses")

    private List<ServiceResponse> serviceResponses = null;

    public BatchDeleteInferServicesResponse withServiceResponses(List<ServiceResponse> serviceResponses) {
        this.serviceResponses = serviceResponses;
        return this;
    }

    public BatchDeleteInferServicesResponse addServiceResponsesItem(ServiceResponse serviceResponsesItem) {
        if (this.serviceResponses == null) {
            this.serviceResponses = new ArrayList<>();
        }
        this.serviceResponses.add(serviceResponsesItem);
        return this;
    }

    public BatchDeleteInferServicesResponse withServiceResponses(
        Consumer<List<ServiceResponse>> serviceResponsesSetter) {
        if (this.serviceResponses == null) {
            this.serviceResponses = new ArrayList<>();
        }
        serviceResponsesSetter.accept(this.serviceResponses);
        return this;
    }

    /**
     * **参数解释：** 服务响应返回体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return serviceResponses
     */
    public List<ServiceResponse> getServiceResponses() {
        return serviceResponses;
    }

    public void setServiceResponses(List<ServiceResponse> serviceResponses) {
        this.serviceResponses = serviceResponses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteInferServicesResponse that = (BatchDeleteInferServicesResponse) obj;
        return Objects.equals(this.serviceResponses, that.serviceResponses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceResponses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteInferServicesResponse {\n");
        sb.append("    serviceResponses: ").append(toIndentedString(serviceResponses)).append("\n");
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
