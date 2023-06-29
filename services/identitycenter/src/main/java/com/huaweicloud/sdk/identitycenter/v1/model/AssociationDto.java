package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssociationDto
 */
public class AssociationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessor")

    private AccessorDto accessor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_id")

    private String profileId;

    public AssociationDto withAccessor(AccessorDto accessor) {
        this.accessor = accessor;
        return this;
    }

    public AssociationDto withAccessor(Consumer<AccessorDto> accessorSetter) {
        if (this.accessor == null) {
            this.accessor = new AccessorDto();
            accessorSetter.accept(this.accessor);
        }

        return this;
    }

    /**
     * Get accessor
     * @return accessor
     */
    public AccessorDto getAccessor() {
        return accessor;
    }

    public void setAccessor(AccessorDto accessor) {
        this.accessor = accessor;
    }

    public AssociationDto withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AssociationDto withProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }

    /**
     * Get profileId
     * @return profileId
     */
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociationDto that = (AssociationDto) obj;
        return Objects.equals(this.accessor, that.accessor) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.profileId, that.profileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessor, instanceId, profileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociationDto {\n");
        sb.append("    accessor: ").append(toIndentedString(accessor)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
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
