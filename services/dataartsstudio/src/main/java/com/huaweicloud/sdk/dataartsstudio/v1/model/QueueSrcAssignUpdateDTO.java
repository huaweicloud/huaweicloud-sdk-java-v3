package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueueSrcAssignUpdateDTO
 */
public class QueueSrcAssignUpdateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_attr")

    private Integer queueAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public QueueSrcAssignUpdateDTO withQueueAttr(Integer queueAttr) {
        this.queueAttr = queueAttr;
        return this;
    }

    /**
     * 队列属性(0:默认,1:实时队列,2:离线队列), 当前只有yarn队列涉及。
     * minimum: 0
     * maximum: 127
     * @return queueAttr
     */
    public Integer getQueueAttr() {
        return queueAttr;
    }

    public void setQueueAttr(Integer queueAttr) {
        this.queueAttr = queueAttr;
    }

    public QueueSrcAssignUpdateDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 当前空间分配资源附加的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueueSrcAssignUpdateDTO that = (QueueSrcAssignUpdateDTO) obj;
        return Objects.equals(this.queueAttr, that.queueAttr) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueAttr, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueSrcAssignUpdateDTO {\n");
        sb.append("    queueAttr: ").append(toIndentedString(queueAttr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
