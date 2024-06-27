package com.huaweicloud.sdk.aom.v3;

import com.huaweicloud.sdk.aom.v3.model.CreateAppRequest;
import com.huaweicloud.sdk.aom.v3.model.CreateAppResponse;
import com.huaweicloud.sdk.aom.v3.model.CreateComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.CreateComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.CreateEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.CreateEnvResponse;
import com.huaweicloud.sdk.aom.v3.model.CreateSubAppRequest;
import com.huaweicloud.sdk.aom.v3.model.CreateSubAppResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteAppRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteAppResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteEnvResponse;
import com.huaweicloud.sdk.aom.v3.model.DeleteSubAppRequest;
import com.huaweicloud.sdk.aom.v3.model.DeleteSubAppResponse;
import com.huaweicloud.sdk.aom.v3.model.ListResourceUnderNodeRequest;
import com.huaweicloud.sdk.aom.v3.model.ListResourceUnderNodeResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowAppByNameRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowAppByNameResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowAppRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowAppResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowComponentByNameRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowComponentByNameResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowEnvByNameRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowEnvByNameResponse;
import com.huaweicloud.sdk.aom.v3.model.ShowEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.ShowEnvResponse;
import com.huaweicloud.sdk.aom.v3.model.UpdateAppRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateAppResponse;
import com.huaweicloud.sdk.aom.v3.model.UpdateComponentRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateComponentResponse;
import com.huaweicloud.sdk.aom.v3.model.UpdateEnvRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateEnvResponse;
import com.huaweicloud.sdk.aom.v3.model.UpdateSubAppRequest;
import com.huaweicloud.sdk.aom.v3.model.UpdateSubAppResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AomAsyncClient {

    protected HcClient hcClient;

    public AomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomAsyncClient> newBuilder() {
        ClientBuilder<AomAsyncClient> clientBuilder = new ClientBuilder<>(AomAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 新增应用
     *
     * 该接口用于新增应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createApp);
    }

    /**
     * 新增应用
     *
     * 该接口用于新增应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<>(request, AomMeta.createApp, hcClient);
    }

    /**
     * 新增组件
     *
     * 该接口用于新增组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentRequest 请求对象
     * @return CompletableFuture<CreateComponentResponse>
     */
    public CompletableFuture<CreateComponentResponse> createComponentAsync(CreateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createComponent);
    }

    /**
     * 新增组件
     *
     * 该接口用于新增组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentRequest 请求对象
     * @return AsyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public AsyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentAsyncInvoker(
        CreateComponentRequest request) {
        return new AsyncInvoker<>(request, AomMeta.createComponent, hcClient);
    }

    /**
     * 创建环境
     *
     * 该接口用于创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvRequest 请求对象
     * @return CompletableFuture<CreateEnvResponse>
     */
    public CompletableFuture<CreateEnvResponse> createEnvAsync(CreateEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createEnv);
    }

    /**
     * 创建环境
     *
     * 该接口用于创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvRequest 请求对象
     * @return AsyncInvoker<CreateEnvRequest, CreateEnvResponse>
     */
    public AsyncInvoker<CreateEnvRequest, CreateEnvResponse> createEnvAsyncInvoker(CreateEnvRequest request) {
        return new AsyncInvoker<>(request, AomMeta.createEnv, hcClient);
    }

    /**
     * 新增子应用
     *
     * 该接口用于新增子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubAppRequest 请求对象
     * @return CompletableFuture<CreateSubAppResponse>
     */
    public CompletableFuture<CreateSubAppResponse> createSubAppAsync(CreateSubAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createSubApp);
    }

    /**
     * 新增子应用
     *
     * 该接口用于新增子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubAppRequest 请求对象
     * @return AsyncInvoker<CreateSubAppRequest, CreateSubAppResponse>
     */
    public AsyncInvoker<CreateSubAppRequest, CreateSubAppResponse> createSubAppAsyncInvoker(
        CreateSubAppRequest request) {
        return new AsyncInvoker<>(request, AomMeta.createSubApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 该接口用于删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 该接口用于删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteApp, hcClient);
    }

    /**
     * 删除组件
     *
     * 该接口用于删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentRequest 请求对象
     * @return CompletableFuture<DeleteComponentResponse>
     */
    public CompletableFuture<DeleteComponentResponse> deleteComponentAsync(DeleteComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteComponent);
    }

    /**
     * 删除组件
     *
     * 该接口用于删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentRequest 请求对象
     * @return AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentAsyncInvoker(
        DeleteComponentRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteComponent, hcClient);
    }

    /**
     * 删除环境
     *
     * 该接口用于删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvRequest 请求对象
     * @return CompletableFuture<DeleteEnvResponse>
     */
    public CompletableFuture<DeleteEnvResponse> deleteEnvAsync(DeleteEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteEnv);
    }

    /**
     * 删除环境
     *
     * 该接口用于删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvRequest 请求对象
     * @return AsyncInvoker<DeleteEnvRequest, DeleteEnvResponse>
     */
    public AsyncInvoker<DeleteEnvRequest, DeleteEnvResponse> deleteEnvAsyncInvoker(DeleteEnvRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteEnv, hcClient);
    }

    /**
     * 删除子应用
     *
     * 该接口用于删除子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubAppRequest 请求对象
     * @return CompletableFuture<DeleteSubAppResponse>
     */
    public CompletableFuture<DeleteSubAppResponse> deleteSubAppAsync(DeleteSubAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteSubApp);
    }

    /**
     * 删除子应用
     *
     * 该接口用于删除子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubAppRequest 请求对象
     * @return AsyncInvoker<DeleteSubAppRequest, DeleteSubAppResponse>
     */
    public AsyncInvoker<DeleteSubAppRequest, DeleteSubAppResponse> deleteSubAppAsyncInvoker(
        DeleteSubAppRequest request) {
        return new AsyncInvoker<>(request, AomMeta.deleteSubApp, hcClient);
    }

    /**
     * 查询绑定在节点上的资源列表
     *
     * 该接口用于查询绑定在节点上的资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceUnderNodeRequest 请求对象
     * @return CompletableFuture<ListResourceUnderNodeResponse>
     */
    public CompletableFuture<ListResourceUnderNodeResponse> listResourceUnderNodeAsync(
        ListResourceUnderNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listResourceUnderNode);
    }

    /**
     * 查询绑定在节点上的资源列表
     *
     * 该接口用于查询绑定在节点上的资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceUnderNodeRequest 请求对象
     * @return AsyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse>
     */
    public AsyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse> listResourceUnderNodeAsyncInvoker(
        ListResourceUnderNodeRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listResourceUnderNode, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return CompletableFuture<ShowAppResponse>
     */
    public CompletableFuture<ShowAppResponse> showAppAsync(ShowAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showApp);
    }

    /**
     * 查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return AsyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public AsyncInvoker<ShowAppRequest, ShowAppResponse> showAppAsyncInvoker(ShowAppRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showApp, hcClient);
    }

    /**
     * 根据应用名称查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppByNameRequest 请求对象
     * @return CompletableFuture<ShowAppByNameResponse>
     */
    public CompletableFuture<ShowAppByNameResponse> showAppByNameAsync(ShowAppByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showAppByName);
    }

    /**
     * 根据应用名称查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppByNameRequest 请求对象
     * @return AsyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse>
     */
    public AsyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse> showAppByNameAsyncInvoker(
        ShowAppByNameRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showAppByName, hcClient);
    }

    /**
     * 查询组件详情
     *
     * 该接口用于查询组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRequest 请求对象
     * @return CompletableFuture<ShowComponentResponse>
     */
    public CompletableFuture<ShowComponentResponse> showComponentAsync(ShowComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showComponent);
    }

    /**
     * 查询组件详情
     *
     * 该接口用于查询组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRequest 请求对象
     * @return AsyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public AsyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentAsyncInvoker(
        ShowComponentRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showComponent, hcClient);
    }

    /**
     * 根据组件名称查询组件详情
     *
     * 该接口用于查询组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentByNameRequest 请求对象
     * @return CompletableFuture<ShowComponentByNameResponse>
     */
    public CompletableFuture<ShowComponentByNameResponse> showComponentByNameAsync(ShowComponentByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showComponentByName);
    }

    /**
     * 根据组件名称查询组件详情
     *
     * 该接口用于查询组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentByNameRequest 请求对象
     * @return AsyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse>
     */
    public AsyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse> showComponentByNameAsyncInvoker(
        ShowComponentByNameRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showComponentByName, hcClient);
    }

    /**
     * 查询环境详情
     *
     * 该接口用于查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvRequest 请求对象
     * @return CompletableFuture<ShowEnvResponse>
     */
    public CompletableFuture<ShowEnvResponse> showEnvAsync(ShowEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showEnv);
    }

    /**
     * 查询环境详情
     *
     * 该接口用于查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvRequest 请求对象
     * @return AsyncInvoker<ShowEnvRequest, ShowEnvResponse>
     */
    public AsyncInvoker<ShowEnvRequest, ShowEnvResponse> showEnvAsyncInvoker(ShowEnvRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showEnv, hcClient);
    }

    /**
     * 根据环境名称查询环境详情
     *
     * 该接口用于查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvByNameRequest 请求对象
     * @return CompletableFuture<ShowEnvByNameResponse>
     */
    public CompletableFuture<ShowEnvByNameResponse> showEnvByNameAsync(ShowEnvByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showEnvByName);
    }

    /**
     * 根据环境名称查询环境详情
     *
     * 该接口用于查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvByNameRequest 请求对象
     * @return AsyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse>
     */
    public AsyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse> showEnvByNameAsyncInvoker(
        ShowEnvByNameRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showEnvByName, hcClient);
    }

    /**
     * 修改应用
     *
     * 该接口用于修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return CompletableFuture<UpdateAppResponse>
     */
    public CompletableFuture<UpdateAppResponse> updateAppAsync(UpdateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateApp);
    }

    /**
     * 修改应用
     *
     * 该接口用于修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return AsyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public AsyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppAsyncInvoker(UpdateAppRequest request) {
        return new AsyncInvoker<>(request, AomMeta.updateApp, hcClient);
    }

    /**
     * 修改组件
     *
     * 该接口用于修改组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentRequest 请求对象
     * @return CompletableFuture<UpdateComponentResponse>
     */
    public CompletableFuture<UpdateComponentResponse> updateComponentAsync(UpdateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateComponent);
    }

    /**
     * 修改组件
     *
     * 该接口用于修改组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentRequest 请求对象
     * @return AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse>
     */
    public AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse> updateComponentAsyncInvoker(
        UpdateComponentRequest request) {
        return new AsyncInvoker<>(request, AomMeta.updateComponent, hcClient);
    }

    /**
     * 修改环境
     *
     * 该接口用于修改环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvRequest 请求对象
     * @return CompletableFuture<UpdateEnvResponse>
     */
    public CompletableFuture<UpdateEnvResponse> updateEnvAsync(UpdateEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateEnv);
    }

    /**
     * 修改环境
     *
     * 该接口用于修改环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvRequest 请求对象
     * @return AsyncInvoker<UpdateEnvRequest, UpdateEnvResponse>
     */
    public AsyncInvoker<UpdateEnvRequest, UpdateEnvResponse> updateEnvAsyncInvoker(UpdateEnvRequest request) {
        return new AsyncInvoker<>(request, AomMeta.updateEnv, hcClient);
    }

    /**
     * 修改子应用
     *
     * 该接口用于修改子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubAppRequest 请求对象
     * @return CompletableFuture<UpdateSubAppResponse>
     */
    public CompletableFuture<UpdateSubAppResponse> updateSubAppAsync(UpdateSubAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateSubApp);
    }

    /**
     * 修改子应用
     *
     * 该接口用于修改子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubAppRequest 请求对象
     * @return AsyncInvoker<UpdateSubAppRequest, UpdateSubAppResponse>
     */
    public AsyncInvoker<UpdateSubAppRequest, UpdateSubAppResponse> updateSubAppAsyncInvoker(
        UpdateSubAppRequest request) {
        return new AsyncInvoker<>(request, AomMeta.updateSubApp, hcClient);
    }

}
