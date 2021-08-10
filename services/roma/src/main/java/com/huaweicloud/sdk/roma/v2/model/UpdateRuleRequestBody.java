package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdateRuleRequestBody */
public class UpdateRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_parsing_status")

    private Integer dataParsingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_field")

    private String sqlField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_where")

    private String sqlWhere;

    public UpdateRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 规则名称，支持英文大小写，数字，下划线和中划线,长度1-64
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述，长度0-200
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRuleRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 规则状态 0-启用 1-停用，不填写时默认为0-启用 minimum: 0 maximum: 10
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateRuleRequestBody withDataParsingStatus(Integer dataParsingStatus) {
        this.dataParsingStatus = dataParsingStatus;
        return this;
    }

    /** 数据解析状态，0-启用 1-停用，不填写时默认为1-禁用 minimum: 0 maximum: 10
     * 
     * @return dataParsingStatus */
    public Integer getDataParsingStatus() {
        return dataParsingStatus;
    }

    public void setDataParsingStatus(Integer dataParsingStatus) {
        this.dataParsingStatus = dataParsingStatus;
    }

    public UpdateRuleRequestBody withSqlField(String sqlField) {
        this.sqlField = sqlField;
        return this;
    }

    /** SQL查询字段
     * 
     * @return sqlField */
    public String getSqlField() {
        return sqlField;
    }

    public void setSqlField(String sqlField) {
        this.sqlField = sqlField;
    }

    public UpdateRuleRequestBody withSqlWhere(String sqlWhere) {
        this.sqlWhere = sqlWhere;
        return this;
    }

    /** SQL查询条件
     * 
     * @return sqlWhere */
    public String getSqlWhere() {
        return sqlWhere;
    }

    public void setSqlWhere(String sqlWhere) {
        this.sqlWhere = sqlWhere;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRuleRequestBody updateRuleRequestBody = (UpdateRuleRequestBody) o;
        return Objects.equals(this.name, updateRuleRequestBody.name)
            && Objects.equals(this.description, updateRuleRequestBody.description)
            && Objects.equals(this.status, updateRuleRequestBody.status)
            && Objects.equals(this.dataParsingStatus, updateRuleRequestBody.dataParsingStatus)
            && Objects.equals(this.sqlField, updateRuleRequestBody.sqlField)
            && Objects.equals(this.sqlWhere, updateRuleRequestBody.sqlWhere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, status, dataParsingStatus, sqlField, sqlWhere);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dataParsingStatus: ").append(toIndentedString(dataParsingStatus)).append("\n");
        sb.append("    sqlField: ").append(toIndentedString(sqlField)).append("\n");
        sb.append("    sqlWhere: ").append(toIndentedString(sqlWhere)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
