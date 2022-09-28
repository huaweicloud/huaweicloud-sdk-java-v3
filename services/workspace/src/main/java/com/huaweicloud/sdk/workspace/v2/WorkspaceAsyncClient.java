package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.workspace.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class WorkspaceAsyncClient {

    protected HcClient hcClient;

    public WorkspaceAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceAsyncClient> newBuilder() {
        return new ClientBuilder<>(WorkspaceAsyncClient::new);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZonesResponse>
     */
    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(
        ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAvailabilityZones);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>(request,
            WorkspaceMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportUserLoginInfoNewRequest 请求对象
     * @return CompletableFuture<ExportUserLoginInfoNewResponse>
     */
    public CompletableFuture<ExportUserLoginInfoNewResponse> exportUserLoginInfoNewAsync(
        ExportUserLoginInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUserLoginInfoNew);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportUserLoginInfoNewRequest 请求对象
     * @return AsyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>
     */
    public AsyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNewAsyncInvoker(
        ExportUserLoginInfoNewRequest request) {
        return new AsyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>(request,
            WorkspaceMeta.exportUserLoginInfoNew, hcClient);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHistoryOnlineInfoNewRequest 请求对象
     * @return CompletableFuture<ListHistoryOnlineInfoNewResponse>
     */
    public CompletableFuture<ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewAsync(
        ListHistoryOnlineInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listHistoryOnlineInfoNew);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListHistoryOnlineInfoNewRequest 请求对象
     * @return AsyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>
     */
    public AsyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewAsyncInvoker(
        ListHistoryOnlineInfoNewRequest request) {
        return new AsyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>(request,
            WorkspaceMeta.listHistoryOnlineInfoNew, hcClient);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLoginRecordsNewRequest 请求对象
     * @return CompletableFuture<ListLoginRecordsNewResponse>
     */
    public CompletableFuture<ListLoginRecordsNewResponse> listLoginRecordsNewAsync(ListLoginRecordsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listLoginRecordsNew);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLoginRecordsNewRequest 请求对象
     * @return AsyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>
     */
    public AsyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNewAsyncInvoker(
        ListLoginRecordsNewRequest request) {
        return new AsyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>(request,
            WorkspaceMeta.listLoginRecordsNew, hcClient);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteDesktopsRequest 请求对象
     * @return CompletableFuture<BatchDeleteDesktopsResponse>
     */
    public CompletableFuture<BatchDeleteDesktopsResponse> batchDeleteDesktopsAsync(BatchDeleteDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktops);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteDesktopsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>
     */
    public AsyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktopsAsyncInvoker(
        BatchDeleteDesktopsRequest request) {
        return new AsyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>(request,
            WorkspaceMeta.batchDeleteDesktops, hcClient);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机和重启。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchRunDesktopsRequest 请求对象
     * @return CompletableFuture<BatchRunDesktopsResponse>
     */
    public CompletableFuture<BatchRunDesktopsResponse> batchRunDesktopsAsync(BatchRunDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchRunDesktops);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机和重启。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchRunDesktopsRequest 请求对象
     * @return AsyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>
     */
    public AsyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktopsAsyncInvoker(
        BatchRunDesktopsRequest request) {
        return new AsyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>(request,
            WorkspaceMeta.batchRunDesktops, hcClient);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDesktopRequest 请求对象
     * @return CompletableFuture<CreateDesktopResponse>
     */
    public CompletableFuture<CreateDesktopResponse> createDesktopAsync(CreateDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktop);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDesktopRequest 请求对象
     * @return AsyncInvoker<CreateDesktopRequest, CreateDesktopResponse>
     */
    public AsyncInvoker<CreateDesktopRequest, CreateDesktopResponse> createDesktopAsyncInvoker(
        CreateDesktopRequest request) {
        return new AsyncInvoker<CreateDesktopRequest, CreateDesktopResponse>(request, WorkspaceMeta.createDesktop,
            hcClient);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDesktopRequest 请求对象
     * @return CompletableFuture<DeleteDesktopResponse>
     */
    public CompletableFuture<DeleteDesktopResponse> deleteDesktopAsync(DeleteDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteDesktop);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDesktopRequest 请求对象
     * @return AsyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>
     */
    public AsyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktopAsyncInvoker(
        DeleteDesktopRequest request) {
        return new AsyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>(request, WorkspaceMeta.deleteDesktop,
            hcClient);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDesktopsRequest 请求对象
     * @return CompletableFuture<ListDesktopsResponse>
     */
    public CompletableFuture<ListDesktopsResponse> listDesktopsAsync(ListDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktops);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDesktopsRequest 请求对象
     * @return AsyncInvoker<ListDesktopsRequest, ListDesktopsResponse>
     */
    public AsyncInvoker<ListDesktopsRequest, ListDesktopsResponse> listDesktopsAsyncInvoker(
        ListDesktopsRequest request) {
        return new AsyncInvoker<ListDesktopsRequest, ListDesktopsResponse>(request, WorkspaceMeta.listDesktops,
            hcClient);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDesktopsDetailRequest 请求对象
     * @return CompletableFuture<ListDesktopsDetailResponse>
     */
    public CompletableFuture<ListDesktopsDetailResponse> listDesktopsDetailAsync(ListDesktopsDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopsDetail);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDesktopsDetailRequest 请求对象
     * @return AsyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>
     */
    public AsyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetailAsyncInvoker(
        ListDesktopsDetailRequest request) {
        return new AsyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>(request,
            WorkspaceMeta.listDesktopsDetail, hcClient);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResizeDesktopRequest 请求对象
     * @return CompletableFuture<ResizeDesktopResponse>
     */
    public CompletableFuture<ResizeDesktopResponse> resizeDesktopAsync(ResizeDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.resizeDesktop);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResizeDesktopRequest 请求对象
     * @return AsyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>
     */
    public AsyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktopAsyncInvoker(
        ResizeDesktopRequest request) {
        return new AsyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>(request, WorkspaceMeta.resizeDesktop,
            hcClient);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDesktopDetailRequest 请求对象
     * @return CompletableFuture<ShowDesktopDetailResponse>
     */
    public CompletableFuture<ShowDesktopDetailResponse> showDesktopDetailAsync(ShowDesktopDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopDetail);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDesktopDetailRequest 请求对象
     * @return AsyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>
     */
    public AsyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetailAsyncInvoker(
        ShowDesktopDetailRequest request) {
        return new AsyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>(request,
            WorkspaceMeta.showDesktopDetail, hcClient);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return CompletableFuture<ListImagesResponse>
     */
    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listImages);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListImagesRequest 请求对象
     * @return AsyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public AsyncInvoker<ListImagesRequest, ListImagesResponse> listImagesAsyncInvoker(ListImagesRequest request) {
        return new AsyncInvoker<ListImagesRequest, ListImagesResponse>(request, WorkspaceMeta.listImages, hcClient);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListItaSubJobsRequest 请求对象
     * @return CompletableFuture<ListItaSubJobsResponse>
     */
    public CompletableFuture<ListItaSubJobsResponse> listItaSubJobsAsync(ListItaSubJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listItaSubJobs);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListItaSubJobsRequest 请求对象
     * @return AsyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>
     */
    public AsyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobsAsyncInvoker(
        ListItaSubJobsRequest request) {
        return new AsyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>(request, WorkspaceMeta.listItaSubJobs,
            hcClient);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listProducts);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<ListProductsRequest, ListProductsResponse>(request, WorkspaceMeta.listProducts,
            hcClient);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDesktopUserRequest 请求对象
     * @return CompletableFuture<CreateDesktopUserResponse>
     */
    public CompletableFuture<CreateDesktopUserResponse> createDesktopUserAsync(CreateDesktopUserRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktopUser);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDesktopUserRequest 请求对象
     * @return AsyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>
     */
    public AsyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUserAsyncInvoker(
        CreateDesktopUserRequest request) {
        return new AsyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>(request,
            WorkspaceMeta.createDesktopUser, hcClient);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteUser);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<DeleteUserRequest, DeleteUserResponse>(request, WorkspaceMeta.deleteUser, hcClient);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListUserDetailRequest 请求对象
     * @return CompletableFuture<ListUserDetailResponse>
     */
    public CompletableFuture<ListUserDetailResponse> listUserDetailAsync(ListUserDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUserDetail);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListUserDetailRequest 请求对象
     * @return AsyncInvoker<ListUserDetailRequest, ListUserDetailResponse>
     */
    public AsyncInvoker<ListUserDetailRequest, ListUserDetailResponse> listUserDetailAsyncInvoker(
        ListUserDetailRequest request) {
        return new AsyncInvoker<ListUserDetailRequest, ListUserDetailResponse>(request, WorkspaceMeta.listUserDetail,
            hcClient);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUsers);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<ListUsersRequest, ListUsersResponse>(request, WorkspaceMeta.listUsers, hcClient);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateUserInfoRequest 请求对象
     * @return CompletableFuture<UpdateUserInfoResponse>
     */
    public CompletableFuture<UpdateUserInfoResponse> updateUserInfoAsync(UpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateUserInfo);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateUserInfoRequest 请求对象
     * @return AsyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>
     */
    public AsyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfoAsyncInvoker(
        UpdateUserInfoRequest request) {
        return new AsyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>(request, WorkspaceMeta.updateUserInfo,
            hcClient);
    }

    /**
     * 增加桌面磁盘
     *
     * 增加桌面磁盘。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddVolumesRequest 请求对象
     * @return CompletableFuture<AddVolumesResponse>
     */
    public CompletableFuture<AddVolumesResponse> addVolumesAsync(AddVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addVolumes);
    }

    /**
     * 增加桌面磁盘
     *
     * 增加桌面磁盘。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddVolumesRequest 请求对象
     * @return AsyncInvoker<AddVolumesRequest, AddVolumesResponse>
     */
    public AsyncInvoker<AddVolumesRequest, AddVolumesResponse> addVolumesAsyncInvoker(AddVolumesRequest request) {
        return new AsyncInvoker<AddVolumesRequest, AddVolumesResponse>(request, WorkspaceMeta.addVolumes, hcClient);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExpandVolumesRequest 请求对象
     * @return CompletableFuture<ExpandVolumesResponse>
     */
    public CompletableFuture<ExpandVolumesResponse> expandVolumesAsync(ExpandVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.expandVolumes);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExpandVolumesRequest 请求对象
     * @return AsyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>
     */
    public AsyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumesAsyncInvoker(
        ExpandVolumesRequest request) {
        return new AsyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>(request, WorkspaceMeta.expandVolumes,
            hcClient);
    }

    /**
     * 开通云办公服务
     *
     * 该接口用于开通云办公服务。
     * 
     * 作为异步接口，调用成功说明云办公服务后台收到了开通请求，但服务是否开通成功需要通过任务查询接口(GET /v2/{project_id}/workspace-sub-jobs)查询该任务的执行状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ApplyWorkspaceRequest 请求对象
     * @return CompletableFuture<ApplyWorkspaceResponse>
     */
    public CompletableFuture<ApplyWorkspaceResponse> applyWorkspaceAsync(ApplyWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.applyWorkspace);
    }

    /**
     * 开通云办公服务
     *
     * 该接口用于开通云办公服务。
     * 
     * 作为异步接口，调用成功说明云办公服务后台收到了开通请求，但服务是否开通成功需要通过任务查询接口(GET /v2/{project_id}/workspace-sub-jobs)查询该任务的执行状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ApplyWorkspaceRequest 请求对象
     * @return AsyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>
     */
    public AsyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspaceAsyncInvoker(
        ApplyWorkspaceRequest request) {
        return new AsyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>(request, WorkspaceMeta.applyWorkspace,
            hcClient);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelWorkspaceRequest 请求对象
     * @return CompletableFuture<CancelWorkspaceResponse>
     */
    public CompletableFuture<CancelWorkspaceResponse> cancelWorkspaceAsync(CancelWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.cancelWorkspace);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelWorkspaceRequest 请求对象
     * @return AsyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>
     */
    public AsyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspaceAsyncInvoker(
        CancelWorkspaceRequest request) {
        return new AsyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>(request, WorkspaceMeta.cancelWorkspace,
            hcClient);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkspacesRequest 请求对象
     * @return CompletableFuture<ListWorkspacesResponse>
     */
    public CompletableFuture<ListWorkspacesResponse> listWorkspacesAsync(ListWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listWorkspaces);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkspacesRequest 请求对象
     * @return AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesAsyncInvoker(
        ListWorkspacesRequest request) {
        return new AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>(request, WorkspaceMeta.listWorkspaces,
            hcClient);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return CompletableFuture<UpdateWorkspaceResponse>
     */
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspaceAsync(UpdateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateWorkspace);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceAsyncInvoker(
        UpdateWorkspaceRequest request) {
        return new AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>(request, WorkspaceMeta.updateWorkspace,
            hcClient);
    }

}
