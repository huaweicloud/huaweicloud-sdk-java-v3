package com.huaweicloud.sdk.dwr.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dwr.v3.model.*;

public class DwrClient {

    protected HcClient hcClient;

    public DwrClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwrClient> newBuilder() {
        return new ClientBuilder<>(DwrClient::new);
    }

    /**
     * 同意服务协议
     *
     * 本接口用于使用工作流时需要同意服务使用协议。该函数具有幂等性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AcceptServiceContractRequest 请求对象
     * @return AcceptServiceContractResponse
     */
    public AcceptServiceContractResponse acceptServiceContract(AcceptServiceContractRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.acceptServiceContract);
    }

    /**
     * 同意服务协议
     *
     * 本接口用于使用工作流时需要同意服务使用协议。该函数具有幂等性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AcceptServiceContractRequest 请求对象
     * @return SyncInvoker<AcceptServiceContractRequest, AcceptServiceContractResponse>
     */
    public SyncInvoker<AcceptServiceContractRequest, AcceptServiceContractResponse> acceptServiceContractInvoker(
        AcceptServiceContractRequest request) {
        return new SyncInvoker<AcceptServiceContractRequest, AcceptServiceContractResponse>(request,
            DwrMeta.acceptServiceContract, hcClient);
    }

    /**
     * API异步启动工作流
     *
     * 本接口用于API方式异步启动已有工作流，产生工作流实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AsyncInvokeApiStartWorkflowRequest 请求对象
     * @return AsyncInvokeApiStartWorkflowResponse
     */
    public AsyncInvokeApiStartWorkflowResponse asyncInvokeApiStartWorkflow(AsyncInvokeApiStartWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.asyncInvokeApiStartWorkflow);
    }

    /**
     * API异步启动工作流
     *
     * 本接口用于API方式异步启动已有工作流，产生工作流实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AsyncInvokeApiStartWorkflowRequest 请求对象
     * @return SyncInvoker<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse>
     */
    public SyncInvoker<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse> asyncInvokeApiStartWorkflowInvoker(
        AsyncInvokeApiStartWorkflowRequest request) {
        return new SyncInvoker<AsyncInvokeApiStartWorkflowRequest, AsyncInvokeApiStartWorkflowResponse>(request,
            DwrMeta.asyncInvokeApiStartWorkflow, hcClient);
    }

    /**
     * 查询授权
     *
     * 本接口用于查询授权，查询由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckWorkflowAuthenticationRequest 请求对象
     * @return CheckWorkflowAuthenticationResponse
     */
    public CheckWorkflowAuthenticationResponse checkWorkflowAuthentication(CheckWorkflowAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.checkWorkflowAuthentication);
    }

    /**
     * 查询授权
     *
     * 本接口用于查询授权，查询由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckWorkflowAuthenticationRequest 请求对象
     * @return SyncInvoker<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse>
     */
    public SyncInvoker<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse> checkWorkflowAuthenticationInvoker(
        CheckWorkflowAuthenticationRequest request) {
        return new SyncInvoker<CheckWorkflowAuthenticationRequest, CheckWorkflowAuthenticationResponse>(request,
            DwrMeta.checkWorkflowAuthentication, hcClient);
    }

    /**
     * 创建第三方算子模板
     *
     * 创建第三方算子模板
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMyActionTemplateRequest 请求对象
     * @return CreateMyActionTemplateResponse
     */
    public CreateMyActionTemplateResponse createMyActionTemplate(CreateMyActionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.createMyActionTemplate);
    }

    /**
     * 创建第三方算子模板
     *
     * 创建第三方算子模板
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMyActionTemplateRequest 请求对象
     * @return SyncInvoker<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse>
     */
    public SyncInvoker<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse> createMyActionTemplateInvoker(
        CreateMyActionTemplateRequest request) {
        return new SyncInvoker<CreateMyActionTemplateRequest, CreateMyActionTemplateResponse>(request,
            DwrMeta.createMyActionTemplate, hcClient);
    }

    /**
     * 开通授权
     *
     * 本接口用于开通授权，由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWorkflowAuthenticationRequest 请求对象
     * @return CreateWorkflowAuthenticationResponse
     */
    public CreateWorkflowAuthenticationResponse createWorkflowAuthentication(
        CreateWorkflowAuthenticationRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.createWorkflowAuthentication);
    }

    /**
     * 开通授权
     *
     * 本接口用于开通授权，由DWR服务自动帮助用户创建工作流运行时需要的函数服务权限，以及函数服务运行时的权限。该函数具有幂等性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWorkflowAuthenticationRequest 请求对象
     * @return SyncInvoker<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse>
     */
    public SyncInvoker<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse> createWorkflowAuthenticationInvoker(
        CreateWorkflowAuthenticationRequest request) {
        return new SyncInvoker<CreateWorkflowAuthenticationRequest, CreateWorkflowAuthenticationResponse>(request,
            DwrMeta.createWorkflowAuthentication, hcClient);
    }

    /**
     * 删除第三方算子模板
     *
     * 本接口用于标记删除提交的第三方算子模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMyActionTemplateRequest 请求对象
     * @return DeleteMyActionTemplateResponse
     */
    public DeleteMyActionTemplateResponse deleteMyActionTemplate(DeleteMyActionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.deleteMyActionTemplate);
    }

    /**
     * 删除第三方算子模板
     *
     * 本接口用于标记删除提交的第三方算子模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMyActionTemplateRequest 请求对象
     * @return SyncInvoker<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse>
     */
    public SyncInvoker<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse> deleteMyActionTemplateInvoker(
        DeleteMyActionTemplateRequest request) {
        return new SyncInvoker<DeleteMyActionTemplateRequest, DeleteMyActionTemplateResponse>(request,
            DwrMeta.deleteMyActionTemplate, hcClient);
    }

    /**
     * 查询第三方算子列表
     *
     * 本接口用于查询提交注册过的三方算子列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMyActionTemplateRequest 请求对象
     * @return ListMyActionTemplateResponse
     */
    public ListMyActionTemplateResponse listMyActionTemplate(ListMyActionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listMyActionTemplate);
    }

    /**
     * 查询第三方算子列表
     *
     * 本接口用于查询提交注册过的三方算子列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMyActionTemplateRequest 请求对象
     * @return SyncInvoker<ListMyActionTemplateRequest, ListMyActionTemplateResponse>
     */
    public SyncInvoker<ListMyActionTemplateRequest, ListMyActionTemplateResponse> listMyActionTemplateInvoker(
        ListMyActionTemplateRequest request) {
        return new SyncInvoker<ListMyActionTemplateRequest, ListMyActionTemplateResponse>(request,
            DwrMeta.listMyActionTemplate, hcClient);
    }

    /**
     * 查询华为云内置算子列表
     *
     * 本接口用于按名称查询系统内置算子列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSystemTemplatesRequest 请求对象
     * @return ListSystemTemplatesResponse
     */
    public ListSystemTemplatesResponse listSystemTemplates(ListSystemTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listSystemTemplates);
    }

    /**
     * 查询华为云内置算子列表
     *
     * 本接口用于按名称查询系统内置算子列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSystemTemplatesRequest 请求对象
     * @return SyncInvoker<ListSystemTemplatesRequest, ListSystemTemplatesResponse>
     */
    public SyncInvoker<ListSystemTemplatesRequest, ListSystemTemplatesResponse> listSystemTemplatesInvoker(
        ListSystemTemplatesRequest request) {
        return new SyncInvoker<ListSystemTemplatesRequest, ListSystemTemplatesResponse>(request,
            DwrMeta.listSystemTemplates, hcClient);
    }

    /**
     * 本接口用于查询用户工作流的实例列表
     *
     * 本接口用于查询用户工作流的实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkflowInstanceRequest 请求对象
     * @return ListWorkflowInstanceResponse
     */
    public ListWorkflowInstanceResponse listWorkflowInstance(ListWorkflowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listWorkflowInstance);
    }

    /**
     * 本接口用于查询用户工作流的实例列表
     *
     * 本接口用于查询用户工作流的实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkflowInstanceRequest 请求对象
     * @return SyncInvoker<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse>
     */
    public SyncInvoker<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse> listWorkflowInstanceInvoker(
        ListWorkflowInstanceRequest request) {
        return new SyncInvoker<ListWorkflowInstanceRequest, ListWorkflowInstanceResponse>(request,
            DwrMeta.listWorkflowInstance, hcClient);
    }

    /**
     * 恢复一个执行失败状态的工作流实例
     *
     * 本接口用于恢复一个执行失败状态的工作流实例。恢复后，工作流实例将从上次失败的状态处继续执行，而工作流步骤中已经执行成功的状态不会再执行。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreWorkflowExecutionRequest 请求对象
     * @return RestoreWorkflowExecutionResponse
     */
    public RestoreWorkflowExecutionResponse restoreWorkflowExecution(RestoreWorkflowExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.restoreWorkflowExecution);
    }

    /**
     * 恢复一个执行失败状态的工作流实例
     *
     * 本接口用于恢复一个执行失败状态的工作流实例。恢复后，工作流实例将从上次失败的状态处继续执行，而工作流步骤中已经执行成功的状态不会再执行。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse>
     */
    public SyncInvoker<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse> restoreWorkflowExecutionInvoker(
        RestoreWorkflowExecutionRequest request) {
        return new SyncInvoker<RestoreWorkflowExecutionRequest, RestoreWorkflowExecutionResponse>(request,
            DwrMeta.restoreWorkflowExecution, hcClient);
    }

    /**
     * 查询已发布算子列表
     *
     * 本接口用于查询开放的算子列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicActionListRequest 请求对象
     * @return ShowPublicActionListResponse
     */
    public ShowPublicActionListResponse showPublicActionList(ShowPublicActionListRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showPublicActionList);
    }

    /**
     * 查询已发布算子列表
     *
     * 本接口用于查询开放的算子列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicActionListRequest 请求对象
     * @return SyncInvoker<ShowPublicActionListRequest, ShowPublicActionListResponse>
     */
    public SyncInvoker<ShowPublicActionListRequest, ShowPublicActionListResponse> showPublicActionListInvoker(
        ShowPublicActionListRequest request) {
        return new SyncInvoker<ShowPublicActionListRequest, ShowPublicActionListResponse>(request,
            DwrMeta.showPublicActionList, hcClient);
    }

    /**
     * 查询已发布算子模板详情
     *
     * 本接口用于按名称查询开放的算子详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicTemplateInfoRequest 请求对象
     * @return ShowPublicTemplateInfoResponse
     */
    public ShowPublicTemplateInfoResponse showPublicTemplateInfo(ShowPublicTemplateInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showPublicTemplateInfo);
    }

    /**
     * 查询已发布算子模板详情
     *
     * 本接口用于按名称查询开放的算子详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicTemplateInfoRequest 请求对象
     * @return SyncInvoker<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse>
     */
    public SyncInvoker<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse> showPublicTemplateInfoInvoker(
        ShowPublicTemplateInfoRequest request) {
        return new SyncInvoker<ShowPublicTemplateInfoRequest, ShowPublicTemplateInfoResponse>(request,
            DwrMeta.showPublicTemplateInfo, hcClient);
    }

    /**
     * 查询服务协议
     *
     * 本接口用于查询使用工作流时同意的服务协议。该函数具有幂等性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowServiceContractRequest 请求对象
     * @return ShowServiceContractResponse
     */
    public ShowServiceContractResponse showServiceContract(ShowServiceContractRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showServiceContract);
    }

    /**
     * 查询服务协议
     *
     * 本接口用于查询使用工作流时同意的服务协议。该函数具有幂等性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowServiceContractRequest 请求对象
     * @return SyncInvoker<ShowServiceContractRequest, ShowServiceContractResponse>
     */
    public SyncInvoker<ShowServiceContractRequest, ShowServiceContractResponse> showServiceContractInvoker(
        ShowServiceContractRequest request) {
        return new SyncInvoker<ShowServiceContractRequest, ShowServiceContractResponse>(request,
            DwrMeta.showServiceContract, hcClient);
    }

    /**
     * 查询华为云内置算子模板信息
     *
     * 本接口用于按名称查询系统内置算子详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSystemTemplateDetailRequest 请求对象
     * @return ShowSystemTemplateDetailResponse
     */
    public ShowSystemTemplateDetailResponse showSystemTemplateDetail(ShowSystemTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showSystemTemplateDetail);
    }

    /**
     * 查询华为云内置算子模板信息
     *
     * 本接口用于按名称查询系统内置算子详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSystemTemplateDetailRequest 请求对象
     * @return SyncInvoker<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse>
     */
    public SyncInvoker<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse> showSystemTemplateDetailInvoker(
        ShowSystemTemplateDetailRequest request) {
        return new SyncInvoker<ShowSystemTemplateDetailRequest, ShowSystemTemplateDetailResponse>(request,
            DwrMeta.showSystemTemplateDetail, hcClient);
    }

    /**
     * 查询公共Action模板详情
     *
     * 本接口用于按名称查询第三方模板详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowThirdTemplateInfoRequest 请求对象
     * @return ShowThirdTemplateInfoResponse
     */
    public ShowThirdTemplateInfoResponse showThirdTemplateInfo(ShowThirdTemplateInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showThirdTemplateInfo);
    }

    /**
     * 查询公共Action模板详情
     *
     * 本接口用于按名称查询第三方模板详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowThirdTemplateInfoRequest 请求对象
     * @return SyncInvoker<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse>
     */
    public SyncInvoker<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse> showThirdTemplateInfoInvoker(
        ShowThirdTemplateInfoRequest request) {
        return new SyncInvoker<ShowThirdTemplateInfoRequest, ShowThirdTemplateInfoResponse>(request,
            DwrMeta.showThirdTemplateInfo, hcClient);
    }

    /**
     * 本接口用于查询指定工作流实例详细
     *
     * 本接口用于查询指定工作流实例详细。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWorkflowInstanceRequest 请求对象
     * @return ShowWorkflowInstanceResponse
     */
    public ShowWorkflowInstanceResponse showWorkflowInstance(ShowWorkflowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showWorkflowInstance);
    }

    /**
     * 本接口用于查询指定工作流实例详细
     *
     * 本接口用于查询指定工作流实例详细。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWorkflowInstanceRequest 请求对象
     * @return SyncInvoker<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse>
     */
    public SyncInvoker<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse> showWorkflowInstanceInvoker(
        ShowWorkflowInstanceRequest request) {
        return new SyncInvoker<ShowWorkflowInstanceRequest, ShowWorkflowInstanceResponse>(request,
            DwrMeta.showWorkflowInstance, hcClient);
    }

    /**
     * 更新第三方算子模板
     *
     * 本接口用于修改第三方算子和将三方算子提交审核
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMyActionTemplateRequest 请求对象
     * @return UpdateMyActionTemplateResponse
     */
    public UpdateMyActionTemplateResponse updateMyActionTemplate(UpdateMyActionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.updateMyActionTemplate);
    }

    /**
     * 更新第三方算子模板
     *
     * 本接口用于修改第三方算子和将三方算子提交审核
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMyActionTemplateRequest 请求对象
     * @return SyncInvoker<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse>
     */
    public SyncInvoker<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse> updateMyActionTemplateInvoker(
        UpdateMyActionTemplateRequest request) {
        return new SyncInvoker<UpdateMyActionTemplateRequest, UpdateMyActionTemplateResponse>(request,
            DwrMeta.updateMyActionTemplate, hcClient);
    }

    /**
     * 禁用第三方算子模板
     *
     * 本接口用于申请禁用第三方算子。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMyActionTemplateToDeprecatedRequest 请求对象
     * @return UpdateMyActionTemplateToDeprecatedResponse
     */
    public UpdateMyActionTemplateToDeprecatedResponse updateMyActionTemplateToDeprecated(
        UpdateMyActionTemplateToDeprecatedRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.updateMyActionTemplateToDeprecated);
    }

    /**
     * 禁用第三方算子模板
     *
     * 本接口用于申请禁用第三方算子。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMyActionTemplateToDeprecatedRequest 请求对象
     * @return SyncInvoker<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse>
     */
    public SyncInvoker<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse> updateMyActionTemplateToDeprecatedInvoker(
        UpdateMyActionTemplateToDeprecatedRequest request) {
        return new SyncInvoker<UpdateMyActionTemplateToDeprecatedRequest, UpdateMyActionTemplateToDeprecatedResponse>(
            request, DwrMeta.updateMyActionTemplateToDeprecated, hcClient);
    }

    /**
     * 创建工作流
     *
     * 本接口用于通过Body体直接创建工作流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.createWorkflow);
    }

    /**
     * 创建工作流
     *
     * 本接口用于通过Body体直接创建工作流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowInvoker(
        CreateWorkflowRequest request) {
        return new SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>(request, DwrMeta.createWorkflow,
            hcClient);
    }

    /**
     * 删除工作流
     *
     * 本接口用于删除工作流。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWorkflowRequest 请求对象
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflow(DeleteWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.deleteWorkflow);
    }

    /**
     * 删除工作流
     *
     * 本接口用于删除工作流。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWorkflowRequest 请求对象
     * @return SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>
     */
    public SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse> deleteWorkflowInvoker(
        DeleteWorkflowRequest request) {
        return new SyncInvoker<DeleteWorkflowRequest, DeleteWorkflowResponse>(request, DwrMeta.deleteWorkflow,
            hcClient);
    }

    /**
     * 查询工作流列表
     *
     * 本接口用于查询工作流列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkflowsRequest 请求对象
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflows(ListWorkflowsRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.listWorkflows);
    }

    /**
     * 查询工作流列表
     *
     * 本接口用于查询工作流列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkflowsRequest 请求对象
     * @return SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsInvoker(ListWorkflowsRequest request) {
        return new SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>(request, DwrMeta.listWorkflows, hcClient);
    }

    /**
     * 查询工作流信息
     *
     * 本接口用于根据工作流名称查询工作流详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWorkflowInfoRequest 请求对象
     * @return ShowWorkflowInfoResponse
     */
    public ShowWorkflowInfoResponse showWorkflowInfo(ShowWorkflowInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.showWorkflowInfo);
    }

    /**
     * 查询工作流信息
     *
     * 本接口用于根据工作流名称查询工作流详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWorkflowInfoRequest 请求对象
     * @return SyncInvoker<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse>
     */
    public SyncInvoker<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse> showWorkflowInfoInvoker(
        ShowWorkflowInfoRequest request) {
        return new SyncInvoker<ShowWorkflowInfoRequest, ShowWorkflowInfoResponse>(request, DwrMeta.showWorkflowInfo,
            hcClient);
    }

    /**
     * 更新工作流
     *
     * Update Workflow
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWorkflowRequest 请求对象
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflow(UpdateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, DwrMeta.updateWorkflow);
    }

    /**
     * 更新工作流
     *
     * Update Workflow
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWorkflowRequest 请求对象
     * @return SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>
     */
    public SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse> updateWorkflowInvoker(
        UpdateWorkflowRequest request) {
        return new SyncInvoker<UpdateWorkflowRequest, UpdateWorkflowResponse>(request, DwrMeta.updateWorkflow,
            hcClient);
    }

}
