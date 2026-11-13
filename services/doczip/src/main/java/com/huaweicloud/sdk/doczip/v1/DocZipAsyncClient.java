package com.huaweicloud.sdk.doczip.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.doczip.v1.model.CreateApplicationRequest;
import com.huaweicloud.sdk.doczip.v1.model.CreateApplicationResponse;
import com.huaweicloud.sdk.doczip.v1.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.doczip.v1.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.doczip.v1.model.ListApplicationDetailsRequest;
import com.huaweicloud.sdk.doczip.v1.model.ListApplicationDetailsResponse;
import com.huaweicloud.sdk.doczip.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.doczip.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.doczip.v1.model.PublishApplicationRequest;
import com.huaweicloud.sdk.doczip.v1.model.PublishApplicationResponse;
import com.huaweicloud.sdk.doczip.v1.model.ShowAppResourceLimitRequest;
import com.huaweicloud.sdk.doczip.v1.model.ShowAppResourceLimitResponse;
import com.huaweicloud.sdk.doczip.v1.model.ShowAppSecretKeyRequest;
import com.huaweicloud.sdk.doczip.v1.model.ShowAppSecretKeyResponse;
import com.huaweicloud.sdk.doczip.v1.model.ShowBlocksRequest;
import com.huaweicloud.sdk.doczip.v1.model.ShowBlocksResponse;
import com.huaweicloud.sdk.doczip.v1.model.UpdateApplicationRequest;
import com.huaweicloud.sdk.doczip.v1.model.UpdateApplicationResponse;

import java.util.concurrent.CompletableFuture;

public class DocZipAsyncClient {

    protected HcClient hcClient;

    public DocZipAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DocZipAsyncClient> newBuilder() {
        ClientBuilder<DocZipAsyncClient> clientBuilder = new ClientBuilder<>(DocZipAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建应用
     *
     * 租户可通过该接口创建应用，每个租户允许创建应用个数可以通过“获取允许创建的资源数量”接口获取。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return CompletableFuture<CreateApplicationResponse>
     */
    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, DocZipMeta.createApplication);
    }

    /**
     * 创建应用
     *
     * 租户可通过该接口创建应用，每个租户允许创建应用个数可以通过“获取允许创建的资源数量”接口获取。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationAsyncInvoker(
        CreateApplicationRequest request) {
        return new AsyncInvoker<>(request, DocZipMeta.createApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 租户可通过该接口删除应用，应用被删除后，将不能被恢复。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, DocZipMeta.deleteApplication);
    }

    /**
     * 删除应用
     *
     * 租户可通过该接口删除应用，应用被删除后，将不能被恢复。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<>(request, DocZipMeta.deleteApplication, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 租户通过该接口可以查询某个租户的详细信息，配合query_type字段查询应用的基本信息，系统配置信息，文档块信息，也可以查询全部信息。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationDetailsRequest 请求对象
     * @return CompletableFuture<ListApplicationDetailsResponse>
     */
    public CompletableFuture<ListApplicationDetailsResponse> listApplicationDetailsAsync(
        ListApplicationDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DocZipMeta.listApplicationDetails);
    }

    /**
     * 获取应用详情
     *
     * 租户通过该接口可以查询某个租户的详细信息，配合query_type字段查询应用的基本信息，系统配置信息，文档块信息，也可以查询全部信息。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationDetailsRequest 请求对象
     * @return AsyncInvoker<ListApplicationDetailsRequest, ListApplicationDetailsResponse>
     */
    public AsyncInvoker<ListApplicationDetailsRequest, ListApplicationDetailsResponse> listApplicationDetailsAsyncInvoker(
        ListApplicationDetailsRequest request) {
        return new AsyncInvoker<>(request, DocZipMeta.listApplicationDetails, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 租户可通过该接口获取租户下所有应用的信息列表。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return CompletableFuture<ListApplicationsResponse>
     */
    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DocZipMeta.listApplications);
    }

    /**
     * 获取应用列表
     *
     * 租户可通过该接口获取租户下所有应用的信息列表。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsAsyncInvoker(
        ListApplicationsRequest request) {
        return new AsyncInvoker<>(request, DocZipMeta.listApplications, hcClient);
    }

    /**
     * 发布应用
     *
     * 租户可通过该接口发布应用，应用发布后，才可以被使用。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishApplicationRequest 请求对象
     * @return CompletableFuture<PublishApplicationResponse>
     */
    public CompletableFuture<PublishApplicationResponse> publishApplicationAsync(PublishApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, DocZipMeta.publishApplication);
    }

    /**
     * 发布应用
     *
     * 租户可通过该接口发布应用，应用发布后，才可以被使用。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishApplicationRequest 请求对象
     * @return AsyncInvoker<PublishApplicationRequest, PublishApplicationResponse>
     */
    public AsyncInvoker<PublishApplicationRequest, PublishApplicationResponse> publishApplicationAsyncInvoker(
        PublishApplicationRequest request) {
        return new AsyncInvoker<>(request, DocZipMeta.publishApplication, hcClient);
    }

    /**
     * 获取允许创建的应用上限
     *
     * 租户可通过该接口获取允许创建的应用数量上限，每个租户允许创建的租户数量不能超过配置的被允许创建的应用数量。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppResourceLimitRequest 请求对象
     * @return CompletableFuture<ShowAppResourceLimitResponse>
     */
    public CompletableFuture<ShowAppResourceLimitResponse> showAppResourceLimitAsync(
        ShowAppResourceLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, DocZipMeta.showAppResourceLimit);
    }

    /**
     * 获取允许创建的应用上限
     *
     * 租户可通过该接口获取允许创建的应用数量上限，每个租户允许创建的租户数量不能超过配置的被允许创建的应用数量。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppResourceLimitRequest 请求对象
     * @return AsyncInvoker<ShowAppResourceLimitRequest, ShowAppResourceLimitResponse>
     */
    public AsyncInvoker<ShowAppResourceLimitRequest, ShowAppResourceLimitResponse> showAppResourceLimitAsyncInvoker(
        ShowAppResourceLimitRequest request) {
        return new AsyncInvoker<>(request, DocZipMeta.showAppResourceLimit, hcClient);
    }

    /**
     * 获取应用密钥
     *
     * 租户可通过该接口获取应用密钥。租户可通过application_id和应用密钥完成租户认证。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppSecretKeyRequest 请求对象
     * @return CompletableFuture<ShowAppSecretKeyResponse>
     */
    public CompletableFuture<ShowAppSecretKeyResponse> showAppSecretKeyAsync(ShowAppSecretKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, DocZipMeta.showAppSecretKey);
    }

    /**
     * 获取应用密钥
     *
     * 租户可通过该接口获取应用密钥。租户可通过application_id和应用密钥完成租户认证。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppSecretKeyRequest 请求对象
     * @return AsyncInvoker<ShowAppSecretKeyRequest, ShowAppSecretKeyResponse>
     */
    public AsyncInvoker<ShowAppSecretKeyRequest, ShowAppSecretKeyResponse> showAppSecretKeyAsyncInvoker(
        ShowAppSecretKeyRequest request) {
        return new AsyncInvoker<>(request, DocZipMeta.showAppSecretKey, hcClient);
    }

    /**
     * 获取应用文档块信息
     *
     * 租户可通过该接口获取当前租户下支持的所有文档块信息，在“创建应用”接口中，可根据业务需求为不同的应用选择不同的文档块数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlocksRequest 请求对象
     * @return CompletableFuture<ShowBlocksResponse>
     */
    public CompletableFuture<ShowBlocksResponse> showBlocksAsync(ShowBlocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DocZipMeta.showBlocks);
    }

    /**
     * 获取应用文档块信息
     *
     * 租户可通过该接口获取当前租户下支持的所有文档块信息，在“创建应用”接口中，可根据业务需求为不同的应用选择不同的文档块数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlocksRequest 请求对象
     * @return AsyncInvoker<ShowBlocksRequest, ShowBlocksResponse>
     */
    public AsyncInvoker<ShowBlocksRequest, ShowBlocksResponse> showBlocksAsyncInvoker(ShowBlocksRequest request) {
        return new AsyncInvoker<>(request, DocZipMeta.showBlocks, hcClient);
    }

    /**
     * 修改应用
     *
     * 租户可通过该接口修改某个应用的名称，系统设置等信息。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationResponse>
     */
    public CompletableFuture<UpdateApplicationResponse> updateApplicationAsync(UpdateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, DocZipMeta.updateApplication);
    }

    /**
     * 修改应用
     *
     * 租户可通过该接口修改某个应用的名称，系统设置等信息。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    public AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationAsyncInvoker(
        UpdateApplicationRequest request) {
        return new AsyncInvoker<>(request, DocZipMeta.updateApplication, hcClient);
    }

}
