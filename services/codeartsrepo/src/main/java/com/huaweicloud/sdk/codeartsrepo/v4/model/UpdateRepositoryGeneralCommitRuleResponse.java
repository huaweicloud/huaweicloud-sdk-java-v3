package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateRepositoryGeneralCommitRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reject_unsigned_commits")

    private Boolean rejectUnsignedCommits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reject_not_signed_by_gpg")

    private Boolean rejectNotSignedByGpg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_delete_tag")

    private Boolean denyDeleteTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prevent_secrets")

    private Boolean preventSecrets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_force_push")

    private Boolean denyForcePush;

    public UpdateRepositoryGeneralCommitRuleResponse withRejectUnsignedCommits(Boolean rejectUnsignedCommits) {
        this.rejectUnsignedCommits = rejectUnsignedCommits;
        return this;
    }

    /**
     * **参数解释：** 是否拒绝未Signed-off-by签名的提交。 **约束限制：** 不涉及。 **取值范围：** - true，拒绝未Signed-off-by签名的提交。 - false，允许未Signed-off-by签名的提交。 **默认取值：** 不涉及。
     * @return rejectUnsignedCommits
     */
    public Boolean getRejectUnsignedCommits() {
        return rejectUnsignedCommits;
    }

    public void setRejectUnsignedCommits(Boolean rejectUnsignedCommits) {
        this.rejectUnsignedCommits = rejectUnsignedCommits;
    }

    public UpdateRepositoryGeneralCommitRuleResponse withRejectNotSignedByGpg(Boolean rejectNotSignedByGpg) {
        this.rejectNotSignedByGpg = rejectNotSignedByGpg;
        return this;
    }

    /**
     * **参数解释：** 是否拒绝未GPG签名的提交。 **约束限制：** 不涉及。 **取值范围：** - true，拒绝未GPG签名的提交。 - false，允许未GPG签名的提交。 **默认取值：** 不涉及。
     * @return rejectNotSignedByGpg
     */
    public Boolean getRejectNotSignedByGpg() {
        return rejectNotSignedByGpg;
    }

    public void setRejectNotSignedByGpg(Boolean rejectNotSignedByGpg) {
        this.rejectNotSignedByGpg = rejectNotSignedByGpg;
    }

    public UpdateRepositoryGeneralCommitRuleResponse withDenyDeleteTag(Boolean denyDeleteTag) {
        this.denyDeleteTag = denyDeleteTag;
        return this;
    }

    /**
     * **参数解释：** 是否不允许删除Tags。 **约束限制：** 不涉及。 **取值范围：** - true，不允许删除Tags。 - false，允许删除Tags。 **默认取值：** 不涉及。
     * @return denyDeleteTag
     */
    public Boolean getDenyDeleteTag() {
        return denyDeleteTag;
    }

    public void setDenyDeleteTag(Boolean denyDeleteTag) {
        this.denyDeleteTag = denyDeleteTag;
    }

    public UpdateRepositoryGeneralCommitRuleResponse withPreventSecrets(Boolean preventSecrets) {
        this.preventSecrets = preventSecrets;
        return this;
    }

    /**
     * **参数解释：** 是否阻止包含涉密文件的提交。 **约束限制：** 不涉及。 **取值范围：** - true，阻止包含涉密文件的提交。 - false，允许包含涉密文件的提交。 **默认取值：** 不涉及。
     * @return preventSecrets
     */
    public Boolean getPreventSecrets() {
        return preventSecrets;
    }

    public void setPreventSecrets(Boolean preventSecrets) {
        this.preventSecrets = preventSecrets;
    }

    public UpdateRepositoryGeneralCommitRuleResponse withDenyForcePush(Boolean denyForcePush) {
        this.denyForcePush = denyForcePush;
        return this;
    }

    /**
     * **参数解释：** 是否禁止强制推送。 **约束限制：** 不涉及。 **取值范围：** - true，禁止强制推送。 - false，允许强制推送。 **默认取值：** 不涉及。
     * @return denyForcePush
     */
    public Boolean getDenyForcePush() {
        return denyForcePush;
    }

    public void setDenyForcePush(Boolean denyForcePush) {
        this.denyForcePush = denyForcePush;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRepositoryGeneralCommitRuleResponse that = (UpdateRepositoryGeneralCommitRuleResponse) obj;
        return Objects.equals(this.rejectUnsignedCommits, that.rejectUnsignedCommits)
            && Objects.equals(this.rejectNotSignedByGpg, that.rejectNotSignedByGpg)
            && Objects.equals(this.denyDeleteTag, that.denyDeleteTag)
            && Objects.equals(this.preventSecrets, that.preventSecrets)
            && Objects.equals(this.denyForcePush, that.denyForcePush);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rejectUnsignedCommits, rejectNotSignedByGpg, denyDeleteTag, preventSecrets, denyForcePush);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepositoryGeneralCommitRuleResponse {\n");
        sb.append("    rejectUnsignedCommits: ").append(toIndentedString(rejectUnsignedCommits)).append("\n");
        sb.append("    rejectNotSignedByGpg: ").append(toIndentedString(rejectNotSignedByGpg)).append("\n");
        sb.append("    denyDeleteTag: ").append(toIndentedString(denyDeleteTag)).append("\n");
        sb.append("    preventSecrets: ").append(toIndentedString(preventSecrets)).append("\n");
        sb.append("    denyForcePush: ").append(toIndentedString(denyForcePush)).append("\n");
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
