package com.huaweicloud.sdk.edgesec.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.edgesec.v1.model.ApplyWafPolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ApplyWafPolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreateEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeleteEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListCdnDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListCdnDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListCertificatesRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListCertificatesResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeSecSubscriptionRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeSecSubscriptionResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowCertificateRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowCertificateResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowEdgeWafDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsEventRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsEventResponse;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsTrafficRequest;
import com.huaweicloud.sdk.edgesec.v1.model.ShowStatisticsTrafficResponse;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeDDoSDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeDDoSDomainsResponse;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeWafDomainsRequest;
import com.huaweicloud.sdk.edgesec.v1.model.UpdateEdgeWafDomainsResponse;

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
     * 查询边缘安全已购产品
     *
     * 租户查询边缘安全已购产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSecSubscriptionRequest 请求对象
     * @return ListEdgeSecSubscriptionResponse
     */
    public ListEdgeSecSubscriptionResponse listEdgeSecSubscription(ListEdgeSecSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.listEdgeSecSubscription);
    }

    /**
     * 查询边缘安全已购产品
     *
     * 租户查询边缘安全已购产品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeSecSubscriptionRequest 请求对象
     * @return SyncInvoker<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse>
     */
    public SyncInvoker<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse> listEdgeSecSubscriptionInvoker(
        ListEdgeSecSubscriptionRequest request) {
        return new SyncInvoker<ListEdgeSecSubscriptionRequest, ListEdgeSecSubscriptionResponse>(request,
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
     * @return CreateEdgeDDoSDomainsResponse
     */
    public CreateEdgeDDoSDomainsResponse createEdgeDDoSDomains(CreateEdgeDDoSDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createEdgeDDoSDomains);
    }

    /**
     * 添加ddos防护域名
     *
     * 租户添加ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeDDoSDomainsRequest 请求对象
     * @return SyncInvoker<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse>
     */
    public SyncInvoker<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse> createEdgeDDoSDomainsInvoker(
        CreateEdgeDDoSDomainsRequest request) {
        return new SyncInvoker<CreateEdgeDDoSDomainsRequest, CreateEdgeDDoSDomainsResponse>(request,
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
     * @return DeleteEdgeDDoSDomainsResponse
     */
    public DeleteEdgeDDoSDomainsResponse deleteEdgeDDoSDomains(DeleteEdgeDDoSDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteEdgeDDoSDomains);
    }

    /**
     * 删除ddos防护域名
     *
     * 租户删除ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeDDoSDomainsRequest 请求对象
     * @return SyncInvoker<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse>
     */
    public SyncInvoker<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse> deleteEdgeDDoSDomainsInvoker(
        DeleteEdgeDDoSDomainsRequest request) {
        return new SyncInvoker<DeleteEdgeDDoSDomainsRequest, DeleteEdgeDDoSDomainsResponse>(request,
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
     * @return ListEdgeDDoSDomainsResponse
     */
    public ListEdgeDDoSDomainsResponse listEdgeDDoSDomains(ListEdgeDDoSDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.listEdgeDDoSDomains);
    }

    /**
     * 查询ddos防护域名
     *
     * 查询租户ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeDDoSDomainsRequest 请求对象
     * @return SyncInvoker<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse>
     */
    public SyncInvoker<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse> listEdgeDDoSDomainsInvoker(
        ListEdgeDDoSDomainsRequest request) {
        return new SyncInvoker<ListEdgeDDoSDomainsRequest, ListEdgeDDoSDomainsResponse>(request,
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
     * @return ShowStatisticsEventResponse
     */
    public ShowStatisticsEventResponse showStatisticsEvent(ShowStatisticsEventRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showStatisticsEvent);
    }

    /**
     * 查询租户受攻击事件数据
     *
     * 查询租户受攻击事件数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticsEventRequest 请求对象
     * @return SyncInvoker<ShowStatisticsEventRequest, ShowStatisticsEventResponse>
     */
    public SyncInvoker<ShowStatisticsEventRequest, ShowStatisticsEventResponse> showStatisticsEventInvoker(
        ShowStatisticsEventRequest request) {
        return new SyncInvoker<ShowStatisticsEventRequest, ShowStatisticsEventResponse>(request,
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
     * @return ShowStatisticsTrafficResponse
     */
    public ShowStatisticsTrafficResponse showStatisticsTraffic(ShowStatisticsTrafficRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showStatisticsTraffic);
    }

    /**
     * 查询租户流量数据
     *
     * 查询租户流量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticsTrafficRequest 请求对象
     * @return SyncInvoker<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse>
     */
    public SyncInvoker<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse> showStatisticsTrafficInvoker(
        ShowStatisticsTrafficRequest request) {
        return new SyncInvoker<ShowStatisticsTrafficRequest, ShowStatisticsTrafficResponse>(request,
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
     * @return UpdateEdgeDDoSDomainsResponse
     */
    public UpdateEdgeDDoSDomainsResponse updateEdgeDDoSDomains(UpdateEdgeDDoSDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateEdgeDDoSDomains);
    }

    /**
     * 更新ddos防护域名
     *
     * 租户更新ddos防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeDDoSDomainsRequest 请求对象
     * @return SyncInvoker<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse>
     */
    public SyncInvoker<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse> updateEdgeDDoSDomainsInvoker(
        UpdateEdgeDDoSDomainsRequest request) {
        return new SyncInvoker<UpdateEdgeDDoSDomainsRequest, UpdateEdgeDDoSDomainsResponse>(request,
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
     * @return ApplyWafPolicyResponse
     */
    public ApplyWafPolicyResponse applyWafPolicy(ApplyWafPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.applyWafPolicy);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyWafPolicyRequest 请求对象
     * @return SyncInvoker<ApplyWafPolicyRequest, ApplyWafPolicyResponse>
     */
    public SyncInvoker<ApplyWafPolicyRequest, ApplyWafPolicyResponse> applyWafPolicyInvoker(
        ApplyWafPolicyRequest request) {
        return new SyncInvoker<ApplyWafPolicyRequest, ApplyWafPolicyResponse>(request, EdgeSecMeta.applyWafPolicy,
            hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return CreateCertificateResponse
     */
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public SyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateInvoker(
        CreateCertificateRequest request) {
        return new SyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request,
            EdgeSecMeta.createCertificate, hcClient);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeWafDomainsRequest 请求对象
     * @return CreateEdgeWafDomainsResponse
     */
    public CreateEdgeWafDomainsResponse createEdgeWafDomains(CreateEdgeWafDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createEdgeWafDomains);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEdgeWafDomainsRequest 请求对象
     * @return SyncInvoker<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse>
     */
    public SyncInvoker<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse> createEdgeWafDomainsInvoker(
        CreateEdgeWafDomainsRequest request) {
        return new SyncInvoker<CreateEdgeWafDomainsRequest, CreateEdgeWafDomainsResponse>(request,
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
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, EdgeSecMeta.createPolicy, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse
     */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request,
            EdgeSecMeta.deleteCertificate, hcClient);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeWafDomainsRequest 请求对象
     * @return DeleteEdgeWafDomainsResponse
     */
    public DeleteEdgeWafDomainsResponse deleteEdgeWafDomains(DeleteEdgeWafDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteEdgeWafDomains);
    }

    /**
     * 删除防护域名
     *
     * 删除防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEdgeWafDomainsRequest 请求对象
     * @return SyncInvoker<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse>
     */
    public SyncInvoker<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse> deleteEdgeWafDomainsInvoker(
        DeleteEdgeWafDomainsRequest request) {
        return new SyncInvoker<DeleteEdgeWafDomainsRequest, DeleteEdgeWafDomainsResponse>(request,
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
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, EdgeSecMeta.deletePolicy, hcClient);
    }

    /**
     * 查询CDN域名列表
     *
     * 查询CDN域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCdnDomainsRequest 请求对象
     * @return ListCdnDomainsResponse
     */
    public ListCdnDomainsResponse listCdnDomains(ListCdnDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.listCdnDomains);
    }

    /**
     * 查询CDN域名列表
     *
     * 查询CDN域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCdnDomainsRequest 请求对象
     * @return SyncInvoker<ListCdnDomainsRequest, ListCdnDomainsResponse>
     */
    public SyncInvoker<ListCdnDomainsRequest, ListCdnDomainsResponse> listCdnDomainsInvoker(
        ListCdnDomainsRequest request) {
        return new SyncInvoker<ListCdnDomainsRequest, ListCdnDomainsResponse>(request, EdgeSecMeta.listCdnDomains,
            hcClient);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse
     */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, EdgeSecMeta.listCertificates,
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
     * @return ListEdgeWafDomainsResponse
     */
    public ListEdgeWafDomainsResponse listEdgeWafDomains(ListEdgeWafDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.listEdgeWafDomains);
    }

    /**
     * 查询WAF防护域名列表
     *
     * 查询WAF防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEdgeWafDomainsRequest 请求对象
     * @return SyncInvoker<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse>
     */
    public SyncInvoker<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse> listEdgeWafDomainsInvoker(
        ListEdgeWafDomainsRequest request) {
        return new SyncInvoker<ListEdgeWafDomainsRequest, ListEdgeWafDomainsResponse>(request,
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
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.listPolicy);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return SyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public SyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyInvoker(ListPolicyRequest request) {
        return new SyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, EdgeSecMeta.listPolicy, hcClient);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return ShowCertificateResponse
     */
    public ShowCertificateResponse showCertificate(ShowCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showCertificate);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificateRequest 请求对象
     * @return SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public SyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateInvoker(
        ShowCertificateRequest request) {
        return new SyncInvoker<ShowCertificateRequest, ShowCertificateResponse>(request, EdgeSecMeta.showCertificate,
            hcClient);
    }

    /**
     * 查询防护域名
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeWafDomainsRequest 请求对象
     * @return ShowEdgeWafDomainsResponse
     */
    public ShowEdgeWafDomainsResponse showEdgeWafDomains(ShowEdgeWafDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showEdgeWafDomains);
    }

    /**
     * 查询防护域名
     *
     * 查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEdgeWafDomainsRequest 请求对象
     * @return SyncInvoker<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse>
     */
    public SyncInvoker<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse> showEdgeWafDomainsInvoker(
        ShowEdgeWafDomainsRequest request) {
        return new SyncInvoker<ShowEdgeWafDomainsRequest, ShowEdgeWafDomainsResponse>(request,
            EdgeSecMeta.showEdgeWafDomains, hcClient);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return UpdateCertificateResponse
     */
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateCertificate);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateInvoker(
        UpdateCertificateRequest request) {
        return new SyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request,
            EdgeSecMeta.updateCertificate, hcClient);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeWafDomainsRequest 请求对象
     * @return UpdateEdgeWafDomainsResponse
     */
    public UpdateEdgeWafDomainsResponse updateEdgeWafDomains(UpdateEdgeWafDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateEdgeWafDomains);
    }

    /**
     * 更新防护域名
     *
     * 更新防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEdgeWafDomainsRequest 请求对象
     * @return SyncInvoker<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse>
     */
    public SyncInvoker<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse> updateEdgeWafDomainsInvoker(
        UpdateEdgeWafDomainsRequest request) {
        return new SyncInvoker<UpdateEdgeWafDomainsRequest, UpdateEdgeWafDomainsResponse>(request,
            EdgeSecMeta.updateEdgeWafDomains, hcClient);
    }

}
