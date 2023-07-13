package com.huaweicloud.sdk.gsl.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gsl.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class GslAsyncClient {

    protected HcClient hcClient;

    public GslAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GslAsyncClient> newBuilder() {
        return new ClientBuilder<>(GslAsyncClient::new);
    }

    /**
     * 查询后向流量池成员列表
     *
     * 查询后向流量池成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackPoolMembersRequest 请求对象
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
     * @param ListBackPoolMembersRequest 请求对象
     * @return AsyncInvoker<ListBackPoolMembersRequest, ListBackPoolMembersResponse>
     */
    public AsyncInvoker<ListBackPoolMembersRequest, ListBackPoolMembersResponse> listBackPoolMembersAsyncInvoker(
        ListBackPoolMembersRequest request) {
        return new AsyncInvoker<ListBackPoolMembersRequest, ListBackPoolMembersResponse>(request,
            GslMeta.listBackPoolMembers, hcClient);
    }

    /**
     * 查询后向流量池列表
     *
     * 查询后向流量池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackPoolsRequest 请求对象
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
     * @param ListBackPoolsRequest 请求对象
     * @return AsyncInvoker<ListBackPoolsRequest, ListBackPoolsResponse>
     */
    public AsyncInvoker<ListBackPoolsRequest, ListBackPoolsResponse> listBackPoolsAsyncInvoker(
        ListBackPoolsRequest request) {
        return new AsyncInvoker<ListBackPoolsRequest, ListBackPoolsResponse>(request, GslMeta.listBackPools, hcClient);
    }

    /**
     * 查询套餐列表信息
     *
     * 查询套餐列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProPricePlansRequest 请求对象
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
     * @param ListProPricePlansRequest 请求对象
     * @return AsyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse>
     */
    public AsyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse> listProPricePlansAsyncInvoker(
        ListProPricePlansRequest request) {
        return new AsyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse>(request, GslMeta.listProPricePlans,
            hcClient);
    }

    /**
     * 批量设置自定义属性接口
     *
     * 批量设置自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchSetAttributesRequest 请求对象
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
     * @param BatchSetAttributesRequest 请求对象
     * @return AsyncInvoker<BatchSetAttributesRequest, BatchSetAttributesResponse>
     */
    public AsyncInvoker<BatchSetAttributesRequest, BatchSetAttributesResponse> batchSetAttributesAsyncInvoker(
        BatchSetAttributesRequest request) {
        return new AsyncInvoker<BatchSetAttributesRequest, BatchSetAttributesResponse>(request,
            GslMeta.batchSetAttributes, hcClient);
    }

    /**
     * 用户新增自定义属性接口
     *
     * 用户新增自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAttributeRequest 请求对象
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
     * @param CreateAttributeRequest 请求对象
     * @return AsyncInvoker<CreateAttributeRequest, CreateAttributeResponse>
     */
    public AsyncInvoker<CreateAttributeRequest, CreateAttributeResponse> createAttributeAsyncInvoker(
        CreateAttributeRequest request) {
        return new AsyncInvoker<CreateAttributeRequest, CreateAttributeResponse>(request, GslMeta.createAttribute,
            hcClient);
    }

    /**
     * 停用自定义属性接口
     *
     * 停用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableAttributeRequest 请求对象
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
     * @param DisableAttributeRequest 请求对象
     * @return AsyncInvoker<DisableAttributeRequest, DisableAttributeResponse>
     */
    public AsyncInvoker<DisableAttributeRequest, DisableAttributeResponse> disableAttributeAsyncInvoker(
        DisableAttributeRequest request) {
        return new AsyncInvoker<DisableAttributeRequest, DisableAttributeResponse>(request, GslMeta.disableAttribute,
            hcClient);
    }

    /**
     * 启用自定义属性接口
     *
     * 启用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableAttributeRequest 请求对象
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
     * @param EnableAttributeRequest 请求对象
     * @return AsyncInvoker<EnableAttributeRequest, EnableAttributeResponse>
     */
    public AsyncInvoker<EnableAttributeRequest, EnableAttributeResponse> enableAttributeAsyncInvoker(
        EnableAttributeRequest request) {
        return new AsyncInvoker<EnableAttributeRequest, EnableAttributeResponse>(request, GslMeta.enableAttribute,
            hcClient);
    }

    /**
     * 查询自定义属性列表接口
     *
     * 查询自定义属性列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAttributesRequest 请求对象
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
     * @param ListAttributesRequest 请求对象
     * @return AsyncInvoker<ListAttributesRequest, ListAttributesResponse>
     */
    public AsyncInvoker<ListAttributesRequest, ListAttributesResponse> listAttributesAsyncInvoker(
        ListAttributesRequest request) {
        return new AsyncInvoker<ListAttributesRequest, ListAttributesResponse>(request, GslMeta.listAttributes,
            hcClient);
    }

    /**
     * 修改自定义属性接口
     *
     * 修改自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAttributeRequest 请求对象
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
     * @param UpdateAttributeRequest 请求对象
     * @return AsyncInvoker<UpdateAttributeRequest, UpdateAttributeResponse>
     */
    public AsyncInvoker<UpdateAttributeRequest, UpdateAttributeResponse> updateAttributeAsyncInvoker(
        UpdateAttributeRequest request) {
        return new AsyncInvoker<UpdateAttributeRequest, UpdateAttributeResponse>(request, GslMeta.updateAttribute,
            hcClient);
    }

    /**
     * 清除实名认证信息
     *
     * 清除实名认证信息，接口只支持电信卡调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRealNameRequest 请求对象
     * @return CompletableFuture<DeleteRealNameResponse>
     */
    public CompletableFuture<DeleteRealNameResponse> deleteRealNameAsync(DeleteRealNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.deleteRealName);
    }

    /**
     * 清除实名认证信息
     *
     * 清除实名认证信息，接口只支持电信卡调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRealNameRequest 请求对象
     * @return AsyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse>
     */
    public AsyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse> deleteRealNameAsyncInvoker(
        DeleteRealNameRequest request) {
        return new AsyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse>(request, GslMeta.deleteRealName,
            hcClient);
    }

    /**
     * 激活实体卡
     *
     * 创建激活实体卡申请，返回业务受理单号。1~2个工作日完成激活操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableSimCardRequest 请求对象
     * @return CompletableFuture<EnableSimCardResponse>
     */
    public CompletableFuture<EnableSimCardResponse> enableSimCardAsync(EnableSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.enableSimCard);
    }

    /**
     * 激活实体卡
     *
     * 创建激活实体卡申请，返回业务受理单号。1~2个工作日完成激活操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableSimCardRequest 请求对象
     * @return AsyncInvoker<EnableSimCardRequest, EnableSimCardResponse>
     */
    public AsyncInvoker<EnableSimCardRequest, EnableSimCardResponse> enableSimCardAsyncInvoker(
        EnableSimCardRequest request) {
        return new AsyncInvoker<EnableSimCardRequest, EnableSimCardResponse>(request, GslMeta.enableSimCard, hcClient);
    }

    /**
     * 查询SIM卡列表
     *
     * 查询SIM卡列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSimCardsRequest 请求对象
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
     * @param ListSimCardsRequest 请求对象
     * @return AsyncInvoker<ListSimCardsRequest, ListSimCardsResponse>
     */
    public AsyncInvoker<ListSimCardsRequest, ListSimCardsResponse> listSimCardsAsyncInvoker(
        ListSimCardsRequest request) {
        return new AsyncInvoker<ListSimCardsRequest, ListSimCardsResponse>(request, GslMeta.listSimCards, hcClient);
    }

    /**
     * SIM卡机卡重绑
     *
     * 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，单卡每月只允许重绑2次，接口只支持电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterImeiRequest 请求对象
     * @return CompletableFuture<RegisterImeiResponse>
     */
    public CompletableFuture<RegisterImeiResponse> registerImeiAsync(RegisterImeiRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.registerImei);
    }

    /**
     * SIM卡机卡重绑
     *
     * 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，单卡每月只允许重绑2次，接口只支持电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterImeiRequest 请求对象
     * @return AsyncInvoker<RegisterImeiRequest, RegisterImeiResponse>
     */
    public AsyncInvoker<RegisterImeiRequest, RegisterImeiResponse> registerImeiAsyncInvoker(
        RegisterImeiRequest request) {
        return new AsyncInvoker<RegisterImeiRequest, RegisterImeiResponse>(request, GslMeta.registerImei, hcClient);
    }

    /**
     * SIM卡单卡复机
     *
     * 创建复机申请，返回业务受理单号。1~2个工作日完成复机操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetSimCardRequest 请求对象
     * @return CompletableFuture<ResetSimCardResponse>
     */
    public CompletableFuture<ResetSimCardResponse> resetSimCardAsync(ResetSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.resetSimCard);
    }

    /**
     * SIM卡单卡复机
     *
     * 创建复机申请，返回业务受理单号。1~2个工作日完成复机操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetSimCardRequest 请求对象
     * @return AsyncInvoker<ResetSimCardRequest, ResetSimCardResponse>
     */
    public AsyncInvoker<ResetSimCardRequest, ResetSimCardResponse> resetSimCardAsyncInvoker(
        ResetSimCardRequest request) {
        return new AsyncInvoker<ResetSimCardRequest, ResetSimCardResponse>(request, GslMeta.resetSimCard, hcClient);
    }

    /**
     * SIM卡达量断网/恢复在用
     *
     * SIM卡达量断网/恢复在用,只支持电信卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetExceedCutNetRequest 请求对象
     * @return CompletableFuture<SetExceedCutNetResponse>
     */
    public CompletableFuture<SetExceedCutNetResponse> setExceedCutNetAsync(SetExceedCutNetRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.setExceedCutNet);
    }

    /**
     * SIM卡达量断网/恢复在用
     *
     * SIM卡达量断网/恢复在用,只支持电信卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetExceedCutNetRequest 请求对象
     * @return AsyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse>
     */
    public AsyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse> setExceedCutNetAsyncInvoker(
        SetExceedCutNetRequest request) {
        return new AsyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse>(request, GslMeta.setExceedCutNet,
            hcClient);
    }

    /**
     * 实体卡限速
     *
     * 实体卡限速接口,支持电信和联通实体卡调用。联通卡需要个人实名认证后才能使用限速功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSpeedValueRequest 请求对象
     * @return CompletableFuture<SetSpeedValueResponse>
     */
    public CompletableFuture<SetSpeedValueResponse> setSpeedValueAsync(SetSpeedValueRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.setSpeedValue);
    }

    /**
     * 实体卡限速
     *
     * 实体卡限速接口,支持电信和联通实体卡调用。联通卡需要个人实名认证后才能使用限速功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSpeedValueRequest 请求对象
     * @return AsyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse>
     */
    public AsyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse> setSpeedValueAsyncInvoker(
        SetSpeedValueRequest request) {
        return new AsyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse>(request, GslMeta.setSpeedValue, hcClient);
    }

    /**
     * 月用量统计
     *
     * 设备月用量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMonthUsagesRequest 请求对象
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
     * @param ShowMonthUsagesRequest 请求对象
     * @return AsyncInvoker<ShowMonthUsagesRequest, ShowMonthUsagesResponse>
     */
    public AsyncInvoker<ShowMonthUsagesRequest, ShowMonthUsagesResponse> showMonthUsagesAsyncInvoker(
        ShowMonthUsagesRequest request) {
        return new AsyncInvoker<ShowMonthUsagesRequest, ShowMonthUsagesResponse>(request, GslMeta.showMonthUsages,
            hcClient);
    }

    /**
     * 查询SIM卡实名认证信息
     *
     * 实时查询SIM卡实名认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRealNamedRequest 请求对象
     * @return CompletableFuture<ShowRealNamedResponse>
     */
    public CompletableFuture<ShowRealNamedResponse> showRealNamedAsync(ShowRealNamedRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.showRealNamed);
    }

    /**
     * 查询SIM卡实名认证信息
     *
     * 实时查询SIM卡实名认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRealNamedRequest 请求对象
     * @return AsyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse>
     */
    public AsyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse> showRealNamedAsyncInvoker(
        ShowRealNamedRequest request) {
        return new AsyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse>(request, GslMeta.showRealNamed, hcClient);
    }

    /**
     * 查询SIM卡详情
     *
     * 查询SIM卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSimCardRequest 请求对象
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
     * @param ShowSimCardRequest 请求对象
     * @return AsyncInvoker<ShowSimCardRequest, ShowSimCardResponse>
     */
    public AsyncInvoker<ShowSimCardRequest, ShowSimCardResponse> showSimCardAsyncInvoker(ShowSimCardRequest request) {
        return new AsyncInvoker<ShowSimCardRequest, ShowSimCardResponse>(request, GslMeta.showSimCard, hcClient);
    }

    /**
     * SIM卡申请断网/恢复在用
     *
     * SIM卡申请断网/恢复在用,只支持电信卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartStopNetRequest 请求对象
     * @return CompletableFuture<StartStopNetResponse>
     */
    public CompletableFuture<StartStopNetResponse> startStopNetAsync(StartStopNetRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.startStopNet);
    }

    /**
     * SIM卡申请断网/恢复在用
     *
     * SIM卡申请断网/恢复在用,只支持电信卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartStopNetRequest 请求对象
     * @return AsyncInvoker<StartStopNetRequest, StartStopNetResponse>
     */
    public AsyncInvoker<StartStopNetRequest, StartStopNetResponse> startStopNetAsyncInvoker(
        StartStopNetRequest request) {
        return new AsyncInvoker<StartStopNetRequest, StartStopNetResponse>(request, GslMeta.startStopNet, hcClient);
    }

    /**
     * SIM卡单卡停机
     *
     * 创建停机申请，返回业务受理单号。1~2个工作日完成停机操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSimCardRequest 请求对象
     * @return CompletableFuture<StopSimCardResponse>
     */
    public CompletableFuture<StopSimCardResponse> stopSimCardAsync(StopSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.stopSimCard);
    }

    /**
     * SIM卡单卡停机
     *
     * 创建停机申请，返回业务受理单号。1~2个工作日完成停机操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSimCardRequest 请求对象
     * @return AsyncInvoker<StopSimCardRequest, StopSimCardResponse>
     */
    public AsyncInvoker<StopSimCardRequest, StopSimCardResponse> stopSimCardAsyncInvoker(StopSimCardRequest request) {
        return new AsyncInvoker<StopSimCardRequest, StopSimCardResponse>(request, GslMeta.stopSimCard, hcClient);
    }

    /**
     * 查询流量池成员列表
     *
     * 查询流量池成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSimPoolMembersRequest 请求对象
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
     * @param ListSimPoolMembersRequest 请求对象
     * @return AsyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse>
     */
    public AsyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse> listSimPoolMembersAsyncInvoker(
        ListSimPoolMembersRequest request) {
        return new AsyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse>(request,
            GslMeta.listSimPoolMembers, hcClient);
    }

    /**
     * 查询流量池列表
     *
     * 查询流量池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSimPoolsRequest 请求对象
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
     * @param ListSimPoolsRequest 请求对象
     * @return AsyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse>
     */
    public AsyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse> listSimPoolsAsyncInvoker(
        ListSimPoolsRequest request) {
        return new AsyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse>(request, GslMeta.listSimPools, hcClient);
    }

    /**
     * 批量查询实体卡流量
     *
     * 批量查询实体卡流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlowBySimCardsRequest 请求对象
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
     * @param ListFlowBySimCardsRequest 请求对象
     * @return AsyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse>
     */
    public AsyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> listFlowBySimCardsAsyncInvoker(
        ListFlowBySimCardsRequest request) {
        return new AsyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse>(request,
            GslMeta.listFlowBySimCards, hcClient);
    }

    /**
     * sim卡套餐列表查询
     *
     * SIM卡套餐列表查询，实体卡只会有一个套餐，eSIM/vSIM可能会有多个套餐
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSimPricePlansRequest 请求对象
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
     * @param ListSimPricePlansRequest 请求对象
     * @return AsyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse>
     */
    public AsyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse> listSimPricePlansAsyncInvoker(
        ListSimPricePlansRequest request) {
        return new AsyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse>(request, GslMeta.listSimPricePlans,
            hcClient);
    }

    /**
     * 批量设置/取消设置标签接口
     *
     * 批量设置/取消设置标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchSetTagsRequest 请求对象
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
     * @param BatchSetTagsRequest 请求对象
     * @return AsyncInvoker<BatchSetTagsRequest, BatchSetTagsResponse>
     */
    public AsyncInvoker<BatchSetTagsRequest, BatchSetTagsResponse> batchSetTagsAsyncInvoker(
        BatchSetTagsRequest request) {
        return new AsyncInvoker<BatchSetTagsRequest, BatchSetTagsResponse>(request, GslMeta.batchSetTags, hcClient);
    }

    /**
     * 用户添加标签
     *
     * 添加标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
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
     * @param CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<CreateTagRequest, CreateTagResponse>(request, GslMeta.createTag, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
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
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, GslMeta.deleteTag, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
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
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, GslMeta.listTags, hcClient);
    }

    /**
     * 短信发送详情
     *
     * 短信发送详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSmsDetailsRequest 请求对象
     * @return CompletableFuture<ListSmsDetailsResponse>
     */
    public CompletableFuture<ListSmsDetailsResponse> listSmsDetailsAsync(ListSmsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSmsDetails);
    }

    /**
     * 短信发送详情
     *
     * 短信发送详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSmsDetailsRequest 请求对象
     * @return AsyncInvoker<ListSmsDetailsRequest, ListSmsDetailsResponse>
     */
    public AsyncInvoker<ListSmsDetailsRequest, ListSmsDetailsResponse> listSmsDetailsAsyncInvoker(
        ListSmsDetailsRequest request) {
        return new AsyncInvoker<ListSmsDetailsRequest, ListSmsDetailsResponse>(request, GslMeta.listSmsDetails,
            hcClient);
    }

    /**
     * 发送短信
     *
     * 发送短信
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendSmsRequest 请求对象
     * @return CompletableFuture<SendSmsResponse>
     */
    public CompletableFuture<SendSmsResponse> sendSmsAsync(SendSmsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.sendSms);
    }

    /**
     * 发送短信
     *
     * 发送短信
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SendSmsRequest 请求对象
     * @return AsyncInvoker<SendSmsRequest, SendSmsResponse>
     */
    public AsyncInvoker<SendSmsRequest, SendSmsResponse> sendSmsAsyncInvoker(SendSmsRequest request) {
        return new AsyncInvoker<SendSmsRequest, SendSmsResponse>(request, GslMeta.sendSms, hcClient);
    }

}
