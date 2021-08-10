package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Environment */
public class Environment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_name")

    private String environmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_description")

    private String environmentDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    public Environment withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /** 环境分组id
     * 
     * @return environmentId */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public Environment withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /** 环境分组名
     * 
     * @return environmentName */
    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public Environment withEnvironmentDescription(String environmentDescription) {
        this.environmentDescription = environmentDescription;
        return this;
    }

    /** 环境分组描述
     * 
     * @return environmentDescription */
    public String getEnvironmentDescription() {
        return environmentDescription;
    }

    public void setEnvironmentDescription(String environmentDescription) {
        this.environmentDescription = environmentDescription;
    }

    public Environment withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /** 是否是默认环境
     * 
     * @return isDefault */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Environment environment = (Environment) o;
        return Objects.equals(this.environmentId, environment.environmentId)
            && Objects.equals(this.environmentName, environment.environmentName)
            && Objects.equals(this.environmentDescription, environment.environmentDescription)
            && Objects.equals(this.isDefault, environment.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environmentId, environmentName, environmentDescription, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Environment {\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
        sb.append("    environmentDescription: ").append(toIndentedString(environmentDescription)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
