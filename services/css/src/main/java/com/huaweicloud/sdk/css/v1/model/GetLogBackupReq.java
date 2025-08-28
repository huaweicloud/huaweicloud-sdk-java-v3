package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetLogBackupReq
 */
public class GetLogBackupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private String logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_index")

    private String timeIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    public GetLogBackupReq withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 节点名称。通过[查询集群详情](ShowClusterDetail.xml)获取instances中的name属性。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public GetLogBackupReq withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 日志级别。可查询的日志级别为：INFO，ERROR，DEBUG，WARN。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public GetLogBackupReq withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * 日志类型。可查询的日志类型为：deprecation，indexingSlow，searchSlow， instance。
     * @return logType
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public GetLogBackupReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定返回日志的条数，默认返回100条，最大返回10000条日志，且日志大小不超过1MB。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public GetLogBackupReq withTimeIndex(String timeIndex) {
        this.timeIndex = timeIndex;
        return this;
    }

    /**
     * 返回指定时间之前的日志。
     * @return timeIndex
     */
    public String getTimeIndex() {
        return timeIndex;
    }

    public void setTimeIndex(String timeIndex) {
        this.timeIndex = timeIndex;
    }

    public GetLogBackupReq withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 基于日志内容字段值需要过滤的关键字，注意搜索到的日志包含关键字。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetLogBackupReq that = (GetLogBackupReq) obj;
        return Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.level, that.level)
            && Objects.equals(this.logType, that.logType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.timeIndex, that.timeIndex) && Objects.equals(this.keyword, that.keyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName, level, logType, limit, timeIndex, keyword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetLogBackupReq {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    timeIndex: ").append(toIndentedString(timeIndex)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
