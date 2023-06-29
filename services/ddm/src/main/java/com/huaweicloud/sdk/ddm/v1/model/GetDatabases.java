package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * databases返回参数
 */
public class GetDatabases {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbslot")

    private Integer dbslot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idName")

    private String idName;

    public GetDatabases withDbslot(Integer dbslot) {
        this.dbslot = dbslot;
        return this;
    }

    /**
     * 分片数。
     * @return dbslot
     */
    public Integer getDbslot() {
        return dbslot;
    }

    public void setDbslot(Integer dbslot) {
        this.dbslot = dbslot;
    }

    public GetDatabases withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分片名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetDatabases withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetDatabases withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public GetDatabases withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 最近更新时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public GetDatabases withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 所在RDS的id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetDatabases withIdName(String idName) {
        this.idName = idName;
        return this;
    }

    /**
     * 所在RDS的名称。
     * @return idName
     */
    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetDatabases that = (GetDatabases) obj;
        return Objects.equals(this.dbslot, that.dbslot) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.id, that.id)
            && Objects.equals(this.idName, that.idName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbslot, name, status, created, updated, id, idName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDatabases {\n");
        sb.append("    dbslot: ").append(toIndentedString(dbslot)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idName: ").append(toIndentedString(idName)).append("\n");
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
