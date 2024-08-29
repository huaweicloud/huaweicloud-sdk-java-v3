package com.huaweicloud.sdk.gsl.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gsl.v3.model.AddNetworkSwitchPolicyRequest;
import com.huaweicloud.sdk.gsl.v3.model.AddNetworkSwitchPolicyResponse;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetAttributesRequest;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetAttributesResponse;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetTagsRequest;
import com.huaweicloud.sdk.gsl.v3.model.BatchSetTagsResponse;
import com.huaweicloud.sdk.gsl.v3.model.CreateAttributeRequest;
import com.huaweicloud.sdk.gsl.v3.model.CreateAttributeResponse;
import com.huaweicloud.sdk.gsl.v3.model.CreateTagRequest;
import com.huaweicloud.sdk.gsl.v3.model.CreateTagResponse;
import com.huaweicloud.sdk.gsl.v3.model.DeleteRealNameRequest;
import com.huaweicloud.sdk.gsl.v3.model.DeleteRealNameResponse;
import com.huaweicloud.sdk.gsl.v3.model.DeleteTagRequest;
import com.huaweicloud.sdk.gsl.v3.model.DeleteTagResponse;
import com.huaweicloud.sdk.gsl.v3.model.DisableAttributeRequest;
import com.huaweicloud.sdk.gsl.v3.model.DisableAttributeResponse;
import com.huaweicloud.sdk.gsl.v3.model.EnableAttributeRequest;
import com.huaweicloud.sdk.gsl.v3.model.EnableAttributeResponse;
import com.huaweicloud.sdk.gsl.v3.model.EnableSimCardRequest;
import com.huaweicloud.sdk.gsl.v3.model.EnableSimCardResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListAttributesRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListAttributesResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListBackPoolMembersRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListBackPoolMembersResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListBackPoolsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListBackPoolsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListFlowBySimCardsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListFlowBySimCardsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListNetworkSwitchPoliciesRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListNetworkSwitchPoliciesResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListProPricePlansRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListProPricePlansResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimCardsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimCardsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimDeviceMultiplyRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimDeviceMultiplyResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPoolMembersRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPoolMembersResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPoolsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPoolsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPricePlansRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimPricePlansResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSmsDetailsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSmsDetailsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListTagsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListTagsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListWorkOrderDetailsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListWorkOrderDetailsResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListWorkOrdersRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListWorkOrdersResponse;
import com.huaweicloud.sdk.gsl.v3.model.RegisterImeiRequest;
import com.huaweicloud.sdk.gsl.v3.model.RegisterImeiResponse;
import com.huaweicloud.sdk.gsl.v3.model.ResetSimCardRequest;
import com.huaweicloud.sdk.gsl.v3.model.ResetSimCardResponse;
import com.huaweicloud.sdk.gsl.v3.model.SendSmsRequest;
import com.huaweicloud.sdk.gsl.v3.model.SendSmsResponse;
import com.huaweicloud.sdk.gsl.v3.model.SetExceedCutNetRequest;
import com.huaweicloud.sdk.gsl.v3.model.SetExceedCutNetResponse;
import com.huaweicloud.sdk.gsl.v3.model.SetNetworkSwitchPolicyRequest;
import com.huaweicloud.sdk.gsl.v3.model.SetNetworkSwitchPolicyResponse;
import com.huaweicloud.sdk.gsl.v3.model.SetSpeedValueRequest;
import com.huaweicloud.sdk.gsl.v3.model.SetSpeedValueResponse;
import com.huaweicloud.sdk.gsl.v3.model.ShowMonthUsagesRequest;
import com.huaweicloud.sdk.gsl.v3.model.ShowMonthUsagesResponse;
import com.huaweicloud.sdk.gsl.v3.model.ShowRealNamedRequest;
import com.huaweicloud.sdk.gsl.v3.model.ShowRealNamedResponse;
import com.huaweicloud.sdk.gsl.v3.model.ShowSimCardRequest;
import com.huaweicloud.sdk.gsl.v3.model.ShowSimCardResponse;
import com.huaweicloud.sdk.gsl.v3.model.StartStopNetRequest;
import com.huaweicloud.sdk.gsl.v3.model.StartStopNetResponse;
import com.huaweicloud.sdk.gsl.v3.model.StopSimCardRequest;
import com.huaweicloud.sdk.gsl.v3.model.StopSimCardResponse;
import com.huaweicloud.sdk.gsl.v3.model.SwitchNetworkRequest;
import com.huaweicloud.sdk.gsl.v3.model.SwitchNetworkResponse;
import com.huaweicloud.sdk.gsl.v3.model.UpdateAttributeRequest;
import com.huaweicloud.sdk.gsl.v3.model.UpdateAttributeResponse;

import java.util.concurrent.CompletableFuture;

public class GslAsyncClient {

    protected HcClient hcClient;

    public GslAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GslAsyncClient> newBuilder() {
        ClientBuilder<GslAsyncClient> clientBuilder = new ClientBuilder<>(GslAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量设置自定义属性接口
     *
     * 批量设置自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetAttributesRequest 请求对象
     * @return CompletableFuture<BatchSetAttributesResponse>
     */
    public CompletableFuture<BatchSetAttributesResponse> batchSetAttributesAsync(BatchSetAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.batchSetAttributes);
    }

    /**
     * 批量设置自定义属性接口
     *
     * 批量设置自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetAttributesRequest 请求对象
     * @return AsyncInvoker<BatchSetAttributesRequest, BatchSetAttributesResponse>
     */
    public AsyncInvoker<BatchSetAttributesRequest, BatchSetAttributesResponse> batchSetAttributesAsyncInvoker(
        BatchSetAttributesRequest request) {
        return new AsyncInvoker<>(request, GslMeta.batchSetAttributes, hcClient);
    }

    /**
     * 用户新增自定义属性接口
     *
     * 用户新增自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttributeRequest 请求对象
     * @return CompletableFuture<CreateAttributeResponse>
     */
    public CompletableFuture<CreateAttributeResponse> createAttributeAsync(CreateAttributeRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.createAttribute);
    }

    /**
     * 用户新增自定义属性接口
     *
     * 用户新增自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttributeRequest 请求对象
     * @return AsyncInvoker<CreateAttributeRequest, CreateAttributeResponse>
     */
    public AsyncInvoker<CreateAttributeRequest, CreateAttributeResponse> createAttributeAsyncInvoker(
        CreateAttributeRequest request) {
        return new AsyncInvoker<>(request, GslMeta.createAttribute, hcClient);
    }

    /**
     * 停用自定义属性接口
     *
     * 停用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAttributeRequest 请求对象
     * @return CompletableFuture<DisableAttributeResponse>
     */
    public CompletableFuture<DisableAttributeResponse> disableAttributeAsync(DisableAttributeRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.disableAttribute);
    }

    /**
     * 停用自定义属性接口
     *
     * 停用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAttributeRequest 请求对象
     * @return AsyncInvoker<DisableAttributeRequest, DisableAttributeResponse>
     */
    public AsyncInvoker<DisableAttributeRequest, DisableAttributeResponse> disableAttributeAsyncInvoker(
        DisableAttributeRequest request) {
        return new AsyncInvoker<>(request, GslMeta.disableAttribute, hcClient);
    }

    /**
     * 启用自定义属性接口
     *
     * 启用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAttributeRequest 请求对象
     * @return CompletableFuture<EnableAttributeResponse>
     */
    public CompletableFuture<EnableAttributeResponse> enableAttributeAsync(EnableAttributeRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.enableAttribute);
    }

    /**
     * 启用自定义属性接口
     *
     * 启用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAttributeRequest 请求对象
     * @return AsyncInvoker<EnableAttributeRequest, EnableAttributeResponse>
     */
    public AsyncInvoker<EnableAttributeRequest, EnableAttributeResponse> enableAttributeAsyncInvoker(
        EnableAttributeRequest request) {
        return new AsyncInvoker<>(request, GslMeta.enableAttribute, hcClient);
    }

    /**
     * 查询自定义属性列表接口
     *
     * 查询自定义属性列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttributesRequest 请求对象
     * @return CompletableFuture<ListAttributesResponse>
     */
    public CompletableFuture<ListAttributesResponse> listAttributesAsync(ListAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listAttributes);
    }

    /**
     * 查询自定义属性列表接口
     *
     * 查询自定义属性列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttributesRequest 请求对象
     * @return AsyncInvoker<ListAttributesRequest, ListAttributesResponse>
     */
    public AsyncInvoker<ListAttributesRequest, ListAttributesResponse> listAttributesAsyncInvoker(
        ListAttributesRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listAttributes, hcClient);
    }

    /**
     * 修改自定义属性接口
     *
     * 修改自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAttributeRequest 请求对象
     * @return CompletableFuture<UpdateAttributeResponse>
     */
    public CompletableFuture<UpdateAttributeResponse> updateAttributeAsync(UpdateAttributeRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.updateAttribute);
    }

    /**
     * 修改自定义属性接口
     *
     * 修改自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAttributeRequest 请求对象
     * @return AsyncInvoker<UpdateAttributeRequest, UpdateAttributeResponse>
     */
    public AsyncInvoker<UpdateAttributeRequest, UpdateAttributeResponse> updateAttributeAsyncInvoker(
        UpdateAttributeRequest request) {
        return new AsyncInvoker<>(request, GslMeta.updateAttribute, hcClient);
    }

    /**
     * 查询后向流量池成员列表
     *
     * 查询后向流量池成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackPoolMembersRequest 请求对象
     * @return CompletableFuture<ListBackPoolMembersResponse>
     */
    public CompletableFuture<ListBackPoolMembersResponse> listBackPoolMembersAsync(ListBackPoolMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listBackPoolMembers);
    }

    /**
     * 查询后向流量池成员列表
     *
     * 查询后向流量池成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackPoolMembersRequest 请求对象
     * @return AsyncInvoker<ListBackPoolMembersRequest, ListBackPoolMembersResponse>
     */
    public AsyncInvoker<ListBackPoolMembersRequest, ListBackPoolMembersResponse> listBackPoolMembersAsyncInvoker(
        ListBackPoolMembersRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listBackPoolMembers, hcClient);
    }

    /**
     * 查询后向流量池列表
     *
     * 查询后向流量池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackPoolsRequest 请求对象
     * @return CompletableFuture<ListBackPoolsResponse>
     */
    public CompletableFuture<ListBackPoolsResponse> listBackPoolsAsync(ListBackPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listBackPools);
    }

    /**
     * 查询后向流量池列表
     *
     * 查询后向流量池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackPoolsRequest 请求对象
     * @return AsyncInvoker<ListBackPoolsRequest, ListBackPoolsResponse>
     */
    public AsyncInvoker<ListBackPoolsRequest, ListBackPoolsResponse> listBackPoolsAsyncInvoker(
        ListBackPoolsRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listBackPools, hcClient);
    }

    /**
     * 新增网络切换策略
     *
     * 新增网络切换策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddNetworkSwitchPolicyRequest 请求对象
     * @return CompletableFuture<AddNetworkSwitchPolicyResponse>
     */
    public CompletableFuture<AddNetworkSwitchPolicyResponse> addNetworkSwitchPolicyAsync(
        AddNetworkSwitchPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.addNetworkSwitchPolicy);
    }

    /**
     * 新增网络切换策略
     *
     * 新增网络切换策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddNetworkSwitchPolicyRequest 请求对象
     * @return AsyncInvoker<AddNetworkSwitchPolicyRequest, AddNetworkSwitchPolicyResponse>
     */
    public AsyncInvoker<AddNetworkSwitchPolicyRequest, AddNetworkSwitchPolicyResponse> addNetworkSwitchPolicyAsyncInvoker(
        AddNetworkSwitchPolicyRequest request) {
        return new AsyncInvoker<>(request, GslMeta.addNetworkSwitchPolicy, hcClient);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkSwitchPoliciesRequest 请求对象
     * @return CompletableFuture<ListNetworkSwitchPoliciesResponse>
     */
    public CompletableFuture<ListNetworkSwitchPoliciesResponse> listNetworkSwitchPoliciesAsync(
        ListNetworkSwitchPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listNetworkSwitchPolicies);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkSwitchPoliciesRequest 请求对象
     * @return AsyncInvoker<ListNetworkSwitchPoliciesRequest, ListNetworkSwitchPoliciesResponse>
     */
    public AsyncInvoker<ListNetworkSwitchPoliciesRequest, ListNetworkSwitchPoliciesResponse> listNetworkSwitchPoliciesAsyncInvoker(
        ListNetworkSwitchPoliciesRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listNetworkSwitchPolicies, hcClient);
    }

    /**
     * 查询套餐列表信息
     *
     * 查询套餐列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProPricePlansRequest 请求对象
     * @return CompletableFuture<ListProPricePlansResponse>
     */
    public CompletableFuture<ListProPricePlansResponse> listProPricePlansAsync(ListProPricePlansRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listProPricePlans);
    }

    /**
     * 查询套餐列表信息
     *
     * 查询套餐列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProPricePlansRequest 请求对象
     * @return AsyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse>
     */
    public AsyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse> listProPricePlansAsyncInvoker(
        ListProPricePlansRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listProPricePlans, hcClient);
    }

    /**
     * 清除实名认证信息
     *
     * 清除实名认证信息，接口仅支持中国电信卡调用。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRealNameRequest 请求对象
     * @return CompletableFuture<DeleteRealNameResponse>
     */
    public CompletableFuture<DeleteRealNameResponse> deleteRealNameAsync(DeleteRealNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.deleteRealName);
    }

    /**
     * 清除实名认证信息
     *
     * 清除实名认证信息，接口仅支持中国电信卡调用。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRealNameRequest 请求对象
     * @return AsyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse>
     */
    public AsyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse> deleteRealNameAsyncInvoker(
        DeleteRealNameRequest request) {
        return new AsyncInvoker<>(request, GslMeta.deleteRealName, hcClient);
    }

    /**
     * 激活实体卡
     *
     * 创建激活实体卡申请，返回业务受理单号。1~2个工作日完成激活操作。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableSimCardRequest 请求对象
     * @return CompletableFuture<EnableSimCardResponse>
     */
    public CompletableFuture<EnableSimCardResponse> enableSimCardAsync(EnableSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.enableSimCard);
    }

    /**
     * 激活实体卡
     *
     * 创建激活实体卡申请，返回业务受理单号。1~2个工作日完成激活操作。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableSimCardRequest 请求对象
     * @return AsyncInvoker<EnableSimCardRequest, EnableSimCardResponse>
     */
    public AsyncInvoker<EnableSimCardRequest, EnableSimCardResponse> enableSimCardAsyncInvoker(
        EnableSimCardRequest request) {
        return new AsyncInvoker<>(request, GslMeta.enableSimCard, hcClient);
    }

    /**
     * 查询SIM卡列表
     *
     * 查询SIM卡列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimCardsRequest 请求对象
     * @return CompletableFuture<ListSimCardsResponse>
     */
    public CompletableFuture<ListSimCardsResponse> listSimCardsAsync(ListSimCardsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSimCards);
    }

    /**
     * 查询SIM卡列表
     *
     * 查询SIM卡列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimCardsRequest 请求对象
     * @return AsyncInvoker<ListSimCardsRequest, ListSimCardsResponse>
     */
    public AsyncInvoker<ListSimCardsRequest, ListSimCardsResponse> listSimCardsAsyncInvoker(
        ListSimCardsRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listSimCards, hcClient);
    }

    /**
     * SIM卡机卡重绑
     *
     * 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，接口仅支持中国电信卡，中国移动卡调用。中国电信卡单卡每月只允许重绑2次，中国移动卡仅支持普通机卡重绑。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterImeiRequest 请求对象
     * @return CompletableFuture<RegisterImeiResponse>
     */
    public CompletableFuture<RegisterImeiResponse> registerImeiAsync(RegisterImeiRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.registerImei);
    }

    /**
     * SIM卡机卡重绑
     *
     * 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，接口仅支持中国电信卡，中国移动卡调用。中国电信卡单卡每月只允许重绑2次，中国移动卡仅支持普通机卡重绑。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterImeiRequest 请求对象
     * @return AsyncInvoker<RegisterImeiRequest, RegisterImeiResponse>
     */
    public AsyncInvoker<RegisterImeiRequest, RegisterImeiResponse> registerImeiAsyncInvoker(
        RegisterImeiRequest request) {
        return new AsyncInvoker<>(request, GslMeta.registerImei, hcClient);
    }

    /**
     * SIM卡单卡复机
     *
     * 创建复机申请，返回业务受理单号。1~2个工作日完成复机操作。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetSimCardRequest 请求对象
     * @return CompletableFuture<ResetSimCardResponse>
     */
    public CompletableFuture<ResetSimCardResponse> resetSimCardAsync(ResetSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.resetSimCard);
    }

    /**
     * SIM卡单卡复机
     *
     * 创建复机申请，返回业务受理单号。1~2个工作日完成复机操作。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetSimCardRequest 请求对象
     * @return AsyncInvoker<ResetSimCardRequest, ResetSimCardResponse>
     */
    public AsyncInvoker<ResetSimCardRequest, ResetSimCardResponse> resetSimCardAsyncInvoker(
        ResetSimCardRequest request) {
        return new AsyncInvoker<>(request, GslMeta.resetSimCard, hcClient);
    }

    /**
     * SIM卡达量断网/取消达量断网
     *
     * SIM卡达量断网/取消达量断网，接口仅支持中国电信的卡以及中国联通、中国移动的组池卡调用。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetExceedCutNetRequest 请求对象
     * @return CompletableFuture<SetExceedCutNetResponse>
     */
    public CompletableFuture<SetExceedCutNetResponse> setExceedCutNetAsync(SetExceedCutNetRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.setExceedCutNet);
    }

    /**
     * SIM卡达量断网/取消达量断网
     *
     * SIM卡达量断网/取消达量断网，接口仅支持中国电信的卡以及中国联通、中国移动的组池卡调用。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetExceedCutNetRequest 请求对象
     * @return AsyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse>
     */
    public AsyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse> setExceedCutNetAsyncInvoker(
        SetExceedCutNetRequest request) {
        return new AsyncInvoker<>(request, GslMeta.setExceedCutNet, hcClient);
    }

    /**
     * 实体卡限速
     *
     * 实体卡限速接口，接口仅支持中国电信和中国联通实体卡调用。中国联通卡需要个人实名认证后才能使用限速功能。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSpeedValueRequest 请求对象
     * @return CompletableFuture<SetSpeedValueResponse>
     */
    public CompletableFuture<SetSpeedValueResponse> setSpeedValueAsync(SetSpeedValueRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.setSpeedValue);
    }

    /**
     * 实体卡限速
     *
     * 实体卡限速接口，接口仅支持中国电信和中国联通实体卡调用。中国联通卡需要个人实名认证后才能使用限速功能。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSpeedValueRequest 请求对象
     * @return AsyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse>
     */
    public AsyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse> setSpeedValueAsyncInvoker(
        SetSpeedValueRequest request) {
        return new AsyncInvoker<>(request, GslMeta.setSpeedValue, hcClient);
    }

    /**
     * 月用量统计
     *
     * 设备月用量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthUsagesRequest 请求对象
     * @return CompletableFuture<ShowMonthUsagesResponse>
     */
    public CompletableFuture<ShowMonthUsagesResponse> showMonthUsagesAsync(ShowMonthUsagesRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.showMonthUsages);
    }

    /**
     * 月用量统计
     *
     * 设备月用量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthUsagesRequest 请求对象
     * @return AsyncInvoker<ShowMonthUsagesRequest, ShowMonthUsagesResponse>
     */
    public AsyncInvoker<ShowMonthUsagesRequest, ShowMonthUsagesResponse> showMonthUsagesAsyncInvoker(
        ShowMonthUsagesRequest request) {
        return new AsyncInvoker<>(request, GslMeta.showMonthUsages, hcClient);
    }

    /**
     * 查询SIM卡实名认证信息
     *
     * 实时查询SIM卡实名认证信息，接口仅支持查询中国大陆运营商卡片的实名认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRealNamedRequest 请求对象
     * @return CompletableFuture<ShowRealNamedResponse>
     */
    public CompletableFuture<ShowRealNamedResponse> showRealNamedAsync(ShowRealNamedRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.showRealNamed);
    }

    /**
     * 查询SIM卡实名认证信息
     *
     * 实时查询SIM卡实名认证信息，接口仅支持查询中国大陆运营商卡片的实名认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRealNamedRequest 请求对象
     * @return AsyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse>
     */
    public AsyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse> showRealNamedAsyncInvoker(
        ShowRealNamedRequest request) {
        return new AsyncInvoker<>(request, GslMeta.showRealNamed, hcClient);
    }

    /**
     * 查询SIM卡详情
     *
     * 查询SIM卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSimCardRequest 请求对象
     * @return CompletableFuture<ShowSimCardResponse>
     */
    public CompletableFuture<ShowSimCardResponse> showSimCardAsync(ShowSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.showSimCard);
    }

    /**
     * 查询SIM卡详情
     *
     * 查询SIM卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSimCardRequest 请求对象
     * @return AsyncInvoker<ShowSimCardRequest, ShowSimCardResponse>
     */
    public AsyncInvoker<ShowSimCardRequest, ShowSimCardResponse> showSimCardAsyncInvoker(ShowSimCardRequest request) {
        return new AsyncInvoker<>(request, GslMeta.showSimCard, hcClient);
    }

    /**
     * SIM卡申请断网/恢复在用
     *
     * SIM卡申请断网/恢复在用，接口仅支持中国电信卡调用。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartStopNetRequest 请求对象
     * @return CompletableFuture<StartStopNetResponse>
     */
    public CompletableFuture<StartStopNetResponse> startStopNetAsync(StartStopNetRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.startStopNet);
    }

    /**
     * SIM卡申请断网/恢复在用
     *
     * SIM卡申请断网/恢复在用，接口仅支持中国电信卡调用。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartStopNetRequest 请求对象
     * @return AsyncInvoker<StartStopNetRequest, StartStopNetResponse>
     */
    public AsyncInvoker<StartStopNetRequest, StartStopNetResponse> startStopNetAsyncInvoker(
        StartStopNetRequest request) {
        return new AsyncInvoker<>(request, GslMeta.startStopNet, hcClient);
    }

    /**
     * SIM卡单卡停机
     *
     * 创建停机申请，返回业务受理单号。1~2个工作日完成停机操作。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSimCardRequest 请求对象
     * @return CompletableFuture<StopSimCardResponse>
     */
    public CompletableFuture<StopSimCardResponse> stopSimCardAsync(StopSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.stopSimCard);
    }

    /**
     * SIM卡单卡停机
     *
     * 创建停机申请，返回业务受理单号。1~2个工作日完成停机操作。注：由于运营商侧业务限制，建议您同一张SIM卡不要同时执行多种不同业务的操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSimCardRequest 请求对象
     * @return AsyncInvoker<StopSimCardRequest, StopSimCardResponse>
     */
    public AsyncInvoker<StopSimCardRequest, StopSimCardResponse> stopSimCardAsyncInvoker(StopSimCardRequest request) {
        return new AsyncInvoker<>(request, GslMeta.stopSimCard, hcClient);
    }

    /**
     * 查询三网卡列表
     *
     * 通过cid或全量查询三网卡列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimDeviceMultiplyRequest 请求对象
     * @return CompletableFuture<ListSimDeviceMultiplyResponse>
     */
    public CompletableFuture<ListSimDeviceMultiplyResponse> listSimDeviceMultiplyAsync(
        ListSimDeviceMultiplyRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSimDeviceMultiply);
    }

    /**
     * 查询三网卡列表
     *
     * 通过cid或全量查询三网卡列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimDeviceMultiplyRequest 请求对象
     * @return AsyncInvoker<ListSimDeviceMultiplyRequest, ListSimDeviceMultiplyResponse>
     */
    public AsyncInvoker<ListSimDeviceMultiplyRequest, ListSimDeviceMultiplyResponse> listSimDeviceMultiplyAsyncInvoker(
        ListSimDeviceMultiplyRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listSimDeviceMultiply, hcClient);
    }

    /**
     * SIM卡设置网络切换策略
     *
     * SIM卡设置网络切换策略，接口仅支持三网卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetNetworkSwitchPolicyRequest 请求对象
     * @return CompletableFuture<SetNetworkSwitchPolicyResponse>
     */
    public CompletableFuture<SetNetworkSwitchPolicyResponse> setNetworkSwitchPolicyAsync(
        SetNetworkSwitchPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.setNetworkSwitchPolicy);
    }

    /**
     * SIM卡设置网络切换策略
     *
     * SIM卡设置网络切换策略，接口仅支持三网卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetNetworkSwitchPolicyRequest 请求对象
     * @return AsyncInvoker<SetNetworkSwitchPolicyRequest, SetNetworkSwitchPolicyResponse>
     */
    public AsyncInvoker<SetNetworkSwitchPolicyRequest, SetNetworkSwitchPolicyResponse> setNetworkSwitchPolicyAsyncInvoker(
        SetNetworkSwitchPolicyRequest request) {
        return new AsyncInvoker<>(request, GslMeta.setNetworkSwitchPolicy, hcClient);
    }

    /**
     * 切换网络
     *
     * 切换网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchNetworkRequest 请求对象
     * @return CompletableFuture<SwitchNetworkResponse>
     */
    public CompletableFuture<SwitchNetworkResponse> switchNetworkAsync(SwitchNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.switchNetwork);
    }

    /**
     * 切换网络
     *
     * 切换网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchNetworkRequest 请求对象
     * @return AsyncInvoker<SwitchNetworkRequest, SwitchNetworkResponse>
     */
    public AsyncInvoker<SwitchNetworkRequest, SwitchNetworkResponse> switchNetworkAsyncInvoker(
        SwitchNetworkRequest request) {
        return new AsyncInvoker<>(request, GslMeta.switchNetwork, hcClient);
    }

    /**
     * 查询流量池成员列表
     *
     * 查询流量池成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPoolMembersRequest 请求对象
     * @return CompletableFuture<ListSimPoolMembersResponse>
     */
    public CompletableFuture<ListSimPoolMembersResponse> listSimPoolMembersAsync(ListSimPoolMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSimPoolMembers);
    }

    /**
     * 查询流量池成员列表
     *
     * 查询流量池成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPoolMembersRequest 请求对象
     * @return AsyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse>
     */
    public AsyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse> listSimPoolMembersAsyncInvoker(
        ListSimPoolMembersRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listSimPoolMembers, hcClient);
    }

    /**
     * 查询流量池列表
     *
     * 查询流量池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPoolsRequest 请求对象
     * @return CompletableFuture<ListSimPoolsResponse>
     */
    public CompletableFuture<ListSimPoolsResponse> listSimPoolsAsync(ListSimPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSimPools);
    }

    /**
     * 查询流量池列表
     *
     * 查询流量池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPoolsRequest 请求对象
     * @return AsyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse>
     */
    public AsyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse> listSimPoolsAsyncInvoker(
        ListSimPoolsRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listSimPools, hcClient);
    }

    /**
     * 批量查询实体卡流量
     *
     * 批量查询实体卡流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowBySimCardsRequest 请求对象
     * @return CompletableFuture<ListFlowBySimCardsResponse>
     */
    public CompletableFuture<ListFlowBySimCardsResponse> listFlowBySimCardsAsync(ListFlowBySimCardsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listFlowBySimCards);
    }

    /**
     * 批量查询实体卡流量
     *
     * 批量查询实体卡流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowBySimCardsRequest 请求对象
     * @return AsyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse>
     */
    public AsyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> listFlowBySimCardsAsyncInvoker(
        ListFlowBySimCardsRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listFlowBySimCards, hcClient);
    }

    /**
     * sim卡套餐列表查询
     *
     * SIM卡套餐列表查询，实体卡只会有一个套餐，eSIM/vSIM可能会有多个套餐
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPricePlansRequest 请求对象
     * @return CompletableFuture<ListSimPricePlansResponse>
     */
    public CompletableFuture<ListSimPricePlansResponse> listSimPricePlansAsync(ListSimPricePlansRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSimPricePlans);
    }

    /**
     * sim卡套餐列表查询
     *
     * SIM卡套餐列表查询，实体卡只会有一个套餐，eSIM/vSIM可能会有多个套餐
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPricePlansRequest 请求对象
     * @return AsyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse>
     */
    public AsyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse> listSimPricePlansAsyncInvoker(
        ListSimPricePlansRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listSimPricePlans, hcClient);
    }

    /**
     * 短信发送详情
     *
     * 短信发送详情，接口仅支持开通短信套餐的中国移动与中国电信卡调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmsDetailsRequest 请求对象
     * @return CompletableFuture<ListSmsDetailsResponse>
     */
    public CompletableFuture<ListSmsDetailsResponse> listSmsDetailsAsync(ListSmsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSmsDetails);
    }

    /**
     * 短信发送详情
     *
     * 短信发送详情，接口仅支持开通短信套餐的中国移动与中国电信卡调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmsDetailsRequest 请求对象
     * @return AsyncInvoker<ListSmsDetailsRequest, ListSmsDetailsResponse>
     */
    public AsyncInvoker<ListSmsDetailsRequest, ListSmsDetailsResponse> listSmsDetailsAsyncInvoker(
        ListSmsDetailsRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listSmsDetails, hcClient);
    }

    /**
     * 发送短信
     *
     * 发送短信，接口仅支持开通短信套餐的中国移动与中国电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSmsRequest 请求对象
     * @return CompletableFuture<SendSmsResponse>
     */
    public CompletableFuture<SendSmsResponse> sendSmsAsync(SendSmsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.sendSms);
    }

    /**
     * 发送短信
     *
     * 发送短信，接口仅支持开通短信套餐的中国移动与中国电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSmsRequest 请求对象
     * @return AsyncInvoker<SendSmsRequest, SendSmsResponse>
     */
    public AsyncInvoker<SendSmsRequest, SendSmsResponse> sendSmsAsyncInvoker(SendSmsRequest request) {
        return new AsyncInvoker<>(request, GslMeta.sendSms, hcClient);
    }

    /**
     * 批量设置/取消设置标签接口
     *
     * 批量设置/取消设置标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetTagsRequest 请求对象
     * @return CompletableFuture<BatchSetTagsResponse>
     */
    public CompletableFuture<BatchSetTagsResponse> batchSetTagsAsync(BatchSetTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.batchSetTags);
    }

    /**
     * 批量设置/取消设置标签接口
     *
     * 批量设置/取消设置标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetTagsRequest 请求对象
     * @return AsyncInvoker<BatchSetTagsRequest, BatchSetTagsResponse>
     */
    public AsyncInvoker<BatchSetTagsRequest, BatchSetTagsResponse> batchSetTagsAsyncInvoker(
        BatchSetTagsRequest request) {
        return new AsyncInvoker<>(request, GslMeta.batchSetTags, hcClient);
    }

    /**
     * 用户添加标签
     *
     * 添加标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.createTag);
    }

    /**
     * 用户添加标签
     *
     * 添加标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<>(request, GslMeta.createTag, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.deleteTag);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<>(request, GslMeta.deleteTag, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listTags);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listTags, hcClient);
    }

    /**
     * 分页查询业务受理明细
     *
     * 分页查询业务受理明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkOrderDetailsRequest 请求对象
     * @return CompletableFuture<ListWorkOrderDetailsResponse>
     */
    public CompletableFuture<ListWorkOrderDetailsResponse> listWorkOrderDetailsAsync(
        ListWorkOrderDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listWorkOrderDetails);
    }

    /**
     * 分页查询业务受理明细
     *
     * 分页查询业务受理明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkOrderDetailsRequest 请求对象
     * @return AsyncInvoker<ListWorkOrderDetailsRequest, ListWorkOrderDetailsResponse>
     */
    public AsyncInvoker<ListWorkOrderDetailsRequest, ListWorkOrderDetailsResponse> listWorkOrderDetailsAsyncInvoker(
        ListWorkOrderDetailsRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listWorkOrderDetails, hcClient);
    }

    /**
     * 分页查询业务受理单
     *
     * 分页查询业务受理单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkOrdersRequest 请求对象
     * @return CompletableFuture<ListWorkOrdersResponse>
     */
    public CompletableFuture<ListWorkOrdersResponse> listWorkOrdersAsync(ListWorkOrdersRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listWorkOrders);
    }

    /**
     * 分页查询业务受理单
     *
     * 分页查询业务受理单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkOrdersRequest 请求对象
     * @return AsyncInvoker<ListWorkOrdersRequest, ListWorkOrdersResponse>
     */
    public AsyncInvoker<ListWorkOrdersRequest, ListWorkOrdersResponse> listWorkOrdersAsyncInvoker(
        ListWorkOrdersRequest request) {
        return new AsyncInvoker<>(request, GslMeta.listWorkOrders, hcClient);
    }

}
