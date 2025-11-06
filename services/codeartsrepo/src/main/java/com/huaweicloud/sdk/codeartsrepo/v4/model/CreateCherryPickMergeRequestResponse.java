package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateCherryPickMergeRequestResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cherry_pick_branch_name")

    private String cherryPickBranchName;

    public CreateCherryPickMergeRequestResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * CherryPick结果
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CreateCherryPickMergeRequestResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * CherryPick标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateCherryPickMergeRequestResponse withCherryPickBranchName(String cherryPickBranchName) {
        this.cherryPickBranchName = cherryPickBranchName;
        return this;
    }

    /**
     * CherryPick临时分支名名称
     * @return cherryPickBranchName
     */
    public String getCherryPickBranchName() {
        return cherryPickBranchName;
    }

    public void setCherryPickBranchName(String cherryPickBranchName) {
        this.cherryPickBranchName = cherryPickBranchName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCherryPickMergeRequestResponse that = (CreateCherryPickMergeRequestResponse) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.title, that.title)
            && Objects.equals(this.cherryPickBranchName, that.cherryPickBranchName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, title, cherryPickBranchName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCherryPickMergeRequestResponse {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    cherryPickBranchName: ").append(toIndentedString(cherryPickBranchName)).append("\n");
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
