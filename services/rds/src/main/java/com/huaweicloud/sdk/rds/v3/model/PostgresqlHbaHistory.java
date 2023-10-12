package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PostgresqlHbaHistory
 */
public class PostgresqlHbaHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private OffsetDateTime time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_confs")

    private List<PostgresqlHbaConf> beforeConfs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_confs")

    private List<PostgresqlHbaConf> afterConfs = null;

    public PostgresqlHbaHistory withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 修改结果，    success：已生效     failed：未生效     setting：设置中\",
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PostgresqlHbaHistory withTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * 修改时间
     * @return time
     */
    public OffsetDateTime getTime() {
        return time;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    public PostgresqlHbaHistory withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 修改失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public PostgresqlHbaHistory withBeforeConfs(List<PostgresqlHbaConf> beforeConfs) {
        this.beforeConfs = beforeConfs;
        return this;
    }

    public PostgresqlHbaHistory addBeforeConfsItem(PostgresqlHbaConf beforeConfsItem) {
        if (this.beforeConfs == null) {
            this.beforeConfs = new ArrayList<>();
        }
        this.beforeConfs.add(beforeConfsItem);
        return this;
    }

    public PostgresqlHbaHistory withBeforeConfs(Consumer<List<PostgresqlHbaConf>> beforeConfsSetter) {
        if (this.beforeConfs == null) {
            this.beforeConfs = new ArrayList<>();
        }
        beforeConfsSetter.accept(this.beforeConfs);
        return this;
    }

    /**
     * 修改之前的值
     * @return beforeConfs
     */
    public List<PostgresqlHbaConf> getBeforeConfs() {
        return beforeConfs;
    }

    public void setBeforeConfs(List<PostgresqlHbaConf> beforeConfs) {
        this.beforeConfs = beforeConfs;
    }

    public PostgresqlHbaHistory withAfterConfs(List<PostgresqlHbaConf> afterConfs) {
        this.afterConfs = afterConfs;
        return this;
    }

    public PostgresqlHbaHistory addAfterConfsItem(PostgresqlHbaConf afterConfsItem) {
        if (this.afterConfs == null) {
            this.afterConfs = new ArrayList<>();
        }
        this.afterConfs.add(afterConfsItem);
        return this;
    }

    public PostgresqlHbaHistory withAfterConfs(Consumer<List<PostgresqlHbaConf>> afterConfsSetter) {
        if (this.afterConfs == null) {
            this.afterConfs = new ArrayList<>();
        }
        afterConfsSetter.accept(this.afterConfs);
        return this;
    }

    /**
     * 修改之后的值
     * @return afterConfs
     */
    public List<PostgresqlHbaConf> getAfterConfs() {
        return afterConfs;
    }

    public void setAfterConfs(List<PostgresqlHbaConf> afterConfs) {
        this.afterConfs = afterConfs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgresqlHbaHistory that = (PostgresqlHbaHistory) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.time, that.time)
            && Objects.equals(this.failReason, that.failReason) && Objects.equals(this.beforeConfs, that.beforeConfs)
            && Objects.equals(this.afterConfs, that.afterConfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, time, failReason, beforeConfs, afterConfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlHbaHistory {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    beforeConfs: ").append(toIndentedString(beforeConfs)).append("\n");
        sb.append("    afterConfs: ").append(toIndentedString(afterConfs)).append("\n");
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
