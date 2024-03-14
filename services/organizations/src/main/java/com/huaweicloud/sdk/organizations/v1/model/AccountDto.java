package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 包含组织成员的账号的有关信息。
 */
public class AccountDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_method")

    private String joinMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "joined_at")

    private OffsetDateTime joinedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public AccountDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 账号的唯一标识符（ID）。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccountDto withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 账号的统一资源名称。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public AccountDto withJoinMethod(String joinMethod) {
        this.joinMethod = joinMethod;
        return this;
    }

    /**
     * 账号加入组织的方式,invited：邀请加入，created：创建加入。
     * @return joinMethod
     */
    public String getJoinMethod() {
        return joinMethod;
    }

    public void setJoinMethod(String joinMethod) {
        this.joinMethod = joinMethod;
    }

    public AccountDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 账号当前的状态,ACTIVE 有效| SUSPENDED 静默| PENDING_CLOSURE 关闭中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AccountDto withJoinedAt(OffsetDateTime joinedAt) {
        this.joinedAt = joinedAt;
        return this;
    }

    /**
     * 账号加入组织的日期。
     * @return joinedAt
     */
    public OffsetDateTime getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(OffsetDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    public AccountDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 账号名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountDto that = (AccountDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.joinMethod, that.joinMethod) && Objects.equals(this.status, that.status)
            && Objects.equals(this.joinedAt, that.joinedAt) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, urn, joinMethod, status, joinedAt, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    joinMethod: ").append(toIndentedString(joinMethod)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    joinedAt: ").append(toIndentedString(joinedAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
