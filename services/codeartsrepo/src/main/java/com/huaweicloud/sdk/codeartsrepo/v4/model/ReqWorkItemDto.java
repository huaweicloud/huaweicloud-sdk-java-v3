package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 工作项数据。
 */
public class ReqWorkItemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker")

    private ReqWorkItemBasicDto tracker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ReqWorkItemBasicDto status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private ReqWorkItemBasicDto priority;

    public ReqWorkItemDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 工作项ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReqWorkItemDto withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * **参数解释：** 工作项标题。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ReqWorkItemDto withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * **参数解释：** 工作项编号， scrum类型项目该值为空。
     * @return sequence
     */
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public ReqWorkItemDto withTracker(ReqWorkItemBasicDto tracker) {
        this.tracker = tracker;
        return this;
    }

    public ReqWorkItemDto withTracker(Consumer<ReqWorkItemBasicDto> trackerSetter) {
        if (this.tracker == null) {
            this.tracker = new ReqWorkItemBasicDto();
            trackerSetter.accept(this.tracker);
        }

        return this;
    }

    /**
     * Get tracker
     * @return tracker
     */
    public ReqWorkItemBasicDto getTracker() {
        return tracker;
    }

    public void setTracker(ReqWorkItemBasicDto tracker) {
        this.tracker = tracker;
    }

    public ReqWorkItemDto withStatus(ReqWorkItemBasicDto status) {
        this.status = status;
        return this;
    }

    public ReqWorkItemDto withStatus(Consumer<ReqWorkItemBasicDto> statusSetter) {
        if (this.status == null) {
            this.status = new ReqWorkItemBasicDto();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ReqWorkItemBasicDto getStatus() {
        return status;
    }

    public void setStatus(ReqWorkItemBasicDto status) {
        this.status = status;
    }

    public ReqWorkItemDto withPriority(ReqWorkItemBasicDto priority) {
        this.priority = priority;
        return this;
    }

    public ReqWorkItemDto withPriority(Consumer<ReqWorkItemBasicDto> prioritySetter) {
        if (this.priority == null) {
            this.priority = new ReqWorkItemBasicDto();
            prioritySetter.accept(this.priority);
        }

        return this;
    }

    /**
     * Get priority
     * @return priority
     */
    public ReqWorkItemBasicDto getPriority() {
        return priority;
    }

    public void setPriority(ReqWorkItemBasicDto priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReqWorkItemDto that = (ReqWorkItemDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.sequence, that.sequence) && Objects.equals(this.tracker, that.tracker)
            && Objects.equals(this.status, that.status) && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, sequence, tracker, status, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqWorkItemDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
