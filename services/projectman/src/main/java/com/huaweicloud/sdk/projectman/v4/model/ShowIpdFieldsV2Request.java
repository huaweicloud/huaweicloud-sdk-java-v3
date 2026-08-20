package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowIpdFieldsV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_layer_id")

    private String categoryLayerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    public ShowIpdFieldsV2Request withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目32位ID，项目唯一标识。通过查询IPD项目列表获取，响应消息体中的id字段的值就是项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowIpdFieldsV2Request withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 工作项类型ID，工作项类型的唯一标识。 不同项目模型下可选值不同： - IPD-系统设备类：10021（RR）、10065（SF）、10020（IR）、10022（SR）、10029（AR）、10027（Task）、10033（Bug） - IPD-独立软件类：10021（RR）、10065（SF）、10020（IR）、10023（US）、10027（Task）、10033（Bug） - IPD-自运营软件/云服务类：10001（Epic）、10028（FE）、10021（RR）、10023（US）、10027（Task）、10033（Bug）
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public ShowIpdFieldsV2Request withCategoryLayerId(String categoryLayerId) {
        this.categoryLayerId = categoryLayerId;
        return this;
    }

    /**
     * 层级字段ID。用于过滤层级类型的字段，当需要按层级结构筛选字段时传入。
     * @return categoryLayerId
     */
    public String getCategoryLayerId() {
        return categoryLayerId;
    }

    public void setCategoryLayerId(String categoryLayerId) {
        this.categoryLayerId = categoryLayerId;
    }

    public ShowIpdFieldsV2Request withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 目标项目32位ID，项目唯一标识。通过查询IPD项目列表获取，响应消息体中的id字段的值就是项目ID。当需要查询其他项目的字段配置时传入。
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIpdFieldsV2Request that = (ShowIpdFieldsV2Request) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.categoryId, that.categoryId)
            && Objects.equals(this.categoryLayerId, that.categoryLayerId)
            && Objects.equals(this.targetProjectId, that.targetProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, categoryId, categoryLayerId, targetProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpdFieldsV2Request {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryLayerId: ").append(toIndentedString(categoryLayerId)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
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
