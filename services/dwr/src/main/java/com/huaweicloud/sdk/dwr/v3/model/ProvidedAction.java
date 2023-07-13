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
 * ProvidedAction
 */
public class ProvidedAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    /**
     * 分类。默认分类为FileProcess,MediaProcess,ImageProcess,ContentReview,NotificationProcess,VoiceInteraction
     */
    public static final class CategoryEnum {

        /**
         * Enum FILEPROCESS for value: "FileProcess"
         */
        public static final CategoryEnum FILEPROCESS = new CategoryEnum("FileProcess");

        /**
         * Enum MEDIAPROCESS for value: "MediaProcess"
         */
        public static final CategoryEnum MEDIAPROCESS = new CategoryEnum("MediaProcess");

        /**
         * Enum IMAGEPROCESS for value: "ImageProcess"
         */
        public static final CategoryEnum IMAGEPROCESS = new CategoryEnum("ImageProcess");

        /**
         * Enum CONTENTREVIEW for value: "ContentReview"
         */
        public static final CategoryEnum CONTENTREVIEW = new CategoryEnum("ContentReview");

        /**
         * Enum NOTIFICATIONPROCESS for value: "NotificationProcess"
         */
        public static final CategoryEnum NOTIFICATIONPROCESS = new CategoryEnum("NotificationProcess");

        /**
         * Enum VOICEINTERACTION for value: "VoiceInteraction"
         */
        public static final CategoryEnum VOICEINTERACTION = new CategoryEnum("VoiceInteraction");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("FileProcess", FILEPROCESS);
            map.put("MediaProcess", MEDIAPROCESS);
            map.put("ImageProcess", IMAGEPROCESS);
            map.put("ContentReview", CONTENTREVIEW);
            map.put("NotificationProcess", NOTIFICATIONPROCESS);
            map.put("VoiceInteraction", VOICEINTERACTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modify_time")

    private String lastModifyTime;

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
    @JsonProperty(value = "provider_name")

    private String providerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_uploaded_func_pkg")

    private Boolean isUploadedFuncPkg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_pkg_endpoint")

    private String funcPkgEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_func_pkg_size")

    private Integer uploadFuncPkgSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_func_pkg_etag")

    private String uploadFuncPkgEtag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_status")

    private PublicTemplateRegisterType registerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_template")

    private String functionTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_domainid")

    private String providerDomainid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_userid")

    private String providerUserid;

    public ProvidedAction withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 算子模板名称。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ProvidedAction withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 分类。默认分类为FileProcess,MediaProcess,ImageProcess,ContentReview,NotificationProcess,VoiceInteraction
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public ProvidedAction withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ProvidedAction withLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }

    /**
     * 最近修改时间。
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ProvidedAction withInputs(List<Input> inputs) {
        this.inputs = inputs;
        return this;
    }

    public ProvidedAction addInputsItem(Input inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public ProvidedAction withInputs(Consumer<List<Input>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 可修改参数定义列表。
     * @return inputs
     */
    public List<Input> getInputs() {
        return inputs;
    }

    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    public ProvidedAction withDynamicSourceDefinition(Map<String, Object> dynamicSourceDefinition) {
        this.dynamicSourceDefinition = dynamicSourceDefinition;
        return this;
    }

    public ProvidedAction putDynamicSourceDefinitionItem(String key, Object dynamicSourceDefinitionItem) {
        if (this.dynamicSourceDefinition == null) {
            this.dynamicSourceDefinition = new HashMap<>();
        }
        this.dynamicSourceDefinition.put(key, dynamicSourceDefinitionItem);
        return this;
    }

    public ProvidedAction withDynamicSourceDefinition(Consumer<Map<String, Object>> dynamicSourceDefinitionSetter) {
        if (this.dynamicSourceDefinition == null) {
            this.dynamicSourceDefinition = new HashMap<>();
        }
        dynamicSourceDefinitionSetter.accept(this.dynamicSourceDefinition);
        return this;
    }

    /**
     * 可修改参数引用
     * @return dynamicSourceDefinition
     */
    public Map<String, Object> getDynamicSourceDefinition() {
        return dynamicSourceDefinition;
    }

    public void setDynamicSourceDefinition(Map<String, Object> dynamicSourceDefinition) {
        this.dynamicSourceDefinition = dynamicSourceDefinition;
    }

    public ProvidedAction withNeedPolicy(List<Policy> needPolicy) {
        this.needPolicy = needPolicy;
        return this;
    }

    public ProvidedAction addNeedPolicyItem(Policy needPolicyItem) {
        if (this.needPolicy == null) {
            this.needPolicy = new ArrayList<>();
        }
        this.needPolicy.add(needPolicyItem);
        return this;
    }

    public ProvidedAction withNeedPolicy(Consumer<List<Policy>> needPolicySetter) {
        if (this.needPolicy == null) {
            this.needPolicy = new ArrayList<>();
        }
        needPolicySetter.accept(this.needPolicy);
        return this;
    }

    /**
     * 需要的权限。
     * @return needPolicy
     */
    public List<Policy> getNeedPolicy() {
        return needPolicy;
    }

    public void setNeedPolicy(List<Policy> needPolicy) {
        this.needPolicy = needPolicy;
    }

    public ProvidedAction withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 算子提供方名称。
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ProvidedAction withIsUploadedFuncPkg(Boolean isUploadedFuncPkg) {
        this.isUploadedFuncPkg = isUploadedFuncPkg;
        return this;
    }

    /**
     * 是否上传了算子包
     * @return isUploadedFuncPkg
     */
    public Boolean getIsUploadedFuncPkg() {
        return isUploadedFuncPkg;
    }

    public void setIsUploadedFuncPkg(Boolean isUploadedFuncPkg) {
        this.isUploadedFuncPkg = isUploadedFuncPkg;
    }

    public ProvidedAction withFuncPkgEndpoint(String funcPkgEndpoint) {
        this.funcPkgEndpoint = funcPkgEndpoint;
        return this;
    }

    /**
     * 上传算子包的临时签名URL地址，用于上传算子包。
     * @return funcPkgEndpoint
     */
    public String getFuncPkgEndpoint() {
        return funcPkgEndpoint;
    }

    public void setFuncPkgEndpoint(String funcPkgEndpoint) {
        this.funcPkgEndpoint = funcPkgEndpoint;
    }

    public ProvidedAction withUploadFuncPkgSize(Integer uploadFuncPkgSize) {
        this.uploadFuncPkgSize = uploadFuncPkgSize;
        return this;
    }

    /**
     * 上传算子包的大小。小于100M
     * minimum: 0
     * maximum: 104857600
     * @return uploadFuncPkgSize
     */
    public Integer getUploadFuncPkgSize() {
        return uploadFuncPkgSize;
    }

    public void setUploadFuncPkgSize(Integer uploadFuncPkgSize) {
        this.uploadFuncPkgSize = uploadFuncPkgSize;
    }

    public ProvidedAction withUploadFuncPkgEtag(String uploadFuncPkgEtag) {
        this.uploadFuncPkgEtag = uploadFuncPkgEtag;
        return this;
    }

    /**
     * 上传算子包的etag。
     * @return uploadFuncPkgEtag
     */
    public String getUploadFuncPkgEtag() {
        return uploadFuncPkgEtag;
    }

    public void setUploadFuncPkgEtag(String uploadFuncPkgEtag) {
        this.uploadFuncPkgEtag = uploadFuncPkgEtag;
    }

    public ProvidedAction withRegisterStatus(PublicTemplateRegisterType registerStatus) {
        this.registerStatus = registerStatus;
        return this;
    }

    /**
     * Get registerStatus
     * @return registerStatus
     */
    public PublicTemplateRegisterType getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(PublicTemplateRegisterType registerStatus) {
        this.registerStatus = registerStatus;
    }

    public ProvidedAction withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProvidedAction withFunctionTemplate(String functionTemplate) {
        this.functionTemplate = functionTemplate;
        return this;
    }

    /**
     * 函数URN
     * @return functionTemplate
     */
    public String getFunctionTemplate() {
        return functionTemplate;
    }

    public void setFunctionTemplate(String functionTemplate) {
        this.functionTemplate = functionTemplate;
    }

    public ProvidedAction withProviderDomainid(String providerDomainid) {
        this.providerDomainid = providerDomainid;
        return this;
    }

    /**
     * 算子提供方IAM DomainID
     * @return providerDomainid
     */
    public String getProviderDomainid() {
        return providerDomainid;
    }

    public void setProviderDomainid(String providerDomainid) {
        this.providerDomainid = providerDomainid;
    }

    public ProvidedAction withProviderUserid(String providerUserid) {
        this.providerUserid = providerUserid;
        return this;
    }

    /**
     * 算子提供方IAM UserID
     * @return providerUserid
     */
    public String getProviderUserid() {
        return providerUserid;
    }

    public void setProviderUserid(String providerUserid) {
        this.providerUserid = providerUserid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProvidedAction that = (ProvidedAction) obj;
        return Objects.equals(this.templateName, that.templateName) && Objects.equals(this.category, that.category)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastModifyTime, that.lastModifyTime) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.dynamicSourceDefinition, that.dynamicSourceDefinition)
            && Objects.equals(this.needPolicy, that.needPolicy) && Objects.equals(this.providerName, that.providerName)
            && Objects.equals(this.isUploadedFuncPkg, that.isUploadedFuncPkg)
            && Objects.equals(this.funcPkgEndpoint, that.funcPkgEndpoint)
            && Objects.equals(this.uploadFuncPkgSize, that.uploadFuncPkgSize)
            && Objects.equals(this.uploadFuncPkgEtag, that.uploadFuncPkgEtag)
            && Objects.equals(this.registerStatus, that.registerStatus)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.functionTemplate, that.functionTemplate)
            && Objects.equals(this.providerDomainid, that.providerDomainid)
            && Objects.equals(this.providerUserid, that.providerUserid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName,
            category,
            createTime,
            lastModifyTime,
            inputs,
            dynamicSourceDefinition,
            needPolicy,
            providerName,
            isUploadedFuncPkg,
            funcPkgEndpoint,
            uploadFuncPkgSize,
            uploadFuncPkgEtag,
            registerStatus,
            description,
            functionTemplate,
            providerDomainid,
            providerUserid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvidedAction {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastModifyTime: ").append(toIndentedString(lastModifyTime)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    dynamicSourceDefinition: ").append(toIndentedString(dynamicSourceDefinition)).append("\n");
        sb.append("    needPolicy: ").append(toIndentedString(needPolicy)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    isUploadedFuncPkg: ").append(toIndentedString(isUploadedFuncPkg)).append("\n");
        sb.append("    funcPkgEndpoint: ").append(toIndentedString(funcPkgEndpoint)).append("\n");
        sb.append("    uploadFuncPkgSize: ").append(toIndentedString(uploadFuncPkgSize)).append("\n");
        sb.append("    uploadFuncPkgEtag: ").append(toIndentedString(uploadFuncPkgEtag)).append("\n");
        sb.append("    registerStatus: ").append(toIndentedString(registerStatus)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    functionTemplate: ").append(toIndentedString(functionTemplate)).append("\n");
        sb.append("    providerDomainid: ").append(toIndentedString(providerDomainid)).append("\n");
        sb.append("    providerUserid: ").append(toIndentedString(providerUserid)).append("\n");
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
