package com.huaweicloud.sdk.live.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.live.v2.model.*;

public class LiveAPIClient {
    protected HcClient hcClient;

    public LiveAPIClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveAPIClient> newBuilder() {
        return new ClientBuilder<>(LiveAPIClient::new);
    }


    /**
     * 查询播放带宽趋势接口
     * 查询播放域名带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListBandwidthDetailV2Request 请求对象
     * @return ListBandwidthDetailV2Response
     */
    public ListBandwidthDetailV2Response listBandwidthDetailV2(ListBandwidthDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listBandwidthDetailV2);
    }

    /**
     * 查询播放带宽峰值接口
     * 查询指定时间范围内播放带宽峰值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainBandwidthSummaryV2Request 请求对象
     * @return ListDomainBandwidthSummaryV2Response
     */
    public ListDomainBandwidthSummaryV2Response listDomainBandwidthSummaryV2(ListDomainBandwidthSummaryV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listDomainBandwidthSummaryV2);
    }

    /**
     * 查询播放流量趋势接口
     * 查询播放域名流量数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficDetailV2Request 请求对象
     * @return ListDomainTrafficDetailV2Response
     */
    public ListDomainTrafficDetailV2Response listDomainTrafficDetailV2(ListDomainTrafficDetailV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listDomainTrafficDetailV2);
    }

    /**
     * 查询播放流量汇总接口
     * 查询指定时间范围内流量汇总量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListDomainTrafficSummaryV2Request 请求对象
     * @return ListDomainTrafficSummaryV2Response
     */
    public ListDomainTrafficSummaryV2Response listDomainTrafficSummaryV2(ListDomainTrafficSummaryV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listDomainTrafficSummaryV2);
    }

    /**
     * 查询历史推流列表接口
     * 查询历史推流列表。  最大查询跨度1天，最大查询周期7天。
     *
     * @param ListHistoryStreamsV2Request 请求对象
     * @return ListHistoryStreamsV2Response
     */
    public ListHistoryStreamsV2Response listHistoryStreamsV2(ListHistoryStreamsV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listHistoryStreamsV2);
    }

    /**
     * 查询直播拉流HTTP状态码接口
     * 查询直播拉流HTTP状态码接口。  获取加速域名1分钟粒度的HTTP返回码  最大查询跨度不能超过24小时，最大查询周期7天。
     *
     * @param ListQueryHttpCodeRequest 请求对象
     * @return ListQueryHttpCodeResponse
     */
    public ListQueryHttpCodeResponse listQueryHttpCode(ListQueryHttpCodeRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listQueryHttpCode);
    }

    /**
     * 查询录制用量接口
     * 查询直播租户每小时录制的最大并发数，计算1小时内每分钟的并发总路数，取最大值做为统计值。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListRecordDataV2Request 请求对象
     * @return ListRecordDataV2Response
     */
    public ListRecordDataV2Response listRecordDataV2(ListRecordDataV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listRecordDataV2);
    }

    /**
     * 查询推流码率数据接口
     * 查询推流监控码率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamBitrateV2Request 请求对象
     * @return ListSingleStreamBitrateV2Response
     */
    public ListSingleStreamBitrateV2Response listSingleStreamBitrateV2(ListSingleStreamBitrateV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listSingleStreamBitrateV2);
    }

    /**
     * 查询推流帧率数据接口
     * 查询推流帧率数据接口。  最大查询跨度6小时，最大查询周期7天。
     *
     * @param ListSingleStreamFramerateV2Request 请求对象
     * @return ListSingleStreamFramerateV2Response
     */
    public ListSingleStreamFramerateV2Response listSingleStreamFramerateV2(ListSingleStreamFramerateV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listSingleStreamFramerateV2);
    }

    /**
     * 查询截图用量接口
     * 查询直播域名每小时的截图数量。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListSnapshotDataV2Request 请求对象
     * @return ListSnapshotDataV2Response
     */
    public ListSnapshotDataV2Response listSnapshotDataV2(ListSnapshotDataV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listSnapshotDataV2);
    }

    /**
     * 查询转码用量接口
     * 查询直播域名每小时的转码时长数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ListTranscodeDataV2Request 请求对象
     * @return ListTranscodeDataV2Response
     */
    public ListTranscodeDataV2Response listTranscodeDataV2(ListTranscodeDataV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listTranscodeDataV2);
    }

    /**
     * 查询观众趋势接口
     * 查询观众趋势。  最大查询跨度7天，最大查询周期90天。
     *
     * @param ListUsersOfStreamV2Request 请求对象
     * @return ListUsersOfStreamV2Response
     */
    public ListUsersOfStreamV2Response listUsersOfStreamV2(ListUsersOfStreamV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.listUsersOfStreamV2);
    }

    /**
     * 查询域名维度推流路数接口
     * 查询域名维度推流路数接口。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowStreamCountV2Request 请求对象
     * @return ShowStreamCountV2Response
     */
    public ShowStreamCountV2Response showStreamCountV2(ShowStreamCountV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.showStreamCountV2);
    }

    /**
     * 查询播放画像信息接口
     * 查询播放画像信息。  最大查询跨度1天，最大查询周期31天。
     *
     * @param ShowStreamPortraitRequest 请求对象
     * @return ShowStreamPortraitResponse
     */
    public ShowStreamPortraitResponse showStreamPortrait(ShowStreamPortraitRequest request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.showStreamPortrait);
    }

    /**
     * 查询上行带宽数据接口
     * 查询上行带宽数据。  最大查询跨度31天，最大查询周期90天。
     *
     * @param ShowUpBandwidthV2Request 请求对象
     * @return ShowUpBandwidthV2Response
     */
    public ShowUpBandwidthV2Response showUpBandwidthV2(ShowUpBandwidthV2Request request) {
        return hcClient.syncInvokeHttp(request, LiveAPIMeta.showUpBandwidthV2);
    }

}