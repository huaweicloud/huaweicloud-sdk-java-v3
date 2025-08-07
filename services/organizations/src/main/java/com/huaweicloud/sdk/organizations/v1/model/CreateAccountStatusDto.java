package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包含有关在组织中创建账号的CreateAccount请求的状态。
 */
public class CreateAccountStatusDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_at")

    private OffsetDateTime completedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_reason")

    private String failureReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_detail_msg")

    private CreateAccountStatusDtoFailureDetailMsg failureDetailMsg;

    public CreateAccountStatusDto withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 如果账号创建成功，则为新账号的唯一标识符（ID）。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public CreateAccountStatusDto withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 账号名称
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public CreateAccountStatusDto withCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * 创建账号和完成请求的日期和时间。
     * @return completedAt
     */
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public CreateAccountStatusDto withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 请求创建账号的日期和时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreateAccountStatusDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 请求的唯一标识符（ID）。您可以从创建账号的初始CreateAccount请求的响应中获得此值。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAccountStatusDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 创建账号的异步请求的状态，in_progress：处理中，succeeded：成功，failed：失败。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CreateAccountStatusDto withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * 如果请求失败，则说明失败原因。
     * @return failureReason
     */
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public CreateAccountStatusDto withFailureDetailMsg(CreateAccountStatusDtoFailureDetailMsg failureDetailMsg) {
        this.failureDetailMsg = failureDetailMsg;
        return this;
    }

    public CreateAccountStatusDto withFailureDetailMsg(
        Consumer<CreateAccountStatusDtoFailureDetailMsg> failureDetailMsgSetter) {
        if (this.failureDetailMsg == null) {
            this.failureDetailMsg = new CreateAccountStatusDtoFailureDetailMsg();
            failureDetailMsgSetter.accept(this.failureDetailMsg);
        }

        return this;
    }

    /**
     * Get failureDetailMsg
     * @return failureDetailMsg
     */
    public CreateAccountStatusDtoFailureDetailMsg getFailureDetailMsg() {
        return failureDetailMsg;
    }

    public void setFailureDetailMsg(CreateAccountStatusDtoFailureDetailMsg failureDetailMsg) {
        this.failureDetailMsg = failureDetailMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAccountStatusDto that = (CreateAccountStatusDto) obj;
        return Objects.equals(this.accountId, that.accountId) && Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.completedAt, that.completedAt) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.id, that.id) && Objects.equals(this.state, that.state)
            && Objects.equals(this.failureReason, that.failureReason)
            && Objects.equals(this.failureDetailMsg, that.failureDetailMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountName, completedAt, createdAt, id, state, failureReason, failureDetailMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccountStatusDto {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("    failureDetailMsg: ").append(toIndentedString(failureDetailMsg)).append("\n");
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
