package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回放异常SQL数据项
 */
public class ReplayErrorSqlResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_sql")

    private String abnormalSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_info")

    private String abnormalInfo;

    public ReplayErrorSqlResp withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * SQL类型
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ReplayErrorSqlResp withAbnormalSql(String abnormalSql) {
        this.abnormalSql = abnormalSql;
        return this;
    }

    /**
     * SQL语句
     * @return abnormalSql
     */
    public String getAbnormalSql() {
        return abnormalSql;
    }

    public void setAbnormalSql(String abnormalSql) {
        this.abnormalSql = abnormalSql;
    }

    public ReplayErrorSqlResp withAbnormalInfo(String abnormalInfo) {
        this.abnormalInfo = abnormalInfo;
        return this;
    }

    /**
     * 异常原因描述
     * @return abnormalInfo
     */
    public String getAbnormalInfo() {
        return abnormalInfo;
    }

    public void setAbnormalInfo(String abnormalInfo) {
        this.abnormalInfo = abnormalInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplayErrorSqlResp that = (ReplayErrorSqlResp) obj;
        return Objects.equals(this.objectType, that.objectType) && Objects.equals(this.abnormalSql, that.abnormalSql)
            && Objects.equals(this.abnormalInfo, that.abnormalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectType, abnormalSql, abnormalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplayErrorSqlResp {\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    abnormalSql: ").append(toIndentedString(abnormalSql)).append("\n");
        sb.append("    abnormalInfo: ").append(toIndentedString(abnormalInfo)).append("\n");
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
