package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新账号的基本信息。
 */
public class UpdateManagedAccountRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organizational_unit_id")

    private String parentOrganizationalUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organizational_unit_name")

    private String parentOrganizationalUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint")

    private Blueprint blueprint;

    public UpdateManagedAccountRequestBody withParentOrganizationalUnitId(String parentOrganizationalUnitId) {
        this.parentOrganizationalUnitId = parentOrganizationalUnitId;
        return this;
    }

    /**
     * 父注册OU ID。
     * @return parentOrganizationalUnitId
     */
    public String getParentOrganizationalUnitId() {
        return parentOrganizationalUnitId;
    }

    public void setParentOrganizationalUnitId(String parentOrganizationalUnitId) {
        this.parentOrganizationalUnitId = parentOrganizationalUnitId;
    }

    public UpdateManagedAccountRequestBody withParentOrganizationalUnitName(String parentOrganizationalUnitName) {
        this.parentOrganizationalUnitName = parentOrganizationalUnitName;
        return this;
    }

    /**
     * 父注册OU名称。
     * @return parentOrganizationalUnitName
     */
    public String getParentOrganizationalUnitName() {
        return parentOrganizationalUnitName;
    }

    public void setParentOrganizationalUnitName(String parentOrganizationalUnitName) {
        this.parentOrganizationalUnitName = parentOrganizationalUnitName;
    }

    public UpdateManagedAccountRequestBody withBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
        return this;
    }

    public UpdateManagedAccountRequestBody withBlueprint(Consumer<Blueprint> blueprintSetter) {
        if (this.blueprint == null) {
            this.blueprint = new Blueprint();
            blueprintSetter.accept(this.blueprint);
        }

        return this;
    }

    /**
     * Get blueprint
     * @return blueprint
     */
    public Blueprint getBlueprint() {
        return blueprint;
    }

    public void setBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateManagedAccountRequestBody that = (UpdateManagedAccountRequestBody) obj;
        return Objects.equals(this.parentOrganizationalUnitId, that.parentOrganizationalUnitId)
            && Objects.equals(this.parentOrganizationalUnitName, that.parentOrganizationalUnitName)
            && Objects.equals(this.blueprint, that.blueprint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentOrganizationalUnitId, parentOrganizationalUnitName, blueprint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateManagedAccountRequestBody {\n");
        sb.append("    parentOrganizationalUnitId: ").append(toIndentedString(parentOrganizationalUnitId)).append("\n");
        sb.append("    parentOrganizationalUnitName: ")
            .append(toIndentedString(parentOrganizationalUnitName))
            .append("\n");
        sb.append("    blueprint: ").append(toIndentedString(blueprint)).append("\n");
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
