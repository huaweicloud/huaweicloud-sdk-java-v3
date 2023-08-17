package com.huaweicloud.sdk.imagesearch.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.imagesearch.v2.model.RunAddDataRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunAddDataResponse;
import com.huaweicloud.sdk.imagesearch.v2.model.RunCheckDataRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunCheckDataResponse;
import com.huaweicloud.sdk.imagesearch.v2.model.RunDeleteDataRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunDeleteDataResponse;
import com.huaweicloud.sdk.imagesearch.v2.model.RunSearchRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunSearchResponse;
import com.huaweicloud.sdk.imagesearch.v2.model.RunUpdateDataRequest;
import com.huaweicloud.sdk.imagesearch.v2.model.RunUpdateDataResponse;

public class ImageSearchClient {

    protected HcClient hcClient;

    public ImageSearchClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImageSearchClient> newBuilder() {
        ClientBuilder<ImageSearchClient> clientBuilder = new ClientBuilder<>(ImageSearchClient::new);
        return clientBuilder;
    }

    /**
     * 添加数据
     *
     * 添加数据到指定服务实例中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAddDataRequest 请求对象
     * @return RunAddDataResponse
     */
    public RunAddDataResponse runAddData(RunAddDataRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runAddData);
    }

    /**
     * 添加数据
     *
     * 添加数据到指定服务实例中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAddDataRequest 请求对象
     * @return SyncInvoker<RunAddDataRequest, RunAddDataResponse>
     */
    public SyncInvoker<RunAddDataRequest, RunAddDataResponse> runAddDataInvoker(RunAddDataRequest request) {
        return new SyncInvoker<RunAddDataRequest, RunAddDataResponse>(request, ImageSearchMeta.runAddData, hcClient);
    }

    /**
     * 检查数据
     *
     * 检查指定服务实例中的对应数据，支持指定ID检查和条件检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCheckDataRequest 请求对象
     * @return RunCheckDataResponse
     */
    public RunCheckDataResponse runCheckData(RunCheckDataRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runCheckData);
    }

    /**
     * 检查数据
     *
     * 检查指定服务实例中的对应数据，支持指定ID检查和条件检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCheckDataRequest 请求对象
     * @return SyncInvoker<RunCheckDataRequest, RunCheckDataResponse>
     */
    public SyncInvoker<RunCheckDataRequest, RunCheckDataResponse> runCheckDataInvoker(RunCheckDataRequest request) {
        return new SyncInvoker<RunCheckDataRequest, RunCheckDataResponse>(request, ImageSearchMeta.runCheckData,
            hcClient);
    }

    /**
     * 删除数据
     *
     * 删除指定服务实例中的对应数据，支持指定ID删除和条件删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteDataRequest 请求对象
     * @return RunDeleteDataResponse
     */
    public RunDeleteDataResponse runDeleteData(RunDeleteDataRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runDeleteData);
    }

    /**
     * 删除数据
     *
     * 删除指定服务实例中的对应数据，支持指定ID删除和条件删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteDataRequest 请求对象
     * @return SyncInvoker<RunDeleteDataRequest, RunDeleteDataResponse>
     */
    public SyncInvoker<RunDeleteDataRequest, RunDeleteDataResponse> runDeleteDataInvoker(RunDeleteDataRequest request) {
        return new SyncInvoker<RunDeleteDataRequest, RunDeleteDataResponse>(request, ImageSearchMeta.runDeleteData,
            hcClient);
    }

    /**
     * 搜索
     *
     * 从指定服务实例中进行搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSearchRequest 请求对象
     * @return RunSearchResponse
     */
    public RunSearchResponse runSearch(RunSearchRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runSearch);
    }

    /**
     * 搜索
     *
     * 从指定服务实例中进行搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSearchRequest 请求对象
     * @return SyncInvoker<RunSearchRequest, RunSearchResponse>
     */
    public SyncInvoker<RunSearchRequest, RunSearchResponse> runSearchInvoker(RunSearchRequest request) {
        return new SyncInvoker<RunSearchRequest, RunSearchResponse>(request, ImageSearchMeta.runSearch, hcClient);
    }

    /**
     * 更新数据
     *
     * 更新指定服务实例中的对应数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunUpdateDataRequest 请求对象
     * @return RunUpdateDataResponse
     */
    public RunUpdateDataResponse runUpdateData(RunUpdateDataRequest request) {
        return hcClient.syncInvokeHttp(request, ImageSearchMeta.runUpdateData);
    }

    /**
     * 更新数据
     *
     * 更新指定服务实例中的对应数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunUpdateDataRequest 请求对象
     * @return SyncInvoker<RunUpdateDataRequest, RunUpdateDataResponse>
     */
    public SyncInvoker<RunUpdateDataRequest, RunUpdateDataResponse> runUpdateDataInvoker(RunUpdateDataRequest request) {
        return new SyncInvoker<RunUpdateDataRequest, RunUpdateDataResponse>(request, ImageSearchMeta.runUpdateData,
            hcClient);
    }

}
