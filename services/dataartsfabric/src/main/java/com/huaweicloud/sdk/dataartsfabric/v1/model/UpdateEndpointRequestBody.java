package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEndpointRequestBody
 */
public class UpdateEndpointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved_resource")

    private ReservedResource reservedResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_resource")

    private RayResourceInput rayResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cap")

    private CapRef cap;

    public UpdateEndpointRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 一个Endpoint名称，只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateEndpointRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateEndpointRequestBody withReservedResource(ReservedResource reservedResource) {
        this.reservedResource = reservedResource;
        return this;
    }

    public UpdateEndpointRequestBody withReservedResource(Consumer<ReservedResource> reservedResourceSetter) {
        if (this.reservedResource == null) {
            this.reservedResource = new ReservedResource();
            reservedResourceSetter.accept(this.reservedResource);
        }

        return this;
    }

    /**
     * Get reservedResource
     * @return reservedResource
     */
    public ReservedResource getReservedResource() {
        return reservedResource;
    }

    public void setReservedResource(ReservedResource reservedResource) {
        this.reservedResource = reservedResource;
    }

    public UpdateEndpointRequestBody withRayResource(RayResourceInput rayResource) {
        this.rayResource = rayResource;
        return this;
    }

    public UpdateEndpointRequestBody withRayResource(Consumer<RayResourceInput> rayResourceSetter) {
        if (this.rayResource == null) {
            this.rayResource = new RayResourceInput();
            rayResourceSetter.accept(this.rayResource);
        }

        return this;
    }

    /**
     * Get rayResource
     * @return rayResource
     */
    public RayResourceInput getRayResource() {
        return rayResource;
    }

    public void setRayResource(RayResourceInput rayResource) {
        this.rayResource = rayResource;
    }

    public UpdateEndpointRequestBody withCap(CapRef cap) {
        this.cap = cap;
        return this;
    }

    public UpdateEndpointRequestBody withCap(Consumer<CapRef> capSetter) {
        if (this.cap == null) {
            this.cap = new CapRef();
            capSetter.accept(this.cap);
        }

        return this;
    }

    /**
     * Get cap
     * @return cap
     */
    public CapRef getCap() {
        return cap;
    }

    public void setCap(CapRef cap) {
        this.cap = cap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEndpointRequestBody that = (UpdateEndpointRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.reservedResource, that.reservedResource)
            && Objects.equals(this.rayResource, that.rayResource) && Objects.equals(this.cap, that.cap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, reservedResource, rayResource, cap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    reservedResource: ").append(toIndentedString(reservedResource)).append("\n");
        sb.append("    rayResource: ").append(toIndentedString(rayResource)).append("\n");
        sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
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
