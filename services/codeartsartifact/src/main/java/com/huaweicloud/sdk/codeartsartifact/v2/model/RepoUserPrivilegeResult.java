package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepoUserPrivilegeResult
 */
public class RepoUserPrivilegeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<RepoUserPrivilegeV5> list = null;

    public RepoUserPrivilegeResult withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 用户数量。 **取值范围**: 不涉及。 
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public RepoUserPrivilegeResult withList(List<RepoUserPrivilegeV5> list) {
        this.list = list;
        return this;
    }

    public RepoUserPrivilegeResult addListItem(RepoUserPrivilegeV5 listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public RepoUserPrivilegeResult withList(Consumer<List<RepoUserPrivilegeV5>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * **参数解释**: 用户列表。 **取值范围**: 不涉及。 
     * @return list
     */
    public List<RepoUserPrivilegeV5> getList() {
        return list;
    }

    public void setList(List<RepoUserPrivilegeV5> list) {
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
        RepoUserPrivilegeResult that = (RepoUserPrivilegeResult) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoUserPrivilegeResult {\n");
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
