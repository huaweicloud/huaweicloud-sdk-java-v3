package com.huaweicloud.sdk.aos.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.aos.v1.model.*;

public class AosAsyncClient {
    protected HcClient hcClient;

    public AosAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AosAsyncClient> newBuilder() {
        return new ClientBuilder<>(AosAsyncClient::new);
    }


    /**
     * 此命令用于执行已有的执行计划(execution plan)
     *
     * 此命令用于执行已有的执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyExecutionPlanRequest 请求对象
     * @return CompletableFuture<ApplyExecutionPlanResponse>
     */
    public CompletableFuture<ApplyExecutionPlanResponse> applyExecutionPlanAsync(ApplyExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.applyExecutionPlan);
    }

    /**
     * 此命令用于执行已有的执行计划(execution plan)
     *
     * 此命令用于执行已有的执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyExecutionPlanRequest 请求对象
     * @return AsyncInvoker<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse>
     */
    public AsyncInvoker<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> applyExecutionPlanAsyncInvoker(ApplyExecutionPlanRequest request) {
        return new AsyncInvoker<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse>(request, AosMeta.applyExecutionPlan, hcClient);
    }

    /**
     * 此命令用于生成一个执行计划(execution plan)
     *
     * 此命令用于生成一个执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExecutionPlanRequest 请求对象
     * @return CompletableFuture<CreateExecutionPlanResponse>
     */
    public CompletableFuture<CreateExecutionPlanResponse> createExecutionPlanAsync(CreateExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createExecutionPlan);
    }

    /**
     * 此命令用于生成一个执行计划(execution plan)
     *
     * 此命令用于生成一个执行计划(execution plan)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExecutionPlanRequest 请求对象
     * @return AsyncInvoker<CreateExecutionPlanRequest, CreateExecutionPlanResponse>
     */
    public AsyncInvoker<CreateExecutionPlanRequest, CreateExecutionPlanResponse> createExecutionPlanAsyncInvoker(CreateExecutionPlanRequest request) {
        return new AsyncInvoker<CreateExecutionPlanRequest, CreateExecutionPlanResponse>(request, AosMeta.createExecutionPlan, hcClient);
    }

    /**
     * 删除堆栈
     *
     * 删除堆栈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStackRequest 请求对象
     * @return CompletableFuture<DeleteStackResponse>
     */
    public CompletableFuture<DeleteStackResponse> deleteStackAsync(DeleteStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deleteStack);
    }

    /**
     * 删除堆栈
     *
     * 删除堆栈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStackRequest 请求对象
     * @return AsyncInvoker<DeleteStackRequest, DeleteStackResponse>
     */
    public AsyncInvoker<DeleteStackRequest, DeleteStackResponse> deleteStackAsyncInvoker(DeleteStackRequest request) {
        return new AsyncInvoker<DeleteStackRequest, DeleteStackResponse>(request, AosMeta.deleteStack, hcClient);
    }

    /**
     * 预估执行计划的价格
     *
     * 预估执行计划的价格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EstimateExecutionPlanPriceRequest 请求对象
     * @return CompletableFuture<EstimateExecutionPlanPriceResponse>
     */
    public CompletableFuture<EstimateExecutionPlanPriceResponse> estimateExecutionPlanPriceAsync(EstimateExecutionPlanPriceRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.estimateExecutionPlanPrice);
    }

    /**
     * 预估执行计划的价格
     *
     * 预估执行计划的价格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EstimateExecutionPlanPriceRequest 请求对象
     * @return AsyncInvoker<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse>
     */
    public AsyncInvoker<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> estimateExecutionPlanPriceAsyncInvoker(EstimateExecutionPlanPriceRequest request) {
        return new AsyncInvoker<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse>(request, AosMeta.estimateExecutionPlanPrice, hcClient);
    }

    /**
     * 获取堆栈模板
     *
     * 获取堆栈当前使用的模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetStackTemplateRequest 请求对象
     * @return CompletableFuture<GetStackTemplateResponse>
     */
    public CompletableFuture<GetStackTemplateResponse> getStackTemplateAsync(GetStackTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.getStackTemplate);
    }

    /**
     * 获取堆栈模板
     *
     * 获取堆栈当前使用的模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetStackTemplateRequest 请求对象
     * @return AsyncInvoker<GetStackTemplateRequest, GetStackTemplateResponse>
     */
    public AsyncInvoker<GetStackTemplateRequest, GetStackTemplateResponse> getStackTemplateAsyncInvoker(GetStackTemplateRequest request) {
        return new AsyncInvoker<GetStackTemplateRequest, GetStackTemplateResponse>(request, AosMeta.getStackTemplate, hcClient);
    }

    /**
     * 列举执行计划
     *
     * 列举执行计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExecutionPlansRequest 请求对象
     * @return CompletableFuture<ListExecutionPlansResponse>
     */
    public CompletableFuture<ListExecutionPlansResponse> listExecutionPlansAsync(ListExecutionPlansRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listExecutionPlans);
    }

    /**
     * 列举执行计划
     *
     * 列举执行计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExecutionPlansRequest 请求对象
     * @return AsyncInvoker<ListExecutionPlansRequest, ListExecutionPlansResponse>
     */
    public AsyncInvoker<ListExecutionPlansRequest, ListExecutionPlansResponse> listExecutionPlansAsyncInvoker(ListExecutionPlansRequest request) {
        return new AsyncInvoker<ListExecutionPlansRequest, ListExecutionPlansResponse>(request, AosMeta.listExecutionPlans, hcClient);
    }

    /**
     * 获取栈的细节更新状态
     *
     * 获取栈的细节更新状态，可以获取整个栈从生成到当前时间点的所有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackEventsRequest 请求对象
     * @return CompletableFuture<ListStackEventsResponse>
     */
    public CompletableFuture<ListStackEventsResponse> listStackEventsAsync(ListStackEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStackEvents);
    }

    /**
     * 获取栈的细节更新状态
     *
     * 获取栈的细节更新状态，可以获取整个栈从生成到当前时间点的所有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackEventsRequest 请求对象
     * @return AsyncInvoker<ListStackEventsRequest, ListStackEventsResponse>
     */
    public AsyncInvoker<ListStackEventsRequest, ListStackEventsResponse> listStackEventsAsyncInvoker(ListStackEventsRequest request) {
        return new AsyncInvoker<ListStackEventsRequest, ListStackEventsResponse>(request, AosMeta.listStackEvents, hcClient);
    }

    /**
     * 列举堆栈的输出
     *
     * 列举堆栈的输出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackOutputsRequest 请求对象
     * @return CompletableFuture<ListStackOutputsResponse>
     */
    public CompletableFuture<ListStackOutputsResponse> listStackOutputsAsync(ListStackOutputsRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStackOutputs);
    }

    /**
     * 列举堆栈的输出
     *
     * 列举堆栈的输出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackOutputsRequest 请求对象
     * @return AsyncInvoker<ListStackOutputsRequest, ListStackOutputsResponse>
     */
    public AsyncInvoker<ListStackOutputsRequest, ListStackOutputsResponse> listStackOutputsAsyncInvoker(ListStackOutputsRequest request) {
        return new AsyncInvoker<ListStackOutputsRequest, ListStackOutputsResponse>(request, AosMeta.listStackOutputs, hcClient);
    }

    /**
     * 获取堆栈的资源列表
     *
     * 获取堆栈的资源列表，可以获取整个栈从生成到当前时间点的所有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackResourcesRequest 请求对象
     * @return CompletableFuture<ListStackResourcesResponse>
     */
    public CompletableFuture<ListStackResourcesResponse> listStackResourcesAsync(ListStackResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStackResources);
    }

    /**
     * 获取堆栈的资源列表
     *
     * 获取堆栈的资源列表，可以获取整个栈从生成到当前时间点的所有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStackResourcesRequest 请求对象
     * @return AsyncInvoker<ListStackResourcesRequest, ListStackResourcesResponse>
     */
    public AsyncInvoker<ListStackResourcesRequest, ListStackResourcesResponse> listStackResourcesAsyncInvoker(ListStackResourcesRequest request) {
        return new AsyncInvoker<ListStackResourcesRequest, ListStackResourcesResponse>(request, AosMeta.listStackResources, hcClient);
    }

    /**
     * 此命令用于解析模板参数
     *
     * 此命令用于解析模板参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ParseTemplateVariablesRequest 请求对象
     * @return CompletableFuture<ParseTemplateVariablesResponse>
     */
    public CompletableFuture<ParseTemplateVariablesResponse> parseTemplateVariablesAsync(ParseTemplateVariablesRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.parseTemplateVariables);
    }

    /**
     * 此命令用于解析模板参数
     *
     * 此命令用于解析模板参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ParseTemplateVariablesRequest 请求对象
     * @return AsyncInvoker<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse>
     */
    public AsyncInvoker<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> parseTemplateVariablesAsyncInvoker(ParseTemplateVariablesRequest request) {
        return new AsyncInvoker<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse>(request, AosMeta.parseTemplateVariables, hcClient);
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
     * @return CompletableFuture<ContinueRollbackStackResponse>
     */
    public CompletableFuture<ContinueRollbackStackResponse> continueRollbackStackAsync(ContinueRollbackStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.continueRollbackStack);
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
     * @return AsyncInvoker<ContinueRollbackStackRequest, ContinueRollbackStackResponse>
     */
    public AsyncInvoker<ContinueRollbackStackRequest, ContinueRollbackStackResponse> continueRollbackStackAsyncInvoker(ContinueRollbackStackRequest request) {
        return new AsyncInvoker<ContinueRollbackStackRequest, ContinueRollbackStackResponse>(request, AosMeta.continueRollbackStack, hcClient);
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
     * @return CompletableFuture<CreateStackResponse>
     */
    public CompletableFuture<CreateStackResponse> createStackAsync(CreateStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createStack);
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
     * @return AsyncInvoker<CreateStackRequest, CreateStackResponse>
     */
    public AsyncInvoker<CreateStackRequest, CreateStackResponse> createStackAsyncInvoker(CreateStackRequest request) {
        return new AsyncInvoker<CreateStackRequest, CreateStackResponse>(request, AosMeta.createStack, hcClient);
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
     * * 当触发的部署失败时，如果堆栈开启了自动回滚，会触发自动回滚的流程，否则就会停留在部署失败时的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeployStackRequest 请求对象
     * @return CompletableFuture<DeployStackResponse>
     */
    public CompletableFuture<DeployStackResponse> deployStackAsync(DeployStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deployStack);
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
     * * 当触发的部署失败时，如果堆栈开启了自动回滚，会触发自动回滚的流程，否则就会停留在部署失败时的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeployStackRequest 请求对象
     * @return AsyncInvoker<DeployStackRequest, DeployStackResponse>
     */
    public AsyncInvoker<DeployStackRequest, DeployStackResponse> deployStackAsyncInvoker(DeployStackRequest request) {
        return new AsyncInvoker<DeployStackRequest, DeployStackResponse>(request, AosMeta.deployStack, hcClient);
    }

    /**
     * 列举堆栈
     *
     * ListStacks 列举当前局点下用户所有的堆栈
     * 
     *   * 默认按照生成时间排序，最早生成的在最前
     *   * 注意：目前暂时返回全量堆栈信息，即不支持分页
     *   * 如果没有任何堆栈，则返回空list
     * 
     * ListStacks返回的只有摘要信息（具体摘要信息见ListStacksResponseBody），如果用户需要详细的资源栈元数据请调用GetStackMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return CompletableFuture<ListStacksResponse>
     */
    public CompletableFuture<ListStacksResponse> listStacksAsync(ListStacksRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStacks);
    }

    /**
     * 列举堆栈
     *
     * ListStacks 列举当前局点下用户所有的堆栈
     * 
     *   * 默认按照生成时间排序，最早生成的在最前
     *   * 注意：目前暂时返回全量堆栈信息，即不支持分页
     *   * 如果没有任何堆栈，则返回空list
     * 
     * ListStacks返回的只有摘要信息（具体摘要信息见ListStacksResponseBody），如果用户需要详细的资源栈元数据请调用GetStackMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return AsyncInvoker<ListStacksRequest, ListStacksResponse>
     */
    public AsyncInvoker<ListStacksRequest, ListStacksResponse> listStacksAsyncInvoker(ListStacksRequest request) {
        return new AsyncInvoker<ListStacksRequest, ListStacksResponse>(request, AosMeta.listStacks, hcClient);
    }

}