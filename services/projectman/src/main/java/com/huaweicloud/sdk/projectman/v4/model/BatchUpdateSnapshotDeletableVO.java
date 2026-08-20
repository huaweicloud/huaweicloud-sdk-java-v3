package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量更新快照可删除标识请求对象。
 */
public class BatchUpdateSnapshotDeletableVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Boolean deletable;

    public BatchUpdateSnapshotDeletableVO withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public BatchUpdateSnapshotDeletableVO addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public BatchUpdateSnapshotDeletableVO withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 快照ID列表。通过接口查询工作项计划管理快照列表获取响应参数中的id字段。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public BatchUpdateSnapshotDeletableVO withDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * 是否为可删除标识。
     * @return deletable
     */
    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateSnapshotDeletableVO that = (BatchUpdateSnapshotDeletableVO) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.deletable, that.deletable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, deletable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateSnapshotDeletableVO {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
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
