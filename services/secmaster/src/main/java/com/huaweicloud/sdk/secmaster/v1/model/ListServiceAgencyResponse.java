package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ListServiceAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_agency")

    private Boolean createAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_descriptions")

    private List<Role> roleDescriptions = null;

    public ListServiceAgencyResponse withCreateAgency(Boolean createAgency) {
        this.createAgency = createAgency;
        return this;
    }

    /**
     * 当前账号是否已创建云服务关联委托
     * @return createAgency
     */
    public Boolean getCreateAgency() {
        return createAgency;
    }

    public void setCreateAgency(Boolean createAgency) {
        this.createAgency = createAgency;
    }

    public ListServiceAgencyResponse withRoleDescriptions(List<Role> roleDescriptions) {
        this.roleDescriptions = roleDescriptions;
        return this;
    }

    public ListServiceAgencyResponse addRoleDescriptionsItem(Role roleDescriptionsItem) {
        if (this.roleDescriptions == null) {
            this.roleDescriptions = new ArrayList<>();
        }
        this.roleDescriptions.add(roleDescriptionsItem);
        return this;
    }

    public ListServiceAgencyResponse withRoleDescriptions(Consumer<List<Role>> roleDescriptionsSetter) {
        if (this.roleDescriptions == null) {
            this.roleDescriptions = new ArrayList<>();
        }
        roleDescriptionsSetter.accept(this.roleDescriptions);
        return this;
    }

    /**
     * 角色列表
     * @return roleDescriptions
     */
    public List<Role> getRoleDescriptions() {
        return roleDescriptions;
    }

    public void setRoleDescriptions(List<Role> roleDescriptions) {
        this.roleDescriptions = roleDescriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServiceAgencyResponse that = (ListServiceAgencyResponse) obj;
        return Objects.equals(this.createAgency, that.createAgency)
            && Objects.equals(this.roleDescriptions, that.roleDescriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createAgency, roleDescriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceAgencyResponse {\n");
        sb.append("    createAgency: ").append(toIndentedString(createAgency)).append("\n");
        sb.append("    roleDescriptions: ").append(toIndentedString(roleDescriptions)).append("\n");
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
