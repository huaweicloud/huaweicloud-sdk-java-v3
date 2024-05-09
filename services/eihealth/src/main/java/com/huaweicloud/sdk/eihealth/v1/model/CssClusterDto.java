package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * css集群详情
 */
public class CssClusterDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Integer storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_time")

    private String importTime;

    public CssClusterDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 已绑定的集群id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CssClusterDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * css集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CssClusterDto withStorage(Integer storage) {
        this.storage = storage;
        return this;
    }

    /**
     * css集群总存储
     * @return storage
     */
    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public CssClusterDto withImportTime(String importTime) {
        this.importTime = importTime;
        return this;
    }

    /**
     * css集群导入时间
     * @return importTime
     */
    public String getImportTime() {
        return importTime;
    }

    public void setImportTime(String importTime) {
        this.importTime = importTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CssClusterDto that = (CssClusterDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.storage, that.storage) && Objects.equals(this.importTime, that.importTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, storage, importTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CssClusterDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    importTime: ").append(toIndentedString(importTime)).append("\n");
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
