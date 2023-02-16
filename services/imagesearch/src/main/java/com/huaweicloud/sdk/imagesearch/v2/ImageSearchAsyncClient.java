package com.huaweicloud.sdk.imagesearch.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.imagesearch.v2.model.*;

public class ImageSearchAsyncClient {
    protected HcClient hcClient;

    public ImageSearchAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImageSearchAsyncClient> newBuilder() {
        return new ClientBuilder<>(ImageSearchAsyncClient::new);
    }


    /**
     * 添加数据
     *
     * 添加数据到指定服务实例中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAddDataRequest 请求对象
     * @return CompletableFuture<RunAddDataResponse>
     */
    public CompletableFuture<RunAddDataResponse> runAddDataAsync(RunAddDataRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runAddData);
    }

    /**
     * 添加数据
     *
     * 添加数据到指定服务实例中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAddDataRequest 请求对象
     * @return AsyncInvoker<RunAddDataRequest, RunAddDataResponse>
     */
    public AsyncInvoker<RunAddDataRequest, RunAddDataResponse> runAddDataAsyncInvoker(RunAddDataRequest request) {
        return new AsyncInvoker<RunAddDataRequest, RunAddDataResponse>(request, ImageSearchMeta.runAddData, hcClient);
    }

    /**
     * 检查数据
     *
     * 检查指定服务实例中的对应数据，支持指定ID检查和条件检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCheckDataRequest 请求对象
     * @return CompletableFuture<RunCheckDataResponse>
     */
    public CompletableFuture<RunCheckDataResponse> runCheckDataAsync(RunCheckDataRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runCheckData);
    }

    /**
     * 检查数据
     *
     * 检查指定服务实例中的对应数据，支持指定ID检查和条件检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCheckDataRequest 请求对象
     * @return AsyncInvoker<RunCheckDataRequest, RunCheckDataResponse>
     */
    public AsyncInvoker<RunCheckDataRequest, RunCheckDataResponse> runCheckDataAsyncInvoker(RunCheckDataRequest request) {
        return new AsyncInvoker<RunCheckDataRequest, RunCheckDataResponse>(request, ImageSearchMeta.runCheckData, hcClient);
    }

    /**
     * 删除数据
     *
     * 删除指定服务实例中的对应数据，支持指定ID删除和条件删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteDataRequest 请求对象
     * @return CompletableFuture<RunDeleteDataResponse>
     */
    public CompletableFuture<RunDeleteDataResponse> runDeleteDataAsync(RunDeleteDataRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runDeleteData);
    }

    /**
     * 删除数据
     *
     * 删除指定服务实例中的对应数据，支持指定ID删除和条件删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteDataRequest 请求对象
     * @return AsyncInvoker<RunDeleteDataRequest, RunDeleteDataResponse>
     */
    public AsyncInvoker<RunDeleteDataRequest, RunDeleteDataResponse> runDeleteDataAsyncInvoker(RunDeleteDataRequest request) {
        return new AsyncInvoker<RunDeleteDataRequest, RunDeleteDataResponse>(request, ImageSearchMeta.runDeleteData, hcClient);
    }

    /**
     * 搜索
     *
     * 从指定服务实例中进行搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSearchRequest 请求对象
     * @return CompletableFuture<RunSearchResponse>
     */
    public CompletableFuture<RunSearchResponse> runSearchAsync(RunSearchRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runSearch);
    }

    /**
     * 搜索
     *
     * 从指定服务实例中进行搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSearchRequest 请求对象
     * @return AsyncInvoker<RunSearchRequest, RunSearchResponse>
     */
    public AsyncInvoker<RunSearchRequest, RunSearchResponse> runSearchAsyncInvoker(RunSearchRequest request) {
        return new AsyncInvoker<RunSearchRequest, RunSearchResponse>(request, ImageSearchMeta.runSearch, hcClient);
    }

    /**
     * 更新数据
     *
     * 更新指定服务实例中的对应数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunUpdateDataRequest 请求对象
     * @return CompletableFuture<RunUpdateDataResponse>
     */
    public CompletableFuture<RunUpdateDataResponse> runUpdateDataAsync(RunUpdateDataRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageSearchMeta.runUpdateData);
    }

    /**
     * 更新数据
     *
     * 更新指定服务实例中的对应数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunUpdateDataRequest 请求对象
     * @return AsyncInvoker<RunUpdateDataRequest, RunUpdateDataResponse>
     */
    public AsyncInvoker<RunUpdateDataRequest, RunUpdateDataResponse> runUpdateDataAsyncInvoker(RunUpdateDataRequest request) {
        return new AsyncInvoker<RunUpdateDataRequest, RunUpdateDataResponse>(request, ImageSearchMeta.runUpdateData, hcClient);
    }

}