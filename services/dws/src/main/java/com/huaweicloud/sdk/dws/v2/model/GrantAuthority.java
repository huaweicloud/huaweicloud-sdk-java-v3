package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 权限详情。 **取值范围**： 不涉及。
 */
public class GrantAuthority {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_name")

    private String objName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_object")

    private Boolean allObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "future")

    private Boolean future;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "future_object_owners")

    private String futureObjectOwners;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private List<String> columnName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    private List<Grant> privileges = null;

    public GrantAuthority withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 权限类型。 **取值范围**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GrantAuthority withDatabase(String database) {
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

    public GrantAuthority withSchema(String schema) {
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

    public GrantAuthority withObjName(String objName) {
        this.objName = objName;
        return this;
    }

    /**
     * **参数解释**： 对象名称。 **取值范围**： 不涉及。
     * @return objName
     */
    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public GrantAuthority withAllObject(Boolean allObject) {
        this.allObject = allObject;
        return this;
    }

    /**
     * **参数解释**： 是否所有对象生效。 **取值范围**： 不涉及。
     * @return allObject
     */
    public Boolean getAllObject() {
        return allObject;
    }

    public void setAllObject(Boolean allObject) {
        this.allObject = allObject;
    }

    public GrantAuthority withFuture(Boolean future) {
        this.future = future;
        return this;
    }

    /**
     * **参数解释**： 是否对未来对象生效。 **取值范围**： 不涉及。
     * @return future
     */
    public Boolean getFuture() {
        return future;
    }

    public void setFuture(Boolean future) {
        this.future = future;
    }

    public GrantAuthority withFutureObjectOwners(String futureObjectOwners) {
        this.futureObjectOwners = futureObjectOwners;
        return this;
    }

    /**
     * **参数解释**： 未来对象-所属用户。 **取值范围**： 不涉及。
     * @return futureObjectOwners
     */
    public String getFutureObjectOwners() {
        return futureObjectOwners;
    }

    public void setFutureObjectOwners(String futureObjectOwners) {
        this.futureObjectOwners = futureObjectOwners;
    }

    public GrantAuthority withColumnName(List<String> columnName) {
        this.columnName = columnName;
        return this;
    }

    public GrantAuthority addColumnNameItem(String columnNameItem) {
        if (this.columnName == null) {
            this.columnName = new ArrayList<>();
        }
        this.columnName.add(columnNameItem);
        return this;
    }

    public GrantAuthority withColumnName(Consumer<List<String>> columnNameSetter) {
        if (this.columnName == null) {
            this.columnName = new ArrayList<>();
        }
        columnNameSetter.accept(this.columnName);
        return this;
    }

    /**
     * **参数解释**： 列名。 **取值范围**： 不涉及。
     * @return columnName
     */
    public List<String> getColumnName() {
        return columnName;
    }

    public void setColumnName(List<String> columnName) {
        this.columnName = columnName;
    }

    public GrantAuthority withPrivileges(List<Grant> privileges) {
        this.privileges = privileges;
        return this;
    }

    public GrantAuthority addPrivilegesItem(Grant privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public GrantAuthority withPrivileges(Consumer<List<Grant>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * **参数解释**： 权限。 **取值范围**： 不涉及。
     * @return privileges
     */
    public List<Grant> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Grant> privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GrantAuthority that = (GrantAuthority) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.database, that.database)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.objName, that.objName)
            && Objects.equals(this.allObject, that.allObject) && Objects.equals(this.future, that.future)
            && Objects.equals(this.futureObjectOwners, that.futureObjectOwners)
            && Objects.equals(this.columnName, that.columnName) && Objects.equals(this.privileges, that.privileges);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, database, schema, objName, allObject, future, futureObjectOwners, columnName, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrantAuthority {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
        sb.append("    allObject: ").append(toIndentedString(allObject)).append("\n");
        sb.append("    future: ").append(toIndentedString(future)).append("\n");
        sb.append("    futureObjectOwners: ").append(toIndentedString(futureObjectOwners)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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
