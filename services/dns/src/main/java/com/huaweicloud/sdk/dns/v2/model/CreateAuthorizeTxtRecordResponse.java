package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAuthorizeTxtRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record")

    private RecordInfo record;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_level_zone_name")

    private String secondLevelZoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public CreateAuthorizeTxtRecordResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 授权请求ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAuthorizeTxtRecordResponse withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * **参数解释：** 待创建的子域名。 **取值范围：** 不涉及。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public CreateAuthorizeTxtRecordResponse withRecord(RecordInfo record) {
        this.record = record;
        return this;
    }

    public CreateAuthorizeTxtRecordResponse withRecord(Consumer<RecordInfo> recordSetter) {
        if (this.record == null) {
            this.record = new RecordInfo();
            recordSetter.accept(this.record);
        }

        return this;
    }

    /**
     * Get record
     * @return record
     */
    public RecordInfo getRecord() {
        return record;
    }

    public void setRecord(RecordInfo record) {
        this.record = record;
    }

    public CreateAuthorizeTxtRecordResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 授权状态。 **取值范围：** - CREATED：已创建 - VERIFIED：已验证
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateAuthorizeTxtRecordResponse withSecondLevelZoneName(String secondLevelZoneName) {
        this.secondLevelZoneName = secondLevelZoneName;
        return this;
    }

    /**
     * **参数解释：** 子域名所属的二级域名。 **取值范围：** 不涉及。
     * @return secondLevelZoneName
     */
    public String getSecondLevelZoneName() {
        return secondLevelZoneName;
    }

    public void setSecondLevelZoneName(String secondLevelZoneName) {
        this.secondLevelZoneName = secondLevelZoneName;
    }

    public CreateAuthorizeTxtRecordResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。 **取值范围：** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreateAuthorizeTxtRecordResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。 **取值范围：** 不涉及。
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
        CreateAuthorizeTxtRecordResponse that = (CreateAuthorizeTxtRecordResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.zoneName, that.zoneName)
            && Objects.equals(this.record, that.record) && Objects.equals(this.status, that.status)
            && Objects.equals(this.secondLevelZoneName, that.secondLevelZoneName)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, zoneName, record, status, secondLevelZoneName, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAuthorizeTxtRecordResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    secondLevelZoneName: ").append(toIndentedString(secondLevelZoneName)).append("\n");
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
