package com.huaweicloud.sdk.gsl.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.gsl.v3.model.*;

public class GslClient {

    protected HcClient hcClient;

    public GslClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GslClient> newBuilder() {
        return new ClientBuilder<>(GslClient::new);
    }

    /**
     * 查询套餐列表信息
     *
     * 查询套餐列表信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProPricePlansRequest 请求对象
     * @return ListProPricePlansResponse
     */
    public ListProPricePlansResponse listProPricePlans(ListProPricePlansRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listProPricePlans);
    }

    /**
     * 查询套餐列表信息
     *
     * 查询套餐列表信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProPricePlansRequest 请求对象
     * @return SyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse>
     */
    public SyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse> listProPricePlansInvoker(
        ListProPricePlansRequest request) {
        return new SyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse>(request, GslMeta.listProPricePlans,
            hcClient);
    }

    /**
     * 清除实名认证信息
     *
     * 清除实名认证信息，接口只支持电信卡调用
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRealNameRequest 请求对象
     * @return DeleteRealNameResponse
     */
    public DeleteRealNameResponse deleteRealName(DeleteRealNameRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.deleteRealName);
    }

    /**
     * 清除实名认证信息
     *
     * 清除实名认证信息，接口只支持电信卡调用
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRealNameRequest 请求对象
     * @return SyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse>
     */
    public SyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse> deleteRealNameInvoker(
        DeleteRealNameRequest request) {
        return new SyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse>(request, GslMeta.deleteRealName,
            hcClient);
    }

    /**
     * 激活实体卡
     *
     * 创建激活实体卡申请，返回业务受理单号。1~2个工作日完成激活操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableSimCardRequest 请求对象
     * @return EnableSimCardResponse
     */
    public EnableSimCardResponse enableSimCard(EnableSimCardRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.enableSimCard);
    }

    /**
     * 激活实体卡
     *
     * 创建激活实体卡申请，返回业务受理单号。1~2个工作日完成激活操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableSimCardRequest 请求对象
     * @return SyncInvoker<EnableSimCardRequest, EnableSimCardResponse>
     */
    public SyncInvoker<EnableSimCardRequest, EnableSimCardResponse> enableSimCardInvoker(EnableSimCardRequest request) {
        return new SyncInvoker<EnableSimCardRequest, EnableSimCardResponse>(request, GslMeta.enableSimCard, hcClient);
    }

    /**
     * 查询SIM卡列表
     *
     * 查询SIM卡列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSimCardsRequest 请求对象
     * @return ListSimCardsResponse
     */
    public ListSimCardsResponse listSimCards(ListSimCardsRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listSimCards);
    }

    /**
     * 查询SIM卡列表
     *
     * 查询SIM卡列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSimCardsRequest 请求对象
     * @return SyncInvoker<ListSimCardsRequest, ListSimCardsResponse>
     */
    public SyncInvoker<ListSimCardsRequest, ListSimCardsResponse> listSimCardsInvoker(ListSimCardsRequest request) {
        return new SyncInvoker<ListSimCardsRequest, ListSimCardsResponse>(request, GslMeta.listSimCards, hcClient);
    }

    /**
     * SIM卡机卡重绑
     *
     * 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，单卡每月只允许重绑2次，接口只支持电信卡调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterImeiRequest 请求对象
     * @return RegisterImeiResponse
     */
    public RegisterImeiResponse registerImei(RegisterImeiRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.registerImei);
    }

    /**
     * SIM卡机卡重绑
     *
     * 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，单卡每月只允许重绑2次，接口只支持电信卡调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RegisterImeiRequest 请求对象
     * @return SyncInvoker<RegisterImeiRequest, RegisterImeiResponse>
     */
    public SyncInvoker<RegisterImeiRequest, RegisterImeiResponse> registerImeiInvoker(RegisterImeiRequest request) {
        return new SyncInvoker<RegisterImeiRequest, RegisterImeiResponse>(request, GslMeta.registerImei, hcClient);
    }

    /**
     * SIM卡单卡复机
     *
     * 创建复机申请，返回业务受理单号。1~2个工作日完成复机操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetSimCardRequest 请求对象
     * @return ResetSimCardResponse
     */
    public ResetSimCardResponse resetSimCard(ResetSimCardRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.resetSimCard);
    }

    /**
     * SIM卡单卡复机
     *
     * 创建复机申请，返回业务受理单号。1~2个工作日完成复机操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetSimCardRequest 请求对象
     * @return SyncInvoker<ResetSimCardRequest, ResetSimCardResponse>
     */
    public SyncInvoker<ResetSimCardRequest, ResetSimCardResponse> resetSimCardInvoker(ResetSimCardRequest request) {
        return new SyncInvoker<ResetSimCardRequest, ResetSimCardResponse>(request, GslMeta.resetSimCard, hcClient);
    }

    /**
     * SIM卡达量断网/恢复在用
     *
     * SIM卡达量断网/恢复在用,只支持电信卡。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetExceedCutNetRequest 请求对象
     * @return SetExceedCutNetResponse
     */
    public SetExceedCutNetResponse setExceedCutNet(SetExceedCutNetRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.setExceedCutNet);
    }

    /**
     * SIM卡达量断网/恢复在用
     *
     * SIM卡达量断网/恢复在用,只支持电信卡。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetExceedCutNetRequest 请求对象
     * @return SyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse>
     */
    public SyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse> setExceedCutNetInvoker(
        SetExceedCutNetRequest request) {
        return new SyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse>(request, GslMeta.setExceedCutNet,
            hcClient);
    }

    /**
     * 实体卡限速
     *
     * 实体卡限速接口,支持电信和联通实体卡调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetSpeedValueRequest 请求对象
     * @return SetSpeedValueResponse
     */
    public SetSpeedValueResponse setSpeedValue(SetSpeedValueRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.setSpeedValue);
    }

    /**
     * 实体卡限速
     *
     * 实体卡限速接口,支持电信和联通实体卡调用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetSpeedValueRequest 请求对象
     * @return SyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse>
     */
    public SyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse> setSpeedValueInvoker(SetSpeedValueRequest request) {
        return new SyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse>(request, GslMeta.setSpeedValue, hcClient);
    }

    /**
     * 查询SIM卡实名认证信息
     *
     * 实时查询SIM卡实名认证信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRealNamedRequest 请求对象
     * @return ShowRealNamedResponse
     */
    public ShowRealNamedResponse showRealNamed(ShowRealNamedRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.showRealNamed);
    }

    /**
     * 查询SIM卡实名认证信息
     *
     * 实时查询SIM卡实名认证信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRealNamedRequest 请求对象
     * @return SyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse>
     */
    public SyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse> showRealNamedInvoker(ShowRealNamedRequest request) {
        return new SyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse>(request, GslMeta.showRealNamed, hcClient);
    }

    /**
     * 查询SIM卡详情
     *
     * 查询SIM卡详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSimCardRequest 请求对象
     * @return ShowSimCardResponse
     */
    public ShowSimCardResponse showSimCard(ShowSimCardRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.showSimCard);
    }

    /**
     * 查询SIM卡详情
     *
     * 查询SIM卡详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowSimCardRequest 请求对象
     * @return SyncInvoker<ShowSimCardRequest, ShowSimCardResponse>
     */
    public SyncInvoker<ShowSimCardRequest, ShowSimCardResponse> showSimCardInvoker(ShowSimCardRequest request) {
        return new SyncInvoker<ShowSimCardRequest, ShowSimCardResponse>(request, GslMeta.showSimCard, hcClient);
    }

    /**
     * SIM卡申请断网/恢复在用
     *
     * SIM卡申请断网/恢复在用,只支持电信卡。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartStopNetRequest 请求对象
     * @return StartStopNetResponse
     */
    public StartStopNetResponse startStopNet(StartStopNetRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.startStopNet);
    }

    /**
     * SIM卡申请断网/恢复在用
     *
     * SIM卡申请断网/恢复在用,只支持电信卡。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartStopNetRequest 请求对象
     * @return SyncInvoker<StartStopNetRequest, StartStopNetResponse>
     */
    public SyncInvoker<StartStopNetRequest, StartStopNetResponse> startStopNetInvoker(StartStopNetRequest request) {
        return new SyncInvoker<StartStopNetRequest, StartStopNetResponse>(request, GslMeta.startStopNet, hcClient);
    }

    /**
     * SIM卡单卡停机
     *
     * 创建停机申请，返回业务受理单号。1~2个工作日完成停机操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopSimCardRequest 请求对象
     * @return StopSimCardResponse
     */
    public StopSimCardResponse stopSimCard(StopSimCardRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.stopSimCard);
    }

    /**
     * SIM卡单卡停机
     *
     * 创建停机申请，返回业务受理单号。1~2个工作日完成停机操作。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopSimCardRequest 请求对象
     * @return SyncInvoker<StopSimCardRequest, StopSimCardResponse>
     */
    public SyncInvoker<StopSimCardRequest, StopSimCardResponse> stopSimCardInvoker(StopSimCardRequest request) {
        return new SyncInvoker<StopSimCardRequest, StopSimCardResponse>(request, GslMeta.stopSimCard, hcClient);
    }

    /**
     * 查询流量池成员列表
     *
     * 查询流量池成员列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSimPoolMembersRequest 请求对象
     * @return ListSimPoolMembersResponse
     */
    public ListSimPoolMembersResponse listSimPoolMembers(ListSimPoolMembersRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listSimPoolMembers);
    }

    /**
     * 查询流量池成员列表
     *
     * 查询流量池成员列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSimPoolMembersRequest 请求对象
     * @return SyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse>
     */
    public SyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse> listSimPoolMembersInvoker(
        ListSimPoolMembersRequest request) {
        return new SyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse>(request,
            GslMeta.listSimPoolMembers, hcClient);
    }

    /**
     * 查询流量池列表
     *
     * 查询流量池列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSimPoolsRequest 请求对象
     * @return ListSimPoolsResponse
     */
    public ListSimPoolsResponse listSimPools(ListSimPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listSimPools);
    }

    /**
     * 查询流量池列表
     *
     * 查询流量池列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSimPoolsRequest 请求对象
     * @return SyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse>
     */
    public SyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse> listSimPoolsInvoker(ListSimPoolsRequest request) {
        return new SyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse>(request, GslMeta.listSimPools, hcClient);
    }

    /**
     * 批量查询实体卡流量
     *
     * 批量查询实体卡流量
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlowBySimCardsRequest 请求对象
     * @return ListFlowBySimCardsResponse
     */
    public ListFlowBySimCardsResponse listFlowBySimCards(ListFlowBySimCardsRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listFlowBySimCards);
    }

    /**
     * 批量查询实体卡流量
     *
     * 批量查询实体卡流量
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlowBySimCardsRequest 请求对象
     * @return SyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse>
     */
    public SyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> listFlowBySimCardsInvoker(
        ListFlowBySimCardsRequest request) {
        return new SyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse>(request,
            GslMeta.listFlowBySimCards, hcClient);
    }

    /**
     * sim卡套餐列表查询
     *
     * SIM卡套餐列表查询，实体卡只会有一个套餐，eSIM/vSIM可能会有多个套餐
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSimPricePlansRequest 请求对象
     * @return ListSimPricePlansResponse
     */
    public ListSimPricePlansResponse listSimPricePlans(ListSimPricePlansRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listSimPricePlans);
    }

    /**
     * sim卡套餐列表查询
     *
     * SIM卡套餐列表查询，实体卡只会有一个套餐，eSIM/vSIM可能会有多个套餐
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSimPricePlansRequest 请求对象
     * @return SyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse>
     */
    public SyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse> listSimPricePlansInvoker(
        ListSimPricePlansRequest request) {
        return new SyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse>(request, GslMeta.listSimPricePlans,
            hcClient);
    }

}
