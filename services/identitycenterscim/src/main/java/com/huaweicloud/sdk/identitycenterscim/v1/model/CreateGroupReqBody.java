package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateGroupReqBody
 */
public class CreateGroupReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "externalId")

    private String externalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayName")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<MemberItemDto> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<String> schemas = null;

    public CreateGroupReqBody withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * 外部标识符
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public CreateGroupReqBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 包含用户组显示名称的字符串
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateGroupReqBody withMembers(List<MemberItemDto> members) {
        this.members = members;
        return this;
    }

    public CreateGroupReqBody addMembersItem(MemberItemDto membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public CreateGroupReqBody withMembers(Consumer<List<MemberItemDto>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * 用户组中的成员对象列表
     * @return members
     */
    public List<MemberItemDto> getMembers() {
        return members;
    }

    public void setMembers(List<MemberItemDto> members) {
        this.members = members;
    }

    public CreateGroupReqBody withSchemas(List<String> schemas) {
        this.schemas = schemas;
        return this;
    }

    public CreateGroupReqBody addSchemasItem(String schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public CreateGroupReqBody withSchemas(Consumer<List<String>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * 概要
     * @return schemas
     */
    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGroupReqBody that = (CreateGroupReqBody) obj;
        return Objects.equals(this.externalId, that.externalId) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.members, that.members) && Objects.equals(this.schemas, that.schemas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalId, displayName, members, schemas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGroupReqBody {\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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
