package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库对象信息体
 */
public class DatabaseObjectVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select")

    private String select;

    public DatabaseObjectVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库对象和数据库表名称，例如格式为hec-*-*-drs_test1。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DatabaseObjectVO withSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * 是否选择高级配置，值为true。
     * @return select
     */
    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseObjectVO databaseObjectVO = (DatabaseObjectVO) o;
        return Objects.equals(this.id, databaseObjectVO.id) && Objects.equals(this.select, databaseObjectVO.select);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, select);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseObjectVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    select: ").append(toIndentedString(select)).append("\n");
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
