package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BindLtsConfigRequestBody
 */
public class BindLtsConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<InstanceSaveLtsConfigOption> list = null;

    public BindLtsConfigRequestBody withList(List<InstanceSaveLtsConfigOption> list) {
        this.list = list;
        return this;
    }

    public BindLtsConfigRequestBody addListItem(InstanceSaveLtsConfigOption listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public BindLtsConfigRequestBody withList(Consumer<List<InstanceSaveLtsConfigOption>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * **参数解释**: 下发配置的实例日志列表。列表最大长度为1000。 **约束限制**: 不涉及。
     * @return list
     */
    public List<InstanceSaveLtsConfigOption> getList() {
        return list;
    }

    public void setList(List<InstanceSaveLtsConfigOption> list) {
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
        BindLtsConfigRequestBody that = (BindLtsConfigRequestBody) obj;
        return Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindLtsConfigRequestBody {\n");
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
