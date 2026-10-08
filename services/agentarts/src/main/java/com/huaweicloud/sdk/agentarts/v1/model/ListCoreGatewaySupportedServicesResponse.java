package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListCoreGatewaySupportedServicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_services")

    private List<ListCoreGatewaySupportedServicesItem> supportedServices = null;

    public ListCoreGatewaySupportedServicesResponse withSupportedServices(
        List<ListCoreGatewaySupportedServicesItem> supportedServices) {
        this.supportedServices = supportedServices;
        return this;
    }

    public ListCoreGatewaySupportedServicesResponse addSupportedServicesItem(
        ListCoreGatewaySupportedServicesItem supportedServicesItem) {
        if (this.supportedServices == null) {
            this.supportedServices = new ArrayList<>();
        }
        this.supportedServices.add(supportedServicesItem);
        return this;
    }

    public ListCoreGatewaySupportedServicesResponse withSupportedServices(
        Consumer<List<ListCoreGatewaySupportedServicesItem>> supportedServicesSetter) {
        if (this.supportedServices == null) {
            this.supportedServices = new ArrayList<>();
        }
        supportedServicesSetter.accept(this.supportedServices);
        return this;
    }

    /**
     * **参数解释：** 网关支持的主力核心服务列表。 **取值范围：** 数组长度为1-100个。 
     * @return supportedServices
     */
    public List<ListCoreGatewaySupportedServicesItem> getSupportedServices() {
        return supportedServices;
    }

    public void setSupportedServices(List<ListCoreGatewaySupportedServicesItem> supportedServices) {
        this.supportedServices = supportedServices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCoreGatewaySupportedServicesResponse that = (ListCoreGatewaySupportedServicesResponse) obj;
        return Objects.equals(this.supportedServices, that.supportedServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportedServices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreGatewaySupportedServicesResponse {\n");
        sb.append("    supportedServices: ").append(toIndentedString(supportedServices)).append("\n");
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
