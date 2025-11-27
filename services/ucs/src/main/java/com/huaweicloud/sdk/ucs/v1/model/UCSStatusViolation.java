package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UCSStatusViolation
 */
public class UCSStatusViolation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auditTimestamp")

    private String auditTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterViolations")

    private List<StatusViolation> clusterViolations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterEvents")

    private List<StatusEvent> clusterEvents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warnEvents")

    private List<StatusEvent> warnEvents = null;

    public UCSStatusViolation withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * 进行审计的集群ID
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public UCSStatusViolation withAuditTimestamp(String auditTimestamp) {
        this.auditTimestamp = auditTimestamp;
        return this;
    }

    /**
     * 审计时间
     * @return auditTimestamp
     */
    public String getAuditTimestamp() {
        return auditTimestamp;
    }

    public void setAuditTimestamp(String auditTimestamp) {
        this.auditTimestamp = auditTimestamp;
    }

    public UCSStatusViolation withClusterViolations(List<StatusViolation> clusterViolations) {
        this.clusterViolations = clusterViolations;
        return this;
    }

    public UCSStatusViolation addClusterViolationsItem(StatusViolation clusterViolationsItem) {
        if (this.clusterViolations == null) {
            this.clusterViolations = new ArrayList<>();
        }
        this.clusterViolations.add(clusterViolationsItem);
        return this;
    }

    public UCSStatusViolation withClusterViolations(Consumer<List<StatusViolation>> clusterViolationsSetter) {
        if (this.clusterViolations == null) {
            this.clusterViolations = new ArrayList<>();
        }
        clusterViolationsSetter.accept(this.clusterViolations);
        return this;
    }

    /**
     * 违规状态列表
     * @return clusterViolations
     */
    public List<StatusViolation> getClusterViolations() {
        return clusterViolations;
    }

    public void setClusterViolations(List<StatusViolation> clusterViolations) {
        this.clusterViolations = clusterViolations;
    }

    public UCSStatusViolation withClusterEvents(List<StatusEvent> clusterEvents) {
        this.clusterEvents = clusterEvents;
        return this;
    }

    public UCSStatusViolation addClusterEventsItem(StatusEvent clusterEventsItem) {
        if (this.clusterEvents == null) {
            this.clusterEvents = new ArrayList<>();
        }
        this.clusterEvents.add(clusterEventsItem);
        return this;
    }

    public UCSStatusViolation withClusterEvents(Consumer<List<StatusEvent>> clusterEventsSetter) {
        if (this.clusterEvents == null) {
            this.clusterEvents = new ArrayList<>();
        }
        clusterEventsSetter.accept(this.clusterEvents);
        return this;
    }

    /**
     * 拦截事件列表
     * @return clusterEvents
     */
    public List<StatusEvent> getClusterEvents() {
        return clusterEvents;
    }

    public void setClusterEvents(List<StatusEvent> clusterEvents) {
        this.clusterEvents = clusterEvents;
    }

    public UCSStatusViolation withWarnEvents(List<StatusEvent> warnEvents) {
        this.warnEvents = warnEvents;
        return this;
    }

    public UCSStatusViolation addWarnEventsItem(StatusEvent warnEventsItem) {
        if (this.warnEvents == null) {
            this.warnEvents = new ArrayList<>();
        }
        this.warnEvents.add(warnEventsItem);
        return this;
    }

    public UCSStatusViolation withWarnEvents(Consumer<List<StatusEvent>> warnEventsSetter) {
        if (this.warnEvents == null) {
            this.warnEvents = new ArrayList<>();
        }
        warnEventsSetter.accept(this.warnEvents);
        return this;
    }

    /**
     * 告警事件列表
     * @return warnEvents
     */
    public List<StatusEvent> getWarnEvents() {
        return warnEvents;
    }

    public void setWarnEvents(List<StatusEvent> warnEvents) {
        this.warnEvents = warnEvents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UCSStatusViolation that = (UCSStatusViolation) obj;
        return Objects.equals(this.clusterID, that.clusterID)
            && Objects.equals(this.auditTimestamp, that.auditTimestamp)
            && Objects.equals(this.clusterViolations, that.clusterViolations)
            && Objects.equals(this.clusterEvents, that.clusterEvents)
            && Objects.equals(this.warnEvents, that.warnEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID, auditTimestamp, clusterViolations, clusterEvents, warnEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UCSStatusViolation {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    auditTimestamp: ").append(toIndentedString(auditTimestamp)).append("\n");
        sb.append("    clusterViolations: ").append(toIndentedString(clusterViolations)).append("\n");
        sb.append("    clusterEvents: ").append(toIndentedString(clusterEvents)).append("\n");
        sb.append("    warnEvents: ").append(toIndentedString(warnEvents)).append("\n");
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
