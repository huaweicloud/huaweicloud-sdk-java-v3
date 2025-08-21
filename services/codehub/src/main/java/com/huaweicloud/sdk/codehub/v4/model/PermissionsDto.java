package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PermissionsDto
 */
public class PermissionsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_access")

    private MemberAccess repositoryAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_access")

    private MemberAccess groupAccess;

    public PermissionsDto withRepositoryAccess(MemberAccess repositoryAccess) {
        this.repositoryAccess = repositoryAccess;
        return this;
    }

    public PermissionsDto withRepositoryAccess(Consumer<MemberAccess> repositoryAccessSetter) {
        if (this.repositoryAccess == null) {
            this.repositoryAccess = new MemberAccess();
            repositoryAccessSetter.accept(this.repositoryAccess);
        }

        return this;
    }

    /**
     * Get repositoryAccess
     * @return repositoryAccess
     */
    public MemberAccess getRepositoryAccess() {
        return repositoryAccess;
    }

    public void setRepositoryAccess(MemberAccess repositoryAccess) {
        this.repositoryAccess = repositoryAccess;
    }

    public PermissionsDto withGroupAccess(MemberAccess groupAccess) {
        this.groupAccess = groupAccess;
        return this;
    }

    public PermissionsDto withGroupAccess(Consumer<MemberAccess> groupAccessSetter) {
        if (this.groupAccess == null) {
            this.groupAccess = new MemberAccess();
            groupAccessSetter.accept(this.groupAccess);
        }

        return this;
    }

    /**
     * Get groupAccess
     * @return groupAccess
     */
    public MemberAccess getGroupAccess() {
        return groupAccess;
    }

    public void setGroupAccess(MemberAccess groupAccess) {
        this.groupAccess = groupAccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionsDto that = (PermissionsDto) obj;
        return Objects.equals(this.repositoryAccess, that.repositoryAccess)
            && Objects.equals(this.groupAccess, that.groupAccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryAccess, groupAccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionsDto {\n");
        sb.append("    repositoryAccess: ").append(toIndentedString(repositoryAccess)).append("\n");
        sb.append("    groupAccess: ").append(toIndentedString(groupAccess)).append("\n");
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
