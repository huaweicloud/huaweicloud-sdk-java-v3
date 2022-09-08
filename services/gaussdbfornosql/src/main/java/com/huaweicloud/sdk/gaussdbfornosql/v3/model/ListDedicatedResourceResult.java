package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 专属资源信息列表。
 */
public class ListDedicatedResourceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private DedicatedResourceCapacity capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ListDedicatedResourceResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 专属资源ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListDedicatedResourceResult withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 专属资源的名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListDedicatedResourceResult withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎名称。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ListDedicatedResourceResult withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区信息。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ListDedicatedResourceResult withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 专属资源的计算架构。
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ListDedicatedResourceResult withCapacity(DedicatedResourceCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    public ListDedicatedResourceResult withCapacity(Consumer<DedicatedResourceCapacity> capacitySetter) {
        if (this.capacity == null) {
            this.capacity = new DedicatedResourceCapacity();
            capacitySetter.accept(this.capacity);
        }

        return this;
    }

    /**
     * Get capacity
     * @return capacity
     */
    public DedicatedResourceCapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(DedicatedResourceCapacity capacity) {
        this.capacity = capacity;
    }

    public ListDedicatedResourceResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 专属资源的状态信息。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDedicatedResourceResult listDedicatedResourceResult = (ListDedicatedResourceResult) o;
        return Objects.equals(this.id, listDedicatedResourceResult.id)
            && Objects.equals(this.resourceName, listDedicatedResourceResult.resourceName)
            && Objects.equals(this.engineName, listDedicatedResourceResult.engineName)
            && Objects.equals(this.availabilityZone, listDedicatedResourceResult.availabilityZone)
            && Objects.equals(this.architecture, listDedicatedResourceResult.architecture)
            && Objects.equals(this.capacity, listDedicatedResourceResult.capacity)
            && Objects.equals(this.status, listDedicatedResourceResult.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceName, engineName, availabilityZone, architecture, capacity, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDedicatedResourceResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
