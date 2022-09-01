package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 集群操作进度，任务信息，由key、value组成。key值为正在进行的任务，value值为正在进行任务的进度。示例如 \&quot;action_progress\&quot;:{\&quot;SNAPSHOTTING\&quot;:\&quot;16%\&quot;}
 */
public class ActionProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CREATING")

    @JacksonXmlProperty(localName = "CREATING")

    private String creating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "GROWING")

    @JacksonXmlProperty(localName = "GROWING")

    private String growing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "RESTORING")

    @JacksonXmlProperty(localName = "RESTORING")

    private String restoring;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "SNAPSHOTTING")

    @JacksonXmlProperty(localName = "SNAPSHOTTING")

    private String snapshotting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "REPAIRING")

    @JacksonXmlProperty(localName = "REPAIRING")

    private String repairing;

    public ActionProgress withCreating(String creating) {
        this.creating = creating;
        return this;
    }

    /**
     * 创建集群进度，例如：29%
     * @return creating
     */
    public String getCreating() {
        return creating;
    }

    public void setCreating(String creating) {
        this.creating = creating;
    }

    public ActionProgress withGrowing(String growing) {
        this.growing = growing;
        return this;
    }

    /**
     * 扩容集群进度，例如：29%
     * @return growing
     */
    public String getGrowing() {
        return growing;
    }

    public void setGrowing(String growing) {
        this.growing = growing;
    }

    public ActionProgress withRestoring(String restoring) {
        this.restoring = restoring;
        return this;
    }

    /**
     * 恢复集群进度，例如：29%
     * @return restoring
     */
    public String getRestoring() {
        return restoring;
    }

    public void setRestoring(String restoring) {
        this.restoring = restoring;
    }

    public ActionProgress withSnapshotting(String snapshotting) {
        this.snapshotting = snapshotting;
        return this;
    }

    /**
     * 集群快照进度，例如：29%
     * @return snapshotting
     */
    public String getSnapshotting() {
        return snapshotting;
    }

    public void setSnapshotting(String snapshotting) {
        this.snapshotting = snapshotting;
    }

    public ActionProgress withRepairing(String repairing) {
        this.repairing = repairing;
        return this;
    }

    /**
     * 修复集群进度，例如：29%
     * @return repairing
     */
    public String getRepairing() {
        return repairing;
    }

    public void setRepairing(String repairing) {
        this.repairing = repairing;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionProgress actionProgress = (ActionProgress) o;
        return Objects.equals(this.creating, actionProgress.creating)
            && Objects.equals(this.growing, actionProgress.growing)
            && Objects.equals(this.restoring, actionProgress.restoring)
            && Objects.equals(this.snapshotting, actionProgress.snapshotting)
            && Objects.equals(this.repairing, actionProgress.repairing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creating, growing, restoring, snapshotting, repairing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionProgress {\n");
        sb.append("    creating: ").append(toIndentedString(creating)).append("\n");
        sb.append("    growing: ").append(toIndentedString(growing)).append("\n");
        sb.append("    restoring: ").append(toIndentedString(restoring)).append("\n");
        sb.append("    snapshotting: ").append(toIndentedString(snapshotting)).append("\n");
        sb.append("    repairing: ").append(toIndentedString(repairing)).append("\n");
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
