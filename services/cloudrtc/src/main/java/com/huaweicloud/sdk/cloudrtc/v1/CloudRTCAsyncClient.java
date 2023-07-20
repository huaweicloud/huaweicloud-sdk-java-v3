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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudRTCAsyncClient {

    protected HcClient hcClient;

    public CloudRTCAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudRTCAsyncClient> newBuilder() {
        ClientBuilder<CloudRTCAsyncClient> clientBuilder = new ClientBuilder<>(CloudRTCAsyncClient::new);
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
     * @return CompletableFuture<ListRtcAbnormalEventDimensionResponse>
     */
    public CompletableFuture<ListRtcAbnormalEventDimensionResponse> listRtcAbnormalEventDimensionAsync(
        ListRtcAbnormalEventDimensionRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcAbnormalEventDimension);
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
     * @return AsyncInvoker<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse>
     */
    public AsyncInvoker<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse> listRtcAbnormalEventDimensionAsyncInvoker(
        ListRtcAbnormalEventDimensionRequest request) {
        return new AsyncInvoker<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse>(request,
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
     * @return CompletableFuture<ListRtcAbnormalEventsResponse>
     */
    public CompletableFuture<ListRtcAbnormalEventsResponse> listRtcAbnormalEventsAsync(
        ListRtcAbnormalEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcAbnormalEvents);
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
     * @return AsyncInvoker<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse>
     */
    public AsyncInvoker<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse> listRtcAbnormalEventsAsyncInvoker(
        ListRtcAbnormalEventsRequest request) {
        return new AsyncInvoker<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse>(request,
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
     * @return CompletableFuture<ListRtcClientQosDetailsResponse>
     */
    public CompletableFuture<ListRtcClientQosDetailsResponse> listRtcClientQosDetailsAsync(
        ListRtcClientQosDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcClientQosDetails);
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
     * @return AsyncInvoker<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse>
     */
    public AsyncInvoker<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse> listRtcClientQosDetailsAsyncInvoker(
        ListRtcClientQosDetailsRequest request) {
        return new AsyncInvoker<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse>(request,
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
     * @return CompletableFuture<ListRtcHistoryQualityResponse>
     */
    public CompletableFuture<ListRtcHistoryQualityResponse> listRtcHistoryQualityAsync(
        ListRtcHistoryQualityRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcHistoryQuality);
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
     * @return AsyncInvoker<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse>
     */
    public AsyncInvoker<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse> listRtcHistoryQualityAsyncInvoker(
        ListRtcHistoryQualityRequest request) {
        return new AsyncInvoker<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse>(request,
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
     * @return CompletableFuture<ListRtcHistoryScaleResponse>
     */
    public CompletableFuture<ListRtcHistoryScaleResponse> listRtcHistoryScaleAsync(ListRtcHistoryScaleRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcHistoryScale);
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
     * @return AsyncInvoker<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse>
     */
    public AsyncInvoker<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse> listRtcHistoryScaleAsyncInvoker(
        ListRtcHistoryScaleRequest request) {
        return new AsyncInvoker<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse>(request,
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
     * @return CompletableFuture<ListRtcHistoryUsageResponse>
     */
    public CompletableFuture<ListRtcHistoryUsageResponse> listRtcHistoryUsageAsync(ListRtcHistoryUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcHistoryUsage);
    }

    /**
     * 查询用量
     *
     * 查询过去的某一时间段内各种业务的用量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcHistoryUsageRequest 请求对象
     * @return AsyncInvoker<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse>
     */
    public AsyncInvoker<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse> listRtcHistoryUsageAsyncInvoker(
        ListRtcHistoryUsageRequest request) {
        return new AsyncInvoker<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse>(request,
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
     * @return CompletableFuture<ListRtcRealtimeNetworkResponse>
     */
    public CompletableFuture<ListRtcRealtimeNetworkResponse> listRtcRealtimeNetworkAsync(
        ListRtcRealtimeNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcRealtimeNetwork);
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
     * @return AsyncInvoker<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse>
     */
    public AsyncInvoker<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse> listRtcRealtimeNetworkAsyncInvoker(
        ListRtcRealtimeNetworkRequest request) {
        return new AsyncInvoker<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse>(request,
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
     * @return CompletableFuture<ListRtcRealtimeQualityResponse>
     */
    public CompletableFuture<ListRtcRealtimeQualityResponse> listRtcRealtimeQualityAsync(
        ListRtcRealtimeQualityRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcRealtimeQuality);
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
     * @return AsyncInvoker<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse>
     */
    public AsyncInvoker<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse> listRtcRealtimeQualityAsyncInvoker(
        ListRtcRealtimeQualityRequest request) {
        return new AsyncInvoker<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse>(request,
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
     * @return CompletableFuture<ListRtcRealtimeScaleResponse>
     */
    public CompletableFuture<ListRtcRealtimeScaleResponse> listRtcRealtimeScaleAsync(
        ListRtcRealtimeScaleRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcRealtimeScale);
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
     * @return AsyncInvoker<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse>
     */
    public AsyncInvoker<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse> listRtcRealtimeScaleAsyncInvoker(
        ListRtcRealtimeScaleRequest request) {
        return new AsyncInvoker<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse>(request,
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
     * @return CompletableFuture<ListRtcRealtimeScaleDimensionResponse>
     */
    public CompletableFuture<ListRtcRealtimeScaleDimensionResponse> listRtcRealtimeScaleDimensionAsync(
        ListRtcRealtimeScaleDimensionRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcRealtimeScaleDimension);
    }

    /**
     * 查询实时规模分布
     *
     * 对规模相关的数据，根据指定维度按在线用户数排名，获取规模相关的指标在指定维度下的统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRtcRealtimeScaleDimensionRequest 请求对象
     * @return AsyncInvoker<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse>
     */
    public AsyncInvoker<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse> listRtcRealtimeScaleDimensionAsyncInvoker(
        ListRtcRealtimeScaleDimensionRequest request) {
        return new AsyncInvoker<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse>(request,
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
     * @return CompletableFuture<ListRtcRoomListResponse>
     */
    public CompletableFuture<ListRtcRoomListResponse> listRtcRoomListAsync(ListRtcRoomListRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcRoomList);
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
     * @return AsyncInvoker<ListRtcRoomListRequest, ListRtcRoomListResponse>
     */
    public AsyncInvoker<ListRtcRoomListRequest, ListRtcRoomListResponse> listRtcRoomListAsyncInvoker(
        ListRtcRoomListRequest request) {
        return new AsyncInvoker<ListRtcRoomListRequest, ListRtcRoomListResponse>(request, CloudRTCMeta.listRtcRoomList,
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
     * @return CompletableFuture<ListRtcUserListResponse>
     */
    public CompletableFuture<ListRtcUserListResponse> listRtcUserListAsync(ListRtcUserListRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRtcUserList);
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
     * @return AsyncInvoker<ListRtcUserListRequest, ListRtcUserListResponse>
     */
    public AsyncInvoker<ListRtcUserListRequest, ListRtcUserListResponse> listRtcUserListAsyncInvoker(
        ListRtcUserListRequest request) {
        return new AsyncInvoker<ListRtcUserListRequest, ListRtcUserListResponse>(request, CloudRTCMeta.listRtcUserList,
            hcClient);
    }

}
