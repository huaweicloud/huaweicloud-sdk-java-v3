package com.huaweicloud.sdk.mapds.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.mapds.v1.model.CreateCredentialRequest;
import com.huaweicloud.sdk.mapds.v1.model.CreateCredentialResponse;
import com.huaweicloud.sdk.mapds.v1.model.CreateSasTokenRequest;
import com.huaweicloud.sdk.mapds.v1.model.CreateSasTokenResponse;
import com.huaweicloud.sdk.mapds.v1.model.DeleteCedentialRequest;
import com.huaweicloud.sdk.mapds.v1.model.DeleteCedentialResponse;
import com.huaweicloud.sdk.mapds.v1.model.ShowCredentialRequest;
import com.huaweicloud.sdk.mapds.v1.model.ShowCredentialResponse;
import com.huaweicloud.sdk.mapds.v1.model.ShowMapTileRequest;
import com.huaweicloud.sdk.mapds.v1.model.ShowMapTileResponse;

public class MapDSClient {

    protected HcClient hcClient;

    public MapDSClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MapDSClient> newBuilder() {
        ClientBuilder<MapDSClient> clientBuilder = new ClientBuilder<>(MapDSClient::new);
        return clientBuilder;
    }

    /**
     * 创建凭证
     *
     * 该接口用于创建访问地图数据服务的凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCredentialRequest 请求对象
     * @return CreateCredentialResponse
     */
    public CreateCredentialResponse createCredential(CreateCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, MapDSMeta.createCredential);
    }

    /**
     * 创建凭证
     *
     * 该接口用于创建访问地图数据服务的凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCredentialRequest 请求对象
     * @return SyncInvoker<CreateCredentialRequest, CreateCredentialResponse>
     */
    public SyncInvoker<CreateCredentialRequest, CreateCredentialResponse> createCredentialInvoker(
        CreateCredentialRequest request) {
        return new SyncInvoker<CreateCredentialRequest, CreateCredentialResponse>(request, MapDSMeta.createCredential,
            hcClient);
    }

    /**
     * 创建SAS Token
     *
     * 创建SAS token凭据，用于访问瓦片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSasTokenRequest 请求对象
     * @return CreateSasTokenResponse
     */
    public CreateSasTokenResponse createSasToken(CreateSasTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MapDSMeta.createSasToken);
    }

    /**
     * 创建SAS Token
     *
     * 创建SAS token凭据，用于访问瓦片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSasTokenRequest 请求对象
     * @return SyncInvoker<CreateSasTokenRequest, CreateSasTokenResponse>
     */
    public SyncInvoker<CreateSasTokenRequest, CreateSasTokenResponse> createSasTokenInvoker(
        CreateSasTokenRequest request) {
        return new SyncInvoker<CreateSasTokenRequest, CreateSasTokenResponse>(request, MapDSMeta.createSasToken,
            hcClient);
    }

    /**
     * 删除凭证
     *
     * 该接口用于删除访问地图数据服务的凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCedentialRequest 请求对象
     * @return DeleteCedentialResponse
     */
    public DeleteCedentialResponse deleteCedential(DeleteCedentialRequest request) {
        return hcClient.syncInvokeHttp(request, MapDSMeta.deleteCedential);
    }

    /**
     * 删除凭证
     *
     * 该接口用于删除访问地图数据服务的凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCedentialRequest 请求对象
     * @return SyncInvoker<DeleteCedentialRequest, DeleteCedentialResponse>
     */
    public SyncInvoker<DeleteCedentialRequest, DeleteCedentialResponse> deleteCedentialInvoker(
        DeleteCedentialRequest request) {
        return new SyncInvoker<DeleteCedentialRequest, DeleteCedentialResponse>(request, MapDSMeta.deleteCedential,
            hcClient);
    }

    /**
     * 查询凭证
     *
     * 该接口用于查询访问地图数据服务的凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCredentialRequest 请求对象
     * @return ShowCredentialResponse
     */
    public ShowCredentialResponse showCredential(ShowCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, MapDSMeta.showCredential);
    }

    /**
     * 查询凭证
     *
     * 该接口用于查询访问地图数据服务的凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCredentialRequest 请求对象
     * @return SyncInvoker<ShowCredentialRequest, ShowCredentialResponse>
     */
    public SyncInvoker<ShowCredentialRequest, ShowCredentialResponse> showCredentialInvoker(
        ShowCredentialRequest request) {
        return new SyncInvoker<ShowCredentialRequest, ShowCredentialResponse>(request, MapDSMeta.showCredential,
            hcClient);
    }

    /**
     * 获取地图瓦片
     *
     * 该接口用于获取地图瓦片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMapTileRequest 请求对象
     * @return ShowMapTileResponse
     */
    public ShowMapTileResponse showMapTile(ShowMapTileRequest request) {
        return hcClient.syncInvokeHttp(request, MapDSMeta.showMapTile);
    }

    /**
     * 获取地图瓦片
     *
     * 该接口用于获取地图瓦片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMapTileRequest 请求对象
     * @return SyncInvoker<ShowMapTileRequest, ShowMapTileResponse>
     */
    public SyncInvoker<ShowMapTileRequest, ShowMapTileResponse> showMapTileInvoker(ShowMapTileRequest request) {
        return new SyncInvoker<ShowMapTileRequest, ShowMapTileResponse>(request, MapDSMeta.showMapTile, hcClient);
    }

}
