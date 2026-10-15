package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回放库和镜像库里面SQL执行结果不一致详情。
 */
public class ReplayCompareResultResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template")

    private String sqlTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_md5")

    private String sqlTemplateMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_params")

    private String sqlParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_content")

    private String targetContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_content")

    private String mirrorContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public ReplayCompareResultResp withSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
        return this;
    }

    /**
     * SQL模板
     * @return sqlTemplate
     */
    public String getSqlTemplate() {
        return sqlTemplate;
    }

    public void setSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
    }

    public ReplayCompareResultResp withSqlTemplateMd5(String sqlTemplateMd5) {
        this.sqlTemplateMd5 = sqlTemplateMd5;
        return this;
    }

    /**
     * SQL模板MD5哈希值
     * @return sqlTemplateMd5
     */
    public String getSqlTemplateMd5() {
        return sqlTemplateMd5;
    }

    public void setSqlTemplateMd5(String sqlTemplateMd5) {
        this.sqlTemplateMd5 = sqlTemplateMd5;
    }

    public ReplayCompareResultResp withSqlParams(String sqlParams) {
        this.sqlParams = sqlParams;
        return this;
    }

    /**
     * SQL参数
     * @return sqlParams
     */
    public String getSqlParams() {
        return sqlParams;
    }

    public void setSqlParams(String sqlParams) {
        this.sqlParams = sqlParams;
    }

    public ReplayCompareResultResp withTargetContent(String targetContent) {
        this.targetContent = targetContent;
        return this;
    }

    /**
     * 目标库内容
     * @return targetContent
     */
    public String getTargetContent() {
        return targetContent;
    }

    public void setTargetContent(String targetContent) {
        this.targetContent = targetContent;
    }

    public ReplayCompareResultResp withMirrorContent(String mirrorContent) {
        this.mirrorContent = mirrorContent;
        return this;
    }

    /**
     * 镜像库内容
     * @return mirrorContent
     */
    public String getMirrorContent() {
        return mirrorContent;
    }

    public void setMirrorContent(String mirrorContent) {
        this.mirrorContent = mirrorContent;
    }

    public ReplayCompareResultResp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
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
        ReplayCompareResultResp that = (ReplayCompareResultResp) obj;
        return Objects.equals(this.sqlTemplate, that.sqlTemplate)
            && Objects.equals(this.sqlTemplateMd5, that.sqlTemplateMd5)
            && Objects.equals(this.sqlParams, that.sqlParams) && Objects.equals(this.targetContent, that.targetContent)
            && Objects.equals(this.mirrorContent, that.mirrorContent)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlTemplate, sqlTemplateMd5, sqlParams, targetContent, mirrorContent, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplayCompareResultResp {\n");
        sb.append("    sqlTemplate: ").append(toIndentedString(sqlTemplate)).append("\n");
        sb.append("    sqlTemplateMd5: ").append(toIndentedString(sqlTemplateMd5)).append("\n");
        sb.append("    sqlParams: ").append(toIndentedString(sqlParams)).append("\n");
        sb.append("    targetContent: ").append(toIndentedString(targetContent)).append("\n");
        sb.append("    mirrorContent: ").append(toIndentedString(mirrorContent)).append("\n");
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
