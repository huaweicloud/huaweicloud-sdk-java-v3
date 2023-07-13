package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUserSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private Operation operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "settings")

    private UserSettingDto settings;

    public ShowUserSettingResponse withOperation(Operation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation
     * @return operation
     */
    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public ShowUserSettingResponse withSettings(UserSettingDto settings) {
        this.settings = settings;
        return this;
    }

    public ShowUserSettingResponse withSettings(Consumer<UserSettingDto> settingsSetter) {
        if (this.settings == null) {
            this.settings = new UserSettingDto();
            settingsSetter.accept(this.settings);
        }

        return this;
    }

    /**
     * Get settings
     * @return settings
     */
    public UserSettingDto getSettings() {
        return settings;
    }

    public void setSettings(UserSettingDto settings) {
        this.settings = settings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserSettingResponse that = (ShowUserSettingResponse) obj;
        return Objects.equals(this.operation, that.operation) && Objects.equals(this.settings, that.settings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, settings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserSettingResponse {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
