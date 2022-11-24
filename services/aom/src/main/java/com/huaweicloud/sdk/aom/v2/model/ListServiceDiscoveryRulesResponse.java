package com.huaweicloud.sdk.aom.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.AppRules;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListServiceDiscoveryRulesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="appRules")
    
    
    private List<AppRules> appRules = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorCode")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorMessage")
    
    
    private String errorMessage;

    public ListServiceDiscoveryRulesResponse withAppRules(List<AppRules> appRules) {
        this.appRules = appRules;
        return this;
    }

    
    public ListServiceDiscoveryRulesResponse addAppRulesItem(AppRules appRulesItem) {
        if(this.appRules == null) {
            this.appRules = new ArrayList<>();
        }
        this.appRules.add(appRulesItem);
        return this;
    }

    public ListServiceDiscoveryRulesResponse withAppRules(Consumer<List<AppRules>> appRulesSetter) {
        if(this.appRules == null) {
            this.appRules = new ArrayList<>();
        }
        appRulesSetter.accept(this.appRules);
        return this;
    }

    /**
     * 查询结果规则信息。
     * @return appRules
     */
    public List<AppRules> getAppRules() {
        return appRules;
    }

    public void setAppRules(List<AppRules> appRules) {
        this.appRules = appRules;
    }

    

    public ListServiceDiscoveryRulesResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 响应码,AOM_INVENTORY_2000000代表正常返回。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public ListServiceDiscoveryRulesResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 响应信息描述。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServiceDiscoveryRulesResponse listServiceDiscoveryRulesResponse = (ListServiceDiscoveryRulesResponse) o;
        return Objects.equals(this.appRules, listServiceDiscoveryRulesResponse.appRules) &&
            Objects.equals(this.errorCode, listServiceDiscoveryRulesResponse.errorCode) &&
            Objects.equals(this.errorMessage, listServiceDiscoveryRulesResponse.errorMessage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appRules, errorCode, errorMessage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceDiscoveryRulesResponse {\n");
        sb.append("    appRules: ").append(toIndentedString(appRules)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

