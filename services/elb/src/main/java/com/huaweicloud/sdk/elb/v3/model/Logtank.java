package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Logtank
 */
public class Logtank {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_id")

    private String logTopicId;

    public Logtank withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：云日志ID。  **取值范围**：不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Logtank withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：项目ID。获取方式请参见[获取项目ID](elb_fl_0008.xml)。  **取值范围**：长度为32个字符，由小写字母和数字组成。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Logtank withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器ID。  **取值范围**：不涉及
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public Logtank withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * **参数解释**：云日志分组ID。  **取值范围**：不涉及
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public Logtank withLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }

    /**
     * **参数解释**：云日志主题ID。  **取值范围**：不涉及
     * @return logTopicId
     */
    public String getLogTopicId() {
        return logTopicId;
    }

    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Logtank that = (Logtank) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logTopicId, that.logTopicId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, loadbalancerId, logGroupId, logTopicId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Logtank {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
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
