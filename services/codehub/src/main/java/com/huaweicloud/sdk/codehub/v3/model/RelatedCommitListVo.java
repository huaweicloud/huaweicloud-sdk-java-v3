package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RelatedCommitListVo
 */
public class RelatedCommitListVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<RelatedCommitVo> list = null;

    public RelatedCommitListVo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public RelatedCommitListVo withList(List<RelatedCommitVo> list) {
        this.list = list;
        return this;
    }

    public RelatedCommitListVo addListItem(RelatedCommitVo listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public RelatedCommitListVo withList(Consumer<List<RelatedCommitVo>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * Get list
     * @return list
     */
    public List<RelatedCommitVo> getList() {
        return list;
    }

    public void setList(List<RelatedCommitVo> list) {
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
        RelatedCommitListVo that = (RelatedCommitListVo) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedCommitListVo {\n");
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
