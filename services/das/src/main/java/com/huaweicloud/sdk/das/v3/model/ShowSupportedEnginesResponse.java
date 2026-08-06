package com.huaweicloud.sdk.das.v3.model;

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
public class ShowSupportedEnginesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_engine_types")

    private List<String> allEngineTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_engine_types")

    private List<String> supportedEngineTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_net_work_types")

    private List<SupportNetWorkTypeResponse> supportedNetWorkTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_cloud_dba_types")

    private List<SupportNetWorkTypeResponse> supportedCloudDbaTypes = null;

    public ShowSupportedEnginesResponse withAllEngineTypes(List<String> allEngineTypes) {
        this.allEngineTypes = allEngineTypes;
        return this;
    }

    public ShowSupportedEnginesResponse addAllEngineTypesItem(String allEngineTypesItem) {
        if (this.allEngineTypes == null) {
            this.allEngineTypes = new ArrayList<>();
        }
        this.allEngineTypes.add(allEngineTypesItem);
        return this;
    }

    public ShowSupportedEnginesResponse withAllEngineTypes(Consumer<List<String>> allEngineTypesSetter) {
        if (this.allEngineTypes == null) {
            this.allEngineTypes = new ArrayList<>();
        }
        allEngineTypesSetter.accept(this.allEngineTypes);
        return this;
    }

    /**
     * 所有EngineType
     * @return allEngineTypes
     */
    public List<String> getAllEngineTypes() {
        return allEngineTypes;
    }

    public void setAllEngineTypes(List<String> allEngineTypes) {
        this.allEngineTypes = allEngineTypes;
    }

    public ShowSupportedEnginesResponse withSupportedEngineTypes(List<String> supportedEngineTypes) {
        this.supportedEngineTypes = supportedEngineTypes;
        return this;
    }

    public ShowSupportedEnginesResponse addSupportedEngineTypesItem(String supportedEngineTypesItem) {
        if (this.supportedEngineTypes == null) {
            this.supportedEngineTypes = new ArrayList<>();
        }
        this.supportedEngineTypes.add(supportedEngineTypesItem);
        return this;
    }

    public ShowSupportedEnginesResponse withSupportedEngineTypes(Consumer<List<String>> supportedEngineTypesSetter) {
        if (this.supportedEngineTypes == null) {
            this.supportedEngineTypes = new ArrayList<>();
        }
        supportedEngineTypesSetter.accept(this.supportedEngineTypes);
        return this;
    }

    /**
     * 支持的EngineType
     * @return supportedEngineTypes
     */
    public List<String> getSupportedEngineTypes() {
        return supportedEngineTypes;
    }

    public void setSupportedEngineTypes(List<String> supportedEngineTypes) {
        this.supportedEngineTypes = supportedEngineTypes;
    }

    public ShowSupportedEnginesResponse withSupportedNetWorkTypes(
        List<SupportNetWorkTypeResponse> supportedNetWorkTypes) {
        this.supportedNetWorkTypes = supportedNetWorkTypes;
        return this;
    }

    public ShowSupportedEnginesResponse addSupportedNetWorkTypesItem(
        SupportNetWorkTypeResponse supportedNetWorkTypesItem) {
        if (this.supportedNetWorkTypes == null) {
            this.supportedNetWorkTypes = new ArrayList<>();
        }
        this.supportedNetWorkTypes.add(supportedNetWorkTypesItem);
        return this;
    }

    public ShowSupportedEnginesResponse withSupportedNetWorkTypes(
        Consumer<List<SupportNetWorkTypeResponse>> supportedNetWorkTypesSetter) {
        if (this.supportedNetWorkTypes == null) {
            this.supportedNetWorkTypes = new ArrayList<>();
        }
        supportedNetWorkTypesSetter.accept(this.supportedNetWorkTypes);
        return this;
    }

    /**
     * 支持的NetWorkType和EngineType
     * @return supportedNetWorkTypes
     */
    public List<SupportNetWorkTypeResponse> getSupportedNetWorkTypes() {
        return supportedNetWorkTypes;
    }

    public void setSupportedNetWorkTypes(List<SupportNetWorkTypeResponse> supportedNetWorkTypes) {
        this.supportedNetWorkTypes = supportedNetWorkTypes;
    }

    public ShowSupportedEnginesResponse withSupportedCloudDbaTypes(
        List<SupportNetWorkTypeResponse> supportedCloudDbaTypes) {
        this.supportedCloudDbaTypes = supportedCloudDbaTypes;
        return this;
    }

    public ShowSupportedEnginesResponse addSupportedCloudDbaTypesItem(
        SupportNetWorkTypeResponse supportedCloudDbaTypesItem) {
        if (this.supportedCloudDbaTypes == null) {
            this.supportedCloudDbaTypes = new ArrayList<>();
        }
        this.supportedCloudDbaTypes.add(supportedCloudDbaTypesItem);
        return this;
    }

    public ShowSupportedEnginesResponse withSupportedCloudDbaTypes(
        Consumer<List<SupportNetWorkTypeResponse>> supportedCloudDbaTypesSetter) {
        if (this.supportedCloudDbaTypes == null) {
            this.supportedCloudDbaTypes = new ArrayList<>();
        }
        supportedCloudDbaTypesSetter.accept(this.supportedCloudDbaTypes);
        return this;
    }

    /**
     * 支持的CloudDBA的NetWorkType和EngineType
     * @return supportedCloudDbaTypes
     */
    public List<SupportNetWorkTypeResponse> getSupportedCloudDbaTypes() {
        return supportedCloudDbaTypes;
    }

    public void setSupportedCloudDbaTypes(List<SupportNetWorkTypeResponse> supportedCloudDbaTypes) {
        this.supportedCloudDbaTypes = supportedCloudDbaTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSupportedEnginesResponse that = (ShowSupportedEnginesResponse) obj;
        return Objects.equals(this.allEngineTypes, that.allEngineTypes)
            && Objects.equals(this.supportedEngineTypes, that.supportedEngineTypes)
            && Objects.equals(this.supportedNetWorkTypes, that.supportedNetWorkTypes)
            && Objects.equals(this.supportedCloudDbaTypes, that.supportedCloudDbaTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allEngineTypes, supportedEngineTypes, supportedNetWorkTypes, supportedCloudDbaTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSupportedEnginesResponse {\n");
        sb.append("    allEngineTypes: ").append(toIndentedString(allEngineTypes)).append("\n");
        sb.append("    supportedEngineTypes: ").append(toIndentedString(supportedEngineTypes)).append("\n");
        sb.append("    supportedNetWorkTypes: ").append(toIndentedString(supportedNetWorkTypes)).append("\n");
        sb.append("    supportedCloudDbaTypes: ").append(toIndentedString(supportedCloudDbaTypes)).append("\n");
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
