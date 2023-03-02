package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.ScriptReferenceDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 脚本版本的详细信息。
 */
public class ScriptVersion  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_by")
    

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reference_number")
    

    private Integer referenceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="script_id")
    

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="script_language")
    

    private String scriptLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_desc")
    

    private Integer statusDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_by")
    

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_id")
    

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_number")
    

    private String versionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="script_reference")
    
    private List<ScriptReferenceDetail> scriptReference = null;
    
    public ScriptVersion withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 脚本内容，脚本内容不能为空
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public ScriptVersion withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    


    /**
     * 创建人，比如为：张三
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    

    public ScriptVersion withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public ScriptVersion withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ScriptVersion withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 脚本名称，支持数字，下划线，大小写字母 ,中文
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ScriptVersion withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户从IAM申请到的projectid，一般为32位字符串
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public ScriptVersion withReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }

    


    /**
     * 脚本引用次数，脚本被任务和模板引用的次数。默认是0次,引用次数未非负整数，不能出现负数
     * minimum: 0
     * maximum: 9999999
     * @return referenceNumber
     */
    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    

    public ScriptVersion withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    


    /**
     * 脚本id，根据UUID.randomUUID生成。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    

    public ScriptVersion withScriptLanguage(String scriptLanguage) {
        this.scriptLanguage = scriptLanguage;
        return this;
    }

    


    /**
     * 脚本语言，目前支持四种，分别是：SHELL BAT PYTHON POWER_SHELL
     * @return scriptLanguage
     */
    public String getScriptLanguage() {
        return scriptLanguage;
    }

    public void setScriptLanguage(String scriptLanguage) {
        this.scriptLanguage = scriptLanguage;
    }

    

    public ScriptVersion withStatusDesc(Integer statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    


    /**
     * 状态说明  0代表 未上线，1代表已上线  2代表已下线   3代表已禁用
     * minimum: 0
     * maximum: 4
     * @return statusDesc
     */
    public Integer getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(Integer statusDesc) {
        this.statusDesc = statusDesc;
    }

    

    public ScriptVersion withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    


    /**
     * 修改人
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    

    public ScriptVersion withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 实体的最后更新时间戳。 注意：执行创建/修改/删除操作时，update_time将更新。
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    

    public ScriptVersion withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    


    /**
     * 版本id，根据UUID.randomUUID生成。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    

    public ScriptVersion withVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    


    /**
     * 脚本版本号，支持数字，下划线，大小写字母和小数点
     * @return versionNumber
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    

    public ScriptVersion withScriptReference(List<ScriptReferenceDetail> scriptReference) {
        this.scriptReference = scriptReference;
        return this;
    }

    
    public ScriptVersion addScriptReferenceItem(ScriptReferenceDetail scriptReferenceItem) {
        if(this.scriptReference == null) {
            this.scriptReference = new ArrayList<>();
        }
        this.scriptReference.add(scriptReferenceItem);
        return this;
    }

    public ScriptVersion withScriptReference(Consumer<List<ScriptReferenceDetail>> scriptReferenceSetter) {
        if(this.scriptReference == null) {
            this.scriptReference = new ArrayList<>();
        }
        scriptReferenceSetter.accept(this.scriptReference);
        return this;
    }

    /**
     * 脚本引用详情
     * @return scriptReference
     */
    public List<ScriptReferenceDetail> getScriptReference() {
        return scriptReference;
    }

    public void setScriptReference(List<ScriptReferenceDetail> scriptReference) {
        this.scriptReference = scriptReference;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScriptVersion scriptVersion = (ScriptVersion) o;
        return Objects.equals(this.content, scriptVersion.content) &&
            Objects.equals(this.createBy, scriptVersion.createBy) &&
            Objects.equals(this.createTime, scriptVersion.createTime) &&
            Objects.equals(this.enterpriseProjectId, scriptVersion.enterpriseProjectId) &&
            Objects.equals(this.name, scriptVersion.name) &&
            Objects.equals(this.projectId, scriptVersion.projectId) &&
            Objects.equals(this.referenceNumber, scriptVersion.referenceNumber) &&
            Objects.equals(this.scriptId, scriptVersion.scriptId) &&
            Objects.equals(this.scriptLanguage, scriptVersion.scriptLanguage) &&
            Objects.equals(this.statusDesc, scriptVersion.statusDesc) &&
            Objects.equals(this.updateBy, scriptVersion.updateBy) &&
            Objects.equals(this.updateTime, scriptVersion.updateTime) &&
            Objects.equals(this.versionId, scriptVersion.versionId) &&
            Objects.equals(this.versionNumber, scriptVersion.versionNumber) &&
            Objects.equals(this.scriptReference, scriptVersion.scriptReference);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, createBy, createTime, enterpriseProjectId, name, projectId, referenceNumber, scriptId, scriptLanguage, statusDesc, updateBy, updateTime, versionId, versionNumber, scriptReference);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptVersion {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    scriptLanguage: ").append(toIndentedString(scriptLanguage)).append("\n");
        sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
        sb.append("    scriptReference: ").append(toIndentedString(scriptReference)).append("\n");
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

