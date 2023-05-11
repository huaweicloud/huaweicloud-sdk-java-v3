package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePostgresqlDbUserCommentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDbUserReq body;

    public UpdatePostgresqlDbUserCommentRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdatePostgresqlDbUserCommentRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 数据库用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UpdatePostgresqlDbUserCommentRequest withBody(UpdateDbUserReq body) {
        this.body = body;
        return this;
    }

    public UpdatePostgresqlDbUserCommentRequest withBody(Consumer<UpdateDbUserReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDbUserReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateDbUserReq getBody() {
        return body;
    }

    public void setBody(UpdateDbUserReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePostgresqlDbUserCommentRequest updatePostgresqlDbUserCommentRequest =
            (UpdatePostgresqlDbUserCommentRequest) o;
        return Objects.equals(this.instanceId, updatePostgresqlDbUserCommentRequest.instanceId)
            && Objects.equals(this.userName, updatePostgresqlDbUserCommentRequest.userName)
            && Objects.equals(this.body, updatePostgresqlDbUserCommentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, userName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePostgresqlDbUserCommentRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
