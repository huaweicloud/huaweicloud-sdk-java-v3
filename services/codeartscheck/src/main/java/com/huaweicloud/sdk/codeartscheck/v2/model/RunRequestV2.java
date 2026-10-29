package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 代码仓信息
 */
public class RunRequestV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_token")

    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_branch")

    private String gitBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    public RunRequestV2 withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释：** 废弃参数。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RunRequestV2 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * **参数解释：** 废弃参数。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public RunRequestV2 withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释：** 废弃参数。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public RunRequestV2 withGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
        return this;
    }

    /**
     * **参数解释：** 废弃参数。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return gitBranch
     */
    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    public RunRequestV2 withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * **参数解释：** 代码仓拉取MR代码的方式，推荐在检查阶段拉取MR代码失败时使用此参数进行拉取方式的指定。 **约束限制：** 不涉及。 **取值范围：** - pull：以pull/xx/xx方式进行拉取。 - merge_request：以merge_request/xx/xx方式进行拉取。 **默认取值：** 后台自动识别代码仓类型以进行MR代码的拉取。 gitee仓：以pull/xx/xx方式进行拉取。 非gitee仓：以merge_request/xx/xx方式进行拉取。
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunRequestV2 that = (RunRequestV2) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.accessToken, that.accessToken)
            && Objects.equals(this.gitUrl, that.gitUrl) && Objects.equals(this.gitBranch, that.gitBranch)
            && Objects.equals(this.ref, that.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, accessToken, gitUrl, gitBranch, ref);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunRequestV2 {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
