package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckpointParam
 */
public class CheckpointParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_trigger")

    private Boolean autoTrigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incremental")

    private Boolean incremental;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<String> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_details")

    private List<Resource> resourceDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_duration_days")

    private Integer retentionDurationDays;

    public CheckpointParam withAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }

    /**
     * 是否自动触发,true：自动触发，false：非自动触发。
     * @return autoTrigger
     */
    public Boolean getAutoTrigger() {
        return autoTrigger;
    }

    public void setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
    }

    public CheckpointParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 备份描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckpointParam withIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }

    /**
     * 是否增量备份，true：增量备份，false：非增量备份。
     * @return incremental
     */
    public Boolean getIncremental() {
        return incremental;
    }

    public void setIncremental(Boolean incremental) {
        this.incremental = incremental;
    }

    public CheckpointParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckpointParam withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    public CheckpointParam addResourcesItem(String resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public CheckpointParam withResources(Consumer<List<String>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 待备份的资源id列表:uuid
     * @return resources
     */
    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public CheckpointParam withResourceDetails(List<Resource> resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    public CheckpointParam addResourceDetailsItem(Resource resourceDetailsItem) {
        if (this.resourceDetails == null) {
            this.resourceDetails = new ArrayList<>();
        }
        this.resourceDetails.add(resourceDetailsItem);
        return this;
    }

    public CheckpointParam withResourceDetails(Consumer<List<Resource>> resourceDetailsSetter) {
        if (this.resourceDetails == null) {
            this.resourceDetails = new ArrayList<>();
        }
        resourceDetailsSetter.accept(this.resourceDetails);
        return this;
    }

    /**
     * 资源详情
     * @return resourceDetails
     */
    public List<Resource> getResourceDetails() {
        return resourceDetails;
    }

    public void setResourceDetails(List<Resource> resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    public CheckpointParam withRetentionDurationDays(Integer retentionDurationDays) {
        this.retentionDurationDays = retentionDurationDays;
        return this;
    }

    /**
     * **参数解释**： 手动备份的保留时长，单位为天。设置该参数后，备份副本将在保留时长到期后自动删除。用于为手动备份设置自动过期时间，避免手动备份堆积导致存储容量浪费。不设置此参数时，备份将永久保留。 **约束限制**： 当auto_trigger为true时不支持传此参数，自动备份的保留时间由关联的备份策略指定。auto_trigger不传或为false时支持指定此参数。 **取值范围**： -  1~36500：指定保留天数，备份将在创建时间 + 该天数后到期并自动删除。 - -1：永久保留，备份不会自动过期。  **默认取值**： -1 > 该特性目前处于公测阶段，部分Region可能无法使用
     * @return retentionDurationDays
     */
    public Integer getRetentionDurationDays() {
        return retentionDurationDays;
    }

    public void setRetentionDurationDays(Integer retentionDurationDays) {
        this.retentionDurationDays = retentionDurationDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckpointParam that = (CheckpointParam) obj;
        return Objects.equals(this.autoTrigger, that.autoTrigger) && Objects.equals(this.description, that.description)
            && Objects.equals(this.incremental, that.incremental) && Objects.equals(this.name, that.name)
            && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.resourceDetails, that.resourceDetails)
            && Objects.equals(this.retentionDurationDays, that.retentionDurationDays);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(autoTrigger, description, incremental, name, resources, resourceDetails, retentionDurationDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointParam {\n");
        sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    incremental: ").append(toIndentedString(incremental)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    resourceDetails: ").append(toIndentedString(resourceDetails)).append("\n");
        sb.append("    retentionDurationDays: ").append(toIndentedString(retentionDurationDays)).append("\n");
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
