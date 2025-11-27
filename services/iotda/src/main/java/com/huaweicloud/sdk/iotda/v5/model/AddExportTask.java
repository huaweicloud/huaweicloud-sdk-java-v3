package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建导出任务结构体。
 */
public class AddExportTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_condition")

    private Object resourceCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_format")

    private String exportFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public AddExportTask withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 导出源资源类型，支持批量任务导出类型BatchTask。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public AddExportTask withResourceCondition(Object resourceCondition) {
        this.resourceCondition = resourceCondition;
        return this;
    }

    /**
     * 资源过滤条件，Json 格式，里面是(K,V)键值对，当resource_type为BatchTask时填写填写key为task_id，value为BatchTask的task_id(task_id从批量任务接口获得)。
     * @return resourceCondition
     */
    public Object getResourceCondition() {
        return resourceCondition;
    }

    public void setResourceCondition(Object resourceCondition) {
        this.resourceCondition = resourceCondition;
    }

    public AddExportTask withExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
        return this;
    }

    /**
     * 导出格式，目前仅支持xls格式,默认格式为xls.(注意下载的文件已使用zip打包，后缀为'.zip'，此处格式指的导出内容承载格式)
     * @return exportFormat
     */
    public String getExportFormat() {
        return exportFormat;
    }

    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }

    public AddExportTask withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 租户规则的生效范围，默认GLOBAL，取值如下： - GLOBAL：生效范围为租户级 - APP：生效范围为应用级，如果类型为APP，需要携带app_id，如果不带，生效范围为defaultApp。 
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public AddExportTask withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID。此参数为非必选参数，用于兼容平台老用户存在多应用的场景。存在多应用的用户需要使用该接口时，必须携带该参数指定创建的规则归属到哪个应用下，否则接口会提示错误。如果用户存在多应用，同时又不想携带该参数，可以联系华为技术支持对用户数据做应用合并。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddExportTask that = (AddExportTask) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceCondition, that.resourceCondition)
            && Objects.equals(this.exportFormat, that.exportFormat) && Objects.equals(this.appType, that.appType)
            && Objects.equals(this.appId, that.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceCondition, exportFormat, appType, appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddExportTask {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceCondition: ").append(toIndentedString(resourceCondition)).append("\n");
        sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
