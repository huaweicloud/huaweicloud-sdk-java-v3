package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Results
 */
public class Results {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name_alias")

    private String logGroupNameAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name_alias")

    private String logStreamNameAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public Results withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * **参数解释：** 企业项目ID。 **取值范围：** 不涉及。
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public Results withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * **参数解释：** 日志组名称。 **取值范围：** 不涉及。
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public Results withLogGroupNameAlias(String logGroupNameAlias) {
        this.logGroupNameAlias = logGroupNameAlias;
        return this;
    }

    /**
     * **参数解释：** 日志组别名。 **取值范围：** 不涉及。
     * @return logGroupNameAlias
     */
    public String getLogGroupNameAlias() {
        return logGroupNameAlias;
    }

    public void setLogGroupNameAlias(String logGroupNameAlias) {
        this.logGroupNameAlias = logGroupNameAlias;
    }

    public Results withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * **参数解释：** 日志流名称。 **取值范围：** 不涉及。
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public Results withLogStreamNameAlias(String logStreamNameAlias) {
        this.logStreamNameAlias = logStreamNameAlias;
        return this;
    }

    /**
     * **参数解释：** 日志流别名。 **取值范围：** 不涉及。
     * @return logStreamNameAlias
     */
    public String getLogStreamNameAlias() {
        return logStreamNameAlias;
    }

    public void setLogStreamNameAlias(String logStreamNameAlias) {
        this.logStreamNameAlias = logStreamNameAlias;
    }

    public Results withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释：** 告警统计周期，例如：1小时。 **取值范围：** 不涉及。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Results that = (Results) obj;
        return Objects.equals(this.epsId, that.epsId) && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logGroupNameAlias, that.logGroupNameAlias)
            && Objects.equals(this.logStreamName, that.logStreamName)
            && Objects.equals(this.logStreamNameAlias, that.logStreamNameAlias) && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsId, logGroupName, logGroupNameAlias, logStreamName, logStreamNameAlias, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Results {\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logGroupNameAlias: ").append(toIndentedString(logGroupNameAlias)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    logStreamNameAlias: ").append(toIndentedString(logStreamNameAlias)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
