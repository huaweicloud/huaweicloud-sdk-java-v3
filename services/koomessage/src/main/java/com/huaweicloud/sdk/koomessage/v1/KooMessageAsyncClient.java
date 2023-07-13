package com.huaweicloud.sdk.koomessage.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.koomessage.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class KooMessageAsyncClient {

    protected HcClient hcClient;

    public KooMessageAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KooMessageAsyncClient> newBuilder() {
        return new ClientBuilder<>(KooMessageAsyncClient::new);
    }

    /**
     * 注册智能信息回执URL
     *
     * 用户根据要求创建回执接口后，可以调用此接口进行注册，注意：此接口仅允许te_admin角色用户调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddCallBackRequest 请求对象
     * @return CompletableFuture<AddCallBackResponse>
     */
    public CompletableFuture<AddCallBackResponse> addCallBackAsync(AddCallBackRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.addCallBack);
    }

    /**
     * 注册智能信息回执URL
     *
     * 用户根据要求创建回执接口后，可以调用此接口进行注册，注意：此接口仅允许te_admin角色用户调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddCallBackRequest 请求对象
     * @return AsyncInvoker<AddCallBackRequest, AddCallBackResponse>
     */
    public AsyncInvoker<AddCallBackRequest, AddCallBackResponse> addCallBackAsyncInvoker(AddCallBackRequest request) {
        return new AsyncInvoker<AddCallBackRequest, AddCallBackResponse>(request, KooMessageMeta.addCallBack, hcClient);
    }

    /**
     * 查询用户已注册回执接口
     *
     * 用户注册回执接口之后，可以根据此接口查询所有已注册回执接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimCallbacksRequest 请求对象
     * @return CompletableFuture<ListAimCallbacksResponse>
     */
    public CompletableFuture<ListAimCallbacksResponse> listAimCallbacksAsync(ListAimCallbacksRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listAimCallbacks);
    }

    /**
     * 查询用户已注册回执接口
     *
     * 用户注册回执接口之后，可以根据此接口查询所有已注册回执接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimCallbacksRequest 请求对象
     * @return AsyncInvoker<ListAimCallbacksRequest, ListAimCallbacksResponse>
     */
    public AsyncInvoker<ListAimCallbacksRequest, ListAimCallbacksResponse> listAimCallbacksAsyncInvoker(
        ListAimCallbacksRequest request) {
        return new AsyncInvoker<ListAimCallbacksRequest, ListAimCallbacksResponse>(request,
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
     * @return CompletableFuture<CheckMobileCapabilityResponse>
     */
    public CompletableFuture<CheckMobileCapabilityResponse> checkMobileCapabilityAsync(
        CheckMobileCapabilityRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.checkMobileCapability);
    }

    /**
     * 查询手机号智能信息解析能力
     *
     * 用户在下发智能信息前，通过此接口批量查询对应手机的智能信息解析能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckMobileCapabilityRequest 请求对象
     * @return AsyncInvoker<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse>
     */
    public AsyncInvoker<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> checkMobileCapabilityAsyncInvoker(
        CheckMobileCapabilityRequest request) {
        return new AsyncInvoker<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse>(request,
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
     * @return CompletableFuture<CreateResolveTaskResponse>
     */
    public CompletableFuture<CreateResolveTaskResponse> createResolveTaskAsync(CreateResolveTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.createResolveTask);
    }

    /**
     * 生成解析任务
     *
     * 生成解析的短链。一次最多生成100个解析的短链。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResolveTaskRequest 请求对象
     * @return AsyncInvoker<CreateResolveTaskRequest, CreateResolveTaskResponse>
     */
    public AsyncInvoker<CreateResolveTaskRequest, CreateResolveTaskResponse> createResolveTaskAsyncInvoker(
        CreateResolveTaskRequest request) {
        return new AsyncInvoker<CreateResolveTaskRequest, CreateResolveTaskResponse>(request,
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
     * @return CompletableFuture<ListAimResolveDetailsResponse>
     */
    public CompletableFuture<ListAimResolveDetailsResponse> listAimResolveDetailsAsync(
        ListAimResolveDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listAimResolveDetails);
    }

    /**
     * 查询解析明细
     *
     * 根据用户提供的过滤条件查询个性化解析明细，包括：发送任务ID、发送手机号码等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimResolveDetailsRequest 请求对象
     * @return AsyncInvoker<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse>
     */
    public AsyncInvoker<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> listAimResolveDetailsAsyncInvoker(
        ListAimResolveDetailsRequest request) {
        return new AsyncInvoker<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse>(request,
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
     * @return CompletableFuture<ListResolveTasksResponse>
     */
    public CompletableFuture<ListResolveTasksResponse> listResolveTasksAsync(ListResolveTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listResolveTasks);
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
     * @return AsyncInvoker<ListResolveTasksRequest, ListResolveTasksResponse>
     */
    public AsyncInvoker<ListResolveTasksRequest, ListResolveTasksResponse> listResolveTasksAsyncInvoker(
        ListResolveTasksRequest request) {
        return new AsyncInvoker<ListResolveTasksRequest, ListResolveTasksResponse>(request,
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
     * @return CompletableFuture<ListMenusResponse>
     */
    public CompletableFuture<ListMenusResponse> listMenusAsync(ListMenusRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listMenus);
    }

    /**
     * 查询智能信息服务号菜单
     *
     * 根据用户提供的过滤条件查询服务号菜单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMenusRequest 请求对象
     * @return AsyncInvoker<ListMenusRequest, ListMenusResponse>
     */
    public AsyncInvoker<ListMenusRequest, ListMenusResponse> listMenusAsyncInvoker(ListMenusRequest request) {
        return new AsyncInvoker<ListMenusRequest, ListMenusResponse>(request, KooMessageMeta.listMenus, hcClient);
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
     * @return CompletableFuture<UpdateMenuResponse>
     */
    public CompletableFuture<UpdateMenuResponse> updateMenuAsync(UpdateMenuRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.updateMenu);
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
     * @return AsyncInvoker<UpdateMenuRequest, UpdateMenuResponse>
     */
    public AsyncInvoker<UpdateMenuRequest, UpdateMenuResponse> updateMenuAsyncInvoker(UpdateMenuRequest request) {
        return new AsyncInvoker<UpdateMenuRequest, UpdateMenuResponse>(request, KooMessageMeta.updateMenu, hcClient);
    }

    /**
     * 删除通道号
     *
     * 删除通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePortInfoRequest 请求对象
     * @return CompletableFuture<DeletePortInfoResponse>
     */
    public CompletableFuture<DeletePortInfoResponse> deletePortInfoAsync(DeletePortInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.deletePortInfo);
    }

    /**
     * 删除通道号
     *
     * 删除通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePortInfoRequest 请求对象
     * @return AsyncInvoker<DeletePortInfoRequest, DeletePortInfoResponse>
     */
    public AsyncInvoker<DeletePortInfoRequest, DeletePortInfoResponse> deletePortInfoAsyncInvoker(
        DeletePortInfoRequest request) {
        return new AsyncInvoker<DeletePortInfoRequest, DeletePortInfoResponse>(request, KooMessageMeta.deletePortInfo,
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
     * @return CompletableFuture<ListPortInfosResponse>
     */
    public CompletableFuture<ListPortInfosResponse> listPortInfosAsync(ListPortInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listPortInfos);
    }

    /**
     * 查询通道号列表
     *
     * 支持查询通道号列表和通道号绑定信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortInfosRequest 请求对象
     * @return AsyncInvoker<ListPortInfosRequest, ListPortInfosResponse>
     */
    public AsyncInvoker<ListPortInfosRequest, ListPortInfosResponse> listPortInfosAsyncInvoker(
        ListPortInfosRequest request) {
        return new AsyncInvoker<ListPortInfosRequest, ListPortInfosResponse>(request, KooMessageMeta.listPortInfos,
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
     * @return CompletableFuture<LockPortResponse>
     */
    public CompletableFuture<LockPortResponse> lockPortAsync(LockPortRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.lockPort);
    }

    /**
     * 通道号绑定服务号
     *
     * 通道号绑定服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LockPortRequest 请求对象
     * @return AsyncInvoker<LockPortRequest, LockPortResponse>
     */
    public AsyncInvoker<LockPortRequest, LockPortResponse> lockPortAsyncInvoker(LockPortRequest request) {
        return new AsyncInvoker<LockPortRequest, LockPortResponse>(request, KooMessageMeta.lockPort, hcClient);
    }

    /**
     * 注册通道号
     *
     * 注册通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterPortRequest 请求对象
     * @return CompletableFuture<RegisterPortResponse>
     */
    public CompletableFuture<RegisterPortResponse> registerPortAsync(RegisterPortRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.registerPort);
    }

    /**
     * 注册通道号
     *
     * 注册通道号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterPortRequest 请求对象
     * @return AsyncInvoker<RegisterPortRequest, RegisterPortResponse>
     */
    public AsyncInvoker<RegisterPortRequest, RegisterPortResponse> registerPortAsyncInvoker(
        RegisterPortRequest request) {
        return new AsyncInvoker<RegisterPortRequest, RegisterPortResponse>(request, KooMessageMeta.registerPort,
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
     * @return CompletableFuture<UnlockPortResponse>
     */
    public CompletableFuture<UnlockPortResponse> unlockPortAsync(UnlockPortRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.unlockPort);
    }

    /**
     * 通道号解绑服务号
     *
     * 通道号解绑服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnlockPortRequest 请求对象
     * @return AsyncInvoker<UnlockPortRequest, UnlockPortResponse>
     */
    public AsyncInvoker<UnlockPortRequest, UnlockPortResponse> unlockPortAsyncInvoker(UnlockPortRequest request) {
        return new AsyncInvoker<UnlockPortRequest, UnlockPortResponse>(request, KooMessageMeta.unlockPort, hcClient);
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
     * @return CompletableFuture<ListPortalInfosResponse>
     */
    public CompletableFuture<ListPortalInfosResponse> listPortalInfosAsync(ListPortalInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listPortalInfos);
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
     * @return AsyncInvoker<ListPortalInfosRequest, ListPortalInfosResponse>
     */
    public AsyncInvoker<ListPortalInfosRequest, ListPortalInfosResponse> listPortalInfosAsyncInvoker(
        ListPortalInfosRequest request) {
        return new AsyncInvoker<ListPortalInfosRequest, ListPortalInfosResponse>(request,
            KooMessageMeta.listPortalInfos, hcClient);
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
     * @return CompletableFuture<UpdatePortalInfoResponse>
     */
    public CompletableFuture<UpdatePortalInfoResponse> updatePortalInfoAsync(UpdatePortalInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.updatePortalInfo);
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
     * @return AsyncInvoker<UpdatePortalInfoRequest, UpdatePortalInfoResponse>
     */
    public AsyncInvoker<UpdatePortalInfoRequest, UpdatePortalInfoResponse> updatePortalInfoAsyncInvoker(
        UpdatePortalInfoRequest request) {
        return new AsyncInvoker<UpdatePortalInfoRequest, UpdatePortalInfoResponse>(request,
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
     * @return CompletableFuture<FreezePubResponse>
     */
    public CompletableFuture<FreezePubResponse> freezePubAsync(FreezePubRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.freezePub);
    }

    /**
     * 冻结服务号
     *
     * 支持用户通过此接口冻结服务号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param FreezePubRequest 请求对象
     * @return AsyncInvoker<FreezePubRequest, FreezePubResponse>
     */
    public AsyncInvoker<FreezePubRequest, FreezePubResponse> freezePubAsyncInvoker(FreezePubRequest request) {
        return new AsyncInvoker<FreezePubRequest, FreezePubResponse>(request, KooMessageMeta.freezePub, hcClient);
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
     * @return CompletableFuture<ListPubInfosResponse>
     */
    public CompletableFuture<ListPubInfosResponse> listPubInfosAsync(ListPubInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listPubInfos);
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
     * @return AsyncInvoker<ListPubInfosRequest, ListPubInfosResponse>
     */
    public AsyncInvoker<ListPubInfosRequest, ListPubInfosResponse> listPubInfosAsyncInvoker(
        ListPubInfosRequest request) {
        return new AsyncInvoker<ListPubInfosRequest, ListPubInfosResponse>(request, KooMessageMeta.listPubInfos,
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
     * @return CompletableFuture<UnfreezePubResponse>
     */
    public CompletableFuture<UnfreezePubResponse> unfreezePubAsync(UnfreezePubRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.unfreezePub);
    }

    /**
     * 解冻服务号
     *
     * 服务号解结，冻结服务号。需审核，审核通过生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnfreezePubRequest 请求对象
     * @return AsyncInvoker<UnfreezePubRequest, UnfreezePubResponse>
     */
    public AsyncInvoker<UnfreezePubRequest, UnfreezePubResponse> unfreezePubAsyncInvoker(UnfreezePubRequest request) {
        return new AsyncInvoker<UnfreezePubRequest, UnfreezePubResponse>(request, KooMessageMeta.unfreezePub, hcClient);
    }

    /**
     * 更新服务号信息
     *
     * 支持用户更新服务号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePubInfoRequest 请求对象
     * @return CompletableFuture<UpdatePubInfoResponse>
     */
    public CompletableFuture<UpdatePubInfoResponse> updatePubInfoAsync(UpdatePubInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.updatePubInfo);
    }

    /**
     * 更新服务号信息
     *
     * 支持用户更新服务号信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePubInfoRequest 请求对象
     * @return AsyncInvoker<UpdatePubInfoRequest, UpdatePubInfoResponse>
     */
    public AsyncInvoker<UpdatePubInfoRequest, UpdatePubInfoResponse> updatePubInfoAsyncInvoker(
        UpdatePubInfoRequest request) {
        return new AsyncInvoker<UpdatePubInfoRequest, UpdatePubInfoResponse>(request, KooMessageMeta.updatePubInfo,
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
     * @return CompletableFuture<CreatePubInfoResponse>
     */
    public CompletableFuture<CreatePubInfoResponse> createPubInfoAsync(CreatePubInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.createPubInfo);
    }

    /**
     * 一站式服务号创建
     *
     * 一站式服务号创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePubInfoRequest 请求对象
     * @return AsyncInvoker<CreatePubInfoRequest, CreatePubInfoResponse>
     */
    public AsyncInvoker<CreatePubInfoRequest, CreatePubInfoResponse> createPubInfoAsyncInvoker(
        CreatePubInfoRequest request) {
        return new AsyncInvoker<CreatePubInfoRequest, CreatePubInfoResponse>(request, KooMessageMeta.createPubInfo,
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
     * @return CompletableFuture<PushMenuInfoResponse>
     */
    public CompletableFuture<PushMenuInfoResponse> pushMenuInfoAsync(PushMenuInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.pushMenuInfo);
    }

    /**
     * 催审菜单
     *
     * 支持用户通过此接口根据菜单ID催审。菜单需要在与其关联的服务号审核通过之后才能催审。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushMenuInfoRequest 请求对象
     * @return AsyncInvoker<PushMenuInfoRequest, PushMenuInfoResponse>
     */
    public AsyncInvoker<PushMenuInfoRequest, PushMenuInfoResponse> pushMenuInfoAsyncInvoker(
        PushMenuInfoRequest request) {
        return new AsyncInvoker<PushMenuInfoRequest, PushMenuInfoResponse>(request, KooMessageMeta.pushMenuInfo,
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
     * @return CompletableFuture<PushPortalInfoResponse>
     */
    public CompletableFuture<PushPortalInfoResponse> pushPortalInfoAsync(PushPortalInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.pushPortalInfo);
    }

    /**
     * 催审主页
     *
     * 支持用户通过此接口根据主页ID催审。主页需要在与其关联的服务号审核通过之后才能催审。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushPortalInfoRequest 请求对象
     * @return AsyncInvoker<PushPortalInfoRequest, PushPortalInfoResponse>
     */
    public AsyncInvoker<PushPortalInfoRequest, PushPortalInfoResponse> pushPortalInfoAsyncInvoker(
        PushPortalInfoRequest request) {
        return new AsyncInvoker<PushPortalInfoRequest, PushPortalInfoResponse>(request, KooMessageMeta.pushPortalInfo,
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
     * @return CompletableFuture<UploadMediaResponse>
     */
    public CompletableFuture<UploadMediaResponse> uploadMediaAsync(UploadMediaRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.uploadMedia);
    }

    /**
     * 上传智能信息服务号图片资源
     *
     * 支持用户上传图片资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadMediaRequest 请求对象
     * @return AsyncInvoker<UploadMediaRequest, UploadMediaResponse>
     */
    public AsyncInvoker<UploadMediaRequest, UploadMediaResponse> uploadMediaAsyncInvoker(UploadMediaRequest request) {
        return new AsyncInvoker<UploadMediaRequest, UploadMediaResponse>(request, KooMessageMeta.uploadMedia, hcClient);
    }

    /**
     * 发送智能信息
     *
     * 根据客户的参数发送任务名称、智能信息模板ID等进行智能信息发送。一次最多发送100个智能信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAimSendTaskRequest 请求对象
     * @return CompletableFuture<CreateAimSendTaskResponse>
     */
    public CompletableFuture<CreateAimSendTaskResponse> createAimSendTaskAsync(CreateAimSendTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.createAimSendTask);
    }

    /**
     * 发送智能信息
     *
     * 根据客户的参数发送任务名称、智能信息模板ID等进行智能信息发送。一次最多发送100个智能信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAimSendTaskRequest 请求对象
     * @return AsyncInvoker<CreateAimSendTaskRequest, CreateAimSendTaskResponse>
     */
    public AsyncInvoker<CreateAimSendTaskRequest, CreateAimSendTaskResponse> createAimSendTaskAsyncInvoker(
        CreateAimSendTaskRequest request) {
        return new AsyncInvoker<CreateAimSendTaskRequest, CreateAimSendTaskResponse>(request,
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
     * @return CompletableFuture<ListAimSendDetailsResponse>
     */
    public CompletableFuture<ListAimSendDetailsResponse> listAimSendDetailsAsync(ListAimSendDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listAimSendDetails);
    }

    /**
     * 查询智能信息发送明细
     *
     * 根据用户提供的过滤条件查询发送明细列表，包括：发送任务ID、发送手机号码等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimSendDetailsRequest 请求对象
     * @return AsyncInvoker<ListAimSendDetailsRequest, ListAimSendDetailsResponse>
     */
    public AsyncInvoker<ListAimSendDetailsRequest, ListAimSendDetailsResponse> listAimSendDetailsAsyncInvoker(
        ListAimSendDetailsRequest request) {
        return new AsyncInvoker<ListAimSendDetailsRequest, ListAimSendDetailsResponse>(request,
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
     * @return CompletableFuture<ListAimSendReportsResponse>
     */
    public CompletableFuture<ListAimSendReportsResponse> listAimSendReportsAsync(ListAimSendReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listAimSendReports);
    }

    /**
     * 查询智能信息发送报表
     *
     * 查询智能信息发送报表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimSendReportsRequest 请求对象
     * @return AsyncInvoker<ListAimSendReportsRequest, ListAimSendReportsResponse>
     */
    public AsyncInvoker<ListAimSendReportsRequest, ListAimSendReportsResponse> listAimSendReportsAsyncInvoker(
        ListAimSendReportsRequest request) {
        return new AsyncInvoker<ListAimSendReportsRequest, ListAimSendReportsResponse>(request,
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
     * @return CompletableFuture<ListAimSendTasksResponse>
     */
    public CompletableFuture<ListAimSendTasksResponse> listAimSendTasksAsync(ListAimSendTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listAimSendTasks);
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
     * @return AsyncInvoker<ListAimSendTasksRequest, ListAimSendTasksResponse>
     */
    public AsyncInvoker<ListAimSendTasksRequest, ListAimSendTasksResponse> listAimSendTasksAsyncInvoker(
        ListAimSendTasksRequest request) {
        return new AsyncInvoker<ListAimSendTasksRequest, ListAimSendTasksResponse>(request,
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
     * @return CompletableFuture<CreateAimPersonalTemplateResponse>
     */
    public CompletableFuture<CreateAimPersonalTemplateResponse> createAimPersonalTemplateAsync(
        CreateAimPersonalTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.createAimPersonalTemplate);
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
     * @return AsyncInvoker<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse>
     */
    public AsyncInvoker<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> createAimPersonalTemplateAsyncInvoker(
        CreateAimPersonalTemplateRequest request) {
        return new AsyncInvoker<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse>(request,
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
     * @return CompletableFuture<DeleteAimPersonalTemplateResponse>
     */
    public CompletableFuture<DeleteAimPersonalTemplateResponse> deleteAimPersonalTemplateAsync(
        DeleteAimPersonalTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.deleteAimPersonalTemplate);
    }

    /**
     * 删除模板实例
     *
     * 根据客户提供的模板ID，删除智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAimPersonalTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse>
     */
    public AsyncInvoker<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> deleteAimPersonalTemplateAsyncInvoker(
        DeleteAimPersonalTemplateRequest request) {
        return new AsyncInvoker<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse>(request,
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
     * @return CompletableFuture<DeleteTemplateMaterialResponse>
     */
    public CompletableFuture<DeleteTemplateMaterialResponse> deleteTemplateMaterialAsync(
        DeleteTemplateMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.deleteTemplateMaterial);
    }

    /**
     * 删除模板素材
     *
     * 根据客户提供的模板ID，删除模板素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateMaterialRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse>
     */
    public AsyncInvoker<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> deleteTemplateMaterialAsyncInvoker(
        DeleteTemplateMaterialRequest request) {
        return new AsyncInvoker<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse>(request,
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
     * @return CompletableFuture<ListAimTemplateMaterialsResponse>
     */
    public CompletableFuture<ListAimTemplateMaterialsResponse> listAimTemplateMaterialsAsync(
        ListAimTemplateMaterialsRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listAimTemplateMaterials);
    }

    /**
     * 查询智能消息模板素材列表
     *
     * 根据客户提供的过滤条件，查询模板素材列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimTemplateMaterialsRequest 请求对象
     * @return AsyncInvoker<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse>
     */
    public AsyncInvoker<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> listAimTemplateMaterialsAsyncInvoker(
        ListAimTemplateMaterialsRequest request) {
        return new AsyncInvoker<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse>(request,
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
     * @return CompletableFuture<ListAimTemplateReportsResponse>
     */
    public CompletableFuture<ListAimTemplateReportsResponse> listAimTemplateReportsAsync(
        ListAimTemplateReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listAimTemplateReports);
    }

    /**
     * 查询模板报表
     *
     * 根据用户指定过滤条件查询指定智能信息模板的解析次数。当日数据需要次日16:00之后才能查询到。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAimTemplateReportsRequest 请求对象
     * @return AsyncInvoker<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse>
     */
    public AsyncInvoker<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> listAimTemplateReportsAsyncInvoker(
        ListAimTemplateReportsRequest request) {
        return new AsyncInvoker<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse>(request,
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
     * @return CompletableFuture<ListAimTemplatesResponse>
     */
    public CompletableFuture<ListAimTemplatesResponse> listAimTemplatesAsync(ListAimTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listAimTemplates);
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
     * @return AsyncInvoker<ListAimTemplatesRequest, ListAimTemplatesResponse>
     */
    public AsyncInvoker<ListAimTemplatesRequest, ListAimTemplatesResponse> listAimTemplatesAsyncInvoker(
        ListAimTemplatesRequest request) {
        return new AsyncInvoker<ListAimTemplatesRequest, ListAimTemplatesResponse>(request,
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
     * @return CompletableFuture<UpdatePersonalTemplateStateResponse>
     */
    public CompletableFuture<UpdatePersonalTemplateStateResponse> updatePersonalTemplateStateAsync(
        UpdatePersonalTemplateStateRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.updatePersonalTemplateState);
    }

    /**
     * 启用或禁用模板实例
     *
     * 根据客户提供的模板ID，启用或禁用智能信息个人模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePersonalTemplateStateRequest 请求对象
     * @return AsyncInvoker<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse>
     */
    public AsyncInvoker<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> updatePersonalTemplateStateAsyncInvoker(
        UpdatePersonalTemplateStateRequest request) {
        return new AsyncInvoker<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse>(request,
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
     * @return CompletableFuture<UploadAimTemplateMaterialResponse>
     */
    public CompletableFuture<UploadAimTemplateMaterialResponse> uploadAimTemplateMaterialAsync(
        UploadAimTemplateMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.uploadAimTemplateMaterial);
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
     * @return AsyncInvoker<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse>
     */
    public AsyncInvoker<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> uploadAimTemplateMaterialAsyncInvoker(
        UploadAimTemplateMaterialRequest request) {
        return new AsyncInvoker<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse>(request,
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
     * @return CompletableFuture<AddVmsCallBackResponse>
     */
    public CompletableFuture<AddVmsCallBackResponse> addVmsCallBackAsync(AddVmsCallBackRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.addVmsCallBack);
    }

    /**
     * 注册智能信息基础版回执URL
     *
     * 用户根据要求创建智能信息基础版回执接口后，可以调用此接口进行注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVmsCallBackRequest 请求对象
     * @return AsyncInvoker<AddVmsCallBackRequest, AddVmsCallBackResponse>
     */
    public AsyncInvoker<AddVmsCallBackRequest, AddVmsCallBackResponse> addVmsCallBackAsyncInvoker(
        AddVmsCallBackRequest request) {
        return new AsyncInvoker<AddVmsCallBackRequest, AddVmsCallBackResponse>(request, KooMessageMeta.addVmsCallBack,
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
     * @return CompletableFuture<CreateVmsSendTaskResponse>
     */
    public CompletableFuture<CreateVmsSendTaskResponse> createVmsSendTaskAsync(CreateVmsSendTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.createVmsSendTask);
    }

    /**
     * 发送智能信息基础版任务
     *
     * 支持用户通过此接口进行智能信息基础版任务发送。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVmsSendTaskRequest 请求对象
     * @return AsyncInvoker<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse>
     */
    public AsyncInvoker<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> createVmsSendTaskAsyncInvoker(
        CreateVmsSendTaskRequest request) {
        return new AsyncInvoker<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse>(request,
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
     * @return CompletableFuture<ListVmsCallbacksResponse>
     */
    public CompletableFuture<ListVmsCallbacksResponse> listVmsCallbacksAsync(ListVmsCallbacksRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listVmsCallbacks);
    }

    /**
     * 查询用户已注册智能信息基础版回执接口
     *
     * 查询所有已注册的智能信息基础版回执接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVmsCallbacksRequest 请求对象
     * @return AsyncInvoker<ListVmsCallbacksRequest, ListVmsCallbacksResponse>
     */
    public AsyncInvoker<ListVmsCallbacksRequest, ListVmsCallbacksResponse> listVmsCallbacksAsyncInvoker(
        ListVmsCallbacksRequest request) {
        return new AsyncInvoker<ListVmsCallbacksRequest, ListVmsCallbacksResponse>(request,
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
     * @return CompletableFuture<ListVmsSendTasksResponse>
     */
    public CompletableFuture<ListVmsSendTasksResponse> listVmsSendTasksAsync(ListVmsSendTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listVmsSendTasks);
    }

    /**
     * 查询智能信息基础版发送任务
     *
     * 支持用户根据过滤条件查询智能信息基础版任务列表。包括：发送任务名称、智能信息基础版模板ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVmsSendTasksRequest 请求对象
     * @return AsyncInvoker<ListVmsSendTasksRequest, ListVmsSendTasksResponse>
     */
    public AsyncInvoker<ListVmsSendTasksRequest, ListVmsSendTasksResponse> listVmsSendTasksAsyncInvoker(
        ListVmsSendTasksRequest request) {
        return new AsyncInvoker<ListVmsSendTasksRequest, ListVmsSendTasksResponse>(request,
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
     * @return CompletableFuture<CreateVmsTemplateResponse>
     */
    public CompletableFuture<CreateVmsTemplateResponse> createVmsTemplateAsync(CreateVmsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.createVmsTemplate);
    }

    /**
     * 新建智能信息基础版模板
     *
     * 支持用户通过此接口创建智能信息基础版模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVmsTemplateRequest 请求对象
     * @return AsyncInvoker<CreateVmsTemplateRequest, CreateVmsTemplateResponse>
     */
    public AsyncInvoker<CreateVmsTemplateRequest, CreateVmsTemplateResponse> createVmsTemplateAsyncInvoker(
        CreateVmsTemplateRequest request) {
        return new AsyncInvoker<CreateVmsTemplateRequest, CreateVmsTemplateResponse>(request,
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
     * @return CompletableFuture<ListVmsTemplateStatusResponse>
     */
    public CompletableFuture<ListVmsTemplateStatusResponse> listVmsTemplateStatusAsync(
        ListVmsTemplateStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, KooMessageMeta.listVmsTemplateStatus);
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
     * @return AsyncInvoker<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse>
     */
    public AsyncInvoker<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> listVmsTemplateStatusAsyncInvoker(
        ListVmsTemplateStatusRequest request) {
        return new AsyncInvoker<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse>(request,
            KooMessageMeta.listVmsTemplateStatus, hcClient);
    }

}
