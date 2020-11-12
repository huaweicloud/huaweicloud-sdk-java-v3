package com.huaweicloud.sdk.devstar.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.devstar.v1.model.RepositoryInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateJobInfo
 */
public class TemplateJobInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_name")
    
    private String applicationName;
    /**
     * 0 - 将生成的应用代码存储于 repo_info 指定的 CodeHub 仓库中。1 - 将生成的应用代码存储到华为云，任务创建人可以通过 ExportApplicationCode 下载代码压缩包
     */
    public static final class RepoTypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final RepoTypeEnum NUMBER_0 = new RepoTypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final RepoTypeEnum NUMBER_1 = new RepoTypeEnum(1);
        

        private static final Map<Integer, RepoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, RepoTypeEnum> createStaticFields() {
            Map<Integer, RepoTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        RepoTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RepoTypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            RepoTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RepoTypeEnum(value);
            }
            return result;
        }

        public static RepoTypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            RepoTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RepoTypeEnum) {
                return this.value.equals(((RepoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_type")
    
    private RepoTypeEnum repoType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    private String templateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private Map<String, String> properties = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_info")
    
    private RepositoryInfo repoInfo = null;

    public TemplateJobInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    


    /**
     * 应用名称
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public TemplateJobInfo withRepoType(RepoTypeEnum repoType) {
        this.repoType = repoType;
        return this;
    }

    


    /**
     * 0 - 将生成的应用代码存储于 repo_info 指定的 CodeHub 仓库中。1 - 将生成的应用代码存储到华为云，任务创建人可以通过 ExportApplicationCode 下载代码压缩包
     * @return repoType
     */
    public RepoTypeEnum getRepoType() {
        return repoType;
    }

    public void setRepoType(RepoTypeEnum repoType) {
        this.repoType = repoType;
    }

    public TemplateJobInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * Devstar 模板 ID，通过 [模板列表查询接口](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=DevStar&api=ListPublishedTemplates) 获取相应模板 ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TemplateJobInfo withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    

    public TemplateJobInfo putPropertiesItem(String key, String propertiesItem) {
         if (this.properties == null) {
            this.properties = new HashMap<>();
         }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public TemplateJobInfo withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if(this.properties == null ){
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }
    /**
     * 模板的动态参数, 可以从 [模板详情查询接口](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=DevStar&api=ShowTemplateDetail) 获取
     * @return properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public TemplateJobInfo withRepoInfo(RepositoryInfo repoInfo) {
        this.repoInfo = repoInfo;
        return this;
    }

    public TemplateJobInfo withRepoInfo(Consumer<RepositoryInfo> repoInfoSetter) {
        if(this.repoInfo == null ){
            this.repoInfo = new RepositoryInfo();
            repoInfoSetter.accept(this.repoInfo);
        }
        
        return this;
    }


    /**
     * Get repoInfo
     * @return repoInfo
     */
    public RepositoryInfo getRepoInfo() {
        return repoInfo;
    }

    public void setRepoInfo(RepositoryInfo repoInfo) {
        this.repoInfo = repoInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateJobInfo templateJobInfo = (TemplateJobInfo) o;
        return Objects.equals(this.applicationName, templateJobInfo.applicationName) &&
            Objects.equals(this.repoType, templateJobInfo.repoType) &&
            Objects.equals(this.templateId, templateJobInfo.templateId) &&
            Objects.equals(this.properties, templateJobInfo.properties) &&
            Objects.equals(this.repoInfo, templateJobInfo.repoInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationName, repoType, templateId, properties, repoInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateJobInfo {\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    repoInfo: ").append(toIndentedString(repoInfo)).append("\n");
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

