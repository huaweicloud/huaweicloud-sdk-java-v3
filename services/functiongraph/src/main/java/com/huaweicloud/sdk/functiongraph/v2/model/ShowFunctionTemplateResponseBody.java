package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowFunctionTemplateResponseBody
 */
public class ShowFunctionTemplateResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private String runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handler")

    private String handler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_type")

    private String codeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_size")

    private Integer memorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_metadata_list")

    private List<TriggerMetadataList> triggerMetadataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_detail")

    private TempDetail tempDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted_user_data")

    private String encryptedUserData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependencies")

    private List<String> dependencies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    public ShowFunctionTemplateResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模板id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowFunctionTemplateResponseBody withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 模板类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ShowFunctionTemplateResponseBody withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 模板标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowFunctionTemplateResponseBody withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ShowFunctionTemplateResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowFunctionTemplateResponseBody withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * 模板执行运行时
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public ShowFunctionTemplateResponseBody withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * 模板函数执行入口
     * @return handler
     */
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public ShowFunctionTemplateResponseBody withCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }

    /**
     * 代码类型
     * @return codeType
     */
    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public ShowFunctionTemplateResponseBody withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 代码文件
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowFunctionTemplateResponseBody withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 超时时间
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ShowFunctionTemplateResponseBody withMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * 内存大小
     * @return memorySize
     */
    public Integer getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public ShowFunctionTemplateResponseBody withTriggerMetadataList(List<TriggerMetadataList> triggerMetadataList) {
        this.triggerMetadataList = triggerMetadataList;
        return this;
    }

    public ShowFunctionTemplateResponseBody addTriggerMetadataListItem(TriggerMetadataList triggerMetadataListItem) {
        if (this.triggerMetadataList == null) {
            this.triggerMetadataList = new ArrayList<>();
        }
        this.triggerMetadataList.add(triggerMetadataListItem);
        return this;
    }

    public ShowFunctionTemplateResponseBody withTriggerMetadataList(
        Consumer<List<TriggerMetadataList>> triggerMetadataListSetter) {
        if (this.triggerMetadataList == null) {
            this.triggerMetadataList = new ArrayList<>();
        }
        triggerMetadataListSetter.accept(this.triggerMetadataList);
        return this;
    }

    /**
     * 触发信息列表
     * @return triggerMetadataList
     */
    public List<TriggerMetadataList> getTriggerMetadataList() {
        return triggerMetadataList;
    }

    public void setTriggerMetadataList(List<TriggerMetadataList> triggerMetadataList) {
        this.triggerMetadataList = triggerMetadataList;
    }

    public ShowFunctionTemplateResponseBody withTempDetail(TempDetail tempDetail) {
        this.tempDetail = tempDetail;
        return this;
    }

    public ShowFunctionTemplateResponseBody withTempDetail(Consumer<TempDetail> tempDetailSetter) {
        if (this.tempDetail == null) {
            this.tempDetail = new TempDetail();
            tempDetailSetter.accept(this.tempDetail);
        }

        return this;
    }

    /**
     * Get tempDetail
     * @return tempDetail
     */
    public TempDetail getTempDetail() {
        return tempDetail;
    }

    public void setTempDetail(TempDetail tempDetail) {
        this.tempDetail = tempDetail;
    }

    public ShowFunctionTemplateResponseBody withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户数据
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public ShowFunctionTemplateResponseBody withEncryptedUserData(String encryptedUserData) {
        this.encryptedUserData = encryptedUserData;
        return this;
    }

    /**
     * 加密用户数据
     * @return encryptedUserData
     */
    public String getEncryptedUserData() {
        return encryptedUserData;
    }

    public void setEncryptedUserData(String encryptedUserData) {
        this.encryptedUserData = encryptedUserData;
    }

    public ShowFunctionTemplateResponseBody withDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public ShowFunctionTemplateResponseBody addDependenciesItem(String dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    public ShowFunctionTemplateResponseBody withDependencies(Consumer<List<String>> dependenciesSetter) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        dependenciesSetter.accept(this.dependencies);
        return this;
    }

    /**
     * 模板所需依赖列表
     * @return dependencies
     */
    public List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    public ShowFunctionTemplateResponseBody withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 模板使用场景
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public ShowFunctionTemplateResponseBody withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 模板关联云服务
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFunctionTemplateResponseBody that = (ShowFunctionTemplateResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.title, that.title) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.handler, that.handler) && Objects.equals(this.codeType, that.codeType)
            && Objects.equals(this.code, that.code) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.memorySize, that.memorySize)
            && Objects.equals(this.triggerMetadataList, that.triggerMetadataList)
            && Objects.equals(this.tempDetail, that.tempDetail) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.encryptedUserData, that.encryptedUserData)
            && Objects.equals(this.dependencies, that.dependencies) && Objects.equals(this.scene, that.scene)
            && Objects.equals(this.service, that.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            type,
            title,
            templateName,
            description,
            runtime,
            handler,
            codeType,
            code,
            timeout,
            memorySize,
            triggerMetadataList,
            tempDetail,
            userData,
            encryptedUserData,
            dependencies,
            scene,
            service);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFunctionTemplateResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
        sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
        sb.append("    triggerMetadataList: ").append(toIndentedString(triggerMetadataList)).append("\n");
        sb.append("    tempDetail: ").append(toIndentedString(tempDetail)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    encryptedUserData: ").append(toIndentedString(encryptedUserData)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
