package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Line */
public class Line {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_id")

    private String lineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_segments")

    private List<String> ipSegments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public Line withLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    /** 解析线路ID。
     * 
     * @return lineId */
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public Line withName(String name) {
        this.name = name;
        return this;
    }

    /** 解析线路名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Line withIpSegments(List<String> ipSegments) {
        this.ipSegments = ipSegments;
        return this;
    }

    public Line addIpSegmentsItem(String ipSegmentsItem) {
        if (this.ipSegments == null) {
            this.ipSegments = new ArrayList<>();
        }
        this.ipSegments.add(ipSegmentsItem);
        return this;
    }

    public Line withIpSegments(Consumer<List<String>> ipSegmentsSetter) {
        if (this.ipSegments == null) {
            this.ipSegments = new ArrayList<>();
        }
        ipSegmentsSetter.accept(this.ipSegments);
        return this;
    }

    /** IP地址段。
     * 
     * @return ipSegments */
    public List<String> getIpSegments() {
        return ipSegments;
    }

    public void setIpSegments(List<String> ipSegments) {
        this.ipSegments = ipSegments;
    }

    public Line withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间。
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Line withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 更新时间。
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Line withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 资源状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Line withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 自定义线路的描述信息。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Line line = (Line) o;
        return Objects.equals(this.lineId, line.lineId) && Objects.equals(this.name, line.name)
            && Objects.equals(this.ipSegments, line.ipSegments) && Objects.equals(this.createdAt, line.createdAt)
            && Objects.equals(this.updatedAt, line.updatedAt) && Objects.equals(this.status, line.status)
            && Objects.equals(this.description, line.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineId, name, ipSegments, createdAt, updatedAt, status, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Line {\n");
        sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ipSegments: ").append(toIndentedString(ipSegments)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
