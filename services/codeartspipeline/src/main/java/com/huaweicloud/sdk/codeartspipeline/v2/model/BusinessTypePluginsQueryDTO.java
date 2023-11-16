package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BusinessTypePluginsQueryDTO
 */
public class BusinessTypePluginsQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_condition")

    private String useCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_repo_type")

    private String inputRepoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_source_type")

    private String inputSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_name")

    private String regexName;

    public BusinessTypePluginsQueryDTO withUseCondition(String useCondition) {
        this.useCondition = useCondition;
        return this;
    }

    /**
     * 用于区分插件为流水线可使用/模板可使用
     * @return useCondition
     */
    public String getUseCondition() {
        return useCondition;
    }

    public void setUseCondition(String useCondition) {
        this.useCondition = useCondition;
    }

    public BusinessTypePluginsQueryDTO withInputRepoType(String inputRepoType) {
        this.inputRepoType = inputRepoType;
        return this;
    }

    /**
     * 用于区分源的代码仓类型codehub/gitlab/github等
     * @return inputRepoType
     */
    public String getInputRepoType() {
        return inputRepoType;
    }

    public void setInputRepoType(String inputRepoType) {
        this.inputRepoType = inputRepoType;
    }

    public BusinessTypePluginsQueryDTO withInputSourceType(String inputSourceType) {
        this.inputSourceType = inputSourceType;
        return this;
    }

    /**
     * 用于区分单源/多源的情况
     * @return inputSourceType
     */
    public String getInputSourceType() {
        return inputSourceType;
    }

    public void setInputSourceType(String inputSourceType) {
        this.inputSourceType = inputSourceType;
    }

    public BusinessTypePluginsQueryDTO withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * 业务类型
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public BusinessTypePluginsQueryDTO withRegexName(String regexName) {
        this.regexName = regexName;
        return this;
    }

    /**
     * 名称
     * @return regexName
     */
    public String getRegexName() {
        return regexName;
    }

    public void setRegexName(String regexName) {
        this.regexName = regexName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessTypePluginsQueryDTO that = (BusinessTypePluginsQueryDTO) obj;
        return Objects.equals(this.useCondition, that.useCondition)
            && Objects.equals(this.inputRepoType, that.inputRepoType)
            && Objects.equals(this.inputSourceType, that.inputSourceType)
            && Objects.equals(this.businessType, that.businessType) && Objects.equals(this.regexName, that.regexName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useCondition, inputRepoType, inputSourceType, businessType, regexName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessTypePluginsQueryDTO {\n");
        sb.append("    useCondition: ").append(toIndentedString(useCondition)).append("\n");
        sb.append("    inputRepoType: ").append(toIndentedString(inputRepoType)).append("\n");
        sb.append("    inputSourceType: ").append(toIndentedString(inputSourceType)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    regexName: ").append(toIndentedString(regexName)).append("\n");
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
