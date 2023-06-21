package com.huaweicloud.sdk.koomessage.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.koomessage.v1.model.*;

public class KooMessageClient {

    protected HcClient hcClient;

    public KooMessageClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KooMessageClient> newBuilder() {
        return new ClientBuilder<>(KooMessageClient::new);
    }

    /**
     * 注册智能信息回执URL
     *
     * 用户根据要求创建回执接口后，可以调用此接口进行注册，注意：此接口仅允许te_admin角色用户调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddCallBackRequest 请求对象
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
     * @param AddCallBackRequest 请求对象
     * @return SyncInvoker<AddCallBackRequest, AddCallBackResponse>
     */
    public SyncInvoker<AddCallBackRequest, AddCallBackResponse> addCallBackInvoker(AddCallBackRequest request) {
        return new SyncInvoker<AddCallBackRequest, AddCallBackResponse>(request, KooMessageMeta.addCallBack, hcClient);
    }

    /**
     * 查询用户已注册回执接口
     *
     * 用户注册回执接口之后，可以根据此接口查询所有已注册回执接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimCallbacksRequest 请求对象
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
     * @param ListAimCallbacksRequest 请求对象
     * @return SyncInvoker<ListAimCallbacksRequest, ListAimCallbacksResponse>
     */
    public SyncInvoker<ListAimCallbacksRequest, ListAimCallbacksResponse> listAimCallbacksInvoker(
        ListAimCallbacksRequest request) {
        return new SyncInvoker<ListAimCallbacksRequest, ListAimCallbacksResponse>(request,
            KooMessageMeta.listAimCallbacks, hcClient);
    }

    /**
     * 查询手机号智能信息解析能力
     *
     * 用户在下发智能信息前，通过此接口批量查询对应手机的智能信息解析能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckMobileCapabilityRequest 请求对象
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
     * @param CheckMobileCapabilityRequest 请求对象
     * @return SyncInvoker<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse>
     */
    public SyncInvoker<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> checkMobileCapabilityInvoker(
        CheckMobileCapabilityRequest request) {
        return new SyncInvoker<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse>(request,
            KooMessageMeta.checkMobileCapability, hcClient);
    }

    /**
     * 生成解析任务
     *
     * 生成解析的短链。一次最多生成100个解析的短链。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResolveTaskRequest 请求对象
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
     * @param CreateResolveTaskRequest 请求对象
     * @return SyncInvoker<CreateResolveTaskRequest, CreateResolveTaskResponse>
     */
    public SyncInvoker<CreateResolveTaskRequest, CreateResolveTaskResponse> createResolveTaskInvoker(
        CreateResolveTaskRequest request) {
        return new SyncInvoker<CreateResolveTaskRequest, CreateResolveTaskResponse>(request,
            KooMessageMeta.createResolveTask, hcClient);
    }

    /**
     * 查询解析明细
     *
     * 根据用户提供的过滤条件查询个性化解析明细，包括：发送任务ID、发送手机号码等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimResolveDetailsRequest 请求对象
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
     * @param ListAimResolveDetailsRequest 请求对象
     * @return SyncInvoker<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse>
     */
    public SyncInvoker<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> listAimResolveDetailsInvoker(
        ListAimResolveDetailsRequest request) {
        return new SyncInvoker<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse>(request,
            KooMessageMeta.listAimResolveDetails, hcClient);
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
     * @param ListResolveTasksRequest 请求对象
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
     * @param ListResolveTasksRequest 请求对象
     * @return SyncInvoker<ListResolveTasksRequest, ListResolveTasksResponse>
     */
    public SyncInvoker<ListResolveTasksRequest, ListResolveTasksResponse> listResolveTasksInvoker(
        ListResolveTasksRequest request) {
        return new SyncInvoker<ListResolveTasksRequest, ListResolveTasksResponse>(request,
            KooMessageMeta.listResolveTasks, hcClient);
    }

    /**
     * 查询智能信息服务号菜单
     *
     * 根据用户提供的过滤条件查询服务号菜单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMenusRequest 请求对象
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
     * @param ListMenusRequest 请求对象
     * @return SyncInvoker<ListMenusRequest, ListMenusResponse>
     */
    public SyncInvoker<ListMenusRequest, ListMenusResponse> listMenusInvoker(ListMenusRequest request) {
        return new SyncInvoker<ListMenusRequest, ListMenusResponse>(request, KooMessageMeta.listMenus, hcClient);
    }

    /**
     * 修改智能信息服务号菜单
     *
     * 
     * 支持用户修改所属企业的指定菜单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMenuRequest 请求对象
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
     * @param UpdateMenuRequest 请求对象
     * @return SyncInvoker<UpdateMenuRequest, UpdateMenuResponse>
     */
    public SyncInvoker<UpdateMenuRequest, UpdateMenuResponse> updateMenuInvoker(UpdateMenuRequest request) {
        return new SyncInvoker<UpdateMenuRequest, UpdateMenuResponse>(request, KooMessageMeta.updateMenu, hcClient);
    }

    /**
     * 删除通道号
     *
     * 删除通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePortInfoRequest 请求对象
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
     * @param DeletePortInfoRequest 请求对象
     * @return SyncInvoker<DeletePortInfoRequest, DeletePortInfoResponse>
     */
    public SyncInvoker<DeletePortInfoRequest, DeletePortInfoResponse> deletePortInfoInvoker(
        DeletePortInfoRequest request) {
        return new SyncInvoker<DeletePortInfoRequest, DeletePortInfoResponse>(request, KooMessageMeta.deletePortInfo,
            hcClient);
    }

    /**
     * 查询通道号列表
     *
     * 支持查询通道号列表和通道号绑定信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortInfosRequest 请求对象
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
     * @param ListPortInfosRequest 请求对象
     * @return SyncInvoker<ListPortInfosRequest, ListPortInfosResponse>
     */
    public SyncInvoker<ListPortInfosRequest, ListPortInfosResponse> listPortInfosInvoker(ListPortInfosRequest request) {
        return new SyncInvoker<ListPortInfosRequest, ListPortInfosResponse>(request, KooMessageMeta.listPortInfos,
            hcClient);
    }

    /**
     * 通道号绑定服务号
     *
     * 通道号绑定服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LockPortRequest 请求对象
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
     * @param LockPortRequest 请求对象
     * @return SyncInvoker<LockPortRequest, LockPortResponse>
     */
    public SyncInvoker<LockPortRequest, LockPortResponse> lockPortInvoker(LockPortRequest request) {
        return new SyncInvoker<LockPortRequest, LockPortResponse>(request, KooMessageMeta.lockPort, hcClient);
    }

    /**
     * 注册通道号
     *
     * 注册通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterPortRequest 请求对象
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
     * @param RegisterPortRequest 请求对象
     * @return SyncInvoker<RegisterPortRequest, RegisterPortResponse>
     */
    public SyncInvoker<RegisterPortRequest, RegisterPortResponse> registerPortInvoker(RegisterPortRequest request) {
        return new SyncInvoker<RegisterPortRequest, RegisterPortResponse>(request, KooMessageMeta.registerPort,
            hcClient);
    }

    /**
     * 通道号解绑服务号
     *
     * 通道号解绑服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnlockPortRequest 请求对象
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
     * @param UnlockPortRequest 请求对象
     * @return SyncInvoker<UnlockPortRequest, UnlockPortResponse>
     */
    public SyncInvoker<UnlockPortRequest, UnlockPortResponse> unlockPortInvoker(UnlockPortRequest request) {
        return new SyncInvoker<UnlockPortRequest, UnlockPortResponse>(request, KooMessageMeta.unlockPort, hcClient);
    }

    /**
     * 查询主页列表
     *
     * 
     * 根据用户提供的过滤条件查找用户管理的主页列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortalInfosRequest 请求对象
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
     * @param ListPortalInfosRequest 请求对象
     * @return SyncInvoker<ListPortalInfosRequest, ListPortalInfosResponse>
     */
    public SyncInvoker<ListPortalInfosRequest, ListPortalInfosResponse> listPortalInfosInvoker(
        ListPortalInfosRequest request) {
        return new SyncInvoker<ListPortalInfosRequest, ListPortalInfosResponse>(request, KooMessageMeta.listPortalInfos,
            hcClient);
    }

    /**
     * 修改主页信息
     *
     * 
     * 用户对已创建的主页进行信息的修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePortalInfoRequest 请求对象
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
     * @param UpdatePortalInfoRequest 请求对象
     * @return SyncInvoker<UpdatePortalInfoRequest, UpdatePortalInfoResponse>
     */
    public SyncInvoker<UpdatePortalInfoRequest, UpdatePortalInfoResponse> updatePortalInfoInvoker(
        UpdatePortalInfoRequest request) {
        return new SyncInvoker<UpdatePortalInfoRequest, UpdatePortalInfoResponse>(request,
            KooMessageMeta.updatePortalInfo, hcClient);
    }

    /**
     * 冻结服务号
     *
     * 支持用户通过此接口冻结服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezePubRequest 请求对象
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
     * @param FreezePubRequest 请求对象
     * @return SyncInvoker<FreezePubRequest, FreezePubResponse>
     */
    public SyncInvoker<FreezePubRequest, FreezePubResponse> freezePubInvoker(FreezePubRequest request) {
        return new SyncInvoker<FreezePubRequest, FreezePubResponse>(request, KooMessageMeta.freezePub, hcClient);
    }

    /**
     * 查询服务号列表
     *
     * 
     * 支持根据用户提供的过滤条件查询服务号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPubInfosRequest 请求对象
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
     * @param ListPubInfosRequest 请求对象
     * @return SyncInvoker<ListPubInfosRequest, ListPubInfosResponse>
     */
    public SyncInvoker<ListPubInfosRequest, ListPubInfosResponse> listPubInfosInvoker(ListPubInfosRequest request) {
        return new SyncInvoker<ListPubInfosRequest, ListPubInfosResponse>(request, KooMessageMeta.listPubInfos,
            hcClient);
    }

    /**
     * 解冻服务号
     *
     * 服务号解结，冻结服务号。需审核，审核通过生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezePubRequest 请求对象
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
     * @param UnfreezePubRequest 请求对象
     * @return SyncInvoker<UnfreezePubRequest, UnfreezePubResponse>
     */
    public SyncInvoker<UnfreezePubRequest, UnfreezePubResponse> unfreezePubInvoker(UnfreezePubRequest request) {
        return new SyncInvoker<UnfreezePubRequest, UnfreezePubResponse>(request, KooMessageMeta.unfreezePub, hcClient);
    }

    /**
     * 更新服务号信息
     *
     * 支持用户更新服务号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePubInfoRequest 请求对象
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
     * @param UpdatePubInfoRequest 请求对象
     * @return SyncInvoker<UpdatePubInfoRequest, UpdatePubInfoResponse>
     */
    public SyncInvoker<UpdatePubInfoRequest, UpdatePubInfoResponse> updatePubInfoInvoker(UpdatePubInfoRequest request) {
        return new SyncInvoker<UpdatePubInfoRequest, UpdatePubInfoResponse>(request, KooMessageMeta.updatePubInfo,
            hcClient);
    }

    /**
     * 一站式服务号创建
     *
     * 一站式服务号创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePubInfoRequest 请求对象
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
     * @param CreatePubInfoRequest 请求对象
     * @return SyncInvoker<CreatePubInfoRequest, CreatePubInfoResponse>
     */
    public SyncInvoker<CreatePubInfoRequest, CreatePubInfoResponse> createPubInfoInvoker(CreatePubInfoRequest request) {
        return new SyncInvoker<CreatePubInfoRequest, CreatePubInfoResponse>(request, KooMessageMeta.createPubInfo,
            hcClient);
    }

    /**
     * 催审菜单
     *
     * 支持用户通过此接口根据菜单ID催审。菜单需要在与其关联的服务号审核通过之后才能催审。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushMenuInfoRequest 请求对象
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
     * @param PushMenuInfoRequest 请求对象
     * @return SyncInvoker<PushMenuInfoRequest, PushMenuInfoResponse>
     */
    public SyncInvoker<PushMenuInfoRequest, PushMenuInfoResponse> pushMenuInfoInvoker(PushMenuInfoRequest request) {
        return new SyncInvoker<PushMenuInfoRequest, PushMenuInfoResponse>(request, KooMessageMeta.pushMenuInfo,
            hcClient);
    }

    /**
     * 催审主页
     *
     * 支持用户通过此接口根据主页ID催审。主页需要在与其关联的服务号审核通过之后才能催审。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushPortalInfoRequest 请求对象
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
     * @param PushPortalInfoRequest 请求对象
     * @return SyncInvoker<PushPortalInfoRequest, PushPortalInfoResponse>
     */
    public SyncInvoker<PushPortalInfoRequest, PushPortalInfoResponse> pushPortalInfoInvoker(
        PushPortalInfoRequest request) {
        return new SyncInvoker<PushPortalInfoRequest, PushPortalInfoResponse>(request, KooMessageMeta.pushPortalInfo,
            hcClient);
    }

    /**
     * 上传智能信息服务号图片资源
     *
     * 支持用户上传图片资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadMediaRequest 请求对象
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
     * @param UploadMediaRequest 请求对象
     * @return SyncInvoker<UploadMediaRequest, UploadMediaResponse>
     */
    public SyncInvoker<UploadMediaRequest, UploadMediaResponse> uploadMediaInvoker(UploadMediaRequest request) {
        return new SyncInvoker<UploadMediaRequest, UploadMediaResponse>(request, KooMessageMeta.uploadMedia, hcClient);
    }

    /**
     * 发送智能信息
     *
     * 根据客户的参数发送任务名称、智能信息模板ID等进行智能信息发送。一次最多发送100个智能信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAimSendTaskRequest 请求对象
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
     * @param CreateAimSendTaskRequest 请求对象
     * @return SyncInvoker<CreateAimSendTaskRequest, CreateAimSendTaskResponse>
     */
    public SyncInvoker<CreateAimSendTaskRequest, CreateAimSendTaskResponse> createAimSendTaskInvoker(
        CreateAimSendTaskRequest request) {
        return new SyncInvoker<CreateAimSendTaskRequest, CreateAimSendTaskResponse>(request,
            KooMessageMeta.createAimSendTask, hcClient);
    }

    /**
     * 查询智能信息发送明细
     *
     * 根据用户提供的过滤条件查询发送明细列表，包括：发送任务ID、发送手机号码等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimSendDetailsRequest 请求对象
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
     * @param ListAimSendDetailsRequest 请求对象
     * @return SyncInvoker<ListAimSendDetailsRequest, ListAimSendDetailsResponse>
     */
    public SyncInvoker<ListAimSendDetailsRequest, ListAimSendDetailsResponse> listAimSendDetailsInvoker(
        ListAimSendDetailsRequest request) {
        return new SyncInvoker<ListAimSendDetailsRequest, ListAimSendDetailsResponse>(request,
            KooMessageMeta.listAimSendDetails, hcClient);
    }

    /**
     * 查询智能信息发送报表
     *
     * 查询智能信息发送报表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimSendReportsRequest 请求对象
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
     * @param ListAimSendReportsRequest 请求对象
     * @return SyncInvoker<ListAimSendReportsRequest, ListAimSendReportsResponse>
     */
    public SyncInvoker<ListAimSendReportsRequest, ListAimSendReportsResponse> listAimSendReportsInvoker(
        ListAimSendReportsRequest request) {
        return new SyncInvoker<ListAimSendReportsRequest, ListAimSendReportsResponse>(request,
            KooMessageMeta.listAimSendReports, hcClient);
    }

    /**
     * 查询智能信息发送任务
     *
     * 
     * 根据用户提供的过滤条件查询智能信息发送任务列表，包括：发送任务名称、智能信息模板ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimSendTasksRequest 请求对象
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
     * @param ListAimSendTasksRequest 请求对象
     * @return SyncInvoker<ListAimSendTasksRequest, ListAimSendTasksResponse>
     */
    public SyncInvoker<ListAimSendTasksRequest, ListAimSendTasksResponse> listAimSendTasksInvoker(
        ListAimSendTasksRequest request) {
        return new SyncInvoker<ListAimSendTasksRequest, ListAimSendTasksResponse>(request,
            KooMessageMeta.listAimSendTasks, hcClient);
    }

    /**
     * 创建个人模板
     *
     * 用于用户创建个人模板。
     * 
     * &gt; 请求中所有字符串不允许携带“&lt;”、“&gt;”或多个空格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAimPersonalTemplateRequest 请求对象
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
     * &gt; 请求中所有字符串不允许携带“&lt;”、“&gt;”或多个空格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAimPersonalTemplateRequest 请求对象
     * @return SyncInvoker<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse>
     */
    public SyncInvoker<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> createAimPersonalTemplateInvoker(
        CreateAimPersonalTemplateRequest request) {
        return new SyncInvoker<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse>(request,
            KooMessageMeta.createAimPersonalTemplate, hcClient);
    }

    /**
     * 删除模板实例
     *
     * 根据客户提供的模板ID，删除智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAimPersonalTemplateRequest 请求对象
     * @return DeleteAimPersonalTemplateResponse
     */
    public DeleteAimPersonalTemplateResponse deleteAimPersonalTemplate(DeleteAimPersonalTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.deleteAimPersonalTemplate);
    }

    /**
     * 删除模板实例
     *
     * 根据客户提供的模板ID，删除智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAimPersonalTemplateRequest 请求对象
     * @return SyncInvoker<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse>
     */
    public SyncInvoker<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> deleteAimPersonalTemplateInvoker(
        DeleteAimPersonalTemplateRequest request) {
        return new SyncInvoker<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse>(request,
            KooMessageMeta.deleteAimPersonalTemplate, hcClient);
    }

    /**
     * 删除模板素材
     *
     * 根据客户提供的模板ID，删除模板素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateMaterialRequest 请求对象
     * @return DeleteTemplateMaterialResponse
     */
    public DeleteTemplateMaterialResponse deleteTemplateMaterial(DeleteTemplateMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.deleteTemplateMaterial);
    }

    /**
     * 删除模板素材
     *
     * 根据客户提供的模板ID，删除模板素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateMaterialRequest 请求对象
     * @return SyncInvoker<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse>
     */
    public SyncInvoker<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> deleteTemplateMaterialInvoker(
        DeleteTemplateMaterialRequest request) {
        return new SyncInvoker<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse>(request,
            KooMessageMeta.deleteTemplateMaterial, hcClient);
    }

    /**
     * 查询智能消息模板素材列表
     *
     * 根据客户提供的过滤条件，查询模板素材列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimTemplateMaterialsRequest 请求对象
     * @return ListAimTemplateMaterialsResponse
     */
    public ListAimTemplateMaterialsResponse listAimTemplateMaterials(ListAimTemplateMaterialsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.listAimTemplateMaterials);
    }

    /**
     * 查询智能消息模板素材列表
     *
     * 根据客户提供的过滤条件，查询模板素材列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimTemplateMaterialsRequest 请求对象
     * @return SyncInvoker<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse>
     */
    public SyncInvoker<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> listAimTemplateMaterialsInvoker(
        ListAimTemplateMaterialsRequest request) {
        return new SyncInvoker<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse>(request,
            KooMessageMeta.listAimTemplateMaterials, hcClient);
    }

    /**
     * 查询模板报表
     *
     * 根据用户指定过滤条件查询指定智能信息模板的解析次数。当日数据需要次日16:00之后才能查询到。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimTemplateReportsRequest 请求对象
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
     * @param ListAimTemplateReportsRequest 请求对象
     * @return SyncInvoker<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse>
     */
    public SyncInvoker<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> listAimTemplateReportsInvoker(
        ListAimTemplateReportsRequest request) {
        return new SyncInvoker<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse>(request,
            KooMessageMeta.listAimTemplateReports, hcClient);
    }

    /**
     * 查询模板
     *
     * 
     * 根据客户提供的过滤条件查询智能信息模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimTemplatesRequest 请求对象
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
     * @param ListAimTemplatesRequest 请求对象
     * @return SyncInvoker<ListAimTemplatesRequest, ListAimTemplatesResponse>
     */
    public SyncInvoker<ListAimTemplatesRequest, ListAimTemplatesResponse> listAimTemplatesInvoker(
        ListAimTemplatesRequest request) {
        return new SyncInvoker<ListAimTemplatesRequest, ListAimTemplatesResponse>(request,
            KooMessageMeta.listAimTemplates, hcClient);
    }

    /**
     * 启用或禁用模板实例
     *
     * 根据客户提供的模板ID，启用或禁用智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePersonalTemplateStateRequest 请求对象
     * @return UpdatePersonalTemplateStateResponse
     */
    public UpdatePersonalTemplateStateResponse updatePersonalTemplateState(UpdatePersonalTemplateStateRequest request) {
        return hcClient.syncInvokeHttp(request, KooMessageMeta.updatePersonalTemplateState);
    }

    /**
     * 启用或禁用模板实例
     *
     * 根据客户提供的模板ID，启用或禁用智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePersonalTemplateStateRequest 请求对象
     * @return SyncInvoker<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse>
     */
    public SyncInvoker<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> updatePersonalTemplateStateInvoker(
        UpdatePersonalTemplateStateRequest request) {
        return new SyncInvoker<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse>(request,
            KooMessageMeta.updatePersonalTemplateState, hcClient);
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
     * @param UploadAimTemplateMaterialRequest 请求对象
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
     * @param UploadAimTemplateMaterialRequest 请求对象
     * @return SyncInvoker<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse>
     */
    public SyncInvoker<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> uploadAimTemplateMaterialInvoker(
        UploadAimTemplateMaterialRequest request) {
        return new SyncInvoker<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse>(request,
            KooMessageMeta.uploadAimTemplateMaterial, hcClient);
    }

    /**
     * 注册智能信息基础版回执URL
     *
     * 用户根据要求创建智能信息基础版回执接口后，可以调用此接口进行注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVmsCallBackRequest 请求对象
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
     * @param AddVmsCallBackRequest 请求对象
     * @return SyncInvoker<AddVmsCallBackRequest, AddVmsCallBackResponse>
     */
    public SyncInvoker<AddVmsCallBackRequest, AddVmsCallBackResponse> addVmsCallBackInvoker(
        AddVmsCallBackRequest request) {
        return new SyncInvoker<AddVmsCallBackRequest, AddVmsCallBackResponse>(request, KooMessageMeta.addVmsCallBack,
            hcClient);
    }

    /**
     * 发送智能信息基础版任务
     *
     * 支持用户通过此接口进行智能信息基础版任务发送。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVmsSendTaskRequest 请求对象
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
     * @param CreateVmsSendTaskRequest 请求对象
     * @return SyncInvoker<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse>
     */
    public SyncInvoker<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> createVmsSendTaskInvoker(
        CreateVmsSendTaskRequest request) {
        return new SyncInvoker<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse>(request,
            KooMessageMeta.createVmsSendTask, hcClient);
    }

    /**
     * 查询用户已注册智能信息基础版回执接口
     *
     * 查询所有已注册的智能信息基础版回执接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVmsCallbacksRequest 请求对象
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
     * @param ListVmsCallbacksRequest 请求对象
     * @return SyncInvoker<ListVmsCallbacksRequest, ListVmsCallbacksResponse>
     */
    public SyncInvoker<ListVmsCallbacksRequest, ListVmsCallbacksResponse> listVmsCallbacksInvoker(
        ListVmsCallbacksRequest request) {
        return new SyncInvoker<ListVmsCallbacksRequest, ListVmsCallbacksResponse>(request,
            KooMessageMeta.listVmsCallbacks, hcClient);
    }

    /**
     * 查询智能信息基础版发送任务
     *
     * 支持用户根据过滤条件查询智能信息基础版任务列表。包括：发送任务名称、智能信息基础版模板ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVmsSendTasksRequest 请求对象
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
     * @param ListVmsSendTasksRequest 请求对象
     * @return SyncInvoker<ListVmsSendTasksRequest, ListVmsSendTasksResponse>
     */
    public SyncInvoker<ListVmsSendTasksRequest, ListVmsSendTasksResponse> listVmsSendTasksInvoker(
        ListVmsSendTasksRequest request) {
        return new SyncInvoker<ListVmsSendTasksRequest, ListVmsSendTasksResponse>(request,
            KooMessageMeta.listVmsSendTasks, hcClient);
    }

    /**
     * 新建智能信息基础版模板
     *
     * 支持用户通过此接口创建智能信息基础版模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVmsTemplateRequest 请求对象
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
     * @param CreateVmsTemplateRequest 请求对象
     * @return SyncInvoker<CreateVmsTemplateRequest, CreateVmsTemplateResponse>
     */
    public SyncInvoker<CreateVmsTemplateRequest, CreateVmsTemplateResponse> createVmsTemplateInvoker(
        CreateVmsTemplateRequest request) {
        return new SyncInvoker<CreateVmsTemplateRequest, CreateVmsTemplateResponse>(request,
            KooMessageMeta.createVmsTemplate, hcClient);
    }

    /**
     * 查询智能信息基础版模板状态
     *
     * 根据用户提供的过滤条件查询智能信息基础版模板状态列表。
     * 包括：模板ID、模板名称等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVmsTemplateStatusRequest 请求对象
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
     * @param ListVmsTemplateStatusRequest 请求对象
     * @return SyncInvoker<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse>
     */
    public SyncInvoker<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> listVmsTemplateStatusInvoker(
        ListVmsTemplateStatusRequest request) {
        return new SyncInvoker<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse>(request,
            KooMessageMeta.listVmsTemplateStatus, hcClient);
    }

}
