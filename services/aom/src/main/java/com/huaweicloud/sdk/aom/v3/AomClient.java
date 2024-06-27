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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AomClient {

    protected HcClient hcClient;

    public AomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomClient> newBuilder() {
        ClientBuilder<AomClient> clientBuilder = new ClientBuilder<>(AomClient::new);
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
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createApp);
    }

    /**
     * 新增应用
     *
     * 该接口用于新增应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<>(request, AomMeta.createApp, hcClient);
    }

    /**
     * 新增组件
     *
     * 该接口用于新增组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentRequest 请求对象
     * @return CreateComponentResponse
     */
    public CreateComponentResponse createComponent(CreateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createComponent);
    }

    /**
     * 新增组件
     *
     * 该接口用于新增组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateComponentRequest 请求对象
     * @return SyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public SyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentInvoker(
        CreateComponentRequest request) {
        return new SyncInvoker<>(request, AomMeta.createComponent, hcClient);
    }

    /**
     * 创建环境
     *
     * 该接口用于创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvRequest 请求对象
     * @return CreateEnvResponse
     */
    public CreateEnvResponse createEnv(CreateEnvRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createEnv);
    }

    /**
     * 创建环境
     *
     * 该接口用于创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEnvRequest 请求对象
     * @return SyncInvoker<CreateEnvRequest, CreateEnvResponse>
     */
    public SyncInvoker<CreateEnvRequest, CreateEnvResponse> createEnvInvoker(CreateEnvRequest request) {
        return new SyncInvoker<>(request, AomMeta.createEnv, hcClient);
    }

    /**
     * 新增子应用
     *
     * 该接口用于新增子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubAppRequest 请求对象
     * @return CreateSubAppResponse
     */
    public CreateSubAppResponse createSubApp(CreateSubAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.createSubApp);
    }

    /**
     * 新增子应用
     *
     * 该接口用于新增子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubAppRequest 请求对象
     * @return SyncInvoker<CreateSubAppRequest, CreateSubAppResponse>
     */
    public SyncInvoker<CreateSubAppRequest, CreateSubAppResponse> createSubAppInvoker(CreateSubAppRequest request) {
        return new SyncInvoker<>(request, AomMeta.createSubApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 该接口用于删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 该接口用于删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<>(request, AomMeta.deleteApp, hcClient);
    }

    /**
     * 删除组件
     *
     * 该接口用于删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentRequest 请求对象
     * @return DeleteComponentResponse
     */
    public DeleteComponentResponse deleteComponent(DeleteComponentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteComponent);
    }

    /**
     * 删除组件
     *
     * 该接口用于删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteComponentRequest 请求对象
     * @return SyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public SyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentInvoker(
        DeleteComponentRequest request) {
        return new SyncInvoker<>(request, AomMeta.deleteComponent, hcClient);
    }

    /**
     * 删除环境
     *
     * 该接口用于删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvRequest 请求对象
     * @return DeleteEnvResponse
     */
    public DeleteEnvResponse deleteEnv(DeleteEnvRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteEnv);
    }

    /**
     * 删除环境
     *
     * 该接口用于删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnvRequest 请求对象
     * @return SyncInvoker<DeleteEnvRequest, DeleteEnvResponse>
     */
    public SyncInvoker<DeleteEnvRequest, DeleteEnvResponse> deleteEnvInvoker(DeleteEnvRequest request) {
        return new SyncInvoker<>(request, AomMeta.deleteEnv, hcClient);
    }

    /**
     * 删除子应用
     *
     * 该接口用于删除子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubAppRequest 请求对象
     * @return DeleteSubAppResponse
     */
    public DeleteSubAppResponse deleteSubApp(DeleteSubAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.deleteSubApp);
    }

    /**
     * 删除子应用
     *
     * 该接口用于删除子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubAppRequest 请求对象
     * @return SyncInvoker<DeleteSubAppRequest, DeleteSubAppResponse>
     */
    public SyncInvoker<DeleteSubAppRequest, DeleteSubAppResponse> deleteSubAppInvoker(DeleteSubAppRequest request) {
        return new SyncInvoker<>(request, AomMeta.deleteSubApp, hcClient);
    }

    /**
     * 查询绑定在节点上的资源列表
     *
     * 该接口用于查询绑定在节点上的资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceUnderNodeRequest 请求对象
     * @return ListResourceUnderNodeResponse
     */
    public ListResourceUnderNodeResponse listResourceUnderNode(ListResourceUnderNodeRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.listResourceUnderNode);
    }

    /**
     * 查询绑定在节点上的资源列表
     *
     * 该接口用于查询绑定在节点上的资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceUnderNodeRequest 请求对象
     * @return SyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse>
     */
    public SyncInvoker<ListResourceUnderNodeRequest, ListResourceUnderNodeResponse> listResourceUnderNodeInvoker(
        ListResourceUnderNodeRequest request) {
        return new SyncInvoker<>(request, AomMeta.listResourceUnderNode, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return ShowAppResponse
     */
    public ShowAppResponse showApp(ShowAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showApp);
    }

    /**
     * 查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<>(request, AomMeta.showApp, hcClient);
    }

    /**
     * 根据应用名称查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppByNameRequest 请求对象
     * @return ShowAppByNameResponse
     */
    public ShowAppByNameResponse showAppByName(ShowAppByNameRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showAppByName);
    }

    /**
     * 根据应用名称查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppByNameRequest 请求对象
     * @return SyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse>
     */
    public SyncInvoker<ShowAppByNameRequest, ShowAppByNameResponse> showAppByNameInvoker(ShowAppByNameRequest request) {
        return new SyncInvoker<>(request, AomMeta.showAppByName, hcClient);
    }

    /**
     * 查询组件详情
     *
     * 该接口用于查询组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRequest 请求对象
     * @return ShowComponentResponse
     */
    public ShowComponentResponse showComponent(ShowComponentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showComponent);
    }

    /**
     * 查询组件详情
     *
     * 该接口用于查询组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentRequest 请求对象
     * @return SyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public SyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentInvoker(ShowComponentRequest request) {
        return new SyncInvoker<>(request, AomMeta.showComponent, hcClient);
    }

    /**
     * 根据组件名称查询组件详情
     *
     * 该接口用于查询组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentByNameRequest 请求对象
     * @return ShowComponentByNameResponse
     */
    public ShowComponentByNameResponse showComponentByName(ShowComponentByNameRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showComponentByName);
    }

    /**
     * 根据组件名称查询组件详情
     *
     * 该接口用于查询组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowComponentByNameRequest 请求对象
     * @return SyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse>
     */
    public SyncInvoker<ShowComponentByNameRequest, ShowComponentByNameResponse> showComponentByNameInvoker(
        ShowComponentByNameRequest request) {
        return new SyncInvoker<>(request, AomMeta.showComponentByName, hcClient);
    }

    /**
     * 查询环境详情
     *
     * 该接口用于查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvRequest 请求对象
     * @return ShowEnvResponse
     */
    public ShowEnvResponse showEnv(ShowEnvRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showEnv);
    }

    /**
     * 查询环境详情
     *
     * 该接口用于查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvRequest 请求对象
     * @return SyncInvoker<ShowEnvRequest, ShowEnvResponse>
     */
    public SyncInvoker<ShowEnvRequest, ShowEnvResponse> showEnvInvoker(ShowEnvRequest request) {
        return new SyncInvoker<>(request, AomMeta.showEnv, hcClient);
    }

    /**
     * 根据环境名称查询环境详情
     *
     * 该接口用于查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvByNameRequest 请求对象
     * @return ShowEnvByNameResponse
     */
    public ShowEnvByNameResponse showEnvByName(ShowEnvByNameRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showEnvByName);
    }

    /**
     * 根据环境名称查询环境详情
     *
     * 该接口用于查询环境详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEnvByNameRequest 请求对象
     * @return SyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse>
     */
    public SyncInvoker<ShowEnvByNameRequest, ShowEnvByNameResponse> showEnvByNameInvoker(ShowEnvByNameRequest request) {
        return new SyncInvoker<>(request, AomMeta.showEnvByName, hcClient);
    }

    /**
     * 修改应用
     *
     * 该接口用于修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateApp);
    }

    /**
     * 修改应用
     *
     * 该接口用于修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<>(request, AomMeta.updateApp, hcClient);
    }

    /**
     * 修改组件
     *
     * 该接口用于修改组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentRequest 请求对象
     * @return UpdateComponentResponse
     */
    public UpdateComponentResponse updateComponent(UpdateComponentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateComponent);
    }

    /**
     * 修改组件
     *
     * 该接口用于修改组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateComponentRequest 请求对象
     * @return SyncInvoker<UpdateComponentRequest, UpdateComponentResponse>
     */
    public SyncInvoker<UpdateComponentRequest, UpdateComponentResponse> updateComponentInvoker(
        UpdateComponentRequest request) {
        return new SyncInvoker<>(request, AomMeta.updateComponent, hcClient);
    }

    /**
     * 修改环境
     *
     * 该接口用于修改环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvRequest 请求对象
     * @return UpdateEnvResponse
     */
    public UpdateEnvResponse updateEnv(UpdateEnvRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateEnv);
    }

    /**
     * 修改环境
     *
     * 该接口用于修改环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnvRequest 请求对象
     * @return SyncInvoker<UpdateEnvRequest, UpdateEnvResponse>
     */
    public SyncInvoker<UpdateEnvRequest, UpdateEnvResponse> updateEnvInvoker(UpdateEnvRequest request) {
        return new SyncInvoker<>(request, AomMeta.updateEnv, hcClient);
    }

    /**
     * 修改子应用
     *
     * 该接口用于修改子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubAppRequest 请求对象
     * @return UpdateSubAppResponse
     */
    public UpdateSubAppResponse updateSubApp(UpdateSubAppRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.updateSubApp);
    }

    /**
     * 修改子应用
     *
     * 该接口用于修改子应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubAppRequest 请求对象
     * @return SyncInvoker<UpdateSubAppRequest, UpdateSubAppResponse>
     */
    public SyncInvoker<UpdateSubAppRequest, UpdateSubAppResponse> updateSubAppInvoker(UpdateSubAppRequest request) {
        return new SyncInvoker<>(request, AomMeta.updateSubApp, hcClient);
    }

}
