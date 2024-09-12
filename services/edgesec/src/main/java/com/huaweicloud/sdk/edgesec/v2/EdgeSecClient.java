package com.huaweicloud.sdk.edgesec.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class EdgeSecClient {

    protected HcClient hcClient;

    public EdgeSecClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EdgeSecClient> newBuilder() {
        ClientBuilder<EdgeSecClient> clientBuilder = new ClientBuilder<>(EdgeSecClient::new);
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
     * @return CreateDomainsResponse
     */
    public CreateDomainsResponse createDomains(CreateDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createDomains);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainsRequest 请求对象
     * @return SyncInvoker<CreateDomainsRequest, CreateDomainsResponse>
     */
    public SyncInvoker<CreateDomainsRequest, CreateDomainsResponse> createDomainsInvoker(CreateDomainsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createDomains, hcClient);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return DeleteDomainsResponse
     */
    public DeleteDomainsResponse deleteDomains(DeleteDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteDomains);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsInvoker(DeleteDomainsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteDomains, hcClient);
    }

    /**
     * 查询防护域名详情
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return ShowDomainDetailResponse
     */
    public ShowDomainDetailResponse showDomainDetail(ShowDomainDetailRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showDomainDetail);
    }

    /**
     * 查询防护域名详情
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return SyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>
     */
    public SyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailInvoker(
        ShowDomainDetailRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showDomainDetail, hcClient);
    }

    /**
     * 查询防护域名列表
     *
     * 查询防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsRequest 请求对象
     * @return ShowDomainsResponse
     */
    public ShowDomainsResponse showDomains(ShowDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showDomains);
    }

    /**
     * 查询防护域名列表
     *
     * 查询防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainsRequest 请求对象
     * @return SyncInvoker<ShowDomainsRequest, ShowDomainsResponse>
     */
    public SyncInvoker<ShowDomainsRequest, ShowDomainsResponse> showDomainsInvoker(ShowDomainsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showDomains, hcClient);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainsRequest 请求对象
     * @return UpdateDomainsResponse
     */
    public UpdateDomainsResponse updateDomains(UpdateDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateDomains);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainsRequest 请求对象
     * @return SyncInvoker<UpdateDomainsRequest, UpdateDomainsResponse>
     */
    public SyncInvoker<UpdateDomainsRequest, UpdateDomainsResponse> updateDomainsInvoker(UpdateDomainsRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateDomains, hcClient);
    }

}
