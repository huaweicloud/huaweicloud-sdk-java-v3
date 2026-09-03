package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 锁快照信息
 */
public class Snapshot {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_lock")

    private Integer findLock;

    public Snapshot withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 快照ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Snapshot withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 快照状态。取值范围：0（等待中）、1（运行中）、2（失败）、3（成功）
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Snapshot withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 锁快照创建时间
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Snapshot withFindLock(Integer findLock) {
        this.findLock = findLock;
        return this;
    }

    /**
     * 是否找到有锁。取值范围：0（否）、1（是）
     * @return findLock
     */
    public Integer getFindLock() {
        return findLock;
    }

    public void setFindLock(Integer findLock) {
        this.findLock = findLock;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Snapshot that = (Snapshot) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.findLock, that.findLock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, createAt, findLock);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Snapshot {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    findLock: ").append(toIndentedString(findLock)).append("\n");
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
