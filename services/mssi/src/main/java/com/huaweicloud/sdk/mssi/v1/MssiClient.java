package com.huaweicloud.sdk.mssi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.mssi.v1.model.CreateConnectionInfoRequest;
import com.huaweicloud.sdk.mssi.v1.model.CreateConnectionInfoResponse;
import com.huaweicloud.sdk.mssi.v1.model.CreateCustomConnectorFromOpenapiRequest;
import com.huaweicloud.sdk.mssi.v1.model.CreateCustomConnectorFromOpenapiResponse;
import com.huaweicloud.sdk.mssi.v1.model.CreateFlowRequest;
import com.huaweicloud.sdk.mssi.v1.model.CreateFlowResponse;
import com.huaweicloud.sdk.mssi.v1.model.CreateFlowTemplateFromFlowRequest;
import com.huaweicloud.sdk.mssi.v1.model.CreateFlowTemplateFromFlowResponse;
import com.huaweicloud.sdk.mssi.v1.model.DeleteConnectionInfoRequest;
import com.huaweicloud.sdk.mssi.v1.model.DeleteConnectionInfoResponse;
import com.huaweicloud.sdk.mssi.v1.model.DeleteCustomConnectorRequest;
import com.huaweicloud.sdk.mssi.v1.model.DeleteCustomConnectorResponse;
import com.huaweicloud.sdk.mssi.v1.model.DeleteFlowRequest;
import com.huaweicloud.sdk.mssi.v1.model.DeleteFlowResponse;
import com.huaweicloud.sdk.mssi.v1.model.SearchFlowByIdRequest;
import com.huaweicloud.sdk.mssi.v1.model.SearchFlowByIdResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowAllConnectionsRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowAllConnectionsResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowAllFlowsRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowAllFlowsResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowConnectorsRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowConnectorsResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowCustomConnectorRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowCustomConnectorResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowCustomConnectorsRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowCustomConnectorsResponse;
import com.huaweicloud.sdk.mssi.v1.model.ShowSingleConnectionRequest;
import com.huaweicloud.sdk.mssi.v1.model.ShowSingleConnectionResponse;
import com.huaweicloud.sdk.mssi.v1.model.UpdateConnectionInfoRequest;
import com.huaweicloud.sdk.mssi.v1.model.UpdateConnectionInfoResponse;
import com.huaweicloud.sdk.mssi.v1.model.UpdateFlowRequest;
import com.huaweicloud.sdk.mssi.v1.model.UpdateFlowResponse;

public class MssiClient {

    protected HcClient hcClient;

    public MssiClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MssiClient> newBuilder() {
        ClientBuilder<MssiClient> clientBuilder = new ClientBuilder<>(MssiClient::new);
        return clientBuilder;
    }

    /**
     * 新建Connection
     *
     * 新建连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionInfoRequest 请求对象
     * @return CreateConnectionInfoResponse
     */
    public CreateConnectionInfoResponse createConnectionInfo(CreateConnectionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.createConnectionInfo);
    }

    /**
     * 新建Connection
     *
     * 新建连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionInfoRequest 请求对象
     * @return SyncInvoker<CreateConnectionInfoRequest, CreateConnectionInfoResponse>
     */
    public SyncInvoker<CreateConnectionInfoRequest, CreateConnectionInfoResponse> createConnectionInfoInvoker(
        CreateConnectionInfoRequest request) {
        return new SyncInvoker<>(request, MssiMeta.createConnectionInfo, hcClient);
    }

    /**
     * 新建自定义连接器(导入swagger方式)
     *
     * 新建自定义连接器(导入swagger方式)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomConnectorFromOpenapiRequest 请求对象
     * @return CreateCustomConnectorFromOpenapiResponse
     */
    public CreateCustomConnectorFromOpenapiResponse createCustomConnectorFromOpenapi(
        CreateCustomConnectorFromOpenapiRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.createCustomConnectorFromOpenapi);
    }

    /**
     * 新建自定义连接器(导入swagger方式)
     *
     * 新建自定义连接器(导入swagger方式)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomConnectorFromOpenapiRequest 请求对象
     * @return SyncInvoker<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse>
     */
    public SyncInvoker<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse> createCustomConnectorFromOpenapiInvoker(
        CreateCustomConnectorFromOpenapiRequest request) {
        return new SyncInvoker<>(request, MssiMeta.createCustomConnectorFromOpenapi, hcClient);
    }

    /**
     * 创建flow
     *
     * 创建flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlowRequest 请求对象
     * @return CreateFlowResponse
     */
    public CreateFlowResponse createFlow(CreateFlowRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.createFlow);
    }

    /**
     * 创建flow
     *
     * 创建flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlowRequest 请求对象
     * @return SyncInvoker<CreateFlowRequest, CreateFlowResponse>
     */
    public SyncInvoker<CreateFlowRequest, CreateFlowResponse> createFlowInvoker(CreateFlowRequest request) {
        return new SyncInvoker<>(request, MssiMeta.createFlow, hcClient);
    }

    /**
     * 根据流创建Flow模板
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlowTemplateFromFlowRequest 请求对象
     * @return CreateFlowTemplateFromFlowResponse
     */
    public CreateFlowTemplateFromFlowResponse createFlowTemplateFromFlow(CreateFlowTemplateFromFlowRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.createFlowTemplateFromFlow);
    }

    /**
     * 根据流创建Flow模板
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlowTemplateFromFlowRequest 请求对象
     * @return SyncInvoker<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse>
     */
    public SyncInvoker<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse> createFlowTemplateFromFlowInvoker(
        CreateFlowTemplateFromFlowRequest request) {
        return new SyncInvoker<>(request, MssiMeta.createFlowTemplateFromFlow, hcClient);
    }

    /**
     * 删除Connection
     *
     * 删除Connection
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionInfoRequest 请求对象
     * @return DeleteConnectionInfoResponse
     */
    public DeleteConnectionInfoResponse deleteConnectionInfo(DeleteConnectionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.deleteConnectionInfo);
    }

    /**
     * 删除Connection
     *
     * 删除Connection
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionInfoRequest 请求对象
     * @return SyncInvoker<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse>
     */
    public SyncInvoker<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse> deleteConnectionInfoInvoker(
        DeleteConnectionInfoRequest request) {
        return new SyncInvoker<>(request, MssiMeta.deleteConnectionInfo, hcClient);
    }

    /**
     * 删除自定义连接器
     *
     * 删除自定义连接器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomConnectorRequest 请求对象
     * @return DeleteCustomConnectorResponse
     */
    public DeleteCustomConnectorResponse deleteCustomConnector(DeleteCustomConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.deleteCustomConnector);
    }

    /**
     * 删除自定义连接器
     *
     * 删除自定义连接器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomConnectorRequest 请求对象
     * @return SyncInvoker<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse>
     */
    public SyncInvoker<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse> deleteCustomConnectorInvoker(
        DeleteCustomConnectorRequest request) {
        return new SyncInvoker<>(request, MssiMeta.deleteCustomConnector, hcClient);
    }

    /**
     * 删除Flow
     *
     * 删除Flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlowRequest 请求对象
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.deleteFlow);
    }

    /**
     * 删除Flow
     *
     * 删除Flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlowRequest 请求对象
     * @return SyncInvoker<DeleteFlowRequest, DeleteFlowResponse>
     */
    public SyncInvoker<DeleteFlowRequest, DeleteFlowResponse> deleteFlowInvoker(DeleteFlowRequest request) {
        return new SyncInvoker<>(request, MssiMeta.deleteFlow, hcClient);
    }

    /**
     * 查询特定flow
     *
     * 查询特定flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFlowByIdRequest 请求对象
     * @return SearchFlowByIdResponse
     */
    public SearchFlowByIdResponse searchFlowById(SearchFlowByIdRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.searchFlowById);
    }

    /**
     * 查询特定flow
     *
     * 查询特定flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFlowByIdRequest 请求对象
     * @return SyncInvoker<SearchFlowByIdRequest, SearchFlowByIdResponse>
     */
    public SyncInvoker<SearchFlowByIdRequest, SearchFlowByIdResponse> searchFlowByIdInvoker(
        SearchFlowByIdRequest request) {
        return new SyncInvoker<>(request, MssiMeta.searchFlowById, hcClient);
    }

    /**
     * 查询Connection列表
     *
     * 查询所有连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConnectionsRequest 请求对象
     * @return ShowAllConnectionsResponse
     */
    public ShowAllConnectionsResponse showAllConnections(ShowAllConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.showAllConnections);
    }

    /**
     * 查询Connection列表
     *
     * 查询所有连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConnectionsRequest 请求对象
     * @return SyncInvoker<ShowAllConnectionsRequest, ShowAllConnectionsResponse>
     */
    public SyncInvoker<ShowAllConnectionsRequest, ShowAllConnectionsResponse> showAllConnectionsInvoker(
        ShowAllConnectionsRequest request) {
        return new SyncInvoker<>(request, MssiMeta.showAllConnections, hcClient);
    }

    /**
     * 查询所有Flow
     *
     * 查询所有Flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFlowsRequest 请求对象
     * @return ShowAllFlowsResponse
     */
    public ShowAllFlowsResponse showAllFlows(ShowAllFlowsRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.showAllFlows);
    }

    /**
     * 查询所有Flow
     *
     * 查询所有Flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFlowsRequest 请求对象
     * @return SyncInvoker<ShowAllFlowsRequest, ShowAllFlowsResponse>
     */
    public SyncInvoker<ShowAllFlowsRequest, ShowAllFlowsResponse> showAllFlowsInvoker(ShowAllFlowsRequest request) {
        return new SyncInvoker<>(request, MssiMeta.showAllFlows, hcClient);
    }

    /**
     * 查询Connector列表
     *
     * 查询Connector列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorsRequest 请求对象
     * @return ShowConnectorsResponse
     */
    public ShowConnectorsResponse showConnectors(ShowConnectorsRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.showConnectors);
    }

    /**
     * 查询Connector列表
     *
     * 查询Connector列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorsRequest 请求对象
     * @return SyncInvoker<ShowConnectorsRequest, ShowConnectorsResponse>
     */
    public SyncInvoker<ShowConnectorsRequest, ShowConnectorsResponse> showConnectorsInvoker(
        ShowConnectorsRequest request) {
        return new SyncInvoker<>(request, MssiMeta.showConnectors, hcClient);
    }

    /**
     * 发布连接器
     *
     * 发布连接器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomConnectorRequest 请求对象
     * @return ShowCustomConnectorResponse
     */
    public ShowCustomConnectorResponse showCustomConnector(ShowCustomConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.showCustomConnector);
    }

    /**
     * 发布连接器
     *
     * 发布连接器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomConnectorRequest 请求对象
     * @return SyncInvoker<ShowCustomConnectorRequest, ShowCustomConnectorResponse>
     */
    public SyncInvoker<ShowCustomConnectorRequest, ShowCustomConnectorResponse> showCustomConnectorInvoker(
        ShowCustomConnectorRequest request) {
        return new SyncInvoker<>(request, MssiMeta.showCustomConnector, hcClient);
    }

    /**
     * 查询CustomConnector列表
     *
     * 查询CustomConnector列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomConnectorsRequest 请求对象
     * @return ShowCustomConnectorsResponse
     */
    public ShowCustomConnectorsResponse showCustomConnectors(ShowCustomConnectorsRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.showCustomConnectors);
    }

    /**
     * 查询CustomConnector列表
     *
     * 查询CustomConnector列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomConnectorsRequest 请求对象
     * @return SyncInvoker<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse>
     */
    public SyncInvoker<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse> showCustomConnectorsInvoker(
        ShowCustomConnectorsRequest request) {
        return new SyncInvoker<>(request, MssiMeta.showCustomConnectors, hcClient);
    }

    /**
     * 查询单个Connection
     *
     * 查询单个连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleConnectionRequest 请求对象
     * @return ShowSingleConnectionResponse
     */
    public ShowSingleConnectionResponse showSingleConnection(ShowSingleConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.showSingleConnection);
    }

    /**
     * 查询单个Connection
     *
     * 查询单个连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleConnectionRequest 请求对象
     * @return SyncInvoker<ShowSingleConnectionRequest, ShowSingleConnectionResponse>
     */
    public SyncInvoker<ShowSingleConnectionRequest, ShowSingleConnectionResponse> showSingleConnectionInvoker(
        ShowSingleConnectionRequest request) {
        return new SyncInvoker<>(request, MssiMeta.showSingleConnection, hcClient);
    }

    /**
     * 修改连接配置内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionInfoRequest 请求对象
     * @return UpdateConnectionInfoResponse
     */
    public UpdateConnectionInfoResponse updateConnectionInfo(UpdateConnectionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.updateConnectionInfo);
    }

    /**
     * 修改连接配置内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionInfoRequest 请求对象
     * @return SyncInvoker<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse>
     */
    public SyncInvoker<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse> updateConnectionInfoInvoker(
        UpdateConnectionInfoRequest request) {
        return new SyncInvoker<>(request, MssiMeta.updateConnectionInfo, hcClient);
    }

    /**
     * 更新flow
     *
     * 更新flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlowRequest 请求对象
     * @return UpdateFlowResponse
     */
    public UpdateFlowResponse updateFlow(UpdateFlowRequest request) {
        return hcClient.syncInvokeHttp(request, MssiMeta.updateFlow);
    }

    /**
     * 更新flow
     *
     * 更新flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFlowRequest 请求对象
     * @return SyncInvoker<UpdateFlowRequest, UpdateFlowResponse>
     */
    public SyncInvoker<UpdateFlowRequest, UpdateFlowResponse> updateFlowInvoker(UpdateFlowRequest request) {
        return new SyncInvoker<>(request, MssiMeta.updateFlow, hcClient);
    }

}
