package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PrivateHookVersionSummary
 */
public class PrivateHookVersionSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_name")

    private String hookName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    private String hookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_version")

    private String hookVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_version_description")

    private String hookVersionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public PrivateHookVersionSummary withHookName(String hookName) {
        this.hookName = hookName;
        return this;
    }

    /**
     * 私有hook的名字。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。  推荐用户使用三段命名空间：{自定义hook名称}-{hook应用场景}-hook。
     * @return hookName
     */
    public String getHookName() {
        return hookName;
    }

    public void setHookName(String hookName) {
        this.hookName = hookName;
    }

    public PrivateHookVersionSummary withHookId(String hookId) {
        this.hookId = hookId;
        return this;
    }

    /**
     * 私有hook（private-hook）的唯一Id。  此Id由资源编排服务在生成私有hook的时候生成，为UUID。  由于私有hook名称仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的私有hook，删除，再重新创建一个同名私有hook。  对于团队并行开发，用户可能希望确保，当前我操作的私有hook就是我认为的那个，而不是其他队友删除后创建的同名私有hook。因此，使用Id就可以做到强匹配。  资源编排服务保证每次创建的私有hook所对应的Id都不相同，更新不会影响Id。如果给予的hook_id和当前hook的Id不一致，则返回400。
     * @return hookId
     */
    public String getHookId() {
        return hookId;
    }

    public void setHookId(String hookId) {
        this.hookId = hookId;
    }

    public PrivateHookVersionSummary withHookVersion(String hookVersion) {
        this.hookVersion = hookVersion;
        return this;
    }

    /**
     * 私有hook的版本号。版本号必须遵循语义化版本号（Semantic Version），为用户自定义。
     * @return hookVersion
     */
    public String getHookVersion() {
        return hookVersion;
    }

    public void setHookVersion(String hookVersion) {
        this.hookVersion = hookVersion;
    }

    public PrivateHookVersionSummary withHookVersionDescription(String hookVersionDescription) {
        this.hookVersionDescription = hookVersionDescription;
        return this;
    }

    /**
     * 私有hook版本的描述。可用于客户识别创建私有hook的版本。注意：hook版本为不可更新（immutable），所以该字段不可更新，如果需要更新，请删除后重建。
     * @return hookVersionDescription
     */
    public String getHookVersionDescription() {
        return hookVersionDescription;
    }

    public void setHookVersionDescription(String hookVersionDescription) {
        this.hookVersionDescription = hookVersionDescription;
    }

    public PrivateHookVersionSummary withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 私有Hook Version（private-hook-version）的生成时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateHookVersionSummary that = (PrivateHookVersionSummary) obj;
        return Objects.equals(this.hookName, that.hookName) && Objects.equals(this.hookId, that.hookId)
            && Objects.equals(this.hookVersion, that.hookVersion)
            && Objects.equals(this.hookVersionDescription, that.hookVersionDescription)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hookName, hookId, hookVersion, hookVersionDescription, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateHookVersionSummary {\n");
        sb.append("    hookName: ").append(toIndentedString(hookName)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    hookVersion: ").append(toIndentedString(hookVersion)).append("\n");
        sb.append("    hookVersionDescription: ").append(toIndentedString(hookVersionDescription)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
