package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateWorkflowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<WorkflowStep> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_requirements")

    private List<DataRequirement> dataRequirements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<Data> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<WorkflowParameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_workflow_id")

    private String sourceWorkflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gallery_subscription")

    private WorkflowGallerySubscription gallerySubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_execution")

    private ExecutionBrief latestExecution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_count")

    private Integer runCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_ready")

    private Boolean paramReady;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storages")

    private List<WorkflowStorage> storages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private List<WorkflowAsset> assets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_graphs")

    private List<WorkflowSubgraph> subGraphs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Map<String, Object> extend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private WorkflowPolicy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_subscription")

    private Boolean withSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_switch")

    private Boolean smnSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exeml_template_id")

    private String exemlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_at")

    private String lastModifiedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package")

    private WorkflowServicePackege _package;

    public CreateWorkflowResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Workflow工作流名称，1到64位只包含中英文、数字、空格、下划线（_）和中划线（-），并且以中英文开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWorkflowResponse withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * Workflow工作流ID。创建工作流时后台自动生成。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public CreateWorkflowResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Workflow工作流的创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreateWorkflowResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Workflow工作流的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWorkflowResponse withSteps(List<WorkflowStep> steps) {
        this.steps = steps;
        return this;
    }

    public CreateWorkflowResponse addStepsItem(WorkflowStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public CreateWorkflowResponse withSteps(Consumer<List<WorkflowStep>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * Workflow工作流包含的步骤定义。
     * @return steps
     */
    public List<WorkflowStep> getSteps() {
        return steps;
    }

    public void setSteps(List<WorkflowStep> steps) {
        this.steps = steps;
    }

    public CreateWorkflowResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 创建Workflow工作流的用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateWorkflowResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateWorkflowResponse withDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
        return this;
    }

    public CreateWorkflowResponse addDataRequirementsItem(DataRequirement dataRequirementsItem) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        this.dataRequirements.add(dataRequirementsItem);
        return this;
    }

    public CreateWorkflowResponse withDataRequirements(Consumer<List<DataRequirement>> dataRequirementsSetter) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        dataRequirementsSetter.accept(this.dataRequirements);
        return this;
    }

    /**
     * Workflow需要的数据。
     * @return dataRequirements
     */
    public List<DataRequirement> getDataRequirements() {
        return dataRequirements;
    }

    public void setDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
    }

    public CreateWorkflowResponse withData(List<Data> data) {
        this.data = data;
        return this;
    }

    public CreateWorkflowResponse addDataItem(Data dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public CreateWorkflowResponse withData(Consumer<List<Data>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * Workflow包含的数据。
     * @return data
     */
    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public CreateWorkflowResponse withParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public CreateWorkflowResponse addParametersItem(WorkflowParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public CreateWorkflowResponse withParameters(Consumer<List<WorkflowParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * Workflow包含的参数。
     * @return parameters
     */
    public List<WorkflowParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
    }

    public CreateWorkflowResponse withSourceWorkflowId(String sourceWorkflowId) {
        this.sourceWorkflowId = sourceWorkflowId;
        return this;
    }

    /**
     * 从指定Workflow工作流进行复制。通过复制来创建Workflow时必填。
     * @return sourceWorkflowId
     */
    public String getSourceWorkflowId() {
        return sourceWorkflowId;
    }

    public void setSourceWorkflowId(String sourceWorkflowId) {
        this.sourceWorkflowId = sourceWorkflowId;
    }

    public CreateWorkflowResponse withGallerySubscription(WorkflowGallerySubscription gallerySubscription) {
        this.gallerySubscription = gallerySubscription;
        return this;
    }

    public CreateWorkflowResponse withGallerySubscription(
        Consumer<WorkflowGallerySubscription> gallerySubscriptionSetter) {
        if (this.gallerySubscription == null) {
            this.gallerySubscription = new WorkflowGallerySubscription();
            gallerySubscriptionSetter.accept(this.gallerySubscription);
        }

        return this;
    }

    /**
     * Get gallerySubscription
     * @return gallerySubscription
     */
    public WorkflowGallerySubscription getGallerySubscription() {
        return gallerySubscription;
    }

    public void setGallerySubscription(WorkflowGallerySubscription gallerySubscription) {
        this.gallerySubscription = gallerySubscription;
    }

    public CreateWorkflowResponse withLatestExecution(ExecutionBrief latestExecution) {
        this.latestExecution = latestExecution;
        return this;
    }

    public CreateWorkflowResponse withLatestExecution(Consumer<ExecutionBrief> latestExecutionSetter) {
        if (this.latestExecution == null) {
            this.latestExecution = new ExecutionBrief();
            latestExecutionSetter.accept(this.latestExecution);
        }

        return this;
    }

    /**
     * Get latestExecution
     * @return latestExecution
     */
    public ExecutionBrief getLatestExecution() {
        return latestExecution;
    }

    public void setLatestExecution(ExecutionBrief latestExecution) {
        this.latestExecution = latestExecution;
    }

    public CreateWorkflowResponse withRunCount(Integer runCount) {
        this.runCount = runCount;
        return this;
    }

    /**
     * 工作流的已运行次数。
     * @return runCount
     */
    public Integer getRunCount() {
        return runCount;
    }

    public void setRunCount(Integer runCount) {
        this.runCount = runCount;
    }

    public CreateWorkflowResponse withParamReady(Boolean paramReady) {
        this.paramReady = paramReady;
        return this;
    }

    /**
     * 当前工作流的必选参数是否都已填完。
     * @return paramReady
     */
    public Boolean getParamReady() {
        return paramReady;
    }

    public void setParamReady(Boolean paramReady) {
        this.paramReady = paramReady;
    }

    public CreateWorkflowResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 工作流来源，可选值为ai_gallery，表示工作流是从AI Gallery导入的。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CreateWorkflowResponse withStorages(List<WorkflowStorage> storages) {
        this.storages = storages;
        return this;
    }

    public CreateWorkflowResponse addStoragesItem(WorkflowStorage storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    public CreateWorkflowResponse withStorages(Consumer<List<WorkflowStorage>> storagesSetter) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        storagesSetter.accept(this.storages);
        return this;
    }

    /**
     * Workflow包含的统一存储定义。
     * @return storages
     */
    public List<WorkflowStorage> getStorages() {
        return storages;
    }

    public void setStorages(List<WorkflowStorage> storages) {
        this.storages = storages;
    }

    public CreateWorkflowResponse withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public CreateWorkflowResponse addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public CreateWorkflowResponse withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 为Workflow工作流设置的标签。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public CreateWorkflowResponse withAssets(List<WorkflowAsset> assets) {
        this.assets = assets;
        return this;
    }

    public CreateWorkflowResponse addAssetsItem(WorkflowAsset assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public CreateWorkflowResponse withAssets(Consumer<List<WorkflowAsset>> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * 工作流绑定的资产。
     * @return assets
     */
    public List<WorkflowAsset> getAssets() {
        return assets;
    }

    public void setAssets(List<WorkflowAsset> assets) {
        this.assets = assets;
    }

    public CreateWorkflowResponse withSubGraphs(List<WorkflowSubgraph> subGraphs) {
        this.subGraphs = subGraphs;
        return this;
    }

    public CreateWorkflowResponse addSubGraphsItem(WorkflowSubgraph subGraphsItem) {
        if (this.subGraphs == null) {
            this.subGraphs = new ArrayList<>();
        }
        this.subGraphs.add(subGraphsItem);
        return this;
    }

    public CreateWorkflowResponse withSubGraphs(Consumer<List<WorkflowSubgraph>> subGraphsSetter) {
        if (this.subGraphs == null) {
            this.subGraphs = new ArrayList<>();
        }
        subGraphsSetter.accept(this.subGraphs);
        return this;
    }

    /**
     * 工作流包含的子图。
     * @return subGraphs
     */
    public List<WorkflowSubgraph> getSubGraphs() {
        return subGraphs;
    }

    public void setSubGraphs(List<WorkflowSubgraph> subGraphs) {
        this.subGraphs = subGraphs;
    }

    public CreateWorkflowResponse withExtend(Map<String, Object> extend) {
        this.extend = extend;
        return this;
    }

    public CreateWorkflowResponse putExtendItem(String key, Object extendItem) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        this.extend.put(key, extendItem);
        return this;
    }

    public CreateWorkflowResponse withExtend(Consumer<Map<String, Object>> extendSetter) {
        if (this.extend == null) {
            this.extend = new HashMap<>();
        }
        extendSetter.accept(this.extend);
        return this;
    }

    /**
     * 计费工作流使用的拓展字段。
     * @return extend
     */
    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    public CreateWorkflowResponse withPolicy(WorkflowPolicy policy) {
        this.policy = policy;
        return this;
    }

    public CreateWorkflowResponse withPolicy(Consumer<WorkflowPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new WorkflowPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public WorkflowPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(WorkflowPolicy policy) {
        this.policy = policy;
    }

    public CreateWorkflowResponse withWithSubscription(Boolean withSubscription) {
        this.withSubscription = withSubscription;
        return this;
    }

    /**
     * 工作流SMN消息订阅开关，默认为false，表示关闭消息订阅开关。
     * @return withSubscription
     */
    public Boolean getWithSubscription() {
        return withSubscription;
    }

    public void setWithSubscription(Boolean withSubscription) {
        this.withSubscription = withSubscription;
    }

    public CreateWorkflowResponse withSmnSwitch(Boolean smnSwitch) {
        this.smnSwitch = smnSwitch;
        return this;
    }

    /**
     * SMN开关。
     * @return smnSwitch
     */
    public Boolean getSmnSwitch() {
        return smnSwitch;
    }

    public void setSmnSwitch(Boolean smnSwitch) {
        this.smnSwitch = smnSwitch;
    }

    public CreateWorkflowResponse withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * SMN消息订阅ID。
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public CreateWorkflowResponse withExemlTemplateId(String exemlTemplateId) {
        this.exemlTemplateId = exemlTemplateId;
        return this;
    }

    /**
     * 自动学习模板ID。
     * @return exemlTemplateId
     */
    public String getExemlTemplateId() {
        return exemlTemplateId;
    }

    public void setExemlTemplateId(String exemlTemplateId) {
        this.exemlTemplateId = exemlTemplateId;
    }

    public CreateWorkflowResponse withLastModifiedAt(String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     * 最近一次修改的时间。
     * @return lastModifiedAt
     */
    public String getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public CreateWorkflowResponse withPackage(WorkflowServicePackege _package) {
        this._package = _package;
        return this;
    }

    public CreateWorkflowResponse withPackage(Consumer<WorkflowServicePackege> _packageSetter) {
        if (this._package == null) {
            this._package = new WorkflowServicePackege();
            _packageSetter.accept(this._package);
        }

        return this;
    }

    /**
     * Get _package
     * @return _package
     */
    public WorkflowServicePackege getPackage() {
        return _package;
    }

    public void setPackage(WorkflowServicePackege _package) {
        this._package = _package;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkflowResponse that = (CreateWorkflowResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.workflowId, that.workflowId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.description, that.description)
            && Objects.equals(this.steps, that.steps) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.dataRequirements, that.dataRequirements) && Objects.equals(this.data, that.data)
            && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.sourceWorkflowId, that.sourceWorkflowId)
            && Objects.equals(this.gallerySubscription, that.gallerySubscription)
            && Objects.equals(this.latestExecution, that.latestExecution)
            && Objects.equals(this.runCount, that.runCount) && Objects.equals(this.paramReady, that.paramReady)
            && Objects.equals(this.source, that.source) && Objects.equals(this.storages, that.storages)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.assets, that.assets)
            && Objects.equals(this.subGraphs, that.subGraphs) && Objects.equals(this.extend, that.extend)
            && Objects.equals(this.policy, that.policy) && Objects.equals(this.withSubscription, that.withSubscription)
            && Objects.equals(this.smnSwitch, that.smnSwitch)
            && Objects.equals(this.subscriptionId, that.subscriptionId)
            && Objects.equals(this.exemlTemplateId, that.exemlTemplateId)
            && Objects.equals(this.lastModifiedAt, that.lastModifiedAt) && Objects.equals(this._package, that._package);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            workflowId,
            createdAt,
            description,
            steps,
            userName,
            workspaceId,
            dataRequirements,
            data,
            parameters,
            sourceWorkflowId,
            gallerySubscription,
            latestExecution,
            runCount,
            paramReady,
            source,
            storages,
            labels,
            assets,
            subGraphs,
            extend,
            policy,
            withSubscription,
            smnSwitch,
            subscriptionId,
            exemlTemplateId,
            lastModifiedAt,
            _package);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkflowResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataRequirements: ").append(toIndentedString(dataRequirements)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    sourceWorkflowId: ").append(toIndentedString(sourceWorkflowId)).append("\n");
        sb.append("    gallerySubscription: ").append(toIndentedString(gallerySubscription)).append("\n");
        sb.append("    latestExecution: ").append(toIndentedString(latestExecution)).append("\n");
        sb.append("    runCount: ").append(toIndentedString(runCount)).append("\n");
        sb.append("    paramReady: ").append(toIndentedString(paramReady)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    subGraphs: ").append(toIndentedString(subGraphs)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    withSubscription: ").append(toIndentedString(withSubscription)).append("\n");
        sb.append("    smnSwitch: ").append(toIndentedString(smnSwitch)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    exemlTemplateId: ").append(toIndentedString(exemlTemplateId)).append("\n");
        sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
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
