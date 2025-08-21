package com.huaweicloud.sdk.codehub.v4.model;

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
public class ListMergeRequestApproversResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required_approvers_list")

    private List<UserBasicDto> requiredApproversList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_approvers_list")

    private List<UserBasicDto> optionalApproversList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ListMergeRequestApproversResponse withRequiredApproversList(List<UserBasicDto> requiredApproversList) {
        this.requiredApproversList = requiredApproversList;
        return this;
    }

    public ListMergeRequestApproversResponse addRequiredApproversListItem(UserBasicDto requiredApproversListItem) {
        if (this.requiredApproversList == null) {
            this.requiredApproversList = new ArrayList<>();
        }
        this.requiredApproversList.add(requiredApproversListItem);
        return this;
    }

    public ListMergeRequestApproversResponse withRequiredApproversList(
        Consumer<List<UserBasicDto>> requiredApproversListSetter) {
        if (this.requiredApproversList == null) {
            this.requiredApproversList = new ArrayList<>();
        }
        requiredApproversListSetter.accept(this.requiredApproversList);
        return this;
    }

    /**
     * **参数解释：** 必选审核人列表。 **取值范围：** 不涉及。
     * @return requiredApproversList
     */
    public List<UserBasicDto> getRequiredApproversList() {
        return requiredApproversList;
    }

    public void setRequiredApproversList(List<UserBasicDto> requiredApproversList) {
        this.requiredApproversList = requiredApproversList;
    }

    public ListMergeRequestApproversResponse withOptionalApproversList(List<UserBasicDto> optionalApproversList) {
        this.optionalApproversList = optionalApproversList;
        return this;
    }

    public ListMergeRequestApproversResponse addOptionalApproversListItem(UserBasicDto optionalApproversListItem) {
        if (this.optionalApproversList == null) {
            this.optionalApproversList = new ArrayList<>();
        }
        this.optionalApproversList.add(optionalApproversListItem);
        return this;
    }

    public ListMergeRequestApproversResponse withOptionalApproversList(
        Consumer<List<UserBasicDto>> optionalApproversListSetter) {
        if (this.optionalApproversList == null) {
            this.optionalApproversList = new ArrayList<>();
        }
        optionalApproversListSetter.accept(this.optionalApproversList);
        return this;
    }

    /**
     * **参数解释：** 可选审核人列表。 **取值范围：** 不涉及。
     * @return optionalApproversList
     */
    public List<UserBasicDto> getOptionalApproversList() {
        return optionalApproversList;
    }

    public void setOptionalApproversList(List<UserBasicDto> optionalApproversList) {
        this.optionalApproversList = optionalApproversList;
    }

    public ListMergeRequestApproversResponse withXTotal(String xTotal) {
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
        ListMergeRequestApproversResponse that = (ListMergeRequestApproversResponse) obj;
        return Objects.equals(this.requiredApproversList, that.requiredApproversList)
            && Objects.equals(this.optionalApproversList, that.optionalApproversList)
            && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredApproversList, optionalApproversList, xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMergeRequestApproversResponse {\n");
        sb.append("    requiredApproversList: ").append(toIndentedString(requiredApproversList)).append("\n");
        sb.append("    optionalApproversList: ").append(toIndentedString(optionalApproversList)).append("\n");
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
