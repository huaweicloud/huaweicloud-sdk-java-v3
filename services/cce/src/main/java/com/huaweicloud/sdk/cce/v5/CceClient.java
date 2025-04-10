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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CceClient {

    protected HcClient hcClient;

    public CceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CceClient> newBuilder() {
        ClientBuilder<CceClient> clientBuilder = new ClientBuilder<>(CceClient::new);
        try {
            Class<?> exceptionHandler = Class.forName("com.huaweicloud.sdk.core.exception.ExceptionHandler");
            clientBuilder.getClass()
                .getMethod("withExceptionHandler", exceptionHandler)
                .invoke(clientBuilder, new CceV5ExceptionHandler());
        } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException
            | java.lang.reflect.InvocationTargetException ignore) {
        }
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
     * @return CreateImageCacheResponse
     */
    public CreateImageCacheResponse createImageCache(CreateImageCacheRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createImageCache);
    }

    /**
     * 创建镜像缓存
     *
     * 创建镜像缓存。创建过程会在指定集群中启动临时Pod进行镜像缓存构建，创建镜像缓存后，可在负载创建时通过使用镜像缓存功能大幅减少下载容器镜像的耗时，实现容器的快速启动。单租户创建镜像缓存数量上限为50。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageCacheRequest 请求对象
     * @return SyncInvoker<CreateImageCacheRequest, CreateImageCacheResponse>
     */
    public SyncInvoker<CreateImageCacheRequest, CreateImageCacheResponse> createImageCacheInvoker(
        CreateImageCacheRequest request) {
        return new SyncInvoker<>(request, CceMeta.createImageCache, hcClient);
    }

    /**
     * 删除镜像缓存
     *
     * 删除镜像缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageCacheRequest 请求对象
     * @return DeleteImageCacheResponse
     */
    public DeleteImageCacheResponse deleteImageCache(DeleteImageCacheRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteImageCache);
    }

    /**
     * 删除镜像缓存
     *
     * 删除镜像缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageCacheRequest 请求对象
     * @return SyncInvoker<DeleteImageCacheRequest, DeleteImageCacheResponse>
     */
    public SyncInvoker<DeleteImageCacheRequest, DeleteImageCacheResponse> deleteImageCacheInvoker(
        DeleteImageCacheRequest request) {
        return new SyncInvoker<>(request, CceMeta.deleteImageCache, hcClient);
    }

    /**
     * 查询镜像缓存列表
     *
     * 查询镜像缓存列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageCachesRequest 请求对象
     * @return ListImageCachesResponse
     */
    public ListImageCachesResponse listImageCaches(ListImageCachesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listImageCaches);
    }

    /**
     * 查询镜像缓存列表
     *
     * 查询镜像缓存列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageCachesRequest 请求对象
     * @return SyncInvoker<ListImageCachesRequest, ListImageCachesResponse>
     */
    public SyncInvoker<ListImageCachesRequest, ListImageCachesResponse> listImageCachesInvoker(
        ListImageCachesRequest request) {
        return new SyncInvoker<>(request, CceMeta.listImageCaches, hcClient);
    }

    /**
     * 查询镜像缓存详情
     *
     * 查询镜像缓存详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageCacheRequest 请求对象
     * @return ShowImageCacheResponse
     */
    public ShowImageCacheResponse showImageCache(ShowImageCacheRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showImageCache);
    }

    /**
     * 查询镜像缓存详情
     *
     * 查询镜像缓存详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageCacheRequest 请求对象
     * @return SyncInvoker<ShowImageCacheRequest, ShowImageCacheResponse>
     */
    public SyncInvoker<ShowImageCacheRequest, ShowImageCacheResponse> showImageCacheInvoker(
        ShowImageCacheRequest request) {
        return new SyncInvoker<>(request, CceMeta.showImageCache, hcClient);
    }

}
