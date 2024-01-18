package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VolumeTypeInfo
 */
public class VolumeTypeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_product_type")

    private String volumeProductType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<Map<String, String>> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type_extra_specs")

    private VolumeTypeExtraSpecs volumeTypeExtraSpecs;

    public VolumeTypeInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public VolumeTypeInfo withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 磁盘类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public VolumeTypeInfo withVolumeProductType(String volumeProductType) {
        this.volumeProductType = volumeProductType;
        return this;
    }

    /**
     * 磁盘产品类型。
     * @return volumeProductType
     */
    public String getVolumeProductType() {
        return volumeProductType;
    }

    public void setVolumeProductType(String volumeProductType) {
        this.volumeProductType = volumeProductType;
    }

    public VolumeTypeInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型字段。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public VolumeTypeInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 资源所属云服务类型编码。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public VolumeTypeInfo withName(List<Map<String, String>> name) {
        this.name = name;
        return this;
    }

    public VolumeTypeInfo addNameItem(Map<String, String> nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public VolumeTypeInfo withName(Consumer<List<Map<String, String>>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 磁盘中英文名称。
     * @return name
     */
    public List<Map<String, String>> getName() {
        return name;
    }

    public void setName(List<Map<String, String>> name) {
        this.name = name;
    }

    public VolumeTypeInfo withVolumeTypeExtraSpecs(VolumeTypeExtraSpecs volumeTypeExtraSpecs) {
        this.volumeTypeExtraSpecs = volumeTypeExtraSpecs;
        return this;
    }

    public VolumeTypeInfo withVolumeTypeExtraSpecs(Consumer<VolumeTypeExtraSpecs> volumeTypeExtraSpecsSetter) {
        if (this.volumeTypeExtraSpecs == null) {
            this.volumeTypeExtraSpecs = new VolumeTypeExtraSpecs();
            volumeTypeExtraSpecsSetter.accept(this.volumeTypeExtraSpecs);
        }

        return this;
    }

    /**
     * Get volumeTypeExtraSpecs
     * @return volumeTypeExtraSpecs
     */
    public VolumeTypeExtraSpecs getVolumeTypeExtraSpecs() {
        return volumeTypeExtraSpecs;
    }

    public void setVolumeTypeExtraSpecs(VolumeTypeExtraSpecs volumeTypeExtraSpecs) {
        this.volumeTypeExtraSpecs = volumeTypeExtraSpecs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeTypeInfo that = (VolumeTypeInfo) obj;
        return Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.volumeType, that.volumeType)
            && Objects.equals(this.volumeProductType, that.volumeProductType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.volumeTypeExtraSpecs, that.volumeTypeExtraSpecs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode,
            volumeType,
            volumeProductType,
            resourceType,
            cloudServiceType,
            name,
            volumeTypeExtraSpecs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeTypeInfo {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeProductType: ").append(toIndentedString(volumeProductType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    volumeTypeExtraSpecs: ").append(toIndentedString(volumeTypeExtraSpecs)).append("\n");
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
