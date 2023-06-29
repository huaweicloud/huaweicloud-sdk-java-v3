package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThirdTemplateRequestBody
 */
public class ThirdTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<Input> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamic_source_definition")

    private Map<String, Object> dynamicSourceDefinition = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_policy")

    private List<Policy> needPolicy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_provider")

    private Map<String, String> funcProvider = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_name")

    private Map<String, String> funcName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_description")

    private Map<String, String> funcDescription = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_link")

    private Map<String, String> funcLink = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_urn")

    private String appUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_value")

    private Double billValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    /**
     * 算子状态。初始创建时为init_created。申请提交时传入submit_approve。 算子状态。申请提交时传入submit_approve。
     */
    public static final class RegisterStatusEnum {

        /**
         * Enum SUBMIT_APPROVE for value: "submit_approve"
         */
        public static final RegisterStatusEnum SUBMIT_APPROVE = new RegisterStatusEnum("submit_approve");

        /**
         * Enum INIT_CREATED for value: "init_created"
         */
        public static final RegisterStatusEnum INIT_CREATED = new RegisterStatusEnum("init_created");

        private static final Map<String, RegisterStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RegisterStatusEnum> createStaticFields() {
            Map<String, RegisterStatusEnum> map = new HashMap<>();
            map.put("submit_approve", SUBMIT_APPROVE);
            map.put("init_created", INIT_CREATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RegisterStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RegisterStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RegisterStatusEnum(value));
        }

        public static RegisterStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RegisterStatusEnum) {
                return this.value.equals(((RegisterStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_status")

    private RegisterStatusEnum registerStatus;

    public ThirdTemplateRequestBody withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 必须以字母或数字开头，只能由字母、数字、下划线和中划线组成，长度小于等于64个字符。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ThirdTemplateRequestBody withInputs(List<Input> inputs) {
        this.inputs = inputs;
        return this;
    }

    public ThirdTemplateRequestBody addInputsItem(Input inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public ThirdTemplateRequestBody withInputs(Consumer<List<Input>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * Inputs参数
     * @return inputs
     */
    public List<Input> getInputs() {
        return inputs;
    }

    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    public ThirdTemplateRequestBody withDynamicSourceDefinition(Map<String, Object> dynamicSourceDefinition) {
        this.dynamicSourceDefinition = dynamicSourceDefinition;
        return this;
    }

    public ThirdTemplateRequestBody putDynamicSourceDefinitionItem(String key, Object dynamicSourceDefinitionItem) {
        if (this.dynamicSourceDefinition == null) {
            this.dynamicSourceDefinition = new HashMap<>();
        }
        this.dynamicSourceDefinition.put(key, dynamicSourceDefinitionItem);
        return this;
    }

    public ThirdTemplateRequestBody withDynamicSourceDefinition(
        Consumer<Map<String, Object>> dynamicSourceDefinitionSetter) {
        if (this.dynamicSourceDefinition == null) {
            this.dynamicSourceDefinition = new HashMap<>();
        }
        dynamicSourceDefinitionSetter.accept(this.dynamicSourceDefinition);
        return this;
    }

    /**
     * 根据DWR自定义的函数模板创建属于用户的function，并指定该参数设置的参数值。
     * @return dynamicSourceDefinition
     */
    public Map<String, Object> getDynamicSourceDefinition() {
        return dynamicSourceDefinition;
    }

    public void setDynamicSourceDefinition(Map<String, Object> dynamicSourceDefinition) {
        this.dynamicSourceDefinition = dynamicSourceDefinition;
    }

    public ThirdTemplateRequestBody withNeedPolicy(List<Policy> needPolicy) {
        this.needPolicy = needPolicy;
        return this;
    }

    public ThirdTemplateRequestBody addNeedPolicyItem(Policy needPolicyItem) {
        if (this.needPolicy == null) {
            this.needPolicy = new ArrayList<>();
        }
        this.needPolicy.add(needPolicyItem);
        return this;
    }

    public ThirdTemplateRequestBody withNeedPolicy(Consumer<List<Policy>> needPolicySetter) {
        if (this.needPolicy == null) {
            this.needPolicy = new ArrayList<>();
        }
        needPolicySetter.accept(this.needPolicy);
        return this;
    }

    /**
     * 算子执行时需要的权限信息。
     * @return needPolicy
     */
    public List<Policy> getNeedPolicy() {
        return needPolicy;
    }

    public void setNeedPolicy(List<Policy> needPolicy) {
        this.needPolicy = needPolicy;
    }

    public ThirdTemplateRequestBody withFuncProvider(Map<String, String> funcProvider) {
        this.funcProvider = funcProvider;
        return this;
    }

    public ThirdTemplateRequestBody putFuncProviderItem(String key, String funcProviderItem) {
        if (this.funcProvider == null) {
            this.funcProvider = new HashMap<>();
        }
        this.funcProvider.put(key, funcProviderItem);
        return this;
    }

    public ThirdTemplateRequestBody withFuncProvider(Consumer<Map<String, String>> funcProviderSetter) {
        if (this.funcProvider == null) {
            this.funcProvider = new HashMap<>();
        }
        funcProviderSetter.accept(this.funcProvider);
        return this;
    }

    /**
     * 算子提供方。 英文：必须以字母或数字开头，只能由字母、数字、下划线和中划线组成，长度小于等于32个字符。 中文：只能由中文、字母、数字、下划线和中划线组成，长度小于等于32个字符。
     * @return funcProvider
     */
    public Map<String, String> getFuncProvider() {
        return funcProvider;
    }

    public void setFuncProvider(Map<String, String> funcProvider) {
        this.funcProvider = funcProvider;
    }

    public ThirdTemplateRequestBody withFuncName(Map<String, String> funcName) {
        this.funcName = funcName;
        return this;
    }

    public ThirdTemplateRequestBody putFuncNameItem(String key, String funcNameItem) {
        if (this.funcName == null) {
            this.funcName = new HashMap<>();
        }
        this.funcName.put(key, funcNameItem);
        return this;
    }

    public ThirdTemplateRequestBody withFuncName(Consumer<Map<String, String>> funcNameSetter) {
        if (this.funcName == null) {
            this.funcName = new HashMap<>();
        }
        funcNameSetter.accept(this.funcName);
        return this;
    }

    /**
     * 算子名称。 英文：必须以字母或数字开头，只能由字母、数字、下划线和中划线组成，长度小于等于50个字符。 中文：只能由中文、字母、数字、下划线和中划线组成，长度小于等于50个字符。
     * @return funcName
     */
    public Map<String, String> getFuncName() {
        return funcName;
    }

    public void setFuncName(Map<String, String> funcName) {
        this.funcName = funcName;
    }

    public ThirdTemplateRequestBody withFuncDescription(Map<String, String> funcDescription) {
        this.funcDescription = funcDescription;
        return this;
    }

    public ThirdTemplateRequestBody putFuncDescriptionItem(String key, String funcDescriptionItem) {
        if (this.funcDescription == null) {
            this.funcDescription = new HashMap<>();
        }
        this.funcDescription.put(key, funcDescriptionItem);
        return this;
    }

    public ThirdTemplateRequestBody withFuncDescription(Consumer<Map<String, String>> funcDescriptionSetter) {
        if (this.funcDescription == null) {
            this.funcDescription = new HashMap<>();
        }
        funcDescriptionSetter.accept(this.funcDescription);
        return this;
    }

    /**
     * 算子描述。 英文：长度最小为0，最长为256，可以是数字、大小写字母以及英文的逗号，句号，冒号，中划线,，下划线，空格。 中文：长度最小为0，最长为256，可以是中文、数字、大小写字母以及中英文的逗号，句号，冒号，中划线，下划线，空格。
     * @return funcDescription
     */
    public Map<String, String> getFuncDescription() {
        return funcDescription;
    }

    public void setFuncDescription(Map<String, String> funcDescription) {
        this.funcDescription = funcDescription;
    }

    public ThirdTemplateRequestBody withFuncLink(Map<String, String> funcLink) {
        this.funcLink = funcLink;
        return this;
    }

    public ThirdTemplateRequestBody putFuncLinkItem(String key, String funcLinkItem) {
        if (this.funcLink == null) {
            this.funcLink = new HashMap<>();
        }
        this.funcLink.put(key, funcLinkItem);
        return this;
    }

    public ThirdTemplateRequestBody withFuncLink(Consumer<Map<String, String>> funcLinkSetter) {
        if (this.funcLink == null) {
            this.funcLink = new HashMap<>();
        }
        funcLinkSetter.accept(this.funcLink);
        return this;
    }

    /**
     * 云市场链接。 需要包含中文， 长度最小为0，最长为512，须遵守http协议中定义的规则。
     * @return funcLink
     */
    public Map<String, String> getFuncLink() {
        return funcLink;
    }

    public void setFuncLink(Map<String, String> funcLink) {
        this.funcLink = funcLink;
    }

    public ThirdTemplateRequestBody withAppUrn(String appUrn) {
        this.appUrn = appUrn;
        return this;
    }

    /**
     * serverless算子应用程序urn
     * @return appUrn
     */
    public String getAppUrn() {
        return appUrn;
    }

    public void setAppUrn(String appUrn) {
        this.appUrn = appUrn;
    }

    public ThirdTemplateRequestBody withBillValue(Double billValue) {
        this.billValue = billValue;
        return this;
    }

    /**
     * Serverless计费单价
     * minimum: 0
     * maximum: 1E+4
     * @return billValue
     */
    public Double getBillValue() {
        return billValue;
    }

    public void setBillValue(Double billValue) {
        this.billValue = billValue;
    }

    public ThirdTemplateRequestBody withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * serverless所需要委托名
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public ThirdTemplateRequestBody withRegisterStatus(RegisterStatusEnum registerStatus) {
        this.registerStatus = registerStatus;
        return this;
    }

    /**
     * 算子状态。初始创建时为init_created。申请提交时传入submit_approve。 算子状态。申请提交时传入submit_approve。
     * @return registerStatus
     */
    public RegisterStatusEnum getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(RegisterStatusEnum registerStatus) {
        this.registerStatus = registerStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThirdTemplateRequestBody that = (ThirdTemplateRequestBody) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.dynamicSourceDefinition, that.dynamicSourceDefinition)
            && Objects.equals(this.needPolicy, that.needPolicy) && Objects.equals(this.funcProvider, that.funcProvider)
            && Objects.equals(this.funcName, that.funcName)
            && Objects.equals(this.funcDescription, that.funcDescription)
            && Objects.equals(this.funcLink, that.funcLink) && Objects.equals(this.appUrn, that.appUrn)
            && Objects.equals(this.billValue, that.billValue) && Objects.equals(this.agency, that.agency)
            && Objects.equals(this.registerStatus, that.registerStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            inputs,
            dynamicSourceDefinition,
            needPolicy,
            funcProvider,
            funcName,
            funcDescription,
            funcLink,
            appUrn,
            billValue,
            agency,
            registerStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThirdTemplateRequestBody {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    dynamicSourceDefinition: ").append(toIndentedString(dynamicSourceDefinition)).append("\n");
        sb.append("    needPolicy: ").append(toIndentedString(needPolicy)).append("\n");
        sb.append("    funcProvider: ").append(toIndentedString(funcProvider)).append("\n");
        sb.append("    funcName: ").append(toIndentedString(funcName)).append("\n");
        sb.append("    funcDescription: ").append(toIndentedString(funcDescription)).append("\n");
        sb.append("    funcLink: ").append(toIndentedString(funcLink)).append("\n");
        sb.append("    appUrn: ").append(toIndentedString(appUrn)).append("\n");
        sb.append("    billValue: ").append(toIndentedString(billValue)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    registerStatus: ").append(toIndentedString(registerStatus)).append("\n");
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
