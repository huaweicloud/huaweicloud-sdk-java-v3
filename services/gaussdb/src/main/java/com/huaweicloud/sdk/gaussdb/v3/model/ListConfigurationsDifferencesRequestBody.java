package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListConfigurationsDifferencesRequestBody
 */
public class ListConfigurationsDifferencesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_configuration_id")

    private String sourceConfigurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_configuration_id")

    private String targetConfigurationId;

    public ListConfigurationsDifferencesRequestBody withSourceConfigurationId(String sourceConfigurationId) {
        this.sourceConfigurationId = sourceConfigurationId;
        return this;
    }

    /**
     * 需要进行比较的源参数模板ID。  通过调用[查询参数模板](https://support.huaweicloud.com/api-gaussdb/ListGaussMySqlConfigurations.html)接口获取。  请求响应成功后在响应消息体中包含的“id”的值即为source_configuration_id值。
     * @return sourceConfigurationId
     */
    public String getSourceConfigurationId() {
        return sourceConfigurationId;
    }

    public void setSourceConfigurationId(String sourceConfigurationId) {
        this.sourceConfigurationId = sourceConfigurationId;
    }

    public ListConfigurationsDifferencesRequestBody withTargetConfigurationId(String targetConfigurationId) {
        this.targetConfigurationId = targetConfigurationId;
        return this;
    }

    /**
     * 需要进行比较的目标参数模板ID。  通过调用[查询参数模板](https://support.huaweicloud.com/api-gaussdb/ListGaussMySqlConfigurations.html)接口获取。  请求响应成功后在响应消息体中包含的“id”的值即为target_configuration_id值。
     * @return targetConfigurationId
     */
    public String getTargetConfigurationId() {
        return targetConfigurationId;
    }

    public void setTargetConfigurationId(String targetConfigurationId) {
        this.targetConfigurationId = targetConfigurationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConfigurationsDifferencesRequestBody that = (ListConfigurationsDifferencesRequestBody) obj;
        return Objects.equals(this.sourceConfigurationId, that.sourceConfigurationId)
            && Objects.equals(this.targetConfigurationId, that.targetConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceConfigurationId, targetConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigurationsDifferencesRequestBody {\n");
        sb.append("    sourceConfigurationId: ").append(toIndentedString(sourceConfigurationId)).append("\n");
        sb.append("    targetConfigurationId: ").append(toIndentedString(targetConfigurationId)).append("\n");
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
