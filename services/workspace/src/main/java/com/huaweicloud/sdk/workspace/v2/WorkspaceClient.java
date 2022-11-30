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
