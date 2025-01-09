package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowAgencyInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_existed")

    private Boolean isExisted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<AgencyRole> roles = null;

    public ShowAgencyInfoResponse withIsExisted(Boolean isExisted) {
        this.isExisted = isExisted;
        return this;
    }

    /**
     * 委托是否存在。
     * @return isExisted
     */
    public Boolean getIsExisted() {
        return isExisted;
    }

    public void setIsExisted(Boolean isExisted) {
        this.isExisted = isExisted;
    }

    public ShowAgencyInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 委托名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAgencyInfoResponse withRoles(List<AgencyRole> roles) {
        this.roles = roles;
        return this;
    }

    public ShowAgencyInfoResponse addRolesItem(AgencyRole rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ShowAgencyInfoResponse withRoles(Consumer<List<AgencyRole>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 委托绑定的权限策略信息。
     * @return roles
     */
    public List<AgencyRole> getRoles() {
        return roles;
    }

    public void setRoles(List<AgencyRole> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgencyInfoResponse that = (ShowAgencyInfoResponse) obj;
        return Objects.equals(this.isExisted, that.isExisted) && Objects.equals(this.name, that.name)
            && Objects.equals(this.roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isExisted, name, roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgencyInfoResponse {\n");
        sb.append("    isExisted: ").append(toIndentedString(isExisted)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
