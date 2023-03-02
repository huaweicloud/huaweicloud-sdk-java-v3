package com.huaweicloud.sdk.dris.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dris.v1.model.*;

public class DrisClient {

    protected HcClient hcClient;

    public DrisClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrisClient> newBuilder() {
        return new ClientBuilder<>(DrisClient::new);
    }

    /**
     * 创建业务通道
     *
     * 创建业务通道，用于创建Edge消息上报的数据通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataChannelRequest 请求对象
     * @return CreateDataChannelResponse
     */
    public CreateDataChannelResponse createDataChannel(CreateDataChannelRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createDataChannel);
    }

    /**
     * 创建业务通道
     *
     * 创建业务通道，用于创建Edge消息上报的数据通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataChannelRequest 请求对象
     * @return SyncInvoker<CreateDataChannelRequest, CreateDataChannelResponse>
     */
    public SyncInvoker<CreateDataChannelRequest, CreateDataChannelResponse> createDataChannelInvoker(
        CreateDataChannelRequest request) {
        return new SyncInvoker<CreateDataChannelRequest, CreateDataChannelResponse>(request, DrisMeta.createDataChannel,
            hcClient);
    }

    /**
     * 删除业务通道
     *
     * 删除业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataChannelRequest 请求对象
     * @return DeleteDataChannelResponse
     */
    public DeleteDataChannelResponse deleteDataChannel(DeleteDataChannelRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteDataChannel);
    }

    /**
     * 删除业务通道
     *
     * 删除业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataChannelRequest 请求对象
     * @return SyncInvoker<DeleteDataChannelRequest, DeleteDataChannelResponse>
     */
    public SyncInvoker<DeleteDataChannelRequest, DeleteDataChannelResponse> deleteDataChannelInvoker(
        DeleteDataChannelRequest request) {
        return new SyncInvoker<DeleteDataChannelRequest, DeleteDataChannelResponse>(request, DrisMeta.deleteDataChannel,
            hcClient);
    }

    /**
     * 查询业务通道
     *
     * 查询业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataChannelRequest 请求对象
     * @return ShowDataChannelResponse
     */
    public ShowDataChannelResponse showDataChannel(ShowDataChannelRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showDataChannel);
    }

    /**
     * 查询业务通道
     *
     * 查询业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataChannelRequest 请求对象
     * @return SyncInvoker<ShowDataChannelRequest, ShowDataChannelResponse>
     */
    public SyncInvoker<ShowDataChannelRequest, ShowDataChannelResponse> showDataChannelInvoker(
        ShowDataChannelRequest request) {
        return new SyncInvoker<ShowDataChannelRequest, ShowDataChannelResponse>(request, DrisMeta.showDataChannel,
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
     * @return UpdateDataChannelResponse
     */
    public UpdateDataChannelResponse updateDataChannel(UpdateDataChannelRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateDataChannel);
    }

    /**
     * 修改业务通道
     *
     * 修改业务通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataChannelRequest 请求对象
     * @return SyncInvoker<UpdateDataChannelRequest, UpdateDataChannelResponse>
     */
    public SyncInvoker<UpdateDataChannelRequest, UpdateDataChannelResponse> updateDataChannelInvoker(
        UpdateDataChannelRequest request) {
        return new SyncInvoker<UpdateDataChannelRequest, UpdateDataChannelResponse>(request, DrisMeta.updateDataChannel,
            hcClient);
    }

    /**
     * 创建Edge
     *
     * 创建Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateV2xEdgeRequest 请求对象
     * @return CreateV2xEdgeResponse
     */
    public CreateV2xEdgeResponse createV2xEdge(CreateV2xEdgeRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createV2xEdge);
    }

    /**
     * 创建Edge
     *
     * 创建Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateV2xEdgeRequest 请求对象
     * @return SyncInvoker<CreateV2xEdgeRequest, CreateV2xEdgeResponse>
     */
    public SyncInvoker<CreateV2xEdgeRequest, CreateV2xEdgeResponse> createV2xEdgeInvoker(CreateV2xEdgeRequest request) {
        return new SyncInvoker<CreateV2xEdgeRequest, CreateV2xEdgeResponse>(request, DrisMeta.createV2xEdge, hcClient);
    }

    /**
     * 删除Edge
     *
     * 删除Edge之前需要删除Edge下的业务通道和关联设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteV2XEdgeByV2xEdgeIdRequest 请求对象
     * @return DeleteV2XEdgeByV2xEdgeIdResponse
     */
    public DeleteV2XEdgeByV2xEdgeIdResponse deleteV2XEdgeByV2xEdgeId(DeleteV2XEdgeByV2xEdgeIdRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteV2XEdgeByV2xEdgeId);
    }

    /**
     * 删除Edge
     *
     * 删除Edge之前需要删除Edge下的业务通道和关联设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteV2XEdgeByV2xEdgeIdRequest 请求对象
     * @return SyncInvoker<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse>
     */
    public SyncInvoker<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse> deleteV2XEdgeByV2xEdgeIdInvoker(
        DeleteV2XEdgeByV2xEdgeIdRequest request) {
        return new SyncInvoker<DeleteV2XEdgeByV2xEdgeIdRequest, DeleteV2XEdgeByV2xEdgeIdResponse>(request,
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
     * @return ListV2xEdgesResponse
     */
    public ListV2xEdgesResponse listV2xEdges(ListV2xEdgesRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.listV2xEdges);
    }

    /**
     * 查询Edge列表
     *
     * 查询Edge列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListV2xEdgesRequest 请求对象
     * @return SyncInvoker<ListV2xEdgesRequest, ListV2xEdgesResponse>
     */
    public SyncInvoker<ListV2xEdgesRequest, ListV2xEdgesResponse> listV2xEdgesInvoker(ListV2xEdgesRequest request) {
        return new SyncInvoker<ListV2xEdgesRequest, ListV2xEdgesResponse>(request, DrisMeta.listV2xEdges, hcClient);
    }

    /**
     * 生成部署应用安装命令
     *
     * 生成部署应用安装命令,然后在ITS800或者ATLAS500上通过Shell执行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentCodeRequest 请求对象
     * @return ShowDeploymentCodeResponse
     */
    public ShowDeploymentCodeResponse showDeploymentCode(ShowDeploymentCodeRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showDeploymentCode);
    }

    /**
     * 生成部署应用安装命令
     *
     * 生成部署应用安装命令,然后在ITS800或者ATLAS500上通过Shell执行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentCodeRequest 请求对象
     * @return SyncInvoker<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse>
     */
    public SyncInvoker<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse> showDeploymentCodeInvoker(
        ShowDeploymentCodeRequest request) {
        return new SyncInvoker<ShowDeploymentCodeRequest, ShowDeploymentCodeResponse>(request,
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
     * @return ShowV2xEdgeDetailResponse
     */
    public ShowV2xEdgeDetailResponse showV2xEdgeDetail(ShowV2xEdgeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showV2xEdgeDetail);
    }

    /**
     * 查询Edge
     *
     * 查询Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowV2xEdgeDetailRequest 请求对象
     * @return SyncInvoker<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse>
     */
    public SyncInvoker<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse> showV2xEdgeDetailInvoker(
        ShowV2xEdgeDetailRequest request) {
        return new SyncInvoker<ShowV2xEdgeDetailRequest, ShowV2xEdgeDetailResponse>(request, DrisMeta.showV2xEdgeDetail,
            hcClient);
    }

    /**
     * 修改Edge
     *
     * 修改Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateV2xEdgeRequest 请求对象
     * @return UpdateV2xEdgeResponse
     */
    public UpdateV2xEdgeResponse updateV2xEdge(UpdateV2xEdgeRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateV2xEdge);
    }

    /**
     * 修改Edge
     *
     * 修改Edge
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateV2xEdgeRequest 请求对象
     * @return SyncInvoker<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse>
     */
    public SyncInvoker<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse> updateV2xEdgeInvoker(UpdateV2xEdgeRequest request) {
        return new SyncInvoker<UpdateV2xEdgeRequest, UpdateV2xEdgeResponse>(request, DrisMeta.updateV2xEdge, hcClient);
    }

    /**
     * 创建数据转发配置
     *
     * 创建数据转发配置。当前仅支持数据转发至kafka，数据转发配置成功添加后配置中的Topic消息将会转发至指定的brokers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddForwardingConfigsRequest 请求对象
     * @return AddForwardingConfigsResponse
     */
    public AddForwardingConfigsResponse addForwardingConfigs(AddForwardingConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.addForwardingConfigs);
    }

    /**
     * 创建数据转发配置
     *
     * 创建数据转发配置。当前仅支持数据转发至kafka，数据转发配置成功添加后配置中的Topic消息将会转发至指定的brokers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddForwardingConfigsRequest 请求对象
     * @return SyncInvoker<AddForwardingConfigsRequest, AddForwardingConfigsResponse>
     */
    public SyncInvoker<AddForwardingConfigsRequest, AddForwardingConfigsResponse> addForwardingConfigsInvoker(
        AddForwardingConfigsRequest request) {
        return new SyncInvoker<AddForwardingConfigsRequest, AddForwardingConfigsResponse>(request,
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
     * @return DeleteForwardingConfigResponse
     */
    public DeleteForwardingConfigResponse deleteForwardingConfig(DeleteForwardingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteForwardingConfig);
    }

    /**
     * 删除数据转发配置
     *
     * 根据转发配置的唯一ID（forwarding_config_id）删除数据转发配置，删除后配置中订阅的topic消息将不会被转发至brokers。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteForwardingConfigRequest 请求对象
     * @return SyncInvoker<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse>
     */
    public SyncInvoker<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse> deleteForwardingConfigInvoker(
        DeleteForwardingConfigRequest request) {
        return new SyncInvoker<DeleteForwardingConfigRequest, DeleteForwardingConfigResponse>(request,
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
     * @return ShowForwardingConfigResponse
     */
    public ShowForwardingConfigResponse showForwardingConfig(ShowForwardingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showForwardingConfig);
    }

    /**
     * 查询数据转发配置
     *
     * 根据转发配置的唯一ID（forwarding_config_id）查询数据转发配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowForwardingConfigRequest 请求对象
     * @return SyncInvoker<ShowForwardingConfigRequest, ShowForwardingConfigResponse>
     */
    public SyncInvoker<ShowForwardingConfigRequest, ShowForwardingConfigResponse> showForwardingConfigInvoker(
        ShowForwardingConfigRequest request) {
        return new SyncInvoker<ShowForwardingConfigRequest, ShowForwardingConfigResponse>(request,
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
     * @return ShowForwardingConfigsResponse
     */
    public ShowForwardingConfigsResponse showForwardingConfigs(ShowForwardingConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showForwardingConfigs);
    }

    /**
     * 查询数据转发配置列表
     *
     * 查询数据转发配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowForwardingConfigsRequest 请求对象
     * @return SyncInvoker<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse>
     */
    public SyncInvoker<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse> showForwardingConfigsInvoker(
        ShowForwardingConfigsRequest request) {
        return new SyncInvoker<ShowForwardingConfigsRequest, ShowForwardingConfigsResponse>(request,
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
     * @return UpdateForwardingConfigResponse
     */
    public UpdateForwardingConfigResponse updateForwardingConfig(UpdateForwardingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateForwardingConfig);
    }

    /**
     * 修改数据转发配置
     *
     * 根据转发配置的唯一ID（forwarding_config_id）修改数据转发配置，当前支持更新的字段有topicPrefix、userTopics、brokers，需要把该字段新的对应值全量写入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateForwardingConfigRequest 请求对象
     * @return SyncInvoker<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse>
     */
    public SyncInvoker<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse> updateForwardingConfigInvoker(
        UpdateForwardingConfigRequest request) {
        return new SyncInvoker<UpdateForwardingConfigRequest, UpdateForwardingConfigResponse>(request,
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
     * @return ListEdgeFlowsResponse
     */
    public ListEdgeFlowsResponse listEdgeFlows(ListEdgeFlowsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.listEdgeFlows);
    }

    /**
     * 查询历史交通统计信息列表
     *
     * 查询历史交通统计信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeFlowsRequest 请求对象
     * @return SyncInvoker<ListEdgeFlowsRequest, ListEdgeFlowsResponse>
     */
    public SyncInvoker<ListEdgeFlowsRequest, ListEdgeFlowsResponse> listEdgeFlowsInvoker(ListEdgeFlowsRequest request) {
        return new SyncInvoker<ListEdgeFlowsRequest, ListEdgeFlowsResponse>(request, DrisMeta.listEdgeFlows, hcClient);
    }

    /**
     * 查询历史交通事件列表
     *
     * 查询历史交通事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryTrafficEventsRequest 请求对象
     * @return ShowHistoryTrafficEventsResponse
     */
    public ShowHistoryTrafficEventsResponse showHistoryTrafficEvents(ShowHistoryTrafficEventsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showHistoryTrafficEvents);
    }

    /**
     * 查询历史交通事件列表
     *
     * 查询历史交通事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryTrafficEventsRequest 请求对象
     * @return SyncInvoker<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse>
     */
    public SyncInvoker<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse> showHistoryTrafficEventsInvoker(
        ShowHistoryTrafficEventsRequest request) {
        return new SyncInvoker<ShowHistoryTrafficEventsRequest, ShowHistoryTrafficEventsResponse>(request,
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
     * @return BatchShowIpcsResponse
     */
    public BatchShowIpcsResponse batchShowIpcs(BatchShowIpcsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.batchShowIpcs);
    }

    /**
     * 查询IPC列表
     *
     * 获取多个IPC资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowIpcsRequest 请求对象
     * @return SyncInvoker<BatchShowIpcsRequest, BatchShowIpcsResponse>
     */
    public SyncInvoker<BatchShowIpcsRequest, BatchShowIpcsResponse> batchShowIpcsInvoker(BatchShowIpcsRequest request) {
        return new SyncInvoker<BatchShowIpcsRequest, BatchShowIpcsResponse>(request, DrisMeta.batchShowIpcs, hcClient);
    }

    /**
     * 查询IPC
     *
     * 查询IPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpcRequest 请求对象
     * @return ShowIpcResponse
     */
    public ShowIpcResponse showIpc(ShowIpcRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showIpc);
    }

    /**
     * 查询IPC
     *
     * 查询IPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpcRequest 请求对象
     * @return SyncInvoker<ShowIpcRequest, ShowIpcResponse>
     */
    public SyncInvoker<ShowIpcRequest, ShowIpcResponse> showIpcInvoker(ShowIpcRequest request) {
        return new SyncInvoker<ShowIpcRequest, ShowIpcResponse>(request, DrisMeta.showIpc, hcClient);
    }

    /**
     * 查询雷达列表
     *
     * 查询雷达列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowRadarsRequest 请求对象
     * @return BatchShowRadarsResponse
     */
    public BatchShowRadarsResponse batchShowRadars(BatchShowRadarsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.batchShowRadars);
    }

    /**
     * 查询雷达列表
     *
     * 查询雷达列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowRadarsRequest 请求对象
     * @return SyncInvoker<BatchShowRadarsRequest, BatchShowRadarsResponse>
     */
    public SyncInvoker<BatchShowRadarsRequest, BatchShowRadarsResponse> batchShowRadarsInvoker(
        BatchShowRadarsRequest request) {
        return new SyncInvoker<BatchShowRadarsRequest, BatchShowRadarsResponse>(request, DrisMeta.batchShowRadars,
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
     * @return BatchShowRsusResponse
     */
    public BatchShowRsusResponse batchShowRsus(BatchShowRsusRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.batchShowRsus);
    }

    /**
     * 查询RSU列表
     *
     * 查询RSU列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowRsusRequest 请求对象
     * @return SyncInvoker<BatchShowRsusRequest, BatchShowRsusResponse>
     */
    public SyncInvoker<BatchShowRsusRequest, BatchShowRsusResponse> batchShowRsusInvoker(BatchShowRsusRequest request) {
        return new SyncInvoker<BatchShowRsusRequest, BatchShowRsusResponse>(request, DrisMeta.batchShowRsus, hcClient);
    }

    /**
     * 创建RSU
     *
     * 创建RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRsuRequest 请求对象
     * @return CreateRsuResponse
     */
    public CreateRsuResponse createRsu(CreateRsuRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createRsu);
    }

    /**
     * 创建RSU
     *
     * 创建RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRsuRequest 请求对象
     * @return SyncInvoker<CreateRsuRequest, CreateRsuResponse>
     */
    public SyncInvoker<CreateRsuRequest, CreateRsuResponse> createRsuInvoker(CreateRsuRequest request) {
        return new SyncInvoker<CreateRsuRequest, CreateRsuResponse>(request, DrisMeta.createRsu, hcClient);
    }

    /**
     * 删除RSU
     *
     * 删除RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRsuRequest 请求对象
     * @return DeleteRsuResponse
     */
    public DeleteRsuResponse deleteRsu(DeleteRsuRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteRsu);
    }

    /**
     * 删除RSU
     *
     * 删除RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRsuRequest 请求对象
     * @return SyncInvoker<DeleteRsuRequest, DeleteRsuResponse>
     */
    public SyncInvoker<DeleteRsuRequest, DeleteRsuResponse> deleteRsuInvoker(DeleteRsuRequest request) {
        return new SyncInvoker<DeleteRsuRequest, DeleteRsuResponse>(request, DrisMeta.deleteRsu, hcClient);
    }

    /**
     * 修改RSU
     *
     * 修改RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRsuRequest 请求对象
     * @return UpdateRsuResponse
     */
    public UpdateRsuResponse updateRsu(UpdateRsuRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateRsu);
    }

    /**
     * 修改RSU
     *
     * 修改RSU
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRsuRequest 请求对象
     * @return SyncInvoker<UpdateRsuRequest, UpdateRsuResponse>
     */
    public SyncInvoker<UpdateRsuRequest, UpdateRsuResponse> updateRsuInvoker(UpdateRsuRequest request) {
        return new SyncInvoker<UpdateRsuRequest, UpdateRsuResponse>(request, DrisMeta.updateRsu, hcClient);
    }

    /**
     * 创建即时交通事件
     *
     * 创建即时交通事件，平台分发即时交通事件给目标设备的接口。事件一旦创建便会立即下发且只会下发一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendImmediateEventRequest 请求对象
     * @return SendImmediateEventResponse
     */
    public SendImmediateEventResponse sendImmediateEvent(SendImmediateEventRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.sendImmediateEvent);
    }

    /**
     * 创建即时交通事件
     *
     * 创建即时交通事件，平台分发即时交通事件给目标设备的接口。事件一旦创建便会立即下发且只会下发一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendImmediateEventRequest 请求对象
     * @return SyncInvoker<SendImmediateEventRequest, SendImmediateEventResponse>
     */
    public SyncInvoker<SendImmediateEventRequest, SendImmediateEventResponse> sendImmediateEventInvoker(
        SendImmediateEventRequest request) {
        return new SyncInvoker<SendImmediateEventRequest, SendImmediateEventResponse>(request,
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
     * @return BatchShowTrafficControllersResponse
     */
    public BatchShowTrafficControllersResponse batchShowTrafficControllers(BatchShowTrafficControllersRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.batchShowTrafficControllers);
    }

    /**
     * 查询信号机列表
     *
     * 查询信号机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowTrafficControllersRequest 请求对象
     * @return SyncInvoker<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse>
     */
    public SyncInvoker<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse> batchShowTrafficControllersInvoker(
        BatchShowTrafficControllersRequest request) {
        return new SyncInvoker<BatchShowTrafficControllersRequest, BatchShowTrafficControllersResponse>(request,
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
     * @return CreateTrafficControllerResponse
     */
    public CreateTrafficControllerResponse createTrafficController(CreateTrafficControllerRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createTrafficController);
    }

    /**
     * 创建信号机
     *
     * 创建信号机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficControllerRequest 请求对象
     * @return SyncInvoker<CreateTrafficControllerRequest, CreateTrafficControllerResponse>
     */
    public SyncInvoker<CreateTrafficControllerRequest, CreateTrafficControllerResponse> createTrafficControllerInvoker(
        CreateTrafficControllerRequest request) {
        return new SyncInvoker<CreateTrafficControllerRequest, CreateTrafficControllerResponse>(request,
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
     * @return DeleteTrafficControllerResponse
     */
    public DeleteTrafficControllerResponse deleteTrafficController(DeleteTrafficControllerRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteTrafficController);
    }

    /**
     * 删除信号机
     *
     * 删除信号机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficControllerRequest 请求对象
     * @return SyncInvoker<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse>
     */
    public SyncInvoker<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse> deleteTrafficControllerInvoker(
        DeleteTrafficControllerRequest request) {
        return new SyncInvoker<DeleteTrafficControllerRequest, DeleteTrafficControllerResponse>(request,
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
     * @return UpdateTrafficControllerResponse
     */
    public UpdateTrafficControllerResponse updateTrafficController(UpdateTrafficControllerRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateTrafficController);
    }

    /**
     * 修改信号机
     *
     * 修改信号机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficControllerRequest 请求对象
     * @return SyncInvoker<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse>
     */
    public SyncInvoker<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse> updateTrafficControllerInvoker(
        UpdateTrafficControllerRequest request) {
        return new SyncInvoker<UpdateTrafficControllerRequest, UpdateTrafficControllerResponse>(request,
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
     * @return BatchShowTrafficEventsResponse
     */
    public BatchShowTrafficEventsResponse batchShowTrafficEvents(BatchShowTrafficEventsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.batchShowTrafficEvents);
    }

    /**
     * 查询长期交通事件列表
     *
     * 条件查询交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowTrafficEventsRequest 请求对象
     * @return SyncInvoker<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse>
     */
    public SyncInvoker<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse> batchShowTrafficEventsInvoker(
        BatchShowTrafficEventsRequest request) {
        return new SyncInvoker<BatchShowTrafficEventsRequest, BatchShowTrafficEventsResponse>(request,
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
     * @return CreateTrafficEventResponse
     */
    public CreateTrafficEventResponse createTrafficEvent(CreateTrafficEventRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createTrafficEvent);
    }

    /**
     * 创建长期交通事件
     *
     * 创建长期交通事件时，平台根据事件的起始时间和结束时间确定当前长期交通事件的状态。对于活跃状态的交通事件会立即下发给在事件影响范围内的RSU，对于未来事件则是在事件开始时间点下发到在事件影响范围内的RSU，过期事件不会下发。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficEventRequest 请求对象
     * @return SyncInvoker<CreateTrafficEventRequest, CreateTrafficEventResponse>
     */
    public SyncInvoker<CreateTrafficEventRequest, CreateTrafficEventResponse> createTrafficEventInvoker(
        CreateTrafficEventRequest request) {
        return new SyncInvoker<CreateTrafficEventRequest, CreateTrafficEventResponse>(request,
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
     * @return DeleteTrafficEventResponse
     */
    public DeleteTrafficEventResponse deleteTrafficEvent(DeleteTrafficEventRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteTrafficEvent);
    }

    /**
     * 删除长期交通事件
     *
     * 刪除长期交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficEventRequest 请求对象
     * @return SyncInvoker<DeleteTrafficEventRequest, DeleteTrafficEventResponse>
     */
    public SyncInvoker<DeleteTrafficEventRequest, DeleteTrafficEventResponse> deleteTrafficEventInvoker(
        DeleteTrafficEventRequest request) {
        return new SyncInvoker<DeleteTrafficEventRequest, DeleteTrafficEventResponse>(request,
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
     * @return ShowTrafficEventResponse
     */
    public ShowTrafficEventResponse showTrafficEvent(ShowTrafficEventRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showTrafficEvent);
    }

    /**
     * 查询长期交通事件
     *
     * 查询长期交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrafficEventRequest 请求对象
     * @return SyncInvoker<ShowTrafficEventRequest, ShowTrafficEventResponse>
     */
    public SyncInvoker<ShowTrafficEventRequest, ShowTrafficEventResponse> showTrafficEventInvoker(
        ShowTrafficEventRequest request) {
        return new SyncInvoker<ShowTrafficEventRequest, ShowTrafficEventResponse>(request, DrisMeta.showTrafficEvent,
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
     * @return UpdateTrafficEventResponse
     */
    public UpdateTrafficEventResponse updateTrafficEvent(UpdateTrafficEventRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateTrafficEvent);
    }

    /**
     * 修改长期交通事件
     *
     * 修改长期交通事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficEventRequest 请求对象
     * @return SyncInvoker<UpdateTrafficEventRequest, UpdateTrafficEventResponse>
     */
    public SyncInvoker<UpdateTrafficEventRequest, UpdateTrafficEventResponse> updateTrafficEventInvoker(
        UpdateTrafficEventRequest request) {
        return new SyncInvoker<UpdateTrafficEventRequest, UpdateTrafficEventResponse>(request,
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
     * @return CreateV2xEdgeAppResponse
     */
    public CreateV2xEdgeAppResponse createV2xEdgeApp(CreateV2xEdgeAppRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createV2xEdgeApp);
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
     * @return SyncInvoker<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse>
     */
    public SyncInvoker<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse> createV2xEdgeAppInvoker(
        CreateV2xEdgeAppRequest request) {
        return new SyncInvoker<CreateV2xEdgeAppRequest, CreateV2xEdgeAppResponse>(request, DrisMeta.createV2xEdgeApp,
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
     * @return DeleteV2XEdgeAppByEdgeAppIdResponse
     */
    public DeleteV2XEdgeAppByEdgeAppIdResponse deleteV2XEdgeAppByEdgeAppId(DeleteV2XEdgeAppByEdgeAppIdRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteV2XEdgeAppByEdgeAppId);
    }

    /**
     * 删除边缘应用
     *
     * 删除系统应用（$edgetepa）前应先删除业务通道。如删除边缘应用接口调用成功，稍后边缘设备将会自动删除应用无需手动操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteV2XEdgeAppByEdgeAppIdRequest 请求对象
     * @return SyncInvoker<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse>
     */
    public SyncInvoker<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse> deleteV2XEdgeAppByEdgeAppIdInvoker(
        DeleteV2XEdgeAppByEdgeAppIdRequest request) {
        return new SyncInvoker<DeleteV2XEdgeAppByEdgeAppIdRequest, DeleteV2XEdgeAppByEdgeAppIdResponse>(request,
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
     * @return ListV2xEdgeAppResponse
     */
    public ListV2xEdgeAppResponse listV2xEdgeApp(ListV2xEdgeAppRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.listV2xEdgeApp);
    }

    /**
     * 查询边缘应用列表
     *
     * 查询边缘应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListV2xEdgeAppRequest 请求对象
     * @return SyncInvoker<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse>
     */
    public SyncInvoker<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse> listV2xEdgeAppInvoker(
        ListV2xEdgeAppRequest request) {
        return new SyncInvoker<ListV2xEdgeAppRequest, ListV2xEdgeAppResponse>(request, DrisMeta.listV2xEdgeApp,
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
     * @return ShowV2XEdgeAppDetailByEdgeAppIdResponse
     */
    public ShowV2XEdgeAppDetailByEdgeAppIdResponse showV2XEdgeAppDetailByEdgeAppId(
        ShowV2XEdgeAppDetailByEdgeAppIdRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showV2XEdgeAppDetailByEdgeAppId);
    }

    /**
     * 查询边缘应用
     *
     * 查询边缘应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowV2XEdgeAppDetailByEdgeAppIdRequest 请求对象
     * @return SyncInvoker<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse>
     */
    public SyncInvoker<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse> showV2XEdgeAppDetailByEdgeAppIdInvoker(
        ShowV2XEdgeAppDetailByEdgeAppIdRequest request) {
        return new SyncInvoker<ShowV2XEdgeAppDetailByEdgeAppIdRequest, ShowV2XEdgeAppDetailByEdgeAppIdResponse>(request,
            DrisMeta.showV2XEdgeAppDetailByEdgeAppId, hcClient);
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
     * @return UpdateV2xEdgeAppResponse
     */
    public UpdateV2xEdgeAppResponse updateV2xEdgeApp(UpdateV2xEdgeAppRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateV2xEdgeApp);
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
     * @return SyncInvoker<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse>
     */
    public SyncInvoker<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse> updateV2xEdgeAppInvoker(
        UpdateV2xEdgeAppRequest request) {
        return new SyncInvoker<UpdateV2xEdgeAppRequest, UpdateV2xEdgeAppResponse>(request, DrisMeta.updateV2xEdgeApp,
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
     * @return BatchShowVehiclesResponse
     */
    public BatchShowVehiclesResponse batchShowVehicles(BatchShowVehiclesRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.batchShowVehicles);
    }

    /**
     * 查询车辆列表
     *
     * 查询车辆列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowVehiclesRequest 请求对象
     * @return SyncInvoker<BatchShowVehiclesRequest, BatchShowVehiclesResponse>
     */
    public SyncInvoker<BatchShowVehiclesRequest, BatchShowVehiclesResponse> batchShowVehiclesInvoker(
        BatchShowVehiclesRequest request) {
        return new SyncInvoker<BatchShowVehiclesRequest, BatchShowVehiclesResponse>(request, DrisMeta.batchShowVehicles,
            hcClient);
    }

    /**
     * 创建车辆
     *
     * 创建车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVehicleRequest 请求对象
     * @return CreateVehicleResponse
     */
    public CreateVehicleResponse createVehicle(CreateVehicleRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createVehicle);
    }

    /**
     * 创建车辆
     *
     * 创建车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVehicleRequest 请求对象
     * @return SyncInvoker<CreateVehicleRequest, CreateVehicleResponse>
     */
    public SyncInvoker<CreateVehicleRequest, CreateVehicleResponse> createVehicleInvoker(CreateVehicleRequest request) {
        return new SyncInvoker<CreateVehicleRequest, CreateVehicleResponse>(request, DrisMeta.createVehicle, hcClient);
    }

    /**
     * 删除车辆
     *
     * 删除车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVehicleRequest 请求对象
     * @return DeleteVehicleResponse
     */
    public DeleteVehicleResponse deleteVehicle(DeleteVehicleRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteVehicle);
    }

    /**
     * 删除车辆
     *
     * 删除车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVehicleRequest 请求对象
     * @return SyncInvoker<DeleteVehicleRequest, DeleteVehicleResponse>
     */
    public SyncInvoker<DeleteVehicleRequest, DeleteVehicleResponse> deleteVehicleInvoker(DeleteVehicleRequest request) {
        return new SyncInvoker<DeleteVehicleRequest, DeleteVehicleResponse>(request, DrisMeta.deleteVehicle, hcClient);
    }

    /**
     * 修改车辆
     *
     * 修改车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVehicleRequest 请求对象
     * @return UpdateVehicleResponse
     */
    public UpdateVehicleResponse updateVehicle(UpdateVehicleRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateVehicle);
    }

    /**
     * 修改车辆
     *
     * 修改车辆
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVehicleRequest 请求对象
     * @return SyncInvoker<UpdateVehicleRequest, UpdateVehicleResponse>
     */
    public SyncInvoker<UpdateVehicleRequest, UpdateVehicleResponse> updateVehicleInvoker(UpdateVehicleRequest request) {
        return new SyncInvoker<UpdateVehicleRequest, UpdateVehicleResponse>(request, DrisMeta.updateVehicle, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowEdgeAppsRequest 请求对象
     * @return BatchShowEdgeAppsResponse
     */
    public BatchShowEdgeAppsResponse batchShowEdgeApps(BatchShowEdgeAppsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.batchShowEdgeApps);
    }

    /**
     * 查询应用列表
     *
     * 查询应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowEdgeAppsRequest 请求对象
     * @return SyncInvoker<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse>
     */
    public SyncInvoker<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse> batchShowEdgeAppsInvoker(
        BatchShowEdgeAppsRequest request) {
        return new SyncInvoker<BatchShowEdgeAppsRequest, BatchShowEdgeAppsResponse>(request, DrisMeta.batchShowEdgeApps,
            hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeAppRequest 请求对象
     * @return CreateEdgeAppResponse
     */
    public CreateEdgeAppResponse createEdgeApp(CreateEdgeAppRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createEdgeApp);
    }

    /**
     * 创建应用
     *
     * 创建应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeAppRequest 请求对象
     * @return SyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse>
     */
    public SyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse> createEdgeAppInvoker(CreateEdgeAppRequest request) {
        return new SyncInvoker<CreateEdgeAppRequest, CreateEdgeAppResponse>(request, DrisMeta.createEdgeApp, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeAppRequest 请求对象
     * @return DeleteEdgeAppResponse
     */
    public DeleteEdgeAppResponse deleteEdgeApp(DeleteEdgeAppRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteEdgeApp);
    }

    /**
     * 删除应用
     *
     * 删除应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeAppRequest 请求对象
     * @return SyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse>
     */
    public SyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse> deleteEdgeAppInvoker(DeleteEdgeAppRequest request) {
        return new SyncInvoker<DeleteEdgeAppRequest, DeleteEdgeAppResponse>(request, DrisMeta.deleteEdgeApp, hcClient);
    }

    /**
     * 修改应用
     *
     * 修改应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeAppRequest 请求对象
     * @return UpdateEdgeAppResponse
     */
    public UpdateEdgeAppResponse updateEdgeApp(UpdateEdgeAppRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateEdgeApp);
    }

    /**
     * 修改应用
     *
     * 修改应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeAppRequest 请求对象
     * @return SyncInvoker<UpdateEdgeAppRequest, UpdateEdgeAppResponse>
     */
    public SyncInvoker<UpdateEdgeAppRequest, UpdateEdgeAppResponse> updateEdgeAppInvoker(UpdateEdgeAppRequest request) {
        return new SyncInvoker<UpdateEdgeAppRequest, UpdateEdgeAppResponse>(request, DrisMeta.updateEdgeApp, hcClient);
    }

    /**
     * 查询应用版本列表
     *
     * 查询应用版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowEdgeAppVersionsRequest 请求对象
     * @return BatchShowEdgeAppVersionsResponse
     */
    public BatchShowEdgeAppVersionsResponse batchShowEdgeAppVersions(BatchShowEdgeAppVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.batchShowEdgeAppVersions);
    }

    /**
     * 查询应用版本列表
     *
     * 查询应用版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowEdgeAppVersionsRequest 请求对象
     * @return SyncInvoker<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse>
     */
    public SyncInvoker<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse> batchShowEdgeAppVersionsInvoker(
        BatchShowEdgeAppVersionsRequest request) {
        return new SyncInvoker<BatchShowEdgeAppVersionsRequest, BatchShowEdgeAppVersionsResponse>(request,
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
     * @return CreateEdgeApplicationVersionResponse
     */
    public CreateEdgeApplicationVersionResponse createEdgeApplicationVersion(
        CreateEdgeApplicationVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createEdgeApplicationVersion);
    }

    /**
     * 创建应用版本
     *
     * 创建应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeApplicationVersionRequest 请求对象
     * @return SyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse>
     */
    public SyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> createEdgeApplicationVersionInvoker(
        CreateEdgeApplicationVersionRequest request) {
        return new SyncInvoker<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse>(request,
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
     * @return DeleteEdgeApplicationVersionResponse
     */
    public DeleteEdgeApplicationVersionResponse deleteEdgeApplicationVersion(
        DeleteEdgeApplicationVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteEdgeApplicationVersion);
    }

    /**
     * 删除应用版本
     *
     * 删除应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeApplicationVersionRequest 请求对象
     * @return SyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse>
     */
    public SyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersionInvoker(
        DeleteEdgeApplicationVersionRequest request) {
        return new SyncInvoker<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse>(request,
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
     * @return ShowEdgeApplicationVersionResponse
     */
    public ShowEdgeApplicationVersionResponse showEdgeApplicationVersion(ShowEdgeApplicationVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showEdgeApplicationVersion);
    }

    /**
     * 查询应用版本
     *
     * 查询应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeApplicationVersionRequest 请求对象
     * @return SyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse>
     */
    public SyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> showEdgeApplicationVersionInvoker(
        ShowEdgeApplicationVersionRequest request) {
        return new SyncInvoker<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse>(request,
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
     * @return UpdateEdgeApplicationVersionResponse
     */
    public UpdateEdgeApplicationVersionResponse updateEdgeApplicationVersion(
        UpdateEdgeApplicationVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateEdgeApplicationVersion);
    }

    /**
     * 修改应用版本
     *
     * 修改应用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionRequest 请求对象
     * @return SyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse>
     */
    public SyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersionInvoker(
        UpdateEdgeApplicationVersionRequest request) {
        return new SyncInvoker<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse>(request,
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
     * @return UpdateEdgeApplicationVersionStateResponse
     */
    public UpdateEdgeApplicationVersionStateResponse updateEdgeApplicationVersionState(
        UpdateEdgeApplicationVersionStateRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateEdgeApplicationVersionState);
    }

    /**
     * 更新应用版本状态
     *
     * 更新应用版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeApplicationVersionStateRequest 请求对象
     * @return SyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse>
     */
    public SyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionStateInvoker(
        UpdateEdgeApplicationVersionStateRequest request) {
        return new SyncInvoker<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse>(
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
     * @return CreateRsuModelResponse
     */
    public CreateRsuModelResponse createRsuModel(CreateRsuModelRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.createRsuModel);
    }

    /**
     * 创建RSU型号
     *
     * 调用此接口可创建RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRsuModelRequest 请求对象
     * @return SyncInvoker<CreateRsuModelRequest, CreateRsuModelResponse>
     */
    public SyncInvoker<CreateRsuModelRequest, CreateRsuModelResponse> createRsuModelInvoker(
        CreateRsuModelRequest request) {
        return new SyncInvoker<CreateRsuModelRequest, CreateRsuModelResponse>(request, DrisMeta.createRsuModel,
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
     * @return DeleteRsuModelResponse
     */
    public DeleteRsuModelResponse deleteRsuModel(DeleteRsuModelRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.deleteRsuModel);
    }

    /**
     * 删除RSU型号
     *
     * 可调用此接口删除已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRsuModelRequest 请求对象
     * @return SyncInvoker<DeleteRsuModelRequest, DeleteRsuModelResponse>
     */
    public SyncInvoker<DeleteRsuModelRequest, DeleteRsuModelResponse> deleteRsuModelInvoker(
        DeleteRsuModelRequest request) {
        return new SyncInvoker<DeleteRsuModelRequest, DeleteRsuModelResponse>(request, DrisMeta.deleteRsuModel,
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
     * @return ListRsuModelsResponse
     */
    public ListRsuModelsResponse listRsuModels(ListRsuModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.listRsuModels);
    }

    /**
     * 查询RSU型号列表
     *
     * 可调用此接口查询已创建RSU型号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRsuModelsRequest 请求对象
     * @return SyncInvoker<ListRsuModelsRequest, ListRsuModelsResponse>
     */
    public SyncInvoker<ListRsuModelsRequest, ListRsuModelsResponse> listRsuModelsInvoker(ListRsuModelsRequest request) {
        return new SyncInvoker<ListRsuModelsRequest, ListRsuModelsResponse>(request, DrisMeta.listRsuModels, hcClient);
    }

    /**
     * 查询RSU型号
     *
     * 可调用此接口查询已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRsuModelRequest 请求对象
     * @return ShowRsuModelResponse
     */
    public ShowRsuModelResponse showRsuModel(ShowRsuModelRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.showRsuModel);
    }

    /**
     * 查询RSU型号
     *
     * 可调用此接口查询已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRsuModelRequest 请求对象
     * @return SyncInvoker<ShowRsuModelRequest, ShowRsuModelResponse>
     */
    public SyncInvoker<ShowRsuModelRequest, ShowRsuModelResponse> showRsuModelInvoker(ShowRsuModelRequest request) {
        return new SyncInvoker<ShowRsuModelRequest, ShowRsuModelResponse>(request, DrisMeta.showRsuModel, hcClient);
    }

    /**
     * 修改RSU型号
     *
     * 可调用此接口修改已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRsuModelRequest 请求对象
     * @return UpdateRsuModelResponse
     */
    public UpdateRsuModelResponse updateRsuModel(UpdateRsuModelRequest request) {
        return hcClient.syncInvokeHttp(request, DrisMeta.updateRsuModel);
    }

    /**
     * 修改RSU型号
     *
     * 可调用此接口修改已创建的RSU型号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRsuModelRequest 请求对象
     * @return SyncInvoker<UpdateRsuModelRequest, UpdateRsuModelResponse>
     */
    public SyncInvoker<UpdateRsuModelRequest, UpdateRsuModelResponse> updateRsuModelInvoker(
        UpdateRsuModelRequest request) {
        return new SyncInvoker<UpdateRsuModelRequest, UpdateRsuModelResponse>(request, DrisMeta.updateRsuModel,
            hcClient);
    }

}
