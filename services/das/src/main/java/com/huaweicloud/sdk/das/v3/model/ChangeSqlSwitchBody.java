package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ChangeSqlSwitchBody */
public class ChangeSqlSwitchBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Long retentionDays;

    public ChangeSqlSwitchBody withType(String type) {
        this.type = type;
        return this;
    }

    /** 开关类型。取值DAS SQL Explorer和DAS Slow Query Log，分别表示DAS收集全量SQL开关和DAS收集慢SQL开关。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ChangeSqlSwitchBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 开关状态，取值0和1，分别代表要关闭和开启。
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ChangeSqlSwitchBody withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /** 数据库类型。当前全量SQL支持的数据库类型包括MySQL和GaussDB(for MySQL)，慢SQL支持的类型：MySQL、GaussDB(for MySQL)、PostgreSQL。
     * 
     * @return datastoreType */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ChangeSqlSwitchBody withRetentionDays(Long retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /** SQL数据保存时长（天）。默认为7天，最长可保留30天，到期后数据自动删除。如果要保留30天以上，请到DAS页面进行操作。
     * 
     * @return retentionDays */
    public Long getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Long retentionDays) {
        this.retentionDays = retentionDays;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeSqlSwitchBody changeSqlSwitchBody = (ChangeSqlSwitchBody) o;
        return Objects.equals(this.type, changeSqlSwitchBody.type)
            && Objects.equals(this.status, changeSqlSwitchBody.status)
            && Objects.equals(this.datastoreType, changeSqlSwitchBody.datastoreType)
            && Objects.equals(this.retentionDays, changeSqlSwitchBody.retentionDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, datastoreType, retentionDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeSqlSwitchBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
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
