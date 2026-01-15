package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCustomLineResponse extends SdkResponse {

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

    public CreateCustomLineResponse withLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * 解析线路ID。
     * @return lineId
     */
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public CreateCustomLineResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 解析线路名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCustomLineResponse withIpSegments(List<String> ipSegments) {
        this.ipSegments = ipSegments;
        return this;
    }

    public CreateCustomLineResponse addIpSegmentsItem(String ipSegmentsItem) {
        if (this.ipSegments == null) {
            this.ipSegments = new ArrayList<>();
        }
        this.ipSegments.add(ipSegmentsItem);
        return this;
    }

    public CreateCustomLineResponse withIpSegments(Consumer<List<String>> ipSegmentsSetter) {
        if (this.ipSegments == null) {
            this.ipSegments = new ArrayList<>();
        }
        ipSegmentsSetter.accept(this.ipSegments);
        return this;
    }

    /**
     * IP地址段。
     * @return ipSegments
     */
    public List<String> getIpSegments() {
        return ipSegments;
    }

    public void setIpSegments(List<String> ipSegments) {
        this.ipSegments = ipSegments;
    }

    public CreateCustomLineResponse withCreatedAt(String createdAt) {
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

    public CreateCustomLineResponse withUpdatedAt(String updatedAt) {
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

    public CreateCustomLineResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 资源状态。 **取值范围：** - ACTIVE：正常 - PENDING_CREATE：创建中 - PENDING_UPDATE：更新中 - PENDING_DELETE：删除中 - PENDING_FREEZE：冻结中 - FREEZE：冻结 - ERROR：失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateCustomLineResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自定义线路的描述信息。
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
        CreateCustomLineResponse that = (CreateCustomLineResponse) obj;
        return Objects.equals(this.lineId, that.lineId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ipSegments, that.ipSegments) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.status, that.status)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineId, name, ipSegments, createdAt, updatedAt, status, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomLineResponse {\n");
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
