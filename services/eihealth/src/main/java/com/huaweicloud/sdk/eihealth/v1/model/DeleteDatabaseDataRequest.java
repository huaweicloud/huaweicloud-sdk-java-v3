package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDatabaseDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_id")

    private String databaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_num")

    private Long rowNum;

    public DeleteDatabaseDataRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 平台项目ID，您可以在平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public DeleteDatabaseDataRequest withDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * 数据库实例id
     * @return databaseId
     */
    public String getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    public DeleteDatabaseDataRequest withRowNum(Long rowNum) {
        this.rowNum = rowNum;
        return this;
    }

    /**
     * 数据的行号，即_row_num值
     * minimum: 0
     * maximum: 2147483647
     * @return rowNum
     */
    public Long getRowNum() {
        return rowNum;
    }

    public void setRowNum(Long rowNum) {
        this.rowNum = rowNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDatabaseDataRequest that = (DeleteDatabaseDataRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId)
            && Objects.equals(this.databaseId, that.databaseId) && Objects.equals(this.rowNum, that.rowNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, databaseId, rowNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDatabaseDataRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
        sb.append("    rowNum: ").append(toIndentedString(rowNum)).append("\n");
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
