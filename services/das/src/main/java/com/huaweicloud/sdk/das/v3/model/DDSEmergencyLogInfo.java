package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DDSEmergencyLogInfo对象
 */
public class DDSEmergencyLogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_sql")

    private String executeSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    public DDSEmergencyLogInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DDSEmergencyLogInfo withExecuteSql(String executeSql) {
        this.executeSql = executeSql;
        return this;
    }

    /**
     * 执行SQL
     * @return executeSql
     */
    public String getExecuteSql() {
        return executeSql;
    }

    public void setExecuteSql(String executeSql) {
        this.executeSql = executeSql;
    }

    public DDSEmergencyLogInfo withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DDSEmergencyLogInfo that = (DDSEmergencyLogInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.executeSql, that.executeSql)
            && Objects.equals(this.createAt, that.createAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, executeSql, createAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DDSEmergencyLogInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    executeSql: ").append(toIndentedString(executeSql)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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
