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

    /** 查询套餐列表信息 查询套餐列表信息
     *
     * @param ListProPricePlansRequest 请求对象
     * @return CompletableFuture<ListProPricePlansResponse> */
    public CompletableFuture<ListProPricePlansResponse> listProPricePlansAsync(ListProPricePlansRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listProPricePlans);
    }

    /** 查询套餐列表信息 查询套餐列表信息
     *
     * @param ListProPricePlansRequest 请求对象
     * @return AsyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse> */
    public AsyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse> listProPricePlansAsyncInvoker(
        ListProPricePlansRequest request) {
        return new AsyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse>(request, GslMeta.listProPricePlans,
            hcClient);
    }

    /** 清除实名认证信息 清除实名认证信息，接口只支持电信卡调用
     *
     * @param DeleteRealNameRequest 请求对象
     * @return CompletableFuture<DeleteRealNameResponse> */
    public CompletableFuture<DeleteRealNameResponse> deleteRealNameAsync(DeleteRealNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.deleteRealName);
    }

    /** 清除实名认证信息 清除实名认证信息，接口只支持电信卡调用
     *
     * @param DeleteRealNameRequest 请求对象
     * @return AsyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse> */
    public AsyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse> deleteRealNameAsyncInvoker(
        DeleteRealNameRequest request) {
        return new AsyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse>(request, GslMeta.deleteRealName,
            hcClient);
    }

    /** 激活实体卡 创建激活实体卡申请，返回业务受理单号。1~2个工作日完成激活操作。
     *
     * @param EnableSimCardRequest 请求对象
     * @return CompletableFuture<EnableSimCardResponse> */
    public CompletableFuture<EnableSimCardResponse> enableSimCardAsync(EnableSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.enableSimCard);
    }

    /** 激活实体卡 创建激活实体卡申请，返回业务受理单号。1~2个工作日完成激活操作。
     *
     * @param EnableSimCardRequest 请求对象
     * @return AsyncInvoker<EnableSimCardRequest, EnableSimCardResponse> */
    public AsyncInvoker<EnableSimCardRequest, EnableSimCardResponse> enableSimCardAsyncInvoker(
        EnableSimCardRequest request) {
        return new AsyncInvoker<EnableSimCardRequest, EnableSimCardResponse>(request, GslMeta.enableSimCard, hcClient);
    }

    /** 查询SIM卡列表 查询SIM卡列表
     *
     * @param ListSimCardsRequest 请求对象
     * @return CompletableFuture<ListSimCardsResponse> */
    public CompletableFuture<ListSimCardsResponse> listSimCardsAsync(ListSimCardsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSimCards);
    }

    /** 查询SIM卡列表 查询SIM卡列表
     *
     * @param ListSimCardsRequest 请求对象
     * @return AsyncInvoker<ListSimCardsRequest, ListSimCardsResponse> */
    public AsyncInvoker<ListSimCardsRequest, ListSimCardsResponse> listSimCardsAsyncInvoker(
        ListSimCardsRequest request) {
        return new AsyncInvoker<ListSimCardsRequest, ListSimCardsResponse>(request, GslMeta.listSimCards, hcClient);
    }

    /** SIM卡机卡重绑 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，单卡每月只允许重绑2次，接口只支持电信卡调用。
     *
     * @param RegisterImeiRequest 请求对象
     * @return CompletableFuture<RegisterImeiResponse> */
    public CompletableFuture<RegisterImeiResponse> registerImeiAsync(RegisterImeiRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.registerImei);
    }

    /** SIM卡机卡重绑 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，单卡每月只允许重绑2次，接口只支持电信卡调用。
     *
     * @param RegisterImeiRequest 请求对象
     * @return AsyncInvoker<RegisterImeiRequest, RegisterImeiResponse> */
    public AsyncInvoker<RegisterImeiRequest, RegisterImeiResponse> registerImeiAsyncInvoker(
        RegisterImeiRequest request) {
        return new AsyncInvoker<RegisterImeiRequest, RegisterImeiResponse>(request, GslMeta.registerImei, hcClient);
    }

    /** SIM卡单卡复机 创建复机申请，返回业务受理单号。1~2个工作日完成复机操作。
     *
     * @param ResetSimCardRequest 请求对象
     * @return CompletableFuture<ResetSimCardResponse> */
    public CompletableFuture<ResetSimCardResponse> resetSimCardAsync(ResetSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.resetSimCard);
    }

    /** SIM卡单卡复机 创建复机申请，返回业务受理单号。1~2个工作日完成复机操作。
     *
     * @param ResetSimCardRequest 请求对象
     * @return AsyncInvoker<ResetSimCardRequest, ResetSimCardResponse> */
    public AsyncInvoker<ResetSimCardRequest, ResetSimCardResponse> resetSimCardAsyncInvoker(
        ResetSimCardRequest request) {
        return new AsyncInvoker<ResetSimCardRequest, ResetSimCardResponse>(request, GslMeta.resetSimCard, hcClient);
    }

    /** SIM卡达量断网/恢复在用 SIM卡达量断网/恢复在用,只支持电信卡。
     *
     * @param SetExceedCutNetRequest 请求对象
     * @return CompletableFuture<SetExceedCutNetResponse> */
    public CompletableFuture<SetExceedCutNetResponse> setExceedCutNetAsync(SetExceedCutNetRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.setExceedCutNet);
    }

    /** SIM卡达量断网/恢复在用 SIM卡达量断网/恢复在用,只支持电信卡。
     *
     * @param SetExceedCutNetRequest 请求对象
     * @return AsyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse> */
    public AsyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse> setExceedCutNetAsyncInvoker(
        SetExceedCutNetRequest request) {
        return new AsyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse>(request, GslMeta.setExceedCutNet,
            hcClient);
    }

    /** 实体卡限速 实体卡限速接口,支持电信和联通实体卡调用。
     *
     * @param SetSpeedValueRequest 请求对象
     * @return CompletableFuture<SetSpeedValueResponse> */
    public CompletableFuture<SetSpeedValueResponse> setSpeedValueAsync(SetSpeedValueRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.setSpeedValue);
    }

    /** 实体卡限速 实体卡限速接口,支持电信和联通实体卡调用。
     *
     * @param SetSpeedValueRequest 请求对象
     * @return AsyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse> */
    public AsyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse> setSpeedValueAsyncInvoker(
        SetSpeedValueRequest request) {
        return new AsyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse>(request, GslMeta.setSpeedValue, hcClient);
    }

    /** 查询SIM卡实名认证信息 实时查询SIM卡实名认证信息。
     *
     * @param ShowRealNamedRequest 请求对象
     * @return CompletableFuture<ShowRealNamedResponse> */
    public CompletableFuture<ShowRealNamedResponse> showRealNamedAsync(ShowRealNamedRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.showRealNamed);
    }

    /** 查询SIM卡实名认证信息 实时查询SIM卡实名认证信息。
     *
     * @param ShowRealNamedRequest 请求对象
     * @return AsyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse> */
    public AsyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse> showRealNamedAsyncInvoker(
        ShowRealNamedRequest request) {
        return new AsyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse>(request, GslMeta.showRealNamed, hcClient);
    }

    /** 查询SIM卡详情 查询SIM卡详情
     *
     * @param ShowSimCardRequest 请求对象
     * @return CompletableFuture<ShowSimCardResponse> */
    public CompletableFuture<ShowSimCardResponse> showSimCardAsync(ShowSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.showSimCard);
    }

    /** 查询SIM卡详情 查询SIM卡详情
     *
     * @param ShowSimCardRequest 请求对象
     * @return AsyncInvoker<ShowSimCardRequest, ShowSimCardResponse> */
    public AsyncInvoker<ShowSimCardRequest, ShowSimCardResponse> showSimCardAsyncInvoker(ShowSimCardRequest request) {
        return new AsyncInvoker<ShowSimCardRequest, ShowSimCardResponse>(request, GslMeta.showSimCard, hcClient);
    }

    /** SIM卡申请断网/恢复在用 SIM卡申请断网/恢复在用,只支持电信卡。
     *
     * @param StartStopNetRequest 请求对象
     * @return CompletableFuture<StartStopNetResponse> */
    public CompletableFuture<StartStopNetResponse> startStopNetAsync(StartStopNetRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.startStopNet);
    }

    /** SIM卡申请断网/恢复在用 SIM卡申请断网/恢复在用,只支持电信卡。
     *
     * @param StartStopNetRequest 请求对象
     * @return AsyncInvoker<StartStopNetRequest, StartStopNetResponse> */
    public AsyncInvoker<StartStopNetRequest, StartStopNetResponse> startStopNetAsyncInvoker(
        StartStopNetRequest request) {
        return new AsyncInvoker<StartStopNetRequest, StartStopNetResponse>(request, GslMeta.startStopNet, hcClient);
    }

    /** SIM卡单卡停机 创建停机申请，返回业务受理单号。1~2个工作日完成停机操作。
     *
     * @param StopSimCardRequest 请求对象
     * @return CompletableFuture<StopSimCardResponse> */
    public CompletableFuture<StopSimCardResponse> stopSimCardAsync(StopSimCardRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.stopSimCard);
    }

    /** SIM卡单卡停机 创建停机申请，返回业务受理单号。1~2个工作日完成停机操作。
     *
     * @param StopSimCardRequest 请求对象
     * @return AsyncInvoker<StopSimCardRequest, StopSimCardResponse> */
    public AsyncInvoker<StopSimCardRequest, StopSimCardResponse> stopSimCardAsyncInvoker(StopSimCardRequest request) {
        return new AsyncInvoker<StopSimCardRequest, StopSimCardResponse>(request, GslMeta.stopSimCard, hcClient);
    }

    /** 查询流量池成员列表 查询流量池成员列表
     *
     * @param ListSimPoolMembersRequest 请求对象
     * @return CompletableFuture<ListSimPoolMembersResponse> */
    public CompletableFuture<ListSimPoolMembersResponse> listSimPoolMembersAsync(ListSimPoolMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSimPoolMembers);
    }

    /** 查询流量池成员列表 查询流量池成员列表
     *
     * @param ListSimPoolMembersRequest 请求对象
     * @return AsyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse> */
    public AsyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse> listSimPoolMembersAsyncInvoker(
        ListSimPoolMembersRequest request) {
        return new AsyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse>(request,
            GslMeta.listSimPoolMembers, hcClient);
    }

    /** 查询流量池列表 查询流量池列表
     *
     * @param ListSimPoolsRequest 请求对象
     * @return CompletableFuture<ListSimPoolsResponse> */
    public CompletableFuture<ListSimPoolsResponse> listSimPoolsAsync(ListSimPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSimPools);
    }

    /** 查询流量池列表 查询流量池列表
     *
     * @param ListSimPoolsRequest 请求对象
     * @return AsyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse> */
    public AsyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse> listSimPoolsAsyncInvoker(
        ListSimPoolsRequest request) {
        return new AsyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse>(request, GslMeta.listSimPools, hcClient);
    }

    /** 批量查询实体卡流量 批量查询实体卡流量
     *
     * @param ListFlowBySimCardsRequest 请求对象
     * @return CompletableFuture<ListFlowBySimCardsResponse> */
    public CompletableFuture<ListFlowBySimCardsResponse> listFlowBySimCardsAsync(ListFlowBySimCardsRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listFlowBySimCards);
    }

    /** 批量查询实体卡流量 批量查询实体卡流量
     *
     * @param ListFlowBySimCardsRequest 请求对象
     * @return AsyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> */
    public AsyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> listFlowBySimCardsAsyncInvoker(
        ListFlowBySimCardsRequest request) {
        return new AsyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse>(request,
            GslMeta.listFlowBySimCards, hcClient);
    }

    /** sim卡套餐列表查询 sim卡套餐列表查询
     *
     * @param ListSimPricePlansRequest 请求对象
     * @return CompletableFuture<ListSimPricePlansResponse> */
    public CompletableFuture<ListSimPricePlansResponse> listSimPricePlansAsync(ListSimPricePlansRequest request) {
        return hcClient.asyncInvokeHttp(request, GslMeta.listSimPricePlans);
    }

    /** sim卡套餐列表查询 sim卡套餐列表查询
     *
     * @param ListSimPricePlansRequest 请求对象
     * @return AsyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse> */
    public AsyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse> listSimPricePlansAsyncInvoker(
        ListSimPricePlansRequest request) {
        return new AsyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse>(request, GslMeta.listSimPricePlans,
            hcClient);
    }

}
