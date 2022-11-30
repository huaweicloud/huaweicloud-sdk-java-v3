package com.huaweicloud.sdk.dwr.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dwr.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class DwrAsyncClient {

    protected HcClient hcClient;

    public DwrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwrAsyncClient> newBuilder() {
        return new ClientBuilder<>(DwrAsyncClient::new);
    }

    /**
     * 同意服务协议
     *
     * 本接口用于使用工作流时需要同意服务使用协议。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptServiceContractRequest 请求对象
     * @return CompletableFuture<AcceptServiceContractResponse>
     */
    public CompletableFuture<AcceptServiceContractResponse> acceptServiceContractAsync(
        AcceptServiceContractRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.acceptServiceContract);
    }

    /**
     * 同意服务协议
     *
     * 本接口用于使用工作流时需要同意服务使用协议。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptServiceContractRequest 请求对象
     * @return AsyncInvoker<AcceptServiceContractRequest, AcceptServiceContractResponse>
     */
    public AsyncInvoker<AcceptServiceContractRequest, AcceptServiceContractResponse> acceptServiceContractAsyncInvoker(
        AcceptServiceContractRequest request) {
        return new AsyncInvoker<AcceptServiceContractRequest, AcceptServiceContractResponse>(request,
            DwrMeta.acceptServiceContract, hcClient);
    }

    /**
     * API异步启动工作流
     *
     * 本接口用于API方式异步启动已有工作流，产生工作流实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeApiStartWorkflowRequest 请求对象
     * @return CompletableFuture<AsyncInvokeApiStartWorkflowResponse>
     */
    public CompletableFuture<AsyncInvokeApiStartWorkflowResponse> asyncInvokeApiStartWorkflowAsync(
        AsyncInvokeApiStartWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.asyncInvokeApiStartWorkflow);
    }

    /**
     * API异步启动工作流
     *
     * 本接口用于API方式异步启动已有工作流，产生工作流实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeApiStartWorkflowRequest 请求对象
     * @return AsyncInvoker<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse>
     */
    public AsyncInvoker<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse> asyncInvokeApiStartWorkflowAsyncInvoker(
        AsyncInvokeApiStartWorkflowRequest request) {
        return new AsyncInvoker<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse>(request,
            DwrMeta.asyncInvokeApiStartWorkflow, hcClient);
    }

    /**
     * 查询授权
     *
     * 本接口用于查询授权，查询由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckWorkflowAuthenticationRequest 请求对象
     * @return CompletableFuture<CheckWorkflowAuthenticationResponse>
     */
    public CompletableFuture<CheckWorkflowAuthenticationResponse> checkWorkflowAuthenticationAsync(
        CheckWorkflowAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.checkWorkflowAuthentication);
    }

    /**
     * 查询授权
     *
     * 本接口用于查询授权，查询由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckWorkflowAuthenticationRequest 请求对象
     * @return AsyncInvoker<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse>
     */
    public AsyncInvoker<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse> checkWorkflowAuthenticationAsyncInvoker(
        CheckWorkflowAuthenticationRequest request) {
        return new AsyncInvoker<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse>(request,
            DwrMeta.checkWorkflowAuthentication, hcClient);
    }

    /**
     * 创建第三方算子模板
     *
     * 创建第三方算子模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMyActionTemplateRequest 请求对象
     * @return CompletableFuture<CreateMyActionTemplateResponse>
     */
    public CompletableFuture<CreateMyActionTemplateResponse> createMyActionTemplateAsync(
        CreateMyActionTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.createMyActionTemplate);
    }

    /**
     * 创建第三方算子模板
     *
     * 创建第三方算子模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMyActionTemplateRequest 请求对象
     * @return AsyncInvoker<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse>
     */
    public AsyncInvoker<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse> createMyActionTemplateAsyncInvoker(
        CreateMyActionTemplateRequest request) {
        return new AsyncInvoker<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse>(request,
            DwrMeta.createMyActionTemplate, hcClient);
    }

    /**
     * 开通授权
     *
     * 本接口用于开通授权，由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowAuthenticationRequest 请求对象
     * @return CompletableFuture<CreateWorkflowAuthenticationResponse>
     */
    public CompletableFuture<CreateWorkflowAuthenticationResponse> createWorkflowAuthenticationAsync(
        CreateWorkflowAuthenticationRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.createWorkflowAuthentication);
    }

    /**
     * 开通授权
     *
     * 本接口用于开通授权，由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowAuthenticationRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse>
     */
    public AsyncInvoker<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse> createWorkflowAuthenticationAsyncInvoker(
        CreateWorkflowAuthenticationRequest request) {
        return new AsyncInvoker<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse>(request,
            DwrMeta.createWorkflowAuthentication, hcClient);
    }

    /**
     * 删除第三方算子模板
     *
     * 本接口用于标记删除提交的第三方算子模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMyActionTemplateRequest 请求对象
     * @return CompletableFuture<DeleteMyActionTemplateResponse>
     */
    public CompletableFuture<DeleteMyActionTemplateResponse> deleteMyActionTemplateAsync(
        DeleteMyActionTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.deleteMyActionTemplate);
    }

    /**
     * 删除第三方算子模板
     *
     * 本接口用于标记删除提交的第三方算子模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMyActionTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse>
     */
    public AsyncInvoker<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse> deleteMyActionTemplateAsyncInvoker(
        DeleteMyActionTemplateRequest request) {
        return new AsyncInvoker<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse>(request,
            DwrMeta.deleteMyActionTemplate, hcClient);
    }

    /**
     * 查询第三方算子列表
     *
     * 本接口用于查询提交注册过的三方算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMyActionTemplateRequest 请求对象
     * @return CompletableFuture<ListMyActionTemplateResponse>
     */
    public CompletableFuture<ListMyActionTemplateResponse> listMyActionTemplateAsync(
        ListMyActionTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.listMyActionTemplate);
    }

    /**
     * 查询第三方算子列表
     *
     * 本接口用于查询提交注册过的三方算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMyActionTemplateRequest 请求对象
     * @return AsyncInvoker<ListMyActionTemplateRequest, ListMyActionTemplateResponse>
     */
    public AsyncInvoker<ListMyActionTemplateRequest, ListMyActionTemplateResponse> listMyActionTemplateAsyncInvoker(
        ListMyActionTemplateRequest request) {
        return new AsyncInvoker<ListMyActionTemplateRequest, ListMyActionTemplateResponse>(request,
            DwrMeta.listMyActionTemplate, hcClient);
    }

    /**
     * 查询华为云内置算子列表
     *
     * 本接口用于按名称查询系统内置算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemTemplatesRequest 请求对象
     * @return CompletableFuture<ListSystemTemplatesResponse>
     */
    public CompletableFuture<ListSystemTemplatesResponse> listSystemTemplatesAsync(ListSystemTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.listSystemTemplates);
    }

    /**
     * 查询华为云内置算子列表
     *
     * 本接口用于按名称查询系统内置算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSystemTemplatesRequest 请求对象
     * @return AsyncInvoker<ListSystemTemplatesRequest, ListSystemTemplatesResponse>
     */
    public AsyncInvoker<ListSystemTemplatesRequest, ListSystemTemplatesResponse> listSystemTemplatesAsyncInvoker(
        ListSystemTemplatesRequest request) {
        return new AsyncInvoker<ListSystemTemplatesRequest, ListSystemTemplatesResponse>(request,
            DwrMeta.listSystemTemplates, hcClient);
    }

    /**
     * 本接口用于查询用户工作流的实例列表
     *
     * 本接口用于查询用户工作流的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowInstanceRequest 请求对象
     * @return CompletableFuture<ListWorkflowInstanceResponse>
     */
    public CompletableFuture<ListWorkflowInstanceResponse> listWorkflowInstanceAsync(
        ListWorkflowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.listWorkflowInstance);
    }

    /**
     * 本接口用于查询用户工作流的实例列表
     *
     * 本接口用于查询用户工作流的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowInstanceRequest 请求对象
     * @return AsyncInvoker<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse>
     */
    public AsyncInvoker<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse> listWorkflowInstanceAsyncInvoker(
        ListWorkflowInstanceRequest request) {
        return new AsyncInvoker<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse>(request,
            DwrMeta.listWorkflowInstance, hcClient);
    }

    /**
     * 恢复一个执行失败状态的工作流实例
     *
     * 本接口用于恢复一个执行失败状态的工作流实例。恢复后，工作流实例将从上次失败的状态处继续执行，而工作流步骤中已经执行成功的状态不会再执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreWorkflowExecutionRequest 请求对象
     * @return CompletableFuture<RestoreWorkflowExecutionResponse>
     */
    public CompletableFuture<RestoreWorkflowExecutionResponse> restoreWorkflowExecutionAsync(
        RestoreWorkflowExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.restoreWorkflowExecution);
    }

    /**
     * 恢复一个执行失败状态的工作流实例
     *
     * 本接口用于恢复一个执行失败状态的工作流实例。恢复后，工作流实例将从上次失败的状态处继续执行，而工作流步骤中已经执行成功的状态不会再执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreWorkflowExecutionRequest 请求对象
     * @return AsyncInvoker<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse>
     */
    public AsyncInvoker<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse> restoreWorkflowExecutionAsyncInvoker(
        RestoreWorkflowExecutionRequest request) {
        return new AsyncInvoker<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse>(request,
            DwrMeta.restoreWorkflowExecution, hcClient);
    }

    /**
     * 查询已发布算子列表
     *
     * 本接口用于查询开放的算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicActionListRequest 请求对象
     * @return CompletableFuture<ShowPublicActionListResponse>
     */
    public CompletableFuture<ShowPublicActionListResponse> showPublicActionListAsync(
        ShowPublicActionListRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.showPublicActionList);
    }

    /**
     * 查询已发布算子列表
     *
     * 本接口用于查询开放的算子列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicActionListRequest 请求对象
     * @return AsyncInvoker<ShowPublicActionListRequest, ShowPublicActionListResponse>
     */
    public AsyncInvoker<ShowPublicActionListRequest, ShowPublicActionListResponse> showPublicActionListAsyncInvoker(
        ShowPublicActionListRequest request) {
        return new AsyncInvoker<ShowPublicActionListRequest, ShowPublicActionListResponse>(request,
            DwrMeta.showPublicActionList, hcClient);
    }

    /**
     * 查询已发布算子模板详情
     *
     * 本接口用于按名称查询开放的算子详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicTemplateInfoRequest 请求对象
     * @return CompletableFuture<ShowPublicTemplateInfoResponse>
     */
    public CompletableFuture<ShowPublicTemplateInfoResponse> showPublicTemplateInfoAsync(
        ShowPublicTemplateInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.showPublicTemplateInfo);
    }

    /**
     * 查询已发布算子模板详情
     *
     * 本接口用于按名称查询开放的算子详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicTemplateInfoRequest 请求对象
     * @return AsyncInvoker<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse>
     */
    public AsyncInvoker<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse> showPublicTemplateInfoAsyncInvoker(
        ShowPublicTemplateInfoRequest request) {
        return new AsyncInvoker<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse>(request,
            DwrMeta.showPublicTemplateInfo, hcClient);
    }

    /**
     * 查询服务协议
     *
     * 本接口用于查询使用工作流时同意的服务协议。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServiceContractRequest 请求对象
     * @return CompletableFuture<ShowServiceContractResponse>
     */
    public CompletableFuture<ShowServiceContractResponse> showServiceContractAsync(ShowServiceContractRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.showServiceContract);
    }

    /**
     * 查询服务协议
     *
     * 本接口用于查询使用工作流时同意的服务协议。该函数具有幂等性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServiceContractRequest 请求对象
     * @return AsyncInvoker<ShowServiceContractRequest, ShowServiceContractResponse>
     */
    public AsyncInvoker<ShowServiceContractRequest, ShowServiceContractResponse> showServiceContractAsyncInvoker(
        ShowServiceContractRequest request) {
        return new AsyncInvoker<ShowServiceContractRequest, ShowServiceContractResponse>(request,
            DwrMeta.showServiceContract, hcClient);
    }

    /**
     * 查询华为云内置算子模板信息
     *
     * 本接口用于按名称查询系统内置算子详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSystemTemplateDetailRequest 请求对象
     * @return CompletableFuture<ShowSystemTemplateDetailResponse>
     */
    public CompletableFuture<ShowSystemTemplateDetailResponse> showSystemTemplateDetailAsync(
        ShowSystemTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.showSystemTemplateDetail);
    }

    /**
     * 查询华为云内置算子模板信息
     *
     * 本接口用于按名称查询系统内置算子详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSystemTemplateDetailRequest 请求对象
     * @return AsyncInvoker<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse>
     */
    public AsyncInvoker<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse> showSystemTemplateDetailAsyncInvoker(
        ShowSystemTemplateDetailRequest request) {
        return new AsyncInvoker<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse>(request,
            DwrMeta.showSystemTemplateDetail, hcClient);
    }

    /**
     * 查询公共Action模板详情
     *
     * 本接口用于按名称查询第三方模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowThirdTemplateInfoRequest 请求对象
     * @return CompletableFuture<ShowThirdTemplateInfoResponse>
     */
    public CompletableFuture<ShowThirdTemplateInfoResponse> showThirdTemplateInfoAsync(
        ShowThirdTemplateInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.showThirdTemplateInfo);
    }

    /**
     * 查询公共Action模板详情
     *
     * 本接口用于按名称查询第三方模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowThirdTemplateInfoRequest 请求对象
     * @return AsyncInvoker<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse>
     */
    public AsyncInvoker<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse> showThirdTemplateInfoAsyncInvoker(
        ShowThirdTemplateInfoRequest request) {
        return new AsyncInvoker<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse>(request,
            DwrMeta.showThirdTemplateInfo, hcClient);
    }

    /**
     * 本接口用于查询指定工作流实例详细
     *
     * 本接口用于查询指定工作流实例详细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowInstanceRequest 请求对象
     * @return CompletableFuture<ShowWorkflowInstanceResponse>
     */
    public CompletableFuture<ShowWorkflowInstanceResponse> showWorkflowInstanceAsync(
        ShowWorkflowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.showWorkflowInstance);
    }

    /**
     * 本接口用于查询指定工作流实例详细
     *
     * 本接口用于查询指定工作流实例详细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse>
     */
    public AsyncInvoker<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse> showWorkflowInstanceAsyncInvoker(
        ShowWorkflowInstanceRequest request) {
        return new AsyncInvoker<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse>(request,
            DwrMeta.showWorkflowInstance, hcClient);
    }

    /**
     * 更新第三方算子模板
     *
     * 本接口用于修改第三方算子和将三方算子提交审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMyActionTemplateRequest 请求对象
     * @return CompletableFuture<UpdateMyActionTemplateResponse>
     */
    public CompletableFuture<UpdateMyActionTemplateResponse> updateMyActionTemplateAsync(
        UpdateMyActionTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.updateMyActionTemplate);
    }

    /**
     * 更新第三方算子模板
     *
     * 本接口用于修改第三方算子和将三方算子提交审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMyActionTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse>
     */
    public AsyncInvoker<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse> updateMyActionTemplateAsyncInvoker(
        UpdateMyActionTemplateRequest request) {
        return new AsyncInvoker<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse>(request,
            DwrMeta.updateMyActionTemplate, hcClient);
    }

    /**
     * 禁用第三方算子模板
     *
     * 本接口用于申请禁用第三方算子。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMyActionTemplateToDeprecatedRequest 请求对象
     * @return CompletableFuture<UpdateMyActionTemplateToDeprecatedResponse>
     */
    public CompletableFuture<UpdateMyActionTemplateToDeprecatedResponse> updateMyActionTemplateToDeprecatedAsync(
        UpdateMyActionTemplateToDeprecatedRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.updateMyActionTemplateToDeprecated);
    }

    /**
     * 禁用第三方算子模板
     *
     * 本接口用于申请禁用第三方算子。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMyActionTemplateToDeprecatedRequest 请求对象
     * @return AsyncInvoker<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse>
     */
    public AsyncInvoker<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse> updateMyActionTemplateToDeprecatedAsyncInvoker(
        UpdateMyActionTemplateToDeprecatedRequest request) {
        return new AsyncInvoker<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse>(
            request, DwrMeta.updateMyActionTemplateToDeprecated, hcClient);
    }

    /**
     * 创建工作流
     *
     * 本接口用于通过Body体直接创建工作流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return CompletableFuture<CreateWorkflowResponse>
     */
    public CompletableFuture<CreateWorkflowResponse> createWorkflowAsync(CreateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.createWorkflow);
    }

    /**
     * 创建工作流
     *
     * 本接口用于通过Body体直接创建工作流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowAsyncInvoker(
        CreateWorkflowRequest request) {
        return new AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>(request, DwrMeta.createWorkflow,
            hcClient);
    }

    /**
     * 删除工作流
     *
     * 本接口用于删除工作流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkflowRequest 请求对象
     * @return CompletableFuture<DeleteWorkflowResponse>
     */
    public CompletableFuture<DeleteWorkflowResponse> deleteWorkflowAsync(DeleteWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.deleteWorkflow);
    }

    /**
     * 删除工作流
     *
     * 本接口用于删除工作流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWorkflowRequest 请求对象
     * @return AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>
     */
    public AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflowAsyncInvoker(
        DeleteWorkflowRequest request) {
        return new AsyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>(request, DwrMeta.deleteWorkflow,
            hcClient);
    }

    /**
     * 查询工作流列表
     *
     * 本接口用于查询工作流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowsRequest 请求对象
     * @return CompletableFuture<ListWorkflowsResponse>
     */
    public CompletableFuture<ListWorkflowsResponse> listWorkflowsAsync(ListWorkflowsRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.listWorkflows);
    }

    /**
     * 查询工作流列表
     *
     * 本接口用于查询工作流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowsRequest 请求对象
     * @return AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsAsyncInvoker(
        ListWorkflowsRequest request) {
        return new AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>(request, DwrMeta.listWorkflows, hcClient);
    }

    /**
     * 查询工作流信息
     *
     * 本接口用于根据工作流名称查询工作流详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowInfoRequest 请求对象
     * @return CompletableFuture<ShowWorkflowInfoResponse>
     */
    public CompletableFuture<ShowWorkflowInfoResponse> showWorkflowInfoAsync(ShowWorkflowInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.showWorkflowInfo);
    }

    /**
     * 查询工作流信息
     *
     * 本接口用于根据工作流名称查询工作流详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowInfoRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse>
     */
    public AsyncInvoker<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse> showWorkflowInfoAsyncInvoker(
        ShowWorkflowInfoRequest request) {
        return new AsyncInvoker<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse>(request, DwrMeta.showWorkflowInfo,
            hcClient);
    }

    /**
     * 更新工作流
     *
     * Update Workflow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkflowRequest 请求对象
     * @return CompletableFuture<UpdateWorkflowResponse>
     */
    public CompletableFuture<UpdateWorkflowResponse> updateWorkflowAsync(UpdateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, DwrMeta.updateWorkflow);
    }

    /**
     * 更新工作流
     *
     * Update Workflow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkflowRequest 请求对象
     * @return AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>
     */
    public AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflowAsyncInvoker(
        UpdateWorkflowRequest request) {
        return new AsyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>(request, DwrMeta.updateWorkflow,
            hcClient);
    }

}
