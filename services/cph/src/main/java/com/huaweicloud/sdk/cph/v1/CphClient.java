package com.huaweicloud.sdk.cph.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.cph.v1.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchExportCloudPhoneDataRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchExportCloudPhoneDataResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchImportCloudPhoneDataRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchImportCloudPhoneDataResponse;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerModelRequest;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerModelResponse;
import com.huaweicloud.sdk.cph.v1.model.CreateNet2CloudPhoneServerRequest;
import com.huaweicloud.sdk.cph.v1.model.CreateNet2CloudPhoneServerResponse;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareAppsRequest;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareAppsResponse;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareFilesRequest;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareFilesResponse;
import com.huaweicloud.sdk.cph.v1.model.ImportTrafficRequest;
import com.huaweicloud.sdk.cph.v1.model.ImportTrafficResponse;
import com.huaweicloud.sdk.cph.v1.model.InstallApkRequest;
import com.huaweicloud.sdk.cph.v1.model.InstallApkResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneImagesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneImagesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneModelsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneModelsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServerModelsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServerModelsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServersRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServersResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhonesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhonesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListEncodeServersRequest;
import com.huaweicloud.sdk.cph.v1.model.ListEncodeServersResponse;
import com.huaweicloud.sdk.cph.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListShareFilesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListShareFilesResponse;
import com.huaweicloud.sdk.cph.v1.model.PushFileRequest;
import com.huaweicloud.sdk.cph.v1.model.PushFileResponse;
import com.huaweicloud.sdk.cph.v1.model.PushShareAppsRequest;
import com.huaweicloud.sdk.cph.v1.model.PushShareAppsResponse;
import com.huaweicloud.sdk.cph.v1.model.PushShareFilesRequest;
import com.huaweicloud.sdk.cph.v1.model.PushShareFilesResponse;
import com.huaweicloud.sdk.cph.v1.model.ResetCloudPhoneRequest;
import com.huaweicloud.sdk.cph.v1.model.ResetCloudPhoneResponse;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneRequest;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneResponse;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneServerRequest;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneServerResponse;
import com.huaweicloud.sdk.cph.v1.model.RestartEncodeServerRequest;
import com.huaweicloud.sdk.cph.v1.model.RestartEncodeServerResponse;
import com.huaweicloud.sdk.cph.v1.model.RunShellCommandRequest;
import com.huaweicloud.sdk.cph.v1.model.RunShellCommandResponse;
import com.huaweicloud.sdk.cph.v1.model.RunSyncCommandRequest;
import com.huaweicloud.sdk.cph.v1.model.RunSyncCommandResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowBandwidthDetailRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowBandwidthDetailResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneDetailRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneDetailResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneServerDetailRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneServerDetailResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.cph.v1.model.StopCloudPhoneRequest;
import com.huaweicloud.sdk.cph.v1.model.StopCloudPhoneResponse;
import com.huaweicloud.sdk.cph.v1.model.UninstallApkRequest;
import com.huaweicloud.sdk.cph.v1.model.UninstallApkResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateBandwidthRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateBandwidthResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateCloudPhonePropertyRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateCloudPhonePropertyResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateKeypairRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateKeypairResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdatePhoneNameRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdatePhoneNameResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateServerNameRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateServerNameResponse;

public class CphClient {

    protected HcClient hcClient;

    public CphClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CphClient> newBuilder() {
        ClientBuilder<CphClient> clientBuilder = new ClientBuilder<>(CphClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return BatchCreateTagsResponse
     */
    public BatchCreateTagsResponse batchCreateTags(BatchCreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.batchCreateTags);
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsInvoker(
        BatchCreateTagsRequest request) {
        return new SyncInvoker<>(request, CphMeta.batchCreateTags, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return BatchDeleteTagsResponse
     */
    public BatchDeleteTagsResponse batchDeleteTags(BatchDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.batchDeleteTags);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsInvoker(
        BatchDeleteTagsRequest request) {
        return new SyncInvoker<>(request, CphMeta.batchDeleteTags, hcClient);
    }

    /**
     * 导出云手机数据
     *
     * 批量导出云手机中的数据。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExportCloudPhoneDataRequest 请求对象
     * @return BatchExportCloudPhoneDataResponse
     */
    public BatchExportCloudPhoneDataResponse batchExportCloudPhoneData(BatchExportCloudPhoneDataRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.batchExportCloudPhoneData);
    }

    /**
     * 导出云手机数据
     *
     * 批量导出云手机中的数据。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExportCloudPhoneDataRequest 请求对象
     * @return SyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse>
     */
    public SyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse> batchExportCloudPhoneDataInvoker(
        BatchExportCloudPhoneDataRequest request) {
        return new SyncInvoker<>(request, CphMeta.batchExportCloudPhoneData, hcClient);
    }

    /**
     * 恢复云手机数据
     *
     * 批量恢复数据到云手机中。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportCloudPhoneDataRequest 请求对象
     * @return BatchImportCloudPhoneDataResponse
     */
    public BatchImportCloudPhoneDataResponse batchImportCloudPhoneData(BatchImportCloudPhoneDataRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.batchImportCloudPhoneData);
    }

    /**
     * 恢复云手机数据
     *
     * 批量恢复数据到云手机中。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportCloudPhoneDataRequest 请求对象
     * @return SyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse>
     */
    public SyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse> batchImportCloudPhoneDataInvoker(
        BatchImportCloudPhoneDataRequest request) {
        return new SyncInvoker<>(request, CphMeta.batchImportCloudPhoneData, hcClient);
    }

    /**
     * 变更云手机服务器规格
     *
     * 变更云手机服务器规格。变更的目标规格也必须为特殊的规格才可变更。接口调用成功后，大约2分钟左右规格会变更结束，在订单中心可以查看到变更的订单状态为成功，且查询服务器的详细信息，可以查看到服务器规格名称已经变成新的规格名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCloudPhoneServerModelRequest 请求对象
     * @return ChangeCloudPhoneServerModelResponse
     */
    public ChangeCloudPhoneServerModelResponse changeCloudPhoneServerModel(ChangeCloudPhoneServerModelRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.changeCloudPhoneServerModel);
    }

    /**
     * 变更云手机服务器规格
     *
     * 变更云手机服务器规格。变更的目标规格也必须为特殊的规格才可变更。接口调用成功后，大约2分钟左右规格会变更结束，在订单中心可以查看到变更的订单状态为成功，且查询服务器的详细信息，可以查看到服务器规格名称已经变成新的规格名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCloudPhoneServerModelRequest 请求对象
     * @return SyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse>
     */
    public SyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse> changeCloudPhoneServerModelInvoker(
        ChangeCloudPhoneServerModelRequest request) {
        return new SyncInvoker<>(request, CphMeta.changeCloudPhoneServerModel, hcClient);
    }

    /**
     * 购买自定义网络云手机服务器
     *
     * 购买自定义网络的云手机服务器。自定义网络是云手机全新一代网络配置管理模式，支持您复用已有的VPC网络管理云手机服务器，支持云手机服务器复用您已购买的共享带宽等资源。
     * - 请确保您已具有虚拟私有云资源，创建服务器需要指定一个已有的虚拟私有云，否则无法创建服务器。
     * - 请确保已正确创建委托（委托名称cph_admin_trust，委托服务CPH），委托未被删除， 确保委托包含VPC FullAccess权限，委托及权限校验失败将导致云服务器创建失败。创建委托时委托类型选择“云服务”，云服务选择“CPH”，即允许CPH调用云服务。
     * - 请确保您使用的账号具有Security Administrator权限或者具备创建委托的细粒度权限iam:agencies:createAgency。
     * - 请确保您有足够的服务器及网络配额，配额校验不通过将导致创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNet2CloudPhoneServerRequest 请求对象
     * @return CreateNet2CloudPhoneServerResponse
     */
    public CreateNet2CloudPhoneServerResponse createNet2CloudPhoneServer(CreateNet2CloudPhoneServerRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.createNet2CloudPhoneServer);
    }

    /**
     * 购买自定义网络云手机服务器
     *
     * 购买自定义网络的云手机服务器。自定义网络是云手机全新一代网络配置管理模式，支持您复用已有的VPC网络管理云手机服务器，支持云手机服务器复用您已购买的共享带宽等资源。
     * - 请确保您已具有虚拟私有云资源，创建服务器需要指定一个已有的虚拟私有云，否则无法创建服务器。
     * - 请确保已正确创建委托（委托名称cph_admin_trust，委托服务CPH），委托未被删除， 确保委托包含VPC FullAccess权限，委托及权限校验失败将导致云服务器创建失败。创建委托时委托类型选择“云服务”，云服务选择“CPH”，即允许CPH调用云服务。
     * - 请确保您使用的账号具有Security Administrator权限或者具备创建委托的细粒度权限iam:agencies:createAgency。
     * - 请确保您有足够的服务器及网络配额，配额校验不通过将导致创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNet2CloudPhoneServerRequest 请求对象
     * @return SyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse>
     */
    public SyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse> createNet2CloudPhoneServerInvoker(
        CreateNet2CloudPhoneServerRequest request) {
        return new SyncInvoker<>(request, CphMeta.createNet2CloudPhoneServer, hcClient);
    }

    /**
     * 删除共享应用
     *
     * 在共享应用存储目录中删除共享应用，该功能仅在支持共享应用的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShareAppsRequest 请求对象
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
     * @param request DeleteShareAppsRequest 请求对象
     * @return SyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse>
     */
    public SyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse> deleteShareAppsInvoker(
        DeleteShareAppsRequest request) {
        return new SyncInvoker<>(request, CphMeta.deleteShareApps, hcClient);
    }

    /**
     * 删除共享存储文件
     *
     * 删除共享存储目录中文件，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShareFilesRequest 请求对象
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
     * @param request DeleteShareFilesRequest 请求对象
     * @return SyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse>
     */
    public SyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse> deleteShareFilesInvoker(
        DeleteShareFilesRequest request) {
        return new SyncInvoker<>(request, CphMeta.deleteShareFiles, hcClient);
    }

    /**
     * 云手机流量导流
     *
     * 手机流量路由修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportTrafficRequest 请求对象
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
     * @param request ImportTrafficRequest 请求对象
     * @return SyncInvoker<ImportTrafficRequest, ImportTrafficResponse>
     */
    public SyncInvoker<ImportTrafficRequest, ImportTrafficResponse> importTrafficInvoker(ImportTrafficRequest request) {
        return new SyncInvoker<>(request, CphMeta.importTraffic, hcClient);
    }

    /**
     * 查询手机镜像
     *
     * 根据项目ID查询可用的手机镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudPhoneImagesRequest 请求对象
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
     * @param request ListCloudPhoneImagesRequest 请求对象
     * @return SyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse>
     */
    public SyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> listCloudPhoneImagesInvoker(
        ListCloudPhoneImagesRequest request) {
        return new SyncInvoker<>(request, CphMeta.listCloudPhoneImages, hcClient);
    }

    /**
     * 查询云手机规格列表
     *
     * 查询或统计云手机的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudPhoneModelsRequest 请求对象
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
     * @param request ListCloudPhoneModelsRequest 请求对象
     * @return SyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse>
     */
    public SyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> listCloudPhoneModelsInvoker(
        ListCloudPhoneModelsRequest request) {
        return new SyncInvoker<>(request, CphMeta.listCloudPhoneModels, hcClient);
    }

    /**
     * 查询云手机服务器规格列表
     *
     * 查询云手机服务器的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudPhoneServerModelsRequest 请求对象
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
     * @param request ListCloudPhoneServerModelsRequest 请求对象
     * @return SyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse>
     */
    public SyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse> listCloudPhoneServerModelsInvoker(
        ListCloudPhoneServerModelsRequest request) {
        return new SyncInvoker<>(request, CphMeta.listCloudPhoneServerModels, hcClient);
    }

    /**
     * 查询云手机服务器列表
     *
     * 分页查询云手机服务器，云手机服务器列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机服务器，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudPhoneServersRequest 请求对象
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
     * @param request ListCloudPhoneServersRequest 请求对象
     * @return SyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse>
     */
    public SyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse> listCloudPhoneServersInvoker(
        ListCloudPhoneServersRequest request) {
        return new SyncInvoker<>(request, CphMeta.listCloudPhoneServers, hcClient);
    }

    /**
     * 查询云手机列表
     *
     * 分页查询云手机，云手机列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudPhonesRequest 请求对象
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
     * @param request ListCloudPhonesRequest 请求对象
     * @return SyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse>
     */
    public SyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse> listCloudPhonesInvoker(
        ListCloudPhonesRequest request) {
        return new SyncInvoker<>(request, CphMeta.listCloudPhones, hcClient);
    }

    /**
     * 查询编码服务
     *
     * 查询编码服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEncodeServersRequest 请求对象
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
     * @param request ListEncodeServersRequest 请求对象
     * @return SyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse>
     */
    public SyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse> listEncodeServersInvoker(
        ListEncodeServersRequest request) {
        return new SyncInvoker<>(request, CphMeta.listEncodeServers, hcClient);
    }

    /**
     * 查询任务执行状态列表
     *
     * 查询同一个request id下的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
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
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, CphMeta.listJobs, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定区域和资源类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定区域和资源类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, CphMeta.listProjectTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return ListResourceInstancesResponse
     */
    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listResourceInstances);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(
        ListResourceInstancesRequest request) {
        return new SyncInvoker<>(request, CphMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.listResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsInvoker(
        ListResourceTagsRequest request) {
        return new SyncInvoker<>(request, CphMeta.listResourceTags, hcClient);
    }

    /**
     * 查询共享存储文件
     *
     * 查询共享存储指定路径下的文件列表，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareFilesRequest 请求对象
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
     * @param request ListShareFilesRequest 请求对象
     * @return SyncInvoker<ListShareFilesRequest, ListShareFilesResponse>
     */
    public SyncInvoker<ListShareFilesRequest, ListShareFilesResponse> listShareFilesInvoker(
        ListShareFilesRequest request) {
        return new SyncInvoker<>(request, CphMeta.listShareFiles, hcClient);
    }

    /**
     * 推送共享应用
     *
     * 推送应用tar文件至共享应用存储目录中，该功能仅在支持共享应用的云手机规格上可实现。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushShareAppsRequest 请求对象
     * @return PushShareAppsResponse
     */
    public PushShareAppsResponse pushShareApps(PushShareAppsRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.pushShareApps);
    }

    /**
     * 推送共享应用
     *
     * 推送应用tar文件至共享应用存储目录中，该功能仅在支持共享应用的云手机规格上可实现。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushShareAppsRequest 请求对象
     * @return SyncInvoker<PushShareAppsRequest, PushShareAppsResponse>
     */
    public SyncInvoker<PushShareAppsRequest, PushShareAppsResponse> pushShareAppsInvoker(PushShareAppsRequest request) {
        return new SyncInvoker<>(request, CphMeta.pushShareApps, hcClient);
    }

    /**
     * 推送共享存储文件
     *
     * 推送文件至共享存储目录中，该功能仅在支持共享存储的云手机规格上可实现。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushShareFilesRequest 请求对象
     * @return PushShareFilesResponse
     */
    public PushShareFilesResponse pushShareFiles(PushShareFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.pushShareFiles);
    }

    /**
     * 推送共享存储文件
     *
     * 推送文件至共享存储目录中，该功能仅在支持共享存储的云手机规格上可实现。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushShareFilesRequest 请求对象
     * @return SyncInvoker<PushShareFilesRequest, PushShareFilesResponse>
     */
    public SyncInvoker<PushShareFilesRequest, PushShareFilesResponse> pushShareFilesInvoker(
        PushShareFilesRequest request) {
        return new SyncInvoker<>(request, CphMeta.pushShareFiles, hcClient);
    }

    /**
     * 重置云手机
     *
     * 批量重置云手机，将云手机恢复出厂设置。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetCloudPhoneRequest 请求对象
     * @return ResetCloudPhoneResponse
     */
    public ResetCloudPhoneResponse resetCloudPhone(ResetCloudPhoneRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.resetCloudPhone);
    }

    /**
     * 重置云手机
     *
     * 批量重置云手机，将云手机恢复出厂设置。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetCloudPhoneRequest 请求对象
     * @return SyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse>
     */
    public SyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse> resetCloudPhoneInvoker(
        ResetCloudPhoneRequest request) {
        return new SyncInvoker<>(request, CphMeta.resetCloudPhone, hcClient);
    }

    /**
     * 重启云手机
     *
     * 批量重启云手机，也可用于开启云手机。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartCloudPhoneRequest 请求对象
     * @return RestartCloudPhoneResponse
     */
    public RestartCloudPhoneResponse restartCloudPhone(RestartCloudPhoneRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.restartCloudPhone);
    }

    /**
     * 重启云手机
     *
     * 批量重启云手机，也可用于开启云手机。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartCloudPhoneRequest 请求对象
     * @return SyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse>
     */
    public SyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse> restartCloudPhoneInvoker(
        RestartCloudPhoneRequest request) {
        return new SyncInvoker<>(request, CphMeta.restartCloudPhone, hcClient);
    }

    /**
     * 重启云手机服务器
     *
     * 批量重启云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartCloudPhoneServerRequest 请求对象
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
     * @param request RestartCloudPhoneServerRequest 请求对象
     * @return SyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse>
     */
    public SyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse> restartCloudPhoneServerInvoker(
        RestartCloudPhoneServerRequest request) {
        return new SyncInvoker<>(request, CphMeta.restartCloudPhoneServer, hcClient);
    }

    /**
     * 重启编码服务
     *
     * 批量重启编码服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartEncodeServerRequest 请求对象
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
     * @param request RestartEncodeServerRequest 请求对象
     * @return SyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse>
     */
    public SyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse> restartEncodeServerInvoker(
        RestartEncodeServerRequest request) {
        return new SyncInvoker<>(request, CphMeta.restartEncodeServer, hcClient);
    }

    /**
     * 查询带宽信息
     *
     * 查询云手机使用的带宽信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthDetailRequest 请求对象
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
     * @param request ShowBandwidthDetailRequest 请求对象
     * @return SyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse>
     */
    public SyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> showBandwidthDetailInvoker(
        ShowBandwidthDetailRequest request) {
        return new SyncInvoker<>(request, CphMeta.showBandwidthDetail, hcClient);
    }

    /**
     * 查询云手机详情
     *
     * 查询云手机的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudPhoneDetailRequest 请求对象
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
     * @param request ShowCloudPhoneDetailRequest 请求对象
     * @return SyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse>
     */
    public SyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse> showCloudPhoneDetailInvoker(
        ShowCloudPhoneDetailRequest request) {
        return new SyncInvoker<>(request, CphMeta.showCloudPhoneDetail, hcClient);
    }

    /**
     * 查询云手机服务器详情
     *
     * 根据server_id查询云手机服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCloudPhoneServerDetailRequest 请求对象
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
     * @param request ShowCloudPhoneServerDetailRequest 请求对象
     * @return SyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse>
     */
    public SyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse> showCloudPhoneServerDetailInvoker(
        ShowCloudPhoneServerDetailRequest request) {
        return new SyncInvoker<>(request, CphMeta.showCloudPhoneServerDetail, hcClient);
    }

    /**
     * 查询任务执行状态
     *
     * 查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
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
     * @param request ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<>(request, CphMeta.showJob, hcClient);
    }

    /**
     * 关闭云手机
     *
     * 批量关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopCloudPhoneRequest 请求对象
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
     * @param request StopCloudPhoneRequest 请求对象
     * @return SyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse>
     */
    public SyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse> stopCloudPhoneInvoker(
        StopCloudPhoneRequest request) {
        return new SyncInvoker<>(request, CphMeta.stopCloudPhone, hcClient);
    }

    /**
     * 修改共享带宽
     *
     * 修改云手机使用的共享带宽大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthRequest 请求对象
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
     * @param request UpdateBandwidthRequest 请求对象
     * @return SyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>
     */
    public SyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidthInvoker(
        UpdateBandwidthRequest request) {
        return new SyncInvoker<>(request, CphMeta.updateBandwidth, hcClient);
    }

    /**
     * 更新云手机属性
     *
     * 部分云手机属性开放更新能力，部分属性无法更新，部分属性需要重启手机生效，属性约束请云手机属性列表。如果手机处于异常状态，属性更新后需恢复手机状态为运行中才可生效。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloudPhonePropertyRequest 请求对象
     * @return UpdateCloudPhonePropertyResponse
     */
    public UpdateCloudPhonePropertyResponse updateCloudPhoneProperty(UpdateCloudPhonePropertyRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.updateCloudPhoneProperty);
    }

    /**
     * 更新云手机属性
     *
     * 部分云手机属性开放更新能力，部分属性无法更新，部分属性需要重启手机生效，属性约束请云手机属性列表。如果手机处于异常状态，属性更新后需恢复手机状态为运行中才可生效。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCloudPhonePropertyRequest 请求对象
     * @return SyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse>
     */
    public SyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> updateCloudPhonePropertyInvoker(
        UpdateCloudPhonePropertyRequest request) {
        return new SyncInvoker<>(request, CphMeta.updateCloudPhoneProperty, hcClient);
    }

    /**
     * 更改密钥对
     *
     * 修改连接云手机的密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeypairRequest 请求对象
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
     * @param request UpdateKeypairRequest 请求对象
     * @return SyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse>
     */
    public SyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse> updateKeypairInvoker(UpdateKeypairRequest request) {
        return new SyncInvoker<>(request, CphMeta.updateKeypair, hcClient);
    }

    /**
     * 修改云手机名称
     *
     * 根据phoneId修改phoneName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePhoneNameRequest 请求对象
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
     * @param request UpdatePhoneNameRequest 请求对象
     * @return SyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse>
     */
    public SyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse> updatePhoneNameInvoker(
        UpdatePhoneNameRequest request) {
        return new SyncInvoker<>(request, CphMeta.updatePhoneName, hcClient);
    }

    /**
     * 修改云手机服务器名称
     *
     * 根据serverId修改serverName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerNameRequest 请求对象
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
     * @param request UpdateServerNameRequest 请求对象
     * @return SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>
     */
    public SyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse> updateServerNameInvoker(
        UpdateServerNameRequest request) {
        return new SyncInvoker<>(request, CphMeta.updateServerName, hcClient);
    }

    /**
     * 安装apk
     *
     * 在云手机中安装apk。系统会将指定的apk文件下载后直接安装到云手机中。
     * 支持安装单apk应用和多apk应用。可使用install命令安装单apk应用，一次只支持安装一个apk；可使用install-multiple命令安装多apk应用（多apk应用为单个应用拆分成多个apk），一次只支持同一个应用的多个apk。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * - 建议通过开发应用市场的方式安装apk。允许安装的apk大小限制为2G（即不可将obs桶内大于2G的apk安装到手机中），超过限制将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallApkRequest 请求对象
     * @return InstallApkResponse
     */
    public InstallApkResponse installApk(InstallApkRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.installApk);
    }

    /**
     * 安装apk
     *
     * 在云手机中安装apk。系统会将指定的apk文件下载后直接安装到云手机中。
     * 支持安装单apk应用和多apk应用。可使用install命令安装单apk应用，一次只支持安装一个apk；可使用install-multiple命令安装多apk应用（多apk应用为单个应用拆分成多个apk），一次只支持同一个应用的多个apk。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * - 建议通过开发应用市场的方式安装apk。允许安装的apk大小限制为2G（即不可将obs桶内大于2G的apk安装到手机中），超过限制将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallApkRequest 请求对象
     * @return SyncInvoker<InstallApkRequest, InstallApkResponse>
     */
    public SyncInvoker<InstallApkRequest, InstallApkResponse> installApkInvoker(InstallApkRequest request) {
        return new SyncInvoker<>(request, CphMeta.installApk, hcClient);
    }

    /**
     * 推送文件
     *
     * 推送文件到云手机文件系统中。系统会将所指定的文件下载解压后，将解压后的内容全部推送到云手机的根目录下。只支持指定tar格式的文件进行推送，您需要将tar文件提前上传至您的OBS桶中。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * - 允许推送的文件大小限制为6G（即不可将obs桶内大于6G的文件推送到手机中），超过限制将返回错误。
     * - 手机的系统有限制，推送到系统盘不保证推送成功，推荐把文件推送到手机的数据盘。所以在构建\&quot;tar\&quot;文件时，应将待推送的文件放到本地创建的data目录后将其打包（如tar -cvf data.tar data ），以确保把文件推送到手机的数据盘下。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushFileRequest 请求对象
     * @return PushFileResponse
     */
    public PushFileResponse pushFile(PushFileRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.pushFile);
    }

    /**
     * 推送文件
     *
     * 推送文件到云手机文件系统中。系统会将所指定的文件下载解压后，将解压后的内容全部推送到云手机的根目录下。只支持指定tar格式的文件进行推送，您需要将tar文件提前上传至您的OBS桶中。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * - 允许推送的文件大小限制为6G（即不可将obs桶内大于6G的文件推送到手机中），超过限制将返回错误。
     * - 手机的系统有限制，推送到系统盘不保证推送成功，推荐把文件推送到手机的数据盘。所以在构建\&quot;tar\&quot;文件时，应将待推送的文件放到本地创建的data目录后将其打包（如tar -cvf data.tar data ），以确保把文件推送到手机的数据盘下。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PushFileRequest 请求对象
     * @return SyncInvoker<PushFileRequest, PushFileResponse>
     */
    public SyncInvoker<PushFileRequest, PushFileResponse> pushFileInvoker(PushFileRequest request) {
        return new SyncInvoker<>(request, CphMeta.pushFile, hcClient);
    }

    /**
     * 执行异步adb命令
     *
     * 在云手机中执行shell命令。该接口为异步接口。
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunShellCommandRequest 请求对象
     * @return RunShellCommandResponse
     */
    public RunShellCommandResponse runShellCommand(RunShellCommandRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.runShellCommand);
    }

    /**
     * 执行异步adb命令
     *
     * 在云手机中执行shell命令。该接口为异步接口。
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunShellCommandRequest 请求对象
     * @return SyncInvoker<RunShellCommandRequest, RunShellCommandResponse>
     */
    public SyncInvoker<RunShellCommandRequest, RunShellCommandResponse> runShellCommandInvoker(
        RunShellCommandRequest request) {
        return new SyncInvoker<>(request, CphMeta.runShellCommand, hcClient);
    }

    /**
     * 执行同步adb命令
     *
     * 在云手机中同步执行命令并返回命令执行的输出信息，该接口仅支持adb shell命令的执行。1分钟内每个用户调用接口次数上限为6次，每个云手机允许执行命令超时时间为2秒，接口时间不超过30秒，执行云手机数越多，接口耗时相应越长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunSyncCommandRequest 请求对象
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
     * @param request RunSyncCommandRequest 请求对象
     * @return SyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse>
     */
    public SyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse> runSyncCommandInvoker(
        RunSyncCommandRequest request) {
        return new SyncInvoker<>(request, CphMeta.runSyncCommand, hcClient);
    }

    /**
     * 卸载apk
     *
     * 在云手机中卸载apk。该接口为异步接口。
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallApkRequest 请求对象
     * @return UninstallApkResponse
     */
    public UninstallApkResponse uninstallApk(UninstallApkRequest request) {
        return hcClient.syncInvokeHttp(request, CphMeta.uninstallApk);
    }

    /**
     * 卸载apk
     *
     * 在云手机中卸载apk。该接口为异步接口。
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallApkRequest 请求对象
     * @return SyncInvoker<UninstallApkRequest, UninstallApkResponse>
     */
    public SyncInvoker<UninstallApkRequest, UninstallApkResponse> uninstallApkInvoker(UninstallApkRequest request) {
        return new SyncInvoker<>(request, CphMeta.uninstallApk, hcClient);
    }

}
