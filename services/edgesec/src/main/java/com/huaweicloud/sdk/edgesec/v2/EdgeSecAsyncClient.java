package com.huaweicloud.sdk.edgesec.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainsResponse;

import java.util.concurrent.CompletableFuture;

public class EdgeSecAsyncClient {

    protected HcClient hcClient;

    public EdgeSecAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EdgeSecAsyncClient> newBuilder() {
        ClientBuilder<EdgeSecAsyncClient> clientBuilder = new ClientBuilder<>(EdgeSecAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainsRequest 请求对象
     * @return CompletableFuture<CreateDomainsResponse>
     */
    public CompletableFuture<CreateDomainsResponse> createDomainsAsync(CreateDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createDomains);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainsRequest 请求对象
     * @return AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse>
     */
    public AsyncInvoker<CreateDomainsRequest, CreateDomainsResponse> createDomainsAsyncInvoker(
        CreateDomainsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createDomains, hcClient);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return CompletableFuture<DeleteDomainsResponse>
     */
    public CompletableFuture<DeleteDomainsResponse> deleteDomainsAsync(DeleteDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteDomains);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsAsyncInvoker(
        DeleteDomainsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteDomains, hcClient);
    }

    /**
     * 查询防护域名详情
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return CompletableFuture<ShowDomainDetailResponse>
     */
    public CompletableFuture<ShowDomainDetailResponse> showDomainDetailAsync(ShowDomainDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showDomainDetail);
    }

    /**
     * 查询防护域名详情
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>
     */
    public AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailAsyncInvoker(
        ShowDomainDetailRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showDomainDetail, hcClient);
    }

    /**
     * 查询防护域名列表
     *
     * 查询防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsRequest 请求对象
     * @return CompletableFuture<ShowDomainsResponse>
     */
    public CompletableFuture<ShowDomainsResponse> showDomainsAsync(ShowDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showDomains);
    }

    /**
     * 查询防护域名列表
     *
     * 查询防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsRequest 请求对象
     * @return AsyncInvoker<ShowDomainsRequest, ShowDomainsResponse>
     */
    public AsyncInvoker<ShowDomainsRequest, ShowDomainsResponse> showDomainsAsyncInvoker(ShowDomainsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showDomains, hcClient);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainsRequest 请求对象
     * @return CompletableFuture<UpdateDomainsResponse>
     */
    public CompletableFuture<UpdateDomainsResponse> updateDomainsAsync(UpdateDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateDomains);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainsRequest 请求对象
     * @return AsyncInvoker<UpdateDomainsRequest, UpdateDomainsResponse>
     */
    public AsyncInvoker<UpdateDomainsRequest, UpdateDomainsResponse> updateDomainsAsyncInvoker(
        UpdateDomainsRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateDomains, hcClient);
    }

}
