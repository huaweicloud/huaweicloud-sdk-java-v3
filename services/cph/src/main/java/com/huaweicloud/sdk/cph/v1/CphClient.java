package com.huaweicloud.sdk.cph.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.cph.v1.model.*;

public class CphClient {

    protected HcClient hcClient;

    public CphClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CphClient> newBuilder() {
        return new ClientBuilder<>(CphClient::new);
    }

    /**
     * 导出云手机数据
     *
     * 批量导出云手机中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExportCloudPhoneDataRequest 请求对象
     * @return BatchExportCloudPhoneDataResponse
     */
    public BatchExportCloudPhoneDataResponse batchExportCloudPhoneData(BatchExportCloudPhoneDataRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.batchExportCloudPhoneData);
    }

    /**
     * 导出云手机数据
     *
     * 批量导出云手机中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExportCloudPhoneDataRequest 请求对象
     * @return SyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse>
     */
    public SyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse> batchExportCloudPhoneDataInvoker(
        BatchExportCloudPhoneDataRequest request) {
        return new SyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse>(request,
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
     * @return BatchImportCloudPhoneDataResponse
     */
    public BatchImportCloudPhoneDataResponse batchImportCloudPhoneData(BatchImportCloudPhoneDataRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.batchImportCloudPhoneData);
    }

    /**
     * 恢复云手机数据
     *
     * 导入数据到手机中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportCloudPhoneDataRequest 请求对象
     * @return SyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse>
     */
    public SyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse> batchImportCloudPhoneDataInvoker(
        BatchImportCloudPhoneDataRequest request) {
        return new SyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse>(request,
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
     * @return BatchMigrateCloudPhoneResponse
     */
    public BatchMigrateCloudPhoneResponse batchMigrateCloudPhone(BatchMigrateCloudPhoneRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.batchMigrateCloudPhone);
    }

    /**
     * 迁移云手机
     *
     * 批量迁移整台云手机，包括云手机的系统盘数据和数据盘数据。该接口为异步接口，迁移完成的时间和手机的数据量有一定关系，整机数据大小为11G时，迁移时间大约为3-5分钟。迁移前请关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchMigrateCloudPhoneRequest 请求对象
     * @return SyncInvoker<BatchMigrateCloudPhoneRequest, BatchMigrateCloudPhoneResponse>
     */
    public SyncInvoker<BatchMigrateCloudPhoneRequest, BatchMigrateCloudPhoneResponse> batchMigrateCloudPhoneInvoker(
        BatchMigrateCloudPhoneRequest request) {
        return new SyncInvoker<BatchMigrateCloudPhoneRequest, BatchMigrateCloudPhoneResponse>(request,
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
     * @return ChangeCloudPhoneServerModelResponse
     */
    public ChangeCloudPhoneServerModelResponse changeCloudPhoneServerModel(ChangeCloudPhoneServerModelRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.changeCloudPhoneServerModel);
    }

    /**
     * 变更云手机服务器规格
     *
     * 变更云手机服务器规格。只有能使用physical.rx1.xlarge.special私有规格的租户才可使用本接口。变更的目标规格也必须为特殊的规格才可变更。接口调用成功后，大约2分钟左右规格会变更结束，在订单中心可以查看到变更的订单状态为成功，且查询服务器的详细信息，可以查看到服务器规格名称已经变成新的规格名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeCloudPhoneServerModelRequest 请求对象
     * @return SyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse>
     */
    public SyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse> changeCloudPhoneServerModelInvoker(
        ChangeCloudPhoneServerModelRequest request) {
        return new SyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse>(request,
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
     * @return CreateCloudPhoneServerResponse
     */
    public CreateCloudPhoneServerResponse createCloudPhoneServer(CreateCloudPhoneServerRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.createCloudPhoneServer);
    }

    /**
     * 购买系统定义网络云手机服务器
     *
     * 购买系统定义网络云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCloudPhoneServerRequest 请求对象
     * @return SyncInvoker<CreateCloudPhoneServerRequest, CreateCloudPhoneServerResponse>
     */
    public SyncInvoker<CreateCloudPhoneServerRequest, CreateCloudPhoneServerResponse> createCloudPhoneServerInvoker(
        CreateCloudPhoneServerRequest request) {
        return new SyncInvoker<CreateCloudPhoneServerRequest, CreateCloudPhoneServerResponse>(request,
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
     * @return CreateNet2CloudPhoneServerResponse
     */
    public CreateNet2CloudPhoneServerResponse createNet2CloudPhoneServer(CreateNet2CloudPhoneServerRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.createNet2CloudPhoneServer);
    }

    /**
     * 购买自定义网络云手机服务器
     *
     * 购买自定义网络的云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNet2CloudPhoneServerRequest 请求对象
     * @return SyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse>
     */
    public SyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse> createNet2CloudPhoneServerInvoker(
        CreateNet2CloudPhoneServerRequest request) {
        return new SyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse>(request,
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
     * @return DeleteShareAppsResponse
     */
    public DeleteShareAppsResponse deleteShareApps(DeleteShareAppsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.deleteShareApps);
    }

    /**
     * 删除共享应用
     *
     * 在共享应用存储目录中删除共享应用，该功能仅在支持共享应用的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareAppsRequest 请求对象
     * @return SyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse>
     */
    public SyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse> deleteShareAppsInvoker(
        DeleteShareAppsRequest request) {
        return new SyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse>(request, CphMeta.deleteShareApps,
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
     * @return DeleteShareFilesResponse
     */
    public DeleteShareFilesResponse deleteShareFiles(DeleteShareFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.deleteShareFiles);
    }

    /**
     * 删除共享存储文件
     *
     * 删除共享存储目录中文件，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareFilesRequest 请求对象
     * @return SyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse>
     */
    public SyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse> deleteShareFilesInvoker(
        DeleteShareFilesRequest request) {
        return new SyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse>(request, CphMeta.deleteShareFiles,
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
     * @return ImportTrafficResponse
     */
    public ImportTrafficResponse importTraffic(ImportTrafficRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.importTraffic);
    }

    /**
     * 云手机流量导流
     *
     * 手机流量路由修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTrafficRequest 请求对象
     * @return SyncInvoker<ImportTrafficRequest, ImportTrafficResponse>
     */
    public SyncInvoker<ImportTrafficRequest, ImportTrafficResponse> importTrafficInvoker(ImportTrafficRequest request) {
        return new SyncInvoker<ImportTrafficRequest, ImportTrafficResponse>(request, CphMeta.importTraffic, hcClient);
    }

    /**
     * 查询手机镜像
     *
     * 根据项目ID查询可用的手机镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneImagesRequest 请求对象
     * @return ListCloudPhoneImagesResponse
     */
    public ListCloudPhoneImagesResponse listCloudPhoneImages(ListCloudPhoneImagesRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listCloudPhoneImages);
    }

    /**
     * 查询手机镜像
     *
     * 根据项目ID查询可用的手机镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneImagesRequest 请求对象
     * @return SyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse>
     */
    public SyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> listCloudPhoneImagesInvoker(
        ListCloudPhoneImagesRequest request) {
        return new SyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse>(request,
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
     * @return ListCloudPhoneModelsResponse
     */
    public ListCloudPhoneModelsResponse listCloudPhoneModels(ListCloudPhoneModelsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listCloudPhoneModels);
    }

    /**
     * 查询云手机规格列表
     *
     * 查询或统计云手机的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneModelsRequest 请求对象
     * @return SyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse>
     */
    public SyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> listCloudPhoneModelsInvoker(
        ListCloudPhoneModelsRequest request) {
        return new SyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse>(request,
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
     * @return ListCloudPhoneServerModelsResponse
     */
    public ListCloudPhoneServerModelsResponse listCloudPhoneServerModels(ListCloudPhoneServerModelsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listCloudPhoneServerModels);
    }

    /**
     * 查询云手机服务器规格列表
     *
     * 查询云手机服务器的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServerModelsRequest 请求对象
     * @return SyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse>
     */
    public SyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse> listCloudPhoneServerModelsInvoker(
        ListCloudPhoneServerModelsRequest request) {
        return new SyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse>(request,
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
     * @return ListCloudPhoneServersResponse
     */
    public ListCloudPhoneServersResponse listCloudPhoneServers(ListCloudPhoneServersRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listCloudPhoneServers);
    }

    /**
     * 查询云手机服务器列表
     *
     * 分页查询云手机服务器，云手机服务器列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机服务器，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServersRequest 请求对象
     * @return SyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse>
     */
    public SyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse> listCloudPhoneServersInvoker(
        ListCloudPhoneServersRequest request) {
        return new SyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse>(request,
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
     * @return ListCloudPhonesResponse
     */
    public ListCloudPhonesResponse listCloudPhones(ListCloudPhonesRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listCloudPhones);
    }

    /**
     * 查询云手机列表
     *
     * 分页查询云手机，云手机列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhonesRequest 请求对象
     * @return SyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse>
     */
    public SyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse> listCloudPhonesInvoker(
        ListCloudPhonesRequest request) {
        return new SyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse>(request, CphMeta.listCloudPhones,
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
     * @return ListEncodeServersResponse
     */
    public ListEncodeServersResponse listEncodeServers(ListEncodeServersRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listEncodeServers);
    }

    /**
     * 查询编码服务
     *
     * 查询编码服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncodeServersRequest 请求对象
     * @return SyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse>
     */
    public SyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse> listEncodeServersInvoker(
        ListEncodeServersRequest request) {
        return new SyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse>(request, CphMeta.listEncodeServers,
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
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listJobs);
    }

    /**
     * 查询任务执行状态列表
     *
     * 查询同一个request id下的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<ListJobsRequest, ListJobsResponse>(request, CphMeta.listJobs, hcClient);
    }

    /**
     * 查询共享存储文件
     *
     * 查询共享存储指定路径下的文件列表，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareFilesRequest 请求对象
     * @return ListShareFilesResponse
     */
    public ListShareFilesResponse listShareFiles(ListShareFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listShareFiles);
    }

    /**
     * 查询共享存储文件
     *
     * 查询共享存储指定路径下的文件列表，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareFilesRequest 请求对象
     * @return SyncInvoker<ListShareFilesRequest, ListShareFilesResponse>
     */
    public SyncInvoker<ListShareFilesRequest, ListShareFilesResponse> listShareFilesInvoker(
        ListShareFilesRequest request) {
        return new SyncInvoker<ListShareFilesRequest, ListShareFilesResponse>(request, CphMeta.listShareFiles,
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
     * @return PushShareAppsResponse
     */
    public PushShareAppsResponse pushShareApps(PushShareAppsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.pushShareApps);
    }

    /**
     * 推送共享应用
     *
     * 推送应用tar文件至共享应用存储目录中，该功能仅在支持共享应用的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareAppsRequest 请求对象
     * @return SyncInvoker<PushShareAppsRequest, PushShareAppsResponse>
     */
    public SyncInvoker<PushShareAppsRequest, PushShareAppsResponse> pushShareAppsInvoker(PushShareAppsRequest request) {
        return new SyncInvoker<PushShareAppsRequest, PushShareAppsResponse>(request, CphMeta.pushShareApps, hcClient);
    }

    /**
     * 推送共享存储文件
     *
     * 推送文件至共享存储目录中，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareFilesRequest 请求对象
     * @return PushShareFilesResponse
     */
    public PushShareFilesResponse pushShareFiles(PushShareFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.pushShareFiles);
    }

    /**
     * 推送共享存储文件
     *
     * 推送文件至共享存储目录中，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareFilesRequest 请求对象
     * @return SyncInvoker<PushShareFilesRequest, PushShareFilesResponse>
     */
    public SyncInvoker<PushShareFilesRequest, PushShareFilesResponse> pushShareFilesInvoker(
        PushShareFilesRequest request) {
        return new SyncInvoker<PushShareFilesRequest, PushShareFilesResponse>(request, CphMeta.pushShareFiles,
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
     * @return ResetCloudPhoneResponse
     */
    public ResetCloudPhoneResponse resetCloudPhone(ResetCloudPhoneRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.resetCloudPhone);
    }

    /**
     * 重置云手机
     *
     * 批量重置云手机，将云手机恢复出厂设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetCloudPhoneRequest 请求对象
     * @return SyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse>
     */
    public SyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse> resetCloudPhoneInvoker(
        ResetCloudPhoneRequest request) {
        return new SyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse>(request, CphMeta.resetCloudPhone,
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
     * @return RestartCloudPhoneResponse
     */
    public RestartCloudPhoneResponse restartCloudPhone(RestartCloudPhoneRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.restartCloudPhone);
    }

    /**
     * 重启云手机
     *
     * 批量重启云手机，也可用于开启云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneRequest 请求对象
     * @return SyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse>
     */
    public SyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse> restartCloudPhoneInvoker(
        RestartCloudPhoneRequest request) {
        return new SyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse>(request, CphMeta.restartCloudPhone,
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
     * @return RestartCloudPhoneServerResponse
     */
    public RestartCloudPhoneServerResponse restartCloudPhoneServer(RestartCloudPhoneServerRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.restartCloudPhoneServer);
    }

    /**
     * 重启云手机服务器
     *
     * 批量重启云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneServerRequest 请求对象
     * @return SyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse>
     */
    public SyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse> restartCloudPhoneServerInvoker(
        RestartCloudPhoneServerRequest request) {
        return new SyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse>(request,
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
     * @return RestartEncodeServerResponse
     */
    public RestartEncodeServerResponse restartEncodeServer(RestartEncodeServerRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.restartEncodeServer);
    }

    /**
     * 重启编码服务
     *
     * 批量重启编码服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartEncodeServerRequest 请求对象
     * @return SyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse>
     */
    public SyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse> restartEncodeServerInvoker(
        RestartEncodeServerRequest request) {
        return new SyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse>(request,
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
     * @return ShowBandwidthDetailResponse
     */
    public ShowBandwidthDetailResponse showBandwidthDetail(ShowBandwidthDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.showBandwidthDetail);
    }

    /**
     * 查询带宽信息
     *
     * 查询云手机使用的带宽信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthDetailRequest 请求对象
     * @return SyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse>
     */
    public SyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> showBandwidthDetailInvoker(
        ShowBandwidthDetailRequest request) {
        return new SyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse>(request,
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
     * @return ShowCloudPhoneDetailResponse
     */
    public ShowCloudPhoneDetailResponse showCloudPhoneDetail(ShowCloudPhoneDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.showCloudPhoneDetail);
    }

    /**
     * 查询云手机详情
     *
     * 查询云手机的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneDetailRequest 请求对象
     * @return SyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse>
     */
    public SyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse> showCloudPhoneDetailInvoker(
        ShowCloudPhoneDetailRequest request) {
        return new SyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse>(request,
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
     * @return ShowCloudPhoneServerDetailResponse
     */
    public ShowCloudPhoneServerDetailResponse showCloudPhoneServerDetail(ShowCloudPhoneServerDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.showCloudPhoneServerDetail);
    }

    /**
     * 查询云手机服务器详情
     *
     * 根据server_id查询云手机服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneServerDetailRequest 请求对象
     * @return SyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse>
     */
    public SyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse> showCloudPhoneServerDetailInvoker(
        ShowCloudPhoneServerDetailRequest request) {
        return new SyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse>(request,
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
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.showJob);
    }

    /**
     * 查询任务执行状态
     *
     * 查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, CphMeta.showJob, hcClient);
    }

    /**
     * 关闭云手机
     *
     * 批量关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopCloudPhoneRequest 请求对象
     * @return StopCloudPhoneResponse
     */
    public StopCloudPhoneResponse stopCloudPhone(StopCloudPhoneRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.stopCloudPhone);
    }

    /**
     * 关闭云手机
     *
     * 批量关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopCloudPhoneRequest 请求对象
     * @return SyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse>
     */
    public SyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse> stopCloudPhoneInvoker(
        StopCloudPhoneRequest request) {
        return new SyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse>(request, CphMeta.stopCloudPhone,
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
     * @return UpdateBandwidthResponse
     */
    public UpdateBandwidthResponse updateBandwidth(UpdateBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.updateBandwidth);
    }

    /**
     * 修改共享带宽
     *
     * 修改云手机使用的共享带宽大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return SyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>
     */
    public SyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidthInvoker(
        UpdateBandwidthRequest request) {
        return new SyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>(request, CphMeta.updateBandwidth,
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
     * @return UpdateCloudPhonePropertyResponse
     */
    public UpdateCloudPhonePropertyResponse updateCloudPhoneProperty(UpdateCloudPhonePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.updateCloudPhoneProperty);
    }

    /**
     * 更新云手机属性
     *
     * 部分云手机属性开放更新能力，部分属性无法更新，部分属性需要重启手机生效，属性约束请云手机属性列表。如果手机处于异常状态，属性更新后需恢复手机状态为运行中才可生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCloudPhonePropertyRequest 请求对象
     * @return SyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse>
     */
    public SyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> updateCloudPhonePropertyInvoker(
        UpdateCloudPhonePropertyRequest request) {
        return new SyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse>(request,
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
     * @return UpdateKeypairResponse
     */
    public UpdateKeypairResponse updateKeypair(UpdateKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.updateKeypair);
    }

    /**
     * 更改密钥对
     *
     * 修改连接云手机的密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKeypairRequest 请求对象
     * @return SyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse>
     */
    public SyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse> updateKeypairInvoker(UpdateKeypairRequest request) {
        return new SyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse>(request, CphMeta.updateKeypair, hcClient);
    }

    /**
     * 修改云手机名称
     *
     * 根据phoneId修改phoneName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePhoneNameRequest 请求对象
     * @return UpdatePhoneNameResponse
     */
    public UpdatePhoneNameResponse updatePhoneName(UpdatePhoneNameRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.updatePhoneName);
    }

    /**
     * 修改云手机名称
     *
     * 根据phoneId修改phoneName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePhoneNameRequest 请求对象
     * @return SyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse>
     */
    public SyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse> updatePhoneNameInvoker(
        UpdatePhoneNameRequest request) {
        return new SyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse>(request, CphMeta.updatePhoneName,
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
     * @return UpdateServerNameResponse
     */
    public UpdateServerNameResponse updateServerName(UpdateServerNameRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.updateServerName);
    }

    /**
     * 修改云手机服务器名称
     *
     * 根据serverId修改serverName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerNameRequest 请求对象
     * @return SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>
     */
    public SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse> updateServerNameInvoker(
        UpdateServerNameRequest request) {
        return new SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>(request, CphMeta.updateServerName,
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
     * @return InstallApkResponse
     */
    public InstallApkResponse installApk(InstallApkRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.installApk);
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
     * @return SyncInvoker<InstallApkRequest, InstallApkResponse>
     */
    public SyncInvoker<InstallApkRequest, InstallApkResponse> installApkInvoker(InstallApkRequest request) {
        return new SyncInvoker<InstallApkRequest, InstallApkResponse>(request, CphMeta.installApk, hcClient);
    }

    /**
     * 推送文件
     *
     * 推送文件到云手机文件系统中。系统会将所指定的文件下载解压后，将解压后的内容全部推送到云手机的根目录下。只支持指定tar格式的文件进行推送，您需要将tar文件提前上传至您的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushFileRequest 请求对象
     * @return PushFileResponse
     */
    public PushFileResponse pushFile(PushFileRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.pushFile);
    }

    /**
     * 推送文件
     *
     * 推送文件到云手机文件系统中。系统会将所指定的文件下载解压后，将解压后的内容全部推送到云手机的根目录下。只支持指定tar格式的文件进行推送，您需要将tar文件提前上传至您的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushFileRequest 请求对象
     * @return SyncInvoker<PushFileRequest, PushFileResponse>
     */
    public SyncInvoker<PushFileRequest, PushFileResponse> pushFileInvoker(PushFileRequest request) {
        return new SyncInvoker<PushFileRequest, PushFileResponse>(request, CphMeta.pushFile, hcClient);
    }

    /**
     * 执行异步adb命令
     *
     * 在云手机中执行shell命令。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunShellCommandRequest 请求对象
     * @return RunShellCommandResponse
     */
    public RunShellCommandResponse runShellCommand(RunShellCommandRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.runShellCommand);
    }

    /**
     * 执行异步adb命令
     *
     * 在云手机中执行shell命令。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunShellCommandRequest 请求对象
     * @return SyncInvoker<RunShellCommandRequest, RunShellCommandResponse>
     */
    public SyncInvoker<RunShellCommandRequest, RunShellCommandResponse> runShellCommandInvoker(
        RunShellCommandRequest request) {
        return new SyncInvoker<RunShellCommandRequest, RunShellCommandResponse>(request, CphMeta.runShellCommand,
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
     * @return RunSyncCommandResponse
     */
    public RunSyncCommandResponse runSyncCommand(RunSyncCommandRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.runSyncCommand);
    }

    /**
     * 执行同步adb命令
     *
     * 在云手机中同步执行命令并返回命令执行的输出信息，该接口仅支持adb shell命令的执行。1分钟内每个用户调用接口次数上限为6次，每个云手机允许执行命令超时时间为2秒，接口时间不超过30秒，执行云手机数越多，接口耗时相应越长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSyncCommandRequest 请求对象
     * @return SyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse>
     */
    public SyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse> runSyncCommandInvoker(
        RunSyncCommandRequest request) {
        return new SyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse>(request, CphMeta.runSyncCommand,
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
     * @return UninstallApkResponse
     */
    public UninstallApkResponse uninstallApk(UninstallApkRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.uninstallApk);
    }

    /**
     * 卸载apk
     *
     * 在云手机中卸载apk。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallApkRequest 请求对象
     * @return SyncInvoker<UninstallApkRequest, UninstallApkResponse>
     */
    public SyncInvoker<UninstallApkRequest, UninstallApkResponse> uninstallApkInvoker(UninstallApkRequest request) {
        return new SyncInvoker<UninstallApkRequest, UninstallApkResponse>(request, CphMeta.uninstallApk, hcClient);
    }

}
