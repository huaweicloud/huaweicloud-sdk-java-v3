package com.huaweicloud.sdk.clouddc.v1.model;

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
public class ShowServerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_state")

    private ManageState manageState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_state")

    private PowerState powerState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_state")

    private PhysicalServerOperationStatus operationState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_state")

    private Health healthState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "onboard_time")

    private String onboardTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private Location location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hardware_attributes")

    private HardwareSummary hardwareAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private ErrorStatus error;

    public ShowServerResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * UUID（Universally Unique Identifier）是一个 128 位的数字，通常以 32 个十六进制数字的形式表示，分为 5 组，用连字符分隔。具体格式如下：  xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx 其中：  每个 x 是一个十六进制数字（0-9 或 a-f）。 5 组的长度分别是：8 位、4 位、4 位、4 位 和 12 位。 为了匹配这种格式的 UUID，可以使用以下正则表达式：  regex ^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowServerResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Resource Name Type
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowServerResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * project id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowServerResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * domain id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowServerResponse withManageState(ManageState manageState) {
        this.manageState = manageState;
        return this;
    }

    /**
     * Get manageState
     * @return manageState
     */
    public ManageState getManageState() {
        return manageState;
    }

    public void setManageState(ManageState manageState) {
        this.manageState = manageState;
    }

    public ShowServerResponse withPowerState(PowerState powerState) {
        this.powerState = powerState;
        return this;
    }

    /**
     * Get powerState
     * @return powerState
     */
    public PowerState getPowerState() {
        return powerState;
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public ShowServerResponse withOperationState(PhysicalServerOperationStatus operationState) {
        this.operationState = operationState;
        return this;
    }

    /**
     * Get operationState
     * @return operationState
     */
    public PhysicalServerOperationStatus getOperationState() {
        return operationState;
    }

    public void setOperationState(PhysicalServerOperationStatus operationState) {
        this.operationState = operationState;
    }

    public ShowServerResponse withHealthState(Health healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get healthState
     * @return healthState
     */
    public Health getHealthState() {
        return healthState;
    }

    public void setHealthState(Health healthState) {
        this.healthState = healthState;
    }

    public ShowServerResponse withOnboardTime(String onboardTime) {
        this.onboardTime = onboardTime;
        return this;
    }

    /**
     * 上架时间
     * @return onboardTime
     */
    public String getOnboardTime() {
        return onboardTime;
    }

    public void setOnboardTime(String onboardTime) {
        this.onboardTime = onboardTime;
    }

    public ShowServerResponse withLocation(Location location) {
        this.location = location;
        return this;
    }

    public ShowServerResponse withLocation(Consumer<Location> locationSetter) {
        if (this.location == null) {
            this.location = new Location();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ShowServerResponse withHardwareAttributes(HardwareSummary hardwareAttributes) {
        this.hardwareAttributes = hardwareAttributes;
        return this;
    }

    public ShowServerResponse withHardwareAttributes(Consumer<HardwareSummary> hardwareAttributesSetter) {
        if (this.hardwareAttributes == null) {
            this.hardwareAttributes = new HardwareSummary();
            hardwareAttributesSetter.accept(this.hardwareAttributes);
        }

        return this;
    }

    /**
     * Get hardwareAttributes
     * @return hardwareAttributes
     */
    public HardwareSummary getHardwareAttributes() {
        return hardwareAttributes;
    }

    public void setHardwareAttributes(HardwareSummary hardwareAttributes) {
        this.hardwareAttributes = hardwareAttributes;
    }

    public ShowServerResponse withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowServerResponse addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowServerResponse withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ShowServerResponse withError(ErrorStatus error) {
        this.error = error;
        return this;
    }

    public ShowServerResponse withError(Consumer<ErrorStatus> errorSetter) {
        if (this.error == null) {
            this.error = new ErrorStatus();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public ErrorStatus getError() {
        return error;
    }

    public void setError(ErrorStatus error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerResponse that = (ShowServerResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.manageState, that.manageState) && Objects.equals(this.powerState, that.powerState)
            && Objects.equals(this.operationState, that.operationState)
            && Objects.equals(this.healthState, that.healthState) && Objects.equals(this.onboardTime, that.onboardTime)
            && Objects.equals(this.location, that.location)
            && Objects.equals(this.hardwareAttributes, that.hardwareAttributes) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            projectId,
            domainId,
            manageState,
            powerState,
            operationState,
            healthState,
            onboardTime,
            location,
            hardwareAttributes,
            tags,
            error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    manageState: ").append(toIndentedString(manageState)).append("\n");
        sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
        sb.append("    operationState: ").append(toIndentedString(operationState)).append("\n");
        sb.append("    healthState: ").append(toIndentedString(healthState)).append("\n");
        sb.append("    onboardTime: ").append(toIndentedString(onboardTime)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    hardwareAttributes: ").append(toIndentedString(hardwareAttributes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
