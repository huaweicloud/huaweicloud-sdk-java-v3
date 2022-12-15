package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.DedicatedComputeInfo;
import com.huaweicloud.sdk.gaussdb.v3.model.DedicatedStorageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDedicatedResourceInfoResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine_name")
    
    
    private String engineName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_ids")
    
    
    private List<String> availabilityZoneIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="architecture")
    
    
    private String architecture;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_compute_info")
    
    
    private DedicatedComputeInfo dedicatedComputeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_info")
    
    
    private DedicatedStorageInfo dedicatedStorageInfo;

    public ShowDedicatedResourceInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 专属资源池id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowDedicatedResourceInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 专属资源池名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if(this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public ShowDedicatedResourceInfoResponse withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if(this.availabilityZoneIds == null) {
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

    public ShowDedicatedResourceInfoResponse withDedicatedComputeInfo(Consumer<DedicatedComputeInfo> dedicatedComputeInfoSetter) {
        if(this.dedicatedComputeInfo == null ){
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

    public ShowDedicatedResourceInfoResponse withDedicatedStorageInfo(Consumer<DedicatedStorageInfo> dedicatedStorageInfoSetter) {
        if(this.dedicatedStorageInfo == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDedicatedResourceInfoResponse showDedicatedResourceInfoResponse = (ShowDedicatedResourceInfoResponse) o;
        return Objects.equals(this.id, showDedicatedResourceInfoResponse.id) &&
            Objects.equals(this.name, showDedicatedResourceInfoResponse.name) &&
            Objects.equals(this.engineName, showDedicatedResourceInfoResponse.engineName) &&
            Objects.equals(this.availabilityZoneIds, showDedicatedResourceInfoResponse.availabilityZoneIds) &&
            Objects.equals(this.architecture, showDedicatedResourceInfoResponse.architecture) &&
            Objects.equals(this.status, showDedicatedResourceInfoResponse.status) &&
            Objects.equals(this.dedicatedComputeInfo, showDedicatedResourceInfoResponse.dedicatedComputeInfo) &&
            Objects.equals(this.dedicatedStorageInfo, showDedicatedResourceInfoResponse.dedicatedStorageInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, engineName, availabilityZoneIds, architecture, status, dedicatedComputeInfo, dedicatedStorageInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDedicatedResourceInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

