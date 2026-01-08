package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HbaHistoryResult
 */
public class HbaHistoryResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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

    private List<HbaConfResult> beforeConfs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_confs")

    private List<HbaConfResult> afterConfs = null;

    public HbaHistoryResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 客户端接入认证修改记录的ID。 **取值范围**: 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HbaHistoryResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 修改结果。 **取值范围**:  - success：已生效。  - failed：未生效。  - etting：设置中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HbaHistoryResult withTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**: 修改时间。 **取值范围**: 不涉及。
     * @return time
     */
    public OffsetDateTime getTime() {
        return time;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    public HbaHistoryResult withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * **参数解释**: 修改失败原因。 **取值范围**: 不涉及。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public HbaHistoryResult withBeforeConfs(List<HbaConfResult> beforeConfs) {
        this.beforeConfs = beforeConfs;
        return this;
    }

    public HbaHistoryResult addBeforeConfsItem(HbaConfResult beforeConfsItem) {
        if (this.beforeConfs == null) {
            this.beforeConfs = new ArrayList<>();
        }
        this.beforeConfs.add(beforeConfsItem);
        return this;
    }

    public HbaHistoryResult withBeforeConfs(Consumer<List<HbaConfResult>> beforeConfsSetter) {
        if (this.beforeConfs == null) {
            this.beforeConfs = new ArrayList<>();
        }
        beforeConfsSetter.accept(this.beforeConfs);
        return this;
    }

    /**
     * **参数解释**: 修改之前的值。
     * @return beforeConfs
     */
    public List<HbaConfResult> getBeforeConfs() {
        return beforeConfs;
    }

    public void setBeforeConfs(List<HbaConfResult> beforeConfs) {
        this.beforeConfs = beforeConfs;
    }

    public HbaHistoryResult withAfterConfs(List<HbaConfResult> afterConfs) {
        this.afterConfs = afterConfs;
        return this;
    }

    public HbaHistoryResult addAfterConfsItem(HbaConfResult afterConfsItem) {
        if (this.afterConfs == null) {
            this.afterConfs = new ArrayList<>();
        }
        this.afterConfs.add(afterConfsItem);
        return this;
    }

    public HbaHistoryResult withAfterConfs(Consumer<List<HbaConfResult>> afterConfsSetter) {
        if (this.afterConfs == null) {
            this.afterConfs = new ArrayList<>();
        }
        afterConfsSetter.accept(this.afterConfs);
        return this;
    }

    /**
     * **参数解释**: 修改之后的值。
     * @return afterConfs
     */
    public List<HbaConfResult> getAfterConfs() {
        return afterConfs;
    }

    public void setAfterConfs(List<HbaConfResult> afterConfs) {
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
        HbaHistoryResult that = (HbaHistoryResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.time, that.time) && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.beforeConfs, that.beforeConfs) && Objects.equals(this.afterConfs, that.afterConfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, time, failReason, beforeConfs, afterConfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HbaHistoryResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
