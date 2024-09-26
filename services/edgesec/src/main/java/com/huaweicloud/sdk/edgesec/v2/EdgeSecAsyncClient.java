package com.huaweicloud.sdk.edgesec.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyHttpPolicyRequest 请求对象
     * @return CompletableFuture<ApplyHttpPolicyResponse>
     */
    public CompletableFuture<ApplyHttpPolicyResponse> applyHttpPolicyAsync(ApplyHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.applyHttpPolicy);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyHttpPolicyRequest 请求对象
     * @return AsyncInvoker<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse>
     */
    public AsyncInvoker<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> applyHttpPolicyAsyncInvoker(
        ApplyHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.applyHttpPolicy, hcClient);
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
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPolicyRequest 请求对象
     * @return CompletableFuture<CreateHttpPolicyResponse>
     */
    public CompletableFuture<CreateHttpPolicyResponse> createHttpPolicyAsync(CreateHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.createHttpPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHttpPolicyRequest 请求对象
     * @return AsyncInvoker<CreateHttpPolicyRequest, CreateHttpPolicyResponse>
     */
    public AsyncInvoker<CreateHttpPolicyRequest, CreateHttpPolicyResponse> createHttpPolicyAsyncInvoker(
        CreateHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.createHttpPolicy, hcClient);
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
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPolicyRequest 请求对象
     * @return CompletableFuture<DeleteHttpPolicyResponse>
     */
    public CompletableFuture<DeleteHttpPolicyResponse> deleteHttpPolicyAsync(DeleteHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.deleteHttpPolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHttpPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse>
     */
    public AsyncInvoker<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> deleteHttpPolicyAsyncInvoker(
        DeleteHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.deleteHttpPolicy, hcClient);
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
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPoliciesRequest 请求对象
     * @return CompletableFuture<ShowHttpPoliciesResponse>
     */
    public CompletableFuture<ShowHttpPoliciesResponse> showHttpPoliciesAsync(ShowHttpPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpPolicies);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPoliciesRequest 请求对象
     * @return AsyncInvoker<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse>
     */
    public AsyncInvoker<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> showHttpPoliciesAsyncInvoker(
        ShowHttpPoliciesRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpPolicies, hcClient);
    }

    /**
     * 查询防护策略
     *
     * 查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPolicyRequest 请求对象
     * @return CompletableFuture<ShowHttpPolicyResponse>
     */
    public CompletableFuture<ShowHttpPolicyResponse> showHttpPolicyAsync(ShowHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.showHttpPolicy);
    }

    /**
     * 查询防护策略
     *
     * 查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpPolicyRequest 请求对象
     * @return AsyncInvoker<ShowHttpPolicyRequest, ShowHttpPolicyResponse>
     */
    public AsyncInvoker<ShowHttpPolicyRequest, ShowHttpPolicyResponse> showHttpPolicyAsyncInvoker(
        ShowHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.showHttpPolicy, hcClient);
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

    /**
     * 更新防护策略
     *
     * 更新防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRequest 请求对象
     * @return CompletableFuture<UpdateHttpPolicyResponse>
     */
    public CompletableFuture<UpdateHttpPolicyResponse> updateHttpPolicyAsync(UpdateHttpPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpPolicy);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse>
     */
    public AsyncInvoker<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> updateHttpPolicyAsyncInvoker(
        UpdateHttpPolicyRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpPolicy, hcClient);
    }

    /**
     * 更新防护策略规则开关
     *
     * 更新防护策略规则开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRuleStatusRequest 请求对象
     * @return CompletableFuture<UpdateHttpPolicyRuleStatusResponse>
     */
    public CompletableFuture<UpdateHttpPolicyRuleStatusResponse> updateHttpPolicyRuleStatusAsync(
        UpdateHttpPolicyRuleStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, EdgeSecMeta.updateHttpPolicyRuleStatus);
    }

    /**
     * 更新防护策略规则开关
     *
     * 更新防护策略规则开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpPolicyRuleStatusRequest 请求对象
     * @return AsyncInvoker<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse>
     */
    public AsyncInvoker<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> updateHttpPolicyRuleStatusAsyncInvoker(
        UpdateHttpPolicyRuleStatusRequest request) {
        return new AsyncInvoker<>(request, EdgeSecMeta.updateHttpPolicyRuleStatus, hcClient);
    }

}
