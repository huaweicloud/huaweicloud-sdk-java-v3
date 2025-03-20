package com.huaweicloud.sdk.cce.v5;

import com.huaweicloud.sdk.cce.v5.model.CreateImageCacheRequest;
import com.huaweicloud.sdk.cce.v5.model.CreateImageCacheResponse;
import com.huaweicloud.sdk.cce.v5.model.DeleteImageCacheRequest;
import com.huaweicloud.sdk.cce.v5.model.DeleteImageCacheResponse;
import com.huaweicloud.sdk.cce.v5.model.ListImageCachesRequest;
import com.huaweicloud.sdk.cce.v5.model.ListImageCachesResponse;
import com.huaweicloud.sdk.cce.v5.model.ShowImageCacheRequest;
import com.huaweicloud.sdk.cce.v5.model.ShowImageCacheResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CceAsyncClient {

    protected HcClient hcClient;

    public CceAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CceAsyncClient> newBuilder() {
        ClientBuilder<CceAsyncClient> clientBuilder = new ClientBuilder<>(CceAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建镜像缓存
     *
     * 创建镜像缓存。创建过程会在指定集群中启动临时Pod进行镜像缓存构建，创建镜像缓存后，可在负载创建时通过使用镜像缓存功能大幅减少下载容器镜像的耗时，实现容器的快速启动。单租户创建镜像缓存数量上限为50。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageCacheRequest 请求对象
     * @return CompletableFuture<CreateImageCacheResponse>
     */
    public CompletableFuture<CreateImageCacheResponse> createImageCacheAsync(CreateImageCacheRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.createImageCache);
    }

    /**
     * 创建镜像缓存
     *
     * 创建镜像缓存。创建过程会在指定集群中启动临时Pod进行镜像缓存构建，创建镜像缓存后，可在负载创建时通过使用镜像缓存功能大幅减少下载容器镜像的耗时，实现容器的快速启动。单租户创建镜像缓存数量上限为50。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageCacheRequest 请求对象
     * @return AsyncInvoker<CreateImageCacheRequest, CreateImageCacheResponse>
     */
    public AsyncInvoker<CreateImageCacheRequest, CreateImageCacheResponse> createImageCacheAsyncInvoker(
        CreateImageCacheRequest request) {
        return new AsyncInvoker<>(request, CceMeta.createImageCache, hcClient);
    }

    /**
     * 删除镜像缓存
     *
     * 删除镜像缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageCacheRequest 请求对象
     * @return CompletableFuture<DeleteImageCacheResponse>
     */
    public CompletableFuture<DeleteImageCacheResponse> deleteImageCacheAsync(DeleteImageCacheRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.deleteImageCache);
    }

    /**
     * 删除镜像缓存
     *
     * 删除镜像缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageCacheRequest 请求对象
     * @return AsyncInvoker<DeleteImageCacheRequest, DeleteImageCacheResponse>
     */
    public AsyncInvoker<DeleteImageCacheRequest, DeleteImageCacheResponse> deleteImageCacheAsyncInvoker(
        DeleteImageCacheRequest request) {
        return new AsyncInvoker<>(request, CceMeta.deleteImageCache, hcClient);
    }

    /**
     * 查询镜像缓存列表
     *
     * 查询镜像缓存列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageCachesRequest 请求对象
     * @return CompletableFuture<ListImageCachesResponse>
     */
    public CompletableFuture<ListImageCachesResponse> listImageCachesAsync(ListImageCachesRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.listImageCaches);
    }

    /**
     * 查询镜像缓存列表
     *
     * 查询镜像缓存列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageCachesRequest 请求对象
     * @return AsyncInvoker<ListImageCachesRequest, ListImageCachesResponse>
     */
    public AsyncInvoker<ListImageCachesRequest, ListImageCachesResponse> listImageCachesAsyncInvoker(
        ListImageCachesRequest request) {
        return new AsyncInvoker<>(request, CceMeta.listImageCaches, hcClient);
    }

    /**
     * 查询镜像缓存详情
     *
     * 查询镜像缓存详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageCacheRequest 请求对象
     * @return CompletableFuture<ShowImageCacheResponse>
     */
    public CompletableFuture<ShowImageCacheResponse> showImageCacheAsync(ShowImageCacheRequest request) {
        return hcClient.asyncInvokeHttp(request, CceMeta.showImageCache);
    }

    /**
     * 查询镜像缓存详情
     *
     * 查询镜像缓存详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageCacheRequest 请求对象
     * @return AsyncInvoker<ShowImageCacheRequest, ShowImageCacheResponse>
     */
    public AsyncInvoker<ShowImageCacheRequest, ShowImageCacheResponse> showImageCacheAsyncInvoker(
        ShowImageCacheRequest request) {
        return new AsyncInvoker<>(request, CceMeta.showImageCache, hcClient);
    }

}
