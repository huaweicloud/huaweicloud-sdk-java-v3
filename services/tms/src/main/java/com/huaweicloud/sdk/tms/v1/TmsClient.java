package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.tms.v1.model.*;

public class TmsClient {

    protected HcClient hcClient;

    public TmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TmsClient> newBuilder() {
        return new ClientBuilder<>(TmsClient::new, "GlobalCredentials");
    }

    /** 创建预定义标签 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     *
     * @param CreatePredefineTagsRequest 请求对象
     * @return CreatePredefineTagsResponse */
    public CreatePredefineTagsResponse createPredefineTags(CreatePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.createPredefineTags);
    }

    /** 创建预定义标签 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     *
     * @param CreatePredefineTagsRequest 请求对象
     * @return SyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse> */
    public SyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse> createPredefineTagsInvoker(
        CreatePredefineTagsRequest request) {
        return new SyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse>(request,
            TmsMeta.createPredefineTags, hcClient);
    }

    /** 删除预定义标签 用于删除预定标签。
     *
     * @param DeletePredefineTagsRequest 请求对象
     * @return DeletePredefineTagsResponse */
    public DeletePredefineTagsResponse deletePredefineTags(DeletePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.deletePredefineTags);
    }

    /** 删除预定义标签 用于删除预定标签。
     *
     * @param DeletePredefineTagsRequest 请求对象
     * @return SyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse> */
    public SyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse> deletePredefineTagsInvoker(
        DeletePredefineTagsRequest request) {
        return new SyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse>(request,
            TmsMeta.deletePredefineTags, hcClient);
    }

    /** 查询API版本列表 查询标签管理服务的API版本列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listApiVersions);
    }

    /** 查询API版本列表 查询标签管理服务的API版本列表。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, TmsMeta.listApiVersions,
            hcClient);
    }

    /** 查询预定义标签列表 用于查询预定义标签列表。
     *
     * @param ListPredefineTagsRequest 请求对象
     * @return ListPredefineTagsResponse */
    public ListPredefineTagsResponse listPredefineTags(ListPredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listPredefineTags);
    }

    /** 查询预定义标签列表 用于查询预定义标签列表。
     *
     * @param ListPredefineTagsRequest 请求对象
     * @return SyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse> */
    public SyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse> listPredefineTagsInvoker(
        ListPredefineTagsRequest request) {
        return new SyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse>(request, TmsMeta.listPredefineTags,
            hcClient);
    }

    /** 查询API版本号详情 查询指定的标签管理服务API版本号详情。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showApiVersion);
    }

    /** 查询API版本号详情 查询指定的标签管理服务API版本号详情。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, TmsMeta.showApiVersion,
            hcClient);
    }

    /** 查询标签配额 查询标签的配额信息。
     *
     * @param ShowTagQuotaRequest 请求对象
     * @return ShowTagQuotaResponse */
    public ShowTagQuotaResponse showTagQuota(ShowTagQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showTagQuota);
    }

    /** 查询标签配额 查询标签的配额信息。
     *
     * @param ShowTagQuotaRequest 请求对象
     * @return SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse> */
    public SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse> showTagQuotaInvoker(ShowTagQuotaRequest request) {
        return new SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse>(request, TmsMeta.showTagQuota, hcClient);
    }

    /** 修改预定义标签 修改预定义标签。
     *
     * @param UpdatePredefineTagsRequest 请求对象
     * @return UpdatePredefineTagsResponse */
    public UpdatePredefineTagsResponse updatePredefineTags(UpdatePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.updatePredefineTags);
    }

    /** 修改预定义标签 修改预定义标签。
     *
     * @param UpdatePredefineTagsRequest 请求对象
     * @return SyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> */
    public SyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> updatePredefineTagsInvoker(
        UpdatePredefineTagsRequest request) {
        return new SyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse>(request,
            TmsMeta.updatePredefineTags, hcClient);
    }

}
