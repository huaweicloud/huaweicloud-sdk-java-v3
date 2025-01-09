package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAuthorizationMailRecordRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mail_send_type")

    private String mailSendType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mail_send_result")

    private String mailSendResult;

    public ListAuthorizationMailRecordRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的大小[1-100]。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAuthorizationMailRecordRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAuthorizationMailRecordRequest withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * 应用组ID。
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    public ListAuthorizationMailRecordRequest withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 用户(组)名称。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ListAuthorizationMailRecordRequest withMailSendType(String mailSendType) {
        this.mailSendType = mailSendType;
        return this;
    }

    /**
     * 授权类型： - ADD_GROUP_AUTHORIZATION 添加组授权 - DEL_GROUP_AUTHORIZATION 删除组授权
     * @return mailSendType
     */
    public String getMailSendType() {
        return mailSendType;
    }

    public void setMailSendType(String mailSendType) {
        this.mailSendType = mailSendType;
    }

    public ListAuthorizationMailRecordRequest withMailSendResult(String mailSendResult) {
        this.mailSendResult = mailSendResult;
        return this;
    }

    /**
     * 邮件发送结果(SUCCESS|FAIL)。
     * @return mailSendResult
     */
    public String getMailSendResult() {
        return mailSendResult;
    }

    public void setMailSendResult(String mailSendResult) {
        this.mailSendResult = mailSendResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthorizationMailRecordRequest that = (ListAuthorizationMailRecordRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.appGroupId, that.appGroupId) && Objects.equals(this.account, that.account)
            && Objects.equals(this.mailSendType, that.mailSendType)
            && Objects.equals(this.mailSendResult, that.mailSendResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, appGroupId, account, mailSendType, mailSendResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorizationMailRecordRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    mailSendType: ").append(toIndentedString(mailSendType)).append("\n");
        sb.append("    mailSendResult: ").append(toIndentedString(mailSendResult)).append("\n");
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
