package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListServiceDiscoveryRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appRules")

    private List<AppRules> appRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorCode")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorMessage")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    public ListServiceDiscoveryRulesResponse withAppRules(List<AppRules> appRules) {
        this.appRules = appRules;
        return this;
    }

    public ListServiceDiscoveryRulesResponse addAppRulesItem(AppRules appRulesItem) {
        if (this.appRules == null) {
            this.appRules = new ArrayList<>();
        }
        this.appRules.add(appRulesItem);
        return this;
    }

    public ListServiceDiscoveryRulesResponse withAppRules(Consumer<List<AppRules>> appRulesSetter) {
        if (this.appRules == null) {
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

    public ListServiceDiscoveryRulesResponse withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListServiceDiscoveryRulesResponse addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListServiceDiscoveryRulesResponse withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 服务发现规则id列表，多AZ配置同步时使用。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServiceDiscoveryRulesResponse that = (ListServiceDiscoveryRulesResponse) obj;
        return Objects.equals(this.appRules, that.appRules) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appRules, errorCode, errorMessage, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServiceDiscoveryRulesResponse {\n");
        sb.append("    appRules: ").append(toIndentedString(appRules)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
