package com.huaweicloud.sdk.cloudrtc.v1;

import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventDimensionRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventDimensionResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventsRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventsResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcClientQosDetailsRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcClientQosDetailsResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryQualityRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryQualityResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryScaleRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryScaleResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryUsageRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryUsageResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeNetworkRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeNetworkResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeQualityRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeQualityResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeScaleDimensionRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeScaleDimensionResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeScaleRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeScaleResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRoomListRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRoomListResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcUserListRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcUserListResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudRTCClient {

    protected HcClient hcClient;

    public CloudRTCClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudRTCClient> newBuilder() {
        ClientBuilder<CloudRTCClient> clientBuilder = new ClientBuilder<>(CloudRTCClient::new);
        return clientBuilder;
    }

    /**
     * 查询异常事件用户分布
     *
     * 查询指定APP下指定时间内的通话异常明细数据分布情况。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcAbnormalEventDimensionRequest 请求对象
     * @return ListRtcAbnormalEventDimensionResponse
     */
    public ListRtcAbnormalEventDimensionResponse listRtcAbnormalEventDimension(
        ListRtcAbnormalEventDimensionRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcAbnormalEventDimension);
    }

    /**
     * 查询异常事件用户分布
     *
     * 查询指定APP下指定时间内的通话异常明细数据分布情况。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcAbnormalEventDimensionRequest 请求对象
     * @return SyncInvoker<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse>
     */
    public SyncInvoker<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse> listRtcAbnormalEventDimensionInvoker(
        ListRtcAbnormalEventDimensionRequest request) {
        return new SyncInvoker<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse>(request,
            CloudRTCMeta.listRtcAbnormalEventDimension, hcClient);
    }

    /**
     * 查询用户异常体验事件
     *
     * 查询指定APP下通话的异常明细数据。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcAbnormalEventsRequest 请求对象
     * @return ListRtcAbnormalEventsResponse
     */
    public ListRtcAbnormalEventsResponse listRtcAbnormalEvents(ListRtcAbnormalEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcAbnormalEvents);
    }

    /**
     * 查询用户异常体验事件
     *
     * 查询指定APP下通话的异常明细数据。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcAbnormalEventsRequest 请求对象
     * @return SyncInvoker<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse>
     */
    public SyncInvoker<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse> listRtcAbnormalEventsInvoker(
        ListRtcAbnormalEventsRequest request) {
        return new SyncInvoker<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse>(request,
            CloudRTCMeta.listRtcAbnormalEvents, hcClient);
    }

    /**
     * 查询用户通话指标
     *
     * 查询用户通话质量指标数据。
     * 
     * 可查询5天内的数据，mid 不为null，查询实时数据时，查询起止时间不超过24个小时，每次查询单个用户时，支持跨天查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcClientQosDetailsRequest 请求对象
     * @return ListRtcClientQosDetailsResponse
     */
    public ListRtcClientQosDetailsResponse listRtcClientQosDetails(ListRtcClientQosDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcClientQosDetails);
    }

    /**
     * 查询用户通话指标
     *
     * 查询用户通话质量指标数据。
     * 
     * 可查询5天内的数据，mid 不为null，查询实时数据时，查询起止时间不超过24个小时，每次查询单个用户时，支持跨天查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcClientQosDetailsRequest 请求对象
     * @return SyncInvoker<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse>
     */
    public SyncInvoker<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse> listRtcClientQosDetailsInvoker(
        ListRtcClientQosDetailsRequest request) {
        return new SyncInvoker<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse>(request,
            CloudRTCMeta.listRtcClientQosDetails, hcClient);
    }

    /**
     * 查询历史质量
     *
     * 查询质量指标过去每天的体验数据，可查询最近31天的数据。当天未结束，无法查询到当天的体验数据。
     * 
     * 最大查询跨度31天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcHistoryQualityRequest 请求对象
     * @return ListRtcHistoryQualityResponse
     */
    public ListRtcHistoryQualityResponse listRtcHistoryQuality(ListRtcHistoryQualityRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcHistoryQuality);
    }

    /**
     * 查询历史质量
     *
     * 查询质量指标过去每天的体验数据，可查询最近31天的数据。当天未结束，无法查询到当天的体验数据。
     * 
     * 最大查询跨度31天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcHistoryQualityRequest 请求对象
     * @return SyncInvoker<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse>
     */
    public SyncInvoker<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse> listRtcHistoryQualityInvoker(
        ListRtcHistoryQualityRequest request) {
        return new SyncInvoker<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse>(request,
            CloudRTCMeta.listRtcHistoryQuality, hcClient);
    }

    /**
     * 查询历史规模
     *
     * 查询指标过去每天的规模数量，可查询最近31天的数据。当天未结束，无法查到当天的房间数与用户数。
     * 
     * 最大查询跨度31天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcHistoryScaleRequest 请求对象
     * @return ListRtcHistoryScaleResponse
     */
    public ListRtcHistoryScaleResponse listRtcHistoryScale(ListRtcHistoryScaleRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcHistoryScale);
    }

    /**
     * 查询历史规模
     *
     * 查询指标过去每天的规模数量，可查询最近31天的数据。当天未结束，无法查到当天的房间数与用户数。
     * 
     * 最大查询跨度31天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcHistoryScaleRequest 请求对象
     * @return SyncInvoker<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse>
     */
    public SyncInvoker<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse> listRtcHistoryScaleInvoker(
        ListRtcHistoryScaleRequest request) {
        return new SyncInvoker<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse>(request,
            CloudRTCMeta.listRtcHistoryScale, hcClient);
    }

    /**
     * 查询用量
     *
     * 查询过去的某一时间段内各种业务的用量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcHistoryUsageRequest 请求对象
     * @return ListRtcHistoryUsageResponse
     */
    public ListRtcHistoryUsageResponse listRtcHistoryUsage(ListRtcHistoryUsageRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcHistoryUsage);
    }

    /**
     * 查询用量
     *
     * 查询过去的某一时间段内各种业务的用量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcHistoryUsageRequest 请求对象
     * @return SyncInvoker<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse>
     */
    public SyncInvoker<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse> listRtcHistoryUsageInvoker(
        ListRtcHistoryUsageRequest request) {
        return new SyncInvoker<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse>(request,
            CloudRTCMeta.listRtcHistoryUsage, hcClient);
    }

    /**
     * 查询实时网络
     *
     * 获取实时网络数据相关指标在某一时间段内每分钟的统计数据。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRealtimeNetworkRequest 请求对象
     * @return ListRtcRealtimeNetworkResponse
     */
    public ListRtcRealtimeNetworkResponse listRtcRealtimeNetwork(ListRtcRealtimeNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcRealtimeNetwork);
    }

    /**
     * 查询实时网络
     *
     * 获取实时网络数据相关指标在某一时间段内每分钟的统计数据。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRealtimeNetworkRequest 请求对象
     * @return SyncInvoker<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse>
     */
    public SyncInvoker<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse> listRtcRealtimeNetworkInvoker(
        ListRtcRealtimeNetworkRequest request) {
        return new SyncInvoker<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse>(request,
            CloudRTCMeta.listRtcRealtimeNetwork, hcClient);
    }

    /**
     * 查询实时质量数据
     *
     * 获取实时质量数据的相关指标在某一时间段内每分钟的统计数据。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRealtimeQualityRequest 请求对象
     * @return ListRtcRealtimeQualityResponse
     */
    public ListRtcRealtimeQualityResponse listRtcRealtimeQuality(ListRtcRealtimeQualityRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcRealtimeQuality);
    }

    /**
     * 查询实时质量数据
     *
     * 获取实时质量数据的相关指标在某一时间段内每分钟的统计数据。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRealtimeQualityRequest 请求对象
     * @return SyncInvoker<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse>
     */
    public SyncInvoker<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse> listRtcRealtimeQualityInvoker(
        ListRtcRealtimeQualityRequest request) {
        return new SyncInvoker<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse>(request,
            CloudRTCMeta.listRtcRealtimeQuality, hcClient);
    }

    /**
     * 查询实时规模
     *
     * 获取规模相关的指标在某一时间段内每分钟的统计数据。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRealtimeScaleRequest 请求对象
     * @return ListRtcRealtimeScaleResponse
     */
    public ListRtcRealtimeScaleResponse listRtcRealtimeScale(ListRtcRealtimeScaleRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcRealtimeScale);
    }

    /**
     * 查询实时规模
     *
     * 获取规模相关的指标在某一时间段内每分钟的统计数据。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRealtimeScaleRequest 请求对象
     * @return SyncInvoker<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse>
     */
    public SyncInvoker<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse> listRtcRealtimeScaleInvoker(
        ListRtcRealtimeScaleRequest request) {
        return new SyncInvoker<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse>(request,
            CloudRTCMeta.listRtcRealtimeScale, hcClient);
    }

    /**
     * 查询实时规模分布
     *
     * 对规模相关的数据，根据指定维度按在线用户数排名，获取规模相关的指标在指定维度下的统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRealtimeScaleDimensionRequest 请求对象
     * @return ListRtcRealtimeScaleDimensionResponse
     */
    public ListRtcRealtimeScaleDimensionResponse listRtcRealtimeScaleDimension(
        ListRtcRealtimeScaleDimensionRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcRealtimeScaleDimension);
    }

    /**
     * 查询实时规模分布
     *
     * 对规模相关的数据，根据指定维度按在线用户数排名，获取规模相关的指标在指定维度下的统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRealtimeScaleDimensionRequest 请求对象
     * @return SyncInvoker<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse>
     */
    public SyncInvoker<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse> listRtcRealtimeScaleDimensionInvoker(
        ListRtcRealtimeScaleDimensionRequest request) {
        return new SyncInvoker<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse>(request,
            CloudRTCMeta.listRtcRealtimeScaleDimension, hcClient);
    }

    /**
     * 查询房间列表
     *
     * 指定事件范围查询这段期间创建的房间列表。
     * 
     * 最大查询跨度90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRoomListRequest 请求对象
     * @return ListRtcRoomListResponse
     */
    public ListRtcRoomListResponse listRtcRoomList(ListRtcRoomListRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcRoomList);
    }

    /**
     * 查询房间列表
     *
     * 指定事件范围查询这段期间创建的房间列表。
     * 
     * 最大查询跨度90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRoomListRequest 请求对象
     * @return SyncInvoker<ListRtcRoomListRequest, ListRtcRoomListResponse>
     */
    public SyncInvoker<ListRtcRoomListRequest, ListRtcRoomListResponse> listRtcRoomListInvoker(
        ListRtcRoomListRequest request) {
        return new SyncInvoker<ListRtcRoomListRequest, ListRtcRoomListResponse>(request, CloudRTCMeta.listRtcRoomList,
            hcClient);
    }

    /**
     * 查询用户列表
     *
     * 指定事件范围查询这段期间加入房间的用户列表。
     * 
     * 最大查询跨度90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcUserListRequest 请求对象
     * @return ListRtcUserListResponse
     */
    public ListRtcUserListResponse listRtcUserList(ListRtcUserListRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRtcUserList);
    }

    /**
     * 查询用户列表
     *
     * 指定事件范围查询这段期间加入房间的用户列表。
     * 
     * 最大查询跨度90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcUserListRequest 请求对象
     * @return SyncInvoker<ListRtcUserListRequest, ListRtcUserListResponse>
     */
    public SyncInvoker<ListRtcUserListRequest, ListRtcUserListResponse> listRtcUserListInvoker(
        ListRtcUserListRequest request) {
        return new SyncInvoker<ListRtcUserListRequest, ListRtcUserListResponse>(request, CloudRTCMeta.listRtcUserList,
            hcClient);
    }

}
