package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListMergeRequestReviewersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required_reviewers_list")

    private List<MergeRequestApprovalUserDto> requiredReviewersList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_reviewers_list")

    private List<MergeRequestApprovalUserDto> optionalReviewersList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ListMergeRequestReviewersResponse withRequiredReviewersList(
        List<MergeRequestApprovalUserDto> requiredReviewersList) {
        this.requiredReviewersList = requiredReviewersList;
        return this;
    }

    public ListMergeRequestReviewersResponse addRequiredReviewersListItem(
        MergeRequestApprovalUserDto requiredReviewersListItem) {
        if (this.requiredReviewersList == null) {
            this.requiredReviewersList = new ArrayList<>();
        }
        this.requiredReviewersList.add(requiredReviewersListItem);
        return this;
    }

    public ListMergeRequestReviewersResponse withRequiredReviewersList(
        Consumer<List<MergeRequestApprovalUserDto>> requiredReviewersListSetter) {
        if (this.requiredReviewersList == null) {
            this.requiredReviewersList = new ArrayList<>();
        }
        requiredReviewersListSetter.accept(this.requiredReviewersList);
        return this;
    }

    /**
     * **参数解释：** 必选检视人列表。 **取值范围：** 不涉及。
     * @return requiredReviewersList
     */
    public List<MergeRequestApprovalUserDto> getRequiredReviewersList() {
        return requiredReviewersList;
    }

    public void setRequiredReviewersList(List<MergeRequestApprovalUserDto> requiredReviewersList) {
        this.requiredReviewersList = requiredReviewersList;
    }

    public ListMergeRequestReviewersResponse withOptionalReviewersList(
        List<MergeRequestApprovalUserDto> optionalReviewersList) {
        this.optionalReviewersList = optionalReviewersList;
        return this;
    }

    public ListMergeRequestReviewersResponse addOptionalReviewersListItem(
        MergeRequestApprovalUserDto optionalReviewersListItem) {
        if (this.optionalReviewersList == null) {
            this.optionalReviewersList = new ArrayList<>();
        }
        this.optionalReviewersList.add(optionalReviewersListItem);
        return this;
    }

    public ListMergeRequestReviewersResponse withOptionalReviewersList(
        Consumer<List<MergeRequestApprovalUserDto>> optionalReviewersListSetter) {
        if (this.optionalReviewersList == null) {
            this.optionalReviewersList = new ArrayList<>();
        }
        optionalReviewersListSetter.accept(this.optionalReviewersList);
        return this;
    }

    /**
     * **参数解释：** 可选检视人列表。 **取值范围：** 不涉及。
     * @return optionalReviewersList
     */
    public List<MergeRequestApprovalUserDto> getOptionalReviewersList() {
        return optionalReviewersList;
    }

    public void setOptionalReviewersList(List<MergeRequestApprovalUserDto> optionalReviewersList) {
        this.optionalReviewersList = optionalReviewersList;
    }

    public ListMergeRequestReviewersResponse withXTotal(String xTotal) {
        this.xTotal = xTotal;
        return this;
    }

    /**
     * Get xTotal
     * @return xTotal
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")
    public String getXTotal() {
        return xTotal;
    }

    public void setXTotal(String xTotal) {
        this.xTotal = xTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMergeRequestReviewersResponse that = (ListMergeRequestReviewersResponse) obj;
        return Objects.equals(this.requiredReviewersList, that.requiredReviewersList)
            && Objects.equals(this.optionalReviewersList, that.optionalReviewersList)
            && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredReviewersList, optionalReviewersList, xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMergeRequestReviewersResponse {\n");
        sb.append("    requiredReviewersList: ").append(toIndentedString(requiredReviewersList)).append("\n");
        sb.append("    optionalReviewersList: ").append(toIndentedString(optionalReviewersList)).append("\n");
        sb.append("    xTotal: ").append(toIndentedString(xTotal)).append("\n");
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
