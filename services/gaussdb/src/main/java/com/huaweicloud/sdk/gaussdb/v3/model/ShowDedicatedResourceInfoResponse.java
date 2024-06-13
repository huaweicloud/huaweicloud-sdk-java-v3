package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowDedicatedResourceInfoResponse extends SdkResponse {

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
    @JsonProperty(value = "availability_zone_ids")

    private List<String> availabilityZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_compute_info")

    private DedicatedComputeInfo dedicatedComputeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_info")

    private DedicatedStorageInfo dedicatedStorageInfo;

    public ShowDedicatedResourceInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 专属资源池ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDedicatedResourceInfoResponse withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 专属资源池名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ShowDedicatedResourceInfoResponse withEngineName(String engineName) {
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

    public ShowDedicatedResourceInfoResponse withAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    public ShowDedicatedResourceInfoResponse addAvailabilityZoneIdsItem(String availabilityZoneIdsItem) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public ShowDedicatedResourceInfoResponse withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        availabilityZoneIdsSetter.accept(this.availabilityZoneIds);
        return this;
    }

    /**
     * 可用区。
     * @return availabilityZoneIds
     */
    public List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }

    public ShowDedicatedResourceInfoResponse withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 资源规格类型。
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ShowDedicatedResourceInfoResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 专属资源池状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDedicatedResourceInfoResponse withDedicatedComputeInfo(DedicatedComputeInfo dedicatedComputeInfo) {
        this.dedicatedComputeInfo = dedicatedComputeInfo;
        return this;
    }

    public ShowDedicatedResourceInfoResponse withDedicatedComputeInfo(
        Consumer<DedicatedComputeInfo> dedicatedComputeInfoSetter) {
        if (this.dedicatedComputeInfo == null) {
            this.dedicatedComputeInfo = new DedicatedComputeInfo();
            dedicatedComputeInfoSetter.accept(this.dedicatedComputeInfo);
        }

        return this;
    }

    /**
     * Get dedicatedComputeInfo
     * @return dedicatedComputeInfo
     */
    public DedicatedComputeInfo getDedicatedComputeInfo() {
        return dedicatedComputeInfo;
    }

    public void setDedicatedComputeInfo(DedicatedComputeInfo dedicatedComputeInfo) {
        this.dedicatedComputeInfo = dedicatedComputeInfo;
    }

    public ShowDedicatedResourceInfoResponse withDedicatedStorageInfo(DedicatedStorageInfo dedicatedStorageInfo) {
        this.dedicatedStorageInfo = dedicatedStorageInfo;
        return this;
    }

    public ShowDedicatedResourceInfoResponse withDedicatedStorageInfo(
        Consumer<DedicatedStorageInfo> dedicatedStorageInfoSetter) {
        if (this.dedicatedStorageInfo == null) {
            this.dedicatedStorageInfo = new DedicatedStorageInfo();
            dedicatedStorageInfoSetter.accept(this.dedicatedStorageInfo);
        }

        return this;
    }

    /**
     * Get dedicatedStorageInfo
     * @return dedicatedStorageInfo
     */
    public DedicatedStorageInfo getDedicatedStorageInfo() {
        return dedicatedStorageInfo;
    }

    public void setDedicatedStorageInfo(DedicatedStorageInfo dedicatedStorageInfo) {
        this.dedicatedStorageInfo = dedicatedStorageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDedicatedResourceInfoResponse that = (ShowDedicatedResourceInfoResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.availabilityZoneIds, that.availabilityZoneIds)
            && Objects.equals(this.architecture, that.architecture) && Objects.equals(this.status, that.status)
            && Objects.equals(this.dedicatedComputeInfo, that.dedicatedComputeInfo)
            && Objects.equals(this.dedicatedStorageInfo, that.dedicatedStorageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceName,
            engineName,
            availabilityZoneIds,
            architecture,
            status,
            dedicatedComputeInfo,
            dedicatedStorageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDedicatedResourceInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dedicatedComputeInfo: ").append(toIndentedString(dedicatedComputeInfo)).append("\n");
        sb.append("    dedicatedStorageInfo: ").append(toIndentedString(dedicatedStorageInfo)).append("\n");
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
