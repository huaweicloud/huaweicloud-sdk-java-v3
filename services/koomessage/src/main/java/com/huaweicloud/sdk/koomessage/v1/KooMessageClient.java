package com.huaweicloud.sdk.koomessage.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.koomessage.v1.model.AddAimMsgSignatureRequest;
import com.huaweicloud.sdk.koomessage.v1.model.AddAimMsgSignatureResponse;
import com.huaweicloud.sdk.koomessage.v1.model.AddCallBackRequest;
import com.huaweicloud.sdk.koomessage.v1.model.AddCallBackResponse;
import com.huaweicloud.sdk.koomessage.v1.model.AddVmsCallBackRequest;
import com.huaweicloud.sdk.koomessage.v1.model.AddVmsCallBackResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CheckMobileCapabilityRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CheckMobileCapabilityResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimMsgTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimMsgTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimPersonalTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimPersonalTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimSendTaskRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimSendTaskResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreatePubInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreatePubInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateResolveTaskRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateResolveTaskResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateSmsAppRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateSmsAppResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsSendTaskRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsSendTaskResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimMsgSignatureRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimMsgSignatureResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimMsgTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimMsgTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimPersonalTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimPersonalTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeletePortInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeletePortInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteTemplateMaterialRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteTemplateMaterialResponse;
import com.huaweicloud.sdk.koomessage.v1.model.FreezePubRequest;
import com.huaweicloud.sdk.koomessage.v1.model.FreezePubResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimCallbacksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimCallbacksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgAppDetailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgAppDetailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgAppRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgAppResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgSignatureDetailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgSignatureDetailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgSignatureRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgSignatureResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimResolveDetailsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimResolveDetailsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendDetailsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendDetailsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendReportsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendReportsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendTasksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendTasksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplateMaterialsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplateMaterialsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplateReportsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplateReportsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplatesRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplatesResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListMenusRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListMenusResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListPortInfosRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListPortInfosResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListPortalInfosRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListPortalInfosResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListPubInfosRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListPubInfosResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListResolveTasksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListResolveTasksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsCallbacksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsCallbacksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsSendTasksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsSendTasksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsTemplateStatusRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsTemplateStatusResponse;
import com.huaweicloud.sdk.koomessage.v1.model.LockPortRequest;
import com.huaweicloud.sdk.koomessage.v1.model.LockPortResponse;
import com.huaweicloud.sdk.koomessage.v1.model.PushMenuInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.PushMenuInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.PushPortalInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.PushPortalInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.RegisterPortRequest;
import com.huaweicloud.sdk.koomessage.v1.model.RegisterPortResponse;
import com.huaweicloud.sdk.koomessage.v1.model.SendAimBatchDifferentMessagesRequest;
import com.huaweicloud.sdk.koomessage.v1.model.SendAimBatchDifferentMessagesResponse;
import com.huaweicloud.sdk.koomessage.v1.model.SendAimBatchMessagesRequest;
import com.huaweicloud.sdk.koomessage.v1.model.SendAimBatchMessagesResponse;
import com.huaweicloud.sdk.koomessage.v1.model.SetPrimaryVideoThumbnailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.SetPrimaryVideoThumbnailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgSignatureFileInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgSignatureFileInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgTemplateDetailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgTemplateDetailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgTemplateVariableRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgTemplateVariableResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ShowTemplateVideoThumbnailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ShowTemplateVideoThumbnailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UnfreezePubRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UnfreezePubResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UnlockPortRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UnlockPortResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgAppRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgAppResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgSignatureRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgSignatureResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateMenuRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateMenuResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePersonalTemplateStateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePersonalTemplateStateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePortalInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePortalInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePubInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePubInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimMsgSignatureFileRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimMsgSignatureFileResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimTemplateMaterialRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimTemplateMaterialResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UploadMediaRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UploadMediaResponse;

public class KooMessageClient {

    protected HcClient hcClient;

    public KooMessageClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KooMessageClient> newBuilder() {
        ClientBuilder<KooMessageClient> clientBuilder = new ClientBuilder<>(KooMessageClient::new);
        return clientBuilder;
    }

    /**
     * 注册智能信息回执URL
     *
     * 用户根据要求创建回执接口后，可以调用此接口进行注册，注意：此接口仅允许te_admin角色用户调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCallBackRequest 请求对象
     * @return AddCallBackResponse
     */
    public AddCallBackResponse addCallBack(AddCallBackRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.addCallBack);
    }

    /**
     * 注册智能信息回执URL
     *
     * 用户根据要求创建回执接口后，可以调用此接口进行注册，注意：此接口仅允许te_admin角色用户调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCallBackRequest 请求对象
     * @return SyncInvoker<AddCallBackRequest, AddCallBackResponse>
     */
    public SyncInvoker<AddCallBackRequest, AddCallBackResponse> addCallBackInvoker(AddCallBackRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.addCallBack, hcClient);
    }

    /**
     * 查询用户已注册回执接口
     *
     * 用户注册回执接口之后，可以根据此接口查询所有已注册回执接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimCallbacksRequest 请求对象
     * @return ListAimCallbacksResponse
     */
    public ListAimCallbacksResponse listAimCallbacks(ListAimCallbacksRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimCallbacks);
    }

    /**
     * 查询用户已注册回执接口
     *
     * 用户注册回执接口之后，可以根据此接口查询所有已注册回执接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimCallbacksRequest 请求对象
     * @return SyncInvoker<ListAimCallbacksRequest, ListAimCallbacksResponse>
     */
    public SyncInvoker<ListAimCallbacksRequest, ListAimCallbacksResponse> listAimCallbacksInvoker(
        ListAimCallbacksRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimCallbacks, hcClient);
    }

    /**
     * 查询手机号智能信息解析能力
     *
     * 用户在下发智能信息前，通过此接口批量查询对应手机的智能信息解析能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckMobileCapabilityRequest 请求对象
     * @return CheckMobileCapabilityResponse
     */
    public CheckMobileCapabilityResponse checkMobileCapability(CheckMobileCapabilityRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.checkMobileCapability);
    }

    /**
     * 查询手机号智能信息解析能力
     *
     * 用户在下发智能信息前，通过此接口批量查询对应手机的智能信息解析能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckMobileCapabilityRequest 请求对象
     * @return SyncInvoker<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse>
     */
    public SyncInvoker<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> checkMobileCapabilityInvoker(
        CheckMobileCapabilityRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.checkMobileCapability, hcClient);
    }

    /**
     * 生成解析任务
     *
     * 生成解析的短链。一次最多生成100个解析的短链。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResolveTaskRequest 请求对象
     * @return CreateResolveTaskResponse
     */
    public CreateResolveTaskResponse createResolveTask(CreateResolveTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.createResolveTask);
    }

    /**
     * 生成解析任务
     *
     * 生成解析的短链。一次最多生成100个解析的短链。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResolveTaskRequest 请求对象
     * @return SyncInvoker<CreateResolveTaskRequest, CreateResolveTaskResponse>
     */
    public SyncInvoker<CreateResolveTaskRequest, CreateResolveTaskResponse> createResolveTaskInvoker(
        CreateResolveTaskRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.createResolveTask, hcClient);
    }

    /**
     * 查询解析明细
     *
     * 根据用户提供的过滤条件查询个性化解析明细，包括：发送任务ID、发送手机号码等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimResolveDetailsRequest 请求对象
     * @return ListAimResolveDetailsResponse
     */
    public ListAimResolveDetailsResponse listAimResolveDetails(ListAimResolveDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimResolveDetails);
    }

    /**
     * 查询解析明细
     *
     * 根据用户提供的过滤条件查询个性化解析明细，包括：发送任务ID、发送手机号码等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimResolveDetailsRequest 请求对象
     * @return SyncInvoker<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse>
     */
    public SyncInvoker<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> listAimResolveDetailsInvoker(
        ListAimResolveDetailsRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimResolveDetails, hcClient);
    }

    /**
     * 查询解析任务
     *
     * 创建解析任务后，客户可以查询解析任务状态信息。
     * 
     * 通过模板ID等过滤条件，查询解析任务列表。
     * 
     * 如需查询明细，建议使用查询解析明细接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResolveTasksRequest 请求对象
     * @return ListResolveTasksResponse
     */
    public ListResolveTasksResponse listResolveTasks(ListResolveTasksRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listResolveTasks);
    }

    /**
     * 查询解析任务
     *
     * 创建解析任务后，客户可以查询解析任务状态信息。
     * 
     * 通过模板ID等过滤条件，查询解析任务列表。
     * 
     * 如需查询明细，建议使用查询解析明细接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResolveTasksRequest 请求对象
     * @return SyncInvoker<ListResolveTasksRequest, ListResolveTasksResponse>
     */
    public SyncInvoker<ListResolveTasksRequest, ListResolveTasksResponse> listResolveTasksInvoker(
        ListResolveTasksRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listResolveTasks, hcClient);
    }

    /**
     * 查询智能信息服务号菜单
     *
     * 根据用户提供的过滤条件查询服务号菜单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMenusRequest 请求对象
     * @return ListMenusResponse
     */
    public ListMenusResponse listMenus(ListMenusRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listMenus);
    }

    /**
     * 查询智能信息服务号菜单
     *
     * 根据用户提供的过滤条件查询服务号菜单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMenusRequest 请求对象
     * @return SyncInvoker<ListMenusRequest, ListMenusResponse>
     */
    public SyncInvoker<ListMenusRequest, ListMenusResponse> listMenusInvoker(ListMenusRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listMenus, hcClient);
    }

    /**
     * 修改智能信息服务号菜单
     *
     * 
     * 支持用户修改所属企业的指定菜单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMenuRequest 请求对象
     * @return UpdateMenuResponse
     */
    public UpdateMenuResponse updateMenu(UpdateMenuRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.updateMenu);
    }

    /**
     * 修改智能信息服务号菜单
     *
     * 
     * 支持用户修改所属企业的指定菜单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMenuRequest 请求对象
     * @return SyncInvoker<UpdateMenuRequest, UpdateMenuResponse>
     */
    public SyncInvoker<UpdateMenuRequest, UpdateMenuResponse> updateMenuInvoker(UpdateMenuRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.updateMenu, hcClient);
    }

    /**
     * 删除通道号
     *
     * 删除通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePortInfoRequest 请求对象
     * @return DeletePortInfoResponse
     */
    public DeletePortInfoResponse deletePortInfo(DeletePortInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.deletePortInfo);
    }

    /**
     * 删除通道号
     *
     * 删除通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePortInfoRequest 请求对象
     * @return SyncInvoker<DeletePortInfoRequest, DeletePortInfoResponse>
     */
    public SyncInvoker<DeletePortInfoRequest, DeletePortInfoResponse> deletePortInfoInvoker(
        DeletePortInfoRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.deletePortInfo, hcClient);
    }

    /**
     * 查询通道号列表
     *
     * 支持查询通道号列表和通道号绑定信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortInfosRequest 请求对象
     * @return ListPortInfosResponse
     */
    public ListPortInfosResponse listPortInfos(ListPortInfosRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listPortInfos);
    }

    /**
     * 查询通道号列表
     *
     * 支持查询通道号列表和通道号绑定信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortInfosRequest 请求对象
     * @return SyncInvoker<ListPortInfosRequest, ListPortInfosResponse>
     */
    public SyncInvoker<ListPortInfosRequest, ListPortInfosResponse> listPortInfosInvoker(ListPortInfosRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listPortInfos, hcClient);
    }

    /**
     * 通道号绑定服务号
     *
     * 通道号绑定服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockPortRequest 请求对象
     * @return LockPortResponse
     */
    public LockPortResponse lockPort(LockPortRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.lockPort);
    }

    /**
     * 通道号绑定服务号
     *
     * 通道号绑定服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockPortRequest 请求对象
     * @return SyncInvoker<LockPortRequest, LockPortResponse>
     */
    public SyncInvoker<LockPortRequest, LockPortResponse> lockPortInvoker(LockPortRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.lockPort, hcClient);
    }

    /**
     * 注册通道号
     *
     * 注册通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterPortRequest 请求对象
     * @return RegisterPortResponse
     */
    public RegisterPortResponse registerPort(RegisterPortRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.registerPort);
    }

    /**
     * 注册通道号
     *
     * 注册通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterPortRequest 请求对象
     * @return SyncInvoker<RegisterPortRequest, RegisterPortResponse>
     */
    public SyncInvoker<RegisterPortRequest, RegisterPortResponse> registerPortInvoker(RegisterPortRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.registerPort, hcClient);
    }

    /**
     * 通道号解绑服务号
     *
     * 通道号解绑服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockPortRequest 请求对象
     * @return UnlockPortResponse
     */
    public UnlockPortResponse unlockPort(UnlockPortRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.unlockPort);
    }

    /**
     * 通道号解绑服务号
     *
     * 通道号解绑服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockPortRequest 请求对象
     * @return SyncInvoker<UnlockPortRequest, UnlockPortResponse>
     */
    public SyncInvoker<UnlockPortRequest, UnlockPortResponse> unlockPortInvoker(UnlockPortRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.unlockPort, hcClient);
    }

    /**
     * 查询主页列表
     *
     * 
     * 根据用户提供的过滤条件查找用户管理的主页列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortalInfosRequest 请求对象
     * @return ListPortalInfosResponse
     */
    public ListPortalInfosResponse listPortalInfos(ListPortalInfosRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listPortalInfos);
    }

    /**
     * 查询主页列表
     *
     * 
     * 根据用户提供的过滤条件查找用户管理的主页列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortalInfosRequest 请求对象
     * @return SyncInvoker<ListPortalInfosRequest, ListPortalInfosResponse>
     */
    public SyncInvoker<ListPortalInfosRequest, ListPortalInfosResponse> listPortalInfosInvoker(
        ListPortalInfosRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listPortalInfos, hcClient);
    }

    /**
     * 修改主页信息
     *
     * 
     * 用户对已创建的主页进行信息的修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePortalInfoRequest 请求对象
     * @return UpdatePortalInfoResponse
     */
    public UpdatePortalInfoResponse updatePortalInfo(UpdatePortalInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.updatePortalInfo);
    }

    /**
     * 修改主页信息
     *
     * 
     * 用户对已创建的主页进行信息的修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePortalInfoRequest 请求对象
     * @return SyncInvoker<UpdatePortalInfoRequest, UpdatePortalInfoResponse>
     */
    public SyncInvoker<UpdatePortalInfoRequest, UpdatePortalInfoResponse> updatePortalInfoInvoker(
        UpdatePortalInfoRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.updatePortalInfo, hcClient);
    }

    /**
     * 冻结服务号
     *
     * 支持用户通过此接口冻结服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request FreezePubRequest 请求对象
     * @return FreezePubResponse
     */
    public FreezePubResponse freezePub(FreezePubRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.freezePub);
    }

    /**
     * 冻结服务号
     *
     * 支持用户通过此接口冻结服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request FreezePubRequest 请求对象
     * @return SyncInvoker<FreezePubRequest, FreezePubResponse>
     */
    public SyncInvoker<FreezePubRequest, FreezePubResponse> freezePubInvoker(FreezePubRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.freezePub, hcClient);
    }

    /**
     * 查询服务号列表
     *
     * 
     * 支持根据用户提供的过滤条件查询服务号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPubInfosRequest 请求对象
     * @return ListPubInfosResponse
     */
    public ListPubInfosResponse listPubInfos(ListPubInfosRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listPubInfos);
    }

    /**
     * 查询服务号列表
     *
     * 
     * 支持根据用户提供的过滤条件查询服务号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPubInfosRequest 请求对象
     * @return SyncInvoker<ListPubInfosRequest, ListPubInfosResponse>
     */
    public SyncInvoker<ListPubInfosRequest, ListPubInfosResponse> listPubInfosInvoker(ListPubInfosRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listPubInfos, hcClient);
    }

    /**
     * 解冻服务号
     *
     * 服务号解结，冻结服务号。需审核，审核通过生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnfreezePubRequest 请求对象
     * @return UnfreezePubResponse
     */
    public UnfreezePubResponse unfreezePub(UnfreezePubRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.unfreezePub);
    }

    /**
     * 解冻服务号
     *
     * 服务号解结，冻结服务号。需审核，审核通过生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnfreezePubRequest 请求对象
     * @return SyncInvoker<UnfreezePubRequest, UnfreezePubResponse>
     */
    public SyncInvoker<UnfreezePubRequest, UnfreezePubResponse> unfreezePubInvoker(UnfreezePubRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.unfreezePub, hcClient);
    }

    /**
     * 更新服务号信息
     *
     * 支持用户更新服务号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePubInfoRequest 请求对象
     * @return UpdatePubInfoResponse
     */
    public UpdatePubInfoResponse updatePubInfo(UpdatePubInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.updatePubInfo);
    }

    /**
     * 更新服务号信息
     *
     * 支持用户更新服务号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePubInfoRequest 请求对象
     * @return SyncInvoker<UpdatePubInfoRequest, UpdatePubInfoResponse>
     */
    public SyncInvoker<UpdatePubInfoRequest, UpdatePubInfoResponse> updatePubInfoInvoker(UpdatePubInfoRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.updatePubInfo, hcClient);
    }

    /**
     * 一站式服务号创建
     *
     * 一站式服务号创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePubInfoRequest 请求对象
     * @return CreatePubInfoResponse
     */
    public CreatePubInfoResponse createPubInfo(CreatePubInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.createPubInfo);
    }

    /**
     * 一站式服务号创建
     *
     * 一站式服务号创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePubInfoRequest 请求对象
     * @return SyncInvoker<CreatePubInfoRequest, CreatePubInfoResponse>
     */
    public SyncInvoker<CreatePubInfoRequest, CreatePubInfoResponse> createPubInfoInvoker(CreatePubInfoRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.createPubInfo, hcClient);
    }

    /**
     * 催审菜单
     *
     * 支持用户通过此接口根据菜单ID催审。菜单需要在与其关联的服务号审核通过之后才能催审。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushMenuInfoRequest 请求对象
     * @return PushMenuInfoResponse
     */
    public PushMenuInfoResponse pushMenuInfo(PushMenuInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.pushMenuInfo);
    }

    /**
     * 催审菜单
     *
     * 支持用户通过此接口根据菜单ID催审。菜单需要在与其关联的服务号审核通过之后才能催审。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushMenuInfoRequest 请求对象
     * @return SyncInvoker<PushMenuInfoRequest, PushMenuInfoResponse>
     */
    public SyncInvoker<PushMenuInfoRequest, PushMenuInfoResponse> pushMenuInfoInvoker(PushMenuInfoRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.pushMenuInfo, hcClient);
    }

    /**
     * 催审主页
     *
     * 支持用户通过此接口根据主页ID催审。主页需要在与其关联的服务号审核通过之后才能催审。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushPortalInfoRequest 请求对象
     * @return PushPortalInfoResponse
     */
    public PushPortalInfoResponse pushPortalInfo(PushPortalInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.pushPortalInfo);
    }

    /**
     * 催审主页
     *
     * 支持用户通过此接口根据主页ID催审。主页需要在与其关联的服务号审核通过之后才能催审。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushPortalInfoRequest 请求对象
     * @return SyncInvoker<PushPortalInfoRequest, PushPortalInfoResponse>
     */
    public SyncInvoker<PushPortalInfoRequest, PushPortalInfoResponse> pushPortalInfoInvoker(
        PushPortalInfoRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.pushPortalInfo, hcClient);
    }

    /**
     * 上传智能信息服务号图片资源
     *
     * 支持用户上传图片资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadMediaRequest 请求对象
     * @return UploadMediaResponse
     */
    public UploadMediaResponse uploadMedia(UploadMediaRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.uploadMedia);
    }

    /**
     * 上传智能信息服务号图片资源
     *
     * 支持用户上传图片资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadMediaRequest 请求对象
     * @return SyncInvoker<UploadMediaRequest, UploadMediaResponse>
     */
    public SyncInvoker<UploadMediaRequest, UploadMediaResponse> uploadMediaInvoker(UploadMediaRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.uploadMedia, hcClient);
    }

    /**
     * 发送智能信息
     *
     * 根据客户的参数发送任务名称、智能信息模板ID等进行智能信息发送。一次最多发送100个智能信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAimSendTaskRequest 请求对象
     * @return CreateAimSendTaskResponse
     */
    public CreateAimSendTaskResponse createAimSendTask(CreateAimSendTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.createAimSendTask);
    }

    /**
     * 发送智能信息
     *
     * 根据客户的参数发送任务名称、智能信息模板ID等进行智能信息发送。一次最多发送100个智能信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAimSendTaskRequest 请求对象
     * @return SyncInvoker<CreateAimSendTaskRequest, CreateAimSendTaskResponse>
     */
    public SyncInvoker<CreateAimSendTaskRequest, CreateAimSendTaskResponse> createAimSendTaskInvoker(
        CreateAimSendTaskRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.createAimSendTask, hcClient);
    }

    /**
     * 查询智能信息发送明细
     *
     * 根据用户提供的过滤条件查询发送明细列表，包括：发送任务ID、发送手机号码等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimSendDetailsRequest 请求对象
     * @return ListAimSendDetailsResponse
     */
    public ListAimSendDetailsResponse listAimSendDetails(ListAimSendDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimSendDetails);
    }

    /**
     * 查询智能信息发送明细
     *
     * 根据用户提供的过滤条件查询发送明细列表，包括：发送任务ID、发送手机号码等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimSendDetailsRequest 请求对象
     * @return SyncInvoker<ListAimSendDetailsRequest, ListAimSendDetailsResponse>
     */
    public SyncInvoker<ListAimSendDetailsRequest, ListAimSendDetailsResponse> listAimSendDetailsInvoker(
        ListAimSendDetailsRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimSendDetails, hcClient);
    }

    /**
     * 查询智能信息发送报表
     *
     * 查询智能信息发送报表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimSendReportsRequest 请求对象
     * @return ListAimSendReportsResponse
     */
    public ListAimSendReportsResponse listAimSendReports(ListAimSendReportsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimSendReports);
    }

    /**
     * 查询智能信息发送报表
     *
     * 查询智能信息发送报表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimSendReportsRequest 请求对象
     * @return SyncInvoker<ListAimSendReportsRequest, ListAimSendReportsResponse>
     */
    public SyncInvoker<ListAimSendReportsRequest, ListAimSendReportsResponse> listAimSendReportsInvoker(
        ListAimSendReportsRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimSendReports, hcClient);
    }

    /**
     * 查询智能信息发送任务
     *
     * 
     * 根据用户提供的过滤条件查询智能信息发送任务列表，包括：发送任务名称、智能信息模板ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimSendTasksRequest 请求对象
     * @return ListAimSendTasksResponse
     */
    public ListAimSendTasksResponse listAimSendTasks(ListAimSendTasksRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimSendTasks);
    }

    /**
     * 查询智能信息发送任务
     *
     * 
     * 根据用户提供的过滤条件查询智能信息发送任务列表，包括：发送任务名称、智能信息模板ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimSendTasksRequest 请求对象
     * @return SyncInvoker<ListAimSendTasksRequest, ListAimSendTasksResponse>
     */
    public SyncInvoker<ListAimSendTasksRequest, ListAimSendTasksResponse> listAimSendTasksInvoker(
        ListAimSendTasksRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimSendTasks, hcClient);
    }

    /**
     * 创建短信应用
     *
     * 该接口用于用户创建短信应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmsAppRequest 请求对象
     * @return CreateSmsAppResponse
     */
    public CreateSmsAppResponse createSmsApp(CreateSmsAppRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.createSmsApp);
    }

    /**
     * 创建短信应用
     *
     * 该接口用于用户创建短信应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmsAppRequest 请求对象
     * @return SyncInvoker<CreateSmsAppRequest, CreateSmsAppResponse>
     */
    public SyncInvoker<CreateSmsAppRequest, CreateSmsAppResponse> createSmsAppInvoker(CreateSmsAppRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.createSmsApp, hcClient);
    }

    /**
     * 查询短信应用
     *
     * 该接口用于用户查询已创建的短信应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgAppRequest 请求对象
     * @return ListAimMsgAppResponse
     */
    public ListAimMsgAppResponse listAimMsgApp(ListAimMsgAppRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimMsgApp);
    }

    /**
     * 查询短信应用
     *
     * 该接口用于用户查询已创建的短信应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgAppRequest 请求对象
     * @return SyncInvoker<ListAimMsgAppRequest, ListAimMsgAppResponse>
     */
    public SyncInvoker<ListAimMsgAppRequest, ListAimMsgAppResponse> listAimMsgAppInvoker(ListAimMsgAppRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimMsgApp, hcClient);
    }

    /**
     * 获取短信应用详情
     *
     * 该接口用于用户获取已创建的短信应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgAppDetailRequest 请求对象
     * @return ListAimMsgAppDetailResponse
     */
    public ListAimMsgAppDetailResponse listAimMsgAppDetail(ListAimMsgAppDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimMsgAppDetail);
    }

    /**
     * 获取短信应用详情
     *
     * 该接口用于用户获取已创建的短信应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgAppDetailRequest 请求对象
     * @return SyncInvoker<ListAimMsgAppDetailRequest, ListAimMsgAppDetailResponse>
     */
    public SyncInvoker<ListAimMsgAppDetailRequest, ListAimMsgAppDetailResponse> listAimMsgAppDetailInvoker(
        ListAimMsgAppDetailRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimMsgAppDetail, hcClient);
    }

    /**
     * 修改短信应用
     *
     * 该接口用于用户修改短信应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAimMsgAppRequest 请求对象
     * @return UpdateAimMsgAppResponse
     */
    public UpdateAimMsgAppResponse updateAimMsgApp(UpdateAimMsgAppRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.updateAimMsgApp);
    }

    /**
     * 修改短信应用
     *
     * 该接口用于用户修改短信应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAimMsgAppRequest 请求对象
     * @return SyncInvoker<UpdateAimMsgAppRequest, UpdateAimMsgAppResponse>
     */
    public SyncInvoker<UpdateAimMsgAppRequest, UpdateAimMsgAppResponse> updateAimMsgAppInvoker(
        UpdateAimMsgAppRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.updateAimMsgApp, hcClient);
    }

    /**
     * 发送分批短信
     *
     * 该接口用于向不同用户发送不同内容的短信。
     * 
     * - 前提条件
     * 
     * 1. 已创建短信应用。
     * 2. 已申请短信签名，获取签名通道号。
     * 3. 已申请短信模板，获取模板ID。
     * 
     * - 注意事项
     * 
     * 单条短信最多允许携带500个号码，每个号码最大长度为21位。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAimBatchDifferentMessagesRequest 请求对象
     * @return SendAimBatchDifferentMessagesResponse
     */
    public SendAimBatchDifferentMessagesResponse sendAimBatchDifferentMessages(
        SendAimBatchDifferentMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.sendAimBatchDifferentMessages);
    }

    /**
     * 发送分批短信
     *
     * 该接口用于向不同用户发送不同内容的短信。
     * 
     * - 前提条件
     * 
     * 1. 已创建短信应用。
     * 2. 已申请短信签名，获取签名通道号。
     * 3. 已申请短信模板，获取模板ID。
     * 
     * - 注意事项
     * 
     * 单条短信最多允许携带500个号码，每个号码最大长度为21位。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAimBatchDifferentMessagesRequest 请求对象
     * @return SyncInvoker<SendAimBatchDifferentMessagesRequest, SendAimBatchDifferentMessagesResponse>
     */
    public SyncInvoker<SendAimBatchDifferentMessagesRequest, SendAimBatchDifferentMessagesResponse> sendAimBatchDifferentMessagesInvoker(
        SendAimBatchDifferentMessagesRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.sendAimBatchDifferentMessages, hcClient);
    }

    /**
     * 发送短信
     *
     * 向单个或多个用户发送相同内容的短信。
     * 
     * - 前提条件
     * 
     * 1. 已创建短信应用。
     * 2. 已申请短信签名，获取签名通道号。
     * 3. 已申请短信模板，获取模板ID。
     * 
     * - 注意事项
     * 
     * 最多允许携带500个号码，每个号码最大长度为21位。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAimBatchMessagesRequest 请求对象
     * @return SendAimBatchMessagesResponse
     */
    public SendAimBatchMessagesResponse sendAimBatchMessages(SendAimBatchMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.sendAimBatchMessages);
    }

    /**
     * 发送短信
     *
     * 向单个或多个用户发送相同内容的短信。
     * 
     * - 前提条件
     * 
     * 1. 已创建短信应用。
     * 2. 已申请短信签名，获取签名通道号。
     * 3. 已申请短信模板，获取模板ID。
     * 
     * - 注意事项
     * 
     * 最多允许携带500个号码，每个号码最大长度为21位。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAimBatchMessagesRequest 请求对象
     * @return SyncInvoker<SendAimBatchMessagesRequest, SendAimBatchMessagesResponse>
     */
    public SyncInvoker<SendAimBatchMessagesRequest, SendAimBatchMessagesResponse> sendAimBatchMessagesInvoker(
        SendAimBatchMessagesRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.sendAimBatchMessages, hcClient);
    }

    /**
     * 创建短信签名
     *
     * 该接口用于用户创建短信签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAimMsgSignatureRequest 请求对象
     * @return AddAimMsgSignatureResponse
     */
    public AddAimMsgSignatureResponse addAimMsgSignature(AddAimMsgSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.addAimMsgSignature);
    }

    /**
     * 创建短信签名
     *
     * 该接口用于用户创建短信签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAimMsgSignatureRequest 请求对象
     * @return SyncInvoker<AddAimMsgSignatureRequest, AddAimMsgSignatureResponse>
     */
    public SyncInvoker<AddAimMsgSignatureRequest, AddAimMsgSignatureResponse> addAimMsgSignatureInvoker(
        AddAimMsgSignatureRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.addAimMsgSignature, hcClient);
    }

    /**
     * 删除短信签名
     *
     * 该接口用于用户删除已创建的短信签名。删除已审核通过的签名，会同步删除该签名对应的通道号和该签名下的所有短信模板，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAimMsgSignatureRequest 请求对象
     * @return DeleteAimMsgSignatureResponse
     */
    public DeleteAimMsgSignatureResponse deleteAimMsgSignature(DeleteAimMsgSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.deleteAimMsgSignature);
    }

    /**
     * 删除短信签名
     *
     * 该接口用于用户删除已创建的短信签名。删除已审核通过的签名，会同步删除该签名对应的通道号和该签名下的所有短信模板，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAimMsgSignatureRequest 请求对象
     * @return SyncInvoker<DeleteAimMsgSignatureRequest, DeleteAimMsgSignatureResponse>
     */
    public SyncInvoker<DeleteAimMsgSignatureRequest, DeleteAimMsgSignatureResponse> deleteAimMsgSignatureInvoker(
        DeleteAimMsgSignatureRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.deleteAimMsgSignature, hcClient);
    }

    /**
     * 查询短信签名
     *
     * 该接口用于用户查询已创建的短信签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgSignatureRequest 请求对象
     * @return ListAimMsgSignatureResponse
     */
    public ListAimMsgSignatureResponse listAimMsgSignature(ListAimMsgSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimMsgSignature);
    }

    /**
     * 查询短信签名
     *
     * 该接口用于用户查询已创建的短信签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgSignatureRequest 请求对象
     * @return SyncInvoker<ListAimMsgSignatureRequest, ListAimMsgSignatureResponse>
     */
    public SyncInvoker<ListAimMsgSignatureRequest, ListAimMsgSignatureResponse> listAimMsgSignatureInvoker(
        ListAimMsgSignatureRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimMsgSignature, hcClient);
    }

    /**
     * 获取短信签名详情
     *
     * 该接口用于用户获取已创建的短信签名详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgSignatureDetailRequest 请求对象
     * @return ListAimMsgSignatureDetailResponse
     */
    public ListAimMsgSignatureDetailResponse listAimMsgSignatureDetail(ListAimMsgSignatureDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimMsgSignatureDetail);
    }

    /**
     * 获取短信签名详情
     *
     * 该接口用于用户获取已创建的短信签名详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgSignatureDetailRequest 请求对象
     * @return SyncInvoker<ListAimMsgSignatureDetailRequest, ListAimMsgSignatureDetailResponse>
     */
    public SyncInvoker<ListAimMsgSignatureDetailRequest, ListAimMsgSignatureDetailResponse> listAimMsgSignatureDetailInvoker(
        ListAimMsgSignatureDetailRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimMsgSignatureDetail, hcClient);
    }

    /**
     * 查询申请文件
     *
     * 该接口用于用户查询创建短信签名时上传的营业执照/授权委托书文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAimMsgSignatureFileInfoRequest 请求对象
     * @return ShowAimMsgSignatureFileInfoResponse
     */
    public ShowAimMsgSignatureFileInfoResponse showAimMsgSignatureFileInfo(ShowAimMsgSignatureFileInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.showAimMsgSignatureFileInfo);
    }

    /**
     * 查询申请文件
     *
     * 该接口用于用户查询创建短信签名时上传的营业执照/授权委托书文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAimMsgSignatureFileInfoRequest 请求对象
     * @return SyncInvoker<ShowAimMsgSignatureFileInfoRequest, ShowAimMsgSignatureFileInfoResponse>
     */
    public SyncInvoker<ShowAimMsgSignatureFileInfoRequest, ShowAimMsgSignatureFileInfoResponse> showAimMsgSignatureFileInfoInvoker(
        ShowAimMsgSignatureFileInfoRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.showAimMsgSignatureFileInfo, hcClient);
    }

    /**
     * 修改短信签名
     *
     * 该接口用于用户更新短信签名信息，目前仅支持审核不通过的短信签名重新修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAimMsgSignatureRequest 请求对象
     * @return UpdateAimMsgSignatureResponse
     */
    public UpdateAimMsgSignatureResponse updateAimMsgSignature(UpdateAimMsgSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.updateAimMsgSignature);
    }

    /**
     * 修改短信签名
     *
     * 该接口用于用户更新短信签名信息，目前仅支持审核不通过的短信签名重新修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAimMsgSignatureRequest 请求对象
     * @return SyncInvoker<UpdateAimMsgSignatureRequest, UpdateAimMsgSignatureResponse>
     */
    public SyncInvoker<UpdateAimMsgSignatureRequest, UpdateAimMsgSignatureResponse> updateAimMsgSignatureInvoker(
        UpdateAimMsgSignatureRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.updateAimMsgSignature, hcClient);
    }

    /**
     * 上传申请文件
     *
     * 该接口用于用户上传创建短信签名所需的营业执照/授权委托书文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAimMsgSignatureFileRequest 请求对象
     * @return UploadAimMsgSignatureFileResponse
     */
    public UploadAimMsgSignatureFileResponse uploadAimMsgSignatureFile(UploadAimMsgSignatureFileRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.uploadAimMsgSignatureFile);
    }

    /**
     * 上传申请文件
     *
     * 该接口用于用户上传创建短信签名所需的营业执照/授权委托书文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAimMsgSignatureFileRequest 请求对象
     * @return SyncInvoker<UploadAimMsgSignatureFileRequest, UploadAimMsgSignatureFileResponse>
     */
    public SyncInvoker<UploadAimMsgSignatureFileRequest, UploadAimMsgSignatureFileResponse> uploadAimMsgSignatureFileInvoker(
        UploadAimMsgSignatureFileRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.uploadAimMsgSignatureFile, hcClient);
    }

    /**
     * 创建短信模板
     *
     * 该接口用于用户创建短信模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAimMsgTemplateRequest 请求对象
     * @return CreateAimMsgTemplateResponse
     */
    public CreateAimMsgTemplateResponse createAimMsgTemplate(CreateAimMsgTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.createAimMsgTemplate);
    }

    /**
     * 创建短信模板
     *
     * 该接口用于用户创建短信模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAimMsgTemplateRequest 请求对象
     * @return SyncInvoker<CreateAimMsgTemplateRequest, CreateAimMsgTemplateResponse>
     */
    public SyncInvoker<CreateAimMsgTemplateRequest, CreateAimMsgTemplateResponse> createAimMsgTemplateInvoker(
        CreateAimMsgTemplateRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.createAimMsgTemplate, hcClient);
    }

    /**
     * 删除短信模板
     *
     * 该接口用于用户删除已创建的短信模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAimMsgTemplateRequest 请求对象
     * @return DeleteAimMsgTemplateResponse
     */
    public DeleteAimMsgTemplateResponse deleteAimMsgTemplate(DeleteAimMsgTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.deleteAimMsgTemplate);
    }

    /**
     * 删除短信模板
     *
     * 该接口用于用户删除已创建的短信模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAimMsgTemplateRequest 请求对象
     * @return SyncInvoker<DeleteAimMsgTemplateRequest, DeleteAimMsgTemplateResponse>
     */
    public SyncInvoker<DeleteAimMsgTemplateRequest, DeleteAimMsgTemplateResponse> deleteAimMsgTemplateInvoker(
        DeleteAimMsgTemplateRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.deleteAimMsgTemplate, hcClient);
    }

    /**
     * 查询短信模板
     *
     * 该接口用于用户查询已创建的短信模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgTemplateRequest 请求对象
     * @return ListAimMsgTemplateResponse
     */
    public ListAimMsgTemplateResponse listAimMsgTemplate(ListAimMsgTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimMsgTemplate);
    }

    /**
     * 查询短信模板
     *
     * 该接口用于用户查询已创建的短信模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimMsgTemplateRequest 请求对象
     * @return SyncInvoker<ListAimMsgTemplateRequest, ListAimMsgTemplateResponse>
     */
    public SyncInvoker<ListAimMsgTemplateRequest, ListAimMsgTemplateResponse> listAimMsgTemplateInvoker(
        ListAimMsgTemplateRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimMsgTemplate, hcClient);
    }

    /**
     * 获取短信模板详情
     *
     * 该接口用于用户获取已创建的短信模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAimMsgTemplateDetailRequest 请求对象
     * @return ShowAimMsgTemplateDetailResponse
     */
    public ShowAimMsgTemplateDetailResponse showAimMsgTemplateDetail(ShowAimMsgTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.showAimMsgTemplateDetail);
    }

    /**
     * 获取短信模板详情
     *
     * 该接口用于用户获取已创建的短信模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAimMsgTemplateDetailRequest 请求对象
     * @return SyncInvoker<ShowAimMsgTemplateDetailRequest, ShowAimMsgTemplateDetailResponse>
     */
    public SyncInvoker<ShowAimMsgTemplateDetailRequest, ShowAimMsgTemplateDetailResponse> showAimMsgTemplateDetailInvoker(
        ShowAimMsgTemplateDetailRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.showAimMsgTemplateDetail, hcClient);
    }

    /**
     * 查询短信模板变量
     *
     * 该接口用于用户查询短信模板变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAimMsgTemplateVariableRequest 请求对象
     * @return ShowAimMsgTemplateVariableResponse
     */
    public ShowAimMsgTemplateVariableResponse showAimMsgTemplateVariable(ShowAimMsgTemplateVariableRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.showAimMsgTemplateVariable);
    }

    /**
     * 查询短信模板变量
     *
     * 该接口用于用户查询短信模板变量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAimMsgTemplateVariableRequest 请求对象
     * @return SyncInvoker<ShowAimMsgTemplateVariableRequest, ShowAimMsgTemplateVariableResponse>
     */
    public SyncInvoker<ShowAimMsgTemplateVariableRequest, ShowAimMsgTemplateVariableResponse> showAimMsgTemplateVariableInvoker(
        ShowAimMsgTemplateVariableRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.showAimMsgTemplateVariable, hcClient);
    }

    /**
     * 修改短信模板
     *
     * 该接口用于用户修改短信模板信息，目前仅支持审核不通过的短信模板重新修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAimMsgTemplateRequest 请求对象
     * @return UpdateAimMsgTemplateResponse
     */
    public UpdateAimMsgTemplateResponse updateAimMsgTemplate(UpdateAimMsgTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.updateAimMsgTemplate);
    }

    /**
     * 修改短信模板
     *
     * 该接口用于用户修改短信模板信息，目前仅支持审核不通过的短信模板重新修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAimMsgTemplateRequest 请求对象
     * @return SyncInvoker<UpdateAimMsgTemplateRequest, UpdateAimMsgTemplateResponse>
     */
    public SyncInvoker<UpdateAimMsgTemplateRequest, UpdateAimMsgTemplateResponse> updateAimMsgTemplateInvoker(
        UpdateAimMsgTemplateRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.updateAimMsgTemplate, hcClient);
    }

    /**
     * 创建个人模板
     *
     * 用于用户创建个人模板。
     * 
     * &gt; 请求中所有字符串不允许携带“&lt;”、“&gt;”、“\\&amp;amp;amp;”或多个空格。
     * &gt; 模板内容需加“拒收请回复R”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAimPersonalTemplateRequest 请求对象
     * @return CreateAimPersonalTemplateResponse
     */
    public CreateAimPersonalTemplateResponse createAimPersonalTemplate(CreateAimPersonalTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.createAimPersonalTemplate);
    }

    /**
     * 创建个人模板
     *
     * 用于用户创建个人模板。
     * 
     * &gt; 请求中所有字符串不允许携带“&lt;”、“&gt;”、“\\&amp;amp;amp;”或多个空格。
     * &gt; 模板内容需加“拒收请回复R”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAimPersonalTemplateRequest 请求对象
     * @return SyncInvoker<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse>
     */
    public SyncInvoker<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> createAimPersonalTemplateInvoker(
        CreateAimPersonalTemplateRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.createAimPersonalTemplate, hcClient);
    }

    /**
     * 删除模板实例
     *
     * 根据用户提供的模板ID，删除智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAimPersonalTemplateRequest 请求对象
     * @return DeleteAimPersonalTemplateResponse
     */
    public DeleteAimPersonalTemplateResponse deleteAimPersonalTemplate(DeleteAimPersonalTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.deleteAimPersonalTemplate);
    }

    /**
     * 删除模板实例
     *
     * 根据用户提供的模板ID，删除智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAimPersonalTemplateRequest 请求对象
     * @return SyncInvoker<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse>
     */
    public SyncInvoker<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> deleteAimPersonalTemplateInvoker(
        DeleteAimPersonalTemplateRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.deleteAimPersonalTemplate, hcClient);
    }

    /**
     * 删除模板素材
     *
     * 根据用户提供的模板ID，删除模板素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateMaterialRequest 请求对象
     * @return DeleteTemplateMaterialResponse
     */
    public DeleteTemplateMaterialResponse deleteTemplateMaterial(DeleteTemplateMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.deleteTemplateMaterial);
    }

    /**
     * 删除模板素材
     *
     * 根据用户提供的模板ID，删除模板素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateMaterialRequest 请求对象
     * @return SyncInvoker<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse>
     */
    public SyncInvoker<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> deleteTemplateMaterialInvoker(
        DeleteTemplateMaterialRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.deleteTemplateMaterial, hcClient);
    }

    /**
     * 查询智能消息模板素材列表
     *
     * 根据用户提供的过滤条件，查询模板素材列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimTemplateMaterialsRequest 请求对象
     * @return ListAimTemplateMaterialsResponse
     */
    public ListAimTemplateMaterialsResponse listAimTemplateMaterials(ListAimTemplateMaterialsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimTemplateMaterials);
    }

    /**
     * 查询智能消息模板素材列表
     *
     * 根据用户提供的过滤条件，查询模板素材列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimTemplateMaterialsRequest 请求对象
     * @return SyncInvoker<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse>
     */
    public SyncInvoker<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> listAimTemplateMaterialsInvoker(
        ListAimTemplateMaterialsRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimTemplateMaterials, hcClient);
    }

    /**
     * 查询模板报表
     *
     * 根据用户指定过滤条件查询指定智能信息模板的解析次数。当日数据需要次日16:00之后才能查询到。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimTemplateReportsRequest 请求对象
     * @return ListAimTemplateReportsResponse
     */
    public ListAimTemplateReportsResponse listAimTemplateReports(ListAimTemplateReportsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimTemplateReports);
    }

    /**
     * 查询模板报表
     *
     * 根据用户指定过滤条件查询指定智能信息模板的解析次数。当日数据需要次日16:00之后才能查询到。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimTemplateReportsRequest 请求对象
     * @return SyncInvoker<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse>
     */
    public SyncInvoker<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> listAimTemplateReportsInvoker(
        ListAimTemplateReportsRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimTemplateReports, hcClient);
    }

    /**
     * 查询模板
     *
     * 
     * 根据客户提供的过滤条件查询智能信息模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimTemplatesRequest 请求对象
     * @return ListAimTemplatesResponse
     */
    public ListAimTemplatesResponse listAimTemplates(ListAimTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimTemplates);
    }

    /**
     * 查询模板
     *
     * 
     * 根据客户提供的过滤条件查询智能信息模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAimTemplatesRequest 请求对象
     * @return SyncInvoker<ListAimTemplatesRequest, ListAimTemplatesResponse>
     */
    public SyncInvoker<ListAimTemplatesRequest, ListAimTemplatesResponse> listAimTemplatesInvoker(
        ListAimTemplatesRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listAimTemplates, hcClient);
    }

    /**
     * 设置视频模板封面图
     *
     * 根据用户提供的视频封面图资源ID和AIM视频资源ID设置视频模板的封面图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetPrimaryVideoThumbnailRequest 请求对象
     * @return SetPrimaryVideoThumbnailResponse
     */
    public SetPrimaryVideoThumbnailResponse setPrimaryVideoThumbnail(SetPrimaryVideoThumbnailRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.setPrimaryVideoThumbnail);
    }

    /**
     * 设置视频模板封面图
     *
     * 根据用户提供的视频封面图资源ID和AIM视频资源ID设置视频模板的封面图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetPrimaryVideoThumbnailRequest 请求对象
     * @return SyncInvoker<SetPrimaryVideoThumbnailRequest, SetPrimaryVideoThumbnailResponse>
     */
    public SyncInvoker<SetPrimaryVideoThumbnailRequest, SetPrimaryVideoThumbnailResponse> setPrimaryVideoThumbnailInvoker(
        SetPrimaryVideoThumbnailRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.setPrimaryVideoThumbnail, hcClient);
    }

    /**
     * 查询视频模板封面图
     *
     * 根据用户提供的过滤条件，查询视频模板封面图资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateVideoThumbnailRequest 请求对象
     * @return ShowTemplateVideoThumbnailResponse
     */
    public ShowTemplateVideoThumbnailResponse showTemplateVideoThumbnail(ShowTemplateVideoThumbnailRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.showTemplateVideoThumbnail);
    }

    /**
     * 查询视频模板封面图
     *
     * 根据用户提供的过滤条件，查询视频模板封面图资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateVideoThumbnailRequest 请求对象
     * @return SyncInvoker<ShowTemplateVideoThumbnailRequest, ShowTemplateVideoThumbnailResponse>
     */
    public SyncInvoker<ShowTemplateVideoThumbnailRequest, ShowTemplateVideoThumbnailResponse> showTemplateVideoThumbnailInvoker(
        ShowTemplateVideoThumbnailRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.showTemplateVideoThumbnail, hcClient);
    }

    /**
     * 启用或禁用模板实例
     *
     * 根据用户提供的模板ID，启用或禁用智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePersonalTemplateStateRequest 请求对象
     * @return UpdatePersonalTemplateStateResponse
     */
    public UpdatePersonalTemplateStateResponse updatePersonalTemplateState(UpdatePersonalTemplateStateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.updatePersonalTemplateState);
    }

    /**
     * 启用或禁用模板实例
     *
     * 根据用户提供的模板ID，启用或禁用智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePersonalTemplateStateRequest 请求对象
     * @return SyncInvoker<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse>
     */
    public SyncInvoker<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> updatePersonalTemplateStateInvoker(
        UpdatePersonalTemplateStateRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.updatePersonalTemplateState, hcClient);
    }

    /**
     * 上传智能信息模板素材
     *
     * 支持用户上传模板使用的图片或者视频。
     * 
     * &gt; 单个租户资源空间为10GB，包括回收站内容，请及时清理无用资源，防止资源浪费。
     * &gt; 请求中所有字符串不允许携带“&lt;”、“&gt;”或多个空格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAimTemplateMaterialRequest 请求对象
     * @return UploadAimTemplateMaterialResponse
     */
    public UploadAimTemplateMaterialResponse uploadAimTemplateMaterial(UploadAimTemplateMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.uploadAimTemplateMaterial);
    }

    /**
     * 上传智能信息模板素材
     *
     * 支持用户上传模板使用的图片或者视频。
     * 
     * &gt; 单个租户资源空间为10GB，包括回收站内容，请及时清理无用资源，防止资源浪费。
     * &gt; 请求中所有字符串不允许携带“&lt;”、“&gt;”或多个空格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAimTemplateMaterialRequest 请求对象
     * @return SyncInvoker<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse>
     */
    public SyncInvoker<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> uploadAimTemplateMaterialInvoker(
        UploadAimTemplateMaterialRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.uploadAimTemplateMaterial, hcClient);
    }

    /**
     * 注册智能信息基础版回执URL
     *
     * 用户根据要求创建智能信息基础版回执接口后，可以调用此接口进行注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVmsCallBackRequest 请求对象
     * @return AddVmsCallBackResponse
     */
    public AddVmsCallBackResponse addVmsCallBack(AddVmsCallBackRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.addVmsCallBack);
    }

    /**
     * 注册智能信息基础版回执URL
     *
     * 用户根据要求创建智能信息基础版回执接口后，可以调用此接口进行注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVmsCallBackRequest 请求对象
     * @return SyncInvoker<AddVmsCallBackRequest, AddVmsCallBackResponse>
     */
    public SyncInvoker<AddVmsCallBackRequest, AddVmsCallBackResponse> addVmsCallBackInvoker(
        AddVmsCallBackRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.addVmsCallBack, hcClient);
    }

    /**
     * 发送智能信息基础版任务
     *
     * 支持用户通过此接口进行智能信息基础版任务发送。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVmsSendTaskRequest 请求对象
     * @return CreateVmsSendTaskResponse
     */
    public CreateVmsSendTaskResponse createVmsSendTask(CreateVmsSendTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.createVmsSendTask);
    }

    /**
     * 发送智能信息基础版任务
     *
     * 支持用户通过此接口进行智能信息基础版任务发送。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVmsSendTaskRequest 请求对象
     * @return SyncInvoker<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse>
     */
    public SyncInvoker<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> createVmsSendTaskInvoker(
        CreateVmsSendTaskRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.createVmsSendTask, hcClient);
    }

    /**
     * 查询用户已注册智能信息基础版回执接口
     *
     * 查询所有已注册的智能信息基础版回执接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVmsCallbacksRequest 请求对象
     * @return ListVmsCallbacksResponse
     */
    public ListVmsCallbacksResponse listVmsCallbacks(ListVmsCallbacksRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listVmsCallbacks);
    }

    /**
     * 查询用户已注册智能信息基础版回执接口
     *
     * 查询所有已注册的智能信息基础版回执接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVmsCallbacksRequest 请求对象
     * @return SyncInvoker<ListVmsCallbacksRequest, ListVmsCallbacksResponse>
     */
    public SyncInvoker<ListVmsCallbacksRequest, ListVmsCallbacksResponse> listVmsCallbacksInvoker(
        ListVmsCallbacksRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listVmsCallbacks, hcClient);
    }

    /**
     * 查询智能信息基础版发送任务
     *
     * 支持用户根据过滤条件查询智能信息基础版任务列表。包括：发送任务名称、智能信息基础版模板ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVmsSendTasksRequest 请求对象
     * @return ListVmsSendTasksResponse
     */
    public ListVmsSendTasksResponse listVmsSendTasks(ListVmsSendTasksRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listVmsSendTasks);
    }

    /**
     * 查询智能信息基础版发送任务
     *
     * 支持用户根据过滤条件查询智能信息基础版任务列表。包括：发送任务名称、智能信息基础版模板ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVmsSendTasksRequest 请求对象
     * @return SyncInvoker<ListVmsSendTasksRequest, ListVmsSendTasksResponse>
     */
    public SyncInvoker<ListVmsSendTasksRequest, ListVmsSendTasksResponse> listVmsSendTasksInvoker(
        ListVmsSendTasksRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listVmsSendTasks, hcClient);
    }

    /**
     * 新建智能信息基础版模板
     *
     * 支持用户通过此接口创建智能信息基础版模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVmsTemplateRequest 请求对象
     * @return CreateVmsTemplateResponse
     */
    public CreateVmsTemplateResponse createVmsTemplate(CreateVmsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.createVmsTemplate);
    }

    /**
     * 新建智能信息基础版模板
     *
     * 支持用户通过此接口创建智能信息基础版模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVmsTemplateRequest 请求对象
     * @return SyncInvoker<CreateVmsTemplateRequest, CreateVmsTemplateResponse>
     */
    public SyncInvoker<CreateVmsTemplateRequest, CreateVmsTemplateResponse> createVmsTemplateInvoker(
        CreateVmsTemplateRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.createVmsTemplate, hcClient);
    }

    /**
     * 查询智能信息基础版模板状态
     *
     * 根据用户提供的过滤条件查询智能信息基础版模板状态列表。
     * 包括：模板ID、模板名称等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVmsTemplateStatusRequest 请求对象
     * @return ListVmsTemplateStatusResponse
     */
    public ListVmsTemplateStatusResponse listVmsTemplateStatus(ListVmsTemplateStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listVmsTemplateStatus);
    }

    /**
     * 查询智能信息基础版模板状态
     *
     * 根据用户提供的过滤条件查询智能信息基础版模板状态列表。
     * 包括：模板ID、模板名称等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVmsTemplateStatusRequest 请求对象
     * @return SyncInvoker<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse>
     */
    public SyncInvoker<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> listVmsTemplateStatusInvoker(
        ListVmsTemplateStatusRequest request) {
        return new SyncInvoker<>(request, KooMessageMeta.listVmsTemplateStatus, hcClient);
    }

}
