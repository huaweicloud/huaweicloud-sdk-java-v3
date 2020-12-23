package com.huaweicloud.sdk.rds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.ApplyConfigurationResponseApplyResults;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class EnableConfigurationResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_id")
    
    private String configurationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_name")
    
    private String configurationName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="success")
    
    private Boolean success;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apply_results")
    
    private List<ApplyConfigurationResponseApplyResults> applyResults = null;
    
    public EnableConfigurationResponse withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    


    /**
     * 参数组ID。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public EnableConfigurationResponse withConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }

    


    /**
     * 参数组名称。
     * @return configurationName
     */
    public String getConfigurationName() {
        return configurationName;
    }

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    public EnableConfigurationResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    


    /**
     * 参数模板是否都应用成功。  - “true”表示参数模板都应用成功。 - “false”表示存在应用失败的参数模板。
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public EnableConfigurationResponse withApplyResults(List<ApplyConfigurationResponseApplyResults> applyResults) {
        this.applyResults = applyResults;
        return this;
    }

    
    public EnableConfigurationResponse addApplyResultsItem(ApplyConfigurationResponseApplyResults applyResultsItem) {
        if (this.applyResults == null) {
            this.applyResults = new ArrayList<>();
        }
        this.applyResults.add(applyResultsItem);
        return this;
    }

    public EnableConfigurationResponse withApplyResults(Consumer<List<ApplyConfigurationResponseApplyResults>> applyResultsSetter) {
        if(this.applyResults == null ){
            this.applyResults = new ArrayList<>();
        }
        applyResultsSetter.accept(this.applyResults);
        return this;
    }

    /**
     * 对每个实例的应用结果。
     * @return applyResults
     */
    public List<ApplyConfigurationResponseApplyResults> getApplyResults() {
        return applyResults;
    }

    public void setApplyResults(List<ApplyConfigurationResponseApplyResults> applyResults) {
        this.applyResults = applyResults;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnableConfigurationResponse enableConfigurationResponse = (EnableConfigurationResponse) o;
        return Objects.equals(this.configurationId, enableConfigurationResponse.configurationId) &&
            Objects.equals(this.configurationName, enableConfigurationResponse.configurationName) &&
            Objects.equals(this.success, enableConfigurationResponse.success) &&
            Objects.equals(this.applyResults, enableConfigurationResponse.applyResults);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configurationId, configurationName, success, applyResults);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableConfigurationResponse {\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    applyResults: ").append(toIndentedString(applyResults)).append("\n");
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

