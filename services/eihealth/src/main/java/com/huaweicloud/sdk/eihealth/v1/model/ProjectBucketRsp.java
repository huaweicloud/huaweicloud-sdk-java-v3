package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 项目桶
 */
public class ProjectBucketRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_name")

    private String eihealthProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quote_root")

    private Boolean quoteRoot;

    public ProjectBucketRsp withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 项目编号
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public ProjectBucketRsp withEihealthProjectName(String eihealthProjectName) {
        this.eihealthProjectName = eihealthProjectName;
        return this;
    }

    /**
     * 项目名称
     * @return eihealthProjectName
     */
    public String getEihealthProjectName() {
        return eihealthProjectName;
    }

    public void setEihealthProjectName(String eihealthProjectName) {
        this.eihealthProjectName = eihealthProjectName;
    }

    public ProjectBucketRsp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 桶类型(real:项目桶,quote:引用桶)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProjectBucketRsp withQuoteRoot(Boolean quoteRoot) {
        this.quoteRoot = quoteRoot;
        return this;
    }

    /**
     * 是否引用桶根路径
     * @return quoteRoot
     */
    public Boolean getQuoteRoot() {
        return quoteRoot;
    }

    public void setQuoteRoot(Boolean quoteRoot) {
        this.quoteRoot = quoteRoot;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectBucketRsp projectBucketRsp = (ProjectBucketRsp) o;
        return Objects.equals(this.eihealthProjectId, projectBucketRsp.eihealthProjectId)
            && Objects.equals(this.eihealthProjectName, projectBucketRsp.eihealthProjectName)
            && Objects.equals(this.type, projectBucketRsp.type)
            && Objects.equals(this.quoteRoot, projectBucketRsp.quoteRoot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, eihealthProjectName, type, quoteRoot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectBucketRsp {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    eihealthProjectName: ").append(toIndentedString(eihealthProjectName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    quoteRoot: ").append(toIndentedString(quoteRoot)).append("\n");
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
