package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 根据快照查询工作项信息的请求对象
 */
public class SnapshotIssueRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple_result")

    private Boolean simpleResult;

    public SnapshotIssueRequest withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public SnapshotIssueRequest addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public SnapshotIssueRequest withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 快照的ID数组。可以通过查询工作项快照列表接口获取，响应消息体中的id字段的值就是工作项快照ID。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public SnapshotIssueRequest withSimpleResult(Boolean simpleResult) {
        this.simpleResult = simpleResult;
        return this;
    }

    /**
     * 是否返回工作项简要信息。 当值为false时ids中仅支持5个快照ID；值为true时，ids最多支持50个快照ID。
     * @return simpleResult
     */
    public Boolean getSimpleResult() {
        return simpleResult;
    }

    public void setSimpleResult(Boolean simpleResult) {
        this.simpleResult = simpleResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotIssueRequest that = (SnapshotIssueRequest) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.simpleResult, that.simpleResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, simpleResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotIssueRequest {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    simpleResult: ").append(toIndentedString(simpleResult)).append("\n");
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
