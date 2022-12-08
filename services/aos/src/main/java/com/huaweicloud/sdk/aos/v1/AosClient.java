package com.huaweicloud.sdk.aos.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.aos.v1.model.*;

public class AosClient {
    protected HcClient hcClient;

    public AosClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AosClient> newBuilder() {
        return new ClientBuilder<>(AosClient::new);
    }


    /**
     * 此命令用于执行已有的执行计划(execution plan)
     *
     * 此命令用于执行已有的执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyExecutionPlanRequest 请求对象
     * @return ApplyExecutionPlanResponse
     */
    public ApplyExecutionPlanResponse applyExecutionPlan(ApplyExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.applyExecutionPlan);
    }

    /**
     * 此命令用于执行已有的执行计划(execution plan)
     *
     * 此命令用于执行已有的执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyExecutionPlanRequest 请求对象
     * @return SyncInvoker<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse>
     */
    public SyncInvoker<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> applyExecutionPlanInvoker(ApplyExecutionPlanRequest request) {
        return new SyncInvoker<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse>(request, AosMeta.applyExecutionPlan, hcClient);
    }

    /**
     * 此命令用于生成一个执行计划(execution plan)
     *
     * 此命令用于生成一个执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExecutionPlanRequest 请求对象
     * @return CreateExecutionPlanResponse
     */
    public CreateExecutionPlanResponse createExecutionPlan(CreateExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.createExecutionPlan);
    }

    /**
     * 此命令用于生成一个执行计划(execution plan)
     *
     * 此命令用于生成一个执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExecutionPlanRequest 请求对象
     * @return SyncInvoker<CreateExecutionPlanRequest, CreateExecutionPlanResponse>
     */
    public SyncInvoker<CreateExecutionPlanRequest, CreateExecutionPlanResponse> createExecutionPlanInvoker(CreateExecutionPlanRequest request) {
        return new SyncInvoker<CreateExecutionPlanRequest, CreateExecutionPlanResponse>(request, AosMeta.createExecutionPlan, hcClient);
    }

    /**
     * 此命令用于删除已有的执行计划(execution plan)
     *
     * 此命令用于删除已有的执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteExecutionPlanRequest 请求对象
     * @return DeleteExecutionPlanResponse
     */
    public DeleteExecutionPlanResponse deleteExecutionPlan(DeleteExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.deleteExecutionPlan);
    }

    /**
     * 此命令用于删除已有的执行计划(execution plan)
     *
     * 此命令用于删除已有的执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteExecutionPlanRequest 请求对象
     * @return SyncInvoker<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse>
     */
    public SyncInvoker<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> deleteExecutionPlanInvoker(DeleteExecutionPlanRequest request) {
        return new SyncInvoker<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse>(request, AosMeta.deleteExecutionPlan, hcClient);
    }

    /**
     * 删除资源栈
     *
     * 删除资源栈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStackRequest 请求对象
     * @return DeleteStackResponse
     */
    public DeleteStackResponse deleteStack(DeleteStackRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.deleteStack);
    }

    /**
     * 删除资源栈
     *
     * 删除资源栈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStackRequest 请求对象
     * @return SyncInvoker<DeleteStackRequest, DeleteStackResponse>
     */
    public SyncInvoker<DeleteStackRequest, DeleteStackResponse> deleteStackInvoker(DeleteStackRequest request) {
        return new SyncInvoker<DeleteStackRequest, DeleteStackResponse>(request, AosMeta.deleteStack, hcClient);
    }

    /**
     * 描述执行计划当前的状态，返回执行计划的元数据
     *
     * 描述执行计划当前的状态，返回执行计划的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeExecutionPlanRequest 请求对象
     * @return DescribeExecutionPlanResponse
     */
    public DescribeExecutionPlanResponse describeExecutionPlan(DescribeExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.describeExecutionPlan);
    }

    /**
     * 描述执行计划当前的状态，返回执行计划的元数据
     *
     * 描述执行计划当前的状态，返回执行计划的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeExecutionPlanRequest 请求对象
     * @return SyncInvoker<DescribeExecutionPlanRequest, DescribeExecutionPlanResponse>
     */
    public SyncInvoker<DescribeExecutionPlanRequest, DescribeExecutionPlanResponse> describeExecutionPlanInvoker(DescribeExecutionPlanRequest request) {
        return new SyncInvoker<DescribeExecutionPlanRequest, DescribeExecutionPlanResponse>(request, AosMeta.describeExecutionPlan, hcClient);
    }

    /**
     * 预估执行计划的价格
     *
     * 预估执行计划的价格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EstimateExecutionPlanPriceRequest 请求对象
     * @return EstimateExecutionPlanPriceResponse
     */
    public EstimateExecutionPlanPriceResponse estimateExecutionPlanPrice(EstimateExecutionPlanPriceRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.estimateExecutionPlanPrice);
    }

    /**
     * 预估执行计划的价格
     *
     * 预估执行计划的价格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EstimateExecutionPlanPriceRequest 请求对象
     * @return SyncInvoker<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse>
     */
    public SyncInvoker<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> estimateExecutionPlanPriceInvoker(EstimateExecutionPlanPriceRequest request) {
        return new SyncInvoker<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse>(request, AosMeta.estimateExecutionPlanPrice, hcClient);
    }

    /**
     * 此接口用于获取执行计划的详细内容
     *
     * 此接口用于获取执行计划的详细内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetExecutionPlanRequest 请求对象
     * @return GetExecutionPlanResponse
     */
    public GetExecutionPlanResponse getExecutionPlan(GetExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.getExecutionPlan);
    }

    /**
     * 此接口用于获取执行计划的详细内容
     *
     * 此接口用于获取执行计划的详细内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetExecutionPlanRequest 请求对象
     * @return SyncInvoker<GetExecutionPlanRequest, GetExecutionPlanResponse>
     */
    public SyncInvoker<GetExecutionPlanRequest, GetExecutionPlanResponse> getExecutionPlanInvoker(GetExecutionPlanRequest request) {
        return new SyncInvoker<GetExecutionPlanRequest, GetExecutionPlanResponse>(request, AosMeta.getExecutionPlan, hcClient);
    }

    /**
     * 描述栈的状态，返回栈的元数据
     *
     * 描述栈的状态，返回栈的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetStackMetadataRequest 请求对象
     * @return GetStackMetadataResponse
     */
    public GetStackMetadataResponse getStackMetadata(GetStackMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.getStackMetadata);
    }

    /**
     * 描述栈的状态，返回栈的元数据
     *
     * 描述栈的状态，返回栈的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetStackMetadataRequest 请求对象
     * @return SyncInvoker<GetStackMetadataRequest, GetStackMetadataResponse>
     */
    public SyncInvoker<GetStackMetadataRequest, GetStackMetadataResponse> getStackMetadataInvoker(GetStackMetadataRequest request) {
        return new SyncInvoker<GetStackMetadataRequest, GetStackMetadataResponse>(request, AosMeta.getStackMetadata, hcClient);
    }

    /**
     * 获取资源栈模板
     *
     * 获取资源栈当前使用的模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetStackTemplateRequest 请求对象
     * @return GetStackTemplateResponse
     */
    public GetStackTemplateResponse getStackTemplate(GetStackTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.getStackTemplate);
    }

    /**
     * 获取资源栈模板
     *
     * 获取资源栈当前使用的模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetStackTemplateRequest 请求对象
     * @return SyncInvoker<GetStackTemplateRequest, GetStackTemplateResponse>
     */
    public SyncInvoker<GetStackTemplateRequest, GetStackTemplateResponse> getStackTemplateInvoker(GetStackTemplateRequest request) {
        return new SyncInvoker<GetStackTemplateRequest, GetStackTemplateResponse>(request, AosMeta.getStackTemplate, hcClient);
    }

    /**
     * 列举执行计划
     *
     * 列举执行计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExecutionPlansRequest 请求对象
     * @return ListExecutionPlansResponse
     */
    public ListExecutionPlansResponse listExecutionPlans(ListExecutionPlansRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.listExecutionPlans);
    }

    /**
     * 列举执行计划
     *
     * 列举执行计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExecutionPlansRequest 请求对象
     * @return SyncInvoker<ListExecutionPlansRequest, ListExecutionPlansResponse>
     */
    public SyncInvoker<ListExecutionPlansRequest, ListExecutionPlansResponse> listExecutionPlansInvoker(ListExecutionPlansRequest request) {
        return new SyncInvoker<ListExecutionPlansRequest, ListExecutionPlansResponse>(request, AosMeta.listExecutionPlans, hcClient);
    }

    /**
     * 获取栈的细节更新状态
     *
     * 获取栈的细节更新状态，可以获取整个栈从生成到当前时间点的所有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackEventsRequest 请求对象
     * @return ListStackEventsResponse
     */
    public ListStackEventsResponse listStackEvents(ListStackEventsRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.listStackEvents);
    }

    /**
     * 获取栈的细节更新状态
     *
     * 获取栈的细节更新状态，可以获取整个栈从生成到当前时间点的所有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackEventsRequest 请求对象
     * @return SyncInvoker<ListStackEventsRequest, ListStackEventsResponse>
     */
    public SyncInvoker<ListStackEventsRequest, ListStackEventsResponse> listStackEventsInvoker(ListStackEventsRequest request) {
        return new SyncInvoker<ListStackEventsRequest, ListStackEventsResponse>(request, AosMeta.listStackEvents, hcClient);
    }

    /**
     * 列举资源栈的输出
     *
     * 列举资源栈的输出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackOutputsRequest 请求对象
     * @return ListStackOutputsResponse
     */
    public ListStackOutputsResponse listStackOutputs(ListStackOutputsRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.listStackOutputs);
    }

    /**
     * 列举资源栈的输出
     *
     * 列举资源栈的输出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackOutputsRequest 请求对象
     * @return SyncInvoker<ListStackOutputsRequest, ListStackOutputsResponse>
     */
    public SyncInvoker<ListStackOutputsRequest, ListStackOutputsResponse> listStackOutputsInvoker(ListStackOutputsRequest request) {
        return new SyncInvoker<ListStackOutputsRequest, ListStackOutputsResponse>(request, AosMeta.listStackOutputs, hcClient);
    }

    /**
     * 获取资源栈的资源列表
     *
     * 获取资源栈的资源列表，可以获取整个栈从生成到当前时间点的所有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackResourcesRequest 请求对象
     * @return ListStackResourcesResponse
     */
    public ListStackResourcesResponse listStackResources(ListStackResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.listStackResources);
    }

    /**
     * 获取资源栈的资源列表
     *
     * 获取资源栈的资源列表，可以获取整个栈从生成到当前时间点的所有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackResourcesRequest 请求对象
     * @return SyncInvoker<ListStackResourcesRequest, ListStackResourcesResponse>
     */
    public SyncInvoker<ListStackResourcesRequest, ListStackResourcesResponse> listStackResourcesInvoker(ListStackResourcesRequest request) {
        return new SyncInvoker<ListStackResourcesRequest, ListStackResourcesResponse>(request, AosMeta.listStackResources, hcClient);
    }

    /**
     * 此命令用于解析模板参数
     *
     * 此命令用于解析模板参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ParseTemplateVariablesRequest 请求对象
     * @return ParseTemplateVariablesResponse
     */
    public ParseTemplateVariablesResponse parseTemplateVariables(ParseTemplateVariablesRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.parseTemplateVariables);
    }

    /**
     * 此命令用于解析模板参数
     *
     * 此命令用于解析模板参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ParseTemplateVariablesRequest 请求对象
     * @return SyncInvoker<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse>
     */
    public SyncInvoker<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> parseTemplateVariablesInvoker(ParseTemplateVariablesRequest request) {
        return new SyncInvoker<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse>(request, AosMeta.parseTemplateVariables, hcClient);
    }

    /**
     * 继续回滚资源栈
     *
     * 如果资源栈开启了自动回滚，在部署失败的时候则会自动回滚。但是自动回滚依然有可能失败，用户可以根据错误信息修复后，调用ContinueRollbackStack触发继续回滚，即重试回滚
     * 
     * * 如果资源栈当前可以回滚，即处于&#x60;ROLLBACK_FAILED&#x60;，则返回202与对应生成的deploymentId，否则将不允许回滚并返回响应的错误码
     * * 继续回滚也有可能会回滚失败。如果失败，用户可以从ListStackEvents获取对应的log，解决后可再次调用ContinueRollbackStack去继续触发回滚
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ContinueRollbackStackRequest 请求对象
     * @return ContinueRollbackStackResponse
     */
    public ContinueRollbackStackResponse continueRollbackStack(ContinueRollbackStackRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.continueRollbackStack);
    }

    /**
     * 继续回滚资源栈
     *
     * 如果资源栈开启了自动回滚，在部署失败的时候则会自动回滚。但是自动回滚依然有可能失败，用户可以根据错误信息修复后，调用ContinueRollbackStack触发继续回滚，即重试回滚
     * 
     * * 如果资源栈当前可以回滚，即处于&#x60;ROLLBACK_FAILED&#x60;，则返回202与对应生成的deploymentId，否则将不允许回滚并返回响应的错误码
     * * 继续回滚也有可能会回滚失败。如果失败，用户可以从ListStackEvents获取对应的log，解决后可再次调用ContinueRollbackStack去继续触发回滚
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ContinueRollbackStackRequest 请求对象
     * @return SyncInvoker<ContinueRollbackStackRequest, ContinueRollbackStackResponse>
     */
    public SyncInvoker<ContinueRollbackStackRequest, ContinueRollbackStackResponse> continueRollbackStackInvoker(ContinueRollbackStackRequest request) {
        return new SyncInvoker<ContinueRollbackStackRequest, ContinueRollbackStackResponse>(request, AosMeta.continueRollbackStack, hcClient);
    }

    /**
     * 创建资源栈
     *
     * CreateStack用于生成一个资源栈
     * 
     * * 当请求中不含有模板（template）、参数（vars）等信息，将生成一个无任何资源的空资源栈，返回资源栈ID（stack_id）
     * * 当请求中携带了模板（template）、参数（vars）等信息，则会同时创建并部署资源栈，返回资源栈ID（stack_id）和部署ID（deployment_id）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStackRequest 请求对象
     * @return CreateStackResponse
     */
    public CreateStackResponse createStack(CreateStackRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.createStack);
    }

    /**
     * 创建资源栈
     *
     * CreateStack用于生成一个资源栈
     * 
     * * 当请求中不含有模板（template）、参数（vars）等信息，将生成一个无任何资源的空资源栈，返回资源栈ID（stack_id）
     * * 当请求中携带了模板（template）、参数（vars）等信息，则会同时创建并部署资源栈，返回资源栈ID（stack_id）和部署ID（deployment_id）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStackRequest 请求对象
     * @return SyncInvoker<CreateStackRequest, CreateStackResponse>
     */
    public SyncInvoker<CreateStackRequest, CreateStackResponse> createStackInvoker(CreateStackRequest request) {
        return new SyncInvoker<CreateStackRequest, CreateStackResponse>(request, AosMeta.createStack, hcClient);
    }

    /**
     * 部署一个已有的资源栈
     *
     * 部署一个已有的资源栈
     * 
     * * 用户可以使用此API更新模板、参数等并触发一个新的部署
     * 
     * * 此API会直接触发部署，如果用户希望先确认部署会发生的时间，请使用执行计划，即使用CreateExecutionPlan以创建执行计划、使用GetExecutionPlan以获取执行计划
     * 
     * * 此API为全量API，即用户每次部署都需要给予所想要使用的template、vars的全量
     * 
     * * 当触发的部署失败时，如果资源栈开启了自动回滚，会触发自动回滚的流程，否则就会停留在部署失败时的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeployStackRequest 请求对象
     * @return DeployStackResponse
     */
    public DeployStackResponse deployStack(DeployStackRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.deployStack);
    }

    /**
     * 部署一个已有的资源栈
     *
     * 部署一个已有的资源栈
     * 
     * * 用户可以使用此API更新模板、参数等并触发一个新的部署
     * 
     * * 此API会直接触发部署，如果用户希望先确认部署会发生的时间，请使用执行计划，即使用CreateExecutionPlan以创建执行计划、使用GetExecutionPlan以获取执行计划
     * 
     * * 此API为全量API，即用户每次部署都需要给予所想要使用的template、vars的全量
     * 
     * * 当触发的部署失败时，如果资源栈开启了自动回滚，会触发自动回滚的流程，否则就会停留在部署失败时的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeployStackRequest 请求对象
     * @return SyncInvoker<DeployStackRequest, DeployStackResponse>
     */
    public SyncInvoker<DeployStackRequest, DeployStackResponse> deployStackInvoker(DeployStackRequest request) {
        return new SyncInvoker<DeployStackRequest, DeployStackResponse>(request, AosMeta.deployStack, hcClient);
    }

    /**
     * 列举资源栈
     *
     * ListStacks 列举当前局点下用户所有的资源栈
     * 
     *   * 默认按照生成时间排序，最早生成的在最前
     *   * 注意：目前暂时返回全量资源栈信息，即不支持分页
     *   * 如果没有任何资源栈，则返回空list
     * 
     * ListStacks返回的只有摘要信息（具体摘要信息见ListStacksResponseBody），如果用户需要详细的资源栈元数据请调用GetStackMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return ListStacksResponse
     */
    public ListStacksResponse listStacks(ListStacksRequest request) {
        return hcClient.syncInvokeHttp(request, AosMeta.listStacks);
    }

    /**
     * 列举资源栈
     *
     * ListStacks 列举当前局点下用户所有的资源栈
     * 
     *   * 默认按照生成时间排序，最早生成的在最前
     *   * 注意：目前暂时返回全量资源栈信息，即不支持分页
     *   * 如果没有任何资源栈，则返回空list
     * 
     * ListStacks返回的只有摘要信息（具体摘要信息见ListStacksResponseBody），如果用户需要详细的资源栈元数据请调用GetStackMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return SyncInvoker<ListStacksRequest, ListStacksResponse>
     */
    public SyncInvoker<ListStacksRequest, ListStacksResponse> listStacksInvoker(ListStacksRequest request) {
        return new SyncInvoker<ListStacksRequest, ListStacksResponse>(request, AosMeta.listStacks, hcClient);
    }

}