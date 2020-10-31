package com.huaweicloud.sdk.codecheck.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateTaskRequestV2
 */
public class CreateTaskRequestV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="check_type")
    
    private List<String> checkType = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="git_url")
    
    private String gitUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="git_branch")
    
    private String gitBranch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="language")
    
    private List<String> language = null;
    
    public CreateTaskRequestV2 withCheckType(List<String> checkType) {
        this.checkType = checkType;
        return this;
    }

    
    public CreateTaskRequestV2 addCheckTypeItem(String checkTypeItem) {
        if (this.checkType == null) {
            this.checkType = new ArrayList<>();
        }
        this.checkType.add(checkTypeItem);
        return this;
    }

    public CreateTaskRequestV2 withCheckType(Consumer<List<String>> checkTypeSetter) {
        if(this.checkType == null ){
            this.checkType = new ArrayList<>();
        }
        checkTypeSetter.accept(this.checkType);
        return this;
    }

    /**
     * 检查类型，数组格式，默认为source
     * @return checkType
     */
    public List<String> getCheckType() {
        return checkType;
    }

    public void setCheckType(List<String> checkType) {
        this.checkType = checkType;
    }

    public CreateTaskRequestV2 withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    


    /**
     * 仓库地址
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public CreateTaskRequestV2 withGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
        return this;
    }

    


    /**
     * 仓库分支
     * @return gitBranch
     */
    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    public CreateTaskRequestV2 withLanguage(List<String> language) {
        this.language = language;
        return this;
    }

    
    public CreateTaskRequestV2 addLanguageItem(String languageItem) {
        if (this.language == null) {
            this.language = new ArrayList<>();
        }
        this.language.add(languageItem);
        return this;
    }

    public CreateTaskRequestV2 withLanguage(Consumer<List<String>> languageSetter) {
        if(this.language == null ){
            this.language = new ArrayList<>();
        }
        languageSetter.accept(this.language);
        return this;
    }

    /**
     * 检查语言，数组格式，支持cpp,java,js,python,php,css,html,go,typescript,csharp
     * @return language
     */
    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTaskRequestV2 createTaskRequestV2 = (CreateTaskRequestV2) o;
        return Objects.equals(this.checkType, createTaskRequestV2.checkType) &&
            Objects.equals(this.gitUrl, createTaskRequestV2.gitUrl) &&
            Objects.equals(this.gitBranch, createTaskRequestV2.gitBranch) &&
            Objects.equals(this.language, createTaskRequestV2.language);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checkType, gitUrl, gitBranch, language);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTaskRequestV2 {\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

