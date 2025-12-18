package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowAvailableResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private List<String> availabilityZone = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private List<String> flavorId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dec_project_id")

    private List<String> decProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_limit")

    private List<String> checkLimit = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expectation")

    private List<String> expectation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private List<String> resourceType = null;

    public ShowAvailableResourceRequest withAvailabilityZone(List<String> availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public ShowAvailableResourceRequest addAvailabilityZoneItem(String availabilityZoneItem) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        this.availabilityZone.add(availabilityZoneItem);
        return this;
    }

    public ShowAvailableResourceRequest withAvailabilityZone(Consumer<List<String>> availabilityZoneSetter) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        availabilityZoneSetter.accept(this.availabilityZone);
        return this;
    }

    /**
     * Get availabilityZone
     * @return availabilityZone
     */
    public List<String> getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ShowAvailableResourceRequest withFlavorId(List<String> flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    public ShowAvailableResourceRequest addFlavorIdItem(String flavorIdItem) {
        if (this.flavorId == null) {
            this.flavorId = new ArrayList<>();
        }
        this.flavorId.add(flavorIdItem);
        return this;
    }

    public ShowAvailableResourceRequest withFlavorId(Consumer<List<String>> flavorIdSetter) {
        if (this.flavorId == null) {
            this.flavorId = new ArrayList<>();
        }
        flavorIdSetter.accept(this.flavorId);
        return this;
    }

    /**
     * Get flavorId
     * @return flavorId
     */
    public List<String> getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(List<String> flavorId) {
        this.flavorId = flavorId;
    }

    public ShowAvailableResourceRequest withDecProjectId(List<String> decProjectId) {
        this.decProjectId = decProjectId;
        return this;
    }

    public ShowAvailableResourceRequest addDecProjectIdItem(String decProjectIdItem) {
        if (this.decProjectId == null) {
            this.decProjectId = new ArrayList<>();
        }
        this.decProjectId.add(decProjectIdItem);
        return this;
    }

    public ShowAvailableResourceRequest withDecProjectId(Consumer<List<String>> decProjectIdSetter) {
        if (this.decProjectId == null) {
            this.decProjectId = new ArrayList<>();
        }
        decProjectIdSetter.accept(this.decProjectId);
        return this;
    }

    /**
     * Get decProjectId
     * @return decProjectId
     */
    public List<String> getDecProjectId() {
        return decProjectId;
    }

    public void setDecProjectId(List<String> decProjectId) {
        this.decProjectId = decProjectId;
    }

    public ShowAvailableResourceRequest withCheckLimit(List<String> checkLimit) {
        this.checkLimit = checkLimit;
        return this;
    }

    public ShowAvailableResourceRequest addCheckLimitItem(String checkLimitItem) {
        if (this.checkLimit == null) {
            this.checkLimit = new ArrayList<>();
        }
        this.checkLimit.add(checkLimitItem);
        return this;
    }

    public ShowAvailableResourceRequest withCheckLimit(Consumer<List<String>> checkLimitSetter) {
        if (this.checkLimit == null) {
            this.checkLimit = new ArrayList<>();
        }
        checkLimitSetter.accept(this.checkLimit);
        return this;
    }

    /**
     * Get checkLimit
     * @return checkLimit
     */
    public List<String> getCheckLimit() {
        return checkLimit;
    }

    public void setCheckLimit(List<String> checkLimit) {
        this.checkLimit = checkLimit;
    }

    public ShowAvailableResourceRequest withExpectation(List<String> expectation) {
        this.expectation = expectation;
        return this;
    }

    public ShowAvailableResourceRequest addExpectationItem(String expectationItem) {
        if (this.expectation == null) {
            this.expectation = new ArrayList<>();
        }
        this.expectation.add(expectationItem);
        return this;
    }

    public ShowAvailableResourceRequest withExpectation(Consumer<List<String>> expectationSetter) {
        if (this.expectation == null) {
            this.expectation = new ArrayList<>();
        }
        expectationSetter.accept(this.expectation);
        return this;
    }

    /**
     * Get expectation
     * @return expectation
     */
    public List<String> getExpectation() {
        return expectation;
    }

    public void setExpectation(List<String> expectation) {
        this.expectation = expectation;
    }

    public ShowAvailableResourceRequest withResourceType(List<String> resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public ShowAvailableResourceRequest addResourceTypeItem(String resourceTypeItem) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        this.resourceType.add(resourceTypeItem);
        return this;
    }

    public ShowAvailableResourceRequest withResourceType(Consumer<List<String>> resourceTypeSetter) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        resourceTypeSetter.accept(this.resourceType);
        return this;
    }

    /**
     * Get resourceType
     * @return resourceType
     */
    public List<String> getResourceType() {
        return resourceType;
    }

    public void setResourceType(List<String> resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvailableResourceRequest that = (ShowAvailableResourceRequest) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.decProjectId, that.decProjectId)
            && Objects.equals(this.checkLimit, that.checkLimit) && Objects.equals(this.expectation, that.expectation)
            && Objects.equals(this.resourceType, that.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, flavorId, decProjectId, checkLimit, expectation, resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableResourceRequest {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    decProjectId: ").append(toIndentedString(decProjectId)).append("\n");
        sb.append("    checkLimit: ").append(toIndentedString(checkLimit)).append("\n");
        sb.append("    expectation: ").append(toIndentedString(expectation)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
