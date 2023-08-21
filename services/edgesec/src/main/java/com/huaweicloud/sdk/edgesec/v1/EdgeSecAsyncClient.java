package com.huaweicloud.sdk.edgesec.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.edgesec.v1.model.ApplyWafPolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ApplyWafPolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListCdnDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListCdnDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeSecSubscriptionRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeSecSubscriptionResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsEventRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsEventResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsTrafficRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsTrafficResponse;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeWafDomainsResponse;

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
     * 查询边缘安全已购产品
     *
     * 租户查询边缘安全已购产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSecSubscriptionRequest 请求对象
     * @return CompletableFuture<ListEdgeSecSubscriptionResponse>
     */
    public CompletableFuture<ListEdgeSecSubscriptionResponse> listEdgeSecSubscriptionAsync(
        ListEdgeSecSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.listEdgeSecSubscription);
    }

    /**
     * 查询边缘安全已购产品
     *
     * 租户查询边缘安全已购产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSecSubscriptionRequest 请求对象
     * @return AsyncInvoker<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse>
     */
    public AsyncInvoker<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse> listEdgeSecSubscriptionAsyncInvoker(
        ListEdgeSecSubscriptionRequest request) {
        return new AsyncInvoker<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse>(request,
            EdgeSecMeta.listEdgeSecSubscription, hcClient);
    }

    /**
     * 添加ddos防护域名
     *
     * 租户添加ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeDDoSDomainsRequest 请求对象
     * @return CompletableFuture<CreateEdgeDDoSDomainsResponse>
     */
    public CompletableFuture<CreateEdgeDDoSDomainsResponse> createEdgeDDoSDomainsAsync(
        CreateEdgeDDoSDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createEdgeDDoSDomains);
    }

    /**
     * 添加ddos防护域名
     *
     * 租户添加ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeDDoSDomainsRequest 请求对象
     * @return AsyncInvoker<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse>
     */
    public AsyncInvoker<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse> createEdgeDDoSDomainsAsyncInvoker(
        CreateEdgeDDoSDomainsRequest request) {
        return new AsyncInvoker<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse>(request,
            EdgeSecMeta.createEdgeDDoSDomains, hcClient);
    }

    /**
     * 删除ddos防护域名
     *
     * 租户删除ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeDDoSDomainsRequest 请求对象
     * @return CompletableFuture<DeleteEdgeDDoSDomainsResponse>
     */
    public CompletableFuture<DeleteEdgeDDoSDomainsResponse> deleteEdgeDDoSDomainsAsync(
        DeleteEdgeDDoSDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteEdgeDDoSDomains);
    }

    /**
     * 删除ddos防护域名
     *
     * 租户删除ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeDDoSDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse>
     */
    public AsyncInvoker<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse> deleteEdgeDDoSDomainsAsyncInvoker(
        DeleteEdgeDDoSDomainsRequest request) {
        return new AsyncInvoker<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse>(request,
            EdgeSecMeta.deleteEdgeDDoSDomains, hcClient);
    }

    /**
     * 查询ddos防护域名
     *
     * 查询租户ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeDDoSDomainsRequest 请求对象
     * @return CompletableFuture<ListEdgeDDoSDomainsResponse>
     */
    public CompletableFuture<ListEdgeDDoSDomainsResponse> listEdgeDDoSDomainsAsync(ListEdgeDDoSDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.listEdgeDDoSDomains);
    }

    /**
     * 查询ddos防护域名
     *
     * 查询租户ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeDDoSDomainsRequest 请求对象
     * @return AsyncInvoker<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse>
     */
    public AsyncInvoker<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse> listEdgeDDoSDomainsAsyncInvoker(
        ListEdgeDDoSDomainsRequest request) {
        return new AsyncInvoker<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse>(request,
            EdgeSecMeta.listEdgeDDoSDomains, hcClient);
    }

    /**
     * 查询租户受攻击事件数据
     *
     * 查询租户受攻击事件数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticsEventRequest 请求对象
     * @return CompletableFuture<ShowStatisticsEventResponse>
     */
    public CompletableFuture<ShowStatisticsEventResponse> showStatisticsEventAsync(ShowStatisticsEventRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showStatisticsEvent);
    }

    /**
     * 查询租户受攻击事件数据
     *
     * 查询租户受攻击事件数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticsEventRequest 请求对象
     * @return AsyncInvoker<ShowStatisticsEventRequest, ShowStatisticsEventResponse>
     */
    public AsyncInvoker<ShowStatisticsEventRequest, ShowStatisticsEventResponse> showStatisticsEventAsyncInvoker(
        ShowStatisticsEventRequest request) {
        return new AsyncInvoker<ShowStatisticsEventRequest, ShowStatisticsEventResponse>(request,
            EdgeSecMeta.showStatisticsEvent, hcClient);
    }

    /**
     * 查询租户流量数据
     *
     * 查询租户流量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticsTrafficRequest 请求对象
     * @return CompletableFuture<ShowStatisticsTrafficResponse>
     */
    public CompletableFuture<ShowStatisticsTrafficResponse> showStatisticsTrafficAsync(
        ShowStatisticsTrafficRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showStatisticsTraffic);
    }

    /**
     * 查询租户流量数据
     *
     * 查询租户流量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticsTrafficRequest 请求对象
     * @return AsyncInvoker<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse>
     */
    public AsyncInvoker<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse> showStatisticsTrafficAsyncInvoker(
        ShowStatisticsTrafficRequest request) {
        return new AsyncInvoker<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse>(request,
            EdgeSecMeta.showStatisticsTraffic, hcClient);
    }

    /**
     * 更新ddos防护域名
     *
     * 租户更新ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeDDoSDomainsRequest 请求对象
     * @return CompletableFuture<UpdateEdgeDDoSDomainsResponse>
     */
    public CompletableFuture<UpdateEdgeDDoSDomainsResponse> updateEdgeDDoSDomainsAsync(
        UpdateEdgeDDoSDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateEdgeDDoSDomains);
    }

    /**
     * 更新ddos防护域名
     *
     * 租户更新ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeDDoSDomainsRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse>
     */
    public AsyncInvoker<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse> updateEdgeDDoSDomainsAsyncInvoker(
        UpdateEdgeDDoSDomainsRequest request) {
        return new AsyncInvoker<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse>(request,
            EdgeSecMeta.updateEdgeDDoSDomains, hcClient);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyWafPolicyRequest 请求对象
     * @return CompletableFuture<ApplyWafPolicyResponse>
     */
    public CompletableFuture<ApplyWafPolicyResponse> applyWafPolicyAsync(ApplyWafPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.applyWafPolicy);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyWafPolicyRequest 请求对象
     * @return AsyncInvoker<ApplyWafPolicyRequest, ApplyWafPolicyResponse>
     */
    public AsyncInvoker<ApplyWafPolicyRequest, ApplyWafPolicyResponse> applyWafPolicyAsyncInvoker(
        ApplyWafPolicyRequest request) {
        return new AsyncInvoker<ApplyWafPolicyRequest, ApplyWafPolicyResponse>(request, EdgeSecMeta.applyWafPolicy,
            hcClient);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeWafDomainsRequest 请求对象
     * @return CompletableFuture<CreateEdgeWafDomainsResponse>
     */
    public CompletableFuture<CreateEdgeWafDomainsResponse> createEdgeWafDomainsAsync(
        CreateEdgeWafDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createEdgeWafDomains);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeWafDomainsRequest 请求对象
     * @return AsyncInvoker<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse>
     */
    public AsyncInvoker<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse> createEdgeWafDomainsAsyncInvoker(
        CreateEdgeWafDomainsRequest request) {
        return new AsyncInvoker<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse>(request,
            EdgeSecMeta.createEdgeWafDomains, hcClient);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(
        CreatePolicyRequest request) {
        return new AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, EdgeSecMeta.createPolicy, hcClient);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeWafDomainsRequest 请求对象
     * @return CompletableFuture<DeleteEdgeWafDomainsResponse>
     */
    public CompletableFuture<DeleteEdgeWafDomainsResponse> deleteEdgeWafDomainsAsync(
        DeleteEdgeWafDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteEdgeWafDomains);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeWafDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse>
     */
    public AsyncInvoker<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse> deleteEdgeWafDomainsAsyncInvoker(
        DeleteEdgeWafDomainsRequest request) {
        return new AsyncInvoker<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse>(request,
            EdgeSecMeta.deleteEdgeWafDomains, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, EdgeSecMeta.deletePolicy, hcClient);
    }

    /**
     * 查询CDN域名列表
     *
     * 查询CDN域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCdnDomainsRequest 请求对象
     * @return CompletableFuture<ListCdnDomainsResponse>
     */
    public CompletableFuture<ListCdnDomainsResponse> listCdnDomainsAsync(ListCdnDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.listCdnDomains);
    }

    /**
     * 查询CDN域名列表
     *
     * 查询CDN域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCdnDomainsRequest 请求对象
     * @return AsyncInvoker<ListCdnDomainsRequest, ListCdnDomainsResponse>
     */
    public AsyncInvoker<ListCdnDomainsRequest, ListCdnDomainsResponse> listCdnDomainsAsyncInvoker(
        ListCdnDomainsRequest request) {
        return new AsyncInvoker<ListCdnDomainsRequest, ListCdnDomainsResponse>(request, EdgeSecMeta.listCdnDomains,
            hcClient);
    }

    /**
     * 查询WAF防护域名列表
     *
     * 查询WAF防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeWafDomainsRequest 请求对象
     * @return CompletableFuture<ListEdgeWafDomainsResponse>
     */
    public CompletableFuture<ListEdgeWafDomainsResponse> listEdgeWafDomainsAsync(ListEdgeWafDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.listEdgeWafDomains);
    }

    /**
     * 查询WAF防护域名列表
     *
     * 查询WAF防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeWafDomainsRequest 请求对象
     * @return AsyncInvoker<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse>
     */
    public AsyncInvoker<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse> listEdgeWafDomainsAsyncInvoker(
        ListEdgeWafDomainsRequest request) {
        return new AsyncInvoker<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse>(request,
            EdgeSecMeta.listEdgeWafDomains, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return CompletableFuture<ListPolicyResponse>
     */
    public CompletableFuture<ListPolicyResponse> listPolicyAsync(ListPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.listPolicy);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return AsyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public AsyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyAsyncInvoker(ListPolicyRequest request) {
        return new AsyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, EdgeSecMeta.listPolicy, hcClient);
    }

    /**
     * 查询防护域名
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeWafDomainsRequest 请求对象
     * @return CompletableFuture<ShowEdgeWafDomainsResponse>
     */
    public CompletableFuture<ShowEdgeWafDomainsResponse> showEdgeWafDomainsAsync(ShowEdgeWafDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showEdgeWafDomains);
    }

    /**
     * 查询防护域名
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeWafDomainsRequest 请求对象
     * @return AsyncInvoker<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse>
     */
    public AsyncInvoker<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse> showEdgeWafDomainsAsyncInvoker(
        ShowEdgeWafDomainsRequest request) {
        return new AsyncInvoker<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse>(request,
            EdgeSecMeta.showEdgeWafDomains, hcClient);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeWafDomainsRequest 请求对象
     * @return CompletableFuture<UpdateEdgeWafDomainsResponse>
     */
    public CompletableFuture<UpdateEdgeWafDomainsResponse> updateEdgeWafDomainsAsync(
        UpdateEdgeWafDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateEdgeWafDomains);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeWafDomainsRequest 请求对象
     * @return AsyncInvoker<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse>
     */
    public AsyncInvoker<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse> updateEdgeWafDomainsAsyncInvoker(
        UpdateEdgeWafDomainsRequest request) {
        return new AsyncInvoker<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse>(request,
            EdgeSecMeta.updateEdgeWafDomains, hcClient);
    }

}
