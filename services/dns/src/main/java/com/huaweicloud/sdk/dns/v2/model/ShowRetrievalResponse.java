package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRetrievalResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record")

    private CreatePublicZoneFindRespRecord record;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ShowRetrievalResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 找回请求ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowRetrievalResponse withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * 域名名称。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public ShowRetrievalResponse withRecord(CreatePublicZoneFindRespRecord record) {
        this.record = record;
        return this;
    }

    public ShowRetrievalResponse withRecord(Consumer<CreatePublicZoneFindRespRecord> recordSetter) {
        if (this.record == null) {
            this.record = new CreatePublicZoneFindRespRecord();
            recordSetter.accept(this.record);
        }

        return this;
    }

    /**
     * Get record
     * @return record
     */
    public CreatePublicZoneFindRespRecord getRecord() {
        return record;
    }

    public void setRecord(CreatePublicZoneFindRespRecord record) {
        this.record = record;
    }

    public ShowRetrievalResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，(PENDING,VERIFIED,CREATED,EXPIRED)
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowRetrievalResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowRetrievalResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRetrievalResponse showRetrievalResponse = (ShowRetrievalResponse) o;
        return Objects.equals(this.id, showRetrievalResponse.id)
            && Objects.equals(this.zoneName, showRetrievalResponse.zoneName)
            && Objects.equals(this.record, showRetrievalResponse.record)
            && Objects.equals(this.status, showRetrievalResponse.status)
            && Objects.equals(this.createdAt, showRetrievalResponse.createdAt)
            && Objects.equals(this.updatedAt, showRetrievalResponse.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, zoneName, record, status, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRetrievalResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
