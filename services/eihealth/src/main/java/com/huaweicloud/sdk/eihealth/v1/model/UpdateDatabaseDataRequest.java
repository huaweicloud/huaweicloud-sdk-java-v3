package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDatabaseDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_id")

    private String databaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_num")

    private Long rowNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RowDataReq body;

    public UpdateDatabaseDataRequest withEihealthProjectId(String eihealthProjectId) {
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

    public UpdateDatabaseDataRequest withDatabaseId(String databaseId) {
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

    public UpdateDatabaseDataRequest withRowNum(Long rowNum) {
        this.rowNum = rowNum;
        return this;
    }

    /**
     * 数据行号，即_row_num值
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

    public UpdateDatabaseDataRequest withBody(RowDataReq body) {
        this.body = body;
        return this;
    }

    public UpdateDatabaseDataRequest withBody(Consumer<RowDataReq> bodySetter) {
        if (this.body == null) {
            this.body = new RowDataReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RowDataReq getBody() {
        return body;
    }

    public void setBody(RowDataReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDatabaseDataRequest that = (UpdateDatabaseDataRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId)
            && Objects.equals(this.databaseId, that.databaseId) && Objects.equals(this.rowNum, that.rowNum)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, databaseId, rowNum, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseDataRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
        sb.append("    rowNum: ").append(toIndentedString(rowNum)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
