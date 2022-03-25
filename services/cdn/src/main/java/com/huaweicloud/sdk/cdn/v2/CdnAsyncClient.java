package com.huaweicloud.sdk.cdn.v2;

import com.huaweicloud.sdk.cdn.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CdnAsyncClient {

    protected HcClient hcClient;

    public CdnAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdnAsyncClient> newBuilder() {
        return new ClientBuilder<>(CdnAsyncClient::new, "GlobalCredentials");
    }

    /** 查询域名统计区域运营商数据 - 支持查询90天内的数据。 - 支持多指标同时查询，不超过5个。 - 最多同时指定20个域名。 -
     * 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24
     * 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。 - action取值：location_detail,location_summary
     *
     * @param ShowDomainLocationStatsRequest 请求对象
     * @return CompletableFuture<ShowDomainLocationStatsResponse> */
    public CompletableFuture<ShowDomainLocationStatsResponse> showDomainLocationStatsAsync(
        ShowDomainLocationStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainLocationStats);
    }

    /** 查询域名统计区域运营商数据 - 支持查询90天内的数据。 - 支持多指标同时查询，不超过5个。 - 最多同时指定20个域名。 -
     * 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24
     * 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。 - action取值：location_detail,location_summary
     *
     * @param ShowDomainLocationStatsRequest 请求对象
     * @return AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> */
    public AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsAsyncInvoker(
        ShowDomainLocationStatsRequest request) {
        return new AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>(request,
            CdnMeta.showDomainLocationStats, hcClient);
    }

    /** 查询域名统计基础数据 - 支持查询90天内的数据。 - 支持多指标同时查询，不超过5个。 - 最多同时指定20个域名。 -
     * 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24
     * 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。 - action取值：detail,summary
     *
     * @param ShowDomainStatsRequest 请求对象
     * @return CompletableFuture<ShowDomainStatsResponse> */
    public CompletableFuture<ShowDomainStatsResponse> showDomainStatsAsync(ShowDomainStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainStats);
    }

    /** 查询域名统计基础数据 - 支持查询90天内的数据。 - 支持多指标同时查询，不超过5个。 - 最多同时指定20个域名。 -
     * 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24
     * 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。 - action取值：detail,summary
     *
     * @param ShowDomainStatsRequest 请求对象
     * @return AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> */
    public AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsAsyncInvoker(
        ShowDomainStatsRequest request) {
        return new AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>(request, CdnMeta.showDomainStats,
            hcClient);
    }

    /** 查询TOP100 URL明细 - 查询TOP100 URL明细。 - 支持查询90天内的数据。 - 查询跨度不能超过31天。 - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到
     * 2021-10-25 00:00:00 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。 -
     * 开始时间、结束时间必须传毫秒级时间戳，且必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。 -
     * 流量类指标单位统一为Byte（字节）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     *
     * @param ShowTopUrlRequest 请求对象
     * @return CompletableFuture<ShowTopUrlResponse> */
    public CompletableFuture<ShowTopUrlResponse> showTopUrlAsync(ShowTopUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showTopUrl);
    }

    /** 查询TOP100 URL明细 - 查询TOP100 URL明细。 - 支持查询90天内的数据。 - 查询跨度不能超过31天。 - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到
     * 2021-10-25 00:00:00 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。 -
     * 开始时间、结束时间必须传毫秒级时间戳，且必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。 -
     * 流量类指标单位统一为Byte（字节）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     *
     * @param ShowTopUrlRequest 请求对象
     * @return AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> */
    public AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlAsyncInvoker(ShowTopUrlRequest request) {
        return new AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>(request, CdnMeta.showTopUrl, hcClient);
    }

}
