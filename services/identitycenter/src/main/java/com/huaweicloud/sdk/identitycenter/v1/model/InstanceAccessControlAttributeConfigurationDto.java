package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Specifies the attributes to add to your attribute-based access control (ABAC) configuration.
 */
public class InstanceAccessControlAttributeConfigurationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control_attributes")

    private List<AccessControlAttributeDto> accessControlAttributes = null;

    public InstanceAccessControlAttributeConfigurationDto withAccessControlAttributes(
        List<AccessControlAttributeDto> accessControlAttributes) {
        this.accessControlAttributes = accessControlAttributes;
        return this;
    }

    public InstanceAccessControlAttributeConfigurationDto addAccessControlAttributesItem(
        AccessControlAttributeDto accessControlAttributesItem) {
        if (this.accessControlAttributes == null) {
            this.accessControlAttributes = new ArrayList<>();
        }
        this.accessControlAttributes.add(accessControlAttributesItem);
        return this;
    }

    public InstanceAccessControlAttributeConfigurationDto withAccessControlAttributes(
        Consumer<List<AccessControlAttributeDto>> accessControlAttributesSetter) {
        if (this.accessControlAttributes == null) {
            this.accessControlAttributes = new ArrayList<>();
        }
        accessControlAttributesSetter.accept(this.accessControlAttributes);
        return this;
    }

    /**
     * IAM Identity Center实例中ABAC配置的属性
     * @return accessControlAttributes
     */
    public List<AccessControlAttributeDto> getAccessControlAttributes() {
        return accessControlAttributes;
    }

    public void setAccessControlAttributes(List<AccessControlAttributeDto> accessControlAttributes) {
        this.accessControlAttributes = accessControlAttributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceAccessControlAttributeConfigurationDto that = (InstanceAccessControlAttributeConfigurationDto) obj;
        return Objects.equals(this.accessControlAttributes, that.accessControlAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessControlAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceAccessControlAttributeConfigurationDto {\n");
        sb.append("    accessControlAttributes: ").append(toIndentedString(accessControlAttributes)).append("\n");
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
