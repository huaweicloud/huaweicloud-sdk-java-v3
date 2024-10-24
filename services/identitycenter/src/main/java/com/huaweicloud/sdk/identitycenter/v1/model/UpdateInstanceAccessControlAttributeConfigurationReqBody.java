package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * the request body of UpdateInstanceAccessControlAttributeConfiguration
 */
public class UpdateInstanceAccessControlAttributeConfigurationReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_access_control_attribute_configuration")

    private InstanceAccessControlAttributeConfigurationDto instanceAccessControlAttributeConfiguration;

    public UpdateInstanceAccessControlAttributeConfigurationReqBody withInstanceAccessControlAttributeConfiguration(
        InstanceAccessControlAttributeConfigurationDto instanceAccessControlAttributeConfiguration) {
        this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
        return this;
    }

    public UpdateInstanceAccessControlAttributeConfigurationReqBody withInstanceAccessControlAttributeConfiguration(
        Consumer<InstanceAccessControlAttributeConfigurationDto> instanceAccessControlAttributeConfigurationSetter) {
        if (this.instanceAccessControlAttributeConfiguration == null) {
            this.instanceAccessControlAttributeConfiguration = new InstanceAccessControlAttributeConfigurationDto();
            instanceAccessControlAttributeConfigurationSetter.accept(this.instanceAccessControlAttributeConfiguration);
        }

        return this;
    }

    /**
     * Get instanceAccessControlAttributeConfiguration
     * @return instanceAccessControlAttributeConfiguration
     */
    public InstanceAccessControlAttributeConfigurationDto getInstanceAccessControlAttributeConfiguration() {
        return instanceAccessControlAttributeConfiguration;
    }

    public void setInstanceAccessControlAttributeConfiguration(
        InstanceAccessControlAttributeConfigurationDto instanceAccessControlAttributeConfiguration) {
        this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceAccessControlAttributeConfigurationReqBody that =
            (UpdateInstanceAccessControlAttributeConfigurationReqBody) obj;
        return Objects.equals(this.instanceAccessControlAttributeConfiguration,
            that.instanceAccessControlAttributeConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceAccessControlAttributeConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceAccessControlAttributeConfigurationReqBody {\n");
        sb.append("    instanceAccessControlAttributeConfiguration: ")
            .append(toIndentedString(instanceAccessControlAttributeConfiguration))
            .append("\n");
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
