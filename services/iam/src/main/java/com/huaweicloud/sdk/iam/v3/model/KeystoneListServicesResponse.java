package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class KeystoneListServicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "services")

    private List<Service> services = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private Links links;

    public KeystoneListServicesResponse withServices(List<Service> services) {
        this.services = services;
        return this;
    }

    public KeystoneListServicesResponse addServicesItem(Service servicesItem) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    public KeystoneListServicesResponse withServices(Consumer<List<Service>> servicesSetter) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        servicesSetter.accept(this.services);
        return this;
    }

    /** 服务信息列表。
     * 
     * @return services */
    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public KeystoneListServicesResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListServicesResponse withLinks(Consumer<Links> linksSetter) {
        if (this.links == null) {
            this.links = new Links();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /** Get links
     * 
     * @return links */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListServicesResponse keystoneListServicesResponse = (KeystoneListServicesResponse) o;
        return Objects.equals(this.services, keystoneListServicesResponse.services)
            && Objects.equals(this.links, keystoneListServicesResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(services, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListServicesResponse {\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
