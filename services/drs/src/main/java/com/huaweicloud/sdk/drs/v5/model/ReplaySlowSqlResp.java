package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回放慢SQL数据结果对象
 */
public class ReplaySlowSqlResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql")

    private String slowSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_time")

    private String oldTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replay_time")

    private String replayTime;

    public ReplaySlowSqlResp withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * SQL语句类型
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ReplaySlowSqlResp withSlowSql(String slowSql) {
        this.slowSql = slowSql;
        return this;
    }

    /**
     * SQL语句
     * @return slowSql
     */
    public String getSlowSql() {
        return slowSql;
    }

    public void setSlowSql(String slowSql) {
        this.slowSql = slowSql;
    }

    public ReplaySlowSqlResp withOldTime(String oldTime) {
        this.oldTime = oldTime;
        return this;
    }

    /**
     * 源库执行耗时
     * @return oldTime
     */
    public String getOldTime() {
        return oldTime;
    }

    public void setOldTime(String oldTime) {
        this.oldTime = oldTime;
    }

    public ReplaySlowSqlResp withReplayTime(String replayTime) {
        this.replayTime = replayTime;
        return this;
    }

    /**
     * 目标库回放执行耗时
     * @return replayTime
     */
    public String getReplayTime() {
        return replayTime;
    }

    public void setReplayTime(String replayTime) {
        this.replayTime = replayTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplaySlowSqlResp that = (ReplaySlowSqlResp) obj;
        return Objects.equals(this.objectType, that.objectType) && Objects.equals(this.slowSql, that.slowSql)
            && Objects.equals(this.oldTime, that.oldTime) && Objects.equals(this.replayTime, that.replayTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectType, slowSql, oldTime, replayTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplaySlowSqlResp {\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    slowSql: ").append(toIndentedString(slowSql)).append("\n");
        sb.append("    oldTime: ").append(toIndentedString(oldTime)).append("\n");
        sb.append("    replayTime: ").append(toIndentedString(replayTime)).append("\n");
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
