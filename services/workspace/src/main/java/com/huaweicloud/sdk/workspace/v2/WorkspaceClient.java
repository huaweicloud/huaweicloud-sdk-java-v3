package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.workspace.v2.model.*;

public class WorkspaceClient {

    protected HcClient hcClient;

    public WorkspaceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceClient> newBuilder() {
        return new ClientBuilder<>(WorkspaceClient::new);
    }

    /**
     * 删除接入策略
     *
     * 该接口用于删除指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAccessPoliciesRequest 请求对象
     * @return BatchDeleteAccessPoliciesResponse
     */
    public BatchDeleteAccessPoliciesResponse batchDeleteAccessPolicies(BatchDeleteAccessPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteAccessPolicies);
    }

    /**
     * 删除接入策略
     *
     * 该接口用于删除指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAccessPoliciesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse>
     */
    public SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> batchDeleteAccessPoliciesInvoker(
        BatchDeleteAccessPoliciesRequest request) {
        return new SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse>(request,
            WorkspaceMeta.batchDeleteAccessPolicies, hcClient);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessPolicyRequest 请求对象
     * @return CreateAccessPolicyResponse
     */
    public CreateAccessPolicyResponse createAccessPolicy(CreateAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createAccessPolicy);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessPolicyRequest 请求对象
     * @return SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse>
     */
    public SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicyInvoker(
        CreateAccessPolicyRequest request) {
        return new SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse>(request,
            WorkspaceMeta.createAccessPolicy, hcClient);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPoliciesRequest 请求对象
     * @return ListAccessPoliciesResponse
     */
    public ListAccessPoliciesResponse listAccessPolicies(ListAccessPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAccessPolicies);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPoliciesRequest 请求对象
     * @return SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse>
     */
    public SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPoliciesInvoker(
        ListAccessPoliciesRequest request) {
        return new SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse>(request,
            WorkspaceMeta.listAccessPolicies, hcClient);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPolicyObjectsRequest 请求对象
     * @return ListAccessPolicyObjectsResponse
     */
    public ListAccessPolicyObjectsResponse listAccessPolicyObjects(ListAccessPolicyObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAccessPolicyObjects);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessPolicyObjectsRequest 请求对象
     * @return SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse>
     */
    public SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjectsInvoker(
        ListAccessPolicyObjectsRequest request) {
        return new SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse>(request,
            WorkspaceMeta.listAccessPolicyObjects, hcClient);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessPolicyObjectsRequest 请求对象
     * @return UpdateAccessPolicyObjectsResponse
     */
    public UpdateAccessPolicyObjectsResponse updateAccessPolicyObjects(UpdateAccessPolicyObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAccessPolicyObjects);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessPolicyObjectsRequest 请求对象
     * @return SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse>
     */
    public SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjectsInvoker(
        UpdateAccessPolicyObjectsRequest request) {
        return new SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse>(request,
            WorkspaceMeta.updateAccessPolicyObjects, hcClient);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssistAuthConfigRequest 请求对象
     * @return ShowAssistAuthConfigResponse
     */
    public ShowAssistAuthConfigResponse showAssistAuthConfig(ShowAssistAuthConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showAssistAuthConfig);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssistAuthConfigRequest 请求对象
     * @return SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse>
     */
    public SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfigInvoker(
        ShowAssistAuthConfigRequest request) {
        return new SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse>(request,
            WorkspaceMeta.showAssistAuthConfig, hcClient);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssistAuthMethodConfigRequest 请求对象
     * @return UpdateAssistAuthMethodConfigResponse
     */
    public UpdateAssistAuthMethodConfigResponse updateAssistAuthMethodConfig(
        UpdateAssistAuthMethodConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAssistAuthMethodConfig);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssistAuthMethodConfigRequest 请求对象
     * @return SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse>
     */
    public SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfigInvoker(
        UpdateAssistAuthMethodConfigRequest request) {
        return new SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse>(request,
            WorkspaceMeta.updateAssistAuthMethodConfig, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAvailabilityZones);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
            WorkspaceMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportUserLoginInfoNewRequest 请求对象
     * @return ExportUserLoginInfoNewResponse
     */
    public ExportUserLoginInfoNewResponse exportUserLoginInfoNew(ExportUserLoginInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUserLoginInfoNew);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportUserLoginInfoNewRequest 请求对象
     * @return SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>
     */
    public SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNewInvoker(
        ExportUserLoginInfoNewRequest request) {
        return new SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>(request,
            WorkspaceMeta.exportUserLoginInfoNew, hcClient);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryOnlineInfoNewRequest 请求对象
     * @return ListHistoryOnlineInfoNewResponse
     */
    public ListHistoryOnlineInfoNewResponse listHistoryOnlineInfoNew(ListHistoryOnlineInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listHistoryOnlineInfoNew);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHistoryOnlineInfoNewRequest 请求对象
     * @return SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>
     */
    public SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewInvoker(
        ListHistoryOnlineInfoNewRequest request) {
        return new SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>(request,
            WorkspaceMeta.listHistoryOnlineInfoNew, hcClient);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoginRecordsNewRequest 请求对象
     * @return ListLoginRecordsNewResponse
     */
    public ListLoginRecordsNewResponse listLoginRecordsNew(ListLoginRecordsNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listLoginRecordsNew);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLoginRecordsNewRequest 请求对象
     * @return SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>
     */
    public SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNewInvoker(
        ListLoginRecordsNewRequest request) {
        return new SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>(request,
            WorkspaceMeta.listLoginRecordsNew, hcClient);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDesktopsRequest 请求对象
     * @return BatchDeleteDesktopsResponse
     */
    public BatchDeleteDesktopsResponse batchDeleteDesktops(BatchDeleteDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktops);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteDesktopsRequest 请求对象
     * @return SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>
     */
    public SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktopsInvoker(
        BatchDeleteDesktopsRequest request) {
        return new SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>(request,
            WorkspaceMeta.batchDeleteDesktops, hcClient);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRunDesktopsRequest 请求对象
     * @return BatchRunDesktopsResponse
     */
    public BatchRunDesktopsResponse batchRunDesktops(BatchRunDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchRunDesktops);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRunDesktopsRequest 请求对象
     * @return SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>
     */
    public SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktopsInvoker(
        BatchRunDesktopsRequest request) {
        return new SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>(request,
            WorkspaceMeta.batchRunDesktops, hcClient);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopRequest 请求对象
     * @return CreateDesktopResponse
     */
    public CreateDesktopResponse createDesktop(CreateDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktop);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopRequest 请求对象
     * @return SyncInvoker<CreateDesktopRequest, CreateDesktopResponse>
     */
    public SyncInvoker<CreateDesktopRequest, CreateDesktopResponse> createDesktopInvoker(CreateDesktopRequest request) {
        return new SyncInvoker<CreateDesktopRequest, CreateDesktopResponse>(request, WorkspaceMeta.createDesktop,
            hcClient);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopRequest 请求对象
     * @return DeleteDesktopResponse
     */
    public DeleteDesktopResponse deleteDesktop(DeleteDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteDesktop);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopRequest 请求对象
     * @return SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>
     */
    public SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktopInvoker(DeleteDesktopRequest request) {
        return new SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>(request, WorkspaceMeta.deleteDesktop,
            hcClient);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsRequest 请求对象
     * @return ListDesktopsResponse
     */
    public ListDesktopsResponse listDesktops(ListDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktops);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsRequest 请求对象
     * @return SyncInvoker<ListDesktopsRequest, ListDesktopsResponse>
     */
    public SyncInvoker<ListDesktopsRequest, ListDesktopsResponse> listDesktopsInvoker(ListDesktopsRequest request) {
        return new SyncInvoker<ListDesktopsRequest, ListDesktopsResponse>(request, WorkspaceMeta.listDesktops,
            hcClient);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsDetailRequest 请求对象
     * @return ListDesktopsDetailResponse
     */
    public ListDesktopsDetailResponse listDesktopsDetail(ListDesktopsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopsDetail);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDesktopsDetailRequest 请求对象
     * @return SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>
     */
    public SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetailInvoker(
        ListDesktopsDetailRequest request) {
        return new SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>(request,
            WorkspaceMeta.listDesktopsDetail, hcClient);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeDesktopRequest 请求对象
     * @return ResizeDesktopResponse
     */
    public ResizeDesktopResponse resizeDesktop(ResizeDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.resizeDesktop);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeDesktopRequest 请求对象
     * @return SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>
     */
    public SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktopInvoker(ResizeDesktopRequest request) {
        return new SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>(request, WorkspaceMeta.resizeDesktop,
            hcClient);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDesktopDetailRequest 请求对象
     * @return ShowDesktopDetailResponse
     */
    public ShowDesktopDetailResponse showDesktopDetail(ShowDesktopDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopDetail);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDesktopDetailRequest 请求对象
     * @return SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>
     */
    public SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetailInvoker(
        ShowDesktopDetailRequest request) {
        return new SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>(request,
            WorkspaceMeta.showDesktopDetail, hcClient);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listImages);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return SyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public SyncInvoker<ListImagesRequest, ListImagesResponse> listImagesInvoker(ListImagesRequest request) {
        return new SyncInvoker<ListImagesRequest, ListImagesResponse>(request, WorkspaceMeta.listImages, hcClient);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListItaSubJobsRequest 请求对象
     * @return ListItaSubJobsResponse
     */
    public ListItaSubJobsResponse listItaSubJobs(ListItaSubJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listItaSubJobs);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListItaSubJobsRequest 请求对象
     * @return SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>
     */
    public SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobsInvoker(
        ListItaSubJobsRequest request) {
        return new SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>(request, WorkspaceMeta.listItaSubJobs,
            hcClient);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listProducts);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<ListProductsRequest, ListProductsResponse>(request, WorkspaceMeta.listProducts,
            hcClient);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showQuotas);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, WorkspaceMeta.showQuotas, hcClient);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTerminalsBindingDesktopsRequest 请求对象
     * @return CreateTerminalsBindingDesktopsResponse
     */
    public CreateTerminalsBindingDesktopsResponse createTerminalsBindingDesktops(
        CreateTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createTerminalsBindingDesktops);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktopsInvoker(
        CreateTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse>(request,
            WorkspaceMeta.createTerminalsBindingDesktops, hcClient);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return DeleteTerminalsBindingDesktopsResponse
     */
    public DeleteTerminalsBindingDesktopsResponse deleteTerminalsBindingDesktops(
        DeleteTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteTerminalsBindingDesktops);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktopsInvoker(
        DeleteTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse>(request,
            WorkspaceMeta.deleteTerminalsBindingDesktops, hcClient);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsRequest 请求对象
     * @return ListTerminalsBindingDesktopsResponse
     */
    public ListTerminalsBindingDesktopsResponse listTerminalsBindingDesktops(
        ListTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktops);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktopsInvoker(
        ListTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse>(request,
            WorkspaceMeta.listTerminalsBindingDesktops, hcClient);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return ListTerminalsBindingDesktopsConfigResponse
     */
    public ListTerminalsBindingDesktopsConfigResponse listTerminalsBindingDesktopsConfig(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktopsConfig);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse>
     */
    public SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfigInvoker(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return new SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse>(
            request, WorkspaceMeta.listTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return UpdateTerminalsBindingDesktopsResponse
     */
    public UpdateTerminalsBindingDesktopsResponse updateTerminalsBindingDesktops(
        UpdateTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktops);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktopsInvoker(
        UpdateTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse>(request,
            WorkspaceMeta.updateTerminalsBindingDesktops, hcClient);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return UpdateTerminalsBindingDesktopsConfigResponse
     */
    public UpdateTerminalsBindingDesktopsConfigResponse updateTerminalsBindingDesktopsConfig(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse>
     */
    public SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfigInvoker(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return new SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse>(
            request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteOtpDevicesRequest 请求对象
     * @return BatchDeleteOtpDevicesResponse
     */
    public BatchDeleteOtpDevicesResponse batchDeleteOtpDevices(BatchDeleteOtpDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteOtpDevices);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteOtpDevicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse>
     */
    public SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevicesInvoker(
        BatchDeleteOtpDevicesRequest request) {
        return new SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse>(request,
            WorkspaceMeta.batchDeleteOtpDevices, hcClient);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeUserStatusRequest 请求对象
     * @return ChangeUserStatusResponse
     */
    public ChangeUserStatusResponse changeUserStatus(ChangeUserStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.changeUserStatus);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeUserStatusRequest 请求对象
     * @return SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse>
     */
    public SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatusInvoker(
        ChangeUserStatusRequest request) {
        return new SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse>(request,
            WorkspaceMeta.changeUserStatus, hcClient);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopUserRequest 请求对象
     * @return CreateDesktopUserResponse
     */
    public CreateDesktopUserResponse createDesktopUser(CreateDesktopUserRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopUser);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDesktopUserRequest 请求对象
     * @return SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>
     */
    public SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUserInvoker(
        CreateDesktopUserRequest request) {
        return new SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>(request,
            WorkspaceMeta.createDesktopUser, hcClient);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteUser);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<DeleteUserRequest, DeleteUserResponse>(request, WorkspaceMeta.deleteUser, hcClient);
    }

    /**
     * 查询MFA设备
     *
     * 该接口用于查询相应用户下面的MFA设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOtpDevicesByUserIdRequest 请求对象
     * @return ListOtpDevicesByUserIdResponse
     */
    public ListOtpDevicesByUserIdResponse listOtpDevicesByUserId(ListOtpDevicesByUserIdRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listOtpDevicesByUserId);
    }

    /**
     * 查询MFA设备
     *
     * 该接口用于查询相应用户下面的MFA设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOtpDevicesByUserIdRequest 请求对象
     * @return SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse>
     */
    public SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserIdInvoker(
        ListOtpDevicesByUserIdRequest request) {
        return new SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse>(request,
            WorkspaceMeta.listOtpDevicesByUserId, hcClient);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserDetailRequest 请求对象
     * @return ListUserDetailResponse
     */
    public ListUserDetailResponse listUserDetail(ListUserDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUserDetail);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserDetailRequest 请求对象
     * @return SyncInvoker<ListUserDetailRequest, ListUserDetailResponse>
     */
    public SyncInvoker<ListUserDetailRequest, ListUserDetailResponse> listUserDetailInvoker(
        ListUserDetailRequest request) {
        return new SyncInvoker<ListUserDetailRequest, ListUserDetailResponse>(request, WorkspaceMeta.listUserDetail,
            hcClient);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUsers);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<ListUsersRequest, ListUsersResponse>(request, WorkspaceMeta.listUsers, hcClient);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserInfoRequest 请求对象
     * @return UpdateUserInfoResponse
     */
    public UpdateUserInfoResponse updateUserInfo(UpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateUserInfo);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserInfoRequest 请求对象
     * @return SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>
     */
    public SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfoInvoker(
        UpdateUserInfoRequest request) {
        return new SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>(request, WorkspaceMeta.updateUserInfo,
            hcClient);
    }

    /**
     * 增加桌面磁盘
     *
     * 增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVolumesRequest 请求对象
     * @return AddVolumesResponse
     */
    public AddVolumesResponse addVolumes(AddVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addVolumes);
    }

    /**
     * 增加桌面磁盘
     *
     * 增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVolumesRequest 请求对象
     * @return SyncInvoker<AddVolumesRequest, AddVolumesResponse>
     */
    public SyncInvoker<AddVolumesRequest, AddVolumesResponse> addVolumesInvoker(AddVolumesRequest request) {
        return new SyncInvoker<AddVolumesRequest, AddVolumesResponse>(request, WorkspaceMeta.addVolumes, hcClient);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopVolumesRequest 请求对象
     * @return DeleteDesktopVolumesResponse
     */
    public DeleteDesktopVolumesResponse deleteDesktopVolumes(DeleteDesktopVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteDesktopVolumes);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDesktopVolumesRequest 请求对象
     * @return SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse>
     */
    public SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumesInvoker(
        DeleteDesktopVolumesRequest request) {
        return new SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse>(request,
            WorkspaceMeta.deleteDesktopVolumes, hcClient);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandVolumesRequest 请求对象
     * @return ExpandVolumesResponse
     */
    public ExpandVolumesResponse expandVolumes(ExpandVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.expandVolumes);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandVolumesRequest 请求对象
     * @return SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>
     */
    public SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumesInvoker(ExpandVolumesRequest request) {
        return new SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>(request, WorkspaceMeta.expandVolumes,
            hcClient);
    }

    /**
     * 开通云办公服务
     *
     * 该接口用于开通云办公服务。
     * 
     * 作为异步接口，调用成功说明云办公服务后台收到了开通请求，但服务是否开通成功需要通过任务查询接口(GET /v2/{project_id}/workspace-sub-jobs)查询该任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyWorkspaceRequest 请求对象
     * @return ApplyWorkspaceResponse
     */
    public ApplyWorkspaceResponse applyWorkspace(ApplyWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.applyWorkspace);
    }

    /**
     * 开通云办公服务
     *
     * 该接口用于开通云办公服务。
     * 
     * 作为异步接口，调用成功说明云办公服务后台收到了开通请求，但服务是否开通成功需要通过任务查询接口(GET /v2/{project_id}/workspace-sub-jobs)查询该任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyWorkspaceRequest 请求对象
     * @return SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>
     */
    public SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspaceInvoker(
        ApplyWorkspaceRequest request) {
        return new SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>(request, WorkspaceMeta.applyWorkspace,
            hcClient);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelWorkspaceRequest 请求对象
     * @return CancelWorkspaceResponse
     */
    public CancelWorkspaceResponse cancelWorkspace(CancelWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.cancelWorkspace);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelWorkspaceRequest 请求对象
     * @return SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>
     */
    public SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspaceInvoker(
        CancelWorkspaceRequest request) {
        return new SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>(request, WorkspaceMeta.cancelWorkspace,
            hcClient);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspacesRequest 请求对象
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listWorkspaces);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkspacesRequest 请求对象
     * @return SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesInvoker(
        ListWorkspacesRequest request) {
        return new SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>(request, WorkspaceMeta.listWorkspaces,
            hcClient);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkspaceLockRequest 请求对象
     * @return ShowWorkspaceLockResponse
     */
    public ShowWorkspaceLockResponse showWorkspaceLock(ShowWorkspaceLockRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showWorkspaceLock);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkspaceLockRequest 请求对象
     * @return SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse>
     */
    public SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> showWorkspaceLockInvoker(
        ShowWorkspaceLockRequest request) {
        return new SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse>(request,
            WorkspaceMeta.showWorkspaceLock, hcClient);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnlockWorkspaceRequest 请求对象
     * @return UnlockWorkspaceResponse
     */
    public UnlockWorkspaceResponse unlockWorkspace(UnlockWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.unlockWorkspace);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnlockWorkspaceRequest 请求对象
     * @return SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse>
     */
    public SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse> unlockWorkspaceInvoker(
        UnlockWorkspaceRequest request) {
        return new SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse>(request, WorkspaceMeta.unlockWorkspace,
            hcClient);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateWorkspace);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>(request, WorkspaceMeta.updateWorkspace,
            hcClient);
    }

}
