package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 多云集群的账号权限
 */
public class MultiCloudClusterAuthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_groups")

    private String apiGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private String resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_authed")

    private Boolean isAuthed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advice")

    private String advice;

    public MultiCloudClusterAuthInfo withApiGroups(String apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    /**
     * **参数解释**： API组 **取值范围**： 字符长度1-64位 
     * @return apiGroups
     */
    public String getApiGroups() {
        return apiGroups;
    }

    public void setApiGroups(String apiGroups) {
        this.apiGroups = apiGroups;
    }

    public MultiCloudClusterAuthInfo withResources(String resources) {
        this.resources = resources;
        return this;
    }

    /**
     * **参数解释**： 资源 **取值范围**： 字符长度1-16位 
     * @return resources
     */
    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public MultiCloudClusterAuthInfo withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * **参数解释**： 所属特性 **取值范围**： 字符长度1-16位 
     * @return function
     */
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public MultiCloudClusterAuthInfo withIsAuthed(Boolean isAuthed) {
        this.isAuthed = isAuthed;
        return this;
    }

    /**
     * 是否有权访问
     * @return isAuthed
     */
    public Boolean getIsAuthed() {
        return isAuthed;
    }

    public void setIsAuthed(Boolean isAuthed) {
        this.isAuthed = isAuthed;
    }

    public MultiCloudClusterAuthInfo withAdvice(String advice) {
        this.advice = advice;
        return this;
    }

    /**
     * **参数解释**： 修复建议 **取值范围**： 字符长度1-128位 
     * @return advice
     */
    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiCloudClusterAuthInfo that = (MultiCloudClusterAuthInfo) obj;
        return Objects.equals(this.apiGroups, that.apiGroups) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.function, that.function) && Objects.equals(this.isAuthed, that.isAuthed)
            && Objects.equals(this.advice, that.advice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiGroups, resources, function, isAuthed, advice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiCloudClusterAuthInfo {\n");
        sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    isAuthed: ").append(toIndentedString(isAuthed)).append("\n");
        sb.append("    advice: ").append(toIndentedString(advice)).append("\n");
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
