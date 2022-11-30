package com.huaweicloud.sdk.cph.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cph.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class CphAsyncClient {

    protected HcClient hcClient;

    public CphAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CphAsyncClient> newBuilder() {
        return new ClientBuilder<>(CphAsyncClient::new);
    }

    /**
     * 导出云手机数据
     *
     * 批量导出云手机中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExportCloudPhoneDataRequest 请求对象
     * @return CompletableFuture<BatchExportCloudPhoneDataResponse>
     */
    public CompletableFuture<BatchExportCloudPhoneDataResponse> batchExportCloudPhoneDataAsync(
        BatchExportCloudPhoneDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.batchExportCloudPhoneData);
    }

    /**
     * 导出云手机数据
     *
     * 批量导出云手机中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExportCloudPhoneDataRequest 请求对象
     * @return AsyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse>
     */
    public AsyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse> batchExportCloudPhoneDataAsyncInvoker(
        BatchExportCloudPhoneDataRequest request) {
        return new AsyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse>(request,
            CphMeta.batchExportCloudPhoneData, hcClient);
    }

    /**
     * 恢复云手机数据
     *
     * 导入数据到手机中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportCloudPhoneDataRequest 请求对象
     * @return CompletableFuture<BatchImportCloudPhoneDataResponse>
     */
    public CompletableFuture<BatchImportCloudPhoneDataResponse> batchImportCloudPhoneDataAsync(
        BatchImportCloudPhoneDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.batchImportCloudPhoneData);
    }

    /**
     * 恢复云手机数据
     *
     * 导入数据到手机中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportCloudPhoneDataRequest 请求对象
     * @return AsyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse>
     */
    public AsyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse> batchImportCloudPhoneDataAsyncInvoker(
        BatchImportCloudPhoneDataRequest request) {
        return new AsyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse>(request,
            CphMeta.batchImportCloudPhoneData, hcClient);
    }

    /**
     * 迁移云手机
     *
     * 批量迁移整台云手机，包括云手机的系统盘数据和数据盘数据。该接口为异步接口，迁移完成的时间和手机的数据量有一定关系，整机数据大小为11G时，迁移时间大约为3-5分钟。迁移前请关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchMigrateCloudPhoneRequest 请求对象
     * @return CompletableFuture<BatchMigrateCloudPhoneResponse>
     */
    public CompletableFuture<BatchMigrateCloudPhoneResponse> batchMigrateCloudPhoneAsync(
        BatchMigrateCloudPhoneRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.batchMigrateCloudPhone);
    }

    /**
     * 迁移云手机
     *
     * 批量迁移整台云手机，包括云手机的系统盘数据和数据盘数据。该接口为异步接口，迁移完成的时间和手机的数据量有一定关系，整机数据大小为11G时，迁移时间大约为3-5分钟。迁移前请关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchMigrateCloudPhoneRequest 请求对象
     * @return AsyncInvoker<BatchMigrateCloudPhoneRequest, BatchMigrateCloudPhoneResponse>
     */
    public AsyncInvoker<BatchMigrateCloudPhoneRequest, BatchMigrateCloudPhoneResponse> batchMigrateCloudPhoneAsyncInvoker(
        BatchMigrateCloudPhoneRequest request) {
        return new AsyncInvoker<BatchMigrateCloudPhoneRequest, BatchMigrateCloudPhoneResponse>(request,
            CphMeta.batchMigrateCloudPhone, hcClient);
    }

    /**
     * 变更云手机服务器规格
     *
     * 变更云手机服务器规格。只有能使用physical.rx1.xlarge.special私有规格的租户才可使用本接口。变更的目标规格也必须为特殊的规格才可变更。接口调用成功后，大约2分钟左右规格会变更结束，在订单中心可以查看到变更的订单状态为成功，且查询服务器的详细信息，可以查看到服务器规格名称已经变成新的规格名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeCloudPhoneServerModelRequest 请求对象
     * @return CompletableFuture<ChangeCloudPhoneServerModelResponse>
     */
    public CompletableFuture<ChangeCloudPhoneServerModelResponse> changeCloudPhoneServerModelAsync(
        ChangeCloudPhoneServerModelRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.changeCloudPhoneServerModel);
    }

    /**
     * 变更云手机服务器规格
     *
     * 变更云手机服务器规格。只有能使用physical.rx1.xlarge.special私有规格的租户才可使用本接口。变更的目标规格也必须为特殊的规格才可变更。接口调用成功后，大约2分钟左右规格会变更结束，在订单中心可以查看到变更的订单状态为成功，且查询服务器的详细信息，可以查看到服务器规格名称已经变成新的规格名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeCloudPhoneServerModelRequest 请求对象
     * @return AsyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse>
     */
    public AsyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse> changeCloudPhoneServerModelAsyncInvoker(
        ChangeCloudPhoneServerModelRequest request) {
        return new AsyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse>(request,
            CphMeta.changeCloudPhoneServerModel, hcClient);
    }

    /**
     * 购买系统定义网络云手机服务器
     *
     * 购买系统定义网络云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCloudPhoneServerRequest 请求对象
     * @return CompletableFuture<CreateCloudPhoneServerResponse>
     */
    public CompletableFuture<CreateCloudPhoneServerResponse> createCloudPhoneServerAsync(
        CreateCloudPhoneServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.createCloudPhoneServer);
    }

    /**
     * 购买系统定义网络云手机服务器
     *
     * 购买系统定义网络云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCloudPhoneServerRequest 请求对象
     * @return AsyncInvoker<CreateCloudPhoneServerRequest, CreateCloudPhoneServerResponse>
     */
    public AsyncInvoker<CreateCloudPhoneServerRequest, CreateCloudPhoneServerResponse> createCloudPhoneServerAsyncInvoker(
        CreateCloudPhoneServerRequest request) {
        return new AsyncInvoker<CreateCloudPhoneServerRequest, CreateCloudPhoneServerResponse>(request,
            CphMeta.createCloudPhoneServer, hcClient);
    }

    /**
     * 购买自定义网络云手机服务器
     *
     * 购买自定义网络的云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNet2CloudPhoneServerRequest 请求对象
     * @return CompletableFuture<CreateNet2CloudPhoneServerResponse>
     */
    public CompletableFuture<CreateNet2CloudPhoneServerResponse> createNet2CloudPhoneServerAsync(
        CreateNet2CloudPhoneServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.createNet2CloudPhoneServer);
    }

    /**
     * 购买自定义网络云手机服务器
     *
     * 购买自定义网络的云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNet2CloudPhoneServerRequest 请求对象
     * @return AsyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse>
     */
    public AsyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse> createNet2CloudPhoneServerAsyncInvoker(
        CreateNet2CloudPhoneServerRequest request) {
        return new AsyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse>(request,
            CphMeta.createNet2CloudPhoneServer, hcClient);
    }

    /**
     * 删除共享应用
     *
     * 在共享应用存储目录中删除共享应用，该功能仅在支持共享应用的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareAppsRequest 请求对象
     * @return CompletableFuture<DeleteShareAppsResponse>
     */
    public CompletableFuture<DeleteShareAppsResponse> deleteShareAppsAsync(DeleteShareAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.deleteShareApps);
    }

    /**
     * 删除共享应用
     *
     * 在共享应用存储目录中删除共享应用，该功能仅在支持共享应用的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareAppsRequest 请求对象
     * @return AsyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse>
     */
    public AsyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse> deleteShareAppsAsyncInvoker(
        DeleteShareAppsRequest request) {
        return new AsyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse>(request, CphMeta.deleteShareApps,
            hcClient);
    }

    /**
     * 删除共享存储文件
     *
     * 删除共享存储目录中文件，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareFilesRequest 请求对象
     * @return CompletableFuture<DeleteShareFilesResponse>
     */
    public CompletableFuture<DeleteShareFilesResponse> deleteShareFilesAsync(DeleteShareFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.deleteShareFiles);
    }

    /**
     * 删除共享存储文件
     *
     * 删除共享存储目录中文件，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareFilesRequest 请求对象
     * @return AsyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse>
     */
    public AsyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse> deleteShareFilesAsyncInvoker(
        DeleteShareFilesRequest request) {
        return new AsyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse>(request, CphMeta.deleteShareFiles,
            hcClient);
    }

    /**
     * 云手机流量导流
     *
     * 手机流量路由修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTrafficRequest 请求对象
     * @return CompletableFuture<ImportTrafficResponse>
     */
    public CompletableFuture<ImportTrafficResponse> importTrafficAsync(ImportTrafficRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.importTraffic);
    }

    /**
     * 云手机流量导流
     *
     * 手机流量路由修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTrafficRequest 请求对象
     * @return AsyncInvoker<ImportTrafficRequest, ImportTrafficResponse>
     */
    public AsyncInvoker<ImportTrafficRequest, ImportTrafficResponse> importTrafficAsyncInvoker(
        ImportTrafficRequest request) {
        return new AsyncInvoker<ImportTrafficRequest, ImportTrafficResponse>(request, CphMeta.importTraffic, hcClient);
    }

    /**
     * 查询手机镜像
     *
     * 根据项目ID查询可用的手机镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneImagesRequest 请求对象
     * @return CompletableFuture<ListCloudPhoneImagesResponse>
     */
    public CompletableFuture<ListCloudPhoneImagesResponse> listCloudPhoneImagesAsync(
        ListCloudPhoneImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhoneImages);
    }

    /**
     * 查询手机镜像
     *
     * 根据项目ID查询可用的手机镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneImagesRequest 请求对象
     * @return AsyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse>
     */
    public AsyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> listCloudPhoneImagesAsyncInvoker(
        ListCloudPhoneImagesRequest request) {
        return new AsyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse>(request,
            CphMeta.listCloudPhoneImages, hcClient);
    }

    /**
     * 查询云手机规格列表
     *
     * 查询或统计云手机的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneModelsRequest 请求对象
     * @return CompletableFuture<ListCloudPhoneModelsResponse>
     */
    public CompletableFuture<ListCloudPhoneModelsResponse> listCloudPhoneModelsAsync(
        ListCloudPhoneModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhoneModels);
    }

    /**
     * 查询云手机规格列表
     *
     * 查询或统计云手机的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneModelsRequest 请求对象
     * @return AsyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse>
     */
    public AsyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> listCloudPhoneModelsAsyncInvoker(
        ListCloudPhoneModelsRequest request) {
        return new AsyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse>(request,
            CphMeta.listCloudPhoneModels, hcClient);
    }

    /**
     * 查询云手机服务器规格列表
     *
     * 查询云手机服务器的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServerModelsRequest 请求对象
     * @return CompletableFuture<ListCloudPhoneServerModelsResponse>
     */
    public CompletableFuture<ListCloudPhoneServerModelsResponse> listCloudPhoneServerModelsAsync(
        ListCloudPhoneServerModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhoneServerModels);
    }

    /**
     * 查询云手机服务器规格列表
     *
     * 查询云手机服务器的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServerModelsRequest 请求对象
     * @return AsyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse>
     */
    public AsyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse> listCloudPhoneServerModelsAsyncInvoker(
        ListCloudPhoneServerModelsRequest request) {
        return new AsyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse>(request,
            CphMeta.listCloudPhoneServerModels, hcClient);
    }

    /**
     * 查询云手机服务器列表
     *
     * 分页查询云手机服务器，云手机服务器列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机服务器，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServersRequest 请求对象
     * @return CompletableFuture<ListCloudPhoneServersResponse>
     */
    public CompletableFuture<ListCloudPhoneServersResponse> listCloudPhoneServersAsync(
        ListCloudPhoneServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhoneServers);
    }

    /**
     * 查询云手机服务器列表
     *
     * 分页查询云手机服务器，云手机服务器列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机服务器，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServersRequest 请求对象
     * @return AsyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse>
     */
    public AsyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse> listCloudPhoneServersAsyncInvoker(
        ListCloudPhoneServersRequest request) {
        return new AsyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse>(request,
            CphMeta.listCloudPhoneServers, hcClient);
    }

    /**
     * 查询云手机列表
     *
     * 分页查询云手机，云手机列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhonesRequest 请求对象
     * @return CompletableFuture<ListCloudPhonesResponse>
     */
    public CompletableFuture<ListCloudPhonesResponse> listCloudPhonesAsync(ListCloudPhonesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhones);
    }

    /**
     * 查询云手机列表
     *
     * 分页查询云手机，云手机列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhonesRequest 请求对象
     * @return AsyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse>
     */
    public AsyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse> listCloudPhonesAsyncInvoker(
        ListCloudPhonesRequest request) {
        return new AsyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse>(request, CphMeta.listCloudPhones,
            hcClient);
    }

    /**
     * 查询编码服务
     *
     * 查询编码服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncodeServersRequest 请求对象
     * @return CompletableFuture<ListEncodeServersResponse>
     */
    public CompletableFuture<ListEncodeServersResponse> listEncodeServersAsync(ListEncodeServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listEncodeServers);
    }

    /**
     * 查询编码服务
     *
     * 查询编码服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncodeServersRequest 请求对象
     * @return AsyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse>
     */
    public AsyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse> listEncodeServersAsyncInvoker(
        ListEncodeServersRequest request) {
        return new AsyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse>(request, CphMeta.listEncodeServers,
            hcClient);
    }

    /**
     * 查询任务执行状态列表
     *
     * 查询同一个request id下的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listJobs);
    }

    /**
     * 查询任务执行状态列表
     *
     * 查询同一个request id下的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<ListJobsRequest, ListJobsResponse>(request, CphMeta.listJobs, hcClient);
    }

    /**
     * 查询共享存储文件
     *
     * 查询共享存储指定路径下的文件列表，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareFilesRequest 请求对象
     * @return CompletableFuture<ListShareFilesResponse>
     */
    public CompletableFuture<ListShareFilesResponse> listShareFilesAsync(ListShareFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listShareFiles);
    }

    /**
     * 查询共享存储文件
     *
     * 查询共享存储指定路径下的文件列表，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareFilesRequest 请求对象
     * @return AsyncInvoker<ListShareFilesRequest, ListShareFilesResponse>
     */
    public AsyncInvoker<ListShareFilesRequest, ListShareFilesResponse> listShareFilesAsyncInvoker(
        ListShareFilesRequest request) {
        return new AsyncInvoker<ListShareFilesRequest, ListShareFilesResponse>(request, CphMeta.listShareFiles,
            hcClient);
    }

    /**
     * 推送共享应用
     *
     * 推送应用tar文件至共享应用存储目录中，该功能仅在支持共享应用的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareAppsRequest 请求对象
     * @return CompletableFuture<PushShareAppsResponse>
     */
    public CompletableFuture<PushShareAppsResponse> pushShareAppsAsync(PushShareAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.pushShareApps);
    }

    /**
     * 推送共享应用
     *
     * 推送应用tar文件至共享应用存储目录中，该功能仅在支持共享应用的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareAppsRequest 请求对象
     * @return AsyncInvoker<PushShareAppsRequest, PushShareAppsResponse>
     */
    public AsyncInvoker<PushShareAppsRequest, PushShareAppsResponse> pushShareAppsAsyncInvoker(
        PushShareAppsRequest request) {
        return new AsyncInvoker<PushShareAppsRequest, PushShareAppsResponse>(request, CphMeta.pushShareApps, hcClient);
    }

    /**
     * 推送共享存储文件
     *
     * 推送文件至共享存储目录中，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareFilesRequest 请求对象
     * @return CompletableFuture<PushShareFilesResponse>
     */
    public CompletableFuture<PushShareFilesResponse> pushShareFilesAsync(PushShareFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.pushShareFiles);
    }

    /**
     * 推送共享存储文件
     *
     * 推送文件至共享存储目录中，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareFilesRequest 请求对象
     * @return AsyncInvoker<PushShareFilesRequest, PushShareFilesResponse>
     */
    public AsyncInvoker<PushShareFilesRequest, PushShareFilesResponse> pushShareFilesAsyncInvoker(
        PushShareFilesRequest request) {
        return new AsyncInvoker<PushShareFilesRequest, PushShareFilesResponse>(request, CphMeta.pushShareFiles,
            hcClient);
    }

    /**
     * 重置云手机
     *
     * 批量重置云手机，将云手机恢复出厂设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetCloudPhoneRequest 请求对象
     * @return CompletableFuture<ResetCloudPhoneResponse>
     */
    public CompletableFuture<ResetCloudPhoneResponse> resetCloudPhoneAsync(ResetCloudPhoneRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.resetCloudPhone);
    }

    /**
     * 重置云手机
     *
     * 批量重置云手机，将云手机恢复出厂设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetCloudPhoneRequest 请求对象
     * @return AsyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse>
     */
    public AsyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse> resetCloudPhoneAsyncInvoker(
        ResetCloudPhoneRequest request) {
        return new AsyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse>(request, CphMeta.resetCloudPhone,
            hcClient);
    }

    /**
     * 重启云手机
     *
     * 批量重启云手机，也可用于开启云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneRequest 请求对象
     * @return CompletableFuture<RestartCloudPhoneResponse>
     */
    public CompletableFuture<RestartCloudPhoneResponse> restartCloudPhoneAsync(RestartCloudPhoneRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.restartCloudPhone);
    }

    /**
     * 重启云手机
     *
     * 批量重启云手机，也可用于开启云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneRequest 请求对象
     * @return AsyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse>
     */
    public AsyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse> restartCloudPhoneAsyncInvoker(
        RestartCloudPhoneRequest request) {
        return new AsyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse>(request, CphMeta.restartCloudPhone,
            hcClient);
    }

    /**
     * 重启云手机服务器
     *
     * 批量重启云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneServerRequest 请求对象
     * @return CompletableFuture<RestartCloudPhoneServerResponse>
     */
    public CompletableFuture<RestartCloudPhoneServerResponse> restartCloudPhoneServerAsync(
        RestartCloudPhoneServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.restartCloudPhoneServer);
    }

    /**
     * 重启云手机服务器
     *
     * 批量重启云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneServerRequest 请求对象
     * @return AsyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse>
     */
    public AsyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse> restartCloudPhoneServerAsyncInvoker(
        RestartCloudPhoneServerRequest request) {
        return new AsyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse>(request,
            CphMeta.restartCloudPhoneServer, hcClient);
    }

    /**
     * 重启编码服务
     *
     * 批量重启编码服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartEncodeServerRequest 请求对象
     * @return CompletableFuture<RestartEncodeServerResponse>
     */
    public CompletableFuture<RestartEncodeServerResponse> restartEncodeServerAsync(RestartEncodeServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.restartEncodeServer);
    }

    /**
     * 重启编码服务
     *
     * 批量重启编码服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartEncodeServerRequest 请求对象
     * @return AsyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse>
     */
    public AsyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse> restartEncodeServerAsyncInvoker(
        RestartEncodeServerRequest request) {
        return new AsyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse>(request,
            CphMeta.restartEncodeServer, hcClient);
    }

    /**
     * 查询带宽信息
     *
     * 查询云手机使用的带宽信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthDetailRequest 请求对象
     * @return CompletableFuture<ShowBandwidthDetailResponse>
     */
    public CompletableFuture<ShowBandwidthDetailResponse> showBandwidthDetailAsync(ShowBandwidthDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.showBandwidthDetail);
    }

    /**
     * 查询带宽信息
     *
     * 查询云手机使用的带宽信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthDetailRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse>
     */
    public AsyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> showBandwidthDetailAsyncInvoker(
        ShowBandwidthDetailRequest request) {
        return new AsyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse>(request,
            CphMeta.showBandwidthDetail, hcClient);
    }

    /**
     * 查询云手机详情
     *
     * 查询云手机的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneDetailRequest 请求对象
     * @return CompletableFuture<ShowCloudPhoneDetailResponse>
     */
    public CompletableFuture<ShowCloudPhoneDetailResponse> showCloudPhoneDetailAsync(
        ShowCloudPhoneDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.showCloudPhoneDetail);
    }

    /**
     * 查询云手机详情
     *
     * 查询云手机的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneDetailRequest 请求对象
     * @return AsyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse>
     */
    public AsyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse> showCloudPhoneDetailAsyncInvoker(
        ShowCloudPhoneDetailRequest request) {
        return new AsyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse>(request,
            CphMeta.showCloudPhoneDetail, hcClient);
    }

    /**
     * 查询云手机服务器详情
     *
     * 根据server_id查询云手机服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneServerDetailRequest 请求对象
     * @return CompletableFuture<ShowCloudPhoneServerDetailResponse>
     */
    public CompletableFuture<ShowCloudPhoneServerDetailResponse> showCloudPhoneServerDetailAsync(
        ShowCloudPhoneServerDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.showCloudPhoneServerDetail);
    }

    /**
     * 查询云手机服务器详情
     *
     * 根据server_id查询云手机服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneServerDetailRequest 请求对象
     * @return AsyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse>
     */
    public AsyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse> showCloudPhoneServerDetailAsyncInvoker(
        ShowCloudPhoneServerDetailRequest request) {
        return new AsyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse>(request,
            CphMeta.showCloudPhoneServerDetail, hcClient);
    }

    /**
     * 查询任务执行状态
     *
     * 查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.showJob);
    }

    /**
     * 查询任务执行状态
     *
     * 查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, CphMeta.showJob, hcClient);
    }

    /**
     * 关闭云手机
     *
     * 批量关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopCloudPhoneRequest 请求对象
     * @return CompletableFuture<StopCloudPhoneResponse>
     */
    public CompletableFuture<StopCloudPhoneResponse> stopCloudPhoneAsync(StopCloudPhoneRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.stopCloudPhone);
    }

    /**
     * 关闭云手机
     *
     * 批量关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopCloudPhoneRequest 请求对象
     * @return AsyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse>
     */
    public AsyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse> stopCloudPhoneAsyncInvoker(
        StopCloudPhoneRequest request) {
        return new AsyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse>(request, CphMeta.stopCloudPhone,
            hcClient);
    }

    /**
     * 修改共享带宽
     *
     * 修改云手机使用的共享带宽大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthResponse>
     */
    public CompletableFuture<UpdateBandwidthResponse> updateBandwidthAsync(UpdateBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updateBandwidth);
    }

    /**
     * 修改共享带宽
     *
     * 修改云手机使用的共享带宽大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>
     */
    public AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidthAsyncInvoker(
        UpdateBandwidthRequest request) {
        return new AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>(request, CphMeta.updateBandwidth,
            hcClient);
    }

    /**
     * 更新云手机属性
     *
     * 部分云手机属性开放更新能力，部分属性无法更新，部分属性需要重启手机生效，属性约束请云手机属性列表。如果手机处于异常状态，属性更新后需恢复手机状态为运行中才可生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCloudPhonePropertyRequest 请求对象
     * @return CompletableFuture<UpdateCloudPhonePropertyResponse>
     */
    public CompletableFuture<UpdateCloudPhonePropertyResponse> updateCloudPhonePropertyAsync(
        UpdateCloudPhonePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updateCloudPhoneProperty);
    }

    /**
     * 更新云手机属性
     *
     * 部分云手机属性开放更新能力，部分属性无法更新，部分属性需要重启手机生效，属性约束请云手机属性列表。如果手机处于异常状态，属性更新后需恢复手机状态为运行中才可生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCloudPhonePropertyRequest 请求对象
     * @return AsyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse>
     */
    public AsyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> updateCloudPhonePropertyAsyncInvoker(
        UpdateCloudPhonePropertyRequest request) {
        return new AsyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse>(request,
            CphMeta.updateCloudPhoneProperty, hcClient);
    }

    /**
     * 更改密钥对
     *
     * 修改连接云手机的密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKeypairRequest 请求对象
     * @return CompletableFuture<UpdateKeypairResponse>
     */
    public CompletableFuture<UpdateKeypairResponse> updateKeypairAsync(UpdateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updateKeypair);
    }

    /**
     * 更改密钥对
     *
     * 修改连接云手机的密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKeypairRequest 请求对象
     * @return AsyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse>
     */
    public AsyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse> updateKeypairAsyncInvoker(
        UpdateKeypairRequest request) {
        return new AsyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse>(request, CphMeta.updateKeypair, hcClient);
    }

    /**
     * 修改云手机名称
     *
     * 根据phoneId修改phoneName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePhoneNameRequest 请求对象
     * @return CompletableFuture<UpdatePhoneNameResponse>
     */
    public CompletableFuture<UpdatePhoneNameResponse> updatePhoneNameAsync(UpdatePhoneNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updatePhoneName);
    }

    /**
     * 修改云手机名称
     *
     * 根据phoneId修改phoneName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePhoneNameRequest 请求对象
     * @return AsyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse>
     */
    public AsyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse> updatePhoneNameAsyncInvoker(
        UpdatePhoneNameRequest request) {
        return new AsyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse>(request, CphMeta.updatePhoneName,
            hcClient);
    }

    /**
     * 修改云手机服务器名称
     *
     * 根据serverId修改serverName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerNameRequest 请求对象
     * @return CompletableFuture<UpdateServerNameResponse>
     */
    public CompletableFuture<UpdateServerNameResponse> updateServerNameAsync(UpdateServerNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updateServerName);
    }

    /**
     * 修改云手机服务器名称
     *
     * 根据serverId修改serverName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerNameRequest 请求对象
     * @return AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>
     */
    public AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse> updateServerNameAsyncInvoker(
        UpdateServerNameRequest request) {
        return new AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>(request, CphMeta.updateServerName,
            hcClient);
    }

    /**
     * 安装apk
     *
     * 在云手机中安装apk。系统会将指定的apk文件下载后直接安装到云手机中。
     * 支持安装单apk应用和多apk应用。可使用install命令安装单apk应用，一次只支持安装一个apk；可使用install-multiple命令安装多apk应用（多apk应用为单个应用拆分成多个apk），一次只支持同一个应用的多个apk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InstallApkRequest 请求对象
     * @return CompletableFuture<InstallApkResponse>
     */
    public CompletableFuture<InstallApkResponse> installApkAsync(InstallApkRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.installApk);
    }

    /**
     * 安装apk
     *
     * 在云手机中安装apk。系统会将指定的apk文件下载后直接安装到云手机中。
     * 支持安装单apk应用和多apk应用。可使用install命令安装单apk应用，一次只支持安装一个apk；可使用install-multiple命令安装多apk应用（多apk应用为单个应用拆分成多个apk），一次只支持同一个应用的多个apk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InstallApkRequest 请求对象
     * @return AsyncInvoker<InstallApkRequest, InstallApkResponse>
     */
    public AsyncInvoker<InstallApkRequest, InstallApkResponse> installApkAsyncInvoker(InstallApkRequest request) {
        return new AsyncInvoker<InstallApkRequest, InstallApkResponse>(request, CphMeta.installApk, hcClient);
    }

    /**
     * 推送文件
     *
     * 推送文件到云手机文件系统中。系统会将所指定的文件下载解压后，将解压后的内容全部推送到云手机的根目录下。只支持指定tar格式的文件进行推送，您需要将tar文件提前上传至您的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushFileRequest 请求对象
     * @return CompletableFuture<PushFileResponse>
     */
    public CompletableFuture<PushFileResponse> pushFileAsync(PushFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.pushFile);
    }

    /**
     * 推送文件
     *
     * 推送文件到云手机文件系统中。系统会将所指定的文件下载解压后，将解压后的内容全部推送到云手机的根目录下。只支持指定tar格式的文件进行推送，您需要将tar文件提前上传至您的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushFileRequest 请求对象
     * @return AsyncInvoker<PushFileRequest, PushFileResponse>
     */
    public AsyncInvoker<PushFileRequest, PushFileResponse> pushFileAsyncInvoker(PushFileRequest request) {
        return new AsyncInvoker<PushFileRequest, PushFileResponse>(request, CphMeta.pushFile, hcClient);
    }

    /**
     * 执行异步adb命令
     *
     * 在云手机中执行shell命令。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunShellCommandRequest 请求对象
     * @return CompletableFuture<RunShellCommandResponse>
     */
    public CompletableFuture<RunShellCommandResponse> runShellCommandAsync(RunShellCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.runShellCommand);
    }

    /**
     * 执行异步adb命令
     *
     * 在云手机中执行shell命令。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunShellCommandRequest 请求对象
     * @return AsyncInvoker<RunShellCommandRequest, RunShellCommandResponse>
     */
    public AsyncInvoker<RunShellCommandRequest, RunShellCommandResponse> runShellCommandAsyncInvoker(
        RunShellCommandRequest request) {
        return new AsyncInvoker<RunShellCommandRequest, RunShellCommandResponse>(request, CphMeta.runShellCommand,
            hcClient);
    }

    /**
     * 执行同步adb命令
     *
     * 在云手机中同步执行命令并返回命令执行的输出信息，该接口仅支持adb shell命令的执行。1分钟内每个用户调用接口次数上限为6次，每个云手机允许执行命令超时时间为2秒，接口时间不超过30秒，执行云手机数越多，接口耗时相应越长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSyncCommandRequest 请求对象
     * @return CompletableFuture<RunSyncCommandResponse>
     */
    public CompletableFuture<RunSyncCommandResponse> runSyncCommandAsync(RunSyncCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.runSyncCommand);
    }

    /**
     * 执行同步adb命令
     *
     * 在云手机中同步执行命令并返回命令执行的输出信息，该接口仅支持adb shell命令的执行。1分钟内每个用户调用接口次数上限为6次，每个云手机允许执行命令超时时间为2秒，接口时间不超过30秒，执行云手机数越多，接口耗时相应越长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSyncCommandRequest 请求对象
     * @return AsyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse>
     */
    public AsyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse> runSyncCommandAsyncInvoker(
        RunSyncCommandRequest request) {
        return new AsyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse>(request, CphMeta.runSyncCommand,
            hcClient);
    }

    /**
     * 卸载apk
     *
     * 在云手机中卸载apk。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallApkRequest 请求对象
     * @return CompletableFuture<UninstallApkResponse>
     */
    public CompletableFuture<UninstallApkResponse> uninstallApkAsync(UninstallApkRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.uninstallApk);
    }

    /**
     * 卸载apk
     *
     * 在云手机中卸载apk。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallApkRequest 请求对象
     * @return AsyncInvoker<UninstallApkRequest, UninstallApkResponse>
     */
    public AsyncInvoker<UninstallApkRequest, UninstallApkResponse> uninstallApkAsyncInvoker(
        UninstallApkRequest request) {
        return new AsyncInvoker<UninstallApkRequest, UninstallApkResponse>(request, CphMeta.uninstallApk, hcClient);
    }

}
