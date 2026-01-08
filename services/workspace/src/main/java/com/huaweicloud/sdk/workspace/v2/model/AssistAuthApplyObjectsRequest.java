package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新辅助认证应用对象列表。
 */
public class AssistAuthApplyObjectsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add")

    private List<ApplyObjects> add = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete")

    private List<ApplyObjects> delete = null;

    public AssistAuthApplyObjectsRequest withAdd(List<ApplyObjects> add) {
        this.add = add;
        return this;
    }

    public AssistAuthApplyObjectsRequest addAddItem(ApplyObjects addItem) {
        if (this.add == null) {
            this.add = new ArrayList<>();
        }
        this.add.add(addItem);
        return this;
    }

    public AssistAuthApplyObjectsRequest withAdd(Consumer<List<ApplyObjects>> addSetter) {
        if (this.add == null) {
            this.add = new ArrayList<>();
        }
        addSetter.accept(this.add);
        return this;
    }

    /**
     * 需要新增的应用对象。
     * @return add
     */
    public List<ApplyObjects> getAdd() {
        return add;
    }

    public void setAdd(List<ApplyObjects> add) {
        this.add = add;
    }

    public AssistAuthApplyObjectsRequest withDelete(List<ApplyObjects> delete) {
        this.delete = delete;
        return this;
    }

    public AssistAuthApplyObjectsRequest addDeleteItem(ApplyObjects deleteItem) {
        if (this.delete == null) {
            this.delete = new ArrayList<>();
        }
        this.delete.add(deleteItem);
        return this;
    }

    public AssistAuthApplyObjectsRequest withDelete(Consumer<List<ApplyObjects>> deleteSetter) {
        if (this.delete == null) {
            this.delete = new ArrayList<>();
        }
        deleteSetter.accept(this.delete);
        return this;
    }

    /**
     * 要移除的应用对象。
     * @return delete
     */
    public List<ApplyObjects> getDelete() {
        return delete;
    }

    public void setDelete(List<ApplyObjects> delete) {
        this.delete = delete;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssistAuthApplyObjectsRequest that = (AssistAuthApplyObjectsRequest) obj;
        return Objects.equals(this.add, that.add) && Objects.equals(this.delete, that.delete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(add, delete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistAuthApplyObjectsRequest {\n");
        sb.append("    add: ").append(toIndentedString(add)).append("\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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
