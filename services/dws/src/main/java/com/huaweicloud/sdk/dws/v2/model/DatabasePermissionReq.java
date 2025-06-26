package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 数据库权限请求。 **取值范围**： 不涉及。
 */
public class DatabasePermissionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_grant")

    private Boolean isGrant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_list")

    private List<Grant> grantList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revoke_list")

    private List<Revoke> revokeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_list")

    private List<String> roleList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_list")

    private List<String> objectList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_object")

    private Boolean allObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade")

    private Boolean cascade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    public DatabasePermissionReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 对象类型。 **取值范围**： DATABASE、SCHEMA、TABLE、VIEW、COLUMN、FUNCTION、SEQUENCE、NODEGROUP、ROLE。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DatabasePermissionReq withIsGrant(Boolean isGrant) {
        this.isGrant = isGrant;
        return this;
    }

    /**
     * **参数解释**： 是否授权操作。 **取值范围**： 不涉及。
     * @return isGrant
     */
    public Boolean getIsGrant() {
        return isGrant;
    }

    public void setIsGrant(Boolean isGrant) {
        this.isGrant = isGrant;
    }

    public DatabasePermissionReq withGrantList(List<Grant> grantList) {
        this.grantList = grantList;
        return this;
    }

    public DatabasePermissionReq addGrantListItem(Grant grantListItem) {
        if (this.grantList == null) {
            this.grantList = new ArrayList<>();
        }
        this.grantList.add(grantListItem);
        return this;
    }

    public DatabasePermissionReq withGrantList(Consumer<List<Grant>> grantListSetter) {
        if (this.grantList == null) {
            this.grantList = new ArrayList<>();
        }
        grantListSetter.accept(this.grantList);
        return this;
    }

    /**
     * **参数解释**： 授权列表。is_grant为true时必填。 **取值范围**： 不涉及。
     * @return grantList
     */
    public List<Grant> getGrantList() {
        return grantList;
    }

    public void setGrantList(List<Grant> grantList) {
        this.grantList = grantList;
    }

    public DatabasePermissionReq withRevokeList(List<Revoke> revokeList) {
        this.revokeList = revokeList;
        return this;
    }

    public DatabasePermissionReq addRevokeListItem(Revoke revokeListItem) {
        if (this.revokeList == null) {
            this.revokeList = new ArrayList<>();
        }
        this.revokeList.add(revokeListItem);
        return this;
    }

    public DatabasePermissionReq withRevokeList(Consumer<List<Revoke>> revokeListSetter) {
        if (this.revokeList == null) {
            this.revokeList = new ArrayList<>();
        }
        revokeListSetter.accept(this.revokeList);
        return this;
    }

    /**
     * **参数解释**： 撤销权限列表。is_grant为false时必填。 **取值范围**： 不涉及。
     * @return revokeList
     */
    public List<Revoke> getRevokeList() {
        return revokeList;
    }

    public void setRevokeList(List<Revoke> revokeList) {
        this.revokeList = revokeList;
    }

    public DatabasePermissionReq withRoleList(List<String> roleList) {
        this.roleList = roleList;
        return this;
    }

    public DatabasePermissionReq addRoleListItem(String roleListItem) {
        if (this.roleList == null) {
            this.roleList = new ArrayList<>();
        }
        this.roleList.add(roleListItem);
        return this;
    }

    public DatabasePermissionReq withRoleList(Consumer<List<String>> roleListSetter) {
        if (this.roleList == null) {
            this.roleList = new ArrayList<>();
        }
        roleListSetter.accept(this.roleList);
        return this;
    }

    /**
     * **参数解释**： 被授权角色列表。 **取值范围**： 不涉及。
     * @return roleList
     */
    public List<String> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<String> roleList) {
        this.roleList = roleList;
    }

    public DatabasePermissionReq withObjectList(List<String> objectList) {
        this.objectList = objectList;
        return this;
    }

    public DatabasePermissionReq addObjectListItem(String objectListItem) {
        if (this.objectList == null) {
            this.objectList = new ArrayList<>();
        }
        this.objectList.add(objectListItem);
        return this;
    }

    public DatabasePermissionReq withObjectList(Consumer<List<String>> objectListSetter) {
        if (this.objectList == null) {
            this.objectList = new ArrayList<>();
        }
        objectListSetter.accept(this.objectList);
        return this;
    }

    /**
     * **参数解释**： 权限所属对象列表。 **取值范围**： 不涉及。
     * @return objectList
     */
    public List<String> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<String> objectList) {
        this.objectList = objectList;
    }

    public DatabasePermissionReq withAllObject(Boolean allObject) {
        this.allObject = allObject;
        return this;
    }

    /**
     * **参数解释**： schema下所有数据库对象权限，默认false。 **取值范围**： 不涉及。
     * @return allObject
     */
    public Boolean getAllObject() {
        return allObject;
    }

    public void setAllObject(Boolean allObject) {
        this.allObject = allObject;
    }

    public DatabasePermissionReq withCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }

    /**
     * **参数解释**： 撤销权限是否级联撤销，默认true。 **取值范围**： 不涉及。
     * @return cascade
     */
    public Boolean getCascade() {
        return cascade;
    }

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }

    public DatabasePermissionReq withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释**： 数据库名称。 **取值范围**： 不涉及。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public DatabasePermissionReq withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * **参数解释**： 模式名称。 **取值范围**： 不涉及。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public DatabasePermissionReq withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * **参数解释**： 表名。 **取值范围**： 不涉及。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabasePermissionReq that = (DatabasePermissionReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.isGrant, that.isGrant)
            && Objects.equals(this.grantList, that.grantList) && Objects.equals(this.revokeList, that.revokeList)
            && Objects.equals(this.roleList, that.roleList) && Objects.equals(this.objectList, that.objectList)
            && Objects.equals(this.allObject, that.allObject) && Objects.equals(this.cascade, that.cascade)
            && Objects.equals(this.database, that.database) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.table, that.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            isGrant,
            grantList,
            revokeList,
            roleList,
            objectList,
            allObject,
            cascade,
            database,
            schema,
            table);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabasePermissionReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isGrant: ").append(toIndentedString(isGrant)).append("\n");
        sb.append("    grantList: ").append(toIndentedString(grantList)).append("\n");
        sb.append("    revokeList: ").append(toIndentedString(revokeList)).append("\n");
        sb.append("    roleList: ").append(toIndentedString(roleList)).append("\n");
        sb.append("    objectList: ").append(toIndentedString(objectList)).append("\n");
        sb.append("    allObject: ").append(toIndentedString(allObject)).append("\n");
        sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
