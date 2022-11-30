package com.huaweicloud.sdk.aom.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.aom.v3.model.*;

public class AomAsyncClient {
    protected HcClient hcClient;

    public AomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomAsyncClient> newBuilder() {
        return new ClientBuilder<>(AomAsyncClient::new);
    }


    /**
     * 新增应用
     *
     * 新增应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createApp);
    }

    /**
     * 新增应用
     *
     * 新增应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<CreateAppRequest, CreateAppResponse>(request, AomMeta.createApp, hcClient);
    }

    /**
     * 新增组件
     *
     * 新增组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return CompletableFuture<CreateComponentResponse>
     */
    public CompletableFuture<CreateComponentResponse> createComponentAsync(CreateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createComponent);
    }

    /**
     * 新增组件
     *
     * 新增组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return AsyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public AsyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentAsyncInvoker(CreateComponentRequest request) {
        return new AsyncInvoker<CreateComponentRequest, CreateComponentResponse>(request, AomMeta.createComponent, hcClient);
    }

    /**
     * 创建环境
     *
     * 创建环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvRequest 请求对象
     * @return CompletableFuture<CreateEnvResponse>
     */
    public CompletableFuture<CreateEnvResponse> createEnvAsync(CreateEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createEnv);
    }

    /**
     * 创建环境
     *
     * 创建环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvRequest 请求对象
     * @return AsyncInvoker<CreateEnvRequest, CreateEnvResponse>
     */
    public AsyncInvoker<CreateEnvRequest, CreateEnvResponse> createEnvAsyncInvoker(CreateEnvRequest request) {
        return new AsyncInvoker<CreateEnvRequest, CreateEnvResponse>(request, AomMeta.createEnv, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, AomMeta.deleteApp, hcClient);
    }

    /**
     * 删除组件
     *
     * 删除组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return CompletableFuture<DeleteComponentResponse>
     */
    public CompletableFuture<DeleteComponentResponse> deleteComponentAsync(DeleteComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteComponent);
    }

    /**
     * 删除组件
     *
     * 删除组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentAsyncInvoker(DeleteComponentRequest request) {
        return new AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>(request, AomMeta.deleteComponent, hcClient);
    }

    /**
     * 删除环境
     *
     * 删除环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvRequest 请求对象
     * @return CompletableFuture<DeleteEnvResponse>
     */
    public CompletableFuture<DeleteEnvResponse> deleteEnvAsync(DeleteEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.deleteEnv);
    }

    /**
     * 删除环境
     *
     * 删除环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvRequest 请求对象
     * @return AsyncInvoker<DeleteEnvRequest, DeleteEnvResponse>
     */
    public AsyncInvoker<DeleteEnvRequest, DeleteEnvResponse> deleteEnvAsyncInvoker(DeleteEnvRequest request) {
        return new AsyncInvoker<DeleteEnvRequest, DeleteEnvResponse>(request, AomMeta.deleteEnv, hcClient);
    }

    /**
     * 查询绑定在节点上的资源列表
     *
     * 查询绑定在节点上的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceUnderNodeRequest 请求对象
     * @return CompletableFuture<ListResourceUnderNodeResponse>
     */
    public CompletableFuture<ListResourceUnderNodeResponse> listResourceUnderNodeAsync(ListResourceUnderNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listResourceUnderNode);
    }

    /**
     * 查询绑定在节点上的资源列表
     *
     * 查询绑定在节点上的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceUnderNodeRequest 请求对象
     * @return AsyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse>
     */
    public AsyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse> listResourceUnderNodeAsyncInvoker(ListResourceUnderNodeRequest request) {
        return new AsyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse>(request, AomMeta.listResourceUnderNode, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return CompletableFuture<ShowAppResponse>
     */
    public CompletableFuture<ShowAppResponse> showAppAsync(ShowAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showApp);
    }

    /**
     * 查询应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return AsyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public AsyncInvoker<ShowAppRequest, ShowAppResponse> showAppAsyncInvoker(ShowAppRequest request) {
        return new AsyncInvoker<ShowAppRequest, ShowAppResponse>(request, AomMeta.showApp, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppByNameRequest 请求对象
     * @return CompletableFuture<ShowAppByNameResponse>
     */
    public CompletableFuture<ShowAppByNameResponse> showAppByNameAsync(ShowAppByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showAppByName);
    }

    /**
     * 查询应用详情
     *
     * 获取应用详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppByNameRequest 请求对象
     * @return AsyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse>
     */
    public AsyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse> showAppByNameAsyncInvoker(ShowAppByNameRequest request) {
        return new AsyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse>(request, AomMeta.showAppByName, hcClient);
    }

    /**
     * 查询组件详情
     *
     * 查询组件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return CompletableFuture<ShowComponentResponse>
     */
    public CompletableFuture<ShowComponentResponse> showComponentAsync(ShowComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showComponent);
    }

    /**
     * 查询组件详情
     *
     * 查询组件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return AsyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public AsyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentAsyncInvoker(ShowComponentRequest request) {
        return new AsyncInvoker<ShowComponentRequest, ShowComponentResponse>(request, AomMeta.showComponent, hcClient);
    }

    /**
     * 查询组件详情
     *
     * 查询组件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentByNameRequest 请求对象
     * @return CompletableFuture<ShowComponentByNameResponse>
     */
    public CompletableFuture<ShowComponentByNameResponse> showComponentByNameAsync(ShowComponentByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showComponentByName);
    }

    /**
     * 查询组件详情
     *
     * 查询组件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentByNameRequest 请求对象
     * @return AsyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse>
     */
    public AsyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse> showComponentByNameAsyncInvoker(ShowComponentByNameRequest request) {
        return new AsyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse>(request, AomMeta.showComponentByName, hcClient);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvRequest 请求对象
     * @return CompletableFuture<ShowEnvResponse>
     */
    public CompletableFuture<ShowEnvResponse> showEnvAsync(ShowEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showEnv);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvRequest 请求对象
     * @return AsyncInvoker<ShowEnvRequest, ShowEnvResponse>
     */
    public AsyncInvoker<ShowEnvRequest, ShowEnvResponse> showEnvAsyncInvoker(ShowEnvRequest request) {
        return new AsyncInvoker<ShowEnvRequest, ShowEnvResponse>(request, AomMeta.showEnv, hcClient);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvByNameRequest 请求对象
     * @return CompletableFuture<ShowEnvByNameResponse>
     */
    public CompletableFuture<ShowEnvByNameResponse> showEnvByNameAsync(ShowEnvByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showEnvByName);
    }

    /**
     * 查询环境详情
     *
     * 查询环境详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvByNameRequest 请求对象
     * @return AsyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse>
     */
    public AsyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse> showEnvByNameAsyncInvoker(ShowEnvByNameRequest request) {
        return new AsyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse>(request, AomMeta.showEnvByName, hcClient);
    }

    /**
     * 修改应用
     *
     * 修改应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return CompletableFuture<UpdateAppResponse>
     */
    public CompletableFuture<UpdateAppResponse> updateAppAsync(UpdateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateApp);
    }

    /**
     * 修改应用
     *
     * 修改应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return AsyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public AsyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppAsyncInvoker(UpdateAppRequest request) {
        return new AsyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, AomMeta.updateApp, hcClient);
    }

    /**
     * 修改组件
     *
     * 修改组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return CompletableFuture<UpdateComponentResponse>
     */
    public CompletableFuture<UpdateComponentResponse> updateComponentAsync(UpdateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateComponent);
    }

    /**
     * 修改组件
     *
     * 修改组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse>
     */
    public AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse> updateComponentAsyncInvoker(UpdateComponentRequest request) {
        return new AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse>(request, AomMeta.updateComponent, hcClient);
    }

    /**
     * 修改环境
     *
     * 修改环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnvRequest 请求对象
     * @return CompletableFuture<UpdateEnvResponse>
     */
    public CompletableFuture<UpdateEnvResponse> updateEnvAsync(UpdateEnvRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateEnv);
    }

    /**
     * 修改环境
     *
     * 修改环境
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnvRequest 请求对象
     * @return AsyncInvoker<UpdateEnvRequest, UpdateEnvResponse>
     */
    public AsyncInvoker<UpdateEnvRequest, UpdateEnvResponse> updateEnvAsyncInvoker(UpdateEnvRequest request) {
        return new AsyncInvoker<UpdateEnvRequest, UpdateEnvResponse>(request, AomMeta.updateEnv, hcClient);
    }

}