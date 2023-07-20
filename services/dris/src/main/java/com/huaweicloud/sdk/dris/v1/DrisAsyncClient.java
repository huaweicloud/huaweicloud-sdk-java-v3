package com.huaweicloud.sdk.dris.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dris.v1.model.AddForwardingConfigsRequest;
import com.huaweicloud.sdk.dris.v1.model.AddForwardingConfigsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowEdgeAppVersionsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowEdgeAppVersionsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowEdgeAppsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowEdgeAppsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowIpcsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowIpcsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowRadarsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowRadarsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowRsusRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowRsusResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowTrafficControllersRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowTrafficControllersResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowTrafficEventsRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowTrafficEventsResponse;
import com.huaweicloud.sdk.dris.v1.model.BatchShowVehiclesRequest;
import com.huaweicloud.sdk.dris.v1.model.BatchShowVehiclesResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateDataChannelRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateDataChannelResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateRsuModelRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateRsuModelResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateRsuRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateRsuResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateTrafficControllerRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateTrafficControllerResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateTrafficEventRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateTrafficEventResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateV2xEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateV2xEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateV2xEdgeRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateV2xEdgeResponse;
import com.huaweicloud.sdk.dris.v1.model.CreateVehicleRequest;
import com.huaweicloud.sdk.dris.v1.model.CreateVehicleResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteDataChannelRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteDataChannelResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteForwardingConfigRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteForwardingConfigResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteRsuModelRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteRsuModelResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteRsuRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteRsuResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteTrafficControllerRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteTrafficControllerResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteTrafficEventRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteTrafficEventResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteV2XEdgeAppByEdgeAppIdRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteV2XEdgeAppByEdgeAppIdResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteV2XEdgeByV2xEdgeIdRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteV2XEdgeByV2xEdgeIdResponse;
import com.huaweicloud.sdk.dris.v1.model.DeleteVehicleRequest;
import com.huaweicloud.sdk.dris.v1.model.DeleteVehicleResponse;
import com.huaweicloud.sdk.dris.v1.model.ListEdgeFlowsRequest;
import com.huaweicloud.sdk.dris.v1.model.ListEdgeFlowsResponse;
import com.huaweicloud.sdk.dris.v1.model.ListRsuModelsRequest;
import com.huaweicloud.sdk.dris.v1.model.ListRsuModelsResponse;
import com.huaweicloud.sdk.dris.v1.model.ListV2xEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.ListV2xEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.ListV2xEdgesRequest;
import com.huaweicloud.sdk.dris.v1.model.ListV2xEdgesResponse;
import com.huaweicloud.sdk.dris.v1.model.SendImmediateEventRequest;
import com.huaweicloud.sdk.dris.v1.model.SendImmediateEventResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowDataChannelRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowDataChannelResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowDeploymentCodeRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowDeploymentCodeResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowForwardingConfigRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowForwardingConfigResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowForwardingConfigsRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowForwardingConfigsResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowHistoryTrafficEventsRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowHistoryTrafficEventsResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowIpcRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowIpcResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowRsuModelRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowRsuModelResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowTrafficEventRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowTrafficEventResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowV2XEdgeAppDetailByEdgeAppIdRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowV2XEdgeAppDetailByEdgeAppIdResponse;
import com.huaweicloud.sdk.dris.v1.model.ShowV2xEdgeDetailRequest;
import com.huaweicloud.sdk.dris.v1.model.ShowV2xEdgeDetailResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateDataChannelRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateDataChannelResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeApplicationVersionStateRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateEdgeApplicationVersionStateResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateForwardingConfigRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateForwardingConfigResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateRsuModelRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateRsuModelResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateRsuRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateRsuResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateTrafficControllerRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateTrafficControllerResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateTrafficEventRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateTrafficEventResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateV2xEdgeAppRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateV2xEdgeAppResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateV2xEdgeRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateV2xEdgeResponse;
import com.huaweicloud.sdk.dris.v1.model.UpdateVehicleRequest;
import com.huaweicloud.sdk.dris.v1.model.UpdateVehicleResponse;

import java.util.concurrent.CompletableFuture;

public class DrisAsyncClient {

    protected HcClient hcClient;

    public DrisAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrisAsyncClient> newBuilder() {
        ClientBuilder<DrisAsyncClient> clientBuilder = new ClientBuilder<>(DrisAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建业务通道
     *
     * 创建业务通道，用于创建Edge消息上报的数据通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataChannelRequest 请求对象
     * @return CompletableFuture<CreateDataChannelResponse>
     */
    public CompletableFuture<CreateDataChannelResponse> createDataChannelAsync(CreateDataChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createDataChannel);
    }

    /**
     * 创建业务通道
     *
     * 创建业务通道，用于创建Edge消息上报的数据通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataChannelRequest 请求对象
     * @return AsyncInvoker<CreateDataChannelRequest, CreateDataChannelResponse>
     */
    public AsyncInvoker<CreateDataChannelRequest, CreateDataChannelResponse> createDataChannelAsyncInvoker(
        CreateDataChannelRequest request) {
        return new AsyncInvoker<CreateDataChannelRequest, CreateDataChannelResponse>(request,
            DrisMeta.createDataChannel, hcClient);
    }

    /**
     * 删除业务通道
     *
     * 删除业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataChannelRequest 请求对象
     * @return CompletableFuture<DeleteDataChannelResponse>
     */
    public CompletableFuture<DeleteDataChannelResponse> deleteDataChannelAsync(DeleteDataChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteDataChannel);
    }

    /**
     * 删除业务通道
     *
     * 删除业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataChannelRequest 请求对象
     * @return AsyncInvoker<DeleteDataChannelRequest, DeleteDataChannelResponse>
     */
    public AsyncInvoker<DeleteDataChannelRequest, DeleteDataChannelResponse> deleteDataChannelAsyncInvoker(
        DeleteDataChannelRequest request) {
        return new AsyncInvoker<DeleteDataChannelRequest, DeleteDataChannelResponse>(request,
            DrisMeta.deleteDataChannel, hcClient);
    }

    /**
     * 查询业务通道
     *
     * 查询业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataChannelRequest 请求对象
     * @return CompletableFuture<ShowDataChannelResponse>
     */
    public CompletableFuture<ShowDataChannelResponse> showDataChannelAsync(ShowDataChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showDataChannel);
    }

    /**
     * 查询业务通道
     *
     * 查询业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataChannelRequest 请求对象
     * @return AsyncInvoker<ShowDataChannelRequest, ShowDataChannelResponse>
     */
    public AsyncInvoker<ShowDataChannelRequest, ShowDataChannelResponse> showDataChannelAsyncInvoker(
        ShowDataChannelRequest request) {
        return new AsyncInvoker<ShowDataChannelRequest, ShowDataChannelResponse>(request, DrisMeta.showDataChannel,
            hcClient);
    }

    /**
     * 修改业务通道
     *
     * 修改业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataChannelRequest 请求对象
     * @return CompletableFuture<UpdateDataChannelResponse>
     */
    public CompletableFuture<UpdateDataChannelResponse> updateDataChannelAsync(UpdateDataChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateDataChannel);
    }

    /**
     * 修改业务通道
     *
     * 修改业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataChannelRequest 请求对象
     * @return AsyncInvoker<UpdateDataChannelRequest, UpdateDataChannelResponse>
     */
    public AsyncInvoker<UpdateDataChannelRequest, UpdateDataChannelResponse> updateDataChannelAsyncInvoker(
        UpdateDataChannelRequest request) {
        return new AsyncInvoker<UpdateDataChannelRequest, UpdateDataChannelResponse>(request,
            DrisMeta.updateDataChannel, hcClient);
    }

    /**
     * 创建Edge
     *
     * 创建Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateV2xEdgeRequest 请求对象
     * @return CompletableFuture<CreateV2xEdgeResponse>
     */
    public CompletableFuture<CreateV2xEdgeResponse> createV2xEdgeAsync(CreateV2xEdgeRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createV2xEdge);
    }

    /**
     * 创建Edge
     *
     * 创建Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateV2xEdgeRequest 请求对象
     * @return AsyncInvoker<CreateV2xEdgeRequest, CreateV2xEdgeResponse>
     */
    public AsyncInvoker<CreateV2xEdgeRequest, CreateV2xEdgeResponse> createV2xEdgeAsyncInvoker(
        CreateV2xEdgeRequest request) {
        return new AsyncInvoker<CreateV2xEdgeRequest, CreateV2xEdgeResponse>(request, DrisMeta.createV2xEdge, hcClient);
    }

    /**
     * 删除Edge
     *
     * 删除Edge之前需要删除Edge下的业务通道和关联设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteV2XEdgeByV2xEdgeIdRequest 请求对象
     * @return CompletableFuture<DeleteV2XEdgeByV2xEdgeIdResponse>
     */
    public CompletableFuture<DeleteV2XEdgeByV2xEdgeIdResponse> deleteV2XEdgeByV2xEdgeIdAsync(
        DeleteV2XEdgeByV2xEdgeIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteV2XEdgeByV2xEdgeId);
    }

    /**
     * 删除Edge
     *
     * 删除Edge之前需要删除Edge下的业务通道和关联设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteV2XEdgeByV2xEdgeIdRequest 请求对象
     * @return AsyncInvoker<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse>
     */
    public AsyncInvoker<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse> deleteV2XEdgeByV2xEdgeIdAsyncInvoker(
        DeleteV2XEdgeByV2xEdgeIdRequest request) {
        return new AsyncInvoker<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse>(request,
            DrisMeta.deleteV2XEdgeByV2xEdgeId, hcClient);
    }

    /**
     * 查询Edge列表
     *
     * 查询Edge列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListV2xEdgesRequest 请求对象
     * @return CompletableFuture<ListV2xEdgesResponse>
     */
    public CompletableFuture<ListV2xEdgesResponse> listV2xEdgesAsync(ListV2xEdgesRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.listV2xEdges);
    }

    /**
     * 查询Edge列表
     *
     * 查询Edge列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListV2xEdgesRequest 请求对象
     * @return AsyncInvoker<ListV2xEdgesRequest, ListV2xEdgesResponse>
     */
    public AsyncInvoker<ListV2xEdgesRequest, ListV2xEdgesResponse> listV2xEdgesAsyncInvoker(
        ListV2xEdgesRequest request) {
        return new AsyncInvoker<ListV2xEdgesRequest, ListV2xEdgesResponse>(request, DrisMeta.listV2xEdges, hcClient);
    }

    /**
     * 生成部署应用安装命令
     *
     * 生成部署应用安装命令,然后在ITS800或者ATLAS500上通过Shell执行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentCodeRequest 请求对象
     * @return CompletableFuture<ShowDeploymentCodeResponse>
     */
    public CompletableFuture<ShowDeploymentCodeResponse> showDeploymentCodeAsync(ShowDeploymentCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showDeploymentCode);
    }

    /**
     * 生成部署应用安装命令
     *
     * 生成部署应用安装命令,然后在ITS800或者ATLAS500上通过Shell执行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentCodeRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse>
     */
    public AsyncInvoker<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse> showDeploymentCodeAsyncInvoker(
        ShowDeploymentCodeRequest request) {
        return new AsyncInvoker<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse>(request,
            DrisMeta.showDeploymentCode, hcClient);
    }

    /**
     * 查询Edge
     *
     * 查询Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowV2xEdgeDetailRequest 请求对象
     * @return CompletableFuture<ShowV2xEdgeDetailResponse>
     */
    public CompletableFuture<ShowV2xEdgeDetailResponse> showV2xEdgeDetailAsync(ShowV2xEdgeDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showV2xEdgeDetail);
    }

    /**
     * 查询Edge
     *
     * 查询Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowV2xEdgeDetailRequest 请求对象
     * @return AsyncInvoker<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse>
     */
    public AsyncInvoker<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse> showV2xEdgeDetailAsyncInvoker(
        ShowV2xEdgeDetailRequest request) {
        return new AsyncInvoker<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse>(request,
            DrisMeta.showV2xEdgeDetail, hcClient);
    }

    /**
     * 修改Edge
     *
     * 修改Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateV2xEdgeRequest 请求对象
     * @return CompletableFuture<UpdateV2xEdgeResponse>
     */
    public CompletableFuture<UpdateV2xEdgeResponse> updateV2xEdgeAsync(UpdateV2xEdgeRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateV2xEdge);
    }

    /**
     * 修改Edge
     *
     * 修改Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateV2xEdgeRequest 请求对象
     * @return AsyncInvoker<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse>
     */
    public AsyncInvoker<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse> updateV2xEdgeAsyncInvoker(
        UpdateV2xEdgeRequest request) {
        return new AsyncInvoker<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse>(request, DrisMeta.updateV2xEdge, hcClient);
    }

    /**
     * 创建数据转发配置
     *
     * 创建数据转发配置。当前仅支持数据转发至kafka，数据转发配置成功添加后配置中的Topic消息将会转发至指定的brokers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddForwardingConfigsRequest 请求对象
     * @return CompletableFuture<AddForwardingConfigsResponse>
     */
    public CompletableFuture<AddForwardingConfigsResponse> addForwardingConfigsAsync(
        AddForwardingConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.addForwardingConfigs);
    }

    /**
     * 创建数据转发配置
     *
     * 创建数据转发配置。当前仅支持数据转发至kafka，数据转发配置成功添加后配置中的Topic消息将会转发至指定的brokers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddForwardingConfigsRequest 请求对象
     * @return AsyncInvoker<AddForwardingConfigsRequest, AddForwardingConfigsResponse>
     */
    public AsyncInvoker<AddForwardingConfigsRequest, AddForwardingConfigsResponse> addForwardingConfigsAsyncInvoker(
        AddForwardingConfigsRequest request) {
        return new AsyncInvoker<AddForwardingConfigsRequest, AddForwardingConfigsResponse>(request,
            DrisMeta.addForwardingConfigs, hcClient);
    }

    /**
     * 删除数据转发配置
     *
     * 根据转发配置的唯一ID（forwarding_config_id）删除数据转发配置，删除后配置中订阅的topic消息将不会被转发至brokers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteForwardingConfigRequest 请求对象
     * @return CompletableFuture<DeleteForwardingConfigResponse>
     */
    public CompletableFuture<DeleteForwardingConfigResponse> deleteForwardingConfigAsync(
        DeleteForwardingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteForwardingConfig);
    }

    /**
     * 删除数据转发配置
     *
     * 根据转发配置的唯一ID（forwarding_config_id）删除数据转发配置，删除后配置中订阅的topic消息将不会被转发至brokers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteForwardingConfigRequest 请求对象
     * @return AsyncInvoker<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse>
     */
    public AsyncInvoker<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse> deleteForwardingConfigAsyncInvoker(
        DeleteForwardingConfigRequest request) {
        return new AsyncInvoker<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse>(request,
            DrisMeta.deleteForwardingConfig, hcClient);
    }

    /**
     * 查询数据转发配置
     *
     * 根据转发配置的唯一ID（forwarding_config_id）查询数据转发配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowForwardingConfigRequest 请求对象
     * @return CompletableFuture<ShowForwardingConfigResponse>
     */
    public CompletableFuture<ShowForwardingConfigResponse> showForwardingConfigAsync(
        ShowForwardingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showForwardingConfig);
    }

    /**
     * 查询数据转发配置
     *
     * 根据转发配置的唯一ID（forwarding_config_id）查询数据转发配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowForwardingConfigRequest 请求对象
     * @return AsyncInvoker<ShowForwardingConfigRequest, ShowForwardingConfigResponse>
     */
    public AsyncInvoker<ShowForwardingConfigRequest, ShowForwardingConfigResponse> showForwardingConfigAsyncInvoker(
        ShowForwardingConfigRequest request) {
        return new AsyncInvoker<ShowForwardingConfigRequest, ShowForwardingConfigResponse>(request,
            DrisMeta.showForwardingConfig, hcClient);
    }

    /**
     * 查询数据转发配置列表
     *
     * 查询数据转发配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowForwardingConfigsRequest 请求对象
     * @return CompletableFuture<ShowForwardingConfigsResponse>
     */
    public CompletableFuture<ShowForwardingConfigsResponse> showForwardingConfigsAsync(
        ShowForwardingConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showForwardingConfigs);
    }

    /**
     * 查询数据转发配置列表
     *
     * 查询数据转发配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowForwardingConfigsRequest 请求对象
     * @return AsyncInvoker<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse>
     */
    public AsyncInvoker<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse> showForwardingConfigsAsyncInvoker(
        ShowForwardingConfigsRequest request) {
        return new AsyncInvoker<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse>(request,
            DrisMeta.showForwardingConfigs, hcClient);
    }

    /**
     * 修改数据转发配置
     *
     * 根据转发配置的唯一ID（forwarding_config_id）修改数据转发配置，当前支持更新的字段有topicPrefix、userTopics、brokers，需要把该字段新的对应值全量写入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateForwardingConfigRequest 请求对象
     * @return CompletableFuture<UpdateForwardingConfigResponse>
     */
    public CompletableFuture<UpdateForwardingConfigResponse> updateForwardingConfigAsync(
        UpdateForwardingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateForwardingConfig);
    }

    /**
     * 修改数据转发配置
     *
     * 根据转发配置的唯一ID（forwarding_config_id）修改数据转发配置，当前支持更新的字段有topicPrefix、userTopics、brokers，需要把该字段新的对应值全量写入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateForwardingConfigRequest 请求对象
     * @return AsyncInvoker<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse>
     */
    public AsyncInvoker<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse> updateForwardingConfigAsyncInvoker(
        UpdateForwardingConfigRequest request) {
        return new AsyncInvoker<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse>(request,
            DrisMeta.updateForwardingConfig, hcClient);
    }

    /**
     * 查询历史交通统计信息列表
     *
     * 查询历史交通统计信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeFlowsRequest 请求对象
     * @return CompletableFuture<ListEdgeFlowsResponse>
     */
    public CompletableFuture<ListEdgeFlowsResponse> listEdgeFlowsAsync(ListEdgeFlowsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.listEdgeFlows);
    }

    /**
     * 查询历史交通统计信息列表
     *
     * 查询历史交通统计信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeFlowsRequest 请求对象
     * @return AsyncInvoker<ListEdgeFlowsRequest, ListEdgeFlowsResponse>
     */
    public AsyncInvoker<ListEdgeFlowsRequest, ListEdgeFlowsResponse> listEdgeFlowsAsyncInvoker(
        ListEdgeFlowsRequest request) {
        return new AsyncInvoker<ListEdgeFlowsRequest, ListEdgeFlowsResponse>(request, DrisMeta.listEdgeFlows, hcClient);
    }

    /**
     * 查询历史交通事件列表
     *
     * 查询历史交通事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryTrafficEventsRequest 请求对象
     * @return CompletableFuture<ShowHistoryTrafficEventsResponse>
     */
    public CompletableFuture<ShowHistoryTrafficEventsResponse> showHistoryTrafficEventsAsync(
        ShowHistoryTrafficEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showHistoryTrafficEvents);
    }

    /**
     * 查询历史交通事件列表
     *
     * 查询历史交通事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryTrafficEventsRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse>
     */
    public AsyncInvoker<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse> showHistoryTrafficEventsAsyncInvoker(
        ShowHistoryTrafficEventsRequest request) {
        return new AsyncInvoker<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse>(request,
            DrisMeta.showHistoryTrafficEvents, hcClient);
    }

    /**
     * 查询IPC列表
     *
     * 获取多个IPC资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowIpcsRequest 请求对象
     * @return CompletableFuture<BatchShowIpcsResponse>
     */
    public CompletableFuture<BatchShowIpcsResponse> batchShowIpcsAsync(BatchShowIpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.batchShowIpcs);
    }

    /**
     * 查询IPC列表
     *
     * 获取多个IPC资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowIpcsRequest 请求对象
     * @return AsyncInvoker<BatchShowIpcsRequest, BatchShowIpcsResponse>
     */
    public AsyncInvoker<BatchShowIpcsRequest, BatchShowIpcsResponse> batchShowIpcsAsyncInvoker(
        BatchShowIpcsRequest request) {
        return new AsyncInvoker<BatchShowIpcsRequest, BatchShowIpcsResponse>(request, DrisMeta.batchShowIpcs, hcClient);
    }

    /**
     * 查询IPC
     *
     * 查询IPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpcRequest 请求对象
     * @return CompletableFuture<ShowIpcResponse>
     */
    public CompletableFuture<ShowIpcResponse> showIpcAsync(ShowIpcRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showIpc);
    }

    /**
     * 查询IPC
     *
     * 查询IPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpcRequest 请求对象
     * @return AsyncInvoker<ShowIpcRequest, ShowIpcResponse>
     */
    public AsyncInvoker<ShowIpcRequest, ShowIpcResponse> showIpcAsyncInvoker(ShowIpcRequest request) {
        return new AsyncInvoker<ShowIpcRequest, ShowIpcResponse>(request, DrisMeta.showIpc, hcClient);
    }

    /**
     * 查询雷达列表
     *
     * 查询雷达列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowRadarsRequest 请求对象
     * @return CompletableFuture<BatchShowRadarsResponse>
     */
    public CompletableFuture<BatchShowRadarsResponse> batchShowRadarsAsync(BatchShowRadarsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.batchShowRadars);
    }

    /**
     * 查询雷达列表
     *
     * 查询雷达列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowRadarsRequest 请求对象
     * @return AsyncInvoker<BatchShowRadarsRequest, BatchShowRadarsResponse>
     */
    public AsyncInvoker<BatchShowRadarsRequest, BatchShowRadarsResponse> batchShowRadarsAsyncInvoker(
        BatchShowRadarsRequest request) {
        return new AsyncInvoker<BatchShowRadarsRequest, BatchShowRadarsResponse>(request, DrisMeta.batchShowRadars,
            hcClient);
    }

    /**
     * 查询RSU列表
     *
     * 查询RSU列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowRsusRequest 请求对象
     * @return CompletableFuture<BatchShowRsusResponse>
     */
    public CompletableFuture<BatchShowRsusResponse> batchShowRsusAsync(BatchShowRsusRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.batchShowRsus);
    }

    /**
     * 查询RSU列表
     *
     * 查询RSU列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowRsusRequest 请求对象
     * @return AsyncInvoker<BatchShowRsusRequest, BatchShowRsusResponse>
     */
    public AsyncInvoker<BatchShowRsusRequest, BatchShowRsusResponse> batchShowRsusAsyncInvoker(
        BatchShowRsusRequest request) {
        return new AsyncInvoker<BatchShowRsusRequest, BatchShowRsusResponse>(request, DrisMeta.batchShowRsus, hcClient);
    }

    /**
     * 创建RSU
     *
     * 创建RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRsuRequest 请求对象
     * @return CompletableFuture<CreateRsuResponse>
     */
    public CompletableFuture<CreateRsuResponse> createRsuAsync(CreateRsuRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createRsu);
    }

    /**
     * 创建RSU
     *
     * 创建RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRsuRequest 请求对象
     * @return AsyncInvoker<CreateRsuRequest, CreateRsuResponse>
     */
    public AsyncInvoker<CreateRsuRequest, CreateRsuResponse> createRsuAsyncInvoker(CreateRsuRequest request) {
        return new AsyncInvoker<CreateRsuRequest, CreateRsuResponse>(request, DrisMeta.createRsu, hcClient);
    }

    /**
     * 删除RSU
     *
     * 删除RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRsuRequest 请求对象
     * @return CompletableFuture<DeleteRsuResponse>
     */
    public CompletableFuture<DeleteRsuResponse> deleteRsuAsync(DeleteRsuRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteRsu);
    }

    /**
     * 删除RSU
     *
     * 删除RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRsuRequest 请求对象
     * @return AsyncInvoker<DeleteRsuRequest, DeleteRsuResponse>
     */
    public AsyncInvoker<DeleteRsuRequest, DeleteRsuResponse> deleteRsuAsyncInvoker(DeleteRsuRequest request) {
        return new AsyncInvoker<DeleteRsuRequest, DeleteRsuResponse>(request, DrisMeta.deleteRsu, hcClient);
    }

    /**
     * 修改RSU
     *
     * 修改RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRsuRequest 请求对象
     * @return CompletableFuture<UpdateRsuResponse>
     */
    public CompletableFuture<UpdateRsuResponse> updateRsuAsync(UpdateRsuRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateRsu);
    }

    /**
     * 修改RSU
     *
     * 修改RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRsuRequest 请求对象
     * @return AsyncInvoker<UpdateRsuRequest, UpdateRsuResponse>
     */
    public AsyncInvoker<UpdateRsuRequest, UpdateRsuResponse> updateRsuAsyncInvoker(UpdateRsuRequest request) {
        return new AsyncInvoker<UpdateRsuRequest, UpdateRsuResponse>(request, DrisMeta.updateRsu, hcClient);
    }

    /**
     * 创建即时交通事件
     *
     * 创建即时交通事件，平台分发即时交通事件给目标设备的接口。事件一旦创建便会立即下发且只会下发一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendImmediateEventRequest 请求对象
     * @return CompletableFuture<SendImmediateEventResponse>
     */
    public CompletableFuture<SendImmediateEventResponse> sendImmediateEventAsync(SendImmediateEventRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.sendImmediateEvent);
    }

    /**
     * 创建即时交通事件
     *
     * 创建即时交通事件，平台分发即时交通事件给目标设备的接口。事件一旦创建便会立即下发且只会下发一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendImmediateEventRequest 请求对象
     * @return AsyncInvoker<SendImmediateEventRequest, SendImmediateEventResponse>
     */
    public AsyncInvoker<SendImmediateEventRequest, SendImmediateEventResponse> sendImmediateEventAsyncInvoker(
        SendImmediateEventRequest request) {
        return new AsyncInvoker<SendImmediateEventRequest, SendImmediateEventResponse>(request,
            DrisMeta.sendImmediateEvent, hcClient);
    }

    /**
     * 查询信号机列表
     *
     * 查询信号机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowTrafficControllersRequest 请求对象
     * @return CompletableFuture<BatchShowTrafficControllersResponse>
     */
    public CompletableFuture<BatchShowTrafficControllersResponse> batchShowTrafficControllersAsync(
        BatchShowTrafficControllersRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.batchShowTrafficControllers);
    }

    /**
     * 查询信号机列表
     *
     * 查询信号机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowTrafficControllersRequest 请求对象
     * @return AsyncInvoker<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse>
     */
    public AsyncInvoker<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse> batchShowTrafficControllersAsyncInvoker(
        BatchShowTrafficControllersRequest request) {
        return new AsyncInvoker<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse>(request,
            DrisMeta.batchShowTrafficControllers, hcClient);
    }

    /**
     * 创建信号机
     *
     * 创建信号机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficControllerRequest 请求对象
     * @return CompletableFuture<CreateTrafficControllerResponse>
     */
    public CompletableFuture<CreateTrafficControllerResponse> createTrafficControllerAsync(
        CreateTrafficControllerRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createTrafficController);
    }

    /**
     * 创建信号机
     *
     * 创建信号机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficControllerRequest 请求对象
     * @return AsyncInvoker<CreateTrafficControllerRequest, CreateTrafficControllerResponse>
     */
    public AsyncInvoker<CreateTrafficControllerRequest, CreateTrafficControllerResponse> createTrafficControllerAsyncInvoker(
        CreateTrafficControllerRequest request) {
        return new AsyncInvoker<CreateTrafficControllerRequest, CreateTrafficControllerResponse>(request,
            DrisMeta.createTrafficController, hcClient);
    }

    /**
     * 删除信号机
     *
     * 删除信号机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficControllerRequest 请求对象
     * @return CompletableFuture<DeleteTrafficControllerResponse>
     */
    public CompletableFuture<DeleteTrafficControllerResponse> deleteTrafficControllerAsync(
        DeleteTrafficControllerRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteTrafficController);
    }

    /**
     * 删除信号机
     *
     * 删除信号机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficControllerRequest 请求对象
     * @return AsyncInvoker<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse>
     */
    public AsyncInvoker<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse> deleteTrafficControllerAsyncInvoker(
        DeleteTrafficControllerRequest request) {
        return new AsyncInvoker<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse>(request,
            DrisMeta.deleteTrafficController, hcClient);
    }

    /**
     * 修改信号机
     *
     * 修改信号机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficControllerRequest 请求对象
     * @return CompletableFuture<UpdateTrafficControllerResponse>
     */
    public CompletableFuture<UpdateTrafficControllerResponse> updateTrafficControllerAsync(
        UpdateTrafficControllerRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateTrafficController);
    }

    /**
     * 修改信号机
     *
     * 修改信号机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficControllerRequest 请求对象
     * @return AsyncInvoker<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse>
     */
    public AsyncInvoker<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse> updateTrafficControllerAsyncInvoker(
        UpdateTrafficControllerRequest request) {
        return new AsyncInvoker<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse>(request,
            DrisMeta.updateTrafficController, hcClient);
    }

    /**
     * 查询长期交通事件列表
     *
     * 条件查询交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowTrafficEventsRequest 请求对象
     * @return CompletableFuture<BatchShowTrafficEventsResponse>
     */
    public CompletableFuture<BatchShowTrafficEventsResponse> batchShowTrafficEventsAsync(
        BatchShowTrafficEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.batchShowTrafficEvents);
    }

    /**
     * 查询长期交通事件列表
     *
     * 条件查询交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowTrafficEventsRequest 请求对象
     * @return AsyncInvoker<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse>
     */
    public AsyncInvoker<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse> batchShowTrafficEventsAsyncInvoker(
        BatchShowTrafficEventsRequest request) {
        return new AsyncInvoker<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse>(request,
            DrisMeta.batchShowTrafficEvents, hcClient);
    }

    /**
     * 创建长期交通事件
     *
     * 创建长期交通事件时，平台根据事件的起始时间和结束时间确定当前长期交通事件的状态。对于活跃状态的交通事件会立即下发给在事件影响范围内的RSU，对于未来事件则是在事件开始时间点下发到在事件影响范围内的RSU，过期事件不会下发。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficEventRequest 请求对象
     * @return CompletableFuture<CreateTrafficEventResponse>
     */
    public CompletableFuture<CreateTrafficEventResponse> createTrafficEventAsync(CreateTrafficEventRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createTrafficEvent);
    }

    /**
     * 创建长期交通事件
     *
     * 创建长期交通事件时，平台根据事件的起始时间和结束时间确定当前长期交通事件的状态。对于活跃状态的交通事件会立即下发给在事件影响范围内的RSU，对于未来事件则是在事件开始时间点下发到在事件影响范围内的RSU，过期事件不会下发。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficEventRequest 请求对象
     * @return AsyncInvoker<CreateTrafficEventRequest, CreateTrafficEventResponse>
     */
    public AsyncInvoker<CreateTrafficEventRequest, CreateTrafficEventResponse> createTrafficEventAsyncInvoker(
        CreateTrafficEventRequest request) {
        return new AsyncInvoker<CreateTrafficEventRequest, CreateTrafficEventResponse>(request,
            DrisMeta.createTrafficEvent, hcClient);
    }

    /**
     * 删除长期交通事件
     *
     * 刪除长期交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficEventRequest 请求对象
     * @return CompletableFuture<DeleteTrafficEventResponse>
     */
    public CompletableFuture<DeleteTrafficEventResponse> deleteTrafficEventAsync(DeleteTrafficEventRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteTrafficEvent);
    }

    /**
     * 删除长期交通事件
     *
     * 刪除长期交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficEventRequest 请求对象
     * @return AsyncInvoker<DeleteTrafficEventRequest, DeleteTrafficEventResponse>
     */
    public AsyncInvoker<DeleteTrafficEventRequest, DeleteTrafficEventResponse> deleteTrafficEventAsyncInvoker(
        DeleteTrafficEventRequest request) {
        return new AsyncInvoker<DeleteTrafficEventRequest, DeleteTrafficEventResponse>(request,
            DrisMeta.deleteTrafficEvent, hcClient);
    }

    /**
     * 查询长期交通事件
     *
     * 查询长期交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrafficEventRequest 请求对象
     * @return CompletableFuture<ShowTrafficEventResponse>
     */
    public CompletableFuture<ShowTrafficEventResponse> showTrafficEventAsync(ShowTrafficEventRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showTrafficEvent);
    }

    /**
     * 查询长期交通事件
     *
     * 查询长期交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrafficEventRequest 请求对象
     * @return AsyncInvoker<ShowTrafficEventRequest, ShowTrafficEventResponse>
     */
    public AsyncInvoker<ShowTrafficEventRequest, ShowTrafficEventResponse> showTrafficEventAsyncInvoker(
        ShowTrafficEventRequest request) {
        return new AsyncInvoker<ShowTrafficEventRequest, ShowTrafficEventResponse>(request, DrisMeta.showTrafficEvent,
            hcClient);
    }

    /**
     * 修改长期交通事件
     *
     * 修改长期交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficEventRequest 请求对象
     * @return CompletableFuture<UpdateTrafficEventResponse>
     */
    public CompletableFuture<UpdateTrafficEventResponse> updateTrafficEventAsync(UpdateTrafficEventRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateTrafficEvent);
    }

    /**
     * 修改长期交通事件
     *
     * 修改长期交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficEventRequest 请求对象
     * @return AsyncInvoker<UpdateTrafficEventRequest, UpdateTrafficEventResponse>
     */
    public AsyncInvoker<UpdateTrafficEventRequest, UpdateTrafficEventResponse> updateTrafficEventAsyncInvoker(
        UpdateTrafficEventRequest request) {
        return new AsyncInvoker<UpdateTrafficEventRequest, UpdateTrafficEventResponse>(request,
            DrisMeta.updateTrafficEvent, hcClient);
    }

    /**
     * 部署边缘应用
     *
     * **部署边缘应用前需确保**：
     * 
     * - Edge已创建且处于在线状态。相关方法请参见：[创建Edge](https://support.huaweicloud.com/api-v2x/v2x_04_0078.html)，[查询Edge](https://support.huaweicloud.com/api-v2x/v2x_04_0003.html)。
     * 
     * - 待部署的应用已创建且应用版本状态已更新至发布。相关方法请参见：[创建应用](https://support.huaweicloud.com/api-v2x/v2x_04_0026.html)，[创建应用版本](https://support.huaweicloud.com/api-v2x/v2x_04_0038.html)，[更新应用版本状态](https://support.huaweicloud.com/api-v2x/v2x_04_0105.html)
     * 
     * 如部署边缘应用接口调用成功，稍后将会自动安装至边缘设备无需手动操作。自动安装完成后应用将处于运行中的状态。
     * 
     * **关于应用在设备侧部署的耗时问题**：
     * 
     * &amp;emsp;&amp;emsp;从边缘应用部署成功到处于运行中状态的耗时取决于边缘设备所处的网络状况以及应用镜像包的大小，可通过查询边缘应用获取边缘应用部署状态。相关方法请参见：[查询边缘应用](https://support.huaweicloud.com/api-v2x/v2x_04_0115.html)\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateV2xEdgeAppRequest 请求对象
     * @return CompletableFuture<CreateV2xEdgeAppResponse>
     */
    public CompletableFuture<CreateV2xEdgeAppResponse> createV2xEdgeAppAsync(CreateV2xEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createV2xEdgeApp);
    }

    /**
     * 部署边缘应用
     *
     * **部署边缘应用前需确保**：
     * 
     * - Edge已创建且处于在线状态。相关方法请参见：[创建Edge](https://support.huaweicloud.com/api-v2x/v2x_04_0078.html)，[查询Edge](https://support.huaweicloud.com/api-v2x/v2x_04_0003.html)。
     * 
     * - 待部署的应用已创建且应用版本状态已更新至发布。相关方法请参见：[创建应用](https://support.huaweicloud.com/api-v2x/v2x_04_0026.html)，[创建应用版本](https://support.huaweicloud.com/api-v2x/v2x_04_0038.html)，[更新应用版本状态](https://support.huaweicloud.com/api-v2x/v2x_04_0105.html)
     * 
     * 如部署边缘应用接口调用成功，稍后将会自动安装至边缘设备无需手动操作。自动安装完成后应用将处于运行中的状态。
     * 
     * **关于应用在设备侧部署的耗时问题**：
     * 
     * &amp;emsp;&amp;emsp;从边缘应用部署成功到处于运行中状态的耗时取决于边缘设备所处的网络状况以及应用镜像包的大小，可通过查询边缘应用获取边缘应用部署状态。相关方法请参见：[查询边缘应用](https://support.huaweicloud.com/api-v2x/v2x_04_0115.html)\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateV2xEdgeAppRequest 请求对象
     * @return AsyncInvoker<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse>
     */
    public AsyncInvoker<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse> createV2xEdgeAppAsyncInvoker(
        CreateV2xEdgeAppRequest request) {
        return new AsyncInvoker<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse>(request, DrisMeta.createV2xEdgeApp,
            hcClient);
    }

    /**
     * 删除边缘应用
     *
     * 删除系统应用（$edgetepa）前应先删除业务通道。如删除边缘应用接口调用成功，稍后边缘设备将会自动删除应用无需手动操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteV2XEdgeAppByEdgeAppIdRequest 请求对象
     * @return CompletableFuture<DeleteV2XEdgeAppByEdgeAppIdResponse>
     */
    public CompletableFuture<DeleteV2XEdgeAppByEdgeAppIdResponse> deleteV2XEdgeAppByEdgeAppIdAsync(
        DeleteV2XEdgeAppByEdgeAppIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteV2XEdgeAppByEdgeAppId);
    }

    /**
     * 删除边缘应用
     *
     * 删除系统应用（$edgetepa）前应先删除业务通道。如删除边缘应用接口调用成功，稍后边缘设备将会自动删除应用无需手动操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteV2XEdgeAppByEdgeAppIdRequest 请求对象
     * @return AsyncInvoker<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse>
     */
    public AsyncInvoker<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse> deleteV2XEdgeAppByEdgeAppIdAsyncInvoker(
        DeleteV2XEdgeAppByEdgeAppIdRequest request) {
        return new AsyncInvoker<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse>(request,
            DrisMeta.deleteV2XEdgeAppByEdgeAppId, hcClient);
    }

    /**
     * 查询边缘应用列表
     *
     * 查询边缘应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListV2xEdgeAppRequest 请求对象
     * @return CompletableFuture<ListV2xEdgeAppResponse>
     */
    public CompletableFuture<ListV2xEdgeAppResponse> listV2xEdgeAppAsync(ListV2xEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.listV2xEdgeApp);
    }

    /**
     * 查询边缘应用列表
     *
     * 查询边缘应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListV2xEdgeAppRequest 请求对象
     * @return AsyncInvoker<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse>
     */
    public AsyncInvoker<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse> listV2xEdgeAppAsyncInvoker(
        ListV2xEdgeAppRequest request) {
        return new AsyncInvoker<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse>(request, DrisMeta.listV2xEdgeApp,
            hcClient);
    }

    /**
     * 查询边缘应用
     *
     * 查询边缘应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowV2XEdgeAppDetailByEdgeAppIdRequest 请求对象
     * @return CompletableFuture<ShowV2XEdgeAppDetailByEdgeAppIdResponse>
     */
    public CompletableFuture<ShowV2XEdgeAppDetailByEdgeAppIdResponse> showV2XEdgeAppDetailByEdgeAppIdAsync(
        ShowV2XEdgeAppDetailByEdgeAppIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showV2XEdgeAppDetailByEdgeAppId);
    }

    /**
     * 查询边缘应用
     *
     * 查询边缘应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowV2XEdgeAppDetailByEdgeAppIdRequest 请求对象
     * @return AsyncInvoker<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse>
     */
    public AsyncInvoker<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse> showV2XEdgeAppDetailByEdgeAppIdAsyncInvoker(
        ShowV2XEdgeAppDetailByEdgeAppIdRequest request) {
        return new AsyncInvoker<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse>(
            request, DrisMeta.showV2XEdgeAppDetailByEdgeAppId, hcClient);
    }

    /**
     * 升级边缘应用
     *
     * **升级边缘应用前需确保**：
     * 
     * - Edge处于在线状态。相关方法请参见：[查询Edge](https://support.huaweicloud.com/api-v2x/v2x_04_0003.html)。
     * 
     * - 待升级的应用版本状态已更新至发布。相关方法请参见：[更新应用版本状态](https://support.huaweicloud.com/api-v2x/v2x_04_0105.html)
     * 
     * 如升级边缘应用接口调用成功，稍后边缘设备将会自动升级至新版本无需手动操作。自动安装完成后应用将处于运行中的状态。
     * 
     * **关于应用在设备侧升级的耗时问题**：
     * 
     * &amp;emsp;&amp;emsp;从边缘应用升级成功到处于运行中状态的耗时取决于边缘设备所处的网络状况以及应用镜像包的大小，可通过查询边缘应用获取边缘应用部署状态。相关方法请参见：[查询边缘应用](https://support.huaweicloud.com/api-v2x/v2x_04_0115.html)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateV2xEdgeAppRequest 请求对象
     * @return CompletableFuture<UpdateV2xEdgeAppResponse>
     */
    public CompletableFuture<UpdateV2xEdgeAppResponse> updateV2xEdgeAppAsync(UpdateV2xEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateV2xEdgeApp);
    }

    /**
     * 升级边缘应用
     *
     * **升级边缘应用前需确保**：
     * 
     * - Edge处于在线状态。相关方法请参见：[查询Edge](https://support.huaweicloud.com/api-v2x/v2x_04_0003.html)。
     * 
     * - 待升级的应用版本状态已更新至发布。相关方法请参见：[更新应用版本状态](https://support.huaweicloud.com/api-v2x/v2x_04_0105.html)
     * 
     * 如升级边缘应用接口调用成功，稍后边缘设备将会自动升级至新版本无需手动操作。自动安装完成后应用将处于运行中的状态。
     * 
     * **关于应用在设备侧升级的耗时问题**：
     * 
     * &amp;emsp;&amp;emsp;从边缘应用升级成功到处于运行中状态的耗时取决于边缘设备所处的网络状况以及应用镜像包的大小，可通过查询边缘应用获取边缘应用部署状态。相关方法请参见：[查询边缘应用](https://support.huaweicloud.com/api-v2x/v2x_04_0115.html)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateV2xEdgeAppRequest 请求对象
     * @return AsyncInvoker<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse>
     */
    public AsyncInvoker<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse> updateV2xEdgeAppAsyncInvoker(
        UpdateV2xEdgeAppRequest request) {
        return new AsyncInvoker<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse>(request, DrisMeta.updateV2xEdgeApp,
            hcClient);
    }

    /**
     * 查询车辆列表
     *
     * 查询车辆列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowVehiclesRequest 请求对象
     * @return CompletableFuture<BatchShowVehiclesResponse>
     */
    public CompletableFuture<BatchShowVehiclesResponse> batchShowVehiclesAsync(BatchShowVehiclesRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.batchShowVehicles);
    }

    /**
     * 查询车辆列表
     *
     * 查询车辆列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowVehiclesRequest 请求对象
     * @return AsyncInvoker<BatchShowVehiclesRequest, BatchShowVehiclesResponse>
     */
    public AsyncInvoker<BatchShowVehiclesRequest, BatchShowVehiclesResponse> batchShowVehiclesAsyncInvoker(
        BatchShowVehiclesRequest request) {
        return new AsyncInvoker<BatchShowVehiclesRequest, BatchShowVehiclesResponse>(request,
            DrisMeta.batchShowVehicles, hcClient);
    }

    /**
     * 创建车辆
     *
     * 创建车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVehicleRequest 请求对象
     * @return CompletableFuture<CreateVehicleResponse>
     */
    public CompletableFuture<CreateVehicleResponse> createVehicleAsync(CreateVehicleRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createVehicle);
    }

    /**
     * 创建车辆
     *
     * 创建车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVehicleRequest 请求对象
     * @return AsyncInvoker<CreateVehicleRequest, CreateVehicleResponse>
     */
    public AsyncInvoker<CreateVehicleRequest, CreateVehicleResponse> createVehicleAsyncInvoker(
        CreateVehicleRequest request) {
        return new AsyncInvoker<CreateVehicleRequest, CreateVehicleResponse>(request, DrisMeta.createVehicle, hcClient);
    }

    /**
     * 删除车辆
     *
     * 删除车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVehicleRequest 请求对象
     * @return CompletableFuture<DeleteVehicleResponse>
     */
    public CompletableFuture<DeleteVehicleResponse> deleteVehicleAsync(DeleteVehicleRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteVehicle);
    }

    /**
     * 删除车辆
     *
     * 删除车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVehicleRequest 请求对象
     * @return AsyncInvoker<DeleteVehicleRequest, DeleteVehicleResponse>
     */
    public AsyncInvoker<DeleteVehicleRequest, DeleteVehicleResponse> deleteVehicleAsyncInvoker(
        DeleteVehicleRequest request) {
        return new AsyncInvoker<DeleteVehicleRequest, DeleteVehicleResponse>(request, DrisMeta.deleteVehicle, hcClient);
    }

    /**
     * 修改车辆
     *
     * 修改车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVehicleRequest 请求对象
     * @return CompletableFuture<UpdateVehicleResponse>
     */
    public CompletableFuture<UpdateVehicleResponse> updateVehicleAsync(UpdateVehicleRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateVehicle);
    }

    /**
     * 修改车辆
     *
     * 修改车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVehicleRequest 请求对象
     * @return AsyncInvoker<UpdateVehicleRequest, UpdateVehicleResponse>
     */
    public AsyncInvoker<UpdateVehicleRequest, UpdateVehicleResponse> updateVehicleAsyncInvoker(
        UpdateVehicleRequest request) {
        return new AsyncInvoker<UpdateVehicleRequest, UpdateVehicleResponse>(request, DrisMeta.updateVehicle, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowEdgeAppsRequest 请求对象
     * @return CompletableFuture<BatchShowEdgeAppsResponse>
     */
    public CompletableFuture<BatchShowEdgeAppsResponse> batchShowEdgeAppsAsync(BatchShowEdgeAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.batchShowEdgeApps);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowEdgeAppsRequest 请求对象
     * @return AsyncInvoker<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse>
     */
    public AsyncInvoker<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse> batchShowEdgeAppsAsyncInvoker(
        BatchShowEdgeAppsRequest request) {
        return new AsyncInvoker<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse>(request,
            DrisMeta.batchShowEdgeApps, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeAppRequest 请求对象
     * @return CompletableFuture<CreateEdgeAppResponse>
     */
    public CompletableFuture<CreateEdgeAppResponse> createEdgeAppAsync(CreateEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createEdgeApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeAppRequest 请求对象
     * @return AsyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse>
     */
    public AsyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse> createEdgeAppAsyncInvoker(
        CreateEdgeAppRequest request) {
        return new AsyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse>(request, DrisMeta.createEdgeApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeAppRequest 请求对象
     * @return CompletableFuture<DeleteEdgeAppResponse>
     */
    public CompletableFuture<DeleteEdgeAppResponse> deleteEdgeAppAsync(DeleteEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteEdgeApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeAppRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse>
     */
    public AsyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse> deleteEdgeAppAsyncInvoker(
        DeleteEdgeAppRequest request) {
        return new AsyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse>(request, DrisMeta.deleteEdgeApp, hcClient);
    }

    /**
     * 修改应用
     *
     * 修改应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeAppRequest 请求对象
     * @return CompletableFuture<UpdateEdgeAppResponse>
     */
    public CompletableFuture<UpdateEdgeAppResponse> updateEdgeAppAsync(UpdateEdgeAppRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateEdgeApp);
    }

    /**
     * 修改应用
     *
     * 修改应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeAppRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeAppRequest, UpdateEdgeAppResponse>
     */
    public AsyncInvoker<UpdateEdgeAppRequest, UpdateEdgeAppResponse> updateEdgeAppAsyncInvoker(
        UpdateEdgeAppRequest request) {
        return new AsyncInvoker<UpdateEdgeAppRequest, UpdateEdgeAppResponse>(request, DrisMeta.updateEdgeApp, hcClient);
    }

    /**
     * 查询应用版本列表
     *
     * 查询应用版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowEdgeAppVersionsRequest 请求对象
     * @return CompletableFuture<BatchShowEdgeAppVersionsResponse>
     */
    public CompletableFuture<BatchShowEdgeAppVersionsResponse> batchShowEdgeAppVersionsAsync(
        BatchShowEdgeAppVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.batchShowEdgeAppVersions);
    }

    /**
     * 查询应用版本列表
     *
     * 查询应用版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowEdgeAppVersionsRequest 请求对象
     * @return AsyncInvoker<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse>
     */
    public AsyncInvoker<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse> batchShowEdgeAppVersionsAsyncInvoker(
        BatchShowEdgeAppVersionsRequest request) {
        return new AsyncInvoker<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse>(request,
            DrisMeta.batchShowEdgeAppVersions, hcClient);
    }

    /**
     * 创建应用版本
     *
     * 创建应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<CreateEdgeApplicationVersionResponse>
     */
    public CompletableFuture<CreateEdgeApplicationVersionResponse> createEdgeApplicationVersionAsync(
        CreateEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createEdgeApplicationVersion);
    }

    /**
     * 创建应用版本
     *
     * 创建应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> createEdgeApplicationVersionAsyncInvoker(
        CreateEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse>(request,
            DrisMeta.createEdgeApplicationVersion, hcClient);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<DeleteEdgeApplicationVersionResponse>
     */
    public CompletableFuture<DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersionAsync(
        DeleteEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteEdgeApplicationVersion);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersionAsyncInvoker(
        DeleteEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse>(request,
            DrisMeta.deleteEdgeApplicationVersion, hcClient);
    }

    /**
     * 查询应用版本
     *
     * 查询应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<ShowEdgeApplicationVersionResponse>
     */
    public CompletableFuture<ShowEdgeApplicationVersionResponse> showEdgeApplicationVersionAsync(
        ShowEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showEdgeApplicationVersion);
    }

    /**
     * 查询应用版本
     *
     * 查询应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> showEdgeApplicationVersionAsyncInvoker(
        ShowEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse>(request,
            DrisMeta.showEdgeApplicationVersion, hcClient);
    }

    /**
     * 修改应用版本
     *
     * 修改应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionRequest 请求对象
     * @return CompletableFuture<UpdateEdgeApplicationVersionResponse>
     */
    public CompletableFuture<UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersionAsync(
        UpdateEdgeApplicationVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateEdgeApplicationVersion);
    }

    /**
     * 修改应用版本
     *
     * 修改应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse>
     */
    public AsyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersionAsyncInvoker(
        UpdateEdgeApplicationVersionRequest request) {
        return new AsyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse>(request,
            DrisMeta.updateEdgeApplicationVersion, hcClient);
    }

    /**
     * 更新应用版本状态
     *
     * 更新应用版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionStateRequest 请求对象
     * @return CompletableFuture<UpdateEdgeApplicationVersionStateResponse>
     */
    public CompletableFuture<UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionStateAsync(
        UpdateEdgeApplicationVersionStateRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateEdgeApplicationVersionState);
    }

    /**
     * 更新应用版本状态
     *
     * 更新应用版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionStateRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse>
     */
    public AsyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionStateAsyncInvoker(
        UpdateEdgeApplicationVersionStateRequest request) {
        return new AsyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse>(
            request, DrisMeta.updateEdgeApplicationVersionState, hcClient);
    }

    /**
     * 创建RSU型号
     *
     * 调用此接口可创建RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRsuModelRequest 请求对象
     * @return CompletableFuture<CreateRsuModelResponse>
     */
    public CompletableFuture<CreateRsuModelResponse> createRsuModelAsync(CreateRsuModelRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.createRsuModel);
    }

    /**
     * 创建RSU型号
     *
     * 调用此接口可创建RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRsuModelRequest 请求对象
     * @return AsyncInvoker<CreateRsuModelRequest, CreateRsuModelResponse>
     */
    public AsyncInvoker<CreateRsuModelRequest, CreateRsuModelResponse> createRsuModelAsyncInvoker(
        CreateRsuModelRequest request) {
        return new AsyncInvoker<CreateRsuModelRequest, CreateRsuModelResponse>(request, DrisMeta.createRsuModel,
            hcClient);
    }

    /**
     * 删除RSU型号
     *
     * 可调用此接口删除已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRsuModelRequest 请求对象
     * @return CompletableFuture<DeleteRsuModelResponse>
     */
    public CompletableFuture<DeleteRsuModelResponse> deleteRsuModelAsync(DeleteRsuModelRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.deleteRsuModel);
    }

    /**
     * 删除RSU型号
     *
     * 可调用此接口删除已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRsuModelRequest 请求对象
     * @return AsyncInvoker<DeleteRsuModelRequest, DeleteRsuModelResponse>
     */
    public AsyncInvoker<DeleteRsuModelRequest, DeleteRsuModelResponse> deleteRsuModelAsyncInvoker(
        DeleteRsuModelRequest request) {
        return new AsyncInvoker<DeleteRsuModelRequest, DeleteRsuModelResponse>(request, DrisMeta.deleteRsuModel,
            hcClient);
    }

    /**
     * 查询RSU型号列表
     *
     * 可调用此接口查询已创建RSU型号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRsuModelsRequest 请求对象
     * @return CompletableFuture<ListRsuModelsResponse>
     */
    public CompletableFuture<ListRsuModelsResponse> listRsuModelsAsync(ListRsuModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.listRsuModels);
    }

    /**
     * 查询RSU型号列表
     *
     * 可调用此接口查询已创建RSU型号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRsuModelsRequest 请求对象
     * @return AsyncInvoker<ListRsuModelsRequest, ListRsuModelsResponse>
     */
    public AsyncInvoker<ListRsuModelsRequest, ListRsuModelsResponse> listRsuModelsAsyncInvoker(
        ListRsuModelsRequest request) {
        return new AsyncInvoker<ListRsuModelsRequest, ListRsuModelsResponse>(request, DrisMeta.listRsuModels, hcClient);
    }

    /**
     * 查询RSU型号
     *
     * 可调用此接口查询已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRsuModelRequest 请求对象
     * @return CompletableFuture<ShowRsuModelResponse>
     */
    public CompletableFuture<ShowRsuModelResponse> showRsuModelAsync(ShowRsuModelRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.showRsuModel);
    }

    /**
     * 查询RSU型号
     *
     * 可调用此接口查询已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRsuModelRequest 请求对象
     * @return AsyncInvoker<ShowRsuModelRequest, ShowRsuModelResponse>
     */
    public AsyncInvoker<ShowRsuModelRequest, ShowRsuModelResponse> showRsuModelAsyncInvoker(
        ShowRsuModelRequest request) {
        return new AsyncInvoker<ShowRsuModelRequest, ShowRsuModelResponse>(request, DrisMeta.showRsuModel, hcClient);
    }

    /**
     * 修改RSU型号
     *
     * 可调用此接口修改已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRsuModelRequest 请求对象
     * @return CompletableFuture<UpdateRsuModelResponse>
     */
    public CompletableFuture<UpdateRsuModelResponse> updateRsuModelAsync(UpdateRsuModelRequest request) {
        return hcClient.asyncInvokeHttp(request, DrisMeta.updateRsuModel);
    }

    /**
     * 修改RSU型号
     *
     * 可调用此接口修改已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRsuModelRequest 请求对象
     * @return AsyncInvoker<UpdateRsuModelRequest, UpdateRsuModelResponse>
     */
    public AsyncInvoker<UpdateRsuModelRequest, UpdateRsuModelResponse> updateRsuModelAsyncInvoker(
        UpdateRsuModelRequest request) {
        return new AsyncInvoker<UpdateRsuModelRequest, UpdateRsuModelResponse>(request, DrisMeta.updateRsuModel,
            hcClient);
    }

}
