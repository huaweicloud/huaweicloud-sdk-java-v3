package com.huaweicloud.sdk.live.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.live.v2.model.*;

public class LiveClient {
    protected HcClient hcClient;

    public LiveClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveClient> newBuilder() {
        return new ClientBuilder<>(LiveClient::new);
    }


    /**
     * 查询播放带宽趋势接口
     * 查询播放域名带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListBandwidthDetailRequest 请求对象
     * @return ListBandwidthDetailResponse
     */
    public ListBandwidthDetailResponse listBandwidthDetail(ListBandwidthDetailRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listBandwidthDetail);
    }

    /**
     * 查询播放带宽趋势接口
     * 查询播放域名带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListBandwidthDetailRequest 请求对象
     * @return SyncInvoker<ListBandwidthDetailRequest, ListBandwidthDetailResponse>
     */
    public SyncInvoker<ListBandwidthDetailRequest, ListBandwidthDetailResponse> listBandwidthDetailInvoker(ListBandwidthDetailRequest request) {
        return new SyncInvoker<ListBandwidthDetailRequest, ListBandwidthDetailResponse>(request, LiveMeta.listBandwidthDetail, hcClient);
    }

    /**
     * 查询播放带宽峰值接口
     * 查询指定时间范围内播放带宽峰值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainBandwidthPeakRequest 请求对象
     * @return ListDomainBandwidthPeakResponse
     */
    public ListDomainBandwidthPeakResponse listDomainBandwidthPeak(ListDomainBandwidthPeakRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listDomainBandwidthPeak);
    }

    /**
     * 查询播放带宽峰值接口
     * 查询指定时间范围内播放带宽峰值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainBandwidthPeakRequest 请求对象
     * @return SyncInvoker<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse>
     */
    public SyncInvoker<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse> listDomainBandwidthPeakInvoker(ListDomainBandwidthPeakRequest request) {
        return new SyncInvoker<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse>(request, LiveMeta.listDomainBandwidthPeak, hcClient);
    }

    /**
     * 查询播放流量趋势接口
     * 查询播放域名流量数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficDetailRequest 请求对象
     * @return ListDomainTrafficDetailResponse
     */
    public ListDomainTrafficDetailResponse listDomainTrafficDetail(ListDomainTrafficDetailRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listDomainTrafficDetail);
    }

    /**
     * 查询播放流量趋势接口
     * 查询播放域名流量数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficDetailRequest 请求对象
     * @return SyncInvoker<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse>
     */
    public SyncInvoker<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse> listDomainTrafficDetailInvoker(ListDomainTrafficDetailRequest request) {
        return new SyncInvoker<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse>(request, LiveMeta.listDomainTrafficDetail, hcClient);
    }

    /**
     * 查询播放流量汇总接口
     * 查询指定时间范围内流量汇总量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficSummaryRequest 请求对象
     * @return ListDomainTrafficSummaryResponse
     */
    public ListDomainTrafficSummaryResponse listDomainTrafficSummary(ListDomainTrafficSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listDomainTrafficSummary);
    }

    /**
     * 查询播放流量汇总接口
     * 查询指定时间范围内流量汇总量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficSummaryRequest 请求对象
     * @return SyncInvoker<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse>
     */
    public SyncInvoker<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse> listDomainTrafficSummaryInvoker(ListDomainTrafficSummaryRequest request) {
        return new SyncInvoker<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse>(request, LiveMeta.listDomainTrafficSummary, hcClient);
    }

    /**
     * 查询历史推流列表接口
     * 查询历史推流列表。  最大查询跨度1天，最大查询周期7天。
     *
     * @param ListHistoryStreamsRequest 请求对象
     * @return ListHistoryStreamsResponse
     */
    public ListHistoryStreamsResponse listHistoryStreams(ListHistoryStreamsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listHistoryStreams);
    }

    /**
     * 查询历史推流列表接口
     * 查询历史推流列表。  最大查询跨度1天，最大查询周期7天。
     *
     * @param ListHistoryStreamsRequest 请求对象
     * @return SyncInvoker<ListHistoryStreamsRequest, ListHistoryStreamsResponse>
     */
    public SyncInvoker<ListHistoryStreamsRequest, ListHistoryStreamsResponse> listHistoryStreamsInvoker(ListHistoryStreamsRequest request) {
        return new SyncInvoker<ListHistoryStreamsRequest, ListHistoryStreamsResponse>(request, LiveMeta.listHistoryStreams, hcClient);
    }

    /**
     * 查询直播拉流HTTP状态码接口
     * 查询直播拉流HTTP状态码接口。  获取加速域名1分钟粒度的HTTP返回码  最大查询跨度不能超过24小时，最大查询周期7天。
     *
     * @param ListQueryHttpCodeRequest 请求对象
     * @return ListQueryHttpCodeResponse
     */
    public ListQueryHttpCodeResponse listQueryHttpCode(ListQueryHttpCodeRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listQueryHttpCode);
    }

    /**
     * 查询直播拉流HTTP状态码接口
     * 查询直播拉流HTTP状态码接口。  获取加速域名1分钟粒度的HTTP返回码  最大查询跨度不能超过24小时，最大查询周期7天。
     *
     * @param ListQueryHttpCodeRequest 请求对象
     * @return SyncInvoker<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse>
     */
    public SyncInvoker<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> listQueryHttpCodeInvoker(ListQueryHttpCodeRequest request) {
        return new SyncInvoker<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse>(request, LiveMeta.listQueryHttpCode, hcClient);
    }

    /**
     * 查询录制用量接口
     * 查询直播租户每小时录制的最大并发数，计算1小时内每分钟的并发总路数，取最大值做为统计值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListRecordDataRequest 请求对象
     * @return ListRecordDataResponse
     */
    public ListRecordDataResponse listRecordData(ListRecordDataRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listRecordData);
    }

    /**
     * 查询录制用量接口
     * 查询直播租户每小时录制的最大并发数，计算1小时内每分钟的并发总路数，取最大值做为统计值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListRecordDataRequest 请求对象
     * @return SyncInvoker<ListRecordDataRequest, ListRecordDataResponse>
     */
    public SyncInvoker<ListRecordDataRequest, ListRecordDataResponse> listRecordDataInvoker(ListRecordDataRequest request) {
        return new SyncInvoker<ListRecordDataRequest, ListRecordDataResponse>(request, LiveMeta.listRecordData, hcClient);
    }

    /**
     * 查询截图用量接口
     * 查询直播域名每小时的截图数量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListSnapshotDataRequest 请求对象
     * @return ListSnapshotDataResponse
     */
    public ListSnapshotDataResponse listSnapshotData(ListSnapshotDataRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listSnapshotData);
    }

    /**
     * 查询截图用量接口
     * 查询直播域名每小时的截图数量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListSnapshotDataRequest 请求对象
     * @return SyncInvoker<ListSnapshotDataRequest, ListSnapshotDataResponse>
     */
    public SyncInvoker<ListSnapshotDataRequest, ListSnapshotDataResponse> listSnapshotDataInvoker(ListSnapshotDataRequest request) {
        return new SyncInvoker<ListSnapshotDataRequest, ListSnapshotDataResponse>(request, LiveMeta.listSnapshotData, hcClient);
    }

    /**
     * 查询转码用量接口
     * 查询直播域名每小时的转码时长数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListTranscodeDataRequest 请求对象
     * @return ListTranscodeDataResponse
     */
    public ListTranscodeDataResponse listTranscodeData(ListTranscodeDataRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listTranscodeData);
    }

    /**
     * 查询转码用量接口
     * 查询直播域名每小时的转码时长数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListTranscodeDataRequest 请求对象
     * @return SyncInvoker<ListTranscodeDataRequest, ListTranscodeDataResponse>
     */
    public SyncInvoker<ListTranscodeDataRequest, ListTranscodeDataResponse> listTranscodeDataInvoker(ListTranscodeDataRequest request) {
        return new SyncInvoker<ListTranscodeDataRequest, ListTranscodeDataResponse>(request, LiveMeta.listTranscodeData, hcClient);
    }

    /**
     * 查询观众趋势接口
     * 查询观众趋势。  最大查询跨度7天，最大查询周期90天。
     *
     * @param ListUsersOfStreamRequest 请求对象
     * @return ListUsersOfStreamResponse
     */
    public ListUsersOfStreamResponse listUsersOfStream(ListUsersOfStreamRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listUsersOfStream);
    }

    /**
     * 查询观众趋势接口
     * 查询观众趋势。  最大查询跨度7天，最大查询周期90天。
     *
     * @param ListUsersOfStreamRequest 请求对象
     * @return SyncInvoker<ListUsersOfStreamRequest, ListUsersOfStreamResponse>
     */
    public SyncInvoker<ListUsersOfStreamRequest, ListUsersOfStreamResponse> listUsersOfStreamInvoker(ListUsersOfStreamRequest request) {
        return new SyncInvoker<ListUsersOfStreamRequest, ListUsersOfStreamResponse>(request, LiveMeta.listUsersOfStream, hcClient);
    }

    /**
     * 查询域名维度推流路数接口
     * 查询域名维度推流路数接口。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowStreamCountRequest 请求对象
     * @return ShowStreamCountResponse
     */
    public ShowStreamCountResponse showStreamCount(ShowStreamCountRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showStreamCount);
    }

    /**
     * 查询域名维度推流路数接口
     * 查询域名维度推流路数接口。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowStreamCountRequest 请求对象
     * @return SyncInvoker<ShowStreamCountRequest, ShowStreamCountResponse>
     */
    public SyncInvoker<ShowStreamCountRequest, ShowStreamCountResponse> showStreamCountInvoker(ShowStreamCountRequest request) {
        return new SyncInvoker<ShowStreamCountRequest, ShowStreamCountResponse>(request, LiveMeta.showStreamCount, hcClient);
    }

    /**
     * 查询播放画像信息接口
     * 查询播放画像信息。  最大查询跨度1天，最大查询周期31天。
     *
     * @param ShowStreamPortraitRequest 请求对象
     * @return ShowStreamPortraitResponse
     */
    public ShowStreamPortraitResponse showStreamPortrait(ShowStreamPortraitRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showStreamPortrait);
    }

    /**
     * 查询播放画像信息接口
     * 查询播放画像信息。  最大查询跨度1天，最大查询周期31天。
     *
     * @param ShowStreamPortraitRequest 请求对象
     * @return SyncInvoker<ShowStreamPortraitRequest, ShowStreamPortraitResponse>
     */
    public SyncInvoker<ShowStreamPortraitRequest, ShowStreamPortraitResponse> showStreamPortraitInvoker(ShowStreamPortraitRequest request) {
        return new SyncInvoker<ShowStreamPortraitRequest, ShowStreamPortraitResponse>(request, LiveMeta.showStreamPortrait, hcClient);
    }

    /**
     * 查询上行带宽数据接口
     * 查询上行带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowUpBandwidthRequest 请求对象
     * @return ShowUpBandwidthResponse
     */
    public ShowUpBandwidthResponse showUpBandwidth(ShowUpBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showUpBandwidth);
    }

    /**
     * 查询上行带宽数据接口
     * 查询上行带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowUpBandwidthRequest 请求对象
     * @return SyncInvoker<ShowUpBandwidthRequest, ShowUpBandwidthResponse>
     */
    public SyncInvoker<ShowUpBandwidthRequest, ShowUpBandwidthResponse> showUpBandwidthInvoker(ShowUpBandwidthRequest request) {
        return new SyncInvoker<ShowUpBandwidthRequest, ShowUpBandwidthResponse>(request, LiveMeta.showUpBandwidth, hcClient);
    }

    /**
     * 查询推流码率数据接口
     * 查询推流监控码率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamBitrateRequest 请求对象
     * @return ListSingleStreamBitrateResponse
     */
    public ListSingleStreamBitrateResponse listSingleStreamBitrate(ListSingleStreamBitrateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listSingleStreamBitrate);
    }

    /**
     * 查询推流码率数据接口
     * 查询推流监控码率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamBitrateRequest 请求对象
     * @return SyncInvoker<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse>
     */
    public SyncInvoker<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse> listSingleStreamBitrateInvoker(ListSingleStreamBitrateRequest request) {
        return new SyncInvoker<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse>(request, LiveMeta.listSingleStreamBitrate, hcClient);
    }

    /**
     * 查询推流帧率数据接口
     * 查询推流帧率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamFramerateRequest 请求对象
     * @return ListSingleStreamFramerateResponse
     */
    public ListSingleStreamFramerateResponse listSingleStreamFramerate(ListSingleStreamFramerateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listSingleStreamFramerate);
    }

    /**
     * 查询推流帧率数据接口
     * 查询推流帧率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamFramerateRequest 请求对象
     * @return SyncInvoker<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse>
     */
    public SyncInvoker<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse> listSingleStreamFramerateInvoker(ListSingleStreamFramerateRequest request) {
        return new SyncInvoker<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse>(request, LiveMeta.listSingleStreamFramerate, hcClient);
    }

}