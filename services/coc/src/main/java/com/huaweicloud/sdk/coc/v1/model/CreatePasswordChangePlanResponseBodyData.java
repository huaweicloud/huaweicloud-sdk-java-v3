package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 改密计划具体数据
 */
public class CreatePasswordChangePlanResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<AccountChangePwdPlan> list = null;

    public CreatePasswordChangePlanResponseBodyData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 改密计划总条数
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CreatePasswordChangePlanResponseBodyData withList(List<AccountChangePwdPlan> list) {
        this.list = list;
        return this;
    }

    public CreatePasswordChangePlanResponseBodyData addListItem(AccountChangePwdPlan listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public CreatePasswordChangePlanResponseBodyData withList(Consumer<List<AccountChangePwdPlan>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 改密计划具体信息
     * @return list
     */
    public List<AccountChangePwdPlan> getList() {
        return list;
    }

    public void setList(List<AccountChangePwdPlan> list) {
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
        CreatePasswordChangePlanResponseBodyData that = (CreatePasswordChangePlanResponseBodyData) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePasswordChangePlanResponseBodyData {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
