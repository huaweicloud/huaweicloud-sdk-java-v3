package com.huaweicloud.sdk.rgc.v1.model;

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
public class ShowControlsForOrganizationalUnitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control")

    private EnabledControl control;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<RegionConfigurationList> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ShowControlsForOrganizationalUnitResponse withControl(EnabledControl control) {
        this.control = control;
        return this;
    }

    public ShowControlsForOrganizationalUnitResponse withControl(Consumer<EnabledControl> controlSetter) {
        if (this.control == null) {
            this.control = new EnabledControl();
            controlSetter.accept(this.control);
        }

        return this;
    }

    /**
     * Get control
     * @return control
     */
    public EnabledControl getControl() {
        return control;
    }

    public void setControl(EnabledControl control) {
        this.control = control;
    }

    public ShowControlsForOrganizationalUnitResponse withRegions(List<RegionConfigurationList> regions) {
        this.regions = regions;
        return this;
    }

    public ShowControlsForOrganizationalUnitResponse addRegionsItem(RegionConfigurationList regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ShowControlsForOrganizationalUnitResponse withRegions(
        Consumer<List<RegionConfigurationList>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 区域信息。
     * @return regions
     */
    public List<RegionConfigurationList> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionConfigurationList> regions) {
        this.regions = regions;
    }

    public ShowControlsForOrganizationalUnitResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 是否允许启用控制策略。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowControlsForOrganizationalUnitResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 状态说明。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowControlsForOrganizationalUnitResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 控制策略当前版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowControlsForOrganizationalUnitResponse that = (ShowControlsForOrganizationalUnitResponse) obj;
        return Objects.equals(this.control, that.control) && Objects.equals(this.regions, that.regions)
            && Objects.equals(this.state, that.state) && Objects.equals(this.message, that.message)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(control, regions, state, message, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowControlsForOrganizationalUnitResponse {\n");
        sb.append("    control: ").append(toIndentedString(control)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
