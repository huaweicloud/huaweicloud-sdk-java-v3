package com.huaweicloud.sdk.live.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.live.v2.model.*;

public class LiveAPIAsyncClient {
    protected HcClient hcClient;

    public LiveAPIAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveAPIAsyncClient> newBuilder() {
        return new ClientBuilder<>(LiveAPIAsyncClient::new);
    }


    /**
     * 查询播放带宽趋势接口
     * 查询播放域名带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListBandwidthDetailV2Request 请求对象
     * @return CompletableFuture<ListBandwidthDetailV2Response>
     */
    public CompletableFuture<ListBandwidthDetailV2Response> listBandwidthDetailV2Async(ListBandwidthDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listBandwidthDetailV2);
    }

    /**
     * 查询播放带宽峰值接口
     * 查询指定时间范围内播放带宽峰值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainBandwidthSummaryV2Request 请求对象
     * @return CompletableFuture<ListDomainBandwidthSummaryV2Response>
     */
    public CompletableFuture<ListDomainBandwidthSummaryV2Response> listDomainBandwidthSummaryV2Async(ListDomainBandwidthSummaryV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listDomainBandwidthSummaryV2);
    }

    /**
     * 查询播放流量趋势接口
     * 查询播放域名流量数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficDetailV2Request 请求对象
     * @return CompletableFuture<ListDomainTrafficDetailV2Response>
     */
    public CompletableFuture<ListDomainTrafficDetailV2Response> listDomainTrafficDetailV2Async(ListDomainTrafficDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listDomainTrafficDetailV2);
    }

    /**
     * 查询播放流量汇总接口
     * 查询指定时间范围内流量汇总量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficSummaryV2Request 请求对象
     * @return CompletableFuture<ListDomainTrafficSummaryV2Response>
     */
    public CompletableFuture<ListDomainTrafficSummaryV2Response> listDomainTrafficSummaryV2Async(ListDomainTrafficSummaryV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listDomainTrafficSummaryV2);
    }

    /**
     * 查询历史推流列表接口
     * 查询历史推流列表。  最大查询跨度1天，最大查询周期7天。
     *
     * @param ListHistoryStreamsV2Request 请求对象
     * @return CompletableFuture<ListHistoryStreamsV2Response>
     */
    public CompletableFuture<ListHistoryStreamsV2Response> listHistoryStreamsV2Async(ListHistoryStreamsV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listHistoryStreamsV2);
    }

    /**
     * 查询直播拉流HTTP状态码接口
     * 查询直播拉流HTTP状态码接口。  获取加速域名1分钟粒度的HTTP返回码  最大查询跨度不能超过24小时，最大查询周期7天。
     *
     * @param ListQueryHttpCodeRequest 请求对象
     * @return CompletableFuture<ListQueryHttpCodeResponse>
     */
    public CompletableFuture<ListQueryHttpCodeResponse> listQueryHttpCodeAsync(ListQueryHttpCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listQueryHttpCode);
    }

    /**
     * 查询录制用量接口
     * 查询直播租户每小时录制的最大并发数，计算1小时内每分钟的并发总路数，取最大值做为统计值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListRecordDataV2Request 请求对象
     * @return CompletableFuture<ListRecordDataV2Response>
     */
    public CompletableFuture<ListRecordDataV2Response> listRecordDataV2Async(ListRecordDataV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listRecordDataV2);
    }

    /**
     * 查询推流码率数据接口
     * 查询推流监控码率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamBitrateV2Request 请求对象
     * @return CompletableFuture<ListSingleStreamBitrateV2Response>
     */
    public CompletableFuture<ListSingleStreamBitrateV2Response> listSingleStreamBitrateV2Async(ListSingleStreamBitrateV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listSingleStreamBitrateV2);
    }

    /**
     * 查询推流帧率数据接口
     * 查询推流帧率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamFramerateV2Request 请求对象
     * @return CompletableFuture<ListSingleStreamFramerateV2Response>
     */
    public CompletableFuture<ListSingleStreamFramerateV2Response> listSingleStreamFramerateV2Async(ListSingleStreamFramerateV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listSingleStreamFramerateV2);
    }

    /**
     * 查询截图用量接口
     * 查询直播域名每小时的截图数量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListSnapshotDataV2Request 请求对象
     * @return CompletableFuture<ListSnapshotDataV2Response>
     */
    public CompletableFuture<ListSnapshotDataV2Response> listSnapshotDataV2Async(ListSnapshotDataV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listSnapshotDataV2);
    }

    /**
     * 查询转码用量接口
     * 查询直播域名每小时的转码时长数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListTranscodeDataV2Request 请求对象
     * @return CompletableFuture<ListTranscodeDataV2Response>
     */
    public CompletableFuture<ListTranscodeDataV2Response> listTranscodeDataV2Async(ListTranscodeDataV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listTranscodeDataV2);
    }

    /**
     * 查询观众趋势接口
     * 查询观众趋势。  最大查询跨度7天，最大查询周期90天。
     *
     * @param ListUsersOfStreamV2Request 请求对象
     * @return CompletableFuture<ListUsersOfStreamV2Response>
     */
    public CompletableFuture<ListUsersOfStreamV2Response> listUsersOfStreamV2Async(ListUsersOfStreamV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.listUsersOfStreamV2);
    }

    /**
     * 查询域名维度推流路数接口
     * 查询域名维度推流路数接口。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowStreamCountV2Request 请求对象
     * @return CompletableFuture<ShowStreamCountV2Response>
     */
    public CompletableFuture<ShowStreamCountV2Response> showStreamCountV2Async(ShowStreamCountV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.showStreamCountV2);
    }

    /**
     * 查询播放画像信息接口
     * 查询播放画像信息。  最大查询跨度1天，最大查询周期31天。
     *
     * @param ShowStreamPortraitRequest 请求对象
     * @return CompletableFuture<ShowStreamPortraitResponse>
     */
    public CompletableFuture<ShowStreamPortraitResponse> showStreamPortraitAsync(ShowStreamPortraitRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.showStreamPortrait);
    }

    /**
     * 查询上行带宽数据接口
     * 查询上行带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowUpBandwidthV2Request 请求对象
     * @return CompletableFuture<ShowUpBandwidthV2Response>
     */
    public CompletableFuture<ShowUpBandwidthV2Response> showUpBandwidthV2Async(ShowUpBandwidthV2Request request) {
        return hcClient.asyncInvokeHttp(request, LiveAPIMeta.showUpBandwidthV2);
    }

}