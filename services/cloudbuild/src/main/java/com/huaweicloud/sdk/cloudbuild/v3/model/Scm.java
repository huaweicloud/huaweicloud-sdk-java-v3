package com.huaweicloud.sdk.cloudbuild.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 代码信息
 */
public class Scm  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="build_tag")
    
    private String buildTag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="build_commit_id")
    
    private String buildCommitId;

    public Scm withBuildTag(String buildTag) {
        this.buildTag = buildTag;
        return this;
    }

    


    /**
     * 代码Tag
     * @return buildTag
     */
    public String getBuildTag() {
        return buildTag;
    }

    public void setBuildTag(String buildTag) {
        this.buildTag = buildTag;
    }

    

    public Scm withBuildCommitId(String buildCommitId) {
        this.buildCommitId = buildCommitId;
        return this;
    }

    


    /**
     * 代码提交ID
     * @return buildCommitId
     */
    public String getBuildCommitId() {
        return buildCommitId;
    }

    public void setBuildCommitId(String buildCommitId) {
        this.buildCommitId = buildCommitId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Scm scm = (Scm) o;
        return Objects.equals(this.buildTag, scm.buildTag) &&
            Objects.equals(this.buildCommitId, scm.buildCommitId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(buildTag, buildCommitId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Scm {\n");
        sb.append("    buildTag: ").append(toIndentedString(buildTag)).append("\n");
        sb.append("    buildCommitId: ").append(toIndentedString(buildCommitId)).append("\n");
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

