package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RoleBasicDto
 */
public class RoleBasicDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_role_id")

    private String relatedRoleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chinese_name")

    private String chineseName;

    public RoleBasicDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 角色唯一标识。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoleBasicDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 角色名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleBasicDto withRelatedRoleId(String relatedRoleId) {
        this.relatedRoleId = relatedRoleId;
        return this;
    }

    /**
     * **参数解释：** 角色id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return relatedRoleId
     */
    public String getRelatedRoleId() {
        return relatedRoleId;
    }

    public void setRelatedRoleId(String relatedRoleId) {
        this.relatedRoleId = relatedRoleId;
    }

    public RoleBasicDto withChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }

    /**
     * **参数解释：** 角色中文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return chineseName
     */
    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleBasicDto that = (RoleBasicDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.relatedRoleId, that.relatedRoleId)
            && Objects.equals(this.chineseName, that.chineseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, relatedRoleId, chineseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleBasicDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    relatedRoleId: ").append(toIndentedString(relatedRoleId)).append("\n");
        sb.append("    chineseName: ").append(toIndentedString(chineseName)).append("\n");
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
