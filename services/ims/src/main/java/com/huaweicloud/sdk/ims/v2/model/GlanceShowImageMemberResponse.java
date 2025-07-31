package com.huaweicloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GlanceShowImageMemberResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_type")

    private String memberType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    public GlanceShowImageMemberResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 共享状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GlanceShowImageMemberResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 共享时间，格式为UTC时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GlanceShowImageMemberResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间，格式为UTC时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GlanceShowImageMemberResponse withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public GlanceShowImageMemberResponse withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 成员ID
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public GlanceShowImageMemberResponse withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 共享视图
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public GlanceShowImageMemberResponse withMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * 共享成员类型
     * @return memberType
     */
    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public GlanceShowImageMemberResponse withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 共享组织的URN,仅当member_type类型为organization时，才会返回urn字段
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlanceShowImageMemberResponse that = (GlanceShowImageMemberResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.memberId, that.memberId) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.memberType, that.memberType) && Objects.equals(this.urn, that.urn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, createdAt, updatedAt, imageId, memberId, schema, memberType, urn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceShowImageMemberResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
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
