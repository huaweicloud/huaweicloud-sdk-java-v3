package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.dgc.v1.model.*;

public class DgcClient {
    protected HcClient hcClient;

    public DgcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DgcClient> newBuilder() {
        return new ClientBuilder<>(DgcClient::new);
    }


    /**
     * 创建连接
     * 
     *
     * @param CreateConnectionRequest 请求对象
     * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.createConnection);
    }

    /**
     * 删除连接
     * 
     *
     * @param DeleteConnctionRequest 请求对象
     * @return DeleteConnctionResponse
     */
    public DeleteConnctionResponse deleteConnction(DeleteConnctionRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.deleteConnction);
    }

    /**
     * 导出连接
     * 
     *
     * @param ExportConnectionsRequest 请求对象
     * @return ExportConnectionsResponse
     */
    public ExportConnectionsResponse exportConnections(ExportConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.exportConnections);
    }

    /**
     * 导入连接
     * 
     *
     * @param ImportConnectionsRequest 请求对象
     * @return ImportConnectionsResponse
     */
    public ImportConnectionsResponse importConnections(ImportConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.importConnections);
    }

    /**
     * 查询连接列表
     * 
     *
     * @param ListConnectionsRequest 请求对象
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.listConnections);
    }

    /**
     * 查询连接详情
     * 
     *
     * @param ShowConnectionRequest 请求对象
     * @return ShowConnectionResponse
     */
    public ShowConnectionResponse showConnection(ShowConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.showConnection);
    }

    /**
     * 修改连接
     * 
     *
     * @param UpdateConnectionRequest 请求对象
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DgcMeta.updateConnection);
    }

}