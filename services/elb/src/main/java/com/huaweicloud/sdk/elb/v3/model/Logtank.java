package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 云日志信息。
 */
public class Logtank {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    @JacksonXmlProperty(localName = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    @JacksonXmlProperty(localName = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_id")

    @JacksonXmlProperty(localName = "log_topic_id")

    private String logTopicId;

    public Logtank withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云日志ID。
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
     * 项目ID。
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
     * 负载均衡器ID。
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
     * 云日志分组ID。
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
     * 云日志主题ID。
     * @return logTopicId
     */
    public String getLogTopicId() {
        return logTopicId;
    }

    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Logtank logtank = (Logtank) o;
        return Objects.equals(this.id, logtank.id) && Objects.equals(this.projectId, logtank.projectId)
            && Objects.equals(this.loadbalancerId, logtank.loadbalancerId)
            && Objects.equals(this.logGroupId, logtank.logGroupId)
            && Objects.equals(this.logTopicId, logtank.logTopicId);
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
