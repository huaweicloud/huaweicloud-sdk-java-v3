package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 剧本实例运行数据
 */
public class PlaybookInstanceRunStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_instance_id")

    private String playbookInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_instance_name")

    private String playbookInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_instance_run_time")

    private BigDecimal playbookInstanceRunTime;

    public PlaybookInstanceRunStatistics withPlaybookInstanceId(String playbookInstanceId) {
        this.playbookInstanceId = playbookInstanceId;
        return this;
    }

    /**
     * 剧本实例ID
     * @return playbookInstanceId
     */
    public String getPlaybookInstanceId() {
        return playbookInstanceId;
    }

    public void setPlaybookInstanceId(String playbookInstanceId) {
        this.playbookInstanceId = playbookInstanceId;
    }

    public PlaybookInstanceRunStatistics withPlaybookInstanceName(String playbookInstanceName) {
        this.playbookInstanceName = playbookInstanceName;
        return this;
    }

    /**
     * 剧本实例名称
     * @return playbookInstanceName
     */
    public String getPlaybookInstanceName() {
        return playbookInstanceName;
    }

    public void setPlaybookInstanceName(String playbookInstanceName) {
        this.playbookInstanceName = playbookInstanceName;
    }

    public PlaybookInstanceRunStatistics withPlaybookInstanceRunTime(BigDecimal playbookInstanceRunTime) {
        this.playbookInstanceRunTime = playbookInstanceRunTime;
        return this;
    }

    /**
     * 剧本实例运行时间
     * minimum: 0
     * maximum: 9999999999
     * @return playbookInstanceRunTime
     */
    public BigDecimal getPlaybookInstanceRunTime() {
        return playbookInstanceRunTime;
    }

    public void setPlaybookInstanceRunTime(BigDecimal playbookInstanceRunTime) {
        this.playbookInstanceRunTime = playbookInstanceRunTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlaybookInstanceRunStatistics that = (PlaybookInstanceRunStatistics) obj;
        return Objects.equals(this.playbookInstanceId, that.playbookInstanceId)
            && Objects.equals(this.playbookInstanceName, that.playbookInstanceName)
            && Objects.equals(this.playbookInstanceRunTime, that.playbookInstanceRunTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playbookInstanceId, playbookInstanceName, playbookInstanceRunTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaybookInstanceRunStatistics {\n");
        sb.append("    playbookInstanceId: ").append(toIndentedString(playbookInstanceId)).append("\n");
        sb.append("    playbookInstanceName: ").append(toIndentedString(playbookInstanceName)).append("\n");
        sb.append("    playbookInstanceRunTime: ").append(toIndentedString(playbookInstanceRunTime)).append("\n");
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
