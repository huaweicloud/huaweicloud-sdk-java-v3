package com.huaweicloud.sdk.mas.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MultiActiveZoneVo
 */
public class MultiActiveZoneVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone")

    private List<String> availableZone = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private OffsetDateTime createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_master")

    private Boolean isMaster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private String namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private BaseMultiActiveZoneSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_date")

    private OffsetDateTime updatedDate;

    public MultiActiveZoneVo withAvailableZone(List<String> availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    public MultiActiveZoneVo addAvailableZoneItem(String availableZoneItem) {
        if (this.availableZone == null) {
            this.availableZone = new ArrayList<>();
        }
        this.availableZone.add(availableZoneItem);
        return this;
    }

    public MultiActiveZoneVo withAvailableZone(Consumer<List<String>> availableZoneSetter) {
        if (this.availableZone == null) {
            this.availableZone = new ArrayList<>();
        }
        availableZoneSetter.accept(this.availableZone);
        return this;
    }

    /**
     * Get availableZone
     * @return availableZone
     */
    public List<String> getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(List<String> availableZone) {
        this.availableZone = availableZone;
    }

    public MultiActiveZoneVo withCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get createdDate
     * @return createdDate
     */
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public MultiActiveZoneVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultiActiveZoneVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MultiActiveZoneVo withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * Get isMaster
     * @return isMaster
     */
    public Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
    }

    public MultiActiveZoneVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultiActiveZoneVo withNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * Get namespaceId
     * @return namespaceId
     */
    public String getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    public MultiActiveZoneVo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public MultiActiveZoneVo withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * Get regionName
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public MultiActiveZoneVo withSpec(BaseMultiActiveZoneSpec spec) {
        this.spec = spec;
        return this;
    }

    public MultiActiveZoneVo withSpec(Consumer<BaseMultiActiveZoneSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new BaseMultiActiveZoneSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public BaseMultiActiveZoneSpec getSpec() {
        return spec;
    }

    public void setSpec(BaseMultiActiveZoneSpec spec) {
        this.spec = spec;
    }

    public MultiActiveZoneVo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public MultiActiveZoneVo withUpdatedDate(OffsetDateTime updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    /**
     * Get updatedDate
     * @return updatedDate
     */
    public OffsetDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(OffsetDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiActiveZoneVo multiActiveZoneVo = (MultiActiveZoneVo) o;
        return Objects.equals(this.availableZone, multiActiveZoneVo.availableZone)
            && Objects.equals(this.createdDate, multiActiveZoneVo.createdDate)
            && Objects.equals(this.description, multiActiveZoneVo.description)
            && Objects.equals(this.id, multiActiveZoneVo.id)
            && Objects.equals(this.isMaster, multiActiveZoneVo.isMaster)
            && Objects.equals(this.name, multiActiveZoneVo.name)
            && Objects.equals(this.namespaceId, multiActiveZoneVo.namespaceId)
            && Objects.equals(this.region, multiActiveZoneVo.region)
            && Objects.equals(this.regionName, multiActiveZoneVo.regionName)
            && Objects.equals(this.spec, multiActiveZoneVo.spec) && Objects.equals(this.type, multiActiveZoneVo.type)
            && Objects.equals(this.updatedDate, multiActiveZoneVo.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableZone,
            createdDate,
            description,
            id,
            isMaster,
            name,
            namespaceId,
            region,
            regionName,
            spec,
            type,
            updatedDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiActiveZoneVo {\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isMaster: ").append(toIndentedString(isMaster)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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
