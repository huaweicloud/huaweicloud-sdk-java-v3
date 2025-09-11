package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UnbindLtsConfigRequestBody
 */
public class UnbindLtsConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<InstanceDeleteLtsConfigOption> list = null;

    public UnbindLtsConfigRequestBody withList(List<InstanceDeleteLtsConfigOption> list) {
        this.list = list;
        return this;
    }

    public UnbindLtsConfigRequestBody addListItem(InstanceDeleteLtsConfigOption listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public UnbindLtsConfigRequestBody withList(Consumer<List<InstanceDeleteLtsConfigOption>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * **参数解释**: 解除关联的实例日志列表。 **约束限制**: 不涉及。
     * @return list
     */
    public List<InstanceDeleteLtsConfigOption> getList() {
        return list;
    }

    public void setList(List<InstanceDeleteLtsConfigOption> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnbindLtsConfigRequestBody that = (UnbindLtsConfigRequestBody) obj;
        return Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnbindLtsConfigRequestBody {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
