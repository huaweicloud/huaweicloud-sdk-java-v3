package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * A unique identifier for a user or group that is not the its primary identifier.This value can be an identifier from an external identity provider (IdP) that is associated with the group or a unique attribute.
 */
public class AlternateIdentifierDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_id")

    private ExternalIdDto externalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_attribute")

    private UniqueAttributeDto uniqueAttribute;

    public AlternateIdentifierDto withExternalId(ExternalIdDto externalId) {
        this.externalId = externalId;
        return this;
    }

    public AlternateIdentifierDto withExternalId(Consumer<ExternalIdDto> externalIdSetter) {
        if (this.externalId == null) {
            this.externalId = new ExternalIdDto();
            externalIdSetter.accept(this.externalId);
        }

        return this;
    }

    /**
     * Get externalId
     * @return externalId
     */
    public ExternalIdDto getExternalId() {
        return externalId;
    }

    public void setExternalId(ExternalIdDto externalId) {
        this.externalId = externalId;
    }

    public AlternateIdentifierDto withUniqueAttribute(UniqueAttributeDto uniqueAttribute) {
        this.uniqueAttribute = uniqueAttribute;
        return this;
    }

    public AlternateIdentifierDto withUniqueAttribute(Consumer<UniqueAttributeDto> uniqueAttributeSetter) {
        if (this.uniqueAttribute == null) {
            this.uniqueAttribute = new UniqueAttributeDto();
            uniqueAttributeSetter.accept(this.uniqueAttribute);
        }

        return this;
    }

    /**
     * Get uniqueAttribute
     * @return uniqueAttribute
     */
    public UniqueAttributeDto getUniqueAttribute() {
        return uniqueAttribute;
    }

    public void setUniqueAttribute(UniqueAttributeDto uniqueAttribute) {
        this.uniqueAttribute = uniqueAttribute;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlternateIdentifierDto that = (AlternateIdentifierDto) obj;
        return Objects.equals(this.externalId, that.externalId)
            && Objects.equals(this.uniqueAttribute, that.uniqueAttribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalId, uniqueAttribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlternateIdentifierDto {\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    uniqueAttribute: ").append(toIndentedString(uniqueAttribute)).append("\n");
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
