package com.huaweicloud.sdk.live.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.live.v2.model.*;

public class LiveAsyncClient {
    protected HcClient hcClient;

    public LiveAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveAsyncClient> newBuilder() {
        return new ClientBuilder<>(LiveAsyncClient::new);
    }


    /**
     * 查询播放带宽趋势接口
     * 查询播放域名带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListBandwidthDetailRequest 请求对象
     * @return CompletableFuture<ListBandwidthDetailResponse>
     */
    public CompletableFuture<ListBandwidthDetailResponse> listBandwidthDetailAsync(ListBandwidthDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listBandwidthDetail);
    }

    /**
     * 查询播放带宽峰值接口
     * 查询指定时间范围内播放带宽峰值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainBandwidthPeakRequest 请求对象
     * @return CompletableFuture<ListDomainBandwidthPeakResponse>
     */
    public CompletableFuture<ListDomainBandwidthPeakResponse> listDomainBandwidthPeakAsync(ListDomainBandwidthPeakRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listDomainBandwidthPeak);
    }

    /**
     * 查询播放流量趋势接口
     * 查询播放域名流量数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficDetailRequest 请求对象
     * @return CompletableFuture<ListDomainTrafficDetailResponse>
     */
    public CompletableFuture<ListDomainTrafficDetailResponse> listDomainTrafficDetailAsync(ListDomainTrafficDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listDomainTrafficDetail);
    }

    /**
     * 查询播放流量汇总接口
     * 查询指定时间范围内流量汇总量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficSummaryRequest 请求对象
     * @return CompletableFuture<ListDomainTrafficSummaryResponse>
     */
    public CompletableFuture<ListDomainTrafficSummaryResponse> listDomainTrafficSummaryAsync(ListDomainTrafficSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listDomainTrafficSummary);
    }

    /**
     * 查询历史推流列表接口
     * 查询历史推流列表。  最大查询跨度1天，最大查询周期7天。
     *
     * @param ListHistoryStreamsRequest 请求对象
     * @return CompletableFuture<ListHistoryStreamsResponse>
     */
    public CompletableFuture<ListHistoryStreamsResponse> listHistoryStreamsAsync(ListHistoryStreamsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listHistoryStreams);
    }

    /**
     * 查询直播拉流HTTP状态码接口
     * 查询直播拉流HTTP状态码接口。  获取加速域名1分钟粒度的HTTP返回码  最大查询跨度不能超过24小时，最大查询周期7天。
     *
     * @param ListQueryHttpCodeRequest 请求对象
     * @return CompletableFuture<ListQueryHttpCodeResponse>
     */
    public CompletableFuture<ListQueryHttpCodeResponse> listQueryHttpCodeAsync(ListQueryHttpCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listQueryHttpCode);
    }

    /**
     * 查询录制用量接口
     * 查询直播租户每小时录制的最大并发数，计算1小时内每分钟的并发总路数，取最大值做为统计值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListRecordDataRequest 请求对象
     * @return CompletableFuture<ListRecordDataResponse>
     */
    public CompletableFuture<ListRecordDataResponse> listRecordDataAsync(ListRecordDataRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listRecordData);
    }

    /**
     * 查询截图用量接口
     * 查询直播域名每小时的截图数量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListSnapshotDataRequest 请求对象
     * @return CompletableFuture<ListSnapshotDataResponse>
     */
    public CompletableFuture<ListSnapshotDataResponse> listSnapshotDataAsync(ListSnapshotDataRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listSnapshotData);
    }

    /**
     * 查询转码用量接口
     * 查询直播域名每小时的转码时长数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListTranscodeDataRequest 请求对象
     * @return CompletableFuture<ListTranscodeDataResponse>
     */
    public CompletableFuture<ListTranscodeDataResponse> listTranscodeDataAsync(ListTranscodeDataRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listTranscodeData);
    }

    /**
     * 查询观众趋势接口
     * 查询观众趋势。  最大查询跨度7天，最大查询周期90天。
     *
     * @param ListUsersOfStreamRequest 请求对象
     * @return CompletableFuture<ListUsersOfStreamResponse>
     */
    public CompletableFuture<ListUsersOfStreamResponse> listUsersOfStreamAsync(ListUsersOfStreamRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listUsersOfStream);
    }

    /**
     * 查询域名维度推流路数接口
     * 查询域名维度推流路数接口。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowStreamCountRequest 请求对象
     * @return CompletableFuture<ShowStreamCountResponse>
     */
    public CompletableFuture<ShowStreamCountResponse> showStreamCountAsync(ShowStreamCountRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showStreamCount);
    }

    /**
     * 查询上行带宽数据接口
     * 查询上行带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowUpBandwidthRequest 请求对象
     * @return CompletableFuture<ShowUpBandwidthResponse>
     */
    public CompletableFuture<ShowUpBandwidthResponse> showUpBandwidthAsync(ShowUpBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showUpBandwidth);
    }

    /**
     * 查询推流码率数据接口
     * 查询推流监控码率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamBitrateRequest 请求对象
     * @return CompletableFuture<ListSingleStreamBitrateResponse>
     */
    public CompletableFuture<ListSingleStreamBitrateResponse> listSingleStreamBitrateAsync(ListSingleStreamBitrateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listSingleStreamBitrate);
    }

    /**
     * 查询推流帧率数据接口
     * 查询推流帧率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamFramerateRequest 请求对象
     * @return CompletableFuture<ListSingleStreamFramerateResponse>
     */
    public CompletableFuture<ListSingleStreamFramerateResponse> listSingleStreamFramerateAsync(ListSingleStreamFramerateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listSingleStreamFramerate);
    }

}