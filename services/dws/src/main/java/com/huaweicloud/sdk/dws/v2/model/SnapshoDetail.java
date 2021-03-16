package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 快照对象
 */
public class SnapshoDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Double size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="finished")
    
    private String finished;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="started")
    
    private String started;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public SnapshoDetail withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 快照对应的集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public SnapshoDetail withSize(Double size) {
        this.size = size;
        return this;
    }

    


    /**
     * 快照大小，单位GB。
     * @return size
     */
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    

    public SnapshoDetail withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 快照名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public SnapshoDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 快照描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public SnapshoDetail withFinished(String finished) {
        this.finished = finished;
        return this;
    }

    


    /**
     * 快照完成的日期时间，格式为ISO8601: YYYY-MM-DDThh:mm:ssZ。
     * @return finished
     */
    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished;
    }

    

    public SnapshoDetail withStarted(String started) {
        this.started = started;
        return this;
    }

    


    /**
     * 快照创建的日期时间，格式为 ISO8601: YYYY-MM-DDThh:mm:ssZ。
     * @return started
     */
    public String getStarted() {
        return started;
    }

    public void setStarted(String started) {
        this.started = started;
    }

    

    public SnapshoDetail withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 快照ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public SnapshoDetail withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 快照创建类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public SnapshoDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 快照状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshoDetail snapshoDetail = (SnapshoDetail) o;
        return Objects.equals(this.clusterId, snapshoDetail.clusterId) &&
            Objects.equals(this.size, snapshoDetail.size) &&
            Objects.equals(this.name, snapshoDetail.name) &&
            Objects.equals(this.description, snapshoDetail.description) &&
            Objects.equals(this.finished, snapshoDetail.finished) &&
            Objects.equals(this.started, snapshoDetail.started) &&
            Objects.equals(this.id, snapshoDetail.id) &&
            Objects.equals(this.type, snapshoDetail.type) &&
            Objects.equals(this.status, snapshoDetail.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, size, name, description, finished, started, id, type, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshoDetail {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    started: ").append(toIndentedString(started)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

