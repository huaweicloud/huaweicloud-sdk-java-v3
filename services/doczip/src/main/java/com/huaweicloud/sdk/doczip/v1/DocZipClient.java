package com.huaweicloud.sdk.doczip.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class DocZipClient {

    protected HcClient hcClient;

    public DocZipClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DocZipClient> newBuilder() {
        ClientBuilder<DocZipClient> clientBuilder = new ClientBuilder<>(DocZipClient::new);
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
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DocZipMeta.createApplication);
    }

    /**
     * 创建应用
     *
     * 租户可通过该接口创建应用，每个租户允许创建应用个数可以通过“获取允许创建的资源数量”接口获取。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationInvoker(
        CreateApplicationRequest request) {
        return new SyncInvoker<>(request, DocZipMeta.createApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 租户可通过该接口删除应用，应用被删除后，将不能被恢复。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DocZipMeta.deleteApplication);
    }

    /**
     * 删除应用
     *
     * 租户可通过该接口删除应用，应用被删除后，将不能被恢复。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<>(request, DocZipMeta.deleteApplication, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 租户通过该接口可以查询某个租户的详细信息，配合query_type字段查询应用的基本信息，系统配置信息，文档块信息，也可以查询全部信息。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationDetailsRequest 请求对象
     * @return ListApplicationDetailsResponse
     */
    public ListApplicationDetailsResponse listApplicationDetails(ListApplicationDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DocZipMeta.listApplicationDetails);
    }

    /**
     * 获取应用详情
     *
     * 租户通过该接口可以查询某个租户的详细信息，配合query_type字段查询应用的基本信息，系统配置信息，文档块信息，也可以查询全部信息。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationDetailsRequest 请求对象
     * @return SyncInvoker<ListApplicationDetailsRequest, ListApplicationDetailsResponse>
     */
    public SyncInvoker<ListApplicationDetailsRequest, ListApplicationDetailsResponse> listApplicationDetailsInvoker(
        ListApplicationDetailsRequest request) {
        return new SyncInvoker<>(request, DocZipMeta.listApplicationDetails, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 租户可通过该接口获取租户下所有应用的信息列表。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, DocZipMeta.listApplications);
    }

    /**
     * 获取应用列表
     *
     * 租户可通过该接口获取租户下所有应用的信息列表。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<>(request, DocZipMeta.listApplications, hcClient);
    }

    /**
     * 发布应用
     *
     * 租户可通过该接口发布应用，应用发布后，才可以被使用。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishApplicationRequest 请求对象
     * @return PublishApplicationResponse
     */
    public PublishApplicationResponse publishApplication(PublishApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DocZipMeta.publishApplication);
    }

    /**
     * 发布应用
     *
     * 租户可通过该接口发布应用，应用发布后，才可以被使用。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishApplicationRequest 请求对象
     * @return SyncInvoker<PublishApplicationRequest, PublishApplicationResponse>
     */
    public SyncInvoker<PublishApplicationRequest, PublishApplicationResponse> publishApplicationInvoker(
        PublishApplicationRequest request) {
        return new SyncInvoker<>(request, DocZipMeta.publishApplication, hcClient);
    }

    /**
     * 获取允许创建的应用上限
     *
     * 租户可通过该接口获取允许创建的应用数量上限，每个租户允许创建的租户数量不能超过配置的被允许创建的应用数量。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppResourceLimitRequest 请求对象
     * @return ShowAppResourceLimitResponse
     */
    public ShowAppResourceLimitResponse showAppResourceLimit(ShowAppResourceLimitRequest request) {
        return hcClient.syncInvokeHttp(request, DocZipMeta.showAppResourceLimit);
    }

    /**
     * 获取允许创建的应用上限
     *
     * 租户可通过该接口获取允许创建的应用数量上限，每个租户允许创建的租户数量不能超过配置的被允许创建的应用数量。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppResourceLimitRequest 请求对象
     * @return SyncInvoker<ShowAppResourceLimitRequest, ShowAppResourceLimitResponse>
     */
    public SyncInvoker<ShowAppResourceLimitRequest, ShowAppResourceLimitResponse> showAppResourceLimitInvoker(
        ShowAppResourceLimitRequest request) {
        return new SyncInvoker<>(request, DocZipMeta.showAppResourceLimit, hcClient);
    }

    /**
     * 获取应用密钥
     *
     * 租户可通过该接口获取应用密钥。租户可通过application_id和应用密钥完成租户认证。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppSecretKeyRequest 请求对象
     * @return ShowAppSecretKeyResponse
     */
    public ShowAppSecretKeyResponse showAppSecretKey(ShowAppSecretKeyRequest request) {
        return hcClient.syncInvokeHttp(request, DocZipMeta.showAppSecretKey);
    }

    /**
     * 获取应用密钥
     *
     * 租户可通过该接口获取应用密钥。租户可通过application_id和应用密钥完成租户认证。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppSecretKeyRequest 请求对象
     * @return SyncInvoker<ShowAppSecretKeyRequest, ShowAppSecretKeyResponse>
     */
    public SyncInvoker<ShowAppSecretKeyRequest, ShowAppSecretKeyResponse> showAppSecretKeyInvoker(
        ShowAppSecretKeyRequest request) {
        return new SyncInvoker<>(request, DocZipMeta.showAppSecretKey, hcClient);
    }

    /**
     * 获取应用文档块信息
     *
     * 租户可通过该接口获取当前租户下支持的所有文档块信息，在“创建应用”接口中，可根据业务需求为不同的应用选择不同的文档块数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlocksRequest 请求对象
     * @return ShowBlocksResponse
     */
    public ShowBlocksResponse showBlocks(ShowBlocksRequest request) {
        return hcClient.syncInvokeHttp(request, DocZipMeta.showBlocks);
    }

    /**
     * 获取应用文档块信息
     *
     * 租户可通过该接口获取当前租户下支持的所有文档块信息，在“创建应用”接口中，可根据业务需求为不同的应用选择不同的文档块数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlocksRequest 请求对象
     * @return SyncInvoker<ShowBlocksRequest, ShowBlocksResponse>
     */
    public SyncInvoker<ShowBlocksRequest, ShowBlocksResponse> showBlocksInvoker(ShowBlocksRequest request) {
        return new SyncInvoker<>(request, DocZipMeta.showBlocks, hcClient);
    }

    /**
     * 修改应用
     *
     * 租户可通过该接口修改某个应用的名称，系统设置等信息。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return UpdateApplicationResponse
     */
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DocZipMeta.updateApplication);
    }

    /**
     * 修改应用
     *
     * 租户可通过该接口修改某个应用的名称，系统设置等信息。其中租户ID就是用户的账号ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    public SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationInvoker(
        UpdateApplicationRequest request) {
        return new SyncInvoker<>(request, DocZipMeta.updateApplication, hcClient);
    }

}
