package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 状态变更结果对象，包含不可完成的AR工作项列表。 **约束限制**： 不涉及。
 */
public class StatusChangeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cannot_finish_ar")

    private List<WorkItemVO> cannotFinishAr = null;

    public StatusChangeResult withCannotFinishAr(List<WorkItemVO> cannotFinishAr) {
        this.cannotFinishAr = cannotFinishAr;
        return this;
    }

    public StatusChangeResult addCannotFinishArItem(WorkItemVO cannotFinishArItem) {
        if (this.cannotFinishAr == null) {
            this.cannotFinishAr = new ArrayList<>();
        }
        this.cannotFinishAr.add(cannotFinishArItem);
        return this;
    }

    public StatusChangeResult withCannotFinishAr(Consumer<List<WorkItemVO>> cannotFinishArSetter) {
        if (this.cannotFinishAr == null) {
            this.cannotFinishAr = new ArrayList<>();
        }
        cannotFinishArSetter.accept(this.cannotFinishAr);
        return this;
    }

    /**
     * **参数解释**： 不可完成的AR工作项列表，当完成发布/迭代时，未完成的AR工作项会列出在此。
     * @return cannotFinishAr
     */
    public List<WorkItemVO> getCannotFinishAr() {
        return cannotFinishAr;
    }

    public void setCannotFinishAr(List<WorkItemVO> cannotFinishAr) {
        this.cannotFinishAr = cannotFinishAr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusChangeResult that = (StatusChangeResult) obj;
        return Objects.equals(this.cannotFinishAr, that.cannotFinishAr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cannotFinishAr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusChangeResult {\n");
        sb.append("    cannotFinishAr: ").append(toIndentedString(cannotFinishAr)).append("\n");
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
