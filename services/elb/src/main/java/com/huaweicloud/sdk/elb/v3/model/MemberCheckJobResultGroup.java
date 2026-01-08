package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：配置检查。
 */
public class MemberCheckJobResultGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private Boolean checkResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_items")

    private List<MemberCheckJobResultItem> checkItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_status")

    private String checkStatus;

    public MemberCheckJobResultGroup withCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * **参数解释**：检查结果，true表示检查通过，false为检查不通过。  **取值范围**：不涉及
     * @return checkResult
     */
    public Boolean getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
    }

    public MemberCheckJobResultGroup withCheckItems(List<MemberCheckJobResultItem> checkItems) {
        this.checkItems = checkItems;
        return this;
    }

    public MemberCheckJobResultGroup addCheckItemsItem(MemberCheckJobResultItem checkItemsItem) {
        if (this.checkItems == null) {
            this.checkItems = new ArrayList<>();
        }
        this.checkItems.add(checkItemsItem);
        return this;
    }

    public MemberCheckJobResultGroup withCheckItems(Consumer<List<MemberCheckJobResultItem>> checkItemsSetter) {
        if (this.checkItems == null) {
            this.checkItems = new ArrayList<>();
        }
        checkItemsSetter.accept(this.checkItems);
        return this;
    }

    /**
     * **参数解释**：分组检查项汇总。
     * @return checkItems
     */
    public List<MemberCheckJobResultItem> getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(List<MemberCheckJobResultItem> checkItems) {
        this.checkItems = checkItems;
    }

    public MemberCheckJobResultGroup withCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }

    /**
     * **参数解释**：processed检查完成，processing检查中，failed检查失败。  **取值范围**：不涉及
     * @return checkStatus
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberCheckJobResultGroup that = (MemberCheckJobResultGroup) obj;
        return Objects.equals(this.checkResult, that.checkResult) && Objects.equals(this.checkItems, that.checkItems)
            && Objects.equals(this.checkStatus, that.checkStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkResult, checkItems, checkStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberCheckJobResultGroup {\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
        sb.append("    checkItems: ").append(toIndentedString(checkItems)).append("\n");
        sb.append("    checkStatus: ").append(toIndentedString(checkStatus)).append("\n");
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
