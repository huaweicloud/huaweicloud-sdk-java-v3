package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TemplateRO
 */
public class TemplateRO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private Long directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_id")

    private Integer dimensionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_info")

    private String sqlInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_description")

    private String resultDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish")

    private Boolean publish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_name")

    private String originName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_table_template")

    private String abnormalTableTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_define_version_name")

    private String userDefineVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_num")

    private Long versionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public TemplateRO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * template id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TemplateRO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * template name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateRO withDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * 目录
     * @return directoryId
     */
    public Long getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
    }

    public TemplateRO withDimensionId(Integer dimensionId) {
        this.dimensionId = dimensionId;
        return this;
    }

    /**
     * 维度ID, 1:完整性,2:唯一性,3:及时性,4:有效性,5:准确性,6:一致性
     * @return dimensionId
     */
    public Integer getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(Integer dimensionId) {
        this.dimensionId = dimensionId;
    }

    public TemplateRO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateRO withSqlInfo(String sqlInfo) {
        this.sqlInfo = sqlInfo;
        return this;
    }

    /**
     * 模板中的sql内容
     * @return sqlInfo
     */
    public String getSqlInfo() {
        return sqlInfo;
    }

    public void setSqlInfo(String sqlInfo) {
        this.sqlInfo = sqlInfo;
    }

    public TemplateRO withResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
        return this;
    }

    /**
     * 结果说明
     * @return resultDescription
     */
    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public TemplateRO withPublish(Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     * 是否是发布操作， true：发布新版本  false：普通的保存操作
     * @return publish
     */
    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    public TemplateRO withOriginName(String originName) {
        this.originName = originName;
        return this;
    }

    /**
     * 修改前的模板名
     * @return originName
     */
    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public TemplateRO withAbnormalTableTemplate(String abnormalTableTemplate) {
        this.abnormalTableTemplate = abnormalTableTemplate;
        return this;
    }

    /**
     * 异常表模板
     * @return abnormalTableTemplate
     */
    public String getAbnormalTableTemplate() {
        return abnormalTableTemplate;
    }

    public void setAbnormalTableTemplate(String abnormalTableTemplate) {
        this.abnormalTableTemplate = abnormalTableTemplate;
    }

    public TemplateRO withUserDefineVersionName(String userDefineVersionName) {
        this.userDefineVersionName = userDefineVersionName;
        return this;
    }

    /**
     * 用户自定义版本名
     * @return userDefineVersionName
     */
    public String getUserDefineVersionName() {
        return userDefineVersionName;
    }

    public void setUserDefineVersionName(String userDefineVersionName) {
        this.userDefineVersionName = userDefineVersionName;
    }

    public TemplateRO withVersionNum(Long versionNum) {
        this.versionNum = versionNum;
        return this;
    }

    /**
     * 获取模板信息时候的版本号
     * @return versionNum
     */
    public Long getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Long versionNum) {
        this.versionNum = versionNum;
    }

    public TemplateRO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则模板状态,0表示下线1表示已发布
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateRO templateRO = (TemplateRO) o;
        return Objects.equals(this.id, templateRO.id) && Objects.equals(this.name, templateRO.name)
            && Objects.equals(this.directoryId, templateRO.directoryId)
            && Objects.equals(this.dimensionId, templateRO.dimensionId)
            && Objects.equals(this.description, templateRO.description)
            && Objects.equals(this.sqlInfo, templateRO.sqlInfo)
            && Objects.equals(this.resultDescription, templateRO.resultDescription)
            && Objects.equals(this.publish, templateRO.publish)
            && Objects.equals(this.originName, templateRO.originName)
            && Objects.equals(this.abnormalTableTemplate, templateRO.abnormalTableTemplate)
            && Objects.equals(this.userDefineVersionName, templateRO.userDefineVersionName)
            && Objects.equals(this.versionNum, templateRO.versionNum) && Objects.equals(this.status, templateRO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            directoryId,
            dimensionId,
            description,
            sqlInfo,
            resultDescription,
            publish,
            originName,
            abnormalTableTemplate,
            userDefineVersionName,
            versionNum,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateRO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sqlInfo: ").append(toIndentedString(sqlInfo)).append("\n");
        sb.append("    resultDescription: ").append(toIndentedString(resultDescription)).append("\n");
        sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
        sb.append("    originName: ").append(toIndentedString(originName)).append("\n");
        sb.append("    abnormalTableTemplate: ").append(toIndentedString(abnormalTableTemplate)).append("\n");
        sb.append("    userDefineVersionName: ").append(toIndentedString(userDefineVersionName)).append("\n");
        sb.append("    versionNum: ").append(toIndentedString(versionNum)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
