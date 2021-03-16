package com.huaweicloud.sdk.codecheck.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 代码仓相关的信息非必填，主要是用于CodeFever临时仓库使用，不填时直接使用创建任务时已经提供的信息
 */
public class RunRequestV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="username")
    
    private String username;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_token")
    
    private String accessToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="git_url")
    
    private String gitUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="git_branch")
    
    private String gitBranch;

    public RunRequestV2 withUsername(String username) {
        this.username = username;
        return this;
    }

    


    /**
     * 该任务对应临时仓库有权限的用户名
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
     * 该任务对应临时仓库有权限的用户token
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
     * 该任务对应的临时仓库地址
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
     * 该任务对应的临时仓库分支
     * @return gitBranch
     */
    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunRequestV2 runRequestV2 = (RunRequestV2) o;
        return Objects.equals(this.username, runRequestV2.username) &&
            Objects.equals(this.accessToken, runRequestV2.accessToken) &&
            Objects.equals(this.gitUrl, runRequestV2.gitUrl) &&
            Objects.equals(this.gitBranch, runRequestV2.gitBranch);
    }
    @Override
    public int hashCode() {
        return Objects.hash(username, accessToken, gitUrl, gitBranch);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunRequestV2 {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
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

