package com.huaweicloud.sdk.smn.v2.model;

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
public class ListCloudServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_services")

    private List<ListCloudServiceResponseItemInfo> cloudServices = null;

    public ListCloudServiceResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCloudServiceResponse withCloudServices(List<ListCloudServiceResponseItemInfo> cloudServices) {
        this.cloudServices = cloudServices;
        return this;
    }

    public ListCloudServiceResponse addCloudServicesItem(ListCloudServiceResponseItemInfo cloudServicesItem) {
        if (this.cloudServices == null) {
            this.cloudServices = new ArrayList<>();
        }
        this.cloudServices.add(cloudServicesItem);
        return this;
    }

    public ListCloudServiceResponse withCloudServices(
        Consumer<List<ListCloudServiceResponseItemInfo>> cloudServicesSetter) {
        if (this.cloudServices == null) {
            this.cloudServices = new ArrayList<>();
        }
        cloudServicesSetter.accept(this.cloudServices);
        return this;
    }

    /**
     * 云服务信息列表。
     * @return cloudServices
     */
    public List<ListCloudServiceResponseItemInfo> getCloudServices() {
        return cloudServices;
    }

    public void setCloudServices(List<ListCloudServiceResponseItemInfo> cloudServices) {
        this.cloudServices = cloudServices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudServiceResponse that = (ListCloudServiceResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.cloudServices, that.cloudServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, cloudServices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudServiceResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    cloudServices: ").append(toIndentedString(cloudServices)).append("\n");
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
