package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: LTS对接配置信息。 **约束限制**: 不涉及。
 */
public class LtsInfoOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    public LtsInfoOption withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * **参数解释**: LTS日志组名称。 **约束限制**: 满足正则匹配表达式校验：^GROUP_GAUSSDB_APS-[a-zA-Z0-9-_]{32}in(14|20)$。 **取值范围**: 通常为GROUP_GAUSSDB_APS-实例ID。 **默认取值**: 不涉及。
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public LtsInfoOption withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * **参数解释**: LTS日志流名称。 **约束限制**: 满足正则匹配表达式校验：^GROUP_GAUSSDB_APS-[a-zA-Z0-9-_]{32}in(14|20)$。 **取值范围**: 通常为STREAM_APS_FULL_SQL-实例ID。 **默认取值**: 不涉及。
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsInfoOption that = (LtsInfoOption) obj;
        return Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logStreamName, that.logStreamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupName, logStreamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsInfoOption {\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
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
