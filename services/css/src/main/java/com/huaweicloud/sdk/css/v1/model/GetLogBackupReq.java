package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * GetLogBackupReq
 */
public class GetLogBackupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceName")

    @JacksonXmlProperty(localName = "instanceName")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    @JacksonXmlProperty(localName = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logType")

    @JacksonXmlProperty(localName = "logType")

    private String logType;

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetLogBackupReq getLogBackupReq = (GetLogBackupReq) o;
        return Objects.equals(this.instanceName, getLogBackupReq.instanceName)
            && Objects.equals(this.level, getLogBackupReq.level)
            && Objects.equals(this.logType, getLogBackupReq.logType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName, level, logType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetLogBackupReq {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
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
