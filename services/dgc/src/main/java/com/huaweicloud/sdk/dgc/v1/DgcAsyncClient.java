package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.dgc.v1.model.*;

public class DgcAsyncClient {
    protected HcClient hcClient;

    public DgcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DgcAsyncClient> newBuilder() {
        return new ClientBuilder<>(DgcAsyncClient::new);
    }


    /**
     * 创建连接
     * 
     *
     * @param CreateConnectionRequest 请求对象
     * @return CompletableFuture<CreateConnectionResponse>
     */
    public CompletableFuture<CreateConnectionResponse> createConnectionAsync(CreateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.createConnection);
    }

    /**
     * 删除连接
     * 
     *
     * @param DeleteConnctionRequest 请求对象
     * @return CompletableFuture<DeleteConnctionResponse>
     */
    public CompletableFuture<DeleteConnctionResponse> deleteConnctionAsync(DeleteConnctionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.deleteConnction);
    }

    /**
     * 导出连接
     * 
     *
     * @param ExportConnectionsRequest 请求对象
     * @return CompletableFuture<ExportConnectionsResponse>
     */
    public CompletableFuture<ExportConnectionsResponse> exportConnectionsAsync(ExportConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.exportConnections);
    }

    /**
     * 导入连接
     * 
     *
     * @param ImportConnectionsRequest 请求对象
     * @return CompletableFuture<ImportConnectionsResponse>
     */
    public CompletableFuture<ImportConnectionsResponse> importConnectionsAsync(ImportConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.importConnections);
    }

    /**
     * 查询连接列表
     * 
     *
     * @param ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.listConnections);
    }

    /**
     * 查询连接详情
     * 
     *
     * @param ShowConnectionRequest 请求对象
     * @return CompletableFuture<ShowConnectionResponse>
     */
    public CompletableFuture<ShowConnectionResponse> showConnectionAsync(ShowConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.showConnection);
    }

    /**
     * 修改连接
     * 
     *
     * @param UpdateConnectionRequest 请求对象
     * @return CompletableFuture<UpdateConnectionResponse>
     */
    public CompletableFuture<UpdateConnectionResponse> updateConnectionAsync(UpdateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DgcMeta.updateConnection);
    }

}