package com.huaweicloud.sdk.gsl.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.gsl.v3.model.ListProPricePlansRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListProPricePlansResponse;
import com.huaweicloud.sdk.gsl.v3.model.ListSimCardsRequest;
import com.huaweicloud.sdk.gsl.v3.model.ListSimCardsResponse;
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
import com.huaweicloud.sdk.gsl.v3.model.UpdateAttributeRequest;
import com.huaweicloud.sdk.gsl.v3.model.UpdateAttributeResponse;

public class GslClient {

    protected HcClient hcClient;

    public GslClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GslClient> newBuilder() {
        ClientBuilder<GslClient> clientBuilder = new ClientBuilder<>(GslClient::new);
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
     * @return BatchSetAttributesResponse
     */
    public BatchSetAttributesResponse batchSetAttributes(BatchSetAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.batchSetAttributes);
    }

    /**
     * 批量设置自定义属性接口
     *
     * 批量设置自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetAttributesRequest 请求对象
     * @return SyncInvoker<BatchSetAttributesRequest, BatchSetAttributesResponse>
     */
    public SyncInvoker<BatchSetAttributesRequest, BatchSetAttributesResponse> batchSetAttributesInvoker(
        BatchSetAttributesRequest request) {
        return new SyncInvoker<>(request, GslMeta.batchSetAttributes, hcClient);
    }

    /**
     * 用户新增自定义属性接口
     *
     * 用户新增自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttributeRequest 请求对象
     * @return CreateAttributeResponse
     */
    public CreateAttributeResponse createAttribute(CreateAttributeRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.createAttribute);
    }

    /**
     * 用户新增自定义属性接口
     *
     * 用户新增自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAttributeRequest 请求对象
     * @return SyncInvoker<CreateAttributeRequest, CreateAttributeResponse>
     */
    public SyncInvoker<CreateAttributeRequest, CreateAttributeResponse> createAttributeInvoker(
        CreateAttributeRequest request) {
        return new SyncInvoker<>(request, GslMeta.createAttribute, hcClient);
    }

    /**
     * 停用自定义属性接口
     *
     * 停用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAttributeRequest 请求对象
     * @return DisableAttributeResponse
     */
    public DisableAttributeResponse disableAttribute(DisableAttributeRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.disableAttribute);
    }

    /**
     * 停用自定义属性接口
     *
     * 停用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAttributeRequest 请求对象
     * @return SyncInvoker<DisableAttributeRequest, DisableAttributeResponse>
     */
    public SyncInvoker<DisableAttributeRequest, DisableAttributeResponse> disableAttributeInvoker(
        DisableAttributeRequest request) {
        return new SyncInvoker<>(request, GslMeta.disableAttribute, hcClient);
    }

    /**
     * 启用自定义属性接口
     *
     * 启用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAttributeRequest 请求对象
     * @return EnableAttributeResponse
     */
    public EnableAttributeResponse enableAttribute(EnableAttributeRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.enableAttribute);
    }

    /**
     * 启用自定义属性接口
     *
     * 启用自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAttributeRequest 请求对象
     * @return SyncInvoker<EnableAttributeRequest, EnableAttributeResponse>
     */
    public SyncInvoker<EnableAttributeRequest, EnableAttributeResponse> enableAttributeInvoker(
        EnableAttributeRequest request) {
        return new SyncInvoker<>(request, GslMeta.enableAttribute, hcClient);
    }

    /**
     * 查询自定义属性列表接口
     *
     * 查询自定义属性列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttributesRequest 请求对象
     * @return ListAttributesResponse
     */
    public ListAttributesResponse listAttributes(ListAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listAttributes);
    }

    /**
     * 查询自定义属性列表接口
     *
     * 查询自定义属性列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttributesRequest 请求对象
     * @return SyncInvoker<ListAttributesRequest, ListAttributesResponse>
     */
    public SyncInvoker<ListAttributesRequest, ListAttributesResponse> listAttributesInvoker(
        ListAttributesRequest request) {
        return new SyncInvoker<>(request, GslMeta.listAttributes, hcClient);
    }

    /**
     * 修改自定义属性接口
     *
     * 修改自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAttributeRequest 请求对象
     * @return UpdateAttributeResponse
     */
    public UpdateAttributeResponse updateAttribute(UpdateAttributeRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.updateAttribute);
    }

    /**
     * 修改自定义属性接口
     *
     * 修改自定义属性接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAttributeRequest 请求对象
     * @return SyncInvoker<UpdateAttributeRequest, UpdateAttributeResponse>
     */
    public SyncInvoker<UpdateAttributeRequest, UpdateAttributeResponse> updateAttributeInvoker(
        UpdateAttributeRequest request) {
        return new SyncInvoker<>(request, GslMeta.updateAttribute, hcClient);
    }

    /**
     * 查询后向流量池成员列表
     *
     * 查询后向流量池成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackPoolMembersRequest 请求对象
     * @return ListBackPoolMembersResponse
     */
    public ListBackPoolMembersResponse listBackPoolMembers(ListBackPoolMembersRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listBackPoolMembers);
    }

    /**
     * 查询后向流量池成员列表
     *
     * 查询后向流量池成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackPoolMembersRequest 请求对象
     * @return SyncInvoker<ListBackPoolMembersRequest, ListBackPoolMembersResponse>
     */
    public SyncInvoker<ListBackPoolMembersRequest, ListBackPoolMembersResponse> listBackPoolMembersInvoker(
        ListBackPoolMembersRequest request) {
        return new SyncInvoker<>(request, GslMeta.listBackPoolMembers, hcClient);
    }

    /**
     * 查询后向流量池列表
     *
     * 查询后向流量池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackPoolsRequest 请求对象
     * @return ListBackPoolsResponse
     */
    public ListBackPoolsResponse listBackPools(ListBackPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listBackPools);
    }

    /**
     * 查询后向流量池列表
     *
     * 查询后向流量池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackPoolsRequest 请求对象
     * @return SyncInvoker<ListBackPoolsRequest, ListBackPoolsResponse>
     */
    public SyncInvoker<ListBackPoolsRequest, ListBackPoolsResponse> listBackPoolsInvoker(ListBackPoolsRequest request) {
        return new SyncInvoker<>(request, GslMeta.listBackPools, hcClient);
    }

    /**
     * 查询套餐列表信息
     *
     * 查询套餐列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProPricePlansRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProPricePlansRequest 请求对象
     * @return SyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse>
     */
    public SyncInvoker<ListProPricePlansRequest, ListProPricePlansResponse> listProPricePlansInvoker(
        ListProPricePlansRequest request) {
        return new SyncInvoker<>(request, GslMeta.listProPricePlans, hcClient);
    }

    /**
     * 清除实名认证信息
     *
     * 清除实名认证信息，接口仅支持中国电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRealNameRequest 请求对象
     * @return DeleteRealNameResponse
     */
    public DeleteRealNameResponse deleteRealName(DeleteRealNameRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.deleteRealName);
    }

    /**
     * 清除实名认证信息
     *
     * 清除实名认证信息，接口仅支持中国电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRealNameRequest 请求对象
     * @return SyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse>
     */
    public SyncInvoker<DeleteRealNameRequest, DeleteRealNameResponse> deleteRealNameInvoker(
        DeleteRealNameRequest request) {
        return new SyncInvoker<>(request, GslMeta.deleteRealName, hcClient);
    }

    /**
     * 激活实体卡
     *
     * 创建激活实体卡申请，返回业务受理单号。1~2个工作日完成激活操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableSimCardRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableSimCardRequest 请求对象
     * @return SyncInvoker<EnableSimCardRequest, EnableSimCardResponse>
     */
    public SyncInvoker<EnableSimCardRequest, EnableSimCardResponse> enableSimCardInvoker(EnableSimCardRequest request) {
        return new SyncInvoker<>(request, GslMeta.enableSimCard, hcClient);
    }

    /**
     * 查询SIM卡列表
     *
     * 查询SIM卡列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimCardsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimCardsRequest 请求对象
     * @return SyncInvoker<ListSimCardsRequest, ListSimCardsResponse>
     */
    public SyncInvoker<ListSimCardsRequest, ListSimCardsResponse> listSimCardsInvoker(ListSimCardsRequest request) {
        return new SyncInvoker<>(request, GslMeta.listSimCards, hcClient);
    }

    /**
     * SIM卡机卡重绑
     *
     * 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，接口仅支持中国电信卡，中国移动卡调用。中国电信卡单卡每月只允许重绑2次，中国移动卡仅支持普通机卡重绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterImeiRequest 请求对象
     * @return RegisterImeiResponse
     */
    public RegisterImeiResponse registerImei(RegisterImeiRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.registerImei);
    }

    /**
     * SIM卡机卡重绑
     *
     * 支持固定机卡重绑(需要上传IMEI，将SIM卡绑定到指定IMEI的设备)和普通机卡重绑(会清除之前绑定的设备,将SIM卡绑定到正在使用的设备)，接口仅支持中国电信卡，中国移动卡调用。中国电信卡单卡每月只允许重绑2次，中国移动卡仅支持普通机卡重绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterImeiRequest 请求对象
     * @return SyncInvoker<RegisterImeiRequest, RegisterImeiResponse>
     */
    public SyncInvoker<RegisterImeiRequest, RegisterImeiResponse> registerImeiInvoker(RegisterImeiRequest request) {
        return new SyncInvoker<>(request, GslMeta.registerImei, hcClient);
    }

    /**
     * SIM卡单卡复机
     *
     * 创建复机申请，返回业务受理单号。1~2个工作日完成复机操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetSimCardRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetSimCardRequest 请求对象
     * @return SyncInvoker<ResetSimCardRequest, ResetSimCardResponse>
     */
    public SyncInvoker<ResetSimCardRequest, ResetSimCardResponse> resetSimCardInvoker(ResetSimCardRequest request) {
        return new SyncInvoker<>(request, GslMeta.resetSimCard, hcClient);
    }

    /**
     * SIM卡达量断网/取消达量断网
     *
     * SIM卡达量断网/取消达量断网，接口仅支持中国电信的卡以及中国联通、中国移动的组池卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetExceedCutNetRequest 请求对象
     * @return SetExceedCutNetResponse
     */
    public SetExceedCutNetResponse setExceedCutNet(SetExceedCutNetRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.setExceedCutNet);
    }

    /**
     * SIM卡达量断网/取消达量断网
     *
     * SIM卡达量断网/取消达量断网，接口仅支持中国电信的卡以及中国联通、中国移动的组池卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetExceedCutNetRequest 请求对象
     * @return SyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse>
     */
    public SyncInvoker<SetExceedCutNetRequest, SetExceedCutNetResponse> setExceedCutNetInvoker(
        SetExceedCutNetRequest request) {
        return new SyncInvoker<>(request, GslMeta.setExceedCutNet, hcClient);
    }

    /**
     * 实体卡限速
     *
     * 实体卡限速接口，接口仅支持中国电信和中国联通实体卡调用。中国联通卡需要个人实名认证后才能使用限速功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSpeedValueRequest 请求对象
     * @return SetSpeedValueResponse
     */
    public SetSpeedValueResponse setSpeedValue(SetSpeedValueRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.setSpeedValue);
    }

    /**
     * 实体卡限速
     *
     * 实体卡限速接口，接口仅支持中国电信和中国联通实体卡调用。中国联通卡需要个人实名认证后才能使用限速功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSpeedValueRequest 请求对象
     * @return SyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse>
     */
    public SyncInvoker<SetSpeedValueRequest, SetSpeedValueResponse> setSpeedValueInvoker(SetSpeedValueRequest request) {
        return new SyncInvoker<>(request, GslMeta.setSpeedValue, hcClient);
    }

    /**
     * 月用量统计
     *
     * 设备月用量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthUsagesRequest 请求对象
     * @return ShowMonthUsagesResponse
     */
    public ShowMonthUsagesResponse showMonthUsages(ShowMonthUsagesRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.showMonthUsages);
    }

    /**
     * 月用量统计
     *
     * 设备月用量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthUsagesRequest 请求对象
     * @return SyncInvoker<ShowMonthUsagesRequest, ShowMonthUsagesResponse>
     */
    public SyncInvoker<ShowMonthUsagesRequest, ShowMonthUsagesResponse> showMonthUsagesInvoker(
        ShowMonthUsagesRequest request) {
        return new SyncInvoker<>(request, GslMeta.showMonthUsages, hcClient);
    }

    /**
     * 查询SIM卡实名认证信息
     *
     * 实时查询SIM卡实名认证信息，接口仅支持查询中国大陆运营商卡片的实名认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRealNamedRequest 请求对象
     * @return ShowRealNamedResponse
     */
    public ShowRealNamedResponse showRealNamed(ShowRealNamedRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.showRealNamed);
    }

    /**
     * 查询SIM卡实名认证信息
     *
     * 实时查询SIM卡实名认证信息，接口仅支持查询中国大陆运营商卡片的实名认证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRealNamedRequest 请求对象
     * @return SyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse>
     */
    public SyncInvoker<ShowRealNamedRequest, ShowRealNamedResponse> showRealNamedInvoker(ShowRealNamedRequest request) {
        return new SyncInvoker<>(request, GslMeta.showRealNamed, hcClient);
    }

    /**
     * 查询SIM卡详情
     *
     * 查询SIM卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSimCardRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSimCardRequest 请求对象
     * @return SyncInvoker<ShowSimCardRequest, ShowSimCardResponse>
     */
    public SyncInvoker<ShowSimCardRequest, ShowSimCardResponse> showSimCardInvoker(ShowSimCardRequest request) {
        return new SyncInvoker<>(request, GslMeta.showSimCard, hcClient);
    }

    /**
     * SIM卡申请断网/恢复在用
     *
     * SIM卡申请断网/恢复在用，接口仅支持中国电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartStopNetRequest 请求对象
     * @return StartStopNetResponse
     */
    public StartStopNetResponse startStopNet(StartStopNetRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.startStopNet);
    }

    /**
     * SIM卡申请断网/恢复在用
     *
     * SIM卡申请断网/恢复在用，接口仅支持中国电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartStopNetRequest 请求对象
     * @return SyncInvoker<StartStopNetRequest, StartStopNetResponse>
     */
    public SyncInvoker<StartStopNetRequest, StartStopNetResponse> startStopNetInvoker(StartStopNetRequest request) {
        return new SyncInvoker<>(request, GslMeta.startStopNet, hcClient);
    }

    /**
     * SIM卡单卡停机
     *
     * 创建停机申请，返回业务受理单号。1~2个工作日完成停机操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSimCardRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSimCardRequest 请求对象
     * @return SyncInvoker<StopSimCardRequest, StopSimCardResponse>
     */
    public SyncInvoker<StopSimCardRequest, StopSimCardResponse> stopSimCardInvoker(StopSimCardRequest request) {
        return new SyncInvoker<>(request, GslMeta.stopSimCard, hcClient);
    }

    /**
     * 查询流量池成员列表
     *
     * 查询流量池成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPoolMembersRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPoolMembersRequest 请求对象
     * @return SyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse>
     */
    public SyncInvoker<ListSimPoolMembersRequest, ListSimPoolMembersResponse> listSimPoolMembersInvoker(
        ListSimPoolMembersRequest request) {
        return new SyncInvoker<>(request, GslMeta.listSimPoolMembers, hcClient);
    }

    /**
     * 查询流量池列表
     *
     * 查询流量池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPoolsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPoolsRequest 请求对象
     * @return SyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse>
     */
    public SyncInvoker<ListSimPoolsRequest, ListSimPoolsResponse> listSimPoolsInvoker(ListSimPoolsRequest request) {
        return new SyncInvoker<>(request, GslMeta.listSimPools, hcClient);
    }

    /**
     * 批量查询实体卡流量
     *
     * 批量查询实体卡流量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowBySimCardsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowBySimCardsRequest 请求对象
     * @return SyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse>
     */
    public SyncInvoker<ListFlowBySimCardsRequest, ListFlowBySimCardsResponse> listFlowBySimCardsInvoker(
        ListFlowBySimCardsRequest request) {
        return new SyncInvoker<>(request, GslMeta.listFlowBySimCards, hcClient);
    }

    /**
     * sim卡套餐列表查询
     *
     * SIM卡套餐列表查询，实体卡只会有一个套餐，eSIM/vSIM可能会有多个套餐
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPricePlansRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimPricePlansRequest 请求对象
     * @return SyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse>
     */
    public SyncInvoker<ListSimPricePlansRequest, ListSimPricePlansResponse> listSimPricePlansInvoker(
        ListSimPricePlansRequest request) {
        return new SyncInvoker<>(request, GslMeta.listSimPricePlans, hcClient);
    }

    /**
     * 短信发送详情
     *
     * 短信发送详情，接口仅支持开通短信套餐的中国移动与中国电信卡调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmsDetailsRequest 请求对象
     * @return ListSmsDetailsResponse
     */
    public ListSmsDetailsResponse listSmsDetails(ListSmsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listSmsDetails);
    }

    /**
     * 短信发送详情
     *
     * 短信发送详情，接口仅支持开通短信套餐的中国移动与中国电信卡调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmsDetailsRequest 请求对象
     * @return SyncInvoker<ListSmsDetailsRequest, ListSmsDetailsResponse>
     */
    public SyncInvoker<ListSmsDetailsRequest, ListSmsDetailsResponse> listSmsDetailsInvoker(
        ListSmsDetailsRequest request) {
        return new SyncInvoker<>(request, GslMeta.listSmsDetails, hcClient);
    }

    /**
     * 发送短信
     *
     * 发送短信，接口仅支持开通短信套餐的中国移动与中国电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSmsRequest 请求对象
     * @return SendSmsResponse
     */
    public SendSmsResponse sendSms(SendSmsRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.sendSms);
    }

    /**
     * 发送短信
     *
     * 发送短信，接口仅支持开通短信套餐的中国移动与中国电信卡调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSmsRequest 请求对象
     * @return SyncInvoker<SendSmsRequest, SendSmsResponse>
     */
    public SyncInvoker<SendSmsRequest, SendSmsResponse> sendSmsInvoker(SendSmsRequest request) {
        return new SyncInvoker<>(request, GslMeta.sendSms, hcClient);
    }

    /**
     * 批量设置/取消设置标签接口
     *
     * 批量设置/取消设置标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetTagsRequest 请求对象
     * @return BatchSetTagsResponse
     */
    public BatchSetTagsResponse batchSetTags(BatchSetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.batchSetTags);
    }

    /**
     * 批量设置/取消设置标签接口
     *
     * 批量设置/取消设置标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetTagsRequest 请求对象
     * @return SyncInvoker<BatchSetTagsRequest, BatchSetTagsResponse>
     */
    public SyncInvoker<BatchSetTagsRequest, BatchSetTagsResponse> batchSetTagsInvoker(BatchSetTagsRequest request) {
        return new SyncInvoker<>(request, GslMeta.batchSetTags, hcClient);
    }

    /**
     * 用户添加标签
     *
     * 添加标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.createTag);
    }

    /**
     * 用户添加标签
     *
     * 添加标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<>(request, GslMeta.createTag, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.deleteTag);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<>(request, GslMeta.deleteTag, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listTags);
    }

    /**
     * 查询标签列表
     *
     * 查询标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, GslMeta.listTags, hcClient);
    }

    /**
     * 分页查询业务受理明细
     *
     * 分页查询业务受理明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkOrderDetailsRequest 请求对象
     * @return ListWorkOrderDetailsResponse
     */
    public ListWorkOrderDetailsResponse listWorkOrderDetails(ListWorkOrderDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listWorkOrderDetails);
    }

    /**
     * 分页查询业务受理明细
     *
     * 分页查询业务受理明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkOrderDetailsRequest 请求对象
     * @return SyncInvoker<ListWorkOrderDetailsRequest, ListWorkOrderDetailsResponse>
     */
    public SyncInvoker<ListWorkOrderDetailsRequest, ListWorkOrderDetailsResponse> listWorkOrderDetailsInvoker(
        ListWorkOrderDetailsRequest request) {
        return new SyncInvoker<>(request, GslMeta.listWorkOrderDetails, hcClient);
    }

    /**
     * 分页查询业务受理单
     *
     * 分页查询业务受理单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkOrdersRequest 请求对象
     * @return ListWorkOrdersResponse
     */
    public ListWorkOrdersResponse listWorkOrders(ListWorkOrdersRequest request) {
        return hcClient.syncInvokeHttp(request, GslMeta.listWorkOrders);
    }

    /**
     * 分页查询业务受理单
     *
     * 分页查询业务受理单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkOrdersRequest 请求对象
     * @return SyncInvoker<ListWorkOrdersRequest, ListWorkOrdersResponse>
     */
    public SyncInvoker<ListWorkOrdersRequest, ListWorkOrdersResponse> listWorkOrdersInvoker(
        ListWorkOrdersRequest request) {
        return new SyncInvoker<>(request, GslMeta.listWorkOrders, hcClient);
    }

}
