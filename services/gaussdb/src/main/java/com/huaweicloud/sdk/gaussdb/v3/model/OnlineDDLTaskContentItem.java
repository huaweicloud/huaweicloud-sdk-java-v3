package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OnlineDDLTaskContentItem
 */
public class OnlineDDLTaskContentItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_info")

    private List<OnlineDDLInfoItem> ddlInfo = null;

    public OnlineDDLTaskContentItem withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * **参数解释**：  无锁变更的目标数据库。  **取值范围**： 不涉及。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public OnlineDDLTaskContentItem withDdlInfo(List<OnlineDDLInfoItem> ddlInfo) {
        this.ddlInfo = ddlInfo;
        return this;
    }

    public OnlineDDLTaskContentItem addDdlInfoItem(OnlineDDLInfoItem ddlInfoItem) {
        if (this.ddlInfo == null) {
            this.ddlInfo = new ArrayList<>();
        }
        this.ddlInfo.add(ddlInfoItem);
        return this;
    }

    public OnlineDDLTaskContentItem withDdlInfo(Consumer<List<OnlineDDLInfoItem>> ddlInfoSetter) {
        if (this.ddlInfo == null) {
            this.ddlInfo = new ArrayList<>();
        }
        ddlInfoSetter.accept(this.ddlInfo);
        return this;
    }

    /**
     * **参数解释**：  无锁变更的DDL信息。
     * @return ddlInfo
     */
    public List<OnlineDDLInfoItem> getDdlInfo() {
        return ddlInfo;
    }

    public void setDdlInfo(List<OnlineDDLInfoItem> ddlInfo) {
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
        OnlineDDLTaskContentItem that = (OnlineDDLTaskContentItem) obj;
        return Objects.equals(this.schema, that.schema) && Objects.equals(this.ddlInfo, that.ddlInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema, ddlInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OnlineDDLTaskContentItem {\n");
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
