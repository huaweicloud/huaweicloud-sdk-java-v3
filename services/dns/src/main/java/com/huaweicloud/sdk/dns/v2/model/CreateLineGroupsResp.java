package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateLineGroupsResp
 */
public class CreateLineGroupsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines")

    private List<String> lines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_id")

    private String lineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public CreateLineGroupsResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 线路分组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateLineGroupsResp withLines(List<String> lines) {
        this.lines = lines;
        return this;
    }

    public CreateLineGroupsResp addLinesItem(String linesItem) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        this.lines.add(linesItem);
        return this;
    }

    public CreateLineGroupsResp withLines(Consumer<List<String>> linesSetter) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        linesSetter.accept(this.lines);
        return this;
    }

    /**
     * 线路分组包含的线路列表。 解析线路ID。
     * @return lines
     */
    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public CreateLineGroupsResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态。 取值范围：PENDING_CREATE，ACTIVE，PENDING_DELETE，PENDING_UPDATE，ERROR，FREEZE，DISABLE。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateLineGroupsResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 线路分组的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateLineGroupsResp withLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * 线路分组的ID。
     * @return lineId
     */
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public CreateLineGroupsResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreateLineGroupsResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLineGroupsResp that = (CreateLineGroupsResp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.lines, that.lines)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.lineId, that.lineId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lines, status, description, lineId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLineGroupsResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
