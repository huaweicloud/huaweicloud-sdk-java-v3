package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateGroupGeneralPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_fork")

    private Boolean disableFork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name_regex")

    private String branchNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name_regex")

    private String tagNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_pre_merge_ref")

    private Boolean generatePreMergeRef;

    public UpdateGroupGeneralPolicyResponse withDisableFork(Boolean disableFork) {
        this.disableFork = disableFork;
        return this;
    }

    /**
     * **参数解释：** 是否禁用fork。
     * @return disableFork
     */
    public Boolean getDisableFork() {
        return disableFork;
    }

    public void setDisableFork(Boolean disableFork) {
        this.disableFork = disableFork;
    }

    public UpdateGroupGeneralPolicyResponse withBranchNameRegex(String branchNameRegex) {
        this.branchNameRegex = branchNameRegex;
        return this;
    }

    /**
     * **参数解释：** 分支名称正则表达式。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return branchNameRegex
     */
    public String getBranchNameRegex() {
        return branchNameRegex;
    }

    public void setBranchNameRegex(String branchNameRegex) {
        this.branchNameRegex = branchNameRegex;
    }

    public UpdateGroupGeneralPolicyResponse withTagNameRegex(String tagNameRegex) {
        this.tagNameRegex = tagNameRegex;
        return this;
    }

    /**
     * **参数解释：** 标签名正则表达式。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return tagNameRegex
     */
    public String getTagNameRegex() {
        return tagNameRegex;
    }

    public void setTagNameRegex(String tagNameRegex) {
        this.tagNameRegex = tagNameRegex;
    }

    public UpdateGroupGeneralPolicyResponse withGeneratePreMergeRef(Boolean generatePreMergeRef) {
        this.generatePreMergeRef = generatePreMergeRef;
        return this;
    }

    /**
     * **参数解释：** 生成合并请求预合并。
     * @return generatePreMergeRef
     */
    public Boolean getGeneratePreMergeRef() {
        return generatePreMergeRef;
    }

    public void setGeneratePreMergeRef(Boolean generatePreMergeRef) {
        this.generatePreMergeRef = generatePreMergeRef;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGroupGeneralPolicyResponse that = (UpdateGroupGeneralPolicyResponse) obj;
        return Objects.equals(this.disableFork, that.disableFork)
            && Objects.equals(this.branchNameRegex, that.branchNameRegex)
            && Objects.equals(this.tagNameRegex, that.tagNameRegex)
            && Objects.equals(this.generatePreMergeRef, that.generatePreMergeRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disableFork, branchNameRegex, tagNameRegex, generatePreMergeRef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupGeneralPolicyResponse {\n");
        sb.append("    disableFork: ").append(toIndentedString(disableFork)).append("\n");
        sb.append("    branchNameRegex: ").append(toIndentedString(branchNameRegex)).append("\n");
        sb.append("    tagNameRegex: ").append(toIndentedString(tagNameRegex)).append("\n");
        sb.append("    generatePreMergeRef: ").append(toIndentedString(generatePreMergeRef)).append("\n");
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
