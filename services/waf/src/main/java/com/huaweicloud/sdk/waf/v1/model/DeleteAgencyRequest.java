package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteAgencyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "purged")

    private Boolean purged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id_list")

    private List<String> roleIdList = null;

    public DeleteAgencyRequest withPurged(Boolean purged) {
        this.purged = purged;
        return this;
    }

    /**
     * **参数解释：** 独享引擎操作 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return purged
     */
    public Boolean getPurged() {
        return purged;
    }

    public void setPurged(Boolean purged) {
        this.purged = purged;
    }

    public DeleteAgencyRequest withRoleIdList(List<String> roleIdList) {
        this.roleIdList = roleIdList;
        return this;
    }

    public DeleteAgencyRequest addRoleIdListItem(String roleIdListItem) {
        if (this.roleIdList == null) {
            this.roleIdList = new ArrayList<>();
        }
        this.roleIdList.add(roleIdListItem);
        return this;
    }

    public DeleteAgencyRequest withRoleIdList(Consumer<List<String>> roleIdListSetter) {
        if (this.roleIdList == null) {
            this.roleIdList = new ArrayList<>();
        }
        roleIdListSetter.accept(this.roleIdList);
        return this;
    }

    /**
     * **参数解释：** 待删除的代理id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return roleIdList
     */
    public List<String> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<String> roleIdList) {
        this.roleIdList = roleIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAgencyRequest that = (DeleteAgencyRequest) obj;
        return Objects.equals(this.purged, that.purged) && Objects.equals(this.roleIdList, that.roleIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purged, roleIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAgencyRequest {\n");
        sb.append("    purged: ").append(toIndentedString(purged)).append("\n");
        sb.append("    roleIdList: ").append(toIndentedString(roleIdList)).append("\n");
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
