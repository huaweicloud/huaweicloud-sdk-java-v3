package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskContentItem
 */
public class TaskContentItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_info")

    private List<DDLInfoItem> ddlInfo = null;

    public TaskContentItem withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * **参数解释**：  无锁变更的目标数据库。  **约束限制**： 不涉及。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public TaskContentItem withDdlInfo(List<DDLInfoItem> ddlInfo) {
        this.ddlInfo = ddlInfo;
        return this;
    }

    public TaskContentItem addDdlInfoItem(DDLInfoItem ddlInfoItem) {
        if (this.ddlInfo == null) {
            this.ddlInfo = new ArrayList<>();
        }
        this.ddlInfo.add(ddlInfoItem);
        return this;
    }

    public TaskContentItem withDdlInfo(Consumer<List<DDLInfoItem>> ddlInfoSetter) {
        if (this.ddlInfo == null) {
            this.ddlInfo = new ArrayList<>();
        }
        ddlInfoSetter.accept(this.ddlInfo);
        return this;
    }

    /**
     * **参数解释**：  无锁变更的DDL信息，包含临时表名。  **约束限制**： 不涉及。
     * @return ddlInfo
     */
    public List<DDLInfoItem> getDdlInfo() {
        return ddlInfo;
    }

    public void setDdlInfo(List<DDLInfoItem> ddlInfo) {
        this.ddlInfo = ddlInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskContentItem that = (TaskContentItem) obj;
        return Objects.equals(this.schema, that.schema) && Objects.equals(this.ddlInfo, that.ddlInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema, ddlInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskContentItem {\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    ddlInfo: ").append(toIndentedString(ddlInfo)).append("\n");
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
