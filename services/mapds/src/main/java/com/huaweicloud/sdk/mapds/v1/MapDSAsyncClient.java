package com.huaweicloud.sdk.mapds.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class MapDSAsyncClient {

    protected HcClient hcClient;

    public MapDSAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MapDSAsyncClient> newBuilder() {
        ClientBuilder<MapDSAsyncClient> clientBuilder = new ClientBuilder<>(MapDSAsyncClient::new);
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
     * @return CompletableFuture<CreateCredentialResponse>
     */
    public CompletableFuture<CreateCredentialResponse> createCredentialAsync(CreateCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, MapDSMeta.createCredential);
    }

    /**
     * 创建凭证
     *
     * 该接口用于创建访问地图数据服务的凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCredentialRequest 请求对象
     * @return AsyncInvoker<CreateCredentialRequest, CreateCredentialResponse>
     */
    public AsyncInvoker<CreateCredentialRequest, CreateCredentialResponse> createCredentialAsyncInvoker(
        CreateCredentialRequest request) {
        return new AsyncInvoker<CreateCredentialRequest, CreateCredentialResponse>(request, MapDSMeta.createCredential,
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
     * @return CompletableFuture<CreateSasTokenResponse>
     */
    public CompletableFuture<CreateSasTokenResponse> createSasTokenAsync(CreateSasTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MapDSMeta.createSasToken);
    }

    /**
     * 创建SAS Token
     *
     * 创建SAS token凭据，用于访问瓦片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSasTokenRequest 请求对象
     * @return AsyncInvoker<CreateSasTokenRequest, CreateSasTokenResponse>
     */
    public AsyncInvoker<CreateSasTokenRequest, CreateSasTokenResponse> createSasTokenAsyncInvoker(
        CreateSasTokenRequest request) {
        return new AsyncInvoker<CreateSasTokenRequest, CreateSasTokenResponse>(request, MapDSMeta.createSasToken,
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
     * @return CompletableFuture<DeleteCedentialResponse>
     */
    public CompletableFuture<DeleteCedentialResponse> deleteCedentialAsync(DeleteCedentialRequest request) {
        return hcClient.asyncInvokeHttp(request, MapDSMeta.deleteCedential);
    }

    /**
     * 删除凭证
     *
     * 该接口用于删除访问地图数据服务的凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCedentialRequest 请求对象
     * @return AsyncInvoker<DeleteCedentialRequest, DeleteCedentialResponse>
     */
    public AsyncInvoker<DeleteCedentialRequest, DeleteCedentialResponse> deleteCedentialAsyncInvoker(
        DeleteCedentialRequest request) {
        return new AsyncInvoker<DeleteCedentialRequest, DeleteCedentialResponse>(request, MapDSMeta.deleteCedential,
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
     * @return CompletableFuture<ShowCredentialResponse>
     */
    public CompletableFuture<ShowCredentialResponse> showCredentialAsync(ShowCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, MapDSMeta.showCredential);
    }

    /**
     * 查询凭证
     *
     * 该接口用于查询访问地图数据服务的凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCredentialRequest 请求对象
     * @return AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse>
     */
    public AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse> showCredentialAsyncInvoker(
        ShowCredentialRequest request) {
        return new AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse>(request, MapDSMeta.showCredential,
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
     * @return CompletableFuture<ShowMapTileResponse>
     */
    public CompletableFuture<ShowMapTileResponse> showMapTileAsync(ShowMapTileRequest request) {
        return hcClient.asyncInvokeHttp(request, MapDSMeta.showMapTile);
    }

    /**
     * 获取地图瓦片
     *
     * 该接口用于获取地图瓦片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMapTileRequest 请求对象
     * @return AsyncInvoker<ShowMapTileRequest, ShowMapTileResponse>
     */
    public AsyncInvoker<ShowMapTileRequest, ShowMapTileResponse> showMapTileAsyncInvoker(ShowMapTileRequest request) {
        return new AsyncInvoker<ShowMapTileRequest, ShowMapTileResponse>(request, MapDSMeta.showMapTile, hcClient);
    }

}
