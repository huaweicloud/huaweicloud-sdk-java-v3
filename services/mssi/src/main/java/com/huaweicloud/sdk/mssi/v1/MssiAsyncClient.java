package com.huaweicloud.sdk.mssi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class MssiAsyncClient {

    protected HcClient hcClient;

    public MssiAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MssiAsyncClient> newBuilder() {
        ClientBuilder<MssiAsyncClient> clientBuilder = new ClientBuilder<>(MssiAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 新建Connection
     *
     * 新建连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionInfoRequest 请求对象
     * @return CompletableFuture<CreateConnectionInfoResponse>
     */
    public CompletableFuture<CreateConnectionInfoResponse> createConnectionInfoAsync(
        CreateConnectionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.createConnectionInfo);
    }

    /**
     * 新建Connection
     *
     * 新建连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionInfoRequest 请求对象
     * @return AsyncInvoker<CreateConnectionInfoRequest, CreateConnectionInfoResponse>
     */
    public AsyncInvoker<CreateConnectionInfoRequest, CreateConnectionInfoResponse> createConnectionInfoAsyncInvoker(
        CreateConnectionInfoRequest request) {
        return new AsyncInvoker<CreateConnectionInfoRequest, CreateConnectionInfoResponse>(request,
            MssiMeta.createConnectionInfo, hcClient);
    }

    /**
     * 新建自定义连接器(导入swagger方式)
     *
     * 新建自定义连接器(导入swagger方式)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomConnectorFromOpenapiRequest 请求对象
     * @return CompletableFuture<CreateCustomConnectorFromOpenapiResponse>
     */
    public CompletableFuture<CreateCustomConnectorFromOpenapiResponse> createCustomConnectorFromOpenapiAsync(
        CreateCustomConnectorFromOpenapiRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.createCustomConnectorFromOpenapi);
    }

    /**
     * 新建自定义连接器(导入swagger方式)
     *
     * 新建自定义连接器(导入swagger方式)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomConnectorFromOpenapiRequest 请求对象
     * @return AsyncInvoker<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse>
     */
    public AsyncInvoker<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse> createCustomConnectorFromOpenapiAsyncInvoker(
        CreateCustomConnectorFromOpenapiRequest request) {
        return new AsyncInvoker<CreateCustomConnectorFromOpenapiRequest, CreateCustomConnectorFromOpenapiResponse>(
            request, MssiMeta.createCustomConnectorFromOpenapi, hcClient);
    }

    /**
     * 创建flow
     *
     * 创建flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlowRequest 请求对象
     * @return CompletableFuture<CreateFlowResponse>
     */
    public CompletableFuture<CreateFlowResponse> createFlowAsync(CreateFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.createFlow);
    }

    /**
     * 创建flow
     *
     * 创建flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlowRequest 请求对象
     * @return AsyncInvoker<CreateFlowRequest, CreateFlowResponse>
     */
    public AsyncInvoker<CreateFlowRequest, CreateFlowResponse> createFlowAsyncInvoker(CreateFlowRequest request) {
        return new AsyncInvoker<CreateFlowRequest, CreateFlowResponse>(request, MssiMeta.createFlow, hcClient);
    }

    /**
     * 根据流创建Flow模板
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlowTemplateFromFlowRequest 请求对象
     * @return CompletableFuture<CreateFlowTemplateFromFlowResponse>
     */
    public CompletableFuture<CreateFlowTemplateFromFlowResponse> createFlowTemplateFromFlowAsync(
        CreateFlowTemplateFromFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.createFlowTemplateFromFlow);
    }

    /**
     * 根据流创建Flow模板
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlowTemplateFromFlowRequest 请求对象
     * @return AsyncInvoker<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse>
     */
    public AsyncInvoker<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse> createFlowTemplateFromFlowAsyncInvoker(
        CreateFlowTemplateFromFlowRequest request) {
        return new AsyncInvoker<CreateFlowTemplateFromFlowRequest, CreateFlowTemplateFromFlowResponse>(request,
            MssiMeta.createFlowTemplateFromFlow, hcClient);
    }

    /**
     * 删除Connection
     *
     * 删除Connection
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectionInfoRequest 请求对象
     * @return CompletableFuture<DeleteConnectionInfoResponse>
     */
    public CompletableFuture<DeleteConnectionInfoResponse> deleteConnectionInfoAsync(
        DeleteConnectionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.deleteConnectionInfo);
    }

    /**
     * 删除Connection
     *
     * 删除Connection
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectionInfoRequest 请求对象
     * @return AsyncInvoker<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse>
     */
    public AsyncInvoker<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse> deleteConnectionInfoAsyncInvoker(
        DeleteConnectionInfoRequest request) {
        return new AsyncInvoker<DeleteConnectionInfoRequest, DeleteConnectionInfoResponse>(request,
            MssiMeta.deleteConnectionInfo, hcClient);
    }

    /**
     * 删除自定义连接器
     *
     * 删除自定义连接器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCustomConnectorRequest 请求对象
     * @return CompletableFuture<DeleteCustomConnectorResponse>
     */
    public CompletableFuture<DeleteCustomConnectorResponse> deleteCustomConnectorAsync(
        DeleteCustomConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.deleteCustomConnector);
    }

    /**
     * 删除自定义连接器
     *
     * 删除自定义连接器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCustomConnectorRequest 请求对象
     * @return AsyncInvoker<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse>
     */
    public AsyncInvoker<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse> deleteCustomConnectorAsyncInvoker(
        DeleteCustomConnectorRequest request) {
        return new AsyncInvoker<DeleteCustomConnectorRequest, DeleteCustomConnectorResponse>(request,
            MssiMeta.deleteCustomConnector, hcClient);
    }

    /**
     * 删除Flow
     *
     * 删除Flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlowRequest 请求对象
     * @return CompletableFuture<DeleteFlowResponse>
     */
    public CompletableFuture<DeleteFlowResponse> deleteFlowAsync(DeleteFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.deleteFlow);
    }

    /**
     * 删除Flow
     *
     * 删除Flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlowRequest 请求对象
     * @return AsyncInvoker<DeleteFlowRequest, DeleteFlowResponse>
     */
    public AsyncInvoker<DeleteFlowRequest, DeleteFlowResponse> deleteFlowAsyncInvoker(DeleteFlowRequest request) {
        return new AsyncInvoker<DeleteFlowRequest, DeleteFlowResponse>(request, MssiMeta.deleteFlow, hcClient);
    }

    /**
     * 查询特定flow
     *
     * 查询特定flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchFlowByIdRequest 请求对象
     * @return CompletableFuture<SearchFlowByIdResponse>
     */
    public CompletableFuture<SearchFlowByIdResponse> searchFlowByIdAsync(SearchFlowByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.searchFlowById);
    }

    /**
     * 查询特定flow
     *
     * 查询特定flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SearchFlowByIdRequest 请求对象
     * @return AsyncInvoker<SearchFlowByIdRequest, SearchFlowByIdResponse>
     */
    public AsyncInvoker<SearchFlowByIdRequest, SearchFlowByIdResponse> searchFlowByIdAsyncInvoker(
        SearchFlowByIdRequest request) {
        return new AsyncInvoker<SearchFlowByIdRequest, SearchFlowByIdResponse>(request, MssiMeta.searchFlowById,
            hcClient);
    }

    /**
     * 查询Connection列表
     *
     * 查询所有连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllConnectionsRequest 请求对象
     * @return CompletableFuture<ShowAllConnectionsResponse>
     */
    public CompletableFuture<ShowAllConnectionsResponse> showAllConnectionsAsync(ShowAllConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.showAllConnections);
    }

    /**
     * 查询Connection列表
     *
     * 查询所有连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllConnectionsRequest 请求对象
     * @return AsyncInvoker<ShowAllConnectionsRequest, ShowAllConnectionsResponse>
     */
    public AsyncInvoker<ShowAllConnectionsRequest, ShowAllConnectionsResponse> showAllConnectionsAsyncInvoker(
        ShowAllConnectionsRequest request) {
        return new AsyncInvoker<ShowAllConnectionsRequest, ShowAllConnectionsResponse>(request,
            MssiMeta.showAllConnections, hcClient);
    }

    /**
     * 查询所有Flow
     *
     * 查询所有Flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllFlowsRequest 请求对象
     * @return CompletableFuture<ShowAllFlowsResponse>
     */
    public CompletableFuture<ShowAllFlowsResponse> showAllFlowsAsync(ShowAllFlowsRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.showAllFlows);
    }

    /**
     * 查询所有Flow
     *
     * 查询所有Flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllFlowsRequest 请求对象
     * @return AsyncInvoker<ShowAllFlowsRequest, ShowAllFlowsResponse>
     */
    public AsyncInvoker<ShowAllFlowsRequest, ShowAllFlowsResponse> showAllFlowsAsyncInvoker(
        ShowAllFlowsRequest request) {
        return new AsyncInvoker<ShowAllFlowsRequest, ShowAllFlowsResponse>(request, MssiMeta.showAllFlows, hcClient);
    }

    /**
     * 查询Connector列表
     *
     * 查询Connector列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectorsRequest 请求对象
     * @return CompletableFuture<ShowConnectorsResponse>
     */
    public CompletableFuture<ShowConnectorsResponse> showConnectorsAsync(ShowConnectorsRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.showConnectors);
    }

    /**
     * 查询Connector列表
     *
     * 查询Connector列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectorsRequest 请求对象
     * @return AsyncInvoker<ShowConnectorsRequest, ShowConnectorsResponse>
     */
    public AsyncInvoker<ShowConnectorsRequest, ShowConnectorsResponse> showConnectorsAsyncInvoker(
        ShowConnectorsRequest request) {
        return new AsyncInvoker<ShowConnectorsRequest, ShowConnectorsResponse>(request, MssiMeta.showConnectors,
            hcClient);
    }

    /**
     * 发布连接器
     *
     * 发布连接器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomConnectorRequest 请求对象
     * @return CompletableFuture<ShowCustomConnectorResponse>
     */
    public CompletableFuture<ShowCustomConnectorResponse> showCustomConnectorAsync(ShowCustomConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.showCustomConnector);
    }

    /**
     * 发布连接器
     *
     * 发布连接器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomConnectorRequest 请求对象
     * @return AsyncInvoker<ShowCustomConnectorRequest, ShowCustomConnectorResponse>
     */
    public AsyncInvoker<ShowCustomConnectorRequest, ShowCustomConnectorResponse> showCustomConnectorAsyncInvoker(
        ShowCustomConnectorRequest request) {
        return new AsyncInvoker<ShowCustomConnectorRequest, ShowCustomConnectorResponse>(request,
            MssiMeta.showCustomConnector, hcClient);
    }

    /**
     * 查询CustomConnector列表
     *
     * 查询CustomConnector列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomConnectorsRequest 请求对象
     * @return CompletableFuture<ShowCustomConnectorsResponse>
     */
    public CompletableFuture<ShowCustomConnectorsResponse> showCustomConnectorsAsync(
        ShowCustomConnectorsRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.showCustomConnectors);
    }

    /**
     * 查询CustomConnector列表
     *
     * 查询CustomConnector列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCustomConnectorsRequest 请求对象
     * @return AsyncInvoker<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse>
     */
    public AsyncInvoker<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse> showCustomConnectorsAsyncInvoker(
        ShowCustomConnectorsRequest request) {
        return new AsyncInvoker<ShowCustomConnectorsRequest, ShowCustomConnectorsResponse>(request,
            MssiMeta.showCustomConnectors, hcClient);
    }

    /**
     * 查询单个Connection
     *
     * 查询单个连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSingleConnectionRequest 请求对象
     * @return CompletableFuture<ShowSingleConnectionResponse>
     */
    public CompletableFuture<ShowSingleConnectionResponse> showSingleConnectionAsync(
        ShowSingleConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.showSingleConnection);
    }

    /**
     * 查询单个Connection
     *
     * 查询单个连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSingleConnectionRequest 请求对象
     * @return AsyncInvoker<ShowSingleConnectionRequest, ShowSingleConnectionResponse>
     */
    public AsyncInvoker<ShowSingleConnectionRequest, ShowSingleConnectionResponse> showSingleConnectionAsyncInvoker(
        ShowSingleConnectionRequest request) {
        return new AsyncInvoker<ShowSingleConnectionRequest, ShowSingleConnectionResponse>(request,
            MssiMeta.showSingleConnection, hcClient);
    }

    /**
     * 修改连接配置内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionInfoRequest 请求对象
     * @return CompletableFuture<UpdateConnectionInfoResponse>
     */
    public CompletableFuture<UpdateConnectionInfoResponse> updateConnectionInfoAsync(
        UpdateConnectionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.updateConnectionInfo);
    }

    /**
     * 修改连接配置内容
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionInfoRequest 请求对象
     * @return AsyncInvoker<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse>
     */
    public AsyncInvoker<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse> updateConnectionInfoAsyncInvoker(
        UpdateConnectionInfoRequest request) {
        return new AsyncInvoker<UpdateConnectionInfoRequest, UpdateConnectionInfoResponse>(request,
            MssiMeta.updateConnectionInfo, hcClient);
    }

    /**
     * 更新flow
     *
     * 更新flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlowRequest 请求对象
     * @return CompletableFuture<UpdateFlowResponse>
     */
    public CompletableFuture<UpdateFlowResponse> updateFlowAsync(UpdateFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, MssiMeta.updateFlow);
    }

    /**
     * 更新flow
     *
     * 更新flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlowRequest 请求对象
     * @return AsyncInvoker<UpdateFlowRequest, UpdateFlowResponse>
     */
    public AsyncInvoker<UpdateFlowRequest, UpdateFlowResponse> updateFlowAsyncInvoker(UpdateFlowRequest request) {
        return new AsyncInvoker<UpdateFlowRequest, UpdateFlowResponse>(request, MssiMeta.updateFlow, hcClient);
    }

}
