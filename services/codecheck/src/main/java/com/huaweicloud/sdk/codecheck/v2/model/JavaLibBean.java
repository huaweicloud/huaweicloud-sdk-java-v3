package com.huaweicloud.sdk.codecheck.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 描述一个jar包在maven中的定义
 */
public class JavaLibBean  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="artifact_id")
    
    private String artifactId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lib_id")
    
    private String libId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="md5")
    
    private String md5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scope")
    
    private String scope;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;

    public JavaLibBean withArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    


    /**
     * maven坐标
     * @return artifactId
     */
    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    

    public JavaLibBean withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * maven坐标
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public JavaLibBean withLibId(String libId) {
        this.libId = libId;
        return this;
    }

    


    /**
     * 拼接的libId groupId:artifactId:version
     * @return libId
     */
    public String getLibId() {
        return libId;
    }

    public void setLibId(String libId) {
        this.libId = libId;
    }

    

    public JavaLibBean withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    


    /**
     * jar包md5
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    

    public JavaLibBean withScope(String scope) {
        this.scope = scope;
        return this;
    }

    


    /**
     * maven定义的scope
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    

    public JavaLibBean withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * maven坐标
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JavaLibBean javaLibBean = (JavaLibBean) o;
        return Objects.equals(this.artifactId, javaLibBean.artifactId) &&
            Objects.equals(this.groupId, javaLibBean.groupId) &&
            Objects.equals(this.libId, javaLibBean.libId) &&
            Objects.equals(this.md5, javaLibBean.md5) &&
            Objects.equals(this.scope, javaLibBean.scope) &&
            Objects.equals(this.version, javaLibBean.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(artifactId, groupId, libId, md5, scope, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JavaLibBean {\n");
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    libId: ").append(toIndentedString(libId)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

