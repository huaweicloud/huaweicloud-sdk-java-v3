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
public class ShowControlsForOrganizationUnitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control")

    private EnabledControl control;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<String> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_message")

    private String stateMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ShowControlsForOrganizationUnitResponse withControl(EnabledControl control) {
        this.control = control;
        return this;
    }

    public ShowControlsForOrganizationUnitResponse withControl(Consumer<EnabledControl> controlSetter) {
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

    public ShowControlsForOrganizationUnitResponse withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public ShowControlsForOrganizationUnitResponse addRegionsItem(String regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ShowControlsForOrganizationUnitResponse withRegions(Consumer<List<String>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 开启的区域。
     * @return regions
     */
    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public ShowControlsForOrganizationUnitResponse withState(String state) {
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

    public ShowControlsForOrganizationUnitResponse withStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        return this;
    }

    /**
     * 状态说明。
     * @return stateMessage
     */
    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    public ShowControlsForOrganizationUnitResponse withVersion(String version) {
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
        ShowControlsForOrganizationUnitResponse that = (ShowControlsForOrganizationUnitResponse) obj;
        return Objects.equals(this.control, that.control) && Objects.equals(this.regions, that.regions)
            && Objects.equals(this.state, that.state) && Objects.equals(this.stateMessage, that.stateMessage)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(control, regions, state, stateMessage, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowControlsForOrganizationUnitResponse {\n");
        sb.append("    control: ").append(toIndentedString(control)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateMessage: ").append(toIndentedString(stateMessage)).append("\n");
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
