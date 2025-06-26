package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 快照对象列表。 **取值范围**： 不涉及。
 */
public class Snapshots {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started")

    private String started;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished")

    private String finished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Double size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public Snapshots withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 快照ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Snapshots withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 快照名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Snapshots withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 快照描述。 **取值范围**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Snapshots withStarted(String started) {
        this.started = started;
        return this;
    }

    /**
     * **参数解释**： 快照创建的日期时间，格式为 ISO8601: YYYY-MM-DDThh:mm:ssZ。 **取值范围**： 不涉及。
     * @return started
     */
    public String getStarted() {
        return started;
    }

    public void setStarted(String started) {
        this.started = started;
    }

    public Snapshots withFinished(String finished) {
        this.finished = finished;
        return this;
    }

    /**
     * **参数解释**： 快照完成的日期时间，格式为 ISO8601: YYYY-MM-DDThh:mm:ssZ。 **取值范围**： 不涉及。
     * @return finished
     */
    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished;
    }

    public Snapshots withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**： 快照大小，单位 GB。 **取值范围**： 不涉及。
     * @return size
     */
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Snapshots withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 快照状态。 **取值范围**： - CREATING：创建中。 - AVAILABLE：可用。 - UNAVAILABLE：不可用。 - FROZEN： 普通冻结。 - POLICE_FROZEN： 公安冻结。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Snapshots withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 快照创建类型。 **取值范围**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Snapshots withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 快照对应的集群ID。 **取值范围**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Snapshots that = (Snapshots) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.started, that.started)
            && Objects.equals(this.finished, that.finished) && Objects.equals(this.size, that.size)
            && Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, started, finished, size, status, type, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Snapshots {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    started: ").append(toIndentedString(started)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
