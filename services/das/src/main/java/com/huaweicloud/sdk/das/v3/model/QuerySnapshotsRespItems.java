package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QuerySnapshotsRespItems
 */
public class QuerySnapshotsRespItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Integer createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_lock")

    private Integer findLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happen_at")

    private Integer happenAt;

    public QuerySnapshotsRespItems withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * snapshot编号
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public QuerySnapshotsRespItems withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 表示状态，0表示等待，1表示正在运行，2表示失败，3表示成功
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public QuerySnapshotsRespItems withCreateAt(Integer createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public QuerySnapshotsRespItems withFindLock(Integer findLock) {
        this.findLock = findLock;
        return this;
    }

    /**
     * 是否发现锁，1表示发现了锁，0表示没有
     * @return findLock
     */
    public Integer getFindLock() {
        return findLock;
    }

    public void setFindLock(Integer findLock) {
        this.findLock = findLock;
    }

    public QuerySnapshotsRespItems withHappenAt(Integer happenAt) {
        this.happenAt = happenAt;
        return this;
    }

    /**
     * 发生锁的时间
     * @return happenAt
     */
    public Integer getHappenAt() {
        return happenAt;
    }

    public void setHappenAt(Integer happenAt) {
        this.happenAt = happenAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuerySnapshotsRespItems that = (QuerySnapshotsRespItems) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.findLock, that.findLock)
            && Objects.equals(this.happenAt, that.happenAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, createAt, findLock, happenAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySnapshotsRespItems {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    findLock: ").append(toIndentedString(findLock)).append("\n");
        sb.append("    happenAt: ").append(toIndentedString(happenAt)).append("\n");
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
