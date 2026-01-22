package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddBlackWhiteListBatchVO
 */
public class AddBlackWhiteListBatchVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duplicated_list")

    private List<BlackWhiteInfo> duplicatedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_list")

    private List<BlackWhiteInfo> failedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_list")

    private List<BlackWhiteInfo> successList = null;

    public AddBlackWhiteListBatchVO withDuplicatedList(List<BlackWhiteInfo> duplicatedList) {
        this.duplicatedList = duplicatedList;
        return this;
    }

    public AddBlackWhiteListBatchVO addDuplicatedListItem(BlackWhiteInfo duplicatedListItem) {
        if (this.duplicatedList == null) {
            this.duplicatedList = new ArrayList<>();
        }
        this.duplicatedList.add(duplicatedListItem);
        return this;
    }

    public AddBlackWhiteListBatchVO withDuplicatedList(Consumer<List<BlackWhiteInfo>> duplicatedListSetter) {
        if (this.duplicatedList == null) {
            this.duplicatedList = new ArrayList<>();
        }
        duplicatedListSetter.accept(this.duplicatedList);
        return this;
    }

    /**
     * **参数解释**： 黑白名单重复添加列表 **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return duplicatedList
     */
    public List<BlackWhiteInfo> getDuplicatedList() {
        return duplicatedList;
    }

    public void setDuplicatedList(List<BlackWhiteInfo> duplicatedList) {
        this.duplicatedList = duplicatedList;
    }

    public AddBlackWhiteListBatchVO withFailedList(List<BlackWhiteInfo> failedList) {
        this.failedList = failedList;
        return this;
    }

    public AddBlackWhiteListBatchVO addFailedListItem(BlackWhiteInfo failedListItem) {
        if (this.failedList == null) {
            this.failedList = new ArrayList<>();
        }
        this.failedList.add(failedListItem);
        return this;
    }

    public AddBlackWhiteListBatchVO withFailedList(Consumer<List<BlackWhiteInfo>> failedListSetter) {
        if (this.failedList == null) {
            this.failedList = new ArrayList<>();
        }
        failedListSetter.accept(this.failedList);
        return this;
    }

    /**
     * **参数解释**： 黑白名单添加失败列表 **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return failedList
     */
    public List<BlackWhiteInfo> getFailedList() {
        return failedList;
    }

    public void setFailedList(List<BlackWhiteInfo> failedList) {
        this.failedList = failedList;
    }

    public AddBlackWhiteListBatchVO withSuccessList(List<BlackWhiteInfo> successList) {
        this.successList = successList;
        return this;
    }

    public AddBlackWhiteListBatchVO addSuccessListItem(BlackWhiteInfo successListItem) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        this.successList.add(successListItem);
        return this;
    }

    public AddBlackWhiteListBatchVO withSuccessList(Consumer<List<BlackWhiteInfo>> successListSetter) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        successListSetter.accept(this.successList);
        return this;
    }

    /**
     * **参数解释**： 黑白名单添加成功列表 **约束限制**： 不涉及  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return successList
     */
    public List<BlackWhiteInfo> getSuccessList() {
        return successList;
    }

    public void setSuccessList(List<BlackWhiteInfo> successList) {
        this.successList = successList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddBlackWhiteListBatchVO that = (AddBlackWhiteListBatchVO) obj;
        return Objects.equals(this.duplicatedList, that.duplicatedList)
            && Objects.equals(this.failedList, that.failedList) && Objects.equals(this.successList, that.successList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duplicatedList, failedList, successList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddBlackWhiteListBatchVO {\n");
        sb.append("    duplicatedList: ").append(toIndentedString(duplicatedList)).append("\n");
        sb.append("    failedList: ").append(toIndentedString(failedList)).append("\n");
        sb.append("    successList: ").append(toIndentedString(successList)).append("\n");
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
