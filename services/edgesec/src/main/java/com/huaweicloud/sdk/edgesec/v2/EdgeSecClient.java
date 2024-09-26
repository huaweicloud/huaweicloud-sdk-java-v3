package com.huaweicloud.sdk.edgesec.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPoliciesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPoliciesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusResponse;

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
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyHttpPolicyRequest 请求对象
     * @return ApplyHttpPolicyResponse
     */
    public ApplyHttpPolicyResponse applyHttpPolicy(ApplyHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.applyHttpPolicy);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyHttpPolicyRequest 请求对象
     * @return SyncInvoker<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse>
     */
    public SyncInvoker<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> applyHttpPolicyInvoker(
        ApplyHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.applyHttpPolicy, hcClient);
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
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPolicyRequest 请求对象
     * @return CreateHttpPolicyResponse
     */
    public CreateHttpPolicyResponse createHttpPolicy(CreateHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.createHttpPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPolicyRequest 请求对象
     * @return SyncInvoker<CreateHttpPolicyRequest, CreateHttpPolicyResponse>
     */
    public SyncInvoker<CreateHttpPolicyRequest, CreateHttpPolicyResponse> createHttpPolicyInvoker(
        CreateHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.createHttpPolicy, hcClient);
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
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPolicyRequest 请求对象
     * @return DeleteHttpPolicyResponse
     */
    public DeleteHttpPolicyResponse deleteHttpPolicy(DeleteHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.deleteHttpPolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPolicyRequest 请求对象
     * @return SyncInvoker<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse>
     */
    public SyncInvoker<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> deleteHttpPolicyInvoker(
        DeleteHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.deleteHttpPolicy, hcClient);
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
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPoliciesRequest 请求对象
     * @return ShowHttpPoliciesResponse
     */
    public ShowHttpPoliciesResponse showHttpPolicies(ShowHttpPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpPolicies);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPoliciesRequest 请求对象
     * @return SyncInvoker<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse>
     */
    public SyncInvoker<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> showHttpPoliciesInvoker(
        ShowHttpPoliciesRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpPolicies, hcClient);
    }

    /**
     * 查询防护策略
     *
     * 查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPolicyRequest 请求对象
     * @return ShowHttpPolicyResponse
     */
    public ShowHttpPolicyResponse showHttpPolicy(ShowHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.showHttpPolicy);
    }

    /**
     * 查询防护策略
     *
     * 查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPolicyRequest 请求对象
     * @return SyncInvoker<ShowHttpPolicyRequest, ShowHttpPolicyResponse>
     */
    public SyncInvoker<ShowHttpPolicyRequest, ShowHttpPolicyResponse> showHttpPolicyInvoker(
        ShowHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.showHttpPolicy, hcClient);
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

    /**
     * 更新防护策略
     *
     * 更新防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRequest 请求对象
     * @return UpdateHttpPolicyResponse
     */
    public UpdateHttpPolicyResponse updateHttpPolicy(UpdateHttpPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpPolicy);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRequest 请求对象
     * @return SyncInvoker<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse>
     */
    public SyncInvoker<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> updateHttpPolicyInvoker(
        UpdateHttpPolicyRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpPolicy, hcClient);
    }

    /**
     * 更新防护策略规则开关
     *
     * 更新防护策略规则开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRuleStatusRequest 请求对象
     * @return UpdateHttpPolicyRuleStatusResponse
     */
    public UpdateHttpPolicyRuleStatusResponse updateHttpPolicyRuleStatus(UpdateHttpPolicyRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, EdgeSecMeta.updateHttpPolicyRuleStatus);
    }

    /**
     * 更新防护策略规则开关
     *
     * 更新防护策略规则开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRuleStatusRequest 请求对象
     * @return SyncInvoker<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse>
     */
    public SyncInvoker<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> updateHttpPolicyRuleStatusInvoker(
        UpdateHttpPolicyRuleStatusRequest request) {
        return new SyncInvoker<>(request, EdgeSecMeta.updateHttpPolicyRuleStatus, hcClient);
    }

}
