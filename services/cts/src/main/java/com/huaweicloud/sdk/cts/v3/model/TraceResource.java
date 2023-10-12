package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TraceResource
 */
public class TraceResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private List<String> resource = null;

    public TraceResource withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 云服务类型。必须为已对接CTS的云服务的英文缩写，且服务类型一般为大写字母。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public TraceResource withResource(List<String> resource) {
        this.resource = resource;
        return this;
    }

    public TraceResource addResourceItem(String resourceItem) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        this.resource.add(resourceItem);
        return this;
    }

    public TraceResource withResource(Consumer<List<String>> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        resourceSetter.accept(this.resource);
        return this;
    }

    /**
     * 云服务对应的资源类型列表。
     * @return resource
     */
    public List<String> getResource() {
        return resource;
    }

    public void setResource(List<String> resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TraceResource that = (TraceResource) obj;
        return Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.resource, that.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TraceResource {\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
