package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据修复信息。
 */
public class ActionParamsRepairInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objects")

    private List<ActionParamsRepairInfoObjects> objects = null;

    public ActionParamsRepairInfo withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * 对比任务ID。
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public ActionParamsRepairInfo withObjects(List<ActionParamsRepairInfoObjects> objects) {
        this.objects = objects;
        return this;
    }

    public ActionParamsRepairInfo addObjectsItem(ActionParamsRepairInfoObjects objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    public ActionParamsRepairInfo withObjects(Consumer<List<ActionParamsRepairInfoObjects>> objectsSetter) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        objectsSetter.accept(this.objects);
        return this;
    }

    /**
     * 数据修复对象信息。
     * @return objects
     */
    public List<ActionParamsRepairInfoObjects> getObjects() {
        return objects;
    }

    public void setObjects(List<ActionParamsRepairInfoObjects> objects) {
        this.objects = objects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionParamsRepairInfo that = (ActionParamsRepairInfo) obj;
        return Objects.equals(this.queryId, that.queryId) && Objects.equals(this.objects, that.objects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryId, objects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionParamsRepairInfo {\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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
