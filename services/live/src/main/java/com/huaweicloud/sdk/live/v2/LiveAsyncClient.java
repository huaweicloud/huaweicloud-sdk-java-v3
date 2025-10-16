package com.huaweicloud.sdk.live.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.live.v2.model.ListAreaDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListAreaDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListBandwidthDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListBandwidthDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListDomainBandwidthPeakRequest;
import com.huaweicloud.sdk.live.v2.model.ListDomainBandwidthPeakResponse;
import com.huaweicloud.sdk.live.v2.model.ListDomainTrafficDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListDomainTrafficDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListDomainTrafficSummaryRequest;
import com.huaweicloud.sdk.live.v2.model.ListDomainTrafficSummaryResponse;
import com.huaweicloud.sdk.live.v2.model.ListHistoryStreamsRequest;
import com.huaweicloud.sdk.live.v2.model.ListHistoryStreamsResponse;
import com.huaweicloud.sdk.live.v2.model.ListPlayDomainStreamInfoRequest;
import com.huaweicloud.sdk.live.v2.model.ListPlayDomainStreamInfoResponse;
import com.huaweicloud.sdk.live.v2.model.ListQueryHttpCodeRequest;
import com.huaweicloud.sdk.live.v2.model.ListQueryHttpCodeResponse;
import com.huaweicloud.sdk.live.v2.model.ListRecordDataRequest;
import com.huaweicloud.sdk.live.v2.model.ListRecordDataResponse;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamBitrateRequest;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamBitrateResponse;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamFramerateRequest;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamFramerateResponse;
import com.huaweicloud.sdk.live.v2.model.ListSnapshotDataRequest;
import com.huaweicloud.sdk.live.v2.model.ListSnapshotDataResponse;
import com.huaweicloud.sdk.live.v2.model.ListTranscodeConcurrencyNumRequest;
import com.huaweicloud.sdk.live.v2.model.ListTranscodeConcurrencyNumResponse;
import com.huaweicloud.sdk.live.v2.model.ListTranscodeDataRequest;
import com.huaweicloud.sdk.live.v2.model.ListTranscodeDataResponse;
import com.huaweicloud.sdk.live.v2.model.ListUpStreamDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListUpStreamDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListUsersOfStreamRequest;
import com.huaweicloud.sdk.live.v2.model.ListUsersOfStreamResponse;
import com.huaweicloud.sdk.live.v2.model.ShowStreamCountRequest;
import com.huaweicloud.sdk.live.v2.model.ShowStreamCountResponse;
import com.huaweicloud.sdk.live.v2.model.ShowStreamPortraitRequest;
import com.huaweicloud.sdk.live.v2.model.ShowStreamPortraitResponse;
import com.huaweicloud.sdk.live.v2.model.ShowUpBandwidthRequest;
import com.huaweicloud.sdk.live.v2.model.ShowUpBandwidthResponse;

import java.util.concurrent.CompletableFuture;

public class LiveAsyncClient {

    protected HcClient hcClient;

    public LiveAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveAsyncClient> newBuilder() {
        ClientBuilder<LiveAsyncClient> clientBuilder = new ClientBuilder<>(LiveAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 查询直播各区域指标分布接口
     *
     * 查询直播全球区域维度的详细数据接口。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的详细数据。
     * 
     * 当查询租户级别数据时，参数app、stream不生效。
     * 
     * 最大查询跨度1天，最大查询周期90天。
     * 
     * 支持查询当天，当前数据延时少于5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreaDetailRequest 请求对象
     * @return CompletableFuture<ListAreaDetailResponse>
     */
    public CompletableFuture<ListAreaDetailResponse> listAreaDetailAsync(ListAreaDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listAreaDetail);
    }

    /**
     * 查询直播各区域指标分布接口
     *
     * 查询直播全球区域维度的详细数据接口。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的详细数据。
     * 
     * 当查询租户级别数据时，参数app、stream不生效。
     * 
     * 最大查询跨度1天，最大查询周期90天。
     * 
     * 支持查询当天，当前数据延时少于5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAreaDetailRequest 请求对象
     * @return AsyncInvoker<ListAreaDetailRequest, ListAreaDetailResponse>
     */
    public AsyncInvoker<ListAreaDetailRequest, ListAreaDetailResponse> listAreaDetailAsyncInvoker(
        ListAreaDetailRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listAreaDetail, hcClient);
    }

    /**
     * 查询播放带宽趋势接口
     *
     * 查询播放域名带宽数据。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的带宽数据。
     * 
     * 当查询租户级别带宽数据时，参数app、stream不生效。
     * 
     * 最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthDetailRequest 请求对象
     * @return CompletableFuture<ListBandwidthDetailResponse>
     */
    public CompletableFuture<ListBandwidthDetailResponse> listBandwidthDetailAsync(ListBandwidthDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listBandwidthDetail);
    }

    /**
     * 查询播放带宽趋势接口
     *
     * 查询播放域名带宽数据。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的带宽数据。
     * 
     * 当查询租户级别带宽数据时，参数app、stream不生效。
     * 
     * 最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthDetailRequest 请求对象
     * @return AsyncInvoker<ListBandwidthDetailRequest, ListBandwidthDetailResponse>
     */
    public AsyncInvoker<ListBandwidthDetailRequest, ListBandwidthDetailResponse> listBandwidthDetailAsyncInvoker(
        ListBandwidthDetailRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listBandwidthDetail, hcClient);
    }

    /**
     * 查询播放带宽峰值接口
     *
     * 查询指定时间范围内播放带宽峰值。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的带宽峰值。
     * 
     * 当查询租户级别带宽数据时，参数app、stream不生效。
     * 
     * 最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainBandwidthPeakRequest 请求对象
     * @return CompletableFuture<ListDomainBandwidthPeakResponse>
     */
    public CompletableFuture<ListDomainBandwidthPeakResponse> listDomainBandwidthPeakAsync(
        ListDomainBandwidthPeakRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listDomainBandwidthPeak);
    }

    /**
     * 查询播放带宽峰值接口
     *
     * 查询指定时间范围内播放带宽峰值。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的带宽峰值。
     * 
     * 当查询租户级别带宽数据时，参数app、stream不生效。
     * 
     * 最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainBandwidthPeakRequest 请求对象
     * @return AsyncInvoker<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse>
     */
    public AsyncInvoker<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse> listDomainBandwidthPeakAsyncInvoker(
        ListDomainBandwidthPeakRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listDomainBandwidthPeak, hcClient);
    }

    /**
     * 查询播放流量趋势接口
     *
     * 查询播放域名流量数据。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的流量数据。
     * 
     * 当查询租户级别流量数据时，参数app、stream不生效。
     * 
     * 最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainTrafficDetailRequest 请求对象
     * @return CompletableFuture<ListDomainTrafficDetailResponse>
     */
    public CompletableFuture<ListDomainTrafficDetailResponse> listDomainTrafficDetailAsync(
        ListDomainTrafficDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listDomainTrafficDetail);
    }

    /**
     * 查询播放流量趋势接口
     *
     * 查询播放域名流量数据。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的流量数据。
     * 
     * 当查询租户级别流量数据时，参数app、stream不生效。
     * 
     * 最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainTrafficDetailRequest 请求对象
     * @return AsyncInvoker<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse>
     */
    public AsyncInvoker<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse> listDomainTrafficDetailAsyncInvoker(
        ListDomainTrafficDetailRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listDomainTrafficDetail, hcClient);
    }

    /**
     * 查询播放流量汇总接口
     *
     * 查询指定时间范围内流量汇总量。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的流量汇总量。
     * 
     * 当查询租户级别流量数据时，参数app、stream不生效。
     * 
     * 最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainTrafficSummaryRequest 请求对象
     * @return CompletableFuture<ListDomainTrafficSummaryResponse>
     */
    public CompletableFuture<ListDomainTrafficSummaryResponse> listDomainTrafficSummaryAsync(
        ListDomainTrafficSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listDomainTrafficSummary);
    }

    /**
     * 查询播放流量汇总接口
     *
     * 查询指定时间范围内流量汇总量。
     * 
     * 如果不传入域名，则查询租户下所有播放域名的流量汇总量。
     * 
     * 当查询租户级别流量数据时，参数app、stream不生效。
     * 
     * 最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainTrafficSummaryRequest 请求对象
     * @return AsyncInvoker<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse>
     */
    public AsyncInvoker<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse> listDomainTrafficSummaryAsyncInvoker(
        ListDomainTrafficSummaryRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listDomainTrafficSummary, hcClient);
    }

    /**
     * 查询历史推流列表接口
     *
     * 查询历史推流列表。
     * 
     * 不能查询现推流。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryStreamsRequest 请求对象
     * @return CompletableFuture<ListHistoryStreamsResponse>
     */
    public CompletableFuture<ListHistoryStreamsResponse> listHistoryStreamsAsync(ListHistoryStreamsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listHistoryStreams);
    }

    /**
     * 查询历史推流列表接口
     *
     * 查询历史推流列表。
     * 
     * 不能查询现推流。
     * 
     * 最大查询跨度1天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryStreamsRequest 请求对象
     * @return AsyncInvoker<ListHistoryStreamsRequest, ListHistoryStreamsResponse>
     */
    public AsyncInvoker<ListHistoryStreamsRequest, ListHistoryStreamsResponse> listHistoryStreamsAsyncInvoker(
        ListHistoryStreamsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listHistoryStreams, hcClient);
    }

    /**
     * 查询播放域名下的流数据
     *
     * 查询播放域名下的监控数据，根据输入时间点，返回查询该时间点所有流的带宽、在线人数、协议。
     * 返回的数据粒度为1分钟。
     * 最大查询周期7天，数据延迟5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlayDomainStreamInfoRequest 请求对象
     * @return CompletableFuture<ListPlayDomainStreamInfoResponse>
     */
    public CompletableFuture<ListPlayDomainStreamInfoResponse> listPlayDomainStreamInfoAsync(
        ListPlayDomainStreamInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listPlayDomainStreamInfo);
    }

    /**
     * 查询播放域名下的流数据
     *
     * 查询播放域名下的监控数据，根据输入时间点，返回查询该时间点所有流的带宽、在线人数、协议。
     * 返回的数据粒度为1分钟。
     * 最大查询周期7天，数据延迟5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlayDomainStreamInfoRequest 请求对象
     * @return AsyncInvoker<ListPlayDomainStreamInfoRequest, ListPlayDomainStreamInfoResponse>
     */
    public AsyncInvoker<ListPlayDomainStreamInfoRequest, ListPlayDomainStreamInfoResponse> listPlayDomainStreamInfoAsyncInvoker(
        ListPlayDomainStreamInfoRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listPlayDomainStreamInfo, hcClient);
    }

    /**
     * 查询直播拉流HTTP状态码接口
     *
     * 查询直播拉流HTTP状态码接口。  获取加速域名1分钟粒度的HTTP返回码  最大查询跨度不能超过24小时，最大查询周期7天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryHttpCodeRequest 请求对象
     * @return CompletableFuture<ListQueryHttpCodeResponse>
     */
    public CompletableFuture<ListQueryHttpCodeResponse> listQueryHttpCodeAsync(ListQueryHttpCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listQueryHttpCode);
    }

    /**
     * 查询直播拉流HTTP状态码接口
     *
     * 查询直播拉流HTTP状态码接口。  获取加速域名1分钟粒度的HTTP返回码  最大查询跨度不能超过24小时，最大查询周期7天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryHttpCodeRequest 请求对象
     * @return AsyncInvoker<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse>
     */
    public AsyncInvoker<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> listQueryHttpCodeAsyncInvoker(
        ListQueryHttpCodeRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listQueryHttpCode, hcClient);
    }

    /**
     * 查询录制用量接口
     *
     * 查询直播租户每小时录制的最大并发数，计算1小时内每分钟的并发总路数，取最大值做为统计值。  最大查询跨度31天，最大查询周期90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordDataRequest 请求对象
     * @return CompletableFuture<ListRecordDataResponse>
     */
    public CompletableFuture<ListRecordDataResponse> listRecordDataAsync(ListRecordDataRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listRecordData);
    }

    /**
     * 查询录制用量接口
     *
     * 查询直播租户每小时录制的最大并发数，计算1小时内每分钟的并发总路数，取最大值做为统计值。  最大查询跨度31天，最大查询周期90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordDataRequest 请求对象
     * @return AsyncInvoker<ListRecordDataRequest, ListRecordDataResponse>
     */
    public AsyncInvoker<ListRecordDataRequest, ListRecordDataResponse> listRecordDataAsyncInvoker(
        ListRecordDataRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listRecordData, hcClient);
    }

    /**
     * 查询截图用量接口
     *
     * 查询直播域名每小时的截图数量。  最大查询跨度31天，最大查询周期90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotDataRequest 请求对象
     * @return CompletableFuture<ListSnapshotDataResponse>
     */
    public CompletableFuture<ListSnapshotDataResponse> listSnapshotDataAsync(ListSnapshotDataRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listSnapshotData);
    }

    /**
     * 查询截图用量接口
     *
     * 查询直播域名每小时的截图数量。  最大查询跨度31天，最大查询周期90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotDataRequest 请求对象
     * @return AsyncInvoker<ListSnapshotDataRequest, ListSnapshotDataResponse>
     */
    public AsyncInvoker<ListSnapshotDataRequest, ListSnapshotDataResponse> listSnapshotDataAsyncInvoker(
        ListSnapshotDataRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listSnapshotData, hcClient);
    }

    /**
     * 查询推流域名转码路数
     *
     * 查询推流域名下的转码路数，根据输入时间点和时间粒度，返回转码路数。
     * 最大查询跨度1天，最大查询周期90天，数据延迟5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodeConcurrencyNumRequest 请求对象
     * @return CompletableFuture<ListTranscodeConcurrencyNumResponse>
     */
    public CompletableFuture<ListTranscodeConcurrencyNumResponse> listTranscodeConcurrencyNumAsync(
        ListTranscodeConcurrencyNumRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listTranscodeConcurrencyNum);
    }

    /**
     * 查询推流域名转码路数
     *
     * 查询推流域名下的转码路数，根据输入时间点和时间粒度，返回转码路数。
     * 最大查询跨度1天，最大查询周期90天，数据延迟5分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodeConcurrencyNumRequest 请求对象
     * @return AsyncInvoker<ListTranscodeConcurrencyNumRequest, ListTranscodeConcurrencyNumResponse>
     */
    public AsyncInvoker<ListTranscodeConcurrencyNumRequest, ListTranscodeConcurrencyNumResponse> listTranscodeConcurrencyNumAsyncInvoker(
        ListTranscodeConcurrencyNumRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listTranscodeConcurrencyNum, hcClient);
    }

    /**
     * 查询转码用量接口
     *
     * 查询直播域名每小时的转码时长数据。  最大查询跨度31天，最大查询周期90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodeDataRequest 请求对象
     * @return CompletableFuture<ListTranscodeDataResponse>
     */
    public CompletableFuture<ListTranscodeDataResponse> listTranscodeDataAsync(ListTranscodeDataRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listTranscodeData);
    }

    /**
     * 查询转码用量接口
     *
     * 查询直播域名每小时的转码时长数据。  最大查询跨度31天，最大查询周期90天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodeDataRequest 请求对象
     * @return AsyncInvoker<ListTranscodeDataRequest, ListTranscodeDataResponse>
     */
    public AsyncInvoker<ListTranscodeDataRequest, ListTranscodeDataResponse> listTranscodeDataAsyncInvoker(
        ListTranscodeDataRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listTranscodeData, hcClient);
    }

    /**
     * 查询观众趋势接口
     *
     * 查询观众趋势。  最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersOfStreamRequest 请求对象
     * @return CompletableFuture<ListUsersOfStreamResponse>
     */
    public CompletableFuture<ListUsersOfStreamResponse> listUsersOfStreamAsync(ListUsersOfStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listUsersOfStream);
    }

    /**
     * 查询观众趋势接口
     *
     * 查询观众趋势。  最大查询跨度31天，最大查询周期一年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersOfStreamRequest 请求对象
     * @return AsyncInvoker<ListUsersOfStreamRequest, ListUsersOfStreamResponse>
     */
    public AsyncInvoker<ListUsersOfStreamRequest, ListUsersOfStreamResponse> listUsersOfStreamAsyncInvoker(
        ListUsersOfStreamRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listUsersOfStream, hcClient);
    }

    /**
     * 查询域名维度推流路数接口
     *
     * 查询域名维度推流路数接口。  最大查询跨度31天，最大查询周期1年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStreamCountRequest 请求对象
     * @return CompletableFuture<ShowStreamCountResponse>
     */
    public CompletableFuture<ShowStreamCountResponse> showStreamCountAsync(ShowStreamCountRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showStreamCount);
    }

    /**
     * 查询域名维度推流路数接口
     *
     * 查询域名维度推流路数接口。  最大查询跨度31天，最大查询周期1年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStreamCountRequest 请求对象
     * @return AsyncInvoker<ShowStreamCountRequest, ShowStreamCountResponse>
     */
    public AsyncInvoker<ShowStreamCountRequest, ShowStreamCountResponse> showStreamCountAsyncInvoker(
        ShowStreamCountRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showStreamCount, hcClient);
    }

    /**
     * 查询播放画像信息接口
     *
     * 查询播放画像信息。  最大查询跨度1天，最大查询周期31天。
     * 不统计协议为HLS的播放时长（play_duration）信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStreamPortraitRequest 请求对象
     * @return CompletableFuture<ShowStreamPortraitResponse>
     */
    public CompletableFuture<ShowStreamPortraitResponse> showStreamPortraitAsync(ShowStreamPortraitRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showStreamPortrait);
    }

    /**
     * 查询播放画像信息接口
     *
     * 查询播放画像信息。  最大查询跨度1天，最大查询周期31天。
     * 不统计协议为HLS的播放时长（play_duration）信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStreamPortraitRequest 请求对象
     * @return AsyncInvoker<ShowStreamPortraitRequest, ShowStreamPortraitResponse>
     */
    public AsyncInvoker<ShowStreamPortraitRequest, ShowStreamPortraitResponse> showStreamPortraitAsyncInvoker(
        ShowStreamPortraitRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showStreamPortrait, hcClient);
    }

    /**
     * 查询上行带宽数据接口
     *
     * 查询上行带宽数据。  最大查询跨度31天，最大查询周期1年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpBandwidthRequest 请求对象
     * @return CompletableFuture<ShowUpBandwidthResponse>
     */
    public CompletableFuture<ShowUpBandwidthResponse> showUpBandwidthAsync(ShowUpBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showUpBandwidth);
    }

    /**
     * 查询上行带宽数据接口
     *
     * 查询上行带宽数据。  最大查询跨度31天，最大查询周期1年。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpBandwidthRequest 请求对象
     * @return AsyncInvoker<ShowUpBandwidthRequest, ShowUpBandwidthResponse>
     */
    public AsyncInvoker<ShowUpBandwidthRequest, ShowUpBandwidthResponse> showUpBandwidthAsyncInvoker(
        ShowUpBandwidthRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showUpBandwidth, hcClient);
    }

    /**
     * 查询推流码率数据接口
     *
     * 查询推流监控码率数据接口。
     * 
     * 最大查询跨度1天，最大查询周期1个月。
     * 
     * 返回的码率数据列表粒度为1秒钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSingleStreamBitrateRequest 请求对象
     * @return CompletableFuture<ListSingleStreamBitrateResponse>
     */
    public CompletableFuture<ListSingleStreamBitrateResponse> listSingleStreamBitrateAsync(
        ListSingleStreamBitrateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listSingleStreamBitrate);
    }

    /**
     * 查询推流码率数据接口
     *
     * 查询推流监控码率数据接口。
     * 
     * 最大查询跨度1天，最大查询周期1个月。
     * 
     * 返回的码率数据列表粒度为1秒钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSingleStreamBitrateRequest 请求对象
     * @return AsyncInvoker<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse>
     */
    public AsyncInvoker<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse> listSingleStreamBitrateAsyncInvoker(
        ListSingleStreamBitrateRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listSingleStreamBitrate, hcClient);
    }

    /**
     * 查询推流监控数据接口
     *
     * 查询流监控数据接口，包括帧率码率断流情况。
     * 
     * 最大查询跨度1天，最大查询周期1个月。
     * 
     * 返回的码率数据列表粒度为1秒钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSingleStreamDetailRequest 请求对象
     * @return CompletableFuture<ListSingleStreamDetailResponse>
     */
    public CompletableFuture<ListSingleStreamDetailResponse> listSingleStreamDetailAsync(
        ListSingleStreamDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listSingleStreamDetail);
    }

    /**
     * 查询推流监控数据接口
     *
     * 查询流监控数据接口，包括帧率码率断流情况。
     * 
     * 最大查询跨度1天，最大查询周期1个月。
     * 
     * 返回的码率数据列表粒度为1秒钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSingleStreamDetailRequest 请求对象
     * @return AsyncInvoker<ListSingleStreamDetailRequest, ListSingleStreamDetailResponse>
     */
    public AsyncInvoker<ListSingleStreamDetailRequest, ListSingleStreamDetailResponse> listSingleStreamDetailAsyncInvoker(
        ListSingleStreamDetailRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listSingleStreamDetail, hcClient);
    }

    /**
     * 查询推流帧率数据接口
     *
     * 查询推流帧率数据接口。
     * 
     * 最大查询跨度1天，最大查询周期1个月。
     * 
     * 返回的帧率数据列表粒度为1秒钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSingleStreamFramerateRequest 请求对象
     * @return CompletableFuture<ListSingleStreamFramerateResponse>
     */
    public CompletableFuture<ListSingleStreamFramerateResponse> listSingleStreamFramerateAsync(
        ListSingleStreamFramerateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listSingleStreamFramerate);
    }

    /**
     * 查询推流帧率数据接口
     *
     * 查询推流帧率数据接口。
     * 
     * 最大查询跨度1天，最大查询周期1个月。
     * 
     * 返回的帧率数据列表粒度为1秒钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSingleStreamFramerateRequest 请求对象
     * @return AsyncInvoker<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse>
     */
    public AsyncInvoker<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse> listSingleStreamFramerateAsyncInvoker(
        ListSingleStreamFramerateRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listSingleStreamFramerate, hcClient);
    }

    /**
     * 查询CDN上行推流质量数据接口
     *
     * 查询CDN上行推流质量数据。
     * 
     * 最大查询跨度1天，最大查询周期7天。
     * 
     * 返回的CDN上行推流质量数据列表粒度为1分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpStreamDetailRequest 请求对象
     * @return CompletableFuture<ListUpStreamDetailResponse>
     */
    public CompletableFuture<ListUpStreamDetailResponse> listUpStreamDetailAsync(ListUpStreamDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listUpStreamDetail);
    }

    /**
     * 查询CDN上行推流质量数据接口
     *
     * 查询CDN上行推流质量数据。
     * 
     * 最大查询跨度1天，最大查询周期7天。
     * 
     * 返回的CDN上行推流质量数据列表粒度为1分钟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpStreamDetailRequest 请求对象
     * @return AsyncInvoker<ListUpStreamDetailRequest, ListUpStreamDetailResponse>
     */
    public AsyncInvoker<ListUpStreamDetailRequest, ListUpStreamDetailResponse> listUpStreamDetailAsyncInvoker(
        ListUpStreamDetailRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listUpStreamDetail, hcClient);
    }

}
