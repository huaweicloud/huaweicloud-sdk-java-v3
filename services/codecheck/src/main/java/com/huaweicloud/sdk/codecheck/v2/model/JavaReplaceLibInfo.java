package com.huaweicloud.sdk.codecheck.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codecheck.v2.model.JavaLibBean;
import com.huaweicloud.sdk.codecheck.v2.model.Vulnerability;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Java lib的全部信息
 */
public class JavaReplaceLibInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="artifact_id")
    
    private String artifactId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="language")
    
    private String language;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suggest_lib")
    
    private List<JavaLibBean> suggestLib = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vulnerabilities")
    
    private List<Vulnerability> vulnerabilities = null;
    
    public JavaReplaceLibInfo withArtifactId(String artifactId) {
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

    

    public JavaReplaceLibInfo withGroupId(String groupId) {
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

    

    public JavaReplaceLibInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * java库的id, groupId:artifactId:version
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public JavaReplaceLibInfo withLanguage(String language) {
        this.language = language;
        return this;
    }

    


    /**
     * 编程语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    

    public JavaReplaceLibInfo withSuggestLib(List<JavaLibBean> suggestLib) {
        this.suggestLib = suggestLib;
        return this;
    }

    
    public JavaReplaceLibInfo addSuggestLibItem(JavaLibBean suggestLibItem) {
        if(this.suggestLib == null) {
            this.suggestLib = new ArrayList<>();
        }
        this.suggestLib.add(suggestLibItem);
        return this;
    }

    public JavaReplaceLibInfo withSuggestLib(Consumer<List<JavaLibBean>> suggestLibSetter) {
        if(this.suggestLib == null) {
            this.suggestLib = new ArrayList<>();
        }
        suggestLibSetter.accept(this.suggestLib);
        return this;
    }

    /**
     * 推荐可以使用的升级库
     * @return suggestLib
     */
    public List<JavaLibBean> getSuggestLib() {
        return suggestLib;
    }

    public void setSuggestLib(List<JavaLibBean> suggestLib) {
        this.suggestLib = suggestLib;
    }

    

    public JavaReplaceLibInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public JavaReplaceLibInfo withVulnerabilities(List<Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }

    
    public JavaReplaceLibInfo addVulnerabilitiesItem(Vulnerability vulnerabilitiesItem) {
        if(this.vulnerabilities == null) {
            this.vulnerabilities = new ArrayList<>();
        }
        this.vulnerabilities.add(vulnerabilitiesItem);
        return this;
    }

    public JavaReplaceLibInfo withVulnerabilities(Consumer<List<Vulnerability>> vulnerabilitiesSetter) {
        if(this.vulnerabilities == null) {
            this.vulnerabilities = new ArrayList<>();
        }
        vulnerabilitiesSetter.accept(this.vulnerabilities);
        return this;
    }

    /**
     * 这个库中包含的风险
     * @return vulnerabilities
     */
    public List<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JavaReplaceLibInfo javaReplaceLibInfo = (JavaReplaceLibInfo) o;
        return Objects.equals(this.artifactId, javaReplaceLibInfo.artifactId) &&
            Objects.equals(this.groupId, javaReplaceLibInfo.groupId) &&
            Objects.equals(this.id, javaReplaceLibInfo.id) &&
            Objects.equals(this.language, javaReplaceLibInfo.language) &&
            Objects.equals(this.suggestLib, javaReplaceLibInfo.suggestLib) &&
            Objects.equals(this.version, javaReplaceLibInfo.version) &&
            Objects.equals(this.vulnerabilities, javaReplaceLibInfo.vulnerabilities);
    }
    @Override
    public int hashCode() {
        return Objects.hash(artifactId, groupId, id, language, suggestLib, version, vulnerabilities);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JavaReplaceLibInfo {\n");
        sb.append("    artifactId: ").append(toIndentedString(artifactId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    suggestLib: ").append(toIndentedString(suggestLib)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
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

